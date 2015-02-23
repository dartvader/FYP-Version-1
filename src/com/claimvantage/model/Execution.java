package com.claimvantage.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Execution {
	
	private List<Alert> alerts;
	private List<Rule> rules;
	private String timeStamp;
	private int numberOfRulesFired;
	private int sessionId;
	private long factCount;
	
	public Execution(List<Alert> alerts, List<Rule> rules, int sessionId, int numberOfRulesFired, long factCount2) {
		this.setFactCount(factCount2);
		this.setNumberOfRulesFired(numberOfRulesFired);
		this.setAlerts(alerts);
		this.setRules(rules);
		this.setSessionId(sessionId);
		this.setTimeStamp(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules, int sessionId, int numberOfRulesFired) {
		this(alerts, rules, sessionId, numberOfRulesFired, 0);
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules, int sessionId) {
		this(alerts, rules, sessionId, 0);
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules) {
		this(alerts, rules, 0);
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

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
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
	
}
