
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__Payment__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__Payment__c">
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
 *         &lt;element name="cve__Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__AdjustedBenefitStartDateApplied__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AdviceToPay__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__BankAccountNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankAccountType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankPhone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankRoutingNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CheckOrEftNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Claim__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Claim__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Claim__c" minOccurs="0"/>
 *         &lt;element name="cve__ConsolidatedPaymentStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="cve__Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerMatchingFica__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerMatchingMedicare__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ExplanationOfBenefits__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__FicaTaxableBenefitAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IssueOverride__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Issue__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__MailingAddress__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingCity__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingCountry__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingPostalCode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingState__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingStreet__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__NetAfterTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NetBeforeTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Net__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NumberOfPaymentsConsolidated__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OvernightDelivery__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Paid__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Payable__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PayeeClaimRelationshipType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PayeeName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentAssociationsFrom__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PaymentAssociationsTo__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PaymentMethod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecification__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecification__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSpecification__c" minOccurs="0"/>
 *         &lt;element name="cve__Print__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__RecordTypeName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Release__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Start__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__StopOrVoid__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TaxIdNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Taxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Testing__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Through__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__UnallocatedPayment__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__UnallocatedPayment__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__UnallocatedPayment__c" minOccurs="0"/>
 *         &lt;element name="cve__WeekDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__Payment__c", propOrder = {
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
    "cve__Account__C",
    "cve__Account__R",
    "cve__AdjustedBenefitStartDateApplied__C",
    "cve__AdviceToPay__C",
    "cve__BankAccountNumber__C",
    "cve__BankAccountType__C",
    "cve__BankName__C",
    "cve__BankPhone__C",
    "cve__BankRoutingNumber__C",
    "cve__CheckOrEftNumber__C",
    "cve__Claim__C",
    "cve__Claim__R",
    "cve__ConsolidatedPaymentStatus__C",
    "cve__Contact__C",
    "cve__Contact__R",
    "cve__Days__C",
    "cve__EmployerMatchingFica__C",
    "cve__EmployerMatchingMedicare__C",
    "cve__ExplanationOfBenefits__R",
    "cve__FicaTaxableBenefitAmount__C",
    "cve__IssueOverride__C",
    "cve__Issue__C",
    "cve__MailingAddress__C",
    "cve__MailingCity__C",
    "cve__MailingCountry__C",
    "cve__MailingPostalCode__C",
    "cve__MailingState__C",
    "cve__MailingStreet__C",
    "cve__NetAfterTaxes__C",
    "cve__NetBeforeTaxes__C",
    "cve__Net__C",
    "cve__NumberOfPaymentsConsolidated__C",
    "cve__OvernightDelivery__C",
    "cve__Paid__C",
    "cve__Payable__C",
    "cve__PayeeClaimRelationshipType__C",
    "cve__PayeeName__C",
    "cve__PaymentAssociationsFrom__R",
    "cve__PaymentAssociationsTo__R",
    "cve__PaymentMethod__C",
    "cve__PaymentSpecification__C",
    "cve__PaymentSpecification__R",
    "cve__Print__C",
    "cve__RecordTypeName__C",
    "cve__Release__C",
    "cve__Start__C",
    "cve__Status__C",
    "cve__StopOrVoid__C",
    "cve__TaxIdNumber__C",
    "cve__Taxes__C",
    "cve__Testing__C",
    "cve__Through__C",
    "cve__UnallocatedPayment__C",
    "cve__UnallocatedPayment__R",
    "cve__WeekDays__C"
})
public class Cve__Payment__C
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
    @XmlElement(name = "cve__Account__c", nillable = true)
    protected String cve__Account__C;
    @XmlElement(name = "cve__Account__r", nillable = true)
    protected Account cve__Account__R;
    @XmlElement(name = "cve__AdjustedBenefitStartDateApplied__c", nillable = true)
    protected Boolean cve__AdjustedBenefitStartDateApplied__C;
    @XmlElement(name = "cve__AdviceToPay__c", nillable = true)
    protected Boolean cve__AdviceToPay__C;
    @XmlElement(name = "cve__BankAccountNumber__c", nillable = true)
    protected String cve__BankAccountNumber__C;
    @XmlElement(name = "cve__BankAccountType__c", nillable = true)
    protected String cve__BankAccountType__C;
    @XmlElement(name = "cve__BankName__c", nillable = true)
    protected String cve__BankName__C;
    @XmlElement(name = "cve__BankPhone__c", nillable = true)
    protected String cve__BankPhone__C;
    @XmlElement(name = "cve__BankRoutingNumber__c", nillable = true)
    protected String cve__BankRoutingNumber__C;
    @XmlElement(name = "cve__CheckOrEftNumber__c", nillable = true)
    protected String cve__CheckOrEftNumber__C;
    @XmlElement(name = "cve__Claim__c", nillable = true)
    protected String cve__Claim__C;
    @XmlElement(name = "cve__Claim__r", nillable = true)
    protected Cve__Claim__C cve__Claim__R;
    @XmlElement(name = "cve__ConsolidatedPaymentStatus__c", nillable = true)
    protected String cve__ConsolidatedPaymentStatus__C;
    @XmlElement(name = "cve__Contact__c", nillable = true)
    protected String cve__Contact__C;
    @XmlElement(name = "cve__Contact__r", nillable = true)
    protected Contact cve__Contact__R;
    @XmlElement(name = "cve__Days__c", nillable = true)
    protected Double cve__Days__C;
    @XmlElement(name = "cve__EmployerMatchingFica__c", nillable = true)
    protected Double cve__EmployerMatchingFica__C;
    @XmlElement(name = "cve__EmployerMatchingMedicare__c", nillable = true)
    protected Double cve__EmployerMatchingMedicare__C;
    @XmlElement(name = "cve__ExplanationOfBenefits__r", nillable = true)
    protected QueryResultType cve__ExplanationOfBenefits__R;
    @XmlElement(name = "cve__FicaTaxableBenefitAmount__c", nillable = true)
    protected Double cve__FicaTaxableBenefitAmount__C;
    @XmlElement(name = "cve__IssueOverride__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__IssueOverride__C;
    @XmlElement(name = "cve__Issue__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Issue__C;
    @XmlElement(name = "cve__MailingAddress__c", nillable = true)
    protected String cve__MailingAddress__C;
    @XmlElement(name = "cve__MailingCity__c", nillable = true)
    protected String cve__MailingCity__C;
    @XmlElement(name = "cve__MailingCountry__c", nillable = true)
    protected String cve__MailingCountry__C;
    @XmlElement(name = "cve__MailingPostalCode__c", nillable = true)
    protected String cve__MailingPostalCode__C;
    @XmlElement(name = "cve__MailingState__c", nillable = true)
    protected String cve__MailingState__C;
    @XmlElement(name = "cve__MailingStreet__c", nillable = true)
    protected String cve__MailingStreet__C;
    @XmlElement(name = "cve__NetAfterTaxes__c", nillable = true)
    protected Double cve__NetAfterTaxes__C;
    @XmlElement(name = "cve__NetBeforeTaxes__c", nillable = true)
    protected Double cve__NetBeforeTaxes__C;
    @XmlElement(name = "cve__Net__c", nillable = true)
    protected Double cve__Net__C;
    @XmlElement(name = "cve__NumberOfPaymentsConsolidated__c", nillable = true)
    protected Double cve__NumberOfPaymentsConsolidated__C;
    @XmlElement(name = "cve__OvernightDelivery__c", nillable = true)
    protected Boolean cve__OvernightDelivery__C;
    @XmlElement(name = "cve__Paid__c", nillable = true)
    protected Boolean cve__Paid__C;
    @XmlElement(name = "cve__Payable__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Payable__C;
    @XmlElement(name = "cve__PayeeClaimRelationshipType__c", nillable = true)
    protected String cve__PayeeClaimRelationshipType__C;
    @XmlElement(name = "cve__PayeeName__c", nillable = true)
    protected String cve__PayeeName__C;
    @XmlElement(name = "cve__PaymentAssociationsFrom__r", nillable = true)
    protected QueryResultType cve__PaymentAssociationsFrom__R;
    @XmlElement(name = "cve__PaymentAssociationsTo__r", nillable = true)
    protected QueryResultType cve__PaymentAssociationsTo__R;
    @XmlElement(name = "cve__PaymentMethod__c", nillable = true)
    protected String cve__PaymentMethod__C;
    @XmlElement(name = "cve__PaymentSpecification__c", nillable = true)
    protected String cve__PaymentSpecification__C;
    @XmlElement(name = "cve__PaymentSpecification__r", nillable = true)
    protected Cve__PaymentSpecification__C cve__PaymentSpecification__R;
    @XmlElement(name = "cve__Print__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Print__C;
    @XmlElement(name = "cve__RecordTypeName__c", nillable = true)
    protected String cve__RecordTypeName__C;
    @XmlElement(name = "cve__Release__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Release__C;
    @XmlElement(name = "cve__Start__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Start__C;
    @XmlElement(name = "cve__Status__c", nillable = true)
    protected String cve__Status__C;
    @XmlElement(name = "cve__StopOrVoid__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__StopOrVoid__C;
    @XmlElement(name = "cve__TaxIdNumber__c", nillable = true)
    protected String cve__TaxIdNumber__C;
    @XmlElement(name = "cve__Taxes__c", nillable = true)
    protected Double cve__Taxes__C;
    @XmlElement(name = "cve__Testing__c", nillable = true)
    protected String cve__Testing__C;
    @XmlElement(name = "cve__Through__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Through__C;
    @XmlElement(name = "cve__UnallocatedPayment__c", nillable = true)
    protected String cve__UnallocatedPayment__C;
    @XmlElement(name = "cve__UnallocatedPayment__r", nillable = true)
    protected Cve__UnallocatedPayment__C cve__UnallocatedPayment__R;
    @XmlElement(name = "cve__WeekDays__c", nillable = true)
    protected Double cve__WeekDays__C;

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
     * Gets the value of the cve__Account__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Account__C() {
        return cve__Account__C;
    }

    /**
     * Sets the value of the cve__Account__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Account__C(String value) {
        this.cve__Account__C = value;
    }

    /**
     * Gets the value of the cve__Account__R property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCve__Account__R() {
        return cve__Account__R;
    }

    /**
     * Sets the value of the cve__Account__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCve__Account__R(Account value) {
        this.cve__Account__R = value;
    }

    /**
     * Gets the value of the cve__AdjustedBenefitStartDateApplied__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AdjustedBenefitStartDateApplied__C() {
        return cve__AdjustedBenefitStartDateApplied__C;
    }

    /**
     * Sets the value of the cve__AdjustedBenefitStartDateApplied__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AdjustedBenefitStartDateApplied__C(Boolean value) {
        this.cve__AdjustedBenefitStartDateApplied__C = value;
    }

    /**
     * Gets the value of the cve__AdviceToPay__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AdviceToPay__C() {
        return cve__AdviceToPay__C;
    }

    /**
     * Sets the value of the cve__AdviceToPay__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AdviceToPay__C(Boolean value) {
        this.cve__AdviceToPay__C = value;
    }

    /**
     * Gets the value of the cve__BankAccountNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankAccountNumber__C() {
        return cve__BankAccountNumber__C;
    }

    /**
     * Sets the value of the cve__BankAccountNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankAccountNumber__C(String value) {
        this.cve__BankAccountNumber__C = value;
    }

    /**
     * Gets the value of the cve__BankAccountType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankAccountType__C() {
        return cve__BankAccountType__C;
    }

    /**
     * Sets the value of the cve__BankAccountType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankAccountType__C(String value) {
        this.cve__BankAccountType__C = value;
    }

    /**
     * Gets the value of the cve__BankName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankName__C() {
        return cve__BankName__C;
    }

    /**
     * Sets the value of the cve__BankName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankName__C(String value) {
        this.cve__BankName__C = value;
    }

    /**
     * Gets the value of the cve__BankPhone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankPhone__C() {
        return cve__BankPhone__C;
    }

    /**
     * Sets the value of the cve__BankPhone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankPhone__C(String value) {
        this.cve__BankPhone__C = value;
    }

    /**
     * Gets the value of the cve__BankRoutingNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankRoutingNumber__C() {
        return cve__BankRoutingNumber__C;
    }

    /**
     * Sets the value of the cve__BankRoutingNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankRoutingNumber__C(String value) {
        this.cve__BankRoutingNumber__C = value;
    }

    /**
     * Gets the value of the cve__CheckOrEftNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CheckOrEftNumber__C() {
        return cve__CheckOrEftNumber__C;
    }

    /**
     * Sets the value of the cve__CheckOrEftNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CheckOrEftNumber__C(String value) {
        this.cve__CheckOrEftNumber__C = value;
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
     * Gets the value of the cve__ConsolidatedPaymentStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ConsolidatedPaymentStatus__C() {
        return cve__ConsolidatedPaymentStatus__C;
    }

    /**
     * Sets the value of the cve__ConsolidatedPaymentStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ConsolidatedPaymentStatus__C(String value) {
        this.cve__ConsolidatedPaymentStatus__C = value;
    }

    /**
     * Gets the value of the cve__Contact__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Contact__C() {
        return cve__Contact__C;
    }

    /**
     * Sets the value of the cve__Contact__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Contact__C(String value) {
        this.cve__Contact__C = value;
    }

    /**
     * Gets the value of the cve__Contact__R property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getCve__Contact__R() {
        return cve__Contact__R;
    }

    /**
     * Sets the value of the cve__Contact__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setCve__Contact__R(Contact value) {
        this.cve__Contact__R = value;
    }

    /**
     * Gets the value of the cve__Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Days__C() {
        return cve__Days__C;
    }

    /**
     * Sets the value of the cve__Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Days__C(Double value) {
        this.cve__Days__C = value;
    }

    /**
     * Gets the value of the cve__EmployerMatchingFica__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerMatchingFica__C() {
        return cve__EmployerMatchingFica__C;
    }

    /**
     * Sets the value of the cve__EmployerMatchingFica__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerMatchingFica__C(Double value) {
        this.cve__EmployerMatchingFica__C = value;
    }

    /**
     * Gets the value of the cve__EmployerMatchingMedicare__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerMatchingMedicare__C() {
        return cve__EmployerMatchingMedicare__C;
    }

    /**
     * Sets the value of the cve__EmployerMatchingMedicare__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerMatchingMedicare__C(Double value) {
        this.cve__EmployerMatchingMedicare__C = value;
    }

    /**
     * Gets the value of the cve__ExplanationOfBenefits__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__ExplanationOfBenefits__R() {
        return cve__ExplanationOfBenefits__R;
    }

    /**
     * Sets the value of the cve__ExplanationOfBenefits__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__ExplanationOfBenefits__R(QueryResultType value) {
        this.cve__ExplanationOfBenefits__R = value;
    }

    /**
     * Gets the value of the cve__FicaTaxableBenefitAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__FicaTaxableBenefitAmount__C() {
        return cve__FicaTaxableBenefitAmount__C;
    }

    /**
     * Sets the value of the cve__FicaTaxableBenefitAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__FicaTaxableBenefitAmount__C(Double value) {
        this.cve__FicaTaxableBenefitAmount__C = value;
    }

    /**
     * Gets the value of the cve__IssueOverride__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__IssueOverride__C() {
        return cve__IssueOverride__C;
    }

    /**
     * Sets the value of the cve__IssueOverride__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__IssueOverride__C(XMLGregorianCalendar value) {
        this.cve__IssueOverride__C = value;
    }

    /**
     * Gets the value of the cve__Issue__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Issue__C() {
        return cve__Issue__C;
    }

    /**
     * Sets the value of the cve__Issue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Issue__C(XMLGregorianCalendar value) {
        this.cve__Issue__C = value;
    }

    /**
     * Gets the value of the cve__MailingAddress__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingAddress__C() {
        return cve__MailingAddress__C;
    }

    /**
     * Sets the value of the cve__MailingAddress__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingAddress__C(String value) {
        this.cve__MailingAddress__C = value;
    }

    /**
     * Gets the value of the cve__MailingCity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingCity__C() {
        return cve__MailingCity__C;
    }

    /**
     * Sets the value of the cve__MailingCity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingCity__C(String value) {
        this.cve__MailingCity__C = value;
    }

    /**
     * Gets the value of the cve__MailingCountry__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingCountry__C() {
        return cve__MailingCountry__C;
    }

    /**
     * Sets the value of the cve__MailingCountry__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingCountry__C(String value) {
        this.cve__MailingCountry__C = value;
    }

    /**
     * Gets the value of the cve__MailingPostalCode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingPostalCode__C() {
        return cve__MailingPostalCode__C;
    }

    /**
     * Sets the value of the cve__MailingPostalCode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingPostalCode__C(String value) {
        this.cve__MailingPostalCode__C = value;
    }

    /**
     * Gets the value of the cve__MailingState__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingState__C() {
        return cve__MailingState__C;
    }

    /**
     * Sets the value of the cve__MailingState__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingState__C(String value) {
        this.cve__MailingState__C = value;
    }

    /**
     * Gets the value of the cve__MailingStreet__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingStreet__C() {
        return cve__MailingStreet__C;
    }

    /**
     * Sets the value of the cve__MailingStreet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingStreet__C(String value) {
        this.cve__MailingStreet__C = value;
    }

    /**
     * Gets the value of the cve__NetAfterTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NetAfterTaxes__C() {
        return cve__NetAfterTaxes__C;
    }

    /**
     * Sets the value of the cve__NetAfterTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NetAfterTaxes__C(Double value) {
        this.cve__NetAfterTaxes__C = value;
    }

    /**
     * Gets the value of the cve__NetBeforeTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NetBeforeTaxes__C() {
        return cve__NetBeforeTaxes__C;
    }

    /**
     * Sets the value of the cve__NetBeforeTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NetBeforeTaxes__C(Double value) {
        this.cve__NetBeforeTaxes__C = value;
    }

    /**
     * Gets the value of the cve__Net__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Net__C() {
        return cve__Net__C;
    }

    /**
     * Sets the value of the cve__Net__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Net__C(Double value) {
        this.cve__Net__C = value;
    }

    /**
     * Gets the value of the cve__NumberOfPaymentsConsolidated__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NumberOfPaymentsConsolidated__C() {
        return cve__NumberOfPaymentsConsolidated__C;
    }

    /**
     * Sets the value of the cve__NumberOfPaymentsConsolidated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NumberOfPaymentsConsolidated__C(Double value) {
        this.cve__NumberOfPaymentsConsolidated__C = value;
    }

    /**
     * Gets the value of the cve__OvernightDelivery__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OvernightDelivery__C() {
        return cve__OvernightDelivery__C;
    }

    /**
     * Sets the value of the cve__OvernightDelivery__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OvernightDelivery__C(Boolean value) {
        this.cve__OvernightDelivery__C = value;
    }

    /**
     * Gets the value of the cve__Paid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Paid__C() {
        return cve__Paid__C;
    }

    /**
     * Sets the value of the cve__Paid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Paid__C(Boolean value) {
        this.cve__Paid__C = value;
    }

    /**
     * Gets the value of the cve__Payable__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Payable__C() {
        return cve__Payable__C;
    }

    /**
     * Sets the value of the cve__Payable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Payable__C(XMLGregorianCalendar value) {
        this.cve__Payable__C = value;
    }

    /**
     * Gets the value of the cve__PayeeClaimRelationshipType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PayeeClaimRelationshipType__C() {
        return cve__PayeeClaimRelationshipType__C;
    }

    /**
     * Sets the value of the cve__PayeeClaimRelationshipType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PayeeClaimRelationshipType__C(String value) {
        this.cve__PayeeClaimRelationshipType__C = value;
    }

    /**
     * Gets the value of the cve__PayeeName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PayeeName__C() {
        return cve__PayeeName__C;
    }

    /**
     * Sets the value of the cve__PayeeName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PayeeName__C(String value) {
        this.cve__PayeeName__C = value;
    }

    /**
     * Gets the value of the cve__PaymentAssociationsFrom__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PaymentAssociationsFrom__R() {
        return cve__PaymentAssociationsFrom__R;
    }

    /**
     * Sets the value of the cve__PaymentAssociationsFrom__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PaymentAssociationsFrom__R(QueryResultType value) {
        this.cve__PaymentAssociationsFrom__R = value;
    }

    /**
     * Gets the value of the cve__PaymentAssociationsTo__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PaymentAssociationsTo__R() {
        return cve__PaymentAssociationsTo__R;
    }

    /**
     * Sets the value of the cve__PaymentAssociationsTo__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PaymentAssociationsTo__R(QueryResultType value) {
        this.cve__PaymentAssociationsTo__R = value;
    }

    /**
     * Gets the value of the cve__PaymentMethod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentMethod__C() {
        return cve__PaymentMethod__C;
    }

    /**
     * Sets the value of the cve__PaymentMethod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentMethod__C(String value) {
        this.cve__PaymentMethod__C = value;
    }

    /**
     * Gets the value of the cve__PaymentSpecification__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentSpecification__C() {
        return cve__PaymentSpecification__C;
    }

    /**
     * Sets the value of the cve__PaymentSpecification__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentSpecification__C(String value) {
        this.cve__PaymentSpecification__C = value;
    }

    /**
     * Gets the value of the cve__PaymentSpecification__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__PaymentSpecification__C }
     *     
     */
    public Cve__PaymentSpecification__C getCve__PaymentSpecification__R() {
        return cve__PaymentSpecification__R;
    }

    /**
     * Sets the value of the cve__PaymentSpecification__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__PaymentSpecification__C }
     *     
     */
    public void setCve__PaymentSpecification__R(Cve__PaymentSpecification__C value) {
        this.cve__PaymentSpecification__R = value;
    }

    /**
     * Gets the value of the cve__Print__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Print__C() {
        return cve__Print__C;
    }

    /**
     * Sets the value of the cve__Print__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Print__C(XMLGregorianCalendar value) {
        this.cve__Print__C = value;
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
     * Gets the value of the cve__Release__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Release__C() {
        return cve__Release__C;
    }

    /**
     * Sets the value of the cve__Release__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Release__C(XMLGregorianCalendar value) {
        this.cve__Release__C = value;
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
     * Gets the value of the cve__StopOrVoid__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__StopOrVoid__C() {
        return cve__StopOrVoid__C;
    }

    /**
     * Sets the value of the cve__StopOrVoid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__StopOrVoid__C(XMLGregorianCalendar value) {
        this.cve__StopOrVoid__C = value;
    }

    /**
     * Gets the value of the cve__TaxIdNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaxIdNumber__C() {
        return cve__TaxIdNumber__C;
    }

    /**
     * Sets the value of the cve__TaxIdNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaxIdNumber__C(String value) {
        this.cve__TaxIdNumber__C = value;
    }

    /**
     * Gets the value of the cve__Taxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Taxes__C() {
        return cve__Taxes__C;
    }

    /**
     * Sets the value of the cve__Taxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Taxes__C(Double value) {
        this.cve__Taxes__C = value;
    }

    /**
     * Gets the value of the cve__Testing__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Testing__C() {
        return cve__Testing__C;
    }

    /**
     * Sets the value of the cve__Testing__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Testing__C(String value) {
        this.cve__Testing__C = value;
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
     * Gets the value of the cve__UnallocatedPayment__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__UnallocatedPayment__C() {
        return cve__UnallocatedPayment__C;
    }

    /**
     * Sets the value of the cve__UnallocatedPayment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__UnallocatedPayment__C(String value) {
        this.cve__UnallocatedPayment__C = value;
    }

    /**
     * Gets the value of the cve__UnallocatedPayment__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__UnallocatedPayment__C }
     *     
     */
    public Cve__UnallocatedPayment__C getCve__UnallocatedPayment__R() {
        return cve__UnallocatedPayment__R;
    }

    /**
     * Sets the value of the cve__UnallocatedPayment__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__UnallocatedPayment__C }
     *     
     */
    public void setCve__UnallocatedPayment__R(Cve__UnallocatedPayment__C value) {
        this.cve__UnallocatedPayment__R = value;
    }

    /**
     * Gets the value of the cve__WeekDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WeekDays__C() {
        return cve__WeekDays__C;
    }

    /**
     * Sets the value of the cve__WeekDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WeekDays__C(Double value) {
        this.cve__WeekDays__C = value;
    }

}
