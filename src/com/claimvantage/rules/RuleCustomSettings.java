package com.claimvantage.rules;

public class RuleCustomSettings {
	// This class needs to store the configuration for all the rules in the ClaimVantage core package
	private int score;
	private String description;
	
	public RuleCustomSettings(int score, String description) {
		super();
		this.score = score;
		this.description = description;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
