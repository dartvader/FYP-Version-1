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
}
