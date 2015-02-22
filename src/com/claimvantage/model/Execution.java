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
	
	public Execution(List<Alert> alerts, List<Rule> rules, int sessionId, int numberOfRulesFired) {
		System.out.println("in execution Alerts " + alerts.size());
		this.setNumberOfRulesFired(numberOfRulesFired);
		this.setAlerts(alerts);
		this.setRules(rules);
		this.setSessionId(sessionId);
		this.setTimeStamp(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules, int sessionId) {
		System.out.println("in execution Alerts " + alerts.size());
		this.setAlerts(alerts);
		this.setRules(rules);
		this.setSessionId(sessionId);
		this.setTimeStamp(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
	}
	
	public Execution(List<Alert> alerts, List<Rule> rules) {
		System.out.println("in execution Alerts " + alerts.size());
		this.alerts = alerts;
		this.rules = rules;
		Date date= new Date();
		this.timeStamp = new Timestamp(date.getTime()).toLocalDateTime().toString();
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
	
}
