
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__UnallocatedPayment__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__UnallocatedPayment__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
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
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentsAfterTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentsAndCorrectionsAfterTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentsAndCorrectionsBeforeTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentsBeforeTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AppliedAdjustments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__AttorneyFees__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__BeforeTaxesPaid__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__FicaTaxableBenefitAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__GrossBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Issue__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__LumpSumBeforeTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LumpSum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NetAfterTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NetBeforeTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NetExcludingRecovery__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Net__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentAfterTaxesBalance__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentAfterTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBeforeTaxesBalance__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentBeforeTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentCorrectionsAfterTaxesTotal__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentCorrectionsAfterTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentCorrectionsBeforeTaxesTotal__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverpaymentCorrectionsBeforeTaxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PaidExcludingRecovery__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Paid__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Payable__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecification__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecification__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSpecification__c" minOccurs="0"/>
 *         &lt;element name="cve__Payments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__RecordTypeName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Start__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Taxes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Through__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__UnallocatedPayment__c", propOrder = {
    "attachments",
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
    "notes",
    "notesAndAttachments",
    "processInstances",
    "processSteps",
    "recordType",
    "recordTypeId",
    "systemModstamp",
    "topicAssignments",
    "userRecordAccess",
    "cve__AdjustmentsAfterTaxes__C",
    "cve__AdjustmentsAndCorrectionsAfterTaxes__C",
    "cve__AdjustmentsAndCorrectionsBeforeTaxes__C",
    "cve__AdjustmentsBeforeTaxes__C",
    "cve__AppliedAdjustments__R",
    "cve__AttorneyFees__C",
    "cve__BeforeTaxesPaid__C",
    "cve__FicaTaxableBenefitAmount__C",
    "cve__GrossBenefit__C",
    "cve__Issue__C",
    "cve__LumpSumBeforeTaxes__C",
    "cve__LumpSum__C",
    "cve__NetAfterTaxes__C",
    "cve__NetBeforeTaxes__C",
    "cve__NetExcludingRecovery__C",
    "cve__Net__C",
    "cve__OverpaymentAfterTaxesBalance__C",
    "cve__OverpaymentAfterTaxes__C",
    "cve__OverpaymentBeforeTaxesBalance__C",
    "cve__OverpaymentBeforeTaxes__C",
    "cve__OverpaymentCorrectionsAfterTaxesTotal__C",
    "cve__OverpaymentCorrectionsAfterTaxes__C",
    "cve__OverpaymentCorrectionsBeforeTaxesTotal__C",
    "cve__OverpaymentCorrectionsBeforeTaxes__C",
    "cve__PaidExcludingRecovery__C",
    "cve__Paid__C",
    "cve__Payable__C",
    "cve__PaymentSpecification__C",
    "cve__PaymentSpecification__R",
    "cve__Payments__R",
    "cve__RecordTypeName__C",
    "cve__Start__C",
    "cve__Taxes__C",
    "cve__Through__C"
})
public class Cve__UnallocatedPayment__C
    extends SObject
{

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
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResultType notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResultType notesAndAttachments;
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
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__AdjustmentsAfterTaxes__c", nillable = true)
    protected Double cve__AdjustmentsAfterTaxes__C;
    @XmlElement(name = "cve__AdjustmentsAndCorrectionsAfterTaxes__c", nillable = true)
    protected Double cve__AdjustmentsAndCorrectionsAfterTaxes__C;
    @XmlElement(name = "cve__AdjustmentsAndCorrectionsBeforeTaxes__c", nillable = true)
    protected Double cve__AdjustmentsAndCorrectionsBeforeTaxes__C;
    @XmlElement(name = "cve__AdjustmentsBeforeTaxes__c", nillable = true)
    protected Double cve__AdjustmentsBeforeTaxes__C;
    @XmlElement(name = "cve__AppliedAdjustments__r", nillable = true)
    protected QueryResultType cve__AppliedAdjustments__R;
    @XmlElement(name = "cve__AttorneyFees__c", nillable = true)
    protected Double cve__AttorneyFees__C;
    @XmlElement(name = "cve__BeforeTaxesPaid__c", nillable = true)
    protected Double cve__BeforeTaxesPaid__C;
    @XmlElement(name = "cve__FicaTaxableBenefitAmount__c", nillable = true)
    protected Double cve__FicaTaxableBenefitAmount__C;
    @XmlElement(name = "cve__GrossBenefit__c", nillable = true)
    protected Double cve__GrossBenefit__C;
    @XmlElement(name = "cve__Issue__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Issue__C;
    @XmlElement(name = "cve__LumpSumBeforeTaxes__c", nillable = true)
    protected Double cve__LumpSumBeforeTaxes__C;
    @XmlElement(name = "cve__LumpSum__c", nillable = true)
    protected Double cve__LumpSum__C;
    @XmlElement(name = "cve__NetAfterTaxes__c", nillable = true)
    protected Double cve__NetAfterTaxes__C;
    @XmlElement(name = "cve__NetBeforeTaxes__c", nillable = true)
    protected Double cve__NetBeforeTaxes__C;
    @XmlElement(name = "cve__NetExcludingRecovery__c", nillable = true)
    protected Double cve__NetExcludingRecovery__C;
    @XmlElement(name = "cve__Net__c", nillable = true)
    protected Double cve__Net__C;
    @XmlElement(name = "cve__OverpaymentAfterTaxesBalance__c", nillable = true)
    protected Double cve__OverpaymentAfterTaxesBalance__C;
    @XmlElement(name = "cve__OverpaymentAfterTaxes__c", nillable = true)
    protected Double cve__OverpaymentAfterTaxes__C;
    @XmlElement(name = "cve__OverpaymentBeforeTaxesBalance__c", nillable = true)
    protected Double cve__OverpaymentBeforeTaxesBalance__C;
    @XmlElement(name = "cve__OverpaymentBeforeTaxes__c", nillable = true)
    protected Double cve__OverpaymentBeforeTaxes__C;
    @XmlElement(name = "cve__OverpaymentCorrectionsAfterTaxesTotal__c", nillable = true)
    protected Double cve__OverpaymentCorrectionsAfterTaxesTotal__C;
    @XmlElement(name = "cve__OverpaymentCorrectionsAfterTaxes__c", nillable = true)
    protected Double cve__OverpaymentCorrectionsAfterTaxes__C;
    @XmlElement(name = "cve__OverpaymentCorrectionsBeforeTaxesTotal__c", nillable = true)
    protected Double cve__OverpaymentCorrectionsBeforeTaxesTotal__C;
    @XmlElement(name = "cve__OverpaymentCorrectionsBeforeTaxes__c", nillable = true)
    protected Double cve__OverpaymentCorrectionsBeforeTaxes__C;
    @XmlElement(name = "cve__PaidExcludingRecovery__c", nillable = true)
    protected Double cve__PaidExcludingRecovery__C;
    @XmlElement(name = "cve__Paid__c", nillable = true)
    protected Double cve__Paid__C;
    @XmlElement(name = "cve__Payable__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Payable__C;
    @XmlElement(name = "cve__PaymentSpecification__c", nillable = true)
    protected String cve__PaymentSpecification__C;
    @XmlElement(name = "cve__PaymentSpecification__r", nillable = true)
    protected Cve__PaymentSpecification__C cve__PaymentSpecification__R;
    @XmlElement(name = "cve__Payments__r", nillable = true)
    protected QueryResultType cve__Payments__R;
    @XmlElement(name = "cve__RecordTypeName__c", nillable = true)
    protected String cve__RecordTypeName__C;
    @XmlElement(name = "cve__Start__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Start__C;
    @XmlElement(name = "cve__Taxes__c", nillable = true)
    protected Double cve__Taxes__C;
    @XmlElement(name = "cve__Through__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Through__C;

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
     * Gets the value of the cve__AdjustmentsAfterTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdjustmentsAfterTaxes__C() {
        return cve__AdjustmentsAfterTaxes__C;
    }

    /**
     * Sets the value of the cve__AdjustmentsAfterTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdjustmentsAfterTaxes__C(Double value) {
        this.cve__AdjustmentsAfterTaxes__C = value;
    }

    /**
     * Gets the value of the cve__AdjustmentsAndCorrectionsAfterTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdjustmentsAndCorrectionsAfterTaxes__C() {
        return cve__AdjustmentsAndCorrectionsAfterTaxes__C;
    }

    /**
     * Sets the value of the cve__AdjustmentsAndCorrectionsAfterTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdjustmentsAndCorrectionsAfterTaxes__C(Double value) {
        this.cve__AdjustmentsAndCorrectionsAfterTaxes__C = value;
    }

    /**
     * Gets the value of the cve__AdjustmentsAndCorrectionsBeforeTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdjustmentsAndCorrectionsBeforeTaxes__C() {
        return cve__AdjustmentsAndCorrectionsBeforeTaxes__C;
    }

    /**
     * Sets the value of the cve__AdjustmentsAndCorrectionsBeforeTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdjustmentsAndCorrectionsBeforeTaxes__C(Double value) {
        this.cve__AdjustmentsAndCorrectionsBeforeTaxes__C = value;
    }

    /**
     * Gets the value of the cve__AdjustmentsBeforeTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdjustmentsBeforeTaxes__C() {
        return cve__AdjustmentsBeforeTaxes__C;
    }

    /**
     * Sets the value of the cve__AdjustmentsBeforeTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdjustmentsBeforeTaxes__C(Double value) {
        this.cve__AdjustmentsBeforeTaxes__C = value;
    }

    /**
     * Gets the value of the cve__AppliedAdjustments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__AppliedAdjustments__R() {
        return cve__AppliedAdjustments__R;
    }

    /**
     * Sets the value of the cve__AppliedAdjustments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__AppliedAdjustments__R(QueryResultType value) {
        this.cve__AppliedAdjustments__R = value;
    }

    /**
     * Gets the value of the cve__AttorneyFees__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AttorneyFees__C() {
        return cve__AttorneyFees__C;
    }

    /**
     * Sets the value of the cve__AttorneyFees__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AttorneyFees__C(Double value) {
        this.cve__AttorneyFees__C = value;
    }

    /**
     * Gets the value of the cve__BeforeTaxesPaid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__BeforeTaxesPaid__C() {
        return cve__BeforeTaxesPaid__C;
    }

    /**
     * Sets the value of the cve__BeforeTaxesPaid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__BeforeTaxesPaid__C(Double value) {
        this.cve__BeforeTaxesPaid__C = value;
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
     * Gets the value of the cve__GrossBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__GrossBenefit__C() {
        return cve__GrossBenefit__C;
    }

    /**
     * Sets the value of the cve__GrossBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__GrossBenefit__C(Double value) {
        this.cve__GrossBenefit__C = value;
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
     * Gets the value of the cve__LumpSumBeforeTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LumpSumBeforeTaxes__C() {
        return cve__LumpSumBeforeTaxes__C;
    }

    /**
     * Sets the value of the cve__LumpSumBeforeTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LumpSumBeforeTaxes__C(Double value) {
        this.cve__LumpSumBeforeTaxes__C = value;
    }

    /**
     * Gets the value of the cve__LumpSum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LumpSum__C() {
        return cve__LumpSum__C;
    }

    /**
     * Sets the value of the cve__LumpSum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LumpSum__C(Double value) {
        this.cve__LumpSum__C = value;
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
     * Gets the value of the cve__NetExcludingRecovery__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NetExcludingRecovery__C() {
        return cve__NetExcludingRecovery__C;
    }

    /**
     * Sets the value of the cve__NetExcludingRecovery__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NetExcludingRecovery__C(Double value) {
        this.cve__NetExcludingRecovery__C = value;
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
     * Gets the value of the cve__OverpaymentAfterTaxesBalance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentAfterTaxesBalance__C() {
        return cve__OverpaymentAfterTaxesBalance__C;
    }

    /**
     * Sets the value of the cve__OverpaymentAfterTaxesBalance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentAfterTaxesBalance__C(Double value) {
        this.cve__OverpaymentAfterTaxesBalance__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentAfterTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentAfterTaxes__C() {
        return cve__OverpaymentAfterTaxes__C;
    }

    /**
     * Sets the value of the cve__OverpaymentAfterTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentAfterTaxes__C(Double value) {
        this.cve__OverpaymentAfterTaxes__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentBeforeTaxesBalance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentBeforeTaxesBalance__C() {
        return cve__OverpaymentBeforeTaxesBalance__C;
    }

    /**
     * Sets the value of the cve__OverpaymentBeforeTaxesBalance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentBeforeTaxesBalance__C(Double value) {
        this.cve__OverpaymentBeforeTaxesBalance__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentBeforeTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentBeforeTaxes__C() {
        return cve__OverpaymentBeforeTaxes__C;
    }

    /**
     * Sets the value of the cve__OverpaymentBeforeTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentBeforeTaxes__C(Double value) {
        this.cve__OverpaymentBeforeTaxes__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentCorrectionsAfterTaxesTotal__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentCorrectionsAfterTaxesTotal__C() {
        return cve__OverpaymentCorrectionsAfterTaxesTotal__C;
    }

    /**
     * Sets the value of the cve__OverpaymentCorrectionsAfterTaxesTotal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentCorrectionsAfterTaxesTotal__C(Double value) {
        this.cve__OverpaymentCorrectionsAfterTaxesTotal__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentCorrectionsAfterTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentCorrectionsAfterTaxes__C() {
        return cve__OverpaymentCorrectionsAfterTaxes__C;
    }

    /**
     * Sets the value of the cve__OverpaymentCorrectionsAfterTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentCorrectionsAfterTaxes__C(Double value) {
        this.cve__OverpaymentCorrectionsAfterTaxes__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentCorrectionsBeforeTaxesTotal__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentCorrectionsBeforeTaxesTotal__C() {
        return cve__OverpaymentCorrectionsBeforeTaxesTotal__C;
    }

    /**
     * Sets the value of the cve__OverpaymentCorrectionsBeforeTaxesTotal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentCorrectionsBeforeTaxesTotal__C(Double value) {
        this.cve__OverpaymentCorrectionsBeforeTaxesTotal__C = value;
    }

    /**
     * Gets the value of the cve__OverpaymentCorrectionsBeforeTaxes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverpaymentCorrectionsBeforeTaxes__C() {
        return cve__OverpaymentCorrectionsBeforeTaxes__C;
    }

    /**
     * Sets the value of the cve__OverpaymentCorrectionsBeforeTaxes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverpaymentCorrectionsBeforeTaxes__C(Double value) {
        this.cve__OverpaymentCorrectionsBeforeTaxes__C = value;
    }

    /**
     * Gets the value of the cve__PaidExcludingRecovery__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PaidExcludingRecovery__C() {
        return cve__PaidExcludingRecovery__C;
    }

    /**
     * Sets the value of the cve__PaidExcludingRecovery__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PaidExcludingRecovery__C(Double value) {
        this.cve__PaidExcludingRecovery__C = value;
    }

    /**
     * Gets the value of the cve__Paid__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Paid__C() {
        return cve__Paid__C;
    }

    /**
     * Sets the value of the cve__Paid__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Paid__C(Double value) {
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

}
