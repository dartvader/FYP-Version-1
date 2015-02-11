
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__BenefitClaimed__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__BenefitClaimed__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__AccumulatedDividendAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdaptiveHomeVehicleMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdjustedBenefitStart__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__AdjustedBenefitThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__AgeAtDateOfDeath__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AgeAtDateOfDiagnosis__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AgeAtDod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AgeInMonthsAtDod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AirBagApplicable__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AirBagDecision__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__AirBagDenied__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AnticipatedRecovery__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BenefitAmountPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__BenefitStart__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BenefitThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Benefit__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Benefit__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Benefit__c" minOccurs="0"/>
 *         &lt;element name="cve__BothFeet__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__BothHands__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CareerAdjustmentMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Cause__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CertifiedThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__ChildCareMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildEducationMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Claim__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Claim__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Claim__c" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccountName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsured__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsured__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="cve__ComaMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CoverageAmountAsOf__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__CoverageAmountRemaining__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CoverageAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CoveragesClaimed__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__CriticalBurnMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CurrentAccountValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DateOfAccident__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfDeath__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfDiagnosis__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfDisability__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfLoss__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfMaturity__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateReceived__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DayCareMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DaysPending__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DaysTolling__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DeathNotification__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DecisionTurnAroundDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DefinitionOfDisabilityChange__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DismembermentAndLoss__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Documents__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__DoubleIndemnityCommonCarrierMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EffectiveDateOfCoverage__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__EitherHandOrFootAndSightInOneEye__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__EmployeeContributionPostTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployeeContributionPreTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployeePremiumPaidPostTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployeePremiumPaidPreTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerContributionPostTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerContributionPreTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerPremiumPaidPostTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerPremiumPaidPreTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Explanation2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Explanation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__FeloniousAssaultMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__FirstNotified__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Hemiplegia__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HigherEducationMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HospitalEndDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__HospitalName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HospitalStartDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__HospitalState__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IncurredBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IncurredLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__IncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__InitialApprovedDate__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__InitialAssignment__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__InitialContributionAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__InitialDecision__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__InsuredRelationshipToPolicyholder__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Journals__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__LastModified__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__LastReinstatementApproval__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__LastWorked__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__LatestJournal__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__LatestJournal__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Journal__c" minOccurs="0"/>
 *         &lt;element name="cve__LatestPaymentSpecification__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__LatestPaymentSpecification__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSpecification__c" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LifeChangeEventDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__LifeChangeEventType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LifePolicyFaceAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LocationOfDeath__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MaximumLifeExpectancyPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumLifeExpectancyUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MedicalCode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MinimumInterestPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumLifeExpectancyPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumLifeExpectancyUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MonthsOfServiceAtDod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OneFootLoss__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__OneHandAndOneFoot__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__OneHandLoss__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__OutstandingLoanAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBalanceAsOf__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBalanceNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBalance__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaidDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaidStart__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PaidThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PaidWeekDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Paraplegia__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSchedule__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSchedule__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSchedule__c" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecifications__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Policy__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Policy__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Policy__c" minOccurs="0"/>
 *         &lt;element name="cve__PremiumPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PremiumsPaidThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__ProofOfLoss__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Quadriplegia__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ReapprovedDate__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__Reapproved__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__RecordTypeName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RehabilitationMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__RepatriationMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SeatBeltApplicable__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SeatBeltDecision__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__SeatBeltDenied__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SightInBothEyes__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SightInOneEyeLoss__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SpeechAndHearingInBothEars__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SpeechOrHearingInBothEars__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SpouseEducationMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Start__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__StatusForApproval__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__StatusReason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__StatusReasons__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SubmittedCoverageAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SubmittedCoveragePercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TherapeuticCounselingMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ThumbAndIndexFingerOfEitherHand__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TollingAsOf__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__TollingPeriods__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__TotalAdaptiveHomeVehicleBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalCareerAdjustmentBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalChildCareBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalChildEducationBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalComaBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalContribution__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalCriticalBurnBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalDayCareBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalDoubleIndemnityCommonCarrierBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalFeloniousAssaultBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalHigherEducationBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalIncurredAsOf__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TotalIncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalIncurred__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalLiabilityAsOf__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TotalLiabilityNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalLiability__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalPaidDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalPremiumPaid__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalRehabilitationBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalRepatriationBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalSpouseEducationBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalTherapeuticCounselingBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalToBeIncurredAsOf__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TotalToBeIncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalToBeIncurred__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Triplegia__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__TurnAroundTime__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TwoOrMoreLosses__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Uniplegia__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__WopTermination__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__YearsOfServiceAtDod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__BenefitClaimed__c", propOrder = {
    "activityHistories",
    "attachments",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "events",
    "histories",
    "isDeleted",
    "lastActivityDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastReferencedDate",
    "lastViewedDate",
    "lookedUpFromActivities",
    "name",
    "notes",
    "notesAndAttachments",
    "openActivities",
    "processInstances",
    "processSteps",
    "recordType",
    "recordTypeId",
    "systemModstamp",
    "tasks",
    "topicAssignments",
    "userRecordAccess",
    "cve__AccumulatedDividendAmount__C",
    "cve__AdaptiveHomeVehicleMaximum__C",
    "cve__AdjustedBenefitStart__C",
    "cve__AdjustedBenefitThrough__C",
    "cve__AgeAtDateOfDeath__C",
    "cve__AgeAtDateOfDiagnosis__C",
    "cve__AgeAtDod__C",
    "cve__AgeInMonthsAtDod__C",
    "cve__AirBagApplicable__C",
    "cve__AirBagDecision__C",
    "cve__AirBagDenied__C",
    "cve__AnticipatedRecovery__C",
    "cve__BenefitAmountPeriod__C",
    "cve__BenefitAmount__C",
    "cve__BenefitStart__C",
    "cve__BenefitThrough__C",
    "cve__Benefit__C",
    "cve__Benefit__R",
    "cve__BothFeet__C",
    "cve__BothHands__C",
    "cve__CareerAdjustmentMaximum__C",
    "cve__Cause__C",
    "cve__CertifiedThrough__C",
    "cve__ChildCareMaximum__C",
    "cve__ChildEducationMaximum__C",
    "cve__Claim__C",
    "cve__Claim__R",
    "cve__ClaimantInsuredAccountName__C",
    "cve__ClaimantInsuredAccount__C",
    "cve__ClaimantInsuredAccount__R",
    "cve__ClaimantInsuredName__C",
    "cve__ClaimantInsured__C",
    "cve__ClaimantInsured__R",
    "cve__ComaMaximum__C",
    "cve__CoverageAmountAsOf__C",
    "cve__CoverageAmountRemaining__C",
    "cve__CoverageAmount__C",
    "cve__CoveragesClaimed__R",
    "cve__CriticalBurnMaximum__C",
    "cve__CurrentAccountValue__C",
    "cve__DateOfAccident__C",
    "cve__DateOfDeath__C",
    "cve__DateOfDiagnosis__C",
    "cve__DateOfDisability__C",
    "cve__DateOfLoss__C",
    "cve__DateOfMaturity__C",
    "cve__DateReceived__C",
    "cve__DayCareMaximum__C",
    "cve__DaysPending__C",
    "cve__DaysTolling__C",
    "cve__DeathNotification__C",
    "cve__DecisionTurnAroundDays__C",
    "cve__DefinitionOfDisabilityChange__C",
    "cve__DismembermentAndLoss__C",
    "cve__Documents__R",
    "cve__DoubleIndemnityCommonCarrierMaximum__C",
    "cve__EffectiveDateOfCoverage__C",
    "cve__EitherHandOrFootAndSightInOneEye__C",
    "cve__EmployeeContributionPostTax__C",
    "cve__EmployeeContributionPreTax__C",
    "cve__EmployeePremiumPaidPostTax__C",
    "cve__EmployeePremiumPaidPreTax__C",
    "cve__EmployerContributionPostTax__C",
    "cve__EmployerContributionPreTax__C",
    "cve__EmployerPremiumPaidPostTax__C",
    "cve__EmployerPremiumPaidPreTax__C",
    "cve__Explanation2__C",
    "cve__Explanation__C",
    "cve__FeloniousAssaultMaximum__C",
    "cve__FirstNotified__C",
    "cve__Hemiplegia__C",
    "cve__HigherEducationMaximum__C",
    "cve__HospitalEndDate__C",
    "cve__HospitalName__C",
    "cve__HospitalStartDate__C",
    "cve__HospitalState__C",
    "cve__IncurredBeforeTax__C",
    "cve__IncurredLastCalculated__C",
    "cve__IncurredNet__C",
    "cve__InitialApprovedDate__C",
    "cve__InitialAssignment__C",
    "cve__InitialContributionAmount__C",
    "cve__InitialDecision__C",
    "cve__InsuredRelationshipToPolicyholder__C",
    "cve__Journals__R",
    "cve__LastModified__C",
    "cve__LastReinstatementApproval__C",
    "cve__LastWorked__C",
    "cve__LatestJournal__C",
    "cve__LatestJournal__R",
    "cve__LatestPaymentSpecification__C",
    "cve__LatestPaymentSpecification__R",
    "cve__LiabilityBeforeTax__C",
    "cve__LiabilityLastCalculated__C",
    "cve__LiabilityNet__C",
    "cve__LifeChangeEventDate__C",
    "cve__LifeChangeEventType__C",
    "cve__LifePolicyFaceAmount__C",
    "cve__LocationOfDeath__C",
    "cve__MaximumLifeExpectancyPeriod__C",
    "cve__MaximumLifeExpectancyUnits__C",
    "cve__MedicalCode__C",
    "cve__MinimumInterestPercentage__C",
    "cve__MinimumLifeExpectancyPeriod__C",
    "cve__MinimumLifeExpectancyUnits__C",
    "cve__MonthsOfServiceAtDod__C",
    "cve__OneFootLoss__C",
    "cve__OneHandAndOneFoot__C",
    "cve__OneHandLoss__C",
    "cve__OutstandingLoanAmount__C",
    "cve__OverpaymentBalanceAsOf__C",
    "cve__OverpaymentBalanceNet__C",
    "cve__OverpaymentBalance__C",
    "cve__OverpaymentBeforeTax__C",
    "cve__OverpaymentLastCalculated__C",
    "cve__OverpaymentNet__C",
    "cve__PaidDays__C",
    "cve__PaidStart__C",
    "cve__PaidThrough__C",
    "cve__PaidWeekDays__C",
    "cve__Paraplegia__C",
    "cve__PaymentSchedule__C",
    "cve__PaymentSchedule__R",
    "cve__PaymentSpecifications__R",
    "cve__Policy__C",
    "cve__Policy__R",
    "cve__PremiumPeriod__C",
    "cve__PremiumsPaidThrough__C",
    "cve__ProofOfLoss__C",
    "cve__Quadriplegia__C",
    "cve__ReapprovedDate__C",
    "cve__Reapproved__C",
    "cve__RecordTypeName__C",
    "cve__RehabilitationMaximum__C",
    "cve__RepatriationMaximum__C",
    "cve__SeatBeltApplicable__C",
    "cve__SeatBeltDecision__C",
    "cve__SeatBeltDenied__C",
    "cve__SightInBothEyes__C",
    "cve__SightInOneEyeLoss__C",
    "cve__SpeechAndHearingInBothEars__C",
    "cve__SpeechOrHearingInBothEars__C",
    "cve__SpouseEducationMaximum__C",
    "cve__Start__C",
    "cve__StatusForApproval__C",
    "cve__StatusReason__C",
    "cve__StatusReasons__C",
    "cve__Status__C",
    "cve__SubmittedCoverageAmount__C",
    "cve__SubmittedCoveragePercentage__C",
    "cve__TherapeuticCounselingMaximum__C",
    "cve__ThumbAndIndexFingerOfEitherHand__C",
    "cve__ToBeIncurredBeforeTax__C",
    "cve__ToBeIncurredLastCalculated__C",
    "cve__ToBeIncurredNet__C",
    "cve__TollingAsOf__C",
    "cve__TollingPeriods__R",
    "cve__TotalAdaptiveHomeVehicleBenefit__C",
    "cve__TotalCareerAdjustmentBenefit__C",
    "cve__TotalChildCareBenefit__C",
    "cve__TotalChildEducationBenefit__C",
    "cve__TotalComaBenefit__C",
    "cve__TotalContribution__C",
    "cve__TotalCriticalBurnBenefit__C",
    "cve__TotalDayCareBenefit__C",
    "cve__TotalDoubleIndemnityCommonCarrierBenefit__C",
    "cve__TotalFeloniousAssaultBenefit__C",
    "cve__TotalHigherEducationBenefit__C",
    "cve__TotalIncurredAsOf__C",
    "cve__TotalIncurredNet__C",
    "cve__TotalIncurred__C",
    "cve__TotalLiabilityAsOf__C",
    "cve__TotalLiabilityNet__C",
    "cve__TotalLiability__C",
    "cve__TotalPaidDays__C",
    "cve__TotalPremiumPaid__C",
    "cve__TotalRehabilitationBenefit__C",
    "cve__TotalRepatriationBenefit__C",
    "cve__TotalSpouseEducationBenefit__C",
    "cve__TotalTherapeuticCounselingBenefit__C",
    "cve__TotalToBeIncurredAsOf__C",
    "cve__TotalToBeIncurredNet__C",
    "cve__TotalToBeIncurred__C",
    "cve__Triplegia__C",
    "cve__TurnAroundTime__C",
    "cve__TwoOrMoreLosses__C",
    "cve__Uniplegia__C",
    "cve__WopTermination__C",
    "cve__YearsOfServiceAtDod__C"
})
public class Cve__BenefitClaimed__C
    extends SObject
{

    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResultType activityHistories;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResultType attachments;
    @XmlElement(name = "CombinedAttachments", nillable = true)
    protected QueryResultType combinedAttachments;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResultType events;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResultType histories;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastActivityDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LastReferencedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReferencedDate;
    @XmlElement(name = "LastViewedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastViewedDate;
    @XmlElement(name = "LookedUpFromActivities", nillable = true)
    protected QueryResultType lookedUpFromActivities;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResultType notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResultType notesAndAttachments;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResultType openActivities;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResultType processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResultType processSteps;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResultType tasks;
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__AccumulatedDividendAmount__c", nillable = true)
    protected Double cve__AccumulatedDividendAmount__C;
    @XmlElement(name = "cve__AdaptiveHomeVehicleMaximum__c", nillable = true)
    protected Double cve__AdaptiveHomeVehicleMaximum__C;
    @XmlElement(name = "cve__AdjustedBenefitStart__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__AdjustedBenefitStart__C;
    @XmlElement(name = "cve__AdjustedBenefitThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__AdjustedBenefitThrough__C;
    @XmlElement(name = "cve__AgeAtDateOfDeath__c", nillable = true)
    protected Double cve__AgeAtDateOfDeath__C;
    @XmlElement(name = "cve__AgeAtDateOfDiagnosis__c", nillable = true)
    protected Double cve__AgeAtDateOfDiagnosis__C;
    @XmlElement(name = "cve__AgeAtDod__c", nillable = true)
    protected Double cve__AgeAtDod__C;
    @XmlElement(name = "cve__AgeInMonthsAtDod__c", nillable = true)
    protected Double cve__AgeInMonthsAtDod__C;
    @XmlElement(name = "cve__AirBagApplicable__c", nillable = true)
    protected Boolean cve__AirBagApplicable__C;
    @XmlElement(name = "cve__AirBagDecision__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__AirBagDecision__C;
    @XmlElement(name = "cve__AirBagDenied__c", nillable = true)
    protected Boolean cve__AirBagDenied__C;
    @XmlElement(name = "cve__AnticipatedRecovery__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__AnticipatedRecovery__C;
    @XmlElement(name = "cve__BenefitAmountPeriod__c", nillable = true)
    protected String cve__BenefitAmountPeriod__C;
    @XmlElement(name = "cve__BenefitAmount__c", nillable = true)
    protected Double cve__BenefitAmount__C;
    @XmlElement(name = "cve__BenefitStart__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__BenefitStart__C;
    @XmlElement(name = "cve__BenefitThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__BenefitThrough__C;
    @XmlElement(name = "cve__Benefit__c", nillable = true)
    protected String cve__Benefit__C;
    @XmlElement(name = "cve__Benefit__r", nillable = true)
    protected Cve__Benefit__C cve__Benefit__R;
    @XmlElement(name = "cve__BothFeet__c", nillable = true)
    protected Boolean cve__BothFeet__C;
    @XmlElement(name = "cve__BothHands__c", nillable = true)
    protected Boolean cve__BothHands__C;
    @XmlElement(name = "cve__CareerAdjustmentMaximum__c", nillable = true)
    protected Double cve__CareerAdjustmentMaximum__C;
    @XmlElement(name = "cve__Cause__c", nillable = true)
    protected String cve__Cause__C;
    @XmlElement(name = "cve__CertifiedThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__CertifiedThrough__C;
    @XmlElement(name = "cve__ChildCareMaximum__c", nillable = true)
    protected Double cve__ChildCareMaximum__C;
    @XmlElement(name = "cve__ChildEducationMaximum__c", nillable = true)
    protected Double cve__ChildEducationMaximum__C;
    @XmlElement(name = "cve__Claim__c", nillable = true)
    protected String cve__Claim__C;
    @XmlElement(name = "cve__Claim__r", nillable = true)
    protected Cve__Claim__C cve__Claim__R;
    @XmlElement(name = "cve__ClaimantInsuredAccountName__c", nillable = true)
    protected String cve__ClaimantInsuredAccountName__C;
    @XmlElement(name = "cve__ClaimantInsuredAccount__c", nillable = true)
    protected String cve__ClaimantInsuredAccount__C;
    @XmlElement(name = "cve__ClaimantInsuredAccount__r", nillable = true)
    protected Account cve__ClaimantInsuredAccount__R;
    @XmlElement(name = "cve__ClaimantInsuredName__c", nillable = true)
    protected String cve__ClaimantInsuredName__C;
    @XmlElement(name = "cve__ClaimantInsured__c", nillable = true)
    protected String cve__ClaimantInsured__C;
    @XmlElement(name = "cve__ClaimantInsured__r", nillable = true)
    protected Contact cve__ClaimantInsured__R;
    @XmlElement(name = "cve__ComaMaximum__c", nillable = true)
    protected Double cve__ComaMaximum__C;
    @XmlElement(name = "cve__CoverageAmountAsOf__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__CoverageAmountAsOf__C;
    @XmlElement(name = "cve__CoverageAmountRemaining__c", nillable = true)
    protected Double cve__CoverageAmountRemaining__C;
    @XmlElement(name = "cve__CoverageAmount__c", nillable = true)
    protected Double cve__CoverageAmount__C;
    @XmlElement(name = "cve__CoveragesClaimed__r", nillable = true)
    protected QueryResultType cve__CoveragesClaimed__R;
    @XmlElement(name = "cve__CriticalBurnMaximum__c", nillable = true)
    protected Double cve__CriticalBurnMaximum__C;
    @XmlElement(name = "cve__CurrentAccountValue__c", nillable = true)
    protected Double cve__CurrentAccountValue__C;
    @XmlElement(name = "cve__DateOfAccident__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfAccident__C;
    @XmlElement(name = "cve__DateOfDeath__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfDeath__C;
    @XmlElement(name = "cve__DateOfDiagnosis__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfDiagnosis__C;
    @XmlElement(name = "cve__DateOfDisability__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfDisability__C;
    @XmlElement(name = "cve__DateOfLoss__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfLoss__C;
    @XmlElement(name = "cve__DateOfMaturity__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfMaturity__C;
    @XmlElement(name = "cve__DateReceived__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateReceived__C;
    @XmlElement(name = "cve__DayCareMaximum__c", nillable = true)
    protected Double cve__DayCareMaximum__C;
    @XmlElement(name = "cve__DaysPending__c", nillable = true)
    protected Double cve__DaysPending__C;
    @XmlElement(name = "cve__DaysTolling__c", nillable = true)
    protected Double cve__DaysTolling__C;
    @XmlElement(name = "cve__DeathNotification__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DeathNotification__C;
    @XmlElement(name = "cve__DecisionTurnAroundDays__c", nillable = true)
    protected Double cve__DecisionTurnAroundDays__C;
    @XmlElement(name = "cve__DefinitionOfDisabilityChange__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DefinitionOfDisabilityChange__C;
    @XmlElement(name = "cve__DismembermentAndLoss__c", nillable = true)
    protected Boolean cve__DismembermentAndLoss__C;
    @XmlElement(name = "cve__Documents__r", nillable = true)
    protected QueryResultType cve__Documents__R;
    @XmlElement(name = "cve__DoubleIndemnityCommonCarrierMaximum__c", nillable = true)
    protected Double cve__DoubleIndemnityCommonCarrierMaximum__C;
    @XmlElement(name = "cve__EffectiveDateOfCoverage__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__EffectiveDateOfCoverage__C;
    @XmlElement(name = "cve__EitherHandOrFootAndSightInOneEye__c", nillable = true)
    protected Boolean cve__EitherHandOrFootAndSightInOneEye__C;
    @XmlElement(name = "cve__EmployeeContributionPostTax__c", nillable = true)
    protected Double cve__EmployeeContributionPostTax__C;
    @XmlElement(name = "cve__EmployeeContributionPreTax__c", nillable = true)
    protected Double cve__EmployeeContributionPreTax__C;
    @XmlElement(name = "cve__EmployeePremiumPaidPostTax__c", nillable = true)
    protected Double cve__EmployeePremiumPaidPostTax__C;
    @XmlElement(name = "cve__EmployeePremiumPaidPreTax__c", nillable = true)
    protected Double cve__EmployeePremiumPaidPreTax__C;
    @XmlElement(name = "cve__EmployerContributionPostTax__c", nillable = true)
    protected Double cve__EmployerContributionPostTax__C;
    @XmlElement(name = "cve__EmployerContributionPreTax__c", nillable = true)
    protected Double cve__EmployerContributionPreTax__C;
    @XmlElement(name = "cve__EmployerPremiumPaidPostTax__c", nillable = true)
    protected Double cve__EmployerPremiumPaidPostTax__C;
    @XmlElement(name = "cve__EmployerPremiumPaidPreTax__c", nillable = true)
    protected Double cve__EmployerPremiumPaidPreTax__C;
    @XmlElement(name = "cve__Explanation2__c", nillable = true)
    protected String cve__Explanation2__C;
    @XmlElement(name = "cve__Explanation__c", nillable = true)
    protected String cve__Explanation__C;
    @XmlElement(name = "cve__FeloniousAssaultMaximum__c", nillable = true)
    protected Double cve__FeloniousAssaultMaximum__C;
    @XmlElement(name = "cve__FirstNotified__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__FirstNotified__C;
    @XmlElement(name = "cve__Hemiplegia__c", nillable = true)
    protected Boolean cve__Hemiplegia__C;
    @XmlElement(name = "cve__HigherEducationMaximum__c", nillable = true)
    protected Double cve__HigherEducationMaximum__C;
    @XmlElement(name = "cve__HospitalEndDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__HospitalEndDate__C;
    @XmlElement(name = "cve__HospitalName__c", nillable = true)
    protected String cve__HospitalName__C;
    @XmlElement(name = "cve__HospitalStartDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__HospitalStartDate__C;
    @XmlElement(name = "cve__HospitalState__c", nillable = true)
    protected String cve__HospitalState__C;
    @XmlElement(name = "cve__IncurredBeforeTax__c", nillable = true)
    protected Double cve__IncurredBeforeTax__C;
    @XmlElement(name = "cve__IncurredLastCalculated__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__IncurredLastCalculated__C;
    @XmlElement(name = "cve__IncurredNet__c", nillable = true)
    protected Double cve__IncurredNet__C;
    @XmlElement(name = "cve__InitialApprovedDate__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__InitialApprovedDate__C;
    @XmlElement(name = "cve__InitialAssignment__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__InitialAssignment__C;
    @XmlElement(name = "cve__InitialContributionAmount__c", nillable = true)
    protected Double cve__InitialContributionAmount__C;
    @XmlElement(name = "cve__InitialDecision__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__InitialDecision__C;
    @XmlElement(name = "cve__InsuredRelationshipToPolicyholder__c", nillable = true)
    protected String cve__InsuredRelationshipToPolicyholder__C;
    @XmlElement(name = "cve__Journals__r", nillable = true)
    protected QueryResultType cve__Journals__R;
    @XmlElement(name = "cve__LastModified__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__LastModified__C;
    @XmlElement(name = "cve__LastReinstatementApproval__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__LastReinstatementApproval__C;
    @XmlElement(name = "cve__LastWorked__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__LastWorked__C;
    @XmlElement(name = "cve__LatestJournal__c", nillable = true)
    protected String cve__LatestJournal__C;
    @XmlElement(name = "cve__LatestJournal__r", nillable = true)
    protected Cve__Journal__C cve__LatestJournal__R;
    @XmlElement(name = "cve__LatestPaymentSpecification__c", nillable = true)
    protected String cve__LatestPaymentSpecification__C;
    @XmlElement(name = "cve__LatestPaymentSpecification__r", nillable = true)
    protected Cve__PaymentSpecification__C cve__LatestPaymentSpecification__R;
    @XmlElement(name = "cve__LiabilityBeforeTax__c", nillable = true)
    protected Double cve__LiabilityBeforeTax__C;
    @XmlElement(name = "cve__LiabilityLastCalculated__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__LiabilityLastCalculated__C;
    @XmlElement(name = "cve__LiabilityNet__c", nillable = true)
    protected Double cve__LiabilityNet__C;
    @XmlElement(name = "cve__LifeChangeEventDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__LifeChangeEventDate__C;
    @XmlElement(name = "cve__LifeChangeEventType__c", nillable = true)
    protected String cve__LifeChangeEventType__C;
    @XmlElement(name = "cve__LifePolicyFaceAmount__c", nillable = true)
    protected Double cve__LifePolicyFaceAmount__C;
    @XmlElement(name = "cve__LocationOfDeath__c", nillable = true)
    protected String cve__LocationOfDeath__C;
    @XmlElement(name = "cve__MaximumLifeExpectancyPeriod__c", nillable = true)
    protected Double cve__MaximumLifeExpectancyPeriod__C;
    @XmlElement(name = "cve__MaximumLifeExpectancyUnits__c", nillable = true)
    protected String cve__MaximumLifeExpectancyUnits__C;
    @XmlElement(name = "cve__MedicalCode__c", nillable = true)
    protected String cve__MedicalCode__C;
    @XmlElement(name = "cve__MinimumInterestPercentage__c", nillable = true)
    protected Double cve__MinimumInterestPercentage__C;
    @XmlElement(name = "cve__MinimumLifeExpectancyPeriod__c", nillable = true)
    protected Double cve__MinimumLifeExpectancyPeriod__C;
    @XmlElement(name = "cve__MinimumLifeExpectancyUnits__c", nillable = true)
    protected String cve__MinimumLifeExpectancyUnits__C;
    @XmlElement(name = "cve__MonthsOfServiceAtDod__c", nillable = true)
    protected Double cve__MonthsOfServiceAtDod__C;
    @XmlElement(name = "cve__OneFootLoss__c", nillable = true)
    protected Boolean cve__OneFootLoss__C;
    @XmlElement(name = "cve__OneHandAndOneFoot__c", nillable = true)
    protected Boolean cve__OneHandAndOneFoot__C;
    @XmlElement(name = "cve__OneHandLoss__c", nillable = true)
    protected Boolean cve__OneHandLoss__C;
    @XmlElement(name = "cve__OutstandingLoanAmount__c", nillable = true)
    protected Double cve__OutstandingLoanAmount__C;
    @XmlElement(name = "cve__OverpaymentBalanceAsOf__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__OverpaymentBalanceAsOf__C;
    @XmlElement(name = "cve__OverpaymentBalanceNet__c", nillable = true)
    protected Double cve__OverpaymentBalanceNet__C;
    @XmlElement(name = "cve__OverpaymentBalance__c", nillable = true)
    protected Double cve__OverpaymentBalance__C;
    @XmlElement(name = "cve__OverpaymentBeforeTax__c", nillable = true)
    protected Double cve__OverpaymentBeforeTax__C;
    @XmlElement(name = "cve__OverpaymentLastCalculated__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__OverpaymentLastCalculated__C;
    @XmlElement(name = "cve__OverpaymentNet__c", nillable = true)
    protected Double cve__OverpaymentNet__C;
    @XmlElement(name = "cve__PaidDays__c", nillable = true)
    protected Double cve__PaidDays__C;
    @XmlElement(name = "cve__PaidStart__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PaidStart__C;
    @XmlElement(name = "cve__PaidThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PaidThrough__C;
    @XmlElement(name = "cve__PaidWeekDays__c", nillable = true)
    protected Double cve__PaidWeekDays__C;
    @XmlElement(name = "cve__Paraplegia__c", nillable = true)
    protected Boolean cve__Paraplegia__C;
    @XmlElement(name = "cve__PaymentSchedule__c", nillable = true)
    protected String cve__PaymentSchedule__C;
    @XmlElement(name = "cve__PaymentSchedule__r", nillable = true)
    protected Cve__PaymentSchedule__C cve__PaymentSchedule__R;
    @XmlElement(name = "cve__PaymentSpecifications__r", nillable = true)
    protected QueryResultType cve__PaymentSpecifications__R;
    @XmlElement(name = "cve__Policy__c", nillable = true)
    protected String cve__Policy__C;
    @XmlElement(name = "cve__Policy__r", nillable = true)
    protected Cve__Policy__C cve__Policy__R;
    @XmlElement(name = "cve__PremiumPeriod__c", nillable = true)
    protected String cve__PremiumPeriod__C;
    @XmlElement(name = "cve__PremiumsPaidThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PremiumsPaidThrough__C;
    @XmlElement(name = "cve__ProofOfLoss__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__ProofOfLoss__C;
    @XmlElement(name = "cve__Quadriplegia__c", nillable = true)
    protected Boolean cve__Quadriplegia__C;
    @XmlElement(name = "cve__ReapprovedDate__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__ReapprovedDate__C;
    @XmlElement(name = "cve__Reapproved__c", nillable = true)
    protected Boolean cve__Reapproved__C;
    @XmlElement(name = "cve__RecordTypeName__c", nillable = true)
    protected String cve__RecordTypeName__C;
    @XmlElement(name = "cve__RehabilitationMaximum__c", nillable = true)
    protected Double cve__RehabilitationMaximum__C;
    @XmlElement(name = "cve__RepatriationMaximum__c", nillable = true)
    protected Double cve__RepatriationMaximum__C;
    @XmlElement(name = "cve__SeatBeltApplicable__c", nillable = true)
    protected Boolean cve__SeatBeltApplicable__C;
    @XmlElement(name = "cve__SeatBeltDecision__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__SeatBeltDecision__C;
    @XmlElement(name = "cve__SeatBeltDenied__c", nillable = true)
    protected Boolean cve__SeatBeltDenied__C;
    @XmlElement(name = "cve__SightInBothEyes__c", nillable = true)
    protected Boolean cve__SightInBothEyes__C;
    @XmlElement(name = "cve__SightInOneEyeLoss__c", nillable = true)
    protected Boolean cve__SightInOneEyeLoss__C;
    @XmlElement(name = "cve__SpeechAndHearingInBothEars__c", nillable = true)
    protected Boolean cve__SpeechAndHearingInBothEars__C;
    @XmlElement(name = "cve__SpeechOrHearingInBothEars__c", nillable = true)
    protected Boolean cve__SpeechOrHearingInBothEars__C;
    @XmlElement(name = "cve__SpouseEducationMaximum__c", nillable = true)
    protected Double cve__SpouseEducationMaximum__C;
    @XmlElement(name = "cve__Start__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Start__C;
    @XmlElement(name = "cve__StatusForApproval__c", nillable = true)
    protected String cve__StatusForApproval__C;
    @XmlElement(name = "cve__StatusReason__c", nillable = true)
    protected String cve__StatusReason__C;
    @XmlElement(name = "cve__StatusReasons__c", nillable = true)
    protected String cve__StatusReasons__C;
    @XmlElement(name = "cve__Status__c", nillable = true)
    protected String cve__Status__C;
    @XmlElement(name = "cve__SubmittedCoverageAmount__c", nillable = true)
    protected Double cve__SubmittedCoverageAmount__C;
    @XmlElement(name = "cve__SubmittedCoveragePercentage__c", nillable = true)
    protected Double cve__SubmittedCoveragePercentage__C;
    @XmlElement(name = "cve__TherapeuticCounselingMaximum__c", nillable = true)
    protected Double cve__TherapeuticCounselingMaximum__C;
    @XmlElement(name = "cve__ThumbAndIndexFingerOfEitherHand__c", nillable = true)
    protected Boolean cve__ThumbAndIndexFingerOfEitherHand__C;
    @XmlElement(name = "cve__ToBeIncurredBeforeTax__c", nillable = true)
    protected Double cve__ToBeIncurredBeforeTax__C;
    @XmlElement(name = "cve__ToBeIncurredLastCalculated__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__ToBeIncurredLastCalculated__C;
    @XmlElement(name = "cve__ToBeIncurredNet__c", nillable = true)
    protected Double cve__ToBeIncurredNet__C;
    @XmlElement(name = "cve__TollingAsOf__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__TollingAsOf__C;
    @XmlElement(name = "cve__TollingPeriods__r", nillable = true)
    protected QueryResultType cve__TollingPeriods__R;
    @XmlElement(name = "cve__TotalAdaptiveHomeVehicleBenefit__c", nillable = true)
    protected Double cve__TotalAdaptiveHomeVehicleBenefit__C;
    @XmlElement(name = "cve__TotalCareerAdjustmentBenefit__c", nillable = true)
    protected Double cve__TotalCareerAdjustmentBenefit__C;
    @XmlElement(name = "cve__TotalChildCareBenefit__c", nillable = true)
    protected Double cve__TotalChildCareBenefit__C;
    @XmlElement(name = "cve__TotalChildEducationBenefit__c", nillable = true)
    protected Double cve__TotalChildEducationBenefit__C;
    @XmlElement(name = "cve__TotalComaBenefit__c", nillable = true)
    protected Double cve__TotalComaBenefit__C;
    @XmlElement(name = "cve__TotalContribution__c", nillable = true)
    protected Double cve__TotalContribution__C;
    @XmlElement(name = "cve__TotalCriticalBurnBenefit__c", nillable = true)
    protected Double cve__TotalCriticalBurnBenefit__C;
    @XmlElement(name = "cve__TotalDayCareBenefit__c", nillable = true)
    protected Double cve__TotalDayCareBenefit__C;
    @XmlElement(name = "cve__TotalDoubleIndemnityCommonCarrierBenefit__c", nillable = true)
    protected Double cve__TotalDoubleIndemnityCommonCarrierBenefit__C;
    @XmlElement(name = "cve__TotalFeloniousAssaultBenefit__c", nillable = true)
    protected Double cve__TotalFeloniousAssaultBenefit__C;
    @XmlElement(name = "cve__TotalHigherEducationBenefit__c", nillable = true)
    protected Double cve__TotalHigherEducationBenefit__C;
    @XmlElement(name = "cve__TotalIncurredAsOf__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__TotalIncurredAsOf__C;
    @XmlElement(name = "cve__TotalIncurredNet__c", nillable = true)
    protected Double cve__TotalIncurredNet__C;
    @XmlElement(name = "cve__TotalIncurred__c", nillable = true)
    protected Double cve__TotalIncurred__C;
    @XmlElement(name = "cve__TotalLiabilityAsOf__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__TotalLiabilityAsOf__C;
    @XmlElement(name = "cve__TotalLiabilityNet__c", nillable = true)
    protected Double cve__TotalLiabilityNet__C;
    @XmlElement(name = "cve__TotalLiability__c", nillable = true)
    protected Double cve__TotalLiability__C;
    @XmlElement(name = "cve__TotalPaidDays__c", nillable = true)
    protected Double cve__TotalPaidDays__C;
    @XmlElement(name = "cve__TotalPremiumPaid__c", nillable = true)
    protected Double cve__TotalPremiumPaid__C;
    @XmlElement(name = "cve__TotalRehabilitationBenefit__c", nillable = true)
    protected Double cve__TotalRehabilitationBenefit__C;
    @XmlElement(name = "cve__TotalRepatriationBenefit__c", nillable = true)
    protected Double cve__TotalRepatriationBenefit__C;
    @XmlElement(name = "cve__TotalSpouseEducationBenefit__c", nillable = true)
    protected Double cve__TotalSpouseEducationBenefit__C;
    @XmlElement(name = "cve__TotalTherapeuticCounselingBenefit__c", nillable = true)
    protected Double cve__TotalTherapeuticCounselingBenefit__C;
    @XmlElement(name = "cve__TotalToBeIncurredAsOf__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__TotalToBeIncurredAsOf__C;
    @XmlElement(name = "cve__TotalToBeIncurredNet__c", nillable = true)
    protected Double cve__TotalToBeIncurredNet__C;
    @XmlElement(name = "cve__TotalToBeIncurred__c", nillable = true)
    protected Double cve__TotalToBeIncurred__C;
    @XmlElement(name = "cve__Triplegia__c", nillable = true)
    protected Boolean cve__Triplegia__C;
    @XmlElement(name = "cve__TurnAroundTime__c", nillable = true)
    protected Double cve__TurnAroundTime__C;
    @XmlElement(name = "cve__TwoOrMoreLosses__c", nillable = true)
    protected Boolean cve__TwoOrMoreLosses__C;
    @XmlElement(name = "cve__Uniplegia__c", nillable = true)
    protected Boolean cve__Uniplegia__C;
    @XmlElement(name = "cve__WopTermination__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__WopTermination__C;
    @XmlElement(name = "cve__YearsOfServiceAtDod__c", nillable = true)
    protected Double cve__YearsOfServiceAtDod__C;

    /**
     * Gets the value of the activityHistories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getActivityHistories() {
        return activityHistories;
    }

    /**
     * Sets the value of the activityHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setActivityHistories(QueryResultType value) {
        this.activityHistories = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setAttachments(QueryResultType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the combinedAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCombinedAttachments() {
        return combinedAttachments;
    }

    /**
     * Sets the value of the combinedAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCombinedAttachments(QueryResultType value) {
        this.combinedAttachments = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreatedBy(User value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedById(String value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setEvents(QueryResultType value) {
        this.events = value;
    }

    /**
     * Gets the value of the histories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getHistories() {
        return histories;
    }

    /**
     * Sets the value of the histories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setHistories(QueryResultType value) {
        this.histories = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActivityDate(XMLGregorianCalendar value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setLastModifiedBy(User value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedById(String value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the lastReferencedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the value of the lastReferencedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReferencedDate(XMLGregorianCalendar value) {
        this.lastReferencedDate = value;
    }

    /**
     * Gets the value of the lastViewedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the value of the lastViewedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastViewedDate(XMLGregorianCalendar value) {
        this.lastViewedDate = value;
    }

    /**
     * Gets the value of the lookedUpFromActivities property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }

    /**
     * Sets the value of the lookedUpFromActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setLookedUpFromActivities(QueryResultType value) {
        this.lookedUpFromActivities = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setNotes(QueryResultType value) {
        this.notes = value;
    }

    /**
     * Gets the value of the notesAndAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getNotesAndAttachments() {
        return notesAndAttachments;
    }

    /**
     * Sets the value of the notesAndAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setNotesAndAttachments(QueryResultType value) {
        this.notesAndAttachments = value;
    }

    /**
     * Gets the value of the openActivities property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getOpenActivities() {
        return openActivities;
    }

    /**
     * Sets the value of the openActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setOpenActivities(QueryResultType value) {
        this.openActivities = value;
    }

    /**
     * Gets the value of the processInstances property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getProcessInstances() {
        return processInstances;
    }

    /**
     * Sets the value of the processInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setProcessInstances(QueryResultType value) {
        this.processInstances = value;
    }

    /**
     * Gets the value of the processSteps property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getProcessSteps() {
        return processSteps;
    }

    /**
     * Sets the value of the processSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setProcessSteps(QueryResultType value) {
        this.processSteps = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setRecordType(RecordType value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemModstamp(XMLGregorianCalendar value) {
        this.systemModstamp = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setTasks(QueryResultType value) {
        this.tasks = value;
    }

    /**
     * Gets the value of the topicAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getTopicAssignments() {
        return topicAssignments;
    }

    /**
     * Sets the value of the topicAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setTopicAssignments(QueryResultType value) {
        this.topicAssignments = value;
    }

    /**
     * Gets the value of the userRecordAccess property.
     * 
     * @return
     *     possible object is
     *     {@link UserRecordAccess }
     *     
     */
    public UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }

    /**
     * Sets the value of the userRecordAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRecordAccess }
     *     
     */
    public void setUserRecordAccess(UserRecordAccess value) {
        this.userRecordAccess = value;
    }

    /**
     * Gets the value of the cve__AccumulatedDividendAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AccumulatedDividendAmount__C() {
        return cve__AccumulatedDividendAmount__C;
    }

    /**
     * Sets the value of the cve__AccumulatedDividendAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AccumulatedDividendAmount__C(Double value) {
        this.cve__AccumulatedDividendAmount__C = value;
    }

    /**
     * Gets the value of the cve__AdaptiveHomeVehicleMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdaptiveHomeVehicleMaximum__C() {
        return cve__AdaptiveHomeVehicleMaximum__C;
    }

    /**
     * Sets the value of the cve__AdaptiveHomeVehicleMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdaptiveHomeVehicleMaximum__C(Double value) {
        this.cve__AdaptiveHomeVehicleMaximum__C = value;
    }

    /**
     * Gets the value of the cve__AdjustedBenefitStart__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__AdjustedBenefitStart__C() {
        return cve__AdjustedBenefitStart__C;
    }

    /**
     * Sets the value of the cve__AdjustedBenefitStart__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__AdjustedBenefitStart__C(XMLGregorianCalendar value) {
        this.cve__AdjustedBenefitStart__C = value;
    }

    /**
     * Gets the value of the cve__AdjustedBenefitThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__AdjustedBenefitThrough__C() {
        return cve__AdjustedBenefitThrough__C;
    }

    /**
     * Sets the value of the cve__AdjustedBenefitThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__AdjustedBenefitThrough__C(XMLGregorianCalendar value) {
        this.cve__AdjustedBenefitThrough__C = value;
    }

    /**
     * Gets the value of the cve__AgeAtDateOfDeath__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AgeAtDateOfDeath__C() {
        return cve__AgeAtDateOfDeath__C;
    }

    /**
     * Sets the value of the cve__AgeAtDateOfDeath__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AgeAtDateOfDeath__C(Double value) {
        this.cve__AgeAtDateOfDeath__C = value;
    }

    /**
     * Gets the value of the cve__AgeAtDateOfDiagnosis__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AgeAtDateOfDiagnosis__C() {
        return cve__AgeAtDateOfDiagnosis__C;
    }

    /**
     * Sets the value of the cve__AgeAtDateOfDiagnosis__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AgeAtDateOfDiagnosis__C(Double value) {
        this.cve__AgeAtDateOfDiagnosis__C = value;
    }

    /**
     * Gets the value of the cve__AgeAtDod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AgeAtDod__C() {
        return cve__AgeAtDod__C;
    }

    /**
     * Sets the value of the cve__AgeAtDod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AgeAtDod__C(Double value) {
        this.cve__AgeAtDod__C = value;
    }

    /**
     * Gets the value of the cve__AgeInMonthsAtDod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AgeInMonthsAtDod__C() {
        return cve__AgeInMonthsAtDod__C;
    }

    /**
     * Sets the value of the cve__AgeInMonthsAtDod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AgeInMonthsAtDod__C(Double value) {
        this.cve__AgeInMonthsAtDod__C = value;
    }

    /**
     * Gets the value of the cve__AirBagApplicable__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AirBagApplicable__C() {
        return cve__AirBagApplicable__C;
    }

    /**
     * Sets the value of the cve__AirBagApplicable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AirBagApplicable__C(Boolean value) {
        this.cve__AirBagApplicable__C = value;
    }

    /**
     * Gets the value of the cve__AirBagDecision__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__AirBagDecision__C() {
        return cve__AirBagDecision__C;
    }

    /**
     * Sets the value of the cve__AirBagDecision__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__AirBagDecision__C(XMLGregorianCalendar value) {
        this.cve__AirBagDecision__C = value;
    }

    /**
     * Gets the value of the cve__AirBagDenied__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AirBagDenied__C() {
        return cve__AirBagDenied__C;
    }

    /**
     * Sets the value of the cve__AirBagDenied__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AirBagDenied__C(Boolean value) {
        this.cve__AirBagDenied__C = value;
    }

    /**
     * Gets the value of the cve__AnticipatedRecovery__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__AnticipatedRecovery__C() {
        return cve__AnticipatedRecovery__C;
    }

    /**
     * Sets the value of the cve__AnticipatedRecovery__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__AnticipatedRecovery__C(XMLGregorianCalendar value) {
        this.cve__AnticipatedRecovery__C = value;
    }

    /**
     * Gets the value of the cve__BenefitAmountPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitAmountPeriod__C() {
        return cve__BenefitAmountPeriod__C;
    }

    /**
     * Sets the value of the cve__BenefitAmountPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitAmountPeriod__C(String value) {
        this.cve__BenefitAmountPeriod__C = value;
    }

    /**
     * Gets the value of the cve__BenefitAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__BenefitAmount__C() {
        return cve__BenefitAmount__C;
    }

    /**
     * Sets the value of the cve__BenefitAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__BenefitAmount__C(Double value) {
        this.cve__BenefitAmount__C = value;
    }

    /**
     * Gets the value of the cve__BenefitStart__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__BenefitStart__C() {
        return cve__BenefitStart__C;
    }

    /**
     * Sets the value of the cve__BenefitStart__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__BenefitStart__C(XMLGregorianCalendar value) {
        this.cve__BenefitStart__C = value;
    }

    /**
     * Gets the value of the cve__BenefitThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__BenefitThrough__C() {
        return cve__BenefitThrough__C;
    }

    /**
     * Sets the value of the cve__BenefitThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__BenefitThrough__C(XMLGregorianCalendar value) {
        this.cve__BenefitThrough__C = value;
    }

    /**
     * Gets the value of the cve__Benefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Benefit__C() {
        return cve__Benefit__C;
    }

    /**
     * Sets the value of the cve__Benefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Benefit__C(String value) {
        this.cve__Benefit__C = value;
    }

    /**
     * Gets the value of the cve__Benefit__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Benefit__C }
     *     
     */
    public Cve__Benefit__C getCve__Benefit__R() {
        return cve__Benefit__R;
    }

    /**
     * Sets the value of the cve__Benefit__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Benefit__C }
     *     
     */
    public void setCve__Benefit__R(Cve__Benefit__C value) {
        this.cve__Benefit__R = value;
    }

    /**
     * Gets the value of the cve__BothFeet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__BothFeet__C() {
        return cve__BothFeet__C;
    }

    /**
     * Sets the value of the cve__BothFeet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__BothFeet__C(Boolean value) {
        this.cve__BothFeet__C = value;
    }

    /**
     * Gets the value of the cve__BothHands__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__BothHands__C() {
        return cve__BothHands__C;
    }

    /**
     * Sets the value of the cve__BothHands__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__BothHands__C(Boolean value) {
        this.cve__BothHands__C = value;
    }

    /**
     * Gets the value of the cve__CareerAdjustmentMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CareerAdjustmentMaximum__C() {
        return cve__CareerAdjustmentMaximum__C;
    }

    /**
     * Sets the value of the cve__CareerAdjustmentMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CareerAdjustmentMaximum__C(Double value) {
        this.cve__CareerAdjustmentMaximum__C = value;
    }

    /**
     * Gets the value of the cve__Cause__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Cause__C() {
        return cve__Cause__C;
    }

    /**
     * Sets the value of the cve__Cause__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Cause__C(String value) {
        this.cve__Cause__C = value;
    }

    /**
     * Gets the value of the cve__CertifiedThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__CertifiedThrough__C() {
        return cve__CertifiedThrough__C;
    }

    /**
     * Sets the value of the cve__CertifiedThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__CertifiedThrough__C(XMLGregorianCalendar value) {
        this.cve__CertifiedThrough__C = value;
    }

    /**
     * Gets the value of the cve__ChildCareMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildCareMaximum__C() {
        return cve__ChildCareMaximum__C;
    }

    /**
     * Sets the value of the cve__ChildCareMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildCareMaximum__C(Double value) {
        this.cve__ChildCareMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ChildEducationMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildEducationMaximum__C() {
        return cve__ChildEducationMaximum__C;
    }

    /**
     * Sets the value of the cve__ChildEducationMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildEducationMaximum__C(Double value) {
        this.cve__ChildEducationMaximum__C = value;
    }

    /**
     * Gets the value of the cve__Claim__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Claim__C() {
        return cve__Claim__C;
    }

    /**
     * Sets the value of the cve__Claim__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Claim__C(String value) {
        this.cve__Claim__C = value;
    }

    /**
     * Gets the value of the cve__Claim__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Claim__C }
     *     
     */
    public Cve__Claim__C getCve__Claim__R() {
        return cve__Claim__R;
    }

    /**
     * Sets the value of the cve__Claim__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Claim__C }
     *     
     */
    public void setCve__Claim__R(Cve__Claim__C value) {
        this.cve__Claim__R = value;
    }

    /**
     * Gets the value of the cve__ClaimantInsuredAccountName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimantInsuredAccountName__C() {
        return cve__ClaimantInsuredAccountName__C;
    }

    /**
     * Sets the value of the cve__ClaimantInsuredAccountName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimantInsuredAccountName__C(String value) {
        this.cve__ClaimantInsuredAccountName__C = value;
    }

    /**
     * Gets the value of the cve__ClaimantInsuredAccount__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimantInsuredAccount__C() {
        return cve__ClaimantInsuredAccount__C;
    }

    /**
     * Sets the value of the cve__ClaimantInsuredAccount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimantInsuredAccount__C(String value) {
        this.cve__ClaimantInsuredAccount__C = value;
    }

    /**
     * Gets the value of the cve__ClaimantInsuredAccount__R property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCve__ClaimantInsuredAccount__R() {
        return cve__ClaimantInsuredAccount__R;
    }

    /**
     * Sets the value of the cve__ClaimantInsuredAccount__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCve__ClaimantInsuredAccount__R(Account value) {
        this.cve__ClaimantInsuredAccount__R = value;
    }

    /**
     * Gets the value of the cve__ClaimantInsuredName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimantInsuredName__C() {
        return cve__ClaimantInsuredName__C;
    }

    /**
     * Sets the value of the cve__ClaimantInsuredName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimantInsuredName__C(String value) {
        this.cve__ClaimantInsuredName__C = value;
    }

    /**
     * Gets the value of the cve__ClaimantInsured__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimantInsured__C() {
        return cve__ClaimantInsured__C;
    }

    /**
     * Sets the value of the cve__ClaimantInsured__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimantInsured__C(String value) {
        this.cve__ClaimantInsured__C = value;
    }

    /**
     * Gets the value of the cve__ClaimantInsured__R property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getCve__ClaimantInsured__R() {
        return cve__ClaimantInsured__R;
    }

    /**
     * Sets the value of the cve__ClaimantInsured__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setCve__ClaimantInsured__R(Contact value) {
        this.cve__ClaimantInsured__R = value;
    }

    /**
     * Gets the value of the cve__ComaMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ComaMaximum__C() {
        return cve__ComaMaximum__C;
    }

    /**
     * Sets the value of the cve__ComaMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ComaMaximum__C(Double value) {
        this.cve__ComaMaximum__C = value;
    }

    /**
     * Gets the value of the cve__CoverageAmountAsOf__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__CoverageAmountAsOf__C() {
        return cve__CoverageAmountAsOf__C;
    }

    /**
     * Sets the value of the cve__CoverageAmountAsOf__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__CoverageAmountAsOf__C(XMLGregorianCalendar value) {
        this.cve__CoverageAmountAsOf__C = value;
    }

    /**
     * Gets the value of the cve__CoverageAmountRemaining__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CoverageAmountRemaining__C() {
        return cve__CoverageAmountRemaining__C;
    }

    /**
     * Sets the value of the cve__CoverageAmountRemaining__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CoverageAmountRemaining__C(Double value) {
        this.cve__CoverageAmountRemaining__C = value;
    }

    /**
     * Gets the value of the cve__CoverageAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CoverageAmount__C() {
        return cve__CoverageAmount__C;
    }

    /**
     * Sets the value of the cve__CoverageAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CoverageAmount__C(Double value) {
        this.cve__CoverageAmount__C = value;
    }

    /**
     * Gets the value of the cve__CoveragesClaimed__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__CoveragesClaimed__R() {
        return cve__CoveragesClaimed__R;
    }

    /**
     * Sets the value of the cve__CoveragesClaimed__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__CoveragesClaimed__R(QueryResultType value) {
        this.cve__CoveragesClaimed__R = value;
    }

    /**
     * Gets the value of the cve__CriticalBurnMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CriticalBurnMaximum__C() {
        return cve__CriticalBurnMaximum__C;
    }

    /**
     * Sets the value of the cve__CriticalBurnMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CriticalBurnMaximum__C(Double value) {
        this.cve__CriticalBurnMaximum__C = value;
    }

    /**
     * Gets the value of the cve__CurrentAccountValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CurrentAccountValue__C() {
        return cve__CurrentAccountValue__C;
    }

    /**
     * Sets the value of the cve__CurrentAccountValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CurrentAccountValue__C(Double value) {
        this.cve__CurrentAccountValue__C = value;
    }

    /**
     * Gets the value of the cve__DateOfAccident__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfAccident__C() {
        return cve__DateOfAccident__C;
    }

    /**
     * Sets the value of the cve__DateOfAccident__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfAccident__C(XMLGregorianCalendar value) {
        this.cve__DateOfAccident__C = value;
    }

    /**
     * Gets the value of the cve__DateOfDeath__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfDeath__C() {
        return cve__DateOfDeath__C;
    }

    /**
     * Sets the value of the cve__DateOfDeath__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfDeath__C(XMLGregorianCalendar value) {
        this.cve__DateOfDeath__C = value;
    }

    /**
     * Gets the value of the cve__DateOfDiagnosis__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfDiagnosis__C() {
        return cve__DateOfDiagnosis__C;
    }

    /**
     * Sets the value of the cve__DateOfDiagnosis__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfDiagnosis__C(XMLGregorianCalendar value) {
        this.cve__DateOfDiagnosis__C = value;
    }

    /**
     * Gets the value of the cve__DateOfDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfDisability__C() {
        return cve__DateOfDisability__C;
    }

    /**
     * Sets the value of the cve__DateOfDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfDisability__C(XMLGregorianCalendar value) {
        this.cve__DateOfDisability__C = value;
    }

    /**
     * Gets the value of the cve__DateOfLoss__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfLoss__C() {
        return cve__DateOfLoss__C;
    }

    /**
     * Sets the value of the cve__DateOfLoss__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfLoss__C(XMLGregorianCalendar value) {
        this.cve__DateOfLoss__C = value;
    }

    /**
     * Gets the value of the cve__DateOfMaturity__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfMaturity__C() {
        return cve__DateOfMaturity__C;
    }

    /**
     * Sets the value of the cve__DateOfMaturity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfMaturity__C(XMLGregorianCalendar value) {
        this.cve__DateOfMaturity__C = value;
    }

    /**
     * Gets the value of the cve__DateReceived__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateReceived__C() {
        return cve__DateReceived__C;
    }

    /**
     * Sets the value of the cve__DateReceived__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateReceived__C(XMLGregorianCalendar value) {
        this.cve__DateReceived__C = value;
    }

    /**
     * Gets the value of the cve__DayCareMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DayCareMaximum__C() {
        return cve__DayCareMaximum__C;
    }

    /**
     * Sets the value of the cve__DayCareMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DayCareMaximum__C(Double value) {
        this.cve__DayCareMaximum__C = value;
    }

    /**
     * Gets the value of the cve__DaysPending__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DaysPending__C() {
        return cve__DaysPending__C;
    }

    /**
     * Sets the value of the cve__DaysPending__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DaysPending__C(Double value) {
        this.cve__DaysPending__C = value;
    }

    /**
     * Gets the value of the cve__DaysTolling__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DaysTolling__C() {
        return cve__DaysTolling__C;
    }

    /**
     * Sets the value of the cve__DaysTolling__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DaysTolling__C(Double value) {
        this.cve__DaysTolling__C = value;
    }

    /**
     * Gets the value of the cve__DeathNotification__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DeathNotification__C() {
        return cve__DeathNotification__C;
    }

    /**
     * Sets the value of the cve__DeathNotification__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DeathNotification__C(XMLGregorianCalendar value) {
        this.cve__DeathNotification__C = value;
    }

    /**
     * Gets the value of the cve__DecisionTurnAroundDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DecisionTurnAroundDays__C() {
        return cve__DecisionTurnAroundDays__C;
    }

    /**
     * Sets the value of the cve__DecisionTurnAroundDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DecisionTurnAroundDays__C(Double value) {
        this.cve__DecisionTurnAroundDays__C = value;
    }

    /**
     * Gets the value of the cve__DefinitionOfDisabilityChange__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DefinitionOfDisabilityChange__C() {
        return cve__DefinitionOfDisabilityChange__C;
    }

    /**
     * Sets the value of the cve__DefinitionOfDisabilityChange__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DefinitionOfDisabilityChange__C(XMLGregorianCalendar value) {
        this.cve__DefinitionOfDisabilityChange__C = value;
    }

    /**
     * Gets the value of the cve__DismembermentAndLoss__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DismembermentAndLoss__C() {
        return cve__DismembermentAndLoss__C;
    }

    /**
     * Sets the value of the cve__DismembermentAndLoss__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DismembermentAndLoss__C(Boolean value) {
        this.cve__DismembermentAndLoss__C = value;
    }

    /**
     * Gets the value of the cve__Documents__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Documents__R() {
        return cve__Documents__R;
    }

    /**
     * Sets the value of the cve__Documents__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Documents__R(QueryResultType value) {
        this.cve__Documents__R = value;
    }

    /**
     * Gets the value of the cve__DoubleIndemnityCommonCarrierMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DoubleIndemnityCommonCarrierMaximum__C() {
        return cve__DoubleIndemnityCommonCarrierMaximum__C;
    }

    /**
     * Sets the value of the cve__DoubleIndemnityCommonCarrierMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DoubleIndemnityCommonCarrierMaximum__C(Double value) {
        this.cve__DoubleIndemnityCommonCarrierMaximum__C = value;
    }

    /**
     * Gets the value of the cve__EffectiveDateOfCoverage__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__EffectiveDateOfCoverage__C() {
        return cve__EffectiveDateOfCoverage__C;
    }

    /**
     * Sets the value of the cve__EffectiveDateOfCoverage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__EffectiveDateOfCoverage__C(XMLGregorianCalendar value) {
        this.cve__EffectiveDateOfCoverage__C = value;
    }

    /**
     * Gets the value of the cve__EitherHandOrFootAndSightInOneEye__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__EitherHandOrFootAndSightInOneEye__C() {
        return cve__EitherHandOrFootAndSightInOneEye__C;
    }

    /**
     * Sets the value of the cve__EitherHandOrFootAndSightInOneEye__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__EitherHandOrFootAndSightInOneEye__C(Boolean value) {
        this.cve__EitherHandOrFootAndSightInOneEye__C = value;
    }

    /**
     * Gets the value of the cve__EmployeeContributionPostTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeeContributionPostTax__C() {
        return cve__EmployeeContributionPostTax__C;
    }

    /**
     * Sets the value of the cve__EmployeeContributionPostTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeeContributionPostTax__C(Double value) {
        this.cve__EmployeeContributionPostTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployeeContributionPreTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeeContributionPreTax__C() {
        return cve__EmployeeContributionPreTax__C;
    }

    /**
     * Sets the value of the cve__EmployeeContributionPreTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeeContributionPreTax__C(Double value) {
        this.cve__EmployeeContributionPreTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployeePremiumPaidPostTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeePremiumPaidPostTax__C() {
        return cve__EmployeePremiumPaidPostTax__C;
    }

    /**
     * Sets the value of the cve__EmployeePremiumPaidPostTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeePremiumPaidPostTax__C(Double value) {
        this.cve__EmployeePremiumPaidPostTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployeePremiumPaidPreTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeePremiumPaidPreTax__C() {
        return cve__EmployeePremiumPaidPreTax__C;
    }

    /**
     * Sets the value of the cve__EmployeePremiumPaidPreTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeePremiumPaidPreTax__C(Double value) {
        this.cve__EmployeePremiumPaidPreTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployerContributionPostTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerContributionPostTax__C() {
        return cve__EmployerContributionPostTax__C;
    }

    /**
     * Sets the value of the cve__EmployerContributionPostTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerContributionPostTax__C(Double value) {
        this.cve__EmployerContributionPostTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployerContributionPreTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerContributionPreTax__C() {
        return cve__EmployerContributionPreTax__C;
    }

    /**
     * Sets the value of the cve__EmployerContributionPreTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerContributionPreTax__C(Double value) {
        this.cve__EmployerContributionPreTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployerPremiumPaidPostTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerPremiumPaidPostTax__C() {
        return cve__EmployerPremiumPaidPostTax__C;
    }

    /**
     * Sets the value of the cve__EmployerPremiumPaidPostTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerPremiumPaidPostTax__C(Double value) {
        this.cve__EmployerPremiumPaidPostTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployerPremiumPaidPreTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerPremiumPaidPreTax__C() {
        return cve__EmployerPremiumPaidPreTax__C;
    }

    /**
     * Sets the value of the cve__EmployerPremiumPaidPreTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerPremiumPaidPreTax__C(Double value) {
        this.cve__EmployerPremiumPaidPreTax__C = value;
    }

    /**
     * Gets the value of the cve__Explanation2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Explanation2__C() {
        return cve__Explanation2__C;
    }

    /**
     * Sets the value of the cve__Explanation2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Explanation2__C(String value) {
        this.cve__Explanation2__C = value;
    }

    /**
     * Gets the value of the cve__Explanation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Explanation__C() {
        return cve__Explanation__C;
    }

    /**
     * Sets the value of the cve__Explanation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Explanation__C(String value) {
        this.cve__Explanation__C = value;
    }

    /**
     * Gets the value of the cve__FeloniousAssaultMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__FeloniousAssaultMaximum__C() {
        return cve__FeloniousAssaultMaximum__C;
    }

    /**
     * Sets the value of the cve__FeloniousAssaultMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__FeloniousAssaultMaximum__C(Double value) {
        this.cve__FeloniousAssaultMaximum__C = value;
    }

    /**
     * Gets the value of the cve__FirstNotified__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__FirstNotified__C() {
        return cve__FirstNotified__C;
    }

    /**
     * Sets the value of the cve__FirstNotified__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__FirstNotified__C(XMLGregorianCalendar value) {
        this.cve__FirstNotified__C = value;
    }

    /**
     * Gets the value of the cve__Hemiplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Hemiplegia__C() {
        return cve__Hemiplegia__C;
    }

    /**
     * Sets the value of the cve__Hemiplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Hemiplegia__C(Boolean value) {
        this.cve__Hemiplegia__C = value;
    }

    /**
     * Gets the value of the cve__HigherEducationMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HigherEducationMaximum__C() {
        return cve__HigherEducationMaximum__C;
    }

    /**
     * Sets the value of the cve__HigherEducationMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HigherEducationMaximum__C(Double value) {
        this.cve__HigherEducationMaximum__C = value;
    }

    /**
     * Gets the value of the cve__HospitalEndDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__HospitalEndDate__C() {
        return cve__HospitalEndDate__C;
    }

    /**
     * Sets the value of the cve__HospitalEndDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__HospitalEndDate__C(XMLGregorianCalendar value) {
        this.cve__HospitalEndDate__C = value;
    }

    /**
     * Gets the value of the cve__HospitalName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__HospitalName__C() {
        return cve__HospitalName__C;
    }

    /**
     * Sets the value of the cve__HospitalName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__HospitalName__C(String value) {
        this.cve__HospitalName__C = value;
    }

    /**
     * Gets the value of the cve__HospitalStartDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__HospitalStartDate__C() {
        return cve__HospitalStartDate__C;
    }

    /**
     * Sets the value of the cve__HospitalStartDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__HospitalStartDate__C(XMLGregorianCalendar value) {
        this.cve__HospitalStartDate__C = value;
    }

    /**
     * Gets the value of the cve__HospitalState__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__HospitalState__C() {
        return cve__HospitalState__C;
    }

    /**
     * Sets the value of the cve__HospitalState__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__HospitalState__C(String value) {
        this.cve__HospitalState__C = value;
    }

    /**
     * Gets the value of the cve__IncurredBeforeTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__IncurredBeforeTax__C() {
        return cve__IncurredBeforeTax__C;
    }

    /**
     * Sets the value of the cve__IncurredBeforeTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__IncurredBeforeTax__C(Double value) {
        this.cve__IncurredBeforeTax__C = value;
    }

    /**
     * Gets the value of the cve__IncurredLastCalculated__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__IncurredLastCalculated__C() {
        return cve__IncurredLastCalculated__C;
    }

    /**
     * Sets the value of the cve__IncurredLastCalculated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__IncurredLastCalculated__C(XMLGregorianCalendar value) {
        this.cve__IncurredLastCalculated__C = value;
    }

    /**
     * Gets the value of the cve__IncurredNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__IncurredNet__C() {
        return cve__IncurredNet__C;
    }

    /**
     * Sets the value of the cve__IncurredNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__IncurredNet__C(Double value) {
        this.cve__IncurredNet__C = value;
    }

    /**
     * Gets the value of the cve__InitialApprovedDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__InitialApprovedDate__C() {
        return cve__InitialApprovedDate__C;
    }

    /**
     * Sets the value of the cve__InitialApprovedDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__InitialApprovedDate__C(XMLGregorianCalendar value) {
        this.cve__InitialApprovedDate__C = value;
    }

    /**
     * Gets the value of the cve__InitialAssignment__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__InitialAssignment__C() {
        return cve__InitialAssignment__C;
    }

    /**
     * Sets the value of the cve__InitialAssignment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__InitialAssignment__C(XMLGregorianCalendar value) {
        this.cve__InitialAssignment__C = value;
    }

    /**
     * Gets the value of the cve__InitialContributionAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__InitialContributionAmount__C() {
        return cve__InitialContributionAmount__C;
    }

    /**
     * Sets the value of the cve__InitialContributionAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__InitialContributionAmount__C(Double value) {
        this.cve__InitialContributionAmount__C = value;
    }

    /**
     * Gets the value of the cve__InitialDecision__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__InitialDecision__C() {
        return cve__InitialDecision__C;
    }

    /**
     * Sets the value of the cve__InitialDecision__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__InitialDecision__C(XMLGregorianCalendar value) {
        this.cve__InitialDecision__C = value;
    }

    /**
     * Gets the value of the cve__InsuredRelationshipToPolicyholder__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__InsuredRelationshipToPolicyholder__C() {
        return cve__InsuredRelationshipToPolicyholder__C;
    }

    /**
     * Sets the value of the cve__InsuredRelationshipToPolicyholder__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__InsuredRelationshipToPolicyholder__C(String value) {
        this.cve__InsuredRelationshipToPolicyholder__C = value;
    }

    /**
     * Gets the value of the cve__Journals__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Journals__R() {
        return cve__Journals__R;
    }

    /**
     * Sets the value of the cve__Journals__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Journals__R(QueryResultType value) {
        this.cve__Journals__R = value;
    }

    /**
     * Gets the value of the cve__LastModified__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LastModified__C() {
        return cve__LastModified__C;
    }

    /**
     * Sets the value of the cve__LastModified__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LastModified__C(XMLGregorianCalendar value) {
        this.cve__LastModified__C = value;
    }

    /**
     * Gets the value of the cve__LastReinstatementApproval__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LastReinstatementApproval__C() {
        return cve__LastReinstatementApproval__C;
    }

    /**
     * Sets the value of the cve__LastReinstatementApproval__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LastReinstatementApproval__C(XMLGregorianCalendar value) {
        this.cve__LastReinstatementApproval__C = value;
    }

    /**
     * Gets the value of the cve__LastWorked__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LastWorked__C() {
        return cve__LastWorked__C;
    }

    /**
     * Sets the value of the cve__LastWorked__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LastWorked__C(XMLGregorianCalendar value) {
        this.cve__LastWorked__C = value;
    }

    /**
     * Gets the value of the cve__LatestJournal__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LatestJournal__C() {
        return cve__LatestJournal__C;
    }

    /**
     * Sets the value of the cve__LatestJournal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LatestJournal__C(String value) {
        this.cve__LatestJournal__C = value;
    }

    /**
     * Gets the value of the cve__LatestJournal__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Journal__C }
     *     
     */
    public Cve__Journal__C getCve__LatestJournal__R() {
        return cve__LatestJournal__R;
    }

    /**
     * Sets the value of the cve__LatestJournal__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Journal__C }
     *     
     */
    public void setCve__LatestJournal__R(Cve__Journal__C value) {
        this.cve__LatestJournal__R = value;
    }

    /**
     * Gets the value of the cve__LatestPaymentSpecification__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LatestPaymentSpecification__C() {
        return cve__LatestPaymentSpecification__C;
    }

    /**
     * Sets the value of the cve__LatestPaymentSpecification__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LatestPaymentSpecification__C(String value) {
        this.cve__LatestPaymentSpecification__C = value;
    }

    /**
     * Gets the value of the cve__LatestPaymentSpecification__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__PaymentSpecification__C }
     *     
     */
    public Cve__PaymentSpecification__C getCve__LatestPaymentSpecification__R() {
        return cve__LatestPaymentSpecification__R;
    }

    /**
     * Sets the value of the cve__LatestPaymentSpecification__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__PaymentSpecification__C }
     *     
     */
    public void setCve__LatestPaymentSpecification__R(Cve__PaymentSpecification__C value) {
        this.cve__LatestPaymentSpecification__R = value;
    }

    /**
     * Gets the value of the cve__LiabilityBeforeTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LiabilityBeforeTax__C() {
        return cve__LiabilityBeforeTax__C;
    }

    /**
     * Sets the value of the cve__LiabilityBeforeTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LiabilityBeforeTax__C(Double value) {
        this.cve__LiabilityBeforeTax__C = value;
    }

    /**
     * Gets the value of the cve__LiabilityLastCalculated__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LiabilityLastCalculated__C() {
        return cve__LiabilityLastCalculated__C;
    }

    /**
     * Sets the value of the cve__LiabilityLastCalculated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LiabilityLastCalculated__C(XMLGregorianCalendar value) {
        this.cve__LiabilityLastCalculated__C = value;
    }

    /**
     * Gets the value of the cve__LiabilityNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LiabilityNet__C() {
        return cve__LiabilityNet__C;
    }

    /**
     * Sets the value of the cve__LiabilityNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LiabilityNet__C(Double value) {
        this.cve__LiabilityNet__C = value;
    }

    /**
     * Gets the value of the cve__LifeChangeEventDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LifeChangeEventDate__C() {
        return cve__LifeChangeEventDate__C;
    }

    /**
     * Sets the value of the cve__LifeChangeEventDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LifeChangeEventDate__C(XMLGregorianCalendar value) {
        this.cve__LifeChangeEventDate__C = value;
    }

    /**
     * Gets the value of the cve__LifeChangeEventType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LifeChangeEventType__C() {
        return cve__LifeChangeEventType__C;
    }

    /**
     * Sets the value of the cve__LifeChangeEventType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LifeChangeEventType__C(String value) {
        this.cve__LifeChangeEventType__C = value;
    }

    /**
     * Gets the value of the cve__LifePolicyFaceAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LifePolicyFaceAmount__C() {
        return cve__LifePolicyFaceAmount__C;
    }

    /**
     * Sets the value of the cve__LifePolicyFaceAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LifePolicyFaceAmount__C(Double value) {
        this.cve__LifePolicyFaceAmount__C = value;
    }

    /**
     * Gets the value of the cve__LocationOfDeath__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LocationOfDeath__C() {
        return cve__LocationOfDeath__C;
    }

    /**
     * Sets the value of the cve__LocationOfDeath__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LocationOfDeath__C(String value) {
        this.cve__LocationOfDeath__C = value;
    }

    /**
     * Gets the value of the cve__MaximumLifeExpectancyPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumLifeExpectancyPeriod__C() {
        return cve__MaximumLifeExpectancyPeriod__C;
    }

    /**
     * Sets the value of the cve__MaximumLifeExpectancyPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumLifeExpectancyPeriod__C(Double value) {
        this.cve__MaximumLifeExpectancyPeriod__C = value;
    }

    /**
     * Gets the value of the cve__MaximumLifeExpectancyUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MaximumLifeExpectancyUnits__C() {
        return cve__MaximumLifeExpectancyUnits__C;
    }

    /**
     * Sets the value of the cve__MaximumLifeExpectancyUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MaximumLifeExpectancyUnits__C(String value) {
        this.cve__MaximumLifeExpectancyUnits__C = value;
    }

    /**
     * Gets the value of the cve__MedicalCode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MedicalCode__C() {
        return cve__MedicalCode__C;
    }

    /**
     * Sets the value of the cve__MedicalCode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MedicalCode__C(String value) {
        this.cve__MedicalCode__C = value;
    }

    /**
     * Gets the value of the cve__MinimumInterestPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumInterestPercentage__C() {
        return cve__MinimumInterestPercentage__C;
    }

    /**
     * Sets the value of the cve__MinimumInterestPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumInterestPercentage__C(Double value) {
        this.cve__MinimumInterestPercentage__C = value;
    }

    /**
     * Gets the value of the cve__MinimumLifeExpectancyPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumLifeExpectancyPeriod__C() {
        return cve__MinimumLifeExpectancyPeriod__C;
    }

    /**
     * Sets the value of the cve__MinimumLifeExpectancyPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumLifeExpectancyPeriod__C(Double value) {
        this.cve__MinimumLifeExpectancyPeriod__C = value;
    }

    /**
     * Gets the value of the cve__MinimumLifeExpectancyUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MinimumLifeExpectancyUnits__C() {
        return cve__MinimumLifeExpectancyUnits__C;
    }

    /**
     * Sets the value of the cve__MinimumLifeExpectancyUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MinimumLifeExpectancyUnits__C(String value) {
        this.cve__MinimumLifeExpectancyUnits__C = value;
    }

    /**
     * Gets the value of the cve__MonthsOfServiceAtDod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MonthsOfServiceAtDod__C() {
        return cve__MonthsOfServiceAtDod__C;
    }

    /**
     * Sets the value of the cve__MonthsOfServiceAtDod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MonthsOfServiceAtDod__C(Double value) {
        this.cve__MonthsOfServiceAtDod__C = value;
    }

    /**
     * Gets the value of the cve__OneFootLoss__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OneFootLoss__C() {
        return cve__OneFootLoss__C;
    }

    /**
     * Sets the value of the cve__OneFootLoss__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OneFootLoss__C(Boolean value) {
        this.cve__OneFootLoss__C = value;
    }

    /**
     * Gets the value of the cve__OneHandAndOneFoot__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OneHandAndOneFoot__C() {
        return cve__OneHandAndOneFoot__C;
    }

    /**
     * Sets the value of the cve__OneHandAndOneFoot__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OneHandAndOneFoot__C(Boolean value) {
        this.cve__OneHandAndOneFoot__C = value;
    }

    /**
     * Gets the value of the cve__OneHandLoss__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OneHandLoss__C() {
        return cve__OneHandLoss__C;
    }

    /**
     * Sets the value of the cve__OneHandLoss__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OneHandLoss__C(Boolean value) {
        this.cve__OneHandLoss__C = value;
    }

    /**
     * Gets the value of the cve__OutstandingLoanAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OutstandingLoanAmount__C() {
        return cve__OutstandingLoanAmount__C;
    }

    /**
     * Sets the value of the cve__OutstandingLoanAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OutstandingLoanAmount__C(Double value) {
        this.cve__OutstandingLoanAmount__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentBalanceAsOf__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__OverpaymentBalanceAsOf__C() {
        return cve__OverpaymentBalanceAsOf__C;
    }

    /**
     * Sets the value of the cve__OverpaymentBalanceAsOf__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__OverpaymentBalanceAsOf__C(XMLGregorianCalendar value) {
        this.cve__OverpaymentBalanceAsOf__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentBalanceNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentBalanceNet__C() {
        return cve__OverpaymentBalanceNet__C;
    }

    /**
     * Sets the value of the cve__OverpaymentBalanceNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentBalanceNet__C(Double value) {
        this.cve__OverpaymentBalanceNet__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentBalance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentBalance__C() {
        return cve__OverpaymentBalance__C;
    }

    /**
     * Sets the value of the cve__OverpaymentBalance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentBalance__C(Double value) {
        this.cve__OverpaymentBalance__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentBeforeTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentBeforeTax__C() {
        return cve__OverpaymentBeforeTax__C;
    }

    /**
     * Sets the value of the cve__OverpaymentBeforeTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentBeforeTax__C(Double value) {
        this.cve__OverpaymentBeforeTax__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentLastCalculated__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__OverpaymentLastCalculated__C() {
        return cve__OverpaymentLastCalculated__C;
    }

    /**
     * Sets the value of the cve__OverpaymentLastCalculated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__OverpaymentLastCalculated__C(XMLGregorianCalendar value) {
        this.cve__OverpaymentLastCalculated__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentNet__C() {
        return cve__OverpaymentNet__C;
    }

    /**
     * Sets the value of the cve__OverpaymentNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentNet__C(Double value) {
        this.cve__OverpaymentNet__C = value;
    }

    /**
     * Gets the value of the cve__PaidDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PaidDays__C() {
        return cve__PaidDays__C;
    }

    /**
     * Sets the value of the cve__PaidDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PaidDays__C(Double value) {
        this.cve__PaidDays__C = value;
    }

    /**
     * Gets the value of the cve__PaidStart__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PaidStart__C() {
        return cve__PaidStart__C;
    }

    /**
     * Sets the value of the cve__PaidStart__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PaidStart__C(XMLGregorianCalendar value) {
        this.cve__PaidStart__C = value;
    }

    /**
     * Gets the value of the cve__PaidThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PaidThrough__C() {
        return cve__PaidThrough__C;
    }

    /**
     * Sets the value of the cve__PaidThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PaidThrough__C(XMLGregorianCalendar value) {
        this.cve__PaidThrough__C = value;
    }

    /**
     * Gets the value of the cve__PaidWeekDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PaidWeekDays__C() {
        return cve__PaidWeekDays__C;
    }

    /**
     * Sets the value of the cve__PaidWeekDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PaidWeekDays__C(Double value) {
        this.cve__PaidWeekDays__C = value;
    }

    /**
     * Gets the value of the cve__Paraplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Paraplegia__C() {
        return cve__Paraplegia__C;
    }

    /**
     * Sets the value of the cve__Paraplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Paraplegia__C(Boolean value) {
        this.cve__Paraplegia__C = value;
    }

    /**
     * Gets the value of the cve__PaymentSchedule__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentSchedule__C() {
        return cve__PaymentSchedule__C;
    }

    /**
     * Sets the value of the cve__PaymentSchedule__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentSchedule__C(String value) {
        this.cve__PaymentSchedule__C = value;
    }

    /**
     * Gets the value of the cve__PaymentSchedule__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__PaymentSchedule__C }
     *     
     */
    public Cve__PaymentSchedule__C getCve__PaymentSchedule__R() {
        return cve__PaymentSchedule__R;
    }

    /**
     * Sets the value of the cve__PaymentSchedule__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__PaymentSchedule__C }
     *     
     */
    public void setCve__PaymentSchedule__R(Cve__PaymentSchedule__C value) {
        this.cve__PaymentSchedule__R = value;
    }

    /**
     * Gets the value of the cve__PaymentSpecifications__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PaymentSpecifications__R() {
        return cve__PaymentSpecifications__R;
    }

    /**
     * Sets the value of the cve__PaymentSpecifications__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PaymentSpecifications__R(QueryResultType value) {
        this.cve__PaymentSpecifications__R = value;
    }

    /**
     * Gets the value of the cve__Policy__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Policy__C() {
        return cve__Policy__C;
    }

    /**
     * Sets the value of the cve__Policy__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Policy__C(String value) {
        this.cve__Policy__C = value;
    }

    /**
     * Gets the value of the cve__Policy__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Policy__C }
     *     
     */
    public Cve__Policy__C getCve__Policy__R() {
        return cve__Policy__R;
    }

    /**
     * Sets the value of the cve__Policy__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Policy__C }
     *     
     */
    public void setCve__Policy__R(Cve__Policy__C value) {
        this.cve__Policy__R = value;
    }

    /**
     * Gets the value of the cve__PremiumPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PremiumPeriod__C() {
        return cve__PremiumPeriod__C;
    }

    /**
     * Sets the value of the cve__PremiumPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PremiumPeriod__C(String value) {
        this.cve__PremiumPeriod__C = value;
    }

    /**
     * Gets the value of the cve__PremiumsPaidThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PremiumsPaidThrough__C() {
        return cve__PremiumsPaidThrough__C;
    }

    /**
     * Sets the value of the cve__PremiumsPaidThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PremiumsPaidThrough__C(XMLGregorianCalendar value) {
        this.cve__PremiumsPaidThrough__C = value;
    }

    /**
     * Gets the value of the cve__ProofOfLoss__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__ProofOfLoss__C() {
        return cve__ProofOfLoss__C;
    }

    /**
     * Sets the value of the cve__ProofOfLoss__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__ProofOfLoss__C(XMLGregorianCalendar value) {
        this.cve__ProofOfLoss__C = value;
    }

    /**
     * Gets the value of the cve__Quadriplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Quadriplegia__C() {
        return cve__Quadriplegia__C;
    }

    /**
     * Sets the value of the cve__Quadriplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Quadriplegia__C(Boolean value) {
        this.cve__Quadriplegia__C = value;
    }

    /**
     * Gets the value of the cve__ReapprovedDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__ReapprovedDate__C() {
        return cve__ReapprovedDate__C;
    }

    /**
     * Sets the value of the cve__ReapprovedDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__ReapprovedDate__C(XMLGregorianCalendar value) {
        this.cve__ReapprovedDate__C = value;
    }

    /**
     * Gets the value of the cve__Reapproved__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Reapproved__C() {
        return cve__Reapproved__C;
    }

    /**
     * Sets the value of the cve__Reapproved__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Reapproved__C(Boolean value) {
        this.cve__Reapproved__C = value;
    }

    /**
     * Gets the value of the cve__RecordTypeName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RecordTypeName__C() {
        return cve__RecordTypeName__C;
    }

    /**
     * Sets the value of the cve__RecordTypeName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RecordTypeName__C(String value) {
        this.cve__RecordTypeName__C = value;
    }

    /**
     * Gets the value of the cve__RehabilitationMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RehabilitationMaximum__C() {
        return cve__RehabilitationMaximum__C;
    }

    /**
     * Sets the value of the cve__RehabilitationMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RehabilitationMaximum__C(Double value) {
        this.cve__RehabilitationMaximum__C = value;
    }

    /**
     * Gets the value of the cve__RepatriationMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RepatriationMaximum__C() {
        return cve__RepatriationMaximum__C;
    }

    /**
     * Sets the value of the cve__RepatriationMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RepatriationMaximum__C(Double value) {
        this.cve__RepatriationMaximum__C = value;
    }

    /**
     * Gets the value of the cve__SeatBeltApplicable__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SeatBeltApplicable__C() {
        return cve__SeatBeltApplicable__C;
    }

    /**
     * Sets the value of the cve__SeatBeltApplicable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SeatBeltApplicable__C(Boolean value) {
        this.cve__SeatBeltApplicable__C = value;
    }

    /**
     * Gets the value of the cve__SeatBeltDecision__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__SeatBeltDecision__C() {
        return cve__SeatBeltDecision__C;
    }

    /**
     * Sets the value of the cve__SeatBeltDecision__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__SeatBeltDecision__C(XMLGregorianCalendar value) {
        this.cve__SeatBeltDecision__C = value;
    }

    /**
     * Gets the value of the cve__SeatBeltDenied__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SeatBeltDenied__C() {
        return cve__SeatBeltDenied__C;
    }

    /**
     * Sets the value of the cve__SeatBeltDenied__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SeatBeltDenied__C(Boolean value) {
        this.cve__SeatBeltDenied__C = value;
    }

    /**
     * Gets the value of the cve__SightInBothEyes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SightInBothEyes__C() {
        return cve__SightInBothEyes__C;
    }

    /**
     * Sets the value of the cve__SightInBothEyes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SightInBothEyes__C(Boolean value) {
        this.cve__SightInBothEyes__C = value;
    }

    /**
     * Gets the value of the cve__SightInOneEyeLoss__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SightInOneEyeLoss__C() {
        return cve__SightInOneEyeLoss__C;
    }

    /**
     * Sets the value of the cve__SightInOneEyeLoss__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SightInOneEyeLoss__C(Boolean value) {
        this.cve__SightInOneEyeLoss__C = value;
    }

    /**
     * Gets the value of the cve__SpeechAndHearingInBothEars__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SpeechAndHearingInBothEars__C() {
        return cve__SpeechAndHearingInBothEars__C;
    }

    /**
     * Sets the value of the cve__SpeechAndHearingInBothEars__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SpeechAndHearingInBothEars__C(Boolean value) {
        this.cve__SpeechAndHearingInBothEars__C = value;
    }

    /**
     * Gets the value of the cve__SpeechOrHearingInBothEars__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SpeechOrHearingInBothEars__C() {
        return cve__SpeechOrHearingInBothEars__C;
    }

    /**
     * Sets the value of the cve__SpeechOrHearingInBothEars__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SpeechOrHearingInBothEars__C(Boolean value) {
        this.cve__SpeechOrHearingInBothEars__C = value;
    }

    /**
     * Gets the value of the cve__SpouseEducationMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SpouseEducationMaximum__C() {
        return cve__SpouseEducationMaximum__C;
    }

    /**
     * Sets the value of the cve__SpouseEducationMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SpouseEducationMaximum__C(Double value) {
        this.cve__SpouseEducationMaximum__C = value;
    }

    /**
     * Gets the value of the cve__Start__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Start__C() {
        return cve__Start__C;
    }

    /**
     * Sets the value of the cve__Start__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Start__C(XMLGregorianCalendar value) {
        this.cve__Start__C = value;
    }

    /**
     * Gets the value of the cve__StatusForApproval__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StatusForApproval__C() {
        return cve__StatusForApproval__C;
    }

    /**
     * Sets the value of the cve__StatusForApproval__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StatusForApproval__C(String value) {
        this.cve__StatusForApproval__C = value;
    }

    /**
     * Gets the value of the cve__StatusReason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StatusReason__C() {
        return cve__StatusReason__C;
    }

    /**
     * Sets the value of the cve__StatusReason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StatusReason__C(String value) {
        this.cve__StatusReason__C = value;
    }

    /**
     * Gets the value of the cve__StatusReasons__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StatusReasons__C() {
        return cve__StatusReasons__C;
    }

    /**
     * Sets the value of the cve__StatusReasons__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StatusReasons__C(String value) {
        this.cve__StatusReasons__C = value;
    }

    /**
     * Gets the value of the cve__Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Status__C() {
        return cve__Status__C;
    }

    /**
     * Sets the value of the cve__Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Status__C(String value) {
        this.cve__Status__C = value;
    }

    /**
     * Gets the value of the cve__SubmittedCoverageAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SubmittedCoverageAmount__C() {
        return cve__SubmittedCoverageAmount__C;
    }

    /**
     * Sets the value of the cve__SubmittedCoverageAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SubmittedCoverageAmount__C(Double value) {
        this.cve__SubmittedCoverageAmount__C = value;
    }

    /**
     * Gets the value of the cve__SubmittedCoveragePercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SubmittedCoveragePercentage__C() {
        return cve__SubmittedCoveragePercentage__C;
    }

    /**
     * Sets the value of the cve__SubmittedCoveragePercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SubmittedCoveragePercentage__C(Double value) {
        this.cve__SubmittedCoveragePercentage__C = value;
    }

    /**
     * Gets the value of the cve__TherapeuticCounselingMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TherapeuticCounselingMaximum__C() {
        return cve__TherapeuticCounselingMaximum__C;
    }

    /**
     * Sets the value of the cve__TherapeuticCounselingMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TherapeuticCounselingMaximum__C(Double value) {
        this.cve__TherapeuticCounselingMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ThumbAndIndexFingerOfEitherHand__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ThumbAndIndexFingerOfEitherHand__C() {
        return cve__ThumbAndIndexFingerOfEitherHand__C;
    }

    /**
     * Sets the value of the cve__ThumbAndIndexFingerOfEitherHand__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ThumbAndIndexFingerOfEitherHand__C(Boolean value) {
        this.cve__ThumbAndIndexFingerOfEitherHand__C = value;
    }

    /**
     * Gets the value of the cve__ToBeIncurredBeforeTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ToBeIncurredBeforeTax__C() {
        return cve__ToBeIncurredBeforeTax__C;
    }

    /**
     * Sets the value of the cve__ToBeIncurredBeforeTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ToBeIncurredBeforeTax__C(Double value) {
        this.cve__ToBeIncurredBeforeTax__C = value;
    }

    /**
     * Gets the value of the cve__ToBeIncurredLastCalculated__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__ToBeIncurredLastCalculated__C() {
        return cve__ToBeIncurredLastCalculated__C;
    }

    /**
     * Sets the value of the cve__ToBeIncurredLastCalculated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__ToBeIncurredLastCalculated__C(XMLGregorianCalendar value) {
        this.cve__ToBeIncurredLastCalculated__C = value;
    }

    /**
     * Gets the value of the cve__ToBeIncurredNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ToBeIncurredNet__C() {
        return cve__ToBeIncurredNet__C;
    }

    /**
     * Sets the value of the cve__ToBeIncurredNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ToBeIncurredNet__C(Double value) {
        this.cve__ToBeIncurredNet__C = value;
    }

    /**
     * Gets the value of the cve__TollingAsOf__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__TollingAsOf__C() {
        return cve__TollingAsOf__C;
    }

    /**
     * Sets the value of the cve__TollingAsOf__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__TollingAsOf__C(XMLGregorianCalendar value) {
        this.cve__TollingAsOf__C = value;
    }

    /**
     * Gets the value of the cve__TollingPeriods__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__TollingPeriods__R() {
        return cve__TollingPeriods__R;
    }

    /**
     * Sets the value of the cve__TollingPeriods__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__TollingPeriods__R(QueryResultType value) {
        this.cve__TollingPeriods__R = value;
    }

    /**
     * Gets the value of the cve__TotalAdaptiveHomeVehicleBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalAdaptiveHomeVehicleBenefit__C() {
        return cve__TotalAdaptiveHomeVehicleBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalAdaptiveHomeVehicleBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalAdaptiveHomeVehicleBenefit__C(Double value) {
        this.cve__TotalAdaptiveHomeVehicleBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalCareerAdjustmentBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalCareerAdjustmentBenefit__C() {
        return cve__TotalCareerAdjustmentBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalCareerAdjustmentBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalCareerAdjustmentBenefit__C(Double value) {
        this.cve__TotalCareerAdjustmentBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalChildCareBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalChildCareBenefit__C() {
        return cve__TotalChildCareBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalChildCareBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalChildCareBenefit__C(Double value) {
        this.cve__TotalChildCareBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalChildEducationBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalChildEducationBenefit__C() {
        return cve__TotalChildEducationBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalChildEducationBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalChildEducationBenefit__C(Double value) {
        this.cve__TotalChildEducationBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalComaBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalComaBenefit__C() {
        return cve__TotalComaBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalComaBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalComaBenefit__C(Double value) {
        this.cve__TotalComaBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalContribution__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalContribution__C() {
        return cve__TotalContribution__C;
    }

    /**
     * Sets the value of the cve__TotalContribution__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalContribution__C(Double value) {
        this.cve__TotalContribution__C = value;
    }

    /**
     * Gets the value of the cve__TotalCriticalBurnBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalCriticalBurnBenefit__C() {
        return cve__TotalCriticalBurnBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalCriticalBurnBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalCriticalBurnBenefit__C(Double value) {
        this.cve__TotalCriticalBurnBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalDayCareBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalDayCareBenefit__C() {
        return cve__TotalDayCareBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalDayCareBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalDayCareBenefit__C(Double value) {
        this.cve__TotalDayCareBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalDoubleIndemnityCommonCarrierBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalDoubleIndemnityCommonCarrierBenefit__C() {
        return cve__TotalDoubleIndemnityCommonCarrierBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalDoubleIndemnityCommonCarrierBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalDoubleIndemnityCommonCarrierBenefit__C(Double value) {
        this.cve__TotalDoubleIndemnityCommonCarrierBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalFeloniousAssaultBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalFeloniousAssaultBenefit__C() {
        return cve__TotalFeloniousAssaultBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalFeloniousAssaultBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalFeloniousAssaultBenefit__C(Double value) {
        this.cve__TotalFeloniousAssaultBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalHigherEducationBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalHigherEducationBenefit__C() {
        return cve__TotalHigherEducationBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalHigherEducationBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalHigherEducationBenefit__C(Double value) {
        this.cve__TotalHigherEducationBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalIncurredAsOf__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__TotalIncurredAsOf__C() {
        return cve__TotalIncurredAsOf__C;
    }

    /**
     * Sets the value of the cve__TotalIncurredAsOf__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__TotalIncurredAsOf__C(XMLGregorianCalendar value) {
        this.cve__TotalIncurredAsOf__C = value;
    }

    /**
     * Gets the value of the cve__TotalIncurredNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalIncurredNet__C() {
        return cve__TotalIncurredNet__C;
    }

    /**
     * Sets the value of the cve__TotalIncurredNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalIncurredNet__C(Double value) {
        this.cve__TotalIncurredNet__C = value;
    }

    /**
     * Gets the value of the cve__TotalIncurred__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalIncurred__C() {
        return cve__TotalIncurred__C;
    }

    /**
     * Sets the value of the cve__TotalIncurred__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalIncurred__C(Double value) {
        this.cve__TotalIncurred__C = value;
    }

    /**
     * Gets the value of the cve__TotalLiabilityAsOf__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__TotalLiabilityAsOf__C() {
        return cve__TotalLiabilityAsOf__C;
    }

    /**
     * Sets the value of the cve__TotalLiabilityAsOf__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__TotalLiabilityAsOf__C(XMLGregorianCalendar value) {
        this.cve__TotalLiabilityAsOf__C = value;
    }

    /**
     * Gets the value of the cve__TotalLiabilityNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalLiabilityNet__C() {
        return cve__TotalLiabilityNet__C;
    }

    /**
     * Sets the value of the cve__TotalLiabilityNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalLiabilityNet__C(Double value) {
        this.cve__TotalLiabilityNet__C = value;
    }

    /**
     * Gets the value of the cve__TotalLiability__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalLiability__C() {
        return cve__TotalLiability__C;
    }

    /**
     * Sets the value of the cve__TotalLiability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalLiability__C(Double value) {
        this.cve__TotalLiability__C = value;
    }

    /**
     * Gets the value of the cve__TotalPaidDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalPaidDays__C() {
        return cve__TotalPaidDays__C;
    }

    /**
     * Sets the value of the cve__TotalPaidDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalPaidDays__C(Double value) {
        this.cve__TotalPaidDays__C = value;
    }

    /**
     * Gets the value of the cve__TotalPremiumPaid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalPremiumPaid__C() {
        return cve__TotalPremiumPaid__C;
    }

    /**
     * Sets the value of the cve__TotalPremiumPaid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalPremiumPaid__C(Double value) {
        this.cve__TotalPremiumPaid__C = value;
    }

    /**
     * Gets the value of the cve__TotalRehabilitationBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalRehabilitationBenefit__C() {
        return cve__TotalRehabilitationBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalRehabilitationBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalRehabilitationBenefit__C(Double value) {
        this.cve__TotalRehabilitationBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalRepatriationBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalRepatriationBenefit__C() {
        return cve__TotalRepatriationBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalRepatriationBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalRepatriationBenefit__C(Double value) {
        this.cve__TotalRepatriationBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalSpouseEducationBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalSpouseEducationBenefit__C() {
        return cve__TotalSpouseEducationBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalSpouseEducationBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalSpouseEducationBenefit__C(Double value) {
        this.cve__TotalSpouseEducationBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalTherapeuticCounselingBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalTherapeuticCounselingBenefit__C() {
        return cve__TotalTherapeuticCounselingBenefit__C;
    }

    /**
     * Sets the value of the cve__TotalTherapeuticCounselingBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalTherapeuticCounselingBenefit__C(Double value) {
        this.cve__TotalTherapeuticCounselingBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TotalToBeIncurredAsOf__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__TotalToBeIncurredAsOf__C() {
        return cve__TotalToBeIncurredAsOf__C;
    }

    /**
     * Sets the value of the cve__TotalToBeIncurredAsOf__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__TotalToBeIncurredAsOf__C(XMLGregorianCalendar value) {
        this.cve__TotalToBeIncurredAsOf__C = value;
    }

    /**
     * Gets the value of the cve__TotalToBeIncurredNet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalToBeIncurredNet__C() {
        return cve__TotalToBeIncurredNet__C;
    }

    /**
     * Sets the value of the cve__TotalToBeIncurredNet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalToBeIncurredNet__C(Double value) {
        this.cve__TotalToBeIncurredNet__C = value;
    }

    /**
     * Gets the value of the cve__TotalToBeIncurred__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalToBeIncurred__C() {
        return cve__TotalToBeIncurred__C;
    }

    /**
     * Sets the value of the cve__TotalToBeIncurred__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalToBeIncurred__C(Double value) {
        this.cve__TotalToBeIncurred__C = value;
    }

    /**
     * Gets the value of the cve__Triplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Triplegia__C() {
        return cve__Triplegia__C;
    }

    /**
     * Sets the value of the cve__Triplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Triplegia__C(Boolean value) {
        this.cve__Triplegia__C = value;
    }

    /**
     * Gets the value of the cve__TurnAroundTime__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TurnAroundTime__C() {
        return cve__TurnAroundTime__C;
    }

    /**
     * Sets the value of the cve__TurnAroundTime__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TurnAroundTime__C(Double value) {
        this.cve__TurnAroundTime__C = value;
    }

    /**
     * Gets the value of the cve__TwoOrMoreLosses__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__TwoOrMoreLosses__C() {
        return cve__TwoOrMoreLosses__C;
    }

    /**
     * Sets the value of the cve__TwoOrMoreLosses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__TwoOrMoreLosses__C(Boolean value) {
        this.cve__TwoOrMoreLosses__C = value;
    }

    /**
     * Gets the value of the cve__Uniplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Uniplegia__C() {
        return cve__Uniplegia__C;
    }

    /**
     * Sets the value of the cve__Uniplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Uniplegia__C(Boolean value) {
        this.cve__Uniplegia__C = value;
    }

    /**
     * Gets the value of the cve__WopTermination__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__WopTermination__C() {
        return cve__WopTermination__C;
    }

    /**
     * Sets the value of the cve__WopTermination__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__WopTermination__C(XMLGregorianCalendar value) {
        this.cve__WopTermination__C = value;
    }

    /**
     * Gets the value of the cve__YearsOfServiceAtDod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__YearsOfServiceAtDod__C() {
        return cve__YearsOfServiceAtDod__C;
    }

    /**
     * Sets the value of the cve__YearsOfServiceAtDod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__YearsOfServiceAtDod__C(Double value) {
        this.cve__YearsOfServiceAtDod__C = value;
    }

}
