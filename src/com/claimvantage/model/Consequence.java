package com.claimvantage.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Consequence {
	
	private Integer score;
	private String recommendation;
	
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	
	// TODO Build consequence Script
	public String buildScript() {
		// 
		
		return "";
	}
	
	// TODO look at how to find the claim object or build alert object that can find claim when uploaded to Salesforce
	
	
}
