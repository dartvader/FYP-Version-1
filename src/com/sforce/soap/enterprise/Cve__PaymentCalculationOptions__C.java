
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__PaymentCalculationOptions__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__PaymentCalculationOptions__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SetupOwner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="SetupOwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__DisableAutomaticBalanceCalculation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ExcludedCalculatedPaymentStatuses__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ExtraOrganizationFieldsToCopy__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ExtraPersonFieldsToCopy__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__FicaDependsOnIssueDate__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__IgnorePayableDate__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__InlineEditIssueDateColumn__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__JavascriptStaticResourceName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Keep0PaymentsDueToAdjustedBenefitStart__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Keep0PaymentsDueToAdjustedBenefitThrough__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__LifeAcceleratedPaymentOptions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LifePayablePaymentOptions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LumpSumRepaymentStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MinimumBenefitCalculatedPerDay__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PayableExclusionPatterns__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PayableInclusionPatterns__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PayeeNameFormat__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentCalculationValidatorClass__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ShowAdjustmentColumns__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowAttorneyFees__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowBeforeTaxesInCorrectionMode__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowBenefitMinimumMaximum__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowCalculateLiability__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowConsolidate__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowExcludingRecoveryInCorrectionMode__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowIssueDateColumn__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowNetInCorrectionMode__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowPayableDateColumn__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowPaymentCalculationHint__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowPrintDateColumn__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowReissue__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowReleaseDateColumn__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowSendNow__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowStop__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowTaxColumns__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowTaxRates__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowVoid__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__StopOrVoidCopyEobs__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__StopOrVoidCopyPaymentMethod__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__StopOrVoidStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ThirtyDayMonthProration__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__PaymentCalculationOptions__c", propOrder = {
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lookedUpFromActivities",
    "name",
    "processInstances",
    "processSteps",
    "setupOwner",
    "setupOwnerId",
    "systemModstamp",
    "topicAssignments",
    "userRecordAccess",
    "cve__DisableAutomaticBalanceCalculation__C",
    "cve__ExcludedCalculatedPaymentStatuses__C",
    "cve__ExtraOrganizationFieldsToCopy__C",
    "cve__ExtraPersonFieldsToCopy__C",
    "cve__FicaDependsOnIssueDate__C",
    "cve__IgnorePayableDate__C",
    "cve__InlineEditIssueDateColumn__C",
    "cve__JavascriptStaticResourceName__C",
    "cve__Keep0PaymentsDueToAdjustedBenefitStart__C",
    "cve__Keep0PaymentsDueToAdjustedBenefitThrough__C",
    "cve__LifeAcceleratedPaymentOptions__C",
    "cve__LifePayablePaymentOptions__C",
    "cve__LumpSumRepaymentStatus__C",
    "cve__MinimumBenefitCalculatedPerDay__C",
    "cve__PayableExclusionPatterns__C",
    "cve__PayableInclusionPatterns__C",
    "cve__PayeeNameFormat__C",
    "cve__PaymentCalculationValidatorClass__C",
    "cve__ShowAdjustmentColumns__C",
    "cve__ShowAttorneyFees__C",
    "cve__ShowBeforeTaxesInCorrectionMode__C",
    "cve__ShowBenefitMinimumMaximum__C",
    "cve__ShowCalculateLiability__C",
    "cve__ShowConsolidate__C",
    "cve__ShowExcludingRecoveryInCorrectionMode__C",
    "cve__ShowIssueDateColumn__C",
    "cve__ShowNetInCorrectionMode__C",
    "cve__ShowPayableDateColumn__C",
    "cve__ShowPaymentCalculationHint__C",
    "cve__ShowPrintDateColumn__C",
    "cve__ShowReissue__C",
    "cve__ShowReleaseDateColumn__C",
    "cve__ShowSendNow__C",
    "cve__ShowStop__C",
    "cve__ShowTaxColumns__C",
    "cve__ShowTaxRates__C",
    "cve__ShowVoid__C",
    "cve__StopOrVoidCopyEobs__C",
    "cve__StopOrVoidCopyPaymentMethod__C",
    "cve__StopOrVoidStatus__C",
    "cve__ThirtyDayMonthProration__C"
})
public class Cve__PaymentCalculationOptions__C
    extends SObject
{

    @XmlElement(name = "CombinedAttachments", nillable = true)
    protected QueryResultType combinedAttachments;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LookedUpFromActivities", nillable = true)
    protected QueryResultType lookedUpFromActivities;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResultType processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResultType processSteps;
    @XmlElement(name = "SetupOwner", nillable = true)
    protected Name setupOwner;
    @XmlElement(name = "SetupOwnerId", nillable = true)
    protected String setupOwnerId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__DisableAutomaticBalanceCalculation__c", nillable = true)
    protected Boolean cve__DisableAutomaticBalanceCalculation__C;
    @XmlElement(name = "cve__ExcludedCalculatedPaymentStatuses__c", nillable = true)
    protected String cve__ExcludedCalculatedPaymentStatuses__C;
    @XmlElement(name = "cve__ExtraOrganizationFieldsToCopy__c", nillable = true)
    protected String cve__ExtraOrganizationFieldsToCopy__C;
    @XmlElement(name = "cve__ExtraPersonFieldsToCopy__c", nillable = true)
    protected String cve__ExtraPersonFieldsToCopy__C;
    @XmlElement(name = "cve__FicaDependsOnIssueDate__c", nillable = true)
    protected Boolean cve__FicaDependsOnIssueDate__C;
    @XmlElement(name = "cve__IgnorePayableDate__c", nillable = true)
    protected Boolean cve__IgnorePayableDate__C;
    @XmlElement(name = "cve__InlineEditIssueDateColumn__c", nillable = true)
    protected Boolean cve__InlineEditIssueDateColumn__C;
    @XmlElement(name = "cve__JavascriptStaticResourceName__c", nillable = true)
    protected String cve__JavascriptStaticResourceName__C;
    @XmlElement(name = "cve__Keep0PaymentsDueToAdjustedBenefitStart__c", nillable = true)
    protected Boolean cve__Keep0PaymentsDueToAdjustedBenefitStart__C;
    @XmlElement(name = "cve__Keep0PaymentsDueToAdjustedBenefitThrough__c", nillable = true)
    protected Boolean cve__Keep0PaymentsDueToAdjustedBenefitThrough__C;
    @XmlElement(name = "cve__LifeAcceleratedPaymentOptions__c", nillable = true)
    protected String cve__LifeAcceleratedPaymentOptions__C;
    @XmlElement(name = "cve__LifePayablePaymentOptions__c", nillable = true)
    protected String cve__LifePayablePaymentOptions__C;
    @XmlElement(name = "cve__LumpSumRepaymentStatus__c", nillable = true)
    protected String cve__LumpSumRepaymentStatus__C;
    @XmlElement(name = "cve__MinimumBenefitCalculatedPerDay__c", nillable = true)
    protected Boolean cve__MinimumBenefitCalculatedPerDay__C;
    @XmlElement(name = "cve__PayableExclusionPatterns__c", nillable = true)
    protected String cve__PayableExclusionPatterns__C;
    @XmlElement(name = "cve__PayableInclusionPatterns__c", nillable = true)
    protected String cve__PayableInclusionPatterns__C;
    @XmlElement(name = "cve__PayeeNameFormat__c", nillable = true)
    protected String cve__PayeeNameFormat__C;
    @XmlElement(name = "cve__PaymentCalculationValidatorClass__c", nillable = true)
    protected String cve__PaymentCalculationValidatorClass__C;
    @XmlElement(name = "cve__ShowAdjustmentColumns__c", nillable = true)
    protected Boolean cve__ShowAdjustmentColumns__C;
    @XmlElement(name = "cve__ShowAttorneyFees__c", nillable = true)
    protected Boolean cve__ShowAttorneyFees__C;
    @XmlElement(name = "cve__ShowBeforeTaxesInCorrectionMode__c", nillable = true)
    protected Boolean cve__ShowBeforeTaxesInCorrectionMode__C;
    @XmlElement(name = "cve__ShowBenefitMinimumMaximum__c", nillable = true)
    protected Boolean cve__ShowBenefitMinimumMaximum__C;
    @XmlElement(name = "cve__ShowCalculateLiability__c", nillable = true)
    protected Boolean cve__ShowCalculateLiability__C;
    @XmlElement(name = "cve__ShowConsolidate__c", nillable = true)
    protected Boolean cve__ShowConsolidate__C;
    @XmlElement(name = "cve__ShowExcludingRecoveryInCorrectionMode__c", nillable = true)
    protected Boolean cve__ShowExcludingRecoveryInCorrectionMode__C;
    @XmlElement(name = "cve__ShowIssueDateColumn__c", nillable = true)
    protected Boolean cve__ShowIssueDateColumn__C;
    @XmlElement(name = "cve__ShowNetInCorrectionMode__c", nillable = true)
    protected Boolean cve__ShowNetInCorrectionMode__C;
    @XmlElement(name = "cve__ShowPayableDateColumn__c", nillable = true)
    protected Boolean cve__ShowPayableDateColumn__C;
    @XmlElement(name = "cve__ShowPaymentCalculationHint__c", nillable = true)
    protected Boolean cve__ShowPaymentCalculationHint__C;
    @XmlElement(name = "cve__ShowPrintDateColumn__c", nillable = true)
    protected Boolean cve__ShowPrintDateColumn__C;
    @XmlElement(name = "cve__ShowReissue__c", nillable = true)
    protected Boolean cve__ShowReissue__C;
    @XmlElement(name = "cve__ShowReleaseDateColumn__c", nillable = true)
    protected Boolean cve__ShowReleaseDateColumn__C;
    @XmlElement(name = "cve__ShowSendNow__c", nillable = true)
    protected Boolean cve__ShowSendNow__C;
    @XmlElement(name = "cve__ShowStop__c", nillable = true)
    protected Boolean cve__ShowStop__C;
    @XmlElement(name = "cve__ShowTaxColumns__c", nillable = true)
    protected Boolean cve__ShowTaxColumns__C;
    @XmlElement(name = "cve__ShowTaxRates__c", nillable = true)
    protected Boolean cve__ShowTaxRates__C;
    @XmlElement(name = "cve__ShowVoid__c", nillable = true)
    protected Boolean cve__ShowVoid__C;
    @XmlElement(name = "cve__StopOrVoidCopyEobs__c", nillable = true)
    protected Boolean cve__StopOrVoidCopyEobs__C;
    @XmlElement(name = "cve__StopOrVoidCopyPaymentMethod__c", nillable = true)
    protected Boolean cve__StopOrVoidCopyPaymentMethod__C;
    @XmlElement(name = "cve__StopOrVoidStatus__c", nillable = true)
    protected String cve__StopOrVoidStatus__C;
    @XmlElement(name = "cve__ThirtyDayMonthProration__c", nillable = true)
    protected Boolean cve__ThirtyDayMonthProration__C;

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
     * Gets the value of the setupOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getSetupOwner() {
        return setupOwner;
    }

    /**
     * Sets the value of the setupOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setSetupOwner(Name value) {
        this.setupOwner = value;
    }

    /**
     * Gets the value of the setupOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupOwnerId() {
        return setupOwnerId;
    }

    /**
     * Sets the value of the setupOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupOwnerId(String value) {
        this.setupOwnerId = value;
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
     * Gets the value of the cve__DisableAutomaticBalanceCalculation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DisableAutomaticBalanceCalculation__C() {
        return cve__DisableAutomaticBalanceCalculation__C;
    }

    /**
     * Sets the value of the cve__DisableAutomaticBalanceCalculation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DisableAutomaticBalanceCalculation__C(Boolean value) {
        this.cve__DisableAutomaticBalanceCalculation__C = value;
    }

    /**
     * Gets the value of the cve__ExcludedCalculatedPaymentStatuses__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ExcludedCalculatedPaymentStatuses__C() {
        return cve__ExcludedCalculatedPaymentStatuses__C;
    }

    /**
     * Sets the value of the cve__ExcludedCalculatedPaymentStatuses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ExcludedCalculatedPaymentStatuses__C(String value) {
        this.cve__ExcludedCalculatedPaymentStatuses__C = value;
    }

    /**
     * Gets the value of the cve__ExtraOrganizationFieldsToCopy__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ExtraOrganizationFieldsToCopy__C() {
        return cve__ExtraOrganizationFieldsToCopy__C;
    }

    /**
     * Sets the value of the cve__ExtraOrganizationFieldsToCopy__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ExtraOrganizationFieldsToCopy__C(String value) {
        this.cve__ExtraOrganizationFieldsToCopy__C = value;
    }

    /**
     * Gets the value of the cve__ExtraPersonFieldsToCopy__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ExtraPersonFieldsToCopy__C() {
        return cve__ExtraPersonFieldsToCopy__C;
    }

    /**
     * Sets the value of the cve__ExtraPersonFieldsToCopy__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ExtraPersonFieldsToCopy__C(String value) {
        this.cve__ExtraPersonFieldsToCopy__C = value;
    }

    /**
     * Gets the value of the cve__FicaDependsOnIssueDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__FicaDependsOnIssueDate__C() {
        return cve__FicaDependsOnIssueDate__C;
    }

    /**
     * Sets the value of the cve__FicaDependsOnIssueDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__FicaDependsOnIssueDate__C(Boolean value) {
        this.cve__FicaDependsOnIssueDate__C = value;
    }

    /**
     * Gets the value of the cve__IgnorePayableDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__IgnorePayableDate__C() {
        return cve__IgnorePayableDate__C;
    }

    /**
     * Sets the value of the cve__IgnorePayableDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__IgnorePayableDate__C(Boolean value) {
        this.cve__IgnorePayableDate__C = value;
    }

    /**
     * Gets the value of the cve__InlineEditIssueDateColumn__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__InlineEditIssueDateColumn__C() {
        return cve__InlineEditIssueDateColumn__C;
    }

    /**
     * Sets the value of the cve__InlineEditIssueDateColumn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__InlineEditIssueDateColumn__C(Boolean value) {
        this.cve__InlineEditIssueDateColumn__C = value;
    }

    /**
     * Gets the value of the cve__JavascriptStaticResourceName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__JavascriptStaticResourceName__C() {
        return cve__JavascriptStaticResourceName__C;
    }

    /**
     * Sets the value of the cve__JavascriptStaticResourceName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__JavascriptStaticResourceName__C(String value) {
        this.cve__JavascriptStaticResourceName__C = value;
    }

    /**
     * Gets the value of the cve__Keep0PaymentsDueToAdjustedBenefitStart__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Keep0PaymentsDueToAdjustedBenefitStart__C() {
        return cve__Keep0PaymentsDueToAdjustedBenefitStart__C;
    }

    /**
     * Sets the value of the cve__Keep0PaymentsDueToAdjustedBenefitStart__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Keep0PaymentsDueToAdjustedBenefitStart__C(Boolean value) {
        this.cve__Keep0PaymentsDueToAdjustedBenefitStart__C = value;
    }

    /**
     * Gets the value of the cve__Keep0PaymentsDueToAdjustedBenefitThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Keep0PaymentsDueToAdjustedBenefitThrough__C() {
        return cve__Keep0PaymentsDueToAdjustedBenefitThrough__C;
    }

    /**
     * Sets the value of the cve__Keep0PaymentsDueToAdjustedBenefitThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Keep0PaymentsDueToAdjustedBenefitThrough__C(Boolean value) {
        this.cve__Keep0PaymentsDueToAdjustedBenefitThrough__C = value;
    }

    /**
     * Gets the value of the cve__LifeAcceleratedPaymentOptions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LifeAcceleratedPaymentOptions__C() {
        return cve__LifeAcceleratedPaymentOptions__C;
    }

    /**
     * Sets the value of the cve__LifeAcceleratedPaymentOptions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LifeAcceleratedPaymentOptions__C(String value) {
        this.cve__LifeAcceleratedPaymentOptions__C = value;
    }

    /**
     * Gets the value of the cve__LifePayablePaymentOptions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LifePayablePaymentOptions__C() {
        return cve__LifePayablePaymentOptions__C;
    }

    /**
     * Sets the value of the cve__LifePayablePaymentOptions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LifePayablePaymentOptions__C(String value) {
        this.cve__LifePayablePaymentOptions__C = value;
    }

    /**
     * Gets the value of the cve__LumpSumRepaymentStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LumpSumRepaymentStatus__C() {
        return cve__LumpSumRepaymentStatus__C;
    }

    /**
     * Sets the value of the cve__LumpSumRepaymentStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LumpSumRepaymentStatus__C(String value) {
        this.cve__LumpSumRepaymentStatus__C = value;
    }

    /**
     * Gets the value of the cve__MinimumBenefitCalculatedPerDay__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__MinimumBenefitCalculatedPerDay__C() {
        return cve__MinimumBenefitCalculatedPerDay__C;
    }

    /**
     * Sets the value of the cve__MinimumBenefitCalculatedPerDay__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__MinimumBenefitCalculatedPerDay__C(Boolean value) {
        this.cve__MinimumBenefitCalculatedPerDay__C = value;
    }

    /**
     * Gets the value of the cve__PayableExclusionPatterns__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PayableExclusionPatterns__C() {
        return cve__PayableExclusionPatterns__C;
    }

    /**
     * Sets the value of the cve__PayableExclusionPatterns__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PayableExclusionPatterns__C(String value) {
        this.cve__PayableExclusionPatterns__C = value;
    }

    /**
     * Gets the value of the cve__PayableInclusionPatterns__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PayableInclusionPatterns__C() {
        return cve__PayableInclusionPatterns__C;
    }

    /**
     * Sets the value of the cve__PayableInclusionPatterns__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PayableInclusionPatterns__C(String value) {
        this.cve__PayableInclusionPatterns__C = value;
    }

    /**
     * Gets the value of the cve__PayeeNameFormat__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PayeeNameFormat__C() {
        return cve__PayeeNameFormat__C;
    }

    /**
     * Sets the value of the cve__PayeeNameFormat__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PayeeNameFormat__C(String value) {
        this.cve__PayeeNameFormat__C = value;
    }

    /**
     * Gets the value of the cve__PaymentCalculationValidatorClass__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentCalculationValidatorClass__C() {
        return cve__PaymentCalculationValidatorClass__C;
    }

    /**
     * Sets the value of the cve__PaymentCalculationValidatorClass__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentCalculationValidatorClass__C(String value) {
        this.cve__PaymentCalculationValidatorClass__C = value;
    }

    /**
     * Gets the value of the cve__ShowAdjustmentColumns__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowAdjustmentColumns__C() {
        return cve__ShowAdjustmentColumns__C;
    }

    /**
     * Sets the value of the cve__ShowAdjustmentColumns__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowAdjustmentColumns__C(Boolean value) {
        this.cve__ShowAdjustmentColumns__C = value;
    }

    /**
     * Gets the value of the cve__ShowAttorneyFees__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowAttorneyFees__C() {
        return cve__ShowAttorneyFees__C;
    }

    /**
     * Sets the value of the cve__ShowAttorneyFees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowAttorneyFees__C(Boolean value) {
        this.cve__ShowAttorneyFees__C = value;
    }

    /**
     * Gets the value of the cve__ShowBeforeTaxesInCorrectionMode__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowBeforeTaxesInCorrectionMode__C() {
        return cve__ShowBeforeTaxesInCorrectionMode__C;
    }

    /**
     * Sets the value of the cve__ShowBeforeTaxesInCorrectionMode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowBeforeTaxesInCorrectionMode__C(Boolean value) {
        this.cve__ShowBeforeTaxesInCorrectionMode__C = value;
    }

    /**
     * Gets the value of the cve__ShowBenefitMinimumMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowBenefitMinimumMaximum__C() {
        return cve__ShowBenefitMinimumMaximum__C;
    }

    /**
     * Sets the value of the cve__ShowBenefitMinimumMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowBenefitMinimumMaximum__C(Boolean value) {
        this.cve__ShowBenefitMinimumMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ShowCalculateLiability__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowCalculateLiability__C() {
        return cve__ShowCalculateLiability__C;
    }

    /**
     * Sets the value of the cve__ShowCalculateLiability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowCalculateLiability__C(Boolean value) {
        this.cve__ShowCalculateLiability__C = value;
    }

    /**
     * Gets the value of the cve__ShowConsolidate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowConsolidate__C() {
        return cve__ShowConsolidate__C;
    }

    /**
     * Sets the value of the cve__ShowConsolidate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowConsolidate__C(Boolean value) {
        this.cve__ShowConsolidate__C = value;
    }

    /**
     * Gets the value of the cve__ShowExcludingRecoveryInCorrectionMode__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowExcludingRecoveryInCorrectionMode__C() {
        return cve__ShowExcludingRecoveryInCorrectionMode__C;
    }

    /**
     * Sets the value of the cve__ShowExcludingRecoveryInCorrectionMode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowExcludingRecoveryInCorrectionMode__C(Boolean value) {
        this.cve__ShowExcludingRecoveryInCorrectionMode__C = value;
    }

    /**
     * Gets the value of the cve__ShowIssueDateColumn__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowIssueDateColumn__C() {
        return cve__ShowIssueDateColumn__C;
    }

    /**
     * Sets the value of the cve__ShowIssueDateColumn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowIssueDateColumn__C(Boolean value) {
        this.cve__ShowIssueDateColumn__C = value;
    }

    /**
     * Gets the value of the cve__ShowNetInCorrectionMode__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowNetInCorrectionMode__C() {
        return cve__ShowNetInCorrectionMode__C;
    }

    /**
     * Sets the value of the cve__ShowNetInCorrectionMode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowNetInCorrectionMode__C(Boolean value) {
        this.cve__ShowNetInCorrectionMode__C = value;
    }

    /**
     * Gets the value of the cve__ShowPayableDateColumn__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowPayableDateColumn__C() {
        return cve__ShowPayableDateColumn__C;
    }

    /**
     * Sets the value of the cve__ShowPayableDateColumn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowPayableDateColumn__C(Boolean value) {
        this.cve__ShowPayableDateColumn__C = value;
    }

    /**
     * Gets the value of the cve__ShowPaymentCalculationHint__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowPaymentCalculationHint__C() {
        return cve__ShowPaymentCalculationHint__C;
    }

    /**
     * Sets the value of the cve__ShowPaymentCalculationHint__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowPaymentCalculationHint__C(Boolean value) {
        this.cve__ShowPaymentCalculationHint__C = value;
    }

    /**
     * Gets the value of the cve__ShowPrintDateColumn__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowPrintDateColumn__C() {
        return cve__ShowPrintDateColumn__C;
    }

    /**
     * Sets the value of the cve__ShowPrintDateColumn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowPrintDateColumn__C(Boolean value) {
        this.cve__ShowPrintDateColumn__C = value;
    }

    /**
     * Gets the value of the cve__ShowReissue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowReissue__C() {
        return cve__ShowReissue__C;
    }

    /**
     * Sets the value of the cve__ShowReissue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowReissue__C(Boolean value) {
        this.cve__ShowReissue__C = value;
    }

    /**
     * Gets the value of the cve__ShowReleaseDateColumn__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowReleaseDateColumn__C() {
        return cve__ShowReleaseDateColumn__C;
    }

    /**
     * Sets the value of the cve__ShowReleaseDateColumn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowReleaseDateColumn__C(Boolean value) {
        this.cve__ShowReleaseDateColumn__C = value;
    }

    /**
     * Gets the value of the cve__ShowSendNow__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowSendNow__C() {
        return cve__ShowSendNow__C;
    }

    /**
     * Sets the value of the cve__ShowSendNow__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowSendNow__C(Boolean value) {
        this.cve__ShowSendNow__C = value;
    }

    /**
     * Gets the value of the cve__ShowStop__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowStop__C() {
        return cve__ShowStop__C;
    }

    /**
     * Sets the value of the cve__ShowStop__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowStop__C(Boolean value) {
        this.cve__ShowStop__C = value;
    }

    /**
     * Gets the value of the cve__ShowTaxColumns__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowTaxColumns__C() {
        return cve__ShowTaxColumns__C;
    }

    /**
     * Sets the value of the cve__ShowTaxColumns__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowTaxColumns__C(Boolean value) {
        this.cve__ShowTaxColumns__C = value;
    }

    /**
     * Gets the value of the cve__ShowTaxRates__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowTaxRates__C() {
        return cve__ShowTaxRates__C;
    }

    /**
     * Sets the value of the cve__ShowTaxRates__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowTaxRates__C(Boolean value) {
        this.cve__ShowTaxRates__C = value;
    }

    /**
     * Gets the value of the cve__ShowVoid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowVoid__C() {
        return cve__ShowVoid__C;
    }

    /**
     * Sets the value of the cve__ShowVoid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowVoid__C(Boolean value) {
        this.cve__ShowVoid__C = value;
    }

    /**
     * Gets the value of the cve__StopOrVoidCopyEobs__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__StopOrVoidCopyEobs__C() {
        return cve__StopOrVoidCopyEobs__C;
    }

    /**
     * Sets the value of the cve__StopOrVoidCopyEobs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__StopOrVoidCopyEobs__C(Boolean value) {
        this.cve__StopOrVoidCopyEobs__C = value;
    }

    /**
     * Gets the value of the cve__StopOrVoidCopyPaymentMethod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__StopOrVoidCopyPaymentMethod__C() {
        return cve__StopOrVoidCopyPaymentMethod__C;
    }

    /**
     * Sets the value of the cve__StopOrVoidCopyPaymentMethod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__StopOrVoidCopyPaymentMethod__C(Boolean value) {
        this.cve__StopOrVoidCopyPaymentMethod__C = value;
    }

    /**
     * Gets the value of the cve__StopOrVoidStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StopOrVoidStatus__C() {
        return cve__StopOrVoidStatus__C;
    }

    /**
     * Sets the value of the cve__StopOrVoidStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StopOrVoidStatus__C(String value) {
        this.cve__StopOrVoidStatus__C = value;
    }

    /**
     * Gets the value of the cve__ThirtyDayMonthProration__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ThirtyDayMonthProration__C() {
        return cve__ThirtyDayMonthProration__C;
    }

    /**
     * Sets the value of the cve__ThirtyDayMonthProration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ThirtyDayMonthProration__C(Boolean value) {
        this.cve__ThirtyDayMonthProration__C = value;
    }

}
