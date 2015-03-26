package com.claimvantage.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.claimvantage.data.RulesRepository;

@JsonSerialize
@XmlRootElement
public class Package {
	
	@JsonIgnore
	private static RulesRepository rulesRepo = RulesRepository.instance();
	private ArrayList<String> ruleNames;
	public HashSet<Sobject> requiredObjects;
	public List<Execution> executions;
	public List<Alert> newAlerts;
	private String creationDateTime;
	private String lastExecutionDate;
	private int numberOfRules;
	private int totalNumberOfAlerts;
	private int totalNumberOfRulesFired;
	private int totalNumberOfExecutions;
	private int lastestNumberOfAlerts;
	private int lastestNumberOfRulesFired;
	private boolean isActive;
	private String type;
	private String packageName;

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
		this.newAlerts = new ArrayList<Alert>();
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
		this.lastestNumberOfRulesFired = numberOfRuleFired;
		this.totalNumberOfRulesFired = totalNumberOfRulesFired
				+ numberOfRuleFired;
	}

	public void incrementNumberOfAlerts(int numberOfAlertsRaised) {
		this.lastestNumberOfAlerts = numberOfAlertsRaised;
		this.totalNumberOfAlerts = this.totalNumberOfAlerts
				+ numberOfAlertsRaised;
	}

	public void incrementNumberOfExecutions() {
		this.totalNumberOfExecutions++;
	}
	/*  used for the free form rule builder
	 
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
		// Code used for custom builder
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
		return this.type;
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

	public int getLastestNumberOfAlerts() {
		return lastestNumberOfAlerts;
	}

	public void setLastestNumberOfAlerts(int lastestNumberOfAlerts) {
		this.lastestNumberOfAlerts = lastestNumberOfAlerts;
	}

	public int getLastestNumberOfRulesFired() {
		return lastestNumberOfRulesFired;
	}

	public void setLastestNumberOfRulesFired(int lastestNumberOfRulesFired) {
		this.lastestNumberOfRulesFired = lastestNumberOfRulesFired;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<Alert> getNewAlerts() {
		return newAlerts;
	}

	public void setNewAlerts(List<Alert> newAlerts) {
		this.newAlerts = newAlerts;
	}

	public void addNewAlerts(List<Alert> alerts) {
		if (this.newAlerts.size() >=0 ) {
			this.newAlerts.clear();
			this.newAlerts.addAll(alerts);
		}
	}
	
}
