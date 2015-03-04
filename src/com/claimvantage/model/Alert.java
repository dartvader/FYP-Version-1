package com.claimvantage.model;

public class Alert {
	
	private String claimId;
	private String ruleName;
	private String recommendation;
	private int score;
	
	public Alert(String ruleName, int score, String recommendation, String claimId) {
		this.ruleName = ruleName;
		this.recommendation = recommendation;
		this.score = score;
		this.claimId = claimId;
	}
	
	public Alert(String ruleName, int score, String recommendation) {
		this(ruleName, score, recommendation, "Not Available");
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

}
