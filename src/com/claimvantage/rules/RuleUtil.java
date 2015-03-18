package com.claimvantage.rules;

import java.util.Date;
import java.util.Calendar;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Days;

public class RuleUtil {

	public static enum OpenStatus {
		Open, Incomplete, Pending;
	}

	public static Boolean isClaimOpen(String claimStatus) {

		System.out.println(" Claim Status " + claimStatus);
		if (claimStatus == null)
			return true;
		for (OpenStatus status : OpenStatus.values()) {
			if (status.toString() == claimStatus
					|| status.toString().contains(claimStatus)) {
				System.out.println(" Claim Status " + claimStatus);
				return true;
			}
		}
		return false;
	}

	public static Boolean isClaimOpen(String claimStatus, Boolean f) {

		System.out.println(" Claim Status " + claimStatus + " fraudster " + f);
		if (claimStatus == null)
			return true;
		for (OpenStatus status : OpenStatus.values()) {
			if (status.toString() == claimStatus
					|| status.toString().contains(claimStatus)) {
				// System.out.println(" Claim Status " + claimStatus +
				// " fraudster " + f);
				return true;
			}
		}
		return false;
	}

	public static enum SuspicouisJobType {
		Doctor, Nurse;
	}

	public static Boolean isJobSuspect(String jobTitle) {
		System.out.println("jobTitle " + jobTitle);
		if (jobTitle == null)
			return true;
		for (SuspicouisJobType title : SuspicouisJobType.values()) {
			if (title.toString() == jobTitle
					|| title.toString().contains(jobTitle)) {
				return true;
			}
		}
		return false;
	}

	public static enum SubjectiveInjuriesHints {
		Sprain, Strain;
	}

	public enum SubjectiveInjuires {
		SPRAIN {
			public String toString() {
				return "Sprain";
			}
		},
		STRAIN {
			public String toString() {
				return "Strain";
			}
		},
		SOFT_TISSUE {
			public String toString() {
				return "Soft Tissue";
			}
		},
		HEAD_ACHE {
			public String toString() {
				return "Headache";
			}
		}
	}

	public static Boolean isSubjectiveInjury(String injuryDescription) {

		if (injuryDescription == null)
			return false;

		for (SubjectiveInjuires injuires : SubjectiveInjuires.values()) {

			if (injuires.toString() == injuryDescription
					|| injuryDescription.contains(injuires.toString())) {
				System.out.println(" injuryDescription "
						+ injuryDescription.contains(injuires.toString()));
				System.out.println(" injuryDescription " + injuryDescription
						+ " injuires " + injuires.toString());
				return true;
			}

		}
		return false;
	}

	static Boolean isTooMany() {
		return true;
	}

	public static Boolean isLargeNumberOfAttachmentsAndNotes(int notes,
			int attachments, int documents, int largeNumber) {
		
		System.out.println("numbers notes " + notes);
		System.out.println("numbers attachments " + attachments);
		System.out.println("numbers documents " + documents);
		System.out.println(" total " + documents);
		return (largeNumber < notes + attachments + documents) ? true : false;
	}

	public static Boolean dayAfterStartDate(Calendar calendar1, Calendar calendar2, int daysAllowedAfter) {
		
		if (calendar1 == null || calendar2 == null) {
			return false;
		}
		Date date1 =  calendar1.getTime();
		Date date2 =  calendar2.getTime();
		Days days = Days.daysBetween(new DateTime(date1), new DateTime(date2));
		int daysBetween = days.getDays();
		
		System.out.println("Days Between " + days);
		return daysBetween <= daysAllowedAfter ? true: false;
	}
	
	public static Boolean firstNotificationAfterRetirementOr(Calendar claimReceived, Calendar claimantFired) {
		
		if (claimReceived == null || claimantFired == null) {
			return false;
		}
		System.out.println(" claimReceived " + claimReceived.toString());
		System.out.println(" claimantFired " + claimantFired.toString());
		System.out.println(" claimReceived.after(claimantFired) " + claimReceived.after(claimantFired));
		return claimReceived.after(claimantFired) ? true: false;
	}
}
