package com.claimvantage.rules;

public class ClaimantSameInjuryHistory {

	String contactId;
	String closedClaimId;
	String openClaimId;
	String medicalCode;
	Boolean subjective;

	public ClaimantSameInjuryHistory(String contactId, String closedClaimId, String medicalCode, Boolean subjective) {
		super();
		this.contactId = contactId;
		this.closedClaimId = closedClaimId;
		this.medicalCode = medicalCode;
		this.subjective = subjective;
		System.out.println("subjective " + subjective);
	}
	
	public ClaimantSameInjuryHistory(String contactId, String closedClaimId, String medicalCode) {
		this(contactId, closedClaimId, medicalCode, false);
	}
	

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getClosedClaimId() {
		return closedClaimId;
	}

	public void setClosedClaimId(String closedClaimId) {
		this.closedClaimId = closedClaimId;
	}

	public String getOpenClaimId() {
		return openClaimId;
	}

	public void setOpenClaimId(String openClaimId) {
		this.openClaimId = openClaimId;
	}

	public String getMedicalCode() {
		return medicalCode;
	}

	public void setMedicalCode(String medicalCode) {
		this.medicalCode = medicalCode;
	}

	public Boolean getSubjective() {
		return subjective;
	}

	public void setSubjective(Boolean subjective) {
		this.subjective = subjective;
	}
	
}
