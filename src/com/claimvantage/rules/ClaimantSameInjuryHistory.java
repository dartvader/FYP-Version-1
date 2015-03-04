package com.claimvantage.rules;

public class ClaimantSameInjuryHistory {

	String contactId;
	String closedClaimId;
	String openClaimId;
	String medicalCode;

	public ClaimantSameInjuryHistory(String contactId, String closedClaimId, String medicalCode) {
		super();
		this.contactId = contactId;
		this.closedClaimId = closedClaimId;
		this.medicalCode = medicalCode;
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
}
