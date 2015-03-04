package com.claimvantage.rules;

public class Setting {

	private String name;
	private String configHint;
	private String recommendation;
	private String category;
	private int score;
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

	public String getConfigHint() {
		return configHint;
	}

	public void setConfigHint(String configHint) {
		this.configHint = configHint;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
