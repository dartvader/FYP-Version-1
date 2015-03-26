package com.claimvantage.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Execution {
	
	private List<Alert> alerts;
	private List<Rule> rules;
	private String timeStamp;
	private String formattedDate;
	private int numberOfRulesFired;
	private UUID sessionId;
	private long factCount;
	private int numberOfAlerts;
	private HashMap<String, Integer> ruleFrequency; 
	
	public Execution(List<Alert> alerts, List<Rule> rules, UUID uuid, int numberOfRulesFired, long factCount, int numberOfAlerts) {
		this.setFactCount(factCount);
		this.setNumberOfRulesFired(numberOfRulesFired);
		this.setAlerts(alerts);
		this.setRules(rules);
		this.setSessionId(uuid);
		this.setNumberOfAlerts(numberOfAlerts);
		this.setTimeStamp(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
		Date now = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM HH:mm");
		System.out.println(dateFormatter.format(now));
		this.setFormattedDate(dateFormatter.format(now));
		// Calculate the Frequency of the Alerts rules
		this.ruleFrequency = calculateRuleFrequency(alerts, rules);
	}
	
	

	public Execution(List<Alert> alerts, List<Rule> rules, UUID sessionId, int numberOfRulesFired, long factCount) {
		this(alerts, rules, sessionId, numberOfRulesFired, factCount, 0);
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules, UUID sessionId, int numberOfRulesFired) {
		this(alerts, rules, sessionId, numberOfRulesFired, 0);
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules, UUID sessionId) {
		this(alerts, rules, sessionId, 0);
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules) {
		this(alerts, rules, null);
	}
	// Calculating the frequency for the dashboard
	private HashMap<String, Integer> calculateRuleFrequency(List<Alert> alerts, List<Rule> rules) {
		System.out.println("Calculating Rule Frequency ");
		HashMap<String, Integer> ruleFrequency = new HashMap<String, Integer>();
		// Add rules that occurred
		for (Alert alert: alerts) {
			String ruleName = alert.getRuleName();
			if (!ruleFrequency.containsKey(ruleName)) {
				ruleFrequency.put(ruleName, 1);
			} else {
				int key = ruleFrequency.get(ruleName);
				key = key + 1;
				System.out.println("incrementing key " + key);
				ruleFrequency.replace(ruleName, key);
			}
		}
		
		for (Rule rule: rules) {
			String ruleName = rule.getName();
			if (!ruleFrequency.containsKey(ruleName)) {
				ruleFrequency.put(ruleName, 0);
			} 
		}
		return ruleFrequency;
	}

	public List<Alert> getAlerts() {
		return alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public UUID getSessionId() {
		return sessionId;
	}

	public void setSessionId(UUID uuid) {
		this.sessionId = uuid;
	}

	public int getNumberOfRulesFired() {
		return numberOfRulesFired;
	}

	public void setNumberOfRulesFired(int numberOfRulesFired) {
		this.numberOfRulesFired = numberOfRulesFired;
	}

	public long getFactCount() {
		return factCount;
	}

	public void setFactCount(long factCount) {
		this.factCount = factCount;
	}

	public int getNumberOfAlerts() {
		return numberOfAlerts;
	}

	public void setNumberOfAlerts(int numberOfAlerts) {
		this.numberOfAlerts = numberOfAlerts;
	}
	
	public HashMap<String, Integer> getRuleFrequency() {
		return ruleFrequency;
	}

	public void setRuleFrequency(HashMap<String, Integer> ruleFrequency) {
		this.ruleFrequency = ruleFrequency;
	}
	
	public String getFormattedDate() {
		return formattedDate;
	}
	
	public void setFormattedDate(String formattedDate) {
		this.formattedDate = formattedDate;
	}
}
