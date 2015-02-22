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
import com.sforce.soap.enterprise.Cve__Claim__C;

@JsonSerialize
@XmlRootElement
public class Session {
	
	@JsonIgnore
	private KieSession kieSession;
	private List<Rule> rules;
	private HashSet<Sobject> requiredObjects;
	private List<Execution> executions;
	private String creationDateTime;
	private String lastExecution;
	private int totalNumberOfAlerts;
	private int totalNumberOfRulesFired;
	private int totalNumberOfExecutions;
	private boolean isActive;
	private UUID id;

	@JsonIgnore
	private final String REPOSITORY_LOCATION = "src/main/resources/rules/";
	
	public Session() {

        this.rules = new ArrayList<Rule>();
		this.creationDateTime = new Timestamp(new Date().getTime()).toLocalDateTime().toString();    
		this.executions = new ArrayList<Execution>();
        this.isActive = true;
        this.totalNumberOfAlerts = 0;
        this.totalNumberOfRulesFired = 0;
        this.totalNumberOfExecutions = 0;
	}
	
	public Session(List<Rule> rules) {
        this.rules = new ArrayList<Rule>();
        this.rules.addAll(rules);
        this.isActive = true;
        this.creationDateTime = new Timestamp(new Date().getTime()).toLocalDateTime().toString();    
		this.executions = new ArrayList<Execution>();
        this.isActive = true;
        this.totalNumberOfAlerts = 0;
        this.totalNumberOfRulesFired = 0;
        this.totalNumberOfExecutions = 0;
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

	/* Not sure if creating a whole new Service, repo and file system is very effecient and could
	** cause memory leaks, needs to be reviewed and possible manage on kieRepository and use the 
	** kieRepository.removeKieModule(ReleaseId) to remove the rules from the session once the 
	** execution of the rules is complete
	*/ 
	public KieSession createKieSession(List<Rule> rules) {
		
		KieServices kieServices = KieServices.Factory.get();
        KieRepository kieRepository = kieServices.getRepository();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
    	for (Rule r :rules) {
    		kieFileSystem.write(REPOSITORY_LOCATION + r.getName() +".drl", r.getScript().toString());
    	}
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll(); // kieModule is automatically deployed to KieRepository if successfully built.

        if (kb.getResults().hasMessages(Level.ERROR)) {
            throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
        }

        KieContainer kContainer = kieServices.newKieContainer(kieRepository.getDefaultReleaseId());
		return kContainer.newKieSession();
	}
	
	// TODO build in data exporter here
	private void loadData(KieSession kieSession) {
		// pass reference to the kieSession into the bulk data exporter
        this.requiredObjects = getRequiredObjects(rules);
        System.out.println("Required objects " + this.requiredObjects.size());
		DataLoader.execute(kieSession, requiredObjects);
	}
	
	public Execution executeRules() {
		
		System.out.println(" executing rules ");
		incrementNumberOfExecutions();
		List<Alert> alerts = new ArrayList<Alert>();
		TrackingWorkingMemoryEventListener workingMemoryListener = new TrackingWorkingMemoryEventListener();
		this.kieSession = createKieSession(rules);
		kieSession.addEventListener(workingMemoryListener);
        
		// loadFakeClaims(); 
		loadData(kieSession);
		int numberOfRuleFired = kieSession.fireAllRules();
		incrementNumberOfRulesFired(numberOfRuleFired);
		
		alerts = workingMemoryListener.getAlerts();
		incrementNumberOfAlerts(alerts.size());
		Execution execution = new Execution(alerts, rules, alerts.size(), numberOfRuleFired);
		executions.add(execution);
		System.out.println(" Fact count " + kieSession.getFactCount());
		// Cleaning up Session memory
		kieSession.removeEventListener(workingMemoryListener);
		kieSession.dispose();
		this.lastExecution = new Timestamp(new Date().getTime()).toLocalDateTime().toString();   
		
		return execution;
	}
	
	private void incrementNumberOfRulesFired(int numberOfRuleFired) {
		this.totalNumberOfRulesFired = totalNumberOfRulesFired + numberOfRuleFired;
	}

	private void incrementNumberOfAlerts(int numberOfAlertsRaised) {
		this.totalNumberOfAlerts = this.totalNumberOfAlerts + numberOfAlertsRaised;
	}
	
	private void incrementNumberOfExecutions() {
		this.totalNumberOfExecutions++;
	}

	public void addRule(Rule rule) {
		// TODO Write this rule to the file System
		this.rules.add(rule);
	}
	
	public void deleteRule(String ruleName) {
		// TODO implement this
		for (int i = 0;i < this.rules.size();i++) {
			if (this.rules.get(i).getName() == ruleName) {
				this.rules.remove(i);
				System.out.println(">>> Deleted " + this.rules.get(i).getName());
			}
		}
	}

	public void loadFakeClaims() {
		System.out.println("loading fake claims");
		ArrayList<Cve__Claim__C> claims = new ArrayList<Cve__Claim__C>();
        Cve__Claim__C c = new Cve__Claim__C();
        for (int i = 0;i < 20;i++) {
        	c = new Cve__Claim__C();
        	c.setCve__BenefitType__C("STD");
        	c.setCve__IncurredNet__C(100.00);
        	c.setCve__LiabilityNet__C(200.00);
        	claims.add(c);
        	kieSession.insert(c);
        }
		System.out.println("Fact count " + kieSession.getFactCount());
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
	
	public String getLastExecution() {
		return lastExecution;
	}

	public void setLastExecution(String lastExecution) {
		this.lastExecution = lastExecution;
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
	
}
