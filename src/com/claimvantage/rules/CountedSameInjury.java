package com.claimvantage.rules;

import java.util.ArrayList;

public class CountedSameInjury {
	public String claimId;
	public String claimantId;
	public ArrayList<ClaimantSameInjuryHistory> claims;

	
	public CountedSameInjury(ArrayList<ClaimantSameInjuryHistory> claims) {
		super();
		this.claims = claims;
	}

	public CountedSameInjury(String claimantId) {
		super();
		this.claimantId = claimantId;
	}

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public ArrayList<ClaimantSameInjuryHistory> getClaims() {
		return claims;
	}

	public void setClaims(ArrayList<ClaimantSameInjuryHistory> claims) {
		this.claims = claims;
	}

	public String getClaimantId() {
		return claimantId;
	}

	public void setClaimantId(String claimantId) {
		this.claimantId = claimantId;
	}
	
}
