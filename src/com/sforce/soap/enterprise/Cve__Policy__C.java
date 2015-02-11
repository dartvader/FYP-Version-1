
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__Policy__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__Policy__c">
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
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__AccumulatedDividendAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AccumulatedPremiumsPaidAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AccumulationValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdviceToPay__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AllocatedAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AllocationPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AnnuitizationValueAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AnnuityDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BeginningInterestDatePeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimeds__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__CarrierName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CashValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Claims__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Conversion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CostBasis__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CurrentAccountValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CurrentInterestPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DeferralPeriodUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DeferralPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Effective__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__GracePeriodUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__GracePeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__GroupName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IndexAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IndexPeriodUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IndustryClassification__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__InitialContributionAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Issued__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__LoanInterestAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LoanInterestRate__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumInterestPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OutstandingLoanAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaidUpDividendAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PerformanceGuarantee__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicyBenefits__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PolicyRelationships__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Portable__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PremiumBillingFrequency__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PremiumPaidThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PremiumPaid__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PreviousSurrenderAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PriorEffective__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PriorExpiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PriorNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PriorVersion__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ProductName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Product__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Product__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Product__c" minOccurs="0"/>
 *         &lt;element name="cve__Reinstatement__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__ReinsuranceAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ReinsurancePercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ReinsuranceType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Reinsured__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ReinsurerName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Renewal__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__SalesOffice__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Situs__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SurrenderChargeAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SystematicWithdrawalAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TaxEquityAndFiscalResponsibilityAct__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TermDividendAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Version__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__Policy__c", propOrder = {
    "activityHistories",
    "attachments",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "events",
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
    "systemModstamp",
    "tasks",
    "topicAssignments",
    "userRecordAccess",
    "cve__AccumulatedDividendAmount__C",
    "cve__AccumulatedPremiumsPaidAmount__C",
    "cve__AccumulationValue__C",
    "cve__AdviceToPay__C",
    "cve__AllocatedAmount__C",
    "cve__AllocationPercentage__C",
    "cve__AnnuitizationValueAmount__C",
    "cve__AnnuityDate__C",
    "cve__BeginningInterestDatePeriod__C",
    "cve__BenefitClaimeds__R",
    "cve__CarrierName__C",
    "cve__CashValue__C",
    "cve__Claims__R",
    "cve__Conversion__C",
    "cve__CostBasis__C",
    "cve__CurrentAccountValue__C",
    "cve__CurrentInterestPercentage__C",
    "cve__DeferralPeriodUnits__C",
    "cve__DeferralPeriod__C",
    "cve__Effective__C",
    "cve__Expiration__C",
    "cve__GracePeriodUnits__C",
    "cve__GracePeriod__C",
    "cve__GroupName__C",
    "cve__IndexAmount__C",
    "cve__IndexPeriodUnits__C",
    "cve__IndustryClassification__C",
    "cve__InitialContributionAmount__C",
    "cve__Issued__C",
    "cve__LoanInterestAmount__C",
    "cve__LoanInterestRate__C",
    "cve__MinimumInterestPercentage__C",
    "cve__OutstandingLoanAmount__C",
    "cve__PaidUpDividendAmount__C",
    "cve__PerformanceGuarantee__C",
    "cve__PolicyBenefits__R",
    "cve__PolicyRelationships__R",
    "cve__Portable__C",
    "cve__PremiumBillingFrequency__C",
    "cve__PremiumPaidThrough__C",
    "cve__PremiumPaid__C",
    "cve__PreviousSurrenderAmount__C",
    "cve__PriorEffective__C",
    "cve__PriorExpiration__C",
    "cve__PriorNumber__C",
    "cve__PriorVersion__C",
    "cve__ProductName__C",
    "cve__Product__C",
    "cve__Product__R",
    "cve__Reinstatement__C",
    "cve__ReinsuranceAmount__C",
    "cve__ReinsurancePercentage__C",
    "cve__ReinsuranceType__C",
    "cve__Reinsured__C",
    "cve__ReinsurerName__C",
    "cve__Renewal__C",
    "cve__SalesOffice__C",
    "cve__Situs__C",
    "cve__Status__C",
    "cve__SurrenderChargeAmount__C",
    "cve__SystematicWithdrawalAmount__C",
    "cve__TaxEquityAndFiscalResponsibilityAct__C",
    "cve__TermDividendAmount__C",
    "cve__Version__C"
})
public class Cve__Policy__C
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
    @XmlElement(name = "cve__AccumulatedPremiumsPaidAmount__c", nillable = true)
    protected Double cve__AccumulatedPremiumsPaidAmount__C;
    @XmlElement(name = "cve__AccumulationValue__c", nillable = true)
    protected Double cve__AccumulationValue__C;
    @XmlElement(name = "cve__AdviceToPay__c", nillable = true)
    protected Boolean cve__AdviceToPay__C;
    @XmlElement(name = "cve__AllocatedAmount__c", nillable = true)
    protected Double cve__AllocatedAmount__C;
    @XmlElement(name = "cve__AllocationPercentage__c", nillable = true)
    protected Double cve__AllocationPercentage__C;
    @XmlElement(name = "cve__AnnuitizationValueAmount__c", nillable = true)
    protected Double cve__AnnuitizationValueAmount__C;
    @XmlElement(name = "cve__AnnuityDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__AnnuityDate__C;
    @XmlElement(name = "cve__BeginningInterestDatePeriod__c", nillable = true)
    protected String cve__BeginningInterestDatePeriod__C;
    @XmlElement(name = "cve__BenefitClaimeds__r", nillable = true)
    protected QueryResultType cve__BenefitClaimeds__R;
    @XmlElement(name = "cve__CarrierName__c", nillable = true)
    protected String cve__CarrierName__C;
    @XmlElement(name = "cve__CashValue__c", nillable = true)
    protected Double cve__CashValue__C;
    @XmlElement(name = "cve__Claims__r", nillable = true)
    protected QueryResultType cve__Claims__R;
    @XmlElement(name = "cve__Conversion__c", nillable = true)
    protected Boolean cve__Conversion__C;
    @XmlElement(name = "cve__CostBasis__c", nillable = true)
    protected Double cve__CostBasis__C;
    @XmlElement(name = "cve__CurrentAccountValue__c", nillable = true)
    protected Double cve__CurrentAccountValue__C;
    @XmlElement(name = "cve__CurrentInterestPercentage__c", nillable = true)
    protected Double cve__CurrentInterestPercentage__C;
    @XmlElement(name = "cve__DeferralPeriodUnits__c", nillable = true)
    protected String cve__DeferralPeriodUnits__C;
    @XmlElement(name = "cve__DeferralPeriod__c", nillable = true)
    protected Double cve__DeferralPeriod__C;
    @XmlElement(name = "cve__Effective__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Effective__C;
    @XmlElement(name = "cve__Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Expiration__C;
    @XmlElement(name = "cve__GracePeriodUnits__c", nillable = true)
    protected String cve__GracePeriodUnits__C;
    @XmlElement(name = "cve__GracePeriod__c", nillable = true)
    protected Double cve__GracePeriod__C;
    @XmlElement(name = "cve__GroupName__c", nillable = true)
    protected String cve__GroupName__C;
    @XmlElement(name = "cve__IndexAmount__c", nillable = true)
    protected Double cve__IndexAmount__C;
    @XmlElement(name = "cve__IndexPeriodUnits__c", nillable = true)
    protected String cve__IndexPeriodUnits__C;
    @XmlElement(name = "cve__IndustryClassification__c", nillable = true)
    protected String cve__IndustryClassification__C;
    @XmlElement(name = "cve__InitialContributionAmount__c", nillable = true)
    protected Double cve__InitialContributionAmount__C;
    @XmlElement(name = "cve__Issued__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Issued__C;
    @XmlElement(name = "cve__LoanInterestAmount__c", nillable = true)
    protected Double cve__LoanInterestAmount__C;
    @XmlElement(name = "cve__LoanInterestRate__c", nillable = true)
    protected Double cve__LoanInterestRate__C;
    @XmlElement(name = "cve__MinimumInterestPercentage__c", nillable = true)
    protected Double cve__MinimumInterestPercentage__C;
    @XmlElement(name = "cve__OutstandingLoanAmount__c", nillable = true)
    protected Double cve__OutstandingLoanAmount__C;
    @XmlElement(name = "cve__PaidUpDividendAmount__c", nillable = true)
    protected Double cve__PaidUpDividendAmount__C;
    @XmlElement(name = "cve__PerformanceGuarantee__c", nillable = true)
    protected Boolean cve__PerformanceGuarantee__C;
    @XmlElement(name = "cve__PolicyBenefits__r", nillable = true)
    protected QueryResultType cve__PolicyBenefits__R;
    @XmlElement(name = "cve__PolicyRelationships__r", nillable = true)
    protected QueryResultType cve__PolicyRelationships__R;
    @XmlElement(name = "cve__Portable__c", nillable = true)
    protected Boolean cve__Portable__C;
    @XmlElement(name = "cve__PremiumBillingFrequency__c", nillable = true)
    protected String cve__PremiumBillingFrequency__C;
    @XmlElement(name = "cve__PremiumPaidThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PremiumPaidThrough__C;
    @XmlElement(name = "cve__PremiumPaid__c", nillable = true)
    protected Double cve__PremiumPaid__C;
    @XmlElement(name = "cve__PreviousSurrenderAmount__c", nillable = true)
    protected Double cve__PreviousSurrenderAmount__C;
    @XmlElement(name = "cve__PriorEffective__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PriorEffective__C;
    @XmlElement(name = "cve__PriorExpiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PriorExpiration__C;
    @XmlElement(name = "cve__PriorNumber__c", nillable = true)
    protected String cve__PriorNumber__C;
    @XmlElement(name = "cve__PriorVersion__c", nillable = true)
    protected String cve__PriorVersion__C;
    @XmlElement(name = "cve__ProductName__c", nillable = true)
    protected String cve__ProductName__C;
    @XmlElement(name = "cve__Product__c", nillable = true)
    protected String cve__Product__C;
    @XmlElement(name = "cve__Product__r", nillable = true)
    protected Cve__Product__C cve__Product__R;
    @XmlElement(name = "cve__Reinstatement__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Reinstatement__C;
    @XmlElement(name = "cve__ReinsuranceAmount__c", nillable = true)
    protected Double cve__ReinsuranceAmount__C;
    @XmlElement(name = "cve__ReinsurancePercentage__c", nillable = true)
    protected Double cve__ReinsurancePercentage__C;
    @XmlElement(name = "cve__ReinsuranceType__c", nillable = true)
    protected String cve__ReinsuranceType__C;
    @XmlElement(name = "cve__Reinsured__c", nillable = true)
    protected Boolean cve__Reinsured__C;
    @XmlElement(name = "cve__ReinsurerName__c", nillable = true)
    protected String cve__ReinsurerName__C;
    @XmlElement(name = "cve__Renewal__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Renewal__C;
    @XmlElement(name = "cve__SalesOffice__c", nillable = true)
    protected String cve__SalesOffice__C;
    @XmlElement(name = "cve__Situs__c", nillable = true)
    protected String cve__Situs__C;
    @XmlElement(name = "cve__Status__c", nillable = true)
    protected String cve__Status__C;
    @XmlElement(name = "cve__SurrenderChargeAmount__c", nillable = true)
    protected Double cve__SurrenderChargeAmount__C;
    @XmlElement(name = "cve__SystematicWithdrawalAmount__c", nillable = true)
    protected Double cve__SystematicWithdrawalAmount__C;
    @XmlElement(name = "cve__TaxEquityAndFiscalResponsibilityAct__c", nillable = true)
    protected String cve__TaxEquityAndFiscalResponsibilityAct__C;
    @XmlElement(name = "cve__TermDividendAmount__c", nillable = true)
    protected Double cve__TermDividendAmount__C;
    @XmlElement(name = "cve__Version__c", nillable = true)
    protected String cve__Version__C;

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
     * Gets the value of the cve__AccumulatedPremiumsPaidAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AccumulatedPremiumsPaidAmount__C() {
        return cve__AccumulatedPremiumsPaidAmount__C;
    }

    /**
     * Sets the value of the cve__AccumulatedPremiumsPaidAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AccumulatedPremiumsPaidAmount__C(Double value) {
        this.cve__AccumulatedPremiumsPaidAmount__C = value;
    }

    /**
     * Gets the value of the cve__AccumulationValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AccumulationValue__C() {
        return cve__AccumulationValue__C;
    }

    /**
     * Sets the value of the cve__AccumulationValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AccumulationValue__C(Double value) {
        this.cve__AccumulationValue__C = value;
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
     * Gets the value of the cve__AllocatedAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AllocatedAmount__C() {
        return cve__AllocatedAmount__C;
    }

    /**
     * Sets the value of the cve__AllocatedAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AllocatedAmount__C(Double value) {
        this.cve__AllocatedAmount__C = value;
    }

    /**
     * Gets the value of the cve__AllocationPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AllocationPercentage__C() {
        return cve__AllocationPercentage__C;
    }

    /**
     * Sets the value of the cve__AllocationPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AllocationPercentage__C(Double value) {
        this.cve__AllocationPercentage__C = value;
    }

    /**
     * Gets the value of the cve__AnnuitizationValueAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AnnuitizationValueAmount__C() {
        return cve__AnnuitizationValueAmount__C;
    }

    /**
     * Sets the value of the cve__AnnuitizationValueAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AnnuitizationValueAmount__C(Double value) {
        this.cve__AnnuitizationValueAmount__C = value;
    }

    /**
     * Gets the value of the cve__AnnuityDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__AnnuityDate__C() {
        return cve__AnnuityDate__C;
    }

    /**
     * Sets the value of the cve__AnnuityDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__AnnuityDate__C(XMLGregorianCalendar value) {
        this.cve__AnnuityDate__C = value;
    }

    /**
     * Gets the value of the cve__BeginningInterestDatePeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BeginningInterestDatePeriod__C() {
        return cve__BeginningInterestDatePeriod__C;
    }

    /**
     * Sets the value of the cve__BeginningInterestDatePeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BeginningInterestDatePeriod__C(String value) {
        this.cve__BeginningInterestDatePeriod__C = value;
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
     * Gets the value of the cve__CarrierName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CarrierName__C() {
        return cve__CarrierName__C;
    }

    /**
     * Sets the value of the cve__CarrierName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CarrierName__C(String value) {
        this.cve__CarrierName__C = value;
    }

    /**
     * Gets the value of the cve__CashValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CashValue__C() {
        return cve__CashValue__C;
    }

    /**
     * Sets the value of the cve__CashValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CashValue__C(Double value) {
        this.cve__CashValue__C = value;
    }

    /**
     * Gets the value of the cve__Claims__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Claims__R() {
        return cve__Claims__R;
    }

    /**
     * Sets the value of the cve__Claims__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Claims__R(QueryResultType value) {
        this.cve__Claims__R = value;
    }

    /**
     * Gets the value of the cve__Conversion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Conversion__C() {
        return cve__Conversion__C;
    }

    /**
     * Sets the value of the cve__Conversion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Conversion__C(Boolean value) {
        this.cve__Conversion__C = value;
    }

    /**
     * Gets the value of the cve__CostBasis__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CostBasis__C() {
        return cve__CostBasis__C;
    }

    /**
     * Sets the value of the cve__CostBasis__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CostBasis__C(Double value) {
        this.cve__CostBasis__C = value;
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
     * Gets the value of the cve__CurrentInterestPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CurrentInterestPercentage__C() {
        return cve__CurrentInterestPercentage__C;
    }

    /**
     * Sets the value of the cve__CurrentInterestPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CurrentInterestPercentage__C(Double value) {
        this.cve__CurrentInterestPercentage__C = value;
    }

    /**
     * Gets the value of the cve__DeferralPeriodUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DeferralPeriodUnits__C() {
        return cve__DeferralPeriodUnits__C;
    }

    /**
     * Sets the value of the cve__DeferralPeriodUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DeferralPeriodUnits__C(String value) {
        this.cve__DeferralPeriodUnits__C = value;
    }

    /**
     * Gets the value of the cve__DeferralPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DeferralPeriod__C() {
        return cve__DeferralPeriod__C;
    }

    /**
     * Sets the value of the cve__DeferralPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DeferralPeriod__C(Double value) {
        this.cve__DeferralPeriod__C = value;
    }

    /**
     * Gets the value of the cve__Effective__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Effective__C() {
        return cve__Effective__C;
    }

    /**
     * Sets the value of the cve__Effective__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Effective__C(XMLGregorianCalendar value) {
        this.cve__Effective__C = value;
    }

    /**
     * Gets the value of the cve__Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Expiration__C() {
        return cve__Expiration__C;
    }

    /**
     * Sets the value of the cve__Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Expiration__C(XMLGregorianCalendar value) {
        this.cve__Expiration__C = value;
    }

    /**
     * Gets the value of the cve__GracePeriodUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__GracePeriodUnits__C() {
        return cve__GracePeriodUnits__C;
    }

    /**
     * Sets the value of the cve__GracePeriodUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__GracePeriodUnits__C(String value) {
        this.cve__GracePeriodUnits__C = value;
    }

    /**
     * Gets the value of the cve__GracePeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__GracePeriod__C() {
        return cve__GracePeriod__C;
    }

    /**
     * Sets the value of the cve__GracePeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__GracePeriod__C(Double value) {
        this.cve__GracePeriod__C = value;
    }

    /**
     * Gets the value of the cve__GroupName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__GroupName__C() {
        return cve__GroupName__C;
    }

    /**
     * Sets the value of the cve__GroupName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__GroupName__C(String value) {
        this.cve__GroupName__C = value;
    }

    /**
     * Gets the value of the cve__IndexAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__IndexAmount__C() {
        return cve__IndexAmount__C;
    }

    /**
     * Sets the value of the cve__IndexAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__IndexAmount__C(Double value) {
        this.cve__IndexAmount__C = value;
    }

    /**
     * Gets the value of the cve__IndexPeriodUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IndexPeriodUnits__C() {
        return cve__IndexPeriodUnits__C;
    }

    /**
     * Sets the value of the cve__IndexPeriodUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IndexPeriodUnits__C(String value) {
        this.cve__IndexPeriodUnits__C = value;
    }

    /**
     * Gets the value of the cve__IndustryClassification__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IndustryClassification__C() {
        return cve__IndustryClassification__C;
    }

    /**
     * Sets the value of the cve__IndustryClassification__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IndustryClassification__C(String value) {
        this.cve__IndustryClassification__C = value;
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
     * Gets the value of the cve__Issued__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Issued__C() {
        return cve__Issued__C;
    }

    /**
     * Sets the value of the cve__Issued__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Issued__C(XMLGregorianCalendar value) {
        this.cve__Issued__C = value;
    }

    /**
     * Gets the value of the cve__LoanInterestAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LoanInterestAmount__C() {
        return cve__LoanInterestAmount__C;
    }

    /**
     * Sets the value of the cve__LoanInterestAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LoanInterestAmount__C(Double value) {
        this.cve__LoanInterestAmount__C = value;
    }

    /**
     * Gets the value of the cve__LoanInterestRate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LoanInterestRate__C() {
        return cve__LoanInterestRate__C;
    }

    /**
     * Sets the value of the cve__LoanInterestRate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LoanInterestRate__C(Double value) {
        this.cve__LoanInterestRate__C = value;
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
     * Gets the value of the cve__PaidUpDividendAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PaidUpDividendAmount__C() {
        return cve__PaidUpDividendAmount__C;
    }

    /**
     * Sets the value of the cve__PaidUpDividendAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PaidUpDividendAmount__C(Double value) {
        this.cve__PaidUpDividendAmount__C = value;
    }

    /**
     * Gets the value of the cve__PerformanceGuarantee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PerformanceGuarantee__C() {
        return cve__PerformanceGuarantee__C;
    }

    /**
     * Sets the value of the cve__PerformanceGuarantee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PerformanceGuarantee__C(Boolean value) {
        this.cve__PerformanceGuarantee__C = value;
    }

    /**
     * Gets the value of the cve__PolicyBenefits__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PolicyBenefits__R() {
        return cve__PolicyBenefits__R;
    }

    /**
     * Sets the value of the cve__PolicyBenefits__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PolicyBenefits__R(QueryResultType value) {
        this.cve__PolicyBenefits__R = value;
    }

    /**
     * Gets the value of the cve__PolicyRelationships__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PolicyRelationships__R() {
        return cve__PolicyRelationships__R;
    }

    /**
     * Sets the value of the cve__PolicyRelationships__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PolicyRelationships__R(QueryResultType value) {
        this.cve__PolicyRelationships__R = value;
    }

    /**
     * Gets the value of the cve__Portable__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Portable__C() {
        return cve__Portable__C;
    }

    /**
     * Sets the value of the cve__Portable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Portable__C(Boolean value) {
        this.cve__Portable__C = value;
    }

    /**
     * Gets the value of the cve__PremiumBillingFrequency__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PremiumBillingFrequency__C() {
        return cve__PremiumBillingFrequency__C;
    }

    /**
     * Sets the value of the cve__PremiumBillingFrequency__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PremiumBillingFrequency__C(String value) {
        this.cve__PremiumBillingFrequency__C = value;
    }

    /**
     * Gets the value of the cve__PremiumPaidThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PremiumPaidThrough__C() {
        return cve__PremiumPaidThrough__C;
    }

    /**
     * Sets the value of the cve__PremiumPaidThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PremiumPaidThrough__C(XMLGregorianCalendar value) {
        this.cve__PremiumPaidThrough__C = value;
    }

    /**
     * Gets the value of the cve__PremiumPaid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PremiumPaid__C() {
        return cve__PremiumPaid__C;
    }

    /**
     * Sets the value of the cve__PremiumPaid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PremiumPaid__C(Double value) {
        this.cve__PremiumPaid__C = value;
    }

    /**
     * Gets the value of the cve__PreviousSurrenderAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PreviousSurrenderAmount__C() {
        return cve__PreviousSurrenderAmount__C;
    }

    /**
     * Sets the value of the cve__PreviousSurrenderAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PreviousSurrenderAmount__C(Double value) {
        this.cve__PreviousSurrenderAmount__C = value;
    }

    /**
     * Gets the value of the cve__PriorEffective__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PriorEffective__C() {
        return cve__PriorEffective__C;
    }

    /**
     * Sets the value of the cve__PriorEffective__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PriorEffective__C(XMLGregorianCalendar value) {
        this.cve__PriorEffective__C = value;
    }

    /**
     * Gets the value of the cve__PriorExpiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PriorExpiration__C() {
        return cve__PriorExpiration__C;
    }

    /**
     * Sets the value of the cve__PriorExpiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PriorExpiration__C(XMLGregorianCalendar value) {
        this.cve__PriorExpiration__C = value;
    }

    /**
     * Gets the value of the cve__PriorNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PriorNumber__C() {
        return cve__PriorNumber__C;
    }

    /**
     * Sets the value of the cve__PriorNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PriorNumber__C(String value) {
        this.cve__PriorNumber__C = value;
    }

    /**
     * Gets the value of the cve__PriorVersion__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PriorVersion__C() {
        return cve__PriorVersion__C;
    }

    /**
     * Sets the value of the cve__PriorVersion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PriorVersion__C(String value) {
        this.cve__PriorVersion__C = value;
    }

    /**
     * Gets the value of the cve__ProductName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ProductName__C() {
        return cve__ProductName__C;
    }

    /**
     * Sets the value of the cve__ProductName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ProductName__C(String value) {
        this.cve__ProductName__C = value;
    }

    /**
     * Gets the value of the cve__Product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Product__C() {
        return cve__Product__C;
    }

    /**
     * Sets the value of the cve__Product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Product__C(String value) {
        this.cve__Product__C = value;
    }

    /**
     * Gets the value of the cve__Product__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Product__C }
     *     
     */
    public Cve__Product__C getCve__Product__R() {
        return cve__Product__R;
    }

    /**
     * Sets the value of the cve__Product__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Product__C }
     *     
     */
    public void setCve__Product__R(Cve__Product__C value) {
        this.cve__Product__R = value;
    }

    /**
     * Gets the value of the cve__Reinstatement__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Reinstatement__C() {
        return cve__Reinstatement__C;
    }

    /**
     * Sets the value of the cve__Reinstatement__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Reinstatement__C(XMLGregorianCalendar value) {
        this.cve__Reinstatement__C = value;
    }

    /**
     * Gets the value of the cve__ReinsuranceAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ReinsuranceAmount__C() {
        return cve__ReinsuranceAmount__C;
    }

    /**
     * Sets the value of the cve__ReinsuranceAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ReinsuranceAmount__C(Double value) {
        this.cve__ReinsuranceAmount__C = value;
    }

    /**
     * Gets the value of the cve__ReinsurancePercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ReinsurancePercentage__C() {
        return cve__ReinsurancePercentage__C;
    }

    /**
     * Sets the value of the cve__ReinsurancePercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ReinsurancePercentage__C(Double value) {
        this.cve__ReinsurancePercentage__C = value;
    }

    /**
     * Gets the value of the cve__ReinsuranceType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ReinsuranceType__C() {
        return cve__ReinsuranceType__C;
    }

    /**
     * Sets the value of the cve__ReinsuranceType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ReinsuranceType__C(String value) {
        this.cve__ReinsuranceType__C = value;
    }

    /**
     * Gets the value of the cve__Reinsured__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Reinsured__C() {
        return cve__Reinsured__C;
    }

    /**
     * Sets the value of the cve__Reinsured__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Reinsured__C(Boolean value) {
        this.cve__Reinsured__C = value;
    }

    /**
     * Gets the value of the cve__ReinsurerName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ReinsurerName__C() {
        return cve__ReinsurerName__C;
    }

    /**
     * Sets the value of the cve__ReinsurerName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ReinsurerName__C(String value) {
        this.cve__ReinsurerName__C = value;
    }

    /**
     * Gets the value of the cve__Renewal__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Renewal__C() {
        return cve__Renewal__C;
    }

    /**
     * Sets the value of the cve__Renewal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Renewal__C(XMLGregorianCalendar value) {
        this.cve__Renewal__C = value;
    }

    /**
     * Gets the value of the cve__SalesOffice__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SalesOffice__C() {
        return cve__SalesOffice__C;
    }

    /**
     * Sets the value of the cve__SalesOffice__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SalesOffice__C(String value) {
        this.cve__SalesOffice__C = value;
    }

    /**
     * Gets the value of the cve__Situs__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Situs__C() {
        return cve__Situs__C;
    }

    /**
     * Sets the value of the cve__Situs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Situs__C(String value) {
        this.cve__Situs__C = value;
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
     * Gets the value of the cve__SurrenderChargeAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SurrenderChargeAmount__C() {
        return cve__SurrenderChargeAmount__C;
    }

    /**
     * Sets the value of the cve__SurrenderChargeAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SurrenderChargeAmount__C(Double value) {
        this.cve__SurrenderChargeAmount__C = value;
    }

    /**
     * Gets the value of the cve__SystematicWithdrawalAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SystematicWithdrawalAmount__C() {
        return cve__SystematicWithdrawalAmount__C;
    }

    /**
     * Sets the value of the cve__SystematicWithdrawalAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SystematicWithdrawalAmount__C(Double value) {
        this.cve__SystematicWithdrawalAmount__C = value;
    }

    /**
     * Gets the value of the cve__TaxEquityAndFiscalResponsibilityAct__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaxEquityAndFiscalResponsibilityAct__C() {
        return cve__TaxEquityAndFiscalResponsibilityAct__C;
    }

    /**
     * Sets the value of the cve__TaxEquityAndFiscalResponsibilityAct__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaxEquityAndFiscalResponsibilityAct__C(String value) {
        this.cve__TaxEquityAndFiscalResponsibilityAct__C = value;
    }

    /**
     * Gets the value of the cve__TermDividendAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TermDividendAmount__C() {
        return cve__TermDividendAmount__C;
    }

    /**
     * Sets the value of the cve__TermDividendAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TermDividendAmount__C(Double value) {
        this.cve__TermDividendAmount__C = value;
    }

    /**
     * Gets the value of the cve__Version__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Version__C() {
        return cve__Version__C;
    }

    /**
     * Sets the value of the cve__Version__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Version__C(String value) {
        this.cve__Version__C = value;
    }

}
