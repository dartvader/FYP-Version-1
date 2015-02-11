
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__ReturnToWork__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__ReturnToWork__c">
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
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__Attachments__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedBenefitStart__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedBenefitThrough__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedDateOfDisability__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedId__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedRecordTypeId__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPerDay__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPerMonth__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPerWeek__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPerYear__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Earnings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HoursPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Hours__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Journal__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Journal__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Journal__c" minOccurs="0"/>
 *         &lt;element name="cve__Notes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Occupation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RateOfPayPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RateOfPay__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Restriction__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Start__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Through__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Type__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__ReturnToWork__c", propOrder = {
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
    "systemModstamp",
    "topicAssignments",
    "userRecordAccess",
    "cve__Attachments__C",
    "cve__BenefitClaimedBenefitStart__C",
    "cve__BenefitClaimedBenefitThrough__C",
    "cve__BenefitClaimedDateOfDisability__C",
    "cve__BenefitClaimedId__C",
    "cve__BenefitClaimedRecordTypeId__C",
    "cve__Days__C",
    "cve__EarningsPerDay__C",
    "cve__EarningsPerMonth__C",
    "cve__EarningsPerWeek__C",
    "cve__EarningsPerYear__C",
    "cve__EarningsPeriod__C",
    "cve__Earnings__C",
    "cve__HoursPeriod__C",
    "cve__Hours__C",
    "cve__Journal__C",
    "cve__Journal__R",
    "cve__Notes__C",
    "cve__Occupation__C",
    "cve__RateOfPayPeriod__C",
    "cve__RateOfPay__C",
    "cve__Restriction__C",
    "cve__Start__C",
    "cve__Status__C",
    "cve__Through__C",
    "cve__Type__C"
})
public class Cve__ReturnToWork__C
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
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__Attachments__c", nillable = true)
    protected Double cve__Attachments__C;
    @XmlElement(name = "cve__BenefitClaimedBenefitStart__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__BenefitClaimedBenefitStart__C;
    @XmlElement(name = "cve__BenefitClaimedBenefitThrough__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__BenefitClaimedBenefitThrough__C;
    @XmlElement(name = "cve__BenefitClaimedDateOfDisability__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__BenefitClaimedDateOfDisability__C;
    @XmlElement(name = "cve__BenefitClaimedId__c", nillable = true)
    protected String cve__BenefitClaimedId__C;
    @XmlElement(name = "cve__BenefitClaimedRecordTypeId__c", nillable = true)
    protected String cve__BenefitClaimedRecordTypeId__C;
    @XmlElement(name = "cve__Days__c", nillable = true)
    protected Double cve__Days__C;
    @XmlElement(name = "cve__EarningsPerDay__c", nillable = true)
    protected Double cve__EarningsPerDay__C;
    @XmlElement(name = "cve__EarningsPerMonth__c", nillable = true)
    protected Double cve__EarningsPerMonth__C;
    @XmlElement(name = "cve__EarningsPerWeek__c", nillable = true)
    protected Double cve__EarningsPerWeek__C;
    @XmlElement(name = "cve__EarningsPerYear__c", nillable = true)
    protected Double cve__EarningsPerYear__C;
    @XmlElement(name = "cve__EarningsPeriod__c", nillable = true)
    protected String cve__EarningsPeriod__C;
    @XmlElement(name = "cve__Earnings__c", nillable = true)
    protected Double cve__Earnings__C;
    @XmlElement(name = "cve__HoursPeriod__c", nillable = true)
    protected String cve__HoursPeriod__C;
    @XmlElement(name = "cve__Hours__c", nillable = true)
    protected Double cve__Hours__C;
    @XmlElement(name = "cve__Journal__c", nillable = true)
    protected String cve__Journal__C;
    @XmlElement(name = "cve__Journal__r", nillable = true)
    protected Cve__Journal__C cve__Journal__R;
    @XmlElement(name = "cve__Notes__c", nillable = true)
    protected Double cve__Notes__C;
    @XmlElement(name = "cve__Occupation__c", nillable = true)
    protected String cve__Occupation__C;
    @XmlElement(name = "cve__RateOfPayPeriod__c", nillable = true)
    protected String cve__RateOfPayPeriod__C;
    @XmlElement(name = "cve__RateOfPay__c", nillable = true)
    protected Double cve__RateOfPay__C;
    @XmlElement(name = "cve__Restriction__c", nillable = true)
    protected Boolean cve__Restriction__C;
    @XmlElement(name = "cve__Start__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Start__C;
    @XmlElement(name = "cve__Status__c", nillable = true)
    protected String cve__Status__C;
    @XmlElement(name = "cve__Through__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Through__C;
    @XmlElement(name = "cve__Type__c", nillable = true)
    protected String cve__Type__C;

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
     * Gets the value of the cve__Attachments__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Attachments__C() {
        return cve__Attachments__C;
    }

    /**
     * Sets the value of the cve__Attachments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Attachments__C(Double value) {
        this.cve__Attachments__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedBenefitStart__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__BenefitClaimedBenefitStart__C() {
        return cve__BenefitClaimedBenefitStart__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedBenefitStart__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__BenefitClaimedBenefitStart__C(XMLGregorianCalendar value) {
        this.cve__BenefitClaimedBenefitStart__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedBenefitThrough__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__BenefitClaimedBenefitThrough__C() {
        return cve__BenefitClaimedBenefitThrough__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedBenefitThrough__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__BenefitClaimedBenefitThrough__C(XMLGregorianCalendar value) {
        this.cve__BenefitClaimedBenefitThrough__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedDateOfDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__BenefitClaimedDateOfDisability__C() {
        return cve__BenefitClaimedDateOfDisability__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedDateOfDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__BenefitClaimedDateOfDisability__C(XMLGregorianCalendar value) {
        this.cve__BenefitClaimedDateOfDisability__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedId__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitClaimedId__C() {
        return cve__BenefitClaimedId__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedId__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitClaimedId__C(String value) {
        this.cve__BenefitClaimedId__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedRecordTypeId__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitClaimedRecordTypeId__C() {
        return cve__BenefitClaimedRecordTypeId__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedRecordTypeId__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitClaimedRecordTypeId__C(String value) {
        this.cve__BenefitClaimedRecordTypeId__C = value;
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
     * Gets the value of the cve__EarningsPerDay__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EarningsPerDay__C() {
        return cve__EarningsPerDay__C;
    }

    /**
     * Sets the value of the cve__EarningsPerDay__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EarningsPerDay__C(Double value) {
        this.cve__EarningsPerDay__C = value;
    }

    /**
     * Gets the value of the cve__EarningsPerMonth__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EarningsPerMonth__C() {
        return cve__EarningsPerMonth__C;
    }

    /**
     * Sets the value of the cve__EarningsPerMonth__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EarningsPerMonth__C(Double value) {
        this.cve__EarningsPerMonth__C = value;
    }

    /**
     * Gets the value of the cve__EarningsPerWeek__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EarningsPerWeek__C() {
        return cve__EarningsPerWeek__C;
    }

    /**
     * Sets the value of the cve__EarningsPerWeek__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EarningsPerWeek__C(Double value) {
        this.cve__EarningsPerWeek__C = value;
    }

    /**
     * Gets the value of the cve__EarningsPerYear__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EarningsPerYear__C() {
        return cve__EarningsPerYear__C;
    }

    /**
     * Sets the value of the cve__EarningsPerYear__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EarningsPerYear__C(Double value) {
        this.cve__EarningsPerYear__C = value;
    }

    /**
     * Gets the value of the cve__EarningsPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EarningsPeriod__C() {
        return cve__EarningsPeriod__C;
    }

    /**
     * Sets the value of the cve__EarningsPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EarningsPeriod__C(String value) {
        this.cve__EarningsPeriod__C = value;
    }

    /**
     * Gets the value of the cve__Earnings__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Earnings__C() {
        return cve__Earnings__C;
    }

    /**
     * Sets the value of the cve__Earnings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Earnings__C(Double value) {
        this.cve__Earnings__C = value;
    }

    /**
     * Gets the value of the cve__HoursPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__HoursPeriod__C() {
        return cve__HoursPeriod__C;
    }

    /**
     * Sets the value of the cve__HoursPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__HoursPeriod__C(String value) {
        this.cve__HoursPeriod__C = value;
    }

    /**
     * Gets the value of the cve__Hours__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Hours__C() {
        return cve__Hours__C;
    }

    /**
     * Sets the value of the cve__Hours__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Hours__C(Double value) {
        this.cve__Hours__C = value;
    }

    /**
     * Gets the value of the cve__Journal__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Journal__C() {
        return cve__Journal__C;
    }

    /**
     * Sets the value of the cve__Journal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Journal__C(String value) {
        this.cve__Journal__C = value;
    }

    /**
     * Gets the value of the cve__Journal__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Journal__C }
     *     
     */
    public Cve__Journal__C getCve__Journal__R() {
        return cve__Journal__R;
    }

    /**
     * Sets the value of the cve__Journal__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Journal__C }
     *     
     */
    public void setCve__Journal__R(Cve__Journal__C value) {
        this.cve__Journal__R = value;
    }

    /**
     * Gets the value of the cve__Notes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Notes__C() {
        return cve__Notes__C;
    }

    /**
     * Sets the value of the cve__Notes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Notes__C(Double value) {
        this.cve__Notes__C = value;
    }

    /**
     * Gets the value of the cve__Occupation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Occupation__C() {
        return cve__Occupation__C;
    }

    /**
     * Sets the value of the cve__Occupation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Occupation__C(String value) {
        this.cve__Occupation__C = value;
    }

    /**
     * Gets the value of the cve__RateOfPayPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RateOfPayPeriod__C() {
        return cve__RateOfPayPeriod__C;
    }

    /**
     * Sets the value of the cve__RateOfPayPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RateOfPayPeriod__C(String value) {
        this.cve__RateOfPayPeriod__C = value;
    }

    /**
     * Gets the value of the cve__RateOfPay__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RateOfPay__C() {
        return cve__RateOfPay__C;
    }

    /**
     * Sets the value of the cve__RateOfPay__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RateOfPay__C(Double value) {
        this.cve__RateOfPay__C = value;
    }

    /**
     * Gets the value of the cve__Restriction__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Restriction__C() {
        return cve__Restriction__C;
    }

    /**
     * Sets the value of the cve__Restriction__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Restriction__C(Boolean value) {
        this.cve__Restriction__C = value;
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
     * Gets the value of the cve__Type__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Type__C() {
        return cve__Type__C;
    }

    /**
     * Sets the value of the cve__Type__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Type__C(String value) {
        this.cve__Type__C = value;
    }

}
