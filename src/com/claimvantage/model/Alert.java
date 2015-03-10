package com.claimvantage.model;

import java.sql.Timestamp;
import java.util.Date;

import com.sforce.soap.enterprise.sobject.Cve__Claim__c;

public class Alert {
	
	private String claimId;
	private String claimName;
	private String claimantName;
	private String ruleName;
	private String recommendation;
	private String timeStamp;
	private Cve__Claim__c claim;
	private int score;
	
	public Alert(String ruleName, int score, String recommendation, String claimId, String claimName, String claimantName, Cve__Claim__c claim) {
		this.ruleName = ruleName;
		this.recommendation = recommendation;
		this.score = score;
		this.claimId = claimId;
		this.claimantName = claimantName;
		this.claimName = claimName;
		this.claim = claim;
		this.setTimeStamp(new Timestamp(new Date().getTime()).toLocalDateTime().toString());
	}
	
	public Alert(String ruleName, int score, String recommendation, String claimId, String claimName, String claimantName) {
		this(ruleName, score, recommendation, claimId, claimName, claimantName, null);
	}
	
	public Alert(String ruleName, int score, String recommendation, String claimId, String claimName ) {
		this(ruleName, score, recommendation, claimId, claimName, null);
	}
	
	public Alert(String ruleName, int score, String recommendation, String claimId) {
		this(ruleName, score, recommendation, claimId, null, null);
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

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getClaimName() {
		return claimName;
	}

	public void setClaimName(String claimName) {
		this.claimName = claimName;
	}

	public String getClaimantName() {
		return claimantName;
	}
	
	public void setClaimantName(String claimantName) {
		this.claimantName = claimantName;
	}

	public Cve__Claim__c getClaim() {
		return claim;
	}

	public void setClaim(Cve__Claim__c claim) {
		this.claim = claim;
	}
}
