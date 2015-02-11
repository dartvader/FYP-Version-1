
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__PaymentSpecification__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__PaymentSpecification__c">
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
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__Adjustments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Allocations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__AmountPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimed__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimed__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__BenefitClaimed__c" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimeds__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Claim__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Claim__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Claim__c" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantDOB__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccountName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ExpenseType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Explanation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IncurredBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IncurredLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__IncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Indicator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__InvoiceDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__InvoiceNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LastModified__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityCalculationExplanation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LiabilityThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__MaximumAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Note__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__NumberOfPaymentPeriods__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NumberOfPayments__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaidDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaidStart__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PaidThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PaidWeekDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaymentCalculationDate__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__PaymentCalculationExplanation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentOption__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSchedule__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSchedule__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSchedule__c" minOccurs="0"/>
 *         &lt;element name="cve__PaymentType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Payments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Period__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RecordTypeName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ServiceStart__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__ServiceThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Start__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__SubmittedAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Through__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredBeforeTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredLastCalculated__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__ToBeIncurredNet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__UnallocatedPayments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__PaymentSpecification__c", propOrder = {
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
    "owner",
    "ownerId",
    "processInstances",
    "processSteps",
    "recordType",
    "recordTypeId",
    "systemModstamp",
    "tasks",
    "topicAssignments",
    "userRecordAccess",
    "cve__Adjustments__R",
    "cve__Allocations__R",
    "cve__AmountPeriod__C",
    "cve__Amount__C",
    "cve__BenefitClaimed__C",
    "cve__BenefitClaimed__R",
    "cve__BenefitClaimeds__R",
    "cve__Claim__C",
    "cve__Claim__R",
    "cve__ClaimantDOB__C",
    "cve__ClaimantInsuredAccountName__C",
    "cve__ClaimantInsuredAccount__C",
    "cve__ClaimantInsuredAccount__R",
    "cve__ClaimantName__C",
    "cve__ExpenseType__C",
    "cve__Explanation__C",
    "cve__IncurredBeforeTax__C",
    "cve__IncurredLastCalculated__C",
    "cve__IncurredNet__C",
    "cve__Indicator__C",
    "cve__InvoiceDate__C",
    "cve__InvoiceNumber__C",
    "cve__LastModified__C",
    "cve__LiabilityBeforeTax__C",
    "cve__LiabilityCalculationExplanation__C",
    "cve__LiabilityLastCalculated__C",
    "cve__LiabilityNet__C",
    "cve__LiabilityThrough__C",
    "cve__MaximumAmount__C",
    "cve__MinimumAmount__C",
    "cve__Note__C",
    "cve__NumberOfPaymentPeriods__C",
    "cve__NumberOfPayments__C",
    "cve__OverpaymentBeforeTax__C",
    "cve__OverpaymentLastCalculated__C",
    "cve__OverpaymentNet__C",
    "cve__PaidDays__C",
    "cve__PaidStart__C",
    "cve__PaidThrough__C",
    "cve__PaidWeekDays__C",
    "cve__PaymentCalculationDate__C",
    "cve__PaymentCalculationExplanation__C",
    "cve__PaymentOption__C",
    "cve__PaymentSchedule__C",
    "cve__PaymentSchedule__R",
    "cve__PaymentType__C",
    "cve__Payments__R",
    "cve__Period__C",
    "cve__RecordTypeName__C",
    "cve__ServiceStart__C",
    "cve__ServiceThrough__C",
    "cve__Start__C",
    "cve__SubmittedAmount__C",
    "cve__Through__C",
    "cve__ToBeIncurredBeforeTax__C",
    "cve__ToBeIncurredLastCalculated__C",
    "cve__ToBeIncurredNet__C",
    "cve__UnallocatedPayments__R"
})
public class Cve__PaymentSpecification__C
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
    @XmlElement(name = "Owner", nillable = true)
    protected Name owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
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
    @XmlElement(name = "cve__Adjustments__r", nillable = true)
    protected QueryResultType cve__Adjustments__R;
    @XmlElement(name = "cve__Allocations__r", nillable = true)
    protected QueryResultType cve__Allocations__R;
    @XmlElement(name = "cve__AmountPeriod__c", nillable = true)
    protected String cve__AmountPeriod__C;
    @XmlElement(name = "cve__Amount__c", nillable = true)
    protected Double cve__Amount__C;
    @XmlElement(name = "cve__BenefitClaimed__c", nillable = true)
    protected String cve__BenefitClaimed__C;
    @XmlElement(name = "cve__BenefitClaimed__r", nillable = true)
    protected Cve__BenefitClaimed__C cve__BenefitClaimed__R;
    @XmlElement(name = "cve__BenefitClaimeds__r", nillable = true)
    protected QueryResultType cve__BenefitClaimeds__R;
    @XmlElement(name = "cve__Claim__c", nillable = true)
    protected String cve__Claim__C;
    @XmlElement(name = "cve__Claim__r", nillable = true)
    protected Cve__Claim__C cve__Claim__R;
    @XmlElement(name = "cve__ClaimantDOB__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__ClaimantDOB__C;
    @XmlElement(name = "cve__ClaimantInsuredAccountName__c", nillable = true)
    protected String cve__ClaimantInsuredAccountName__C;
    @XmlElement(name = "cve__ClaimantInsuredAccount__c", nillable = true)
    protected String cve__ClaimantInsuredAccount__C;
    @XmlElement(name = "cve__ClaimantInsuredAccount__r", nillable = true)
    protected Account cve__ClaimantInsuredAccount__R;
    @XmlElement(name = "cve__ClaimantName__c", nillable = true)
    protected String cve__ClaimantName__C;
    @XmlElement(name = "cve__ExpenseType__c", nillable = true)
    protected String cve__ExpenseType__C;
    @XmlElement(name = "cve__Explanation__c", nillable = true)
    protected String cve__Explanation__C;
    @XmlElement(name = "cve__IncurredBeforeTax__c", nillable = true)
    protected Double cve__IncurredBeforeTax__C;
    @XmlElement(name = "cve__IncurredLastCalculated__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__IncurredLastCalculated__C;
    @XmlElement(name = "cve__IncurredNet__c", nillable = true)
    protected Double cve__IncurredNet__C;
    @XmlElement(name = "cve__Indicator__c", nillable = true)
    protected String cve__Indicator__C;
    @XmlElement(name = "cve__InvoiceDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__InvoiceDate__C;
    @XmlElement(name = "cve__InvoiceNumber__c", nillable = true)
    protected String cve__InvoiceNumber__C;
    @XmlElement(name = "cve__LastModified__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__LastModified__C;
    @XmlElement(name = "cve__LiabilityBeforeTax__c", nillable = true)
    protected Double cve__LiabilityBeforeTax__C;
    @XmlElement(name = "cve__LiabilityCalculationExplanation__c", nillable = true)
    protected String cve__LiabilityCalculationExplanation__C;
    @XmlElement(name = "cve__LiabilityLastCalculated__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__LiabilityLastCalculated__C;
    @XmlElement(name = "cve__LiabilityNet__c", nillable = true)
    protected Double cve__LiabilityNet__C;
    @XmlElement(name = "cve__LiabilityThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__LiabilityThrough__C;
    @XmlElement(name = "cve__MaximumAmount__c", nillable = true)
    protected Double cve__MaximumAmount__C;
    @XmlElement(name = "cve__MinimumAmount__c", nillable = true)
    protected Double cve__MinimumAmount__C;
    @XmlElement(name = "cve__Note__c", nillable = true)
    protected String cve__Note__C;
    @XmlElement(name = "cve__NumberOfPaymentPeriods__c", nillable = true)
    protected Double cve__NumberOfPaymentPeriods__C;
    @XmlElement(name = "cve__NumberOfPayments__c", nillable = true)
    protected Double cve__NumberOfPayments__C;
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
    @XmlElement(name = "cve__PaymentCalculationDate__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__PaymentCalculationDate__C;
    @XmlElement(name = "cve__PaymentCalculationExplanation__c", nillable = true)
    protected String cve__PaymentCalculationExplanation__C;
    @XmlElement(name = "cve__PaymentOption__c", nillable = true)
    protected String cve__PaymentOption__C;
    @XmlElement(name = "cve__PaymentSchedule__c", nillable = true)
    protected String cve__PaymentSchedule__C;
    @XmlElement(name = "cve__PaymentSchedule__r", nillable = true)
    protected Cve__PaymentSchedule__C cve__PaymentSchedule__R;
    @XmlElement(name = "cve__PaymentType__c", nillable = true)
    protected String cve__PaymentType__C;
    @XmlElement(name = "cve__Payments__r", nillable = true)
    protected QueryResultType cve__Payments__R;
    @XmlElement(name = "cve__Period__c", nillable = true)
    protected String cve__Period__C;
    @XmlElement(name = "cve__RecordTypeName__c", nillable = true)
    protected String cve__RecordTypeName__C;
    @XmlElement(name = "cve__ServiceStart__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__ServiceStart__C;
    @XmlElement(name = "cve__ServiceThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__ServiceThrough__C;
    @XmlElement(name = "cve__Start__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Start__C;
    @XmlElement(name = "cve__SubmittedAmount__c", nillable = true)
    protected Double cve__SubmittedAmount__C;
    @XmlElement(name = "cve__Through__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Through__C;
    @XmlElement(name = "cve__ToBeIncurredBeforeTax__c", nillable = true)
    protected Double cve__ToBeIncurredBeforeTax__C;
    @XmlElement(name = "cve__ToBeIncurredLastCalculated__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__ToBeIncurredLastCalculated__C;
    @XmlElement(name = "cve__ToBeIncurredNet__c", nillable = true)
    protected Double cve__ToBeIncurredNet__C;
    @XmlElement(name = "cve__UnallocatedPayments__r", nillable = true)
    protected QueryResultType cve__UnallocatedPayments__R;

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
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setOwner(Name value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
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
     * Gets the value of the cve__Adjustments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Adjustments__R() {
        return cve__Adjustments__R;
    }

    /**
     * Sets the value of the cve__Adjustments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Adjustments__R(QueryResultType value) {
        this.cve__Adjustments__R = value;
    }

    /**
     * Gets the value of the cve__Allocations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Allocations__R() {
        return cve__Allocations__R;
    }

    /**
     * Sets the value of the cve__Allocations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Allocations__R(QueryResultType value) {
        this.cve__Allocations__R = value;
    }

    /**
     * Gets the value of the cve__AmountPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AmountPeriod__C() {
        return cve__AmountPeriod__C;
    }

    /**
     * Sets the value of the cve__AmountPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AmountPeriod__C(String value) {
        this.cve__AmountPeriod__C = value;
    }

    /**
     * Gets the value of the cve__Amount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Amount__C() {
        return cve__Amount__C;
    }

    /**
     * Sets the value of the cve__Amount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Amount__C(Double value) {
        this.cve__Amount__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimed__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitClaimed__C() {
        return cve__BenefitClaimed__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitClaimed__C(String value) {
        this.cve__BenefitClaimed__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimed__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__BenefitClaimed__C }
     *     
     */
    public Cve__BenefitClaimed__C getCve__BenefitClaimed__R() {
        return cve__BenefitClaimed__R;
    }

    /**
     * Sets the value of the cve__BenefitClaimed__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__BenefitClaimed__C }
     *     
     */
    public void setCve__BenefitClaimed__R(Cve__BenefitClaimed__C value) {
        this.cve__BenefitClaimed__R = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimeds__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__BenefitClaimeds__R() {
        return cve__BenefitClaimeds__R;
    }

    /**
     * Sets the value of the cve__BenefitClaimeds__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__BenefitClaimeds__R(QueryResultType value) {
        this.cve__BenefitClaimeds__R = value;
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
     * Gets the value of the cve__ClaimantDOB__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__ClaimantDOB__C() {
        return cve__ClaimantDOB__C;
    }

    /**
     * Sets the value of the cve__ClaimantDOB__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__ClaimantDOB__C(XMLGregorianCalendar value) {
        this.cve__ClaimantDOB__C = value;
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
     * Gets the value of the cve__ClaimantName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimantName__C() {
        return cve__ClaimantName__C;
    }

    /**
     * Sets the value of the cve__ClaimantName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimantName__C(String value) {
        this.cve__ClaimantName__C = value;
    }

    /**
     * Gets the value of the cve__ExpenseType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ExpenseType__C() {
        return cve__ExpenseType__C;
    }

    /**
     * Sets the value of the cve__ExpenseType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ExpenseType__C(String value) {
        this.cve__ExpenseType__C = value;
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
     * Gets the value of the cve__Indicator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Indicator__C() {
        return cve__Indicator__C;
    }

    /**
     * Sets the value of the cve__Indicator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Indicator__C(String value) {
        this.cve__Indicator__C = value;
    }

    /**
     * Gets the value of the cve__InvoiceDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__InvoiceDate__C() {
        return cve__InvoiceDate__C;
    }

    /**
     * Sets the value of the cve__InvoiceDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__InvoiceDate__C(XMLGregorianCalendar value) {
        this.cve__InvoiceDate__C = value;
    }

    /**
     * Gets the value of the cve__InvoiceNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__InvoiceNumber__C() {
        return cve__InvoiceNumber__C;
    }

    /**
     * Sets the value of the cve__InvoiceNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__InvoiceNumber__C(String value) {
        this.cve__InvoiceNumber__C = value;
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
     * Gets the value of the cve__LiabilityCalculationExplanation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LiabilityCalculationExplanation__C() {
        return cve__LiabilityCalculationExplanation__C;
    }

    /**
     * Sets the value of the cve__LiabilityCalculationExplanation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LiabilityCalculationExplanation__C(String value) {
        this.cve__LiabilityCalculationExplanation__C = value;
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
     * Gets the value of the cve__LiabilityThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LiabilityThrough__C() {
        return cve__LiabilityThrough__C;
    }

    /**
     * Sets the value of the cve__LiabilityThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LiabilityThrough__C(XMLGregorianCalendar value) {
        this.cve__LiabilityThrough__C = value;
    }

    /**
     * Gets the value of the cve__MaximumAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumAmount__C() {
        return cve__MaximumAmount__C;
    }

    /**
     * Sets the value of the cve__MaximumAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumAmount__C(Double value) {
        this.cve__MaximumAmount__C = value;
    }

    /**
     * Gets the value of the cve__MinimumAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumAmount__C() {
        return cve__MinimumAmount__C;
    }

    /**
     * Sets the value of the cve__MinimumAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumAmount__C(Double value) {
        this.cve__MinimumAmount__C = value;
    }

    /**
     * Gets the value of the cve__Note__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Note__C() {
        return cve__Note__C;
    }

    /**
     * Sets the value of the cve__Note__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Note__C(String value) {
        this.cve__Note__C = value;
    }

    /**
     * Gets the value of the cve__NumberOfPaymentPeriods__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NumberOfPaymentPeriods__C() {
        return cve__NumberOfPaymentPeriods__C;
    }

    /**
     * Sets the value of the cve__NumberOfPaymentPeriods__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NumberOfPaymentPeriods__C(Double value) {
        this.cve__NumberOfPaymentPeriods__C = value;
    }

    /**
     * Gets the value of the cve__NumberOfPayments__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NumberOfPayments__C() {
        return cve__NumberOfPayments__C;
    }

    /**
     * Sets the value of the cve__NumberOfPayments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NumberOfPayments__C(Double value) {
        this.cve__NumberOfPayments__C = value;
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
     * Gets the value of the cve__PaymentCalculationDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PaymentCalculationDate__C() {
        return cve__PaymentCalculationDate__C;
    }

    /**
     * Sets the value of the cve__PaymentCalculationDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PaymentCalculationDate__C(XMLGregorianCalendar value) {
        this.cve__PaymentCalculationDate__C = value;
    }

    /**
     * Gets the value of the cve__PaymentCalculationExplanation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentCalculationExplanation__C() {
        return cve__PaymentCalculationExplanation__C;
    }

    /**
     * Sets the value of the cve__PaymentCalculationExplanation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentCalculationExplanation__C(String value) {
        this.cve__PaymentCalculationExplanation__C = value;
    }

    /**
     * Gets the value of the cve__PaymentOption__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentOption__C() {
        return cve__PaymentOption__C;
    }

    /**
     * Sets the value of the cve__PaymentOption__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentOption__C(String value) {
        this.cve__PaymentOption__C = value;
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
     * Gets the value of the cve__PaymentType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentType__C() {
        return cve__PaymentType__C;
    }

    /**
     * Sets the value of the cve__PaymentType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentType__C(String value) {
        this.cve__PaymentType__C = value;
    }

    /**
     * Gets the value of the cve__Payments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Payments__R() {
        return cve__Payments__R;
    }

    /**
     * Sets the value of the cve__Payments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Payments__R(QueryResultType value) {
        this.cve__Payments__R = value;
    }

    /**
     * Gets the value of the cve__Period__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Period__C() {
        return cve__Period__C;
    }

    /**
     * Sets the value of the cve__Period__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Period__C(String value) {
        this.cve__Period__C = value;
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
     * Gets the value of the cve__ServiceStart__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__ServiceStart__C() {
        return cve__ServiceStart__C;
    }

    /**
     * Sets the value of the cve__ServiceStart__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__ServiceStart__C(XMLGregorianCalendar value) {
        this.cve__ServiceStart__C = value;
    }

    /**
     * Gets the value of the cve__ServiceThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__ServiceThrough__C() {
        return cve__ServiceThrough__C;
    }

    /**
     * Sets the value of the cve__ServiceThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__ServiceThrough__C(XMLGregorianCalendar value) {
        this.cve__ServiceThrough__C = value;
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
     * Gets the value of the cve__SubmittedAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SubmittedAmount__C() {
        return cve__SubmittedAmount__C;
    }

    /**
     * Sets the value of the cve__SubmittedAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SubmittedAmount__C(Double value) {
        this.cve__SubmittedAmount__C = value;
    }

    /**
     * Gets the value of the cve__Through__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Through__C() {
        return cve__Through__C;
    }

    /**
     * Sets the value of the cve__Through__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Through__C(XMLGregorianCalendar value) {
        this.cve__Through__C = value;
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
     * Gets the value of the cve__UnallocatedPayments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__UnallocatedPayments__R() {
        return cve__UnallocatedPayments__R;
    }

    /**
     * Sets the value of the cve__UnallocatedPayments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__UnallocatedPayments__R(QueryResultType value) {
        this.cve__UnallocatedPayments__R = value;
    }

}
