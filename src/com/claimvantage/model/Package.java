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

import com.claimvantage.data.RulesRepository;
import com.claimvantage.data.exporter.DataLoader;
import com.claimvantage.drools.listeners.TrackingAgendaEventListener;
import com.claimvantage.drools.listeners.TrackingWorkingMemoryEventListener;
import com.claimvantage.drools.util.HardCodedRules;

// TODO TIDY up the class

@JsonSerialize
@XmlRootElement
public class Package {
	
	@JsonIgnore
	private static RulesRepository rulesRepo = RulesRepository.instance();
	private ArrayList<String> ruleNames;
	public HashSet<Sobject> requiredObjects;
	public List<Execution> executions;
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

	public Package(ArrayList<String> ruleNames, String type, HashSet<Sobject> requiredObjects) {
		this.creationDateTime = new Timestamp(new Date().getTime()).toLocalDateTime().toString();
		this.executions = new ArrayList<Execution>();
		this.isActive = true;
		this.totalNumberOfAlerts = 0;
		this.totalNumberOfRulesFired = 0;
		this.totalNumberOfExecutions = 0;
		this.ruleNames = new ArrayList<String>(ruleNames);
		this.requiredObjects = requiredObjects;
		this.type = type;
		this.numberOfRules = ruleNames.size();
	}

	public Package(ArrayList<String> ruleNames, String type) {
		this(ruleNames, type, null);
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

	

	public void incrementNumberOfRulesFired(int numberOfRuleFired) {
		this.totalNumberOfRulesFired = totalNumberOfRulesFired
				+ numberOfRuleFired;
	}

	public void incrementNumberOfAlerts(int numberOfAlertsRaised) {
		this.totalNumberOfAlerts = this.totalNumberOfAlerts
				+ numberOfAlertsRaised;
	}

	public void incrementNumberOfExecutions() {
		this.totalNumberOfExecutions++;
	}
	/*  No Need for this as the custom rule builder is not working 
	 
	public HashSet<Sobject> createRequiredObjects(ArrayList<Rule> rules) {
		HashSet<Sobject> objects = new HashSet<Sobject>();
		
		for (Rule r : rules) {
			for (Condition c : r.getConditions()) {
				objects.add(c.getObject());
			}
		}
		return objects;
	}
	*/
	public HashSet<Sobject> getRequiredObjects() {

		//== null ? createRequiredObjects(rulesRepo.getRulesByNames(this.ruleNames)) : this.requiredObjects;
		return this.requiredObjects;
	}

	public void setRequiredObjects(HashSet<Sobject> requiredObjects) {
		this.requiredObjects = requiredObjects;
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

	public ArrayList<String> getRuleNames() {
		return ruleNames;
	}

	public void setRuleNames(ArrayList<String> ruleNames) {
		this.ruleNames = ruleNames;
	}
	
	/*
	 * Not sure if creating a whole new Service, repo and file system is very
	 * effecient and could* cause memory leaks, needs to be reviewed and
	 * possible manage on kieRepository and use the*
	 * kieRepository.removeKieModule(ReleaseId) to remove the rules from the
	 * session once the* execution of the rules is complete
	 */
	/*
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
		System.out.println("Required objects " + this.requiredObjects.size());
		DataLoader.execute(kieSession, this.getRequiredObjects());
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
	*/

}
