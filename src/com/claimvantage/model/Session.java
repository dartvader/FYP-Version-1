package com.claimvantage.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.builder.Message.Level;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

import com.claimvantage.data.exporter.DataLoader;
import com.claimvantage.drools.listeners.TrackingAgendaEventListener;
import com.claimvantage.drools.listeners.TrackingWorkingMemoryEventListener;
import com.claimvantage.drools.util.HardCodedRules;

// TODO TIDY up the class

@JsonSerialize
@XmlRootElement
public class Session {

	@JsonIgnore
	private KieSession kieSession;
	private List<Rule> rules;
	private HashSet<Sobject> requiredObjects;
	private List<Execution> executions;
	private String creationDateTime;
	private String lastExecutionDate;
	private int numberOfRules;
	private int totalNumberOfAlerts;
	private int totalNumberOfRulesFired;
	private int totalNumberOfExecutions;
	private boolean isActive;
	private String type;

	private UUID id;

	@JsonIgnore
	private final String REPOSITORY_LOCATION = "src/main/resources/rules/";

	public Session(List<Rule> rules, String type, HashSet<Sobject> requiredObjects) {
		this.creationDateTime = new Timestamp(new Date().getTime()).toLocalDateTime().toString();
		this.executions = new ArrayList<Execution>();
		this.isActive = true;
		this.totalNumberOfAlerts = 0;
		this.totalNumberOfRulesFired = 0;
		this.totalNumberOfExecutions = 0;
		this.rules = new ArrayList<Rule>(rules);
		this.requiredObjects = requiredObjects;
		this.type = type;
		this.numberOfRules = rules.size();
	}

	public Session(List<Rule> rules) {
		this(rules, "Custom Package", null);
	}

	public int getTotalNumberOfAlerts() {
		return totalNumberOfAlerts;
	}

	public void setTotalNumberOfAlerts(int totalNumberOfAlerts) {
		this.totalNumberOfAlerts = totalNumberOfAlerts;
	}

	public int getTotalNumberOfRulesFired() {
		return totalNumberOfRulesFired;
	}

	public void setTotalNumberOfRulesFired(int totalNumberOfRulesFired) {
		this.totalNumberOfRulesFired = totalNumberOfRulesFired;
	}

	public int getTotalNumberOfExecutions() {
		return totalNumberOfExecutions;
	}

	public void setTotalNumberOfExecutions(int totalNumberOfExecutions) {
		this.totalNumberOfExecutions = totalNumberOfExecutions;
	}

	/*
	 * Not sure if creating a whole new Service, repo and file system is very
	 * effecient and could* cause memory leaks, needs to be reviewed and
	 * possible manage on kieRepository and use the*
	 * kieRepository.removeKieModule(ReleaseId) to remove the rules from the
	 * session once the* execution of the rules is complete
	 */
	public KieSession createKieSession(List<Rule> rules) {

		KieServices kieServices = KieServices.Factory.get();
		KieRepository kieRepository = kieServices.getRepository();
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		for (Rule r : rules) {
			kieFileSystem.write(REPOSITORY_LOCATION + r.getName() + ".drl", r
					.getScript().toString());
		}
		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll(); // kieModule is automatically deployed to KieRepository
						// if successfully built.

		if (kb.getResults().hasMessages(Level.ERROR)) {
			throw new RuntimeException("Build Errors:\n"
					+ kb.getResults().toString());
		}

		KieContainer kContainer = kieServices.newKieContainer(kieRepository.getDefaultReleaseId());
		return kContainer.newKieSession();
	}

	private void loadData(KieSession kieSession) {
		// pass reference to the kieSession into the bulk data exporter
		this.requiredObjects = this.requiredObjects == null ? getRequiredObjects(rules)
				: this.requiredObjects;

		System.out.println("Required objects " + this.requiredObjects.size());
		DataLoader.execute(kieSession, requiredObjects);
	}

	public Execution executeRules() {

		incrementNumberOfExecutions();
		List<Alert> alerts = new ArrayList<Alert>();

		TrackingWorkingMemoryEventListener workingMemoryListener = new TrackingWorkingMemoryEventListener();
		this.kieSession = createKieSession(rules);
		kieSession.addEventListener(workingMemoryListener);

		loadData(kieSession);
		
		for (Rule rule : rules) {
			if (rule.getSetting() != null && rule.getGlobal() != null) {
				kieSession.setGlobal(rule.getGlobal(), rule.getSetting());
			}
		}
		
		int numberOfRuleFired = kieSession.fireAllRules();
		long factCount = kieSession.getFactCount();
		incrementNumberOfRulesFired(numberOfRuleFired);

		alerts = workingMemoryListener.getAlerts();
		incrementNumberOfAlerts(alerts.size());

		Execution execution = new Execution(alerts, rules, this.getId(),
				numberOfRuleFired, factCount, alerts.size());
		executions.add(execution);
		this.setLastExecutionDate(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
		
		// Cleaning up Session memory
		kieSession.removeEventListener(workingMemoryListener);
		kieSession.dispose();
		

		return execution;
	}

	private void incrementNumberOfRulesFired(int numberOfRuleFired) {
		this.totalNumberOfRulesFired = totalNumberOfRulesFired
				+ numberOfRuleFired;
	}

	private void incrementNumberOfAlerts(int numberOfAlertsRaised) {
		this.totalNumberOfAlerts = this.totalNumberOfAlerts
				+ numberOfAlertsRaised;
	}

	private void incrementNumberOfExecutions() {
		this.totalNumberOfExecutions++;
	}

	// TODO Write this rule to the file System
	public void addRule(Rule rule) {
		this.rules.add(rule);
	}

	// TODO implement this
	public void deleteRule(String ruleName) {
		for (int i = 0; i < this.rules.size(); i++) {
			if (this.rules.get(i).getName() == ruleName) {
				this.rules.remove(i);
			}
		}
	}

	private HashSet<Sobject> getRequiredObjects(List<Rule> rules) {
		HashSet<Sobject> objects = new HashSet<Sobject>();
		for (Rule r : rules) {
			for (Condition c : r.getConditions()) {
				objects.add(c.getObject());
			}
		}
		return objects;
	}

	public String getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(String creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public List<Execution> getExecutions() {
		return executions;
	}

	public void setExecutions(List<Execution> executions) {
		this.executions = executions;
	}

	public String getLastExecutionDate() {
		return lastExecutionDate;
	}

	public void setLastExecutionDate(String lastExecutionDate) {
		this.lastExecutionDate = lastExecutionDate;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public String getType() {
		return this.type == null ? "Custom Package" : this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfRules() {
		return numberOfRules;
	}

	public void setNumberOfRules(int numberOfRules) {
		this.numberOfRules = numberOfRules;
	}
}
