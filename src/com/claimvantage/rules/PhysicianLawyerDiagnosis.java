package com.claimvantage.rules;

public class PhysicianLawyerDiagnosis {
	public String physicianId;
	public String lawyerId;
	public String claimId;
	public String medicalCode;
	
	public PhysicianLawyerDiagnosis(String physician, String lawyer, String claimId, String medicalCode) {
		super();
		this.physicianId = physician;
		this.lawyerId = lawyer;
		this.claimId = claimId;
		this.medicalCode = medicalCode;
	}

	public String getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(String physicianId) {
		this.physicianId = physicianId;
	}

	public String getLawyerId() {
		return lawyerId;
	}

	public void setLawyerId(String lawyerId) {
		this.lawyerId = lawyerId;
	}

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public String getMedicalCode() {
		return medicalCode;
	}

	public void setMedicalCode(String medicalCode) {
		this.medicalCode = medicalCode;
	}
	
	
}
