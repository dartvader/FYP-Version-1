package com.claimvantage.model;

public class RuleCorrelation {
	
	private String ruleName;
	private String parentRule;
	private Double correlationWeight;
	
	public RuleCorrelation() {

	}
	
	public RuleCorrelation(String ruleName, Double correlationWeight) {
		super();
		this.ruleName = ruleName;
		this.correlationWeight = correlationWeight;
	}
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getParentRule() {
		return parentRule;
	}

	public void setParentRule(String parentRule) {
		this.parentRule = parentRule;
	}

	public Double getCorrelationWeight() {
		return correlationWeight;
	}

	public void setCorrelationWeight(Double correlationWeight) {
		this.correlationWeight = correlationWeight;
	}
	
}
