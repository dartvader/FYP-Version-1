package com.claimvantage.rules;

public class PhysicanDiagnosis {
	public String physicanId;
	public String medicalCode;
	public String claimId;
	public String salesOffice;
	
	
	public PhysicanDiagnosis(String physicanId, String medicalCode, String claimId, String salesOffice) {
		super();
		this.physicanId = physicanId;
		this.medicalCode = medicalCode;
		this.claimId = claimId;
		this.salesOffice = salesOffice;
	}
	public PhysicanDiagnosis(String physicanId, String medicalCode, String claimId) {
		this(physicanId, medicalCode, claimId, null);
	}
	
	public String getPhysicanId() {
		return physicanId;
	}
	public void setPhysicanId(String physicanId) {
		this.physicanId = physicanId;
	}
	public String getMedicalCode() {
		return medicalCode;
	}
	public void setMedicalCode(String medicalCode) {
		this.medicalCode = medicalCode;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getSalesOffice() {
		return salesOffice;
	}
	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}
	
}
