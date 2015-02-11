package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for cve__Claim__c complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="cve__Claim__c">
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
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__AllRequiredDocumentsReceived__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__AnticipatedClose__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimeds__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BenefitSummary__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimRelationships__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccountName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsured__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsured__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="cve__DateOfDeath__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfDiagnosis__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfDisability__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfMaturityAnnuity__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateReceived__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Documents__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__IncompleteDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__IncurredBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IncurredLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__IncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__InquiryPortalUrl__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Journals__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OpaqueIdValidThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__OpaqueId__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OpenRequiredTaskCount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OpenTaskCount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OriginalName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecifications__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Payments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PendingDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PerformanceGuarantee__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyPremiumPaidThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PolicyRelationship__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__PolicyRelationship__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PolicyRelationship__c" minOccurs="0"/>
 *         &lt;element name="cve__Policy__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Policy__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Policy__c" minOccurs="0"/>
 *         &lt;element name="cve__PrecedingClaim__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__PrecedingClaim__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Claim__c" minOccurs="0"/>
 *         &lt;element name="cve__QuestionsLanguage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ReopenedDate__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__Reopened__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ReturnToWorkDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__ReturnToWorkType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SucceedingClaims__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TotalIncurredAsOf__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TotalIncurred__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__Claim__c", propOrder = { "activityHistories",
		"attachments", "combinedAttachments", "createdBy", "createdById",
		"createdDate", "events", "histories", "isDeleted", "lastActivityDate",
		"lastModifiedBy", "lastModifiedById", "lastModifiedDate",
		"lastReferencedDate", "lastViewedDate", "lookedUpFromActivities",
		"name", "notes", "notesAndAttachments", "openActivities", "owner",
		"ownerId", "processInstances", "processSteps", "systemModstamp",
		"tasks", "topicAssignments", "userRecordAccess",
		"cve__AllRequiredDocumentsReceived__C", "cve__AnticipatedClose__C",
		"cve__BenefitClaimeds__R", "cve__BenefitSummary__C",
		"cve__BenefitType__C", "cve__ClaimRelationships__R",
		"cve__ClaimantInsuredAccountName__C", "cve__ClaimantInsuredAccount__C",
		"cve__ClaimantInsuredAccount__R", "cve__ClaimantInsuredName__C",
		"cve__ClaimantInsured__C", "cve__ClaimantInsured__R",
		"cve__DateOfDeath__C", "cve__DateOfDiagnosis__C",
		"cve__DateOfDisability__C", "cve__DateOfMaturityAnnuity__C",
		"cve__DateReceived__C", "cve__Documents__R", "cve__IncompleteDate__C",
		"cve__IncurredBeforeTax__C", "cve__IncurredLastCalculated__C",
		"cve__IncurredNet__C", "cve__InquiryPortalUrl__C", "cve__Journals__R",
		"cve__LiabilityBeforeTax__C", "cve__LiabilityLastCalculated__C",
		"cve__LiabilityNet__C", "cve__OpaqueIdValidThrough__C",
		"cve__OpaqueId__C", "cve__OpenRequiredTaskCount__C",
		"cve__OpenTaskCount__C", "cve__OriginalName__C",
		"cve__OverpaymentBeforeTax__C", "cve__OverpaymentLastCalculated__C",
		"cve__OverpaymentNet__C", "cve__PaymentSpecifications__R",
		"cve__Payments__R", "cve__PendingDate__C",
		"cve__PerformanceGuarantee__C", "cve__PolicyPremiumPaidThrough__C",
		"cve__PolicyRelationship__C", "cve__PolicyRelationship__R",
		"cve__Policy__C", "cve__Policy__R", "cve__PrecedingClaim__C",
		"cve__PrecedingClaim__R", "cve__QuestionsLanguage__C",
		"cve__ReopenedDate__C", "cve__Reopened__C", "cve__ReturnToWorkDate__C",
		"cve__ReturnToWorkType__C", "cve__Status__C",
		"cve__SucceedingClaims__R", "cve__ToBeIncurredBeforeTax__C",
		"cve__ToBeIncurredLastCalculated__C", "cve__ToBeIncurredNet__C",
		"cve__TotalIncurredAsOf__C", "cve__TotalIncurred__C" })
public class Cve__Claim__C extends SObject {

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
	@XmlElement(name = "Owner", nillable = true)
	protected Name owner;
	@XmlElement(name = "OwnerId", nillable = true)
	protected String ownerId;
	@XmlElement(name = "ProcessInstances", nillable = true)
	protected QueryResultType processInstances;
	@XmlElement(name = "ProcessSteps", nillable = true)
	protected QueryResultType processSteps;
	@XmlElement(name = "SystemModstamp", nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar systemModstamp;
	@XmlElement(name = "Tasks", nillable = true)
	protected QueryResultType tasks;
	@XmlElement(name = "TopicAssignments", nillable = true)
	protected QueryResultType topicAssignments;
	@XmlElement(name = "UserRecordAccess", nillable = true)
	protected UserRecordAccess userRecordAccess;
	@XmlElement(name = "cve__AllRequiredDocumentsReceived__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__AllRequiredDocumentsReceived__C;
	@XmlElement(name = "cve__AnticipatedClose__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__AnticipatedClose__C;
	@XmlElement(name = "cve__BenefitClaimeds__r", nillable = true)
	protected QueryResultType cve__BenefitClaimeds__R;
	@XmlElement(name = "cve__BenefitSummary__c", nillable = true)
	protected String cve__BenefitSummary__C;
	@XmlElement(name = "cve__BenefitType__c", nillable = true)
	protected String cve__BenefitType__C;
	@XmlElement(name = "cve__ClaimRelationships__r", nillable = true)
	protected QueryResultType cve__ClaimRelationships__R;
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
	@XmlElement(name = "cve__DateOfDeath__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__DateOfDeath__C;
	@XmlElement(name = "cve__DateOfDiagnosis__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__DateOfDiagnosis__C;
	@XmlElement(name = "cve__DateOfDisability__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__DateOfDisability__C;
	@XmlElement(name = "cve__DateOfMaturityAnnuity__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__DateOfMaturityAnnuity__C;
	@XmlElement(name = "cve__DateReceived__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__DateReceived__C;
	@XmlElement(name = "cve__Documents__r", nillable = true)
	protected QueryResultType cve__Documents__R;
	@XmlElement(name = "cve__IncompleteDate__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__IncompleteDate__C;
	@XmlElement(name = "cve__IncurredBeforeTax__c", nillable = true)
	protected Double cve__IncurredBeforeTax__C;
	@XmlElement(name = "cve__IncurredLastCalculated__c", nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar cve__IncurredLastCalculated__C;
	@XmlElement(name = "cve__IncurredNet__c", nillable = true)
	protected Double cve__IncurredNet__C;
	@XmlElement(name = "cve__InquiryPortalUrl__c", nillable = true)
	protected String cve__InquiryPortalUrl__C;
	@XmlElement(name = "cve__Journals__r", nillable = true)
	protected QueryResultType cve__Journals__R;
	@XmlElement(name = "cve__LiabilityBeforeTax__c", nillable = true)
	protected Double cve__LiabilityBeforeTax__C;
	@XmlElement(name = "cve__LiabilityLastCalculated__c", nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar cve__LiabilityLastCalculated__C;
	@XmlElement(name = "cve__LiabilityNet__c", nillable = true)
	protected Double cve__LiabilityNet__C;
	@XmlElement(name = "cve__OpaqueIdValidThrough__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__OpaqueIdValidThrough__C;
	@XmlElement(name = "cve__OpaqueId__c", nillable = true)
	protected String cve__OpaqueId__C;
	@XmlElement(name = "cve__OpenRequiredTaskCount__c", nillable = true)
	protected Double cve__OpenRequiredTaskCount__C;
	@XmlElement(name = "cve__OpenTaskCount__c", nillable = true)
	protected Double cve__OpenTaskCount__C;
	@XmlElement(name = "cve__OriginalName__c", nillable = true)
	protected String cve__OriginalName__C;
	@XmlElement(name = "cve__OverpaymentBeforeTax__c", nillable = true)
	protected Double cve__OverpaymentBeforeTax__C;
	@XmlElement(name = "cve__OverpaymentLastCalculated__c", nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar cve__OverpaymentLastCalculated__C;
	@XmlElement(name = "cve__OverpaymentNet__c", nillable = true)
	protected Double cve__OverpaymentNet__C;
	@XmlElement(name = "cve__PaymentSpecifications__r", nillable = true)
	protected QueryResultType cve__PaymentSpecifications__R;
	@XmlElement(name = "cve__Payments__r", nillable = true)
	protected QueryResultType cve__Payments__R;
	@XmlElement(name = "cve__PendingDate__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__PendingDate__C;
	@XmlElement(name = "cve__PerformanceGuarantee__c", nillable = true)
	protected String cve__PerformanceGuarantee__C;
	@XmlElement(name = "cve__PolicyPremiumPaidThrough__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__PolicyPremiumPaidThrough__C;
	@XmlElement(name = "cve__PolicyRelationship__c", nillable = true)
	protected String cve__PolicyRelationship__C;
	@XmlElement(name = "cve__PolicyRelationship__r", nillable = true)
	protected Cve__PolicyRelationship__C cve__PolicyRelationship__R;
	@XmlElement(name = "cve__Policy__c", nillable = true)
	protected String cve__Policy__C;
	@XmlElement(name = "cve__Policy__r", nillable = true)
	protected Cve__Policy__C cve__Policy__R;
	@XmlElement(name = "cve__PrecedingClaim__c", nillable = true)
	protected String cve__PrecedingClaim__C;
	@XmlElement(name = "cve__PrecedingClaim__r", nillable = true)
	protected Cve__Claim__C cve__PrecedingClaim__R;
	@XmlElement(name = "cve__QuestionsLanguage__c", nillable = true)
	protected String cve__QuestionsLanguage__C;
	@XmlElement(name = "cve__ReopenedDate__c", nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar cve__ReopenedDate__C;
	@XmlElement(name = "cve__Reopened__c", nillable = true)
	protected Boolean cve__Reopened__C;
	@XmlElement(name = "cve__ReturnToWorkDate__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__ReturnToWorkDate__C;
	@XmlElement(name = "cve__ReturnToWorkType__c", nillable = true)
	protected String cve__ReturnToWorkType__C;
	@XmlElement(name = "cve__Status__c", nillable = true)
	protected String cve__Status__C;
	@XmlElement(name = "cve__SucceedingClaims__r", nillable = true)
	protected QueryResultType cve__SucceedingClaims__R;
	@XmlElement(name = "cve__ToBeIncurredBeforeTax__c", nillable = true)
	protected Double cve__ToBeIncurredBeforeTax__C;
	@XmlElement(name = "cve__ToBeIncurredLastCalculated__c", nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar cve__ToBeIncurredLastCalculated__C;
	@XmlElement(name = "cve__ToBeIncurredNet__c", nillable = true)
	protected Double cve__ToBeIncurredNet__C;
	@XmlElement(name = "cve__TotalIncurredAsOf__c", nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar cve__TotalIncurredAsOf__C;
	@XmlElement(name = "cve__TotalIncurred__c", nillable = true)
	protected Double cve__TotalIncurred__C;

	/**
	 * Gets the value of the activityHistories property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getActivityHistories() {
		return activityHistories;
	}

	/**
	 * Sets the value of the activityHistories property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setActivityHistories(QueryResultType value) {
		this.activityHistories = value;
	}

	/**
	 * Gets the value of the attachments property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getAttachments() {
		return attachments;
	}

	/**
	 * Sets the value of the attachments property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setAttachments(QueryResultType value) {
		this.attachments = value;
	}

	/**
	 * Gets the value of the combinedAttachments property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCombinedAttachments() {
		return combinedAttachments;
	}

	/**
	 * Sets the value of the combinedAttachments property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCombinedAttachments(QueryResultType value) {
		this.combinedAttachments = value;
	}

	/**
	 * Gets the value of the createdBy property.
	 * 
	 * @return possible object is {@link User }
	 * 
	 */
	public User getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the value of the createdBy property.
	 * 
	 * @param value
	 *            allowed object is {@link User }
	 * 
	 */
	public void setCreatedBy(User value) {
		this.createdBy = value;
	}

	/**
	 * Gets the value of the createdById property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatedById() {
		return createdById;
	}

	/**
	 * Sets the value of the createdById property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatedById(String value) {
		this.createdById = value;
	}

	/**
	 * Gets the value of the createdDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the value of the createdDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreatedDate(XMLGregorianCalendar value) {
		this.createdDate = value;
	}

	/**
	 * Gets the value of the events property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getEvents() {
		return events;
	}

	/**
	 * Sets the value of the events property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setEvents(QueryResultType value) {
		this.events = value;
	}

	/**
	 * Gets the value of the histories property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getHistories() {
		return histories;
	}

	/**
	 * Sets the value of the histories property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setHistories(QueryResultType value) {
		this.histories = value;
	}

	/**
	 * Gets the value of the isDeleted property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isIsDeleted() {
		return isDeleted;
	}

	/**
	 * Sets the value of the isDeleted property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setIsDeleted(Boolean value) {
		this.isDeleted = value;
	}

	/**
	 * Gets the value of the lastActivityDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLastActivityDate() {
		return lastActivityDate;
	}

	/**
	 * Sets the value of the lastActivityDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLastActivityDate(XMLGregorianCalendar value) {
		this.lastActivityDate = value;
	}

	/**
	 * Gets the value of the lastModifiedBy property.
	 * 
	 * @return possible object is {@link User }
	 * 
	 */
	public User getLastModifiedBy() {
		return lastModifiedBy;
	}

	/**
	 * Sets the value of the lastModifiedBy property.
	 * 
	 * @param value
	 *            allowed object is {@link User }
	 * 
	 */
	public void setLastModifiedBy(User value) {
		this.lastModifiedBy = value;
	}

	/**
	 * Gets the value of the lastModifiedById property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastModifiedById() {
		return lastModifiedById;
	}

	/**
	 * Sets the value of the lastModifiedById property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastModifiedById(String value) {
		this.lastModifiedById = value;
	}

	/**
	 * Gets the value of the lastModifiedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * Sets the value of the lastModifiedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLastModifiedDate(XMLGregorianCalendar value) {
		this.lastModifiedDate = value;
	}

	/**
	 * Gets the value of the lastReferencedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLastReferencedDate() {
		return lastReferencedDate;
	}

	/**
	 * Sets the value of the lastReferencedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLastReferencedDate(XMLGregorianCalendar value) {
		this.lastReferencedDate = value;
	}

	/**
	 * Gets the value of the lastViewedDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getLastViewedDate() {
		return lastViewedDate;
	}

	/**
	 * Sets the value of the lastViewedDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setLastViewedDate(XMLGregorianCalendar value) {
		this.lastViewedDate = value;
	}

	/**
	 * Gets the value of the lookedUpFromActivities property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getLookedUpFromActivities() {
		return lookedUpFromActivities;
	}

	/**
	 * Sets the value of the lookedUpFromActivities property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setLookedUpFromActivities(QueryResultType value) {
		this.lookedUpFromActivities = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the notes property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getNotes() {
		return notes;
	}

	/**
	 * Sets the value of the notes property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setNotes(QueryResultType value) {
		this.notes = value;
	}

	/**
	 * Gets the value of the notesAndAttachments property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getNotesAndAttachments() {
		return notesAndAttachments;
	}

	/**
	 * Sets the value of the notesAndAttachments property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setNotesAndAttachments(QueryResultType value) {
		this.notesAndAttachments = value;
	}

	/**
	 * Gets the value of the openActivities property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getOpenActivities() {
		return openActivities;
	}

	/**
	 * Sets the value of the openActivities property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setOpenActivities(QueryResultType value) {
		this.openActivities = value;
	}

	/**
	 * Gets the value of the owner property.
	 * 
	 * @return possible object is {@link Name }
	 * 
	 */
	public Name getOwner() {
		return owner;
	}

	/**
	 * Sets the value of the owner property.
	 * 
	 * @param value
	 *            allowed object is {@link Name }
	 * 
	 */
	public void setOwner(Name value) {
		this.owner = value;
	}

	/**
	 * Gets the value of the ownerId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * Sets the value of the ownerId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOwnerId(String value) {
		this.ownerId = value;
	}

	/**
	 * Gets the value of the processInstances property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getProcessInstances() {
		return processInstances;
	}

	/**
	 * Sets the value of the processInstances property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setProcessInstances(QueryResultType value) {
		this.processInstances = value;
	}

	/**
	 * Gets the value of the processSteps property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getProcessSteps() {
		return processSteps;
	}

	/**
	 * Sets the value of the processSteps property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setProcessSteps(QueryResultType value) {
		this.processSteps = value;
	}

	/**
	 * Gets the value of the systemModstamp property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getSystemModstamp() {
		return systemModstamp;
	}

	/**
	 * Sets the value of the systemModstamp property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setSystemModstamp(XMLGregorianCalendar value) {
		this.systemModstamp = value;
	}

	/**
	 * Gets the value of the tasks property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getTasks() {
		return tasks;
	}

	/**
	 * Sets the value of the tasks property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setTasks(QueryResultType value) {
		this.tasks = value;
	}

	/**
	 * Gets the value of the topicAssignments property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getTopicAssignments() {
		return topicAssignments;
	}

	/**
	 * Sets the value of the topicAssignments property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setTopicAssignments(QueryResultType value) {
		this.topicAssignments = value;
	}

	/**
	 * Gets the value of the userRecordAccess property.
	 * 
	 * @return possible object is {@link UserRecordAccess }
	 * 
	 */
	public UserRecordAccess getUserRecordAccess() {
		return userRecordAccess;
	}

	/**
	 * Sets the value of the userRecordAccess property.
	 * 
	 * @param value
	 *            allowed object is {@link UserRecordAccess }
	 * 
	 */
	public void setUserRecordAccess(UserRecordAccess value) {
		this.userRecordAccess = value;
	}

	/**
	 * Gets the value of the cve__AllRequiredDocumentsReceived__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__AllRequiredDocumentsReceived__C() {
		return cve__AllRequiredDocumentsReceived__C;
	}

	/**
	 * Sets the value of the cve__AllRequiredDocumentsReceived__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__AllRequiredDocumentsReceived__C(
			XMLGregorianCalendar value) {
		this.cve__AllRequiredDocumentsReceived__C = value;
	}

	/**
	 * Gets the value of the cve__AnticipatedClose__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__AnticipatedClose__C() {
		return cve__AnticipatedClose__C;
	}

	/**
	 * Sets the value of the cve__AnticipatedClose__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__AnticipatedClose__C(XMLGregorianCalendar value) {
		this.cve__AnticipatedClose__C = value;
	}

	/**
	 * Gets the value of the cve__BenefitClaimeds__R property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCve__BenefitClaimeds__R() {
		return cve__BenefitClaimeds__R;
	}

	/**
	 * Sets the value of the cve__BenefitClaimeds__R property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCve__BenefitClaimeds__R(QueryResultType value) {
		this.cve__BenefitClaimeds__R = value;
	}

	/**
	 * Gets the value of the cve__BenefitSummary__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__BenefitSummary__C() {
		return cve__BenefitSummary__C;
	}

	/**
	 * Sets the value of the cve__BenefitSummary__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__BenefitSummary__C(String value) {
		this.cve__BenefitSummary__C = value;
	}

	/**
	 * Gets the value of the cve__BenefitType__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__BenefitType__C() {
		return cve__BenefitType__C;
	}

	/**
	 * Sets the value of the cve__BenefitType__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__BenefitType__C(String value) {
		this.cve__BenefitType__C = value;
	}

	/**
	 * Gets the value of the cve__ClaimRelationships__R property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCve__ClaimRelationships__R() {
		return cve__ClaimRelationships__R;
	}

	/**
	 * Sets the value of the cve__ClaimRelationships__R property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCve__ClaimRelationships__R(QueryResultType value) {
		this.cve__ClaimRelationships__R = value;
	}

	/**
	 * Gets the value of the cve__ClaimantInsuredAccountName__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__ClaimantInsuredAccountName__C() {
		return cve__ClaimantInsuredAccountName__C;
	}

	/**
	 * Sets the value of the cve__ClaimantInsuredAccountName__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__ClaimantInsuredAccountName__C(String value) {
		this.cve__ClaimantInsuredAccountName__C = value;
	}

	/**
	 * Gets the value of the cve__ClaimantInsuredAccount__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__ClaimantInsuredAccount__C() {
		return cve__ClaimantInsuredAccount__C;
	}

	/**
	 * Sets the value of the cve__ClaimantInsuredAccount__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__ClaimantInsuredAccount__C(String value) {
		this.cve__ClaimantInsuredAccount__C = value;
	}

	/**
	 * Gets the value of the cve__ClaimantInsuredAccount__R property.
	 * 
	 * @return possible object is {@link Account }
	 * 
	 */
	public Account getCve__ClaimantInsuredAccount__R() {
		return cve__ClaimantInsuredAccount__R;
	}

	/**
	 * Sets the value of the cve__ClaimantInsuredAccount__R property.
	 * 
	 * @param value
	 *            allowed object is {@link Account }
	 * 
	 */
	public void setCve__ClaimantInsuredAccount__R(Account value) {
		this.cve__ClaimantInsuredAccount__R = value;
	}

	/**
	 * Gets the value of the cve__ClaimantInsuredName__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__ClaimantInsuredName__C() {
		return cve__ClaimantInsuredName__C;
	}

	/**
	 * Sets the value of the cve__ClaimantInsuredName__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__ClaimantInsuredName__C(String value) {
		this.cve__ClaimantInsuredName__C = value;
	}

	/**
	 * Gets the value of the cve__ClaimantInsured__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__ClaimantInsured__C() {
		return cve__ClaimantInsured__C;
	}

	/**
	 * Sets the value of the cve__ClaimantInsured__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__ClaimantInsured__C(String value) {
		this.cve__ClaimantInsured__C = value;
	}

	/**
	 * Gets the value of the cve__ClaimantInsured__R property.
	 * 
	 * @return possible object is {@link Contact }
	 * 
	 */
	public Contact getCve__ClaimantInsured__R() {
		return cve__ClaimantInsured__R;
	}

	/**
	 * Sets the value of the cve__ClaimantInsured__R property.
	 * 
	 * @param value
	 *            allowed object is {@link Contact }
	 * 
	 */
	public void setCve__ClaimantInsured__R(Contact value) {
		this.cve__ClaimantInsured__R = value;
	}

	/**
	 * Gets the value of the cve__DateOfDeath__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__DateOfDeath__C() {
		return cve__DateOfDeath__C;
	}

	/**
	 * Sets the value of the cve__DateOfDeath__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__DateOfDeath__C(XMLGregorianCalendar value) {
		this.cve__DateOfDeath__C = value;
	}

	/**
	 * Gets the value of the cve__DateOfDiagnosis__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__DateOfDiagnosis__C() {
		return cve__DateOfDiagnosis__C;
	}

	/**
	 * Sets the value of the cve__DateOfDiagnosis__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__DateOfDiagnosis__C(XMLGregorianCalendar value) {
		this.cve__DateOfDiagnosis__C = value;
	}

	/**
	 * Gets the value of the cve__DateOfDisability__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__DateOfDisability__C() {
		return cve__DateOfDisability__C;
	}

	/**
	 * Sets the value of the cve__DateOfDisability__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__DateOfDisability__C(XMLGregorianCalendar value) {
		this.cve__DateOfDisability__C = value;
	}

	/**
	 * Gets the value of the cve__DateOfMaturityAnnuity__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__DateOfMaturityAnnuity__C() {
		return cve__DateOfMaturityAnnuity__C;
	}

	/**
	 * Sets the value of the cve__DateOfMaturityAnnuity__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__DateOfMaturityAnnuity__C(XMLGregorianCalendar value) {
		this.cve__DateOfMaturityAnnuity__C = value;
	}

	/**
	 * Gets the value of the cve__DateReceived__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__DateReceived__C() {
		return cve__DateReceived__C;
	}

	/**
	 * Sets the value of the cve__DateReceived__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__DateReceived__C(XMLGregorianCalendar value) {
		this.cve__DateReceived__C = value;
	}

	/**
	 * Gets the value of the cve__Documents__R property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCve__Documents__R() {
		return cve__Documents__R;
	}

	/**
	 * Sets the value of the cve__Documents__R property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCve__Documents__R(QueryResultType value) {
		this.cve__Documents__R = value;
	}

	/**
	 * Gets the value of the cve__IncompleteDate__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__IncompleteDate__C() {
		return cve__IncompleteDate__C;
	}

	/**
	 * Sets the value of the cve__IncompleteDate__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__IncompleteDate__C(XMLGregorianCalendar value) {
		this.cve__IncompleteDate__C = value;
	}

	/**
	 * Gets the value of the cve__IncurredBeforeTax__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__IncurredBeforeTax__C() {
		return cve__IncurredBeforeTax__C;
	}

	/**
	 * Sets the value of the cve__IncurredBeforeTax__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__IncurredBeforeTax__C(Double value) {
		this.cve__IncurredBeforeTax__C = value;
	}

	/**
	 * Gets the value of the cve__IncurredLastCalculated__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__IncurredLastCalculated__C() {
		return cve__IncurredLastCalculated__C;
	}

	/**
	 * Sets the value of the cve__IncurredLastCalculated__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__IncurredLastCalculated__C(XMLGregorianCalendar value) {
		this.cve__IncurredLastCalculated__C = value;
	}

	/**
	 * Gets the value of the cve__IncurredNet__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__IncurredNet__C() {
		return cve__IncurredNet__C;
	}

	/**
	 * Sets the value of the cve__IncurredNet__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__IncurredNet__C(Double value) {
		this.cve__IncurredNet__C = value;
	}

	/**
	 * Gets the value of the cve__InquiryPortalUrl__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__InquiryPortalUrl__C() {
		return cve__InquiryPortalUrl__C;
	}

	/**
	 * Sets the value of the cve__InquiryPortalUrl__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__InquiryPortalUrl__C(String value) {
		this.cve__InquiryPortalUrl__C = value;
	}

	/**
	 * Gets the value of the cve__Journals__R property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCve__Journals__R() {
		return cve__Journals__R;
	}

	/**
	 * Sets the value of the cve__Journals__R property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCve__Journals__R(QueryResultType value) {
		this.cve__Journals__R = value;
	}

	/**
	 * Gets the value of the cve__LiabilityBeforeTax__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__LiabilityBeforeTax__C() {
		return cve__LiabilityBeforeTax__C;
	}

	/**
	 * Sets the value of the cve__LiabilityBeforeTax__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__LiabilityBeforeTax__C(Double value) {
		this.cve__LiabilityBeforeTax__C = value;
	}

	/**
	 * Gets the value of the cve__LiabilityLastCalculated__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__LiabilityLastCalculated__C() {
		return cve__LiabilityLastCalculated__C;
	}

	/**
	 * Sets the value of the cve__LiabilityLastCalculated__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__LiabilityLastCalculated__C(XMLGregorianCalendar value) {
		this.cve__LiabilityLastCalculated__C = value;
	}

	/**
	 * Gets the value of the cve__LiabilityNet__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__LiabilityNet__C() {
		return cve__LiabilityNet__C;
	}

	/**
	 * Sets the value of the cve__LiabilityNet__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__LiabilityNet__C(Double value) {
		this.cve__LiabilityNet__C = value;
	}

	/**
	 * Gets the value of the cve__OpaqueIdValidThrough__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__OpaqueIdValidThrough__C() {
		return cve__OpaqueIdValidThrough__C;
	}

	/**
	 * Sets the value of the cve__OpaqueIdValidThrough__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__OpaqueIdValidThrough__C(XMLGregorianCalendar value) {
		this.cve__OpaqueIdValidThrough__C = value;
	}

	/**
	 * Gets the value of the cve__OpaqueId__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__OpaqueId__C() {
		return cve__OpaqueId__C;
	}

	/**
	 * Sets the value of the cve__OpaqueId__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__OpaqueId__C(String value) {
		this.cve__OpaqueId__C = value;
	}

	/**
	 * Gets the value of the cve__OpenRequiredTaskCount__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__OpenRequiredTaskCount__C() {
		return cve__OpenRequiredTaskCount__C;
	}

	/**
	 * Sets the value of the cve__OpenRequiredTaskCount__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__OpenRequiredTaskCount__C(Double value) {
		this.cve__OpenRequiredTaskCount__C = value;
	}

	/**
	 * Gets the value of the cve__OpenTaskCount__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__OpenTaskCount__C() {
		return cve__OpenTaskCount__C;
	}

	/**
	 * Sets the value of the cve__OpenTaskCount__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__OpenTaskCount__C(Double value) {
		this.cve__OpenTaskCount__C = value;
	}

	/**
	 * Gets the value of the cve__OriginalName__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__OriginalName__C() {
		return cve__OriginalName__C;
	}

	/**
	 * Sets the value of the cve__OriginalName__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__OriginalName__C(String value) {
		this.cve__OriginalName__C = value;
	}

	/**
	 * Gets the value of the cve__OverpaymentBeforeTax__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__OverpaymentBeforeTax__C() {
		return cve__OverpaymentBeforeTax__C;
	}

	/**
	 * Sets the value of the cve__OverpaymentBeforeTax__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__OverpaymentBeforeTax__C(Double value) {
		this.cve__OverpaymentBeforeTax__C = value;
	}

	/**
	 * Gets the value of the cve__OverpaymentLastCalculated__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__OverpaymentLastCalculated__C() {
		return cve__OverpaymentLastCalculated__C;
	}

	/**
	 * Sets the value of the cve__OverpaymentLastCalculated__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__OverpaymentLastCalculated__C(XMLGregorianCalendar value) {
		this.cve__OverpaymentLastCalculated__C = value;
	}

	/**
	 * Gets the value of the cve__OverpaymentNet__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__OverpaymentNet__C() {
		return cve__OverpaymentNet__C;
	}

	/**
	 * Sets the value of the cve__OverpaymentNet__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__OverpaymentNet__C(Double value) {
		this.cve__OverpaymentNet__C = value;
	}

	/**
	 * Gets the value of the cve__PaymentSpecifications__R property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCve__PaymentSpecifications__R() {
		return cve__PaymentSpecifications__R;
	}

	/**
	 * Sets the value of the cve__PaymentSpecifications__R property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCve__PaymentSpecifications__R(QueryResultType value) {
		this.cve__PaymentSpecifications__R = value;
	}

	/**
	 * Gets the value of the cve__Payments__R property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCve__Payments__R() {
		return cve__Payments__R;
	}

	/**
	 * Sets the value of the cve__Payments__R property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCve__Payments__R(QueryResultType value) {
		this.cve__Payments__R = value;
	}

	/**
	 * Gets the value of the cve__PendingDate__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__PendingDate__C() {
		return cve__PendingDate__C;
	}

	/**
	 * Sets the value of the cve__PendingDate__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__PendingDate__C(XMLGregorianCalendar value) {
		this.cve__PendingDate__C = value;
	}

	/**
	 * Gets the value of the cve__PerformanceGuarantee__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__PerformanceGuarantee__C() {
		return cve__PerformanceGuarantee__C;
	}

	/**
	 * Sets the value of the cve__PerformanceGuarantee__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__PerformanceGuarantee__C(String value) {
		this.cve__PerformanceGuarantee__C = value;
	}

	/**
	 * Gets the value of the cve__PolicyPremiumPaidThrough__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__PolicyPremiumPaidThrough__C() {
		return cve__PolicyPremiumPaidThrough__C;
	}

	/**
	 * Sets the value of the cve__PolicyPremiumPaidThrough__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__PolicyPremiumPaidThrough__C(XMLGregorianCalendar value) {
		this.cve__PolicyPremiumPaidThrough__C = value;
	}

	/**
	 * Gets the value of the cve__PolicyRelationship__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__PolicyRelationship__C() {
		return cve__PolicyRelationship__C;
	}

	/**
	 * Sets the value of the cve__PolicyRelationship__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__PolicyRelationship__C(String value) {
		this.cve__PolicyRelationship__C = value;
	}

	/**
	 * Gets the value of the cve__PolicyRelationship__R property.
	 * 
	 * @return possible object is {@link Cve__PolicyRelationship__C }
	 * 
	 */
	public Cve__PolicyRelationship__C getCve__PolicyRelationship__R() {
		return cve__PolicyRelationship__R;
	}

	/**
	 * Sets the value of the cve__PolicyRelationship__R property.
	 * 
	 * @param value
	 *            allowed object is {@link Cve__PolicyRelationship__C }
	 * 
	 */
	public void setCve__PolicyRelationship__R(Cve__PolicyRelationship__C value) {
		this.cve__PolicyRelationship__R = value;
	}

	/**
	 * Gets the value of the cve__Policy__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__Policy__C() {
		return cve__Policy__C;
	}

	/**
	 * Sets the value of the cve__Policy__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__Policy__C(String value) {
		this.cve__Policy__C = value;
	}

	/**
	 * Gets the value of the cve__Policy__R property.
	 * 
	 * @return possible object is {@link Cve__Policy__C }
	 * 
	 */
	public Cve__Policy__C getCve__Policy__R() {
		return cve__Policy__R;
	}

	/**
	 * Sets the value of the cve__Policy__R property.
	 * 
	 * @param value
	 *            allowed object is {@link Cve__Policy__C }
	 * 
	 */
	public void setCve__Policy__R(Cve__Policy__C value) {
		this.cve__Policy__R = value;
	}

	/**
	 * Gets the value of the cve__PrecedingClaim__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__PrecedingClaim__C() {
		return cve__PrecedingClaim__C;
	}

	/**
	 * Sets the value of the cve__PrecedingClaim__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__PrecedingClaim__C(String value) {
		this.cve__PrecedingClaim__C = value;
	}

	/**
	 * Gets the value of the cve__PrecedingClaim__R property.
	 * 
	 * @return possible object is {@link Cve__Claim__C }
	 * 
	 */
	public Cve__Claim__C getCve__PrecedingClaim__R() {
		return cve__PrecedingClaim__R;
	}

	/**
	 * Sets the value of the cve__PrecedingClaim__R property.
	 * 
	 * @param value
	 *            allowed object is {@link Cve__Claim__C }
	 * 
	 */
	public void setCve__PrecedingClaim__R(Cve__Claim__C value) {
		this.cve__PrecedingClaim__R = value;
	}

	/**
	 * Gets the value of the cve__QuestionsLanguage__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__QuestionsLanguage__C() {
		return cve__QuestionsLanguage__C;
	}

	/**
	 * Sets the value of the cve__QuestionsLanguage__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__QuestionsLanguage__C(String value) {
		this.cve__QuestionsLanguage__C = value;
	}

	/**
	 * Gets the value of the cve__ReopenedDate__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__ReopenedDate__C() {
		return cve__ReopenedDate__C;
	}

	/**
	 * Sets the value of the cve__ReopenedDate__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__ReopenedDate__C(XMLGregorianCalendar value) {
		this.cve__ReopenedDate__C = value;
	}

	/**
	 * Gets the value of the cve__Reopened__C property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCve__Reopened__C() {
		return cve__Reopened__C;
	}

	/**
	 * Sets the value of the cve__Reopened__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCve__Reopened__C(Boolean value) {
		this.cve__Reopened__C = value;
	}

	/**
	 * Gets the value of the cve__ReturnToWorkDate__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__ReturnToWorkDate__C() {
		return cve__ReturnToWorkDate__C;
	}

	/**
	 * Sets the value of the cve__ReturnToWorkDate__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__ReturnToWorkDate__C(XMLGregorianCalendar value) {
		this.cve__ReturnToWorkDate__C = value;
	}

	/**
	 * Gets the value of the cve__ReturnToWorkType__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__ReturnToWorkType__C() {
		return cve__ReturnToWorkType__C;
	}

	/**
	 * Sets the value of the cve__ReturnToWorkType__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__ReturnToWorkType__C(String value) {
		this.cve__ReturnToWorkType__C = value;
	}

	/**
	 * Gets the value of the cve__Status__C property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCve__Status__C() {
		return cve__Status__C;
	}

	/**
	 * Sets the value of the cve__Status__C property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCve__Status__C(String value) {
		this.cve__Status__C = value;
	}

	/**
	 * Gets the value of the cve__SucceedingClaims__R property.
	 * 
	 * @return possible object is {@link QueryResultType }
	 * 
	 */
	public QueryResultType getCve__SucceedingClaims__R() {
		return cve__SucceedingClaims__R;
	}

	/**
	 * Sets the value of the cve__SucceedingClaims__R property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryResultType }
	 * 
	 */
	public void setCve__SucceedingClaims__R(QueryResultType value) {
		this.cve__SucceedingClaims__R = value;
	}

	/**
	 * Gets the value of the cve__ToBeIncurredBeforeTax__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__ToBeIncurredBeforeTax__C() {
		return cve__ToBeIncurredBeforeTax__C;
	}

	/**
	 * Sets the value of the cve__ToBeIncurredBeforeTax__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__ToBeIncurredBeforeTax__C(Double value) {
		this.cve__ToBeIncurredBeforeTax__C = value;
	}

	/**
	 * Gets the value of the cve__ToBeIncurredLastCalculated__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__ToBeIncurredLastCalculated__C() {
		return cve__ToBeIncurredLastCalculated__C;
	}

	/**
	 * Sets the value of the cve__ToBeIncurredLastCalculated__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__ToBeIncurredLastCalculated__C(XMLGregorianCalendar value) {
		this.cve__ToBeIncurredLastCalculated__C = value;
	}

	/**
	 * Gets the value of the cve__ToBeIncurredNet__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__ToBeIncurredNet__C() {
		return cve__ToBeIncurredNet__C;
	}

	/**
	 * Sets the value of the cve__ToBeIncurredNet__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__ToBeIncurredNet__C(Double value) {
		this.cve__ToBeIncurredNet__C = value;
	}

	/**
	 * Gets the value of the cve__TotalIncurredAsOf__C property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCve__TotalIncurredAsOf__C() {
		return cve__TotalIncurredAsOf__C;
	}

	/**
	 * Sets the value of the cve__TotalIncurredAsOf__C property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCve__TotalIncurredAsOf__C(XMLGregorianCalendar value) {
		this.cve__TotalIncurredAsOf__C = value;
	}

	/**
	 * Gets the value of the cve__TotalIncurred__C property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getCve__TotalIncurred__C() {
		return cve__TotalIncurred__C;
	}

	/**
	 * Sets the value of the cve__TotalIncurred__C property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setCve__TotalIncurred__C(Double value) {
		this.cve__TotalIncurred__C = value;
	}

}
