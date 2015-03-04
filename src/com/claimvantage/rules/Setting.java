package com.claimvantage.rules;

public class Setting {
	private int score;
	private String recommendation;
	private int numberOfClaims;
	private int numberOfDays;
	private int numberOfCorrespondence;
	
	public Setting() {
		
	}
	
	public Setting(int score, String recommendation) {
		this.score = score;
		this.recommendation = recommendation;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public int getNumberOfClaims() {
		return numberOfClaims;
	}

	public void setNumberOfClaims(int numberOfClaims) {
		this.numberOfClaims = numberOfClaims;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getNumberOfCorrespondence() {
		return numberOfCorrespondence;
	}

	public void setNumberOfCorrespondence(int numberOfCorrespondence) {
		this.numberOfCorrespondence = numberOfCorrespondence;
	}
}
