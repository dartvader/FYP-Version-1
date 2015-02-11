
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__PredictiveModel__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__PredictiveModel__c">
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
 *         &lt;element name="cve__AgeDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Age__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__GenderDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Gender__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Cm1Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Cm1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Cm2Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Cm2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Cm3Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Cm3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Days__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Icd9Description__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Icd9__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__InsideUsDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__InsideUs__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__JobClassDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__JobClass__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Journal__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Journal__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Journal__c" minOccurs="0"/>
 *         &lt;element name="cve__PredictedDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PredictiveModelConditionFactors__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__UsRegionDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__UsRegion__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WorkersCompensationDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WorkersCompensation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__YearIncurredDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__YearIncurred__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__PredictiveModel__c", propOrder = {
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
    "cve__AgeDays__C",
    "cve__Age__C",
    "cve__GenderDays__C",
    "cve__Gender__C",
    "cve__Icd9Cm1Days__C",
    "cve__Icd9Cm1__C",
    "cve__Icd9Cm2Days__C",
    "cve__Icd9Cm2__C",
    "cve__Icd9Cm3Days__C",
    "cve__Icd9Cm3__C",
    "cve__Icd9Days__C",
    "cve__Icd9Description__C",
    "cve__Icd9__C",
    "cve__InsideUsDays__C",
    "cve__InsideUs__C",
    "cve__JobClassDays__C",
    "cve__JobClass__C",
    "cve__Journal__C",
    "cve__Journal__R",
    "cve__PredictedDays__C",
    "cve__PredictiveModelConditionFactors__R",
    "cve__UsRegionDays__C",
    "cve__UsRegion__C",
    "cve__WorkersCompensationDays__C",
    "cve__WorkersCompensation__C",
    "cve__YearIncurredDays__C",
    "cve__YearIncurred__C"
})
public class Cve__PredictiveModel__C
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
    @XmlElement(name = "cve__AgeDays__c", nillable = true)
    protected Double cve__AgeDays__C;
    @XmlElement(name = "cve__Age__c", nillable = true)
    protected Double cve__Age__C;
    @XmlElement(name = "cve__GenderDays__c", nillable = true)
    protected Double cve__GenderDays__C;
    @XmlElement(name = "cve__Gender__c", nillable = true)
    protected String cve__Gender__C;
    @XmlElement(name = "cve__Icd9Cm1Days__c", nillable = true)
    protected Double cve__Icd9Cm1Days__C;
    @XmlElement(name = "cve__Icd9Cm1__c", nillable = true)
    protected String cve__Icd9Cm1__C;
    @XmlElement(name = "cve__Icd9Cm2Days__c", nillable = true)
    protected Double cve__Icd9Cm2Days__C;
    @XmlElement(name = "cve__Icd9Cm2__c", nillable = true)
    protected String cve__Icd9Cm2__C;
    @XmlElement(name = "cve__Icd9Cm3Days__c", nillable = true)
    protected Double cve__Icd9Cm3Days__C;
    @XmlElement(name = "cve__Icd9Cm3__c", nillable = true)
    protected String cve__Icd9Cm3__C;
    @XmlElement(name = "cve__Icd9Days__c", nillable = true)
    protected Double cve__Icd9Days__C;
    @XmlElement(name = "cve__Icd9Description__c", nillable = true)
    protected String cve__Icd9Description__C;
    @XmlElement(name = "cve__Icd9__c", nillable = true)
    protected String cve__Icd9__C;
    @XmlElement(name = "cve__InsideUsDays__c", nillable = true)
    protected Double cve__InsideUsDays__C;
    @XmlElement(name = "cve__InsideUs__c", nillable = true)
    protected Boolean cve__InsideUs__C;
    @XmlElement(name = "cve__JobClassDays__c", nillable = true)
    protected Double cve__JobClassDays__C;
    @XmlElement(name = "cve__JobClass__c", nillable = true)
    protected String cve__JobClass__C;
    @XmlElement(name = "cve__Journal__c", nillable = true)
    protected String cve__Journal__C;
    @XmlElement(name = "cve__Journal__r", nillable = true)
    protected Cve__Journal__C cve__Journal__R;
    @XmlElement(name = "cve__PredictedDays__c", nillable = true)
    protected Double cve__PredictedDays__C;
    @XmlElement(name = "cve__PredictiveModelConditionFactors__r", nillable = true)
    protected QueryResultType cve__PredictiveModelConditionFactors__R;
    @XmlElement(name = "cve__UsRegionDays__c", nillable = true)
    protected Double cve__UsRegionDays__C;
    @XmlElement(name = "cve__UsRegion__c", nillable = true)
    protected String cve__UsRegion__C;
    @XmlElement(name = "cve__WorkersCompensationDays__c", nillable = true)
    protected Double cve__WorkersCompensationDays__C;
    @XmlElement(name = "cve__WorkersCompensation__c", nillable = true)
    protected Boolean cve__WorkersCompensation__C;
    @XmlElement(name = "cve__YearIncurredDays__c", nillable = true)
    protected Double cve__YearIncurredDays__C;
    @XmlElement(name = "cve__YearIncurred__c", nillable = true)
    protected String cve__YearIncurred__C;

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
     * Gets the value of the cve__AgeDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AgeDays__C() {
        return cve__AgeDays__C;
    }

    /**
     * Sets the value of the cve__AgeDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AgeDays__C(Double value) {
        this.cve__AgeDays__C = value;
    }

    /**
     * Gets the value of the cve__Age__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Age__C() {
        return cve__Age__C;
    }

    /**
     * Sets the value of the cve__Age__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Age__C(Double value) {
        this.cve__Age__C = value;
    }

    /**
     * Gets the value of the cve__GenderDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__GenderDays__C() {
        return cve__GenderDays__C;
    }

    /**
     * Sets the value of the cve__GenderDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__GenderDays__C(Double value) {
        this.cve__GenderDays__C = value;
    }

    /**
     * Gets the value of the cve__Gender__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Gender__C() {
        return cve__Gender__C;
    }

    /**
     * Sets the value of the cve__Gender__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Gender__C(String value) {
        this.cve__Gender__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Cm1Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Icd9Cm1Days__C() {
        return cve__Icd9Cm1Days__C;
    }

    /**
     * Sets the value of the cve__Icd9Cm1Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Icd9Cm1Days__C(Double value) {
        this.cve__Icd9Cm1Days__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Cm1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Icd9Cm1__C() {
        return cve__Icd9Cm1__C;
    }

    /**
     * Sets the value of the cve__Icd9Cm1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Icd9Cm1__C(String value) {
        this.cve__Icd9Cm1__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Cm2Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Icd9Cm2Days__C() {
        return cve__Icd9Cm2Days__C;
    }

    /**
     * Sets the value of the cve__Icd9Cm2Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Icd9Cm2Days__C(Double value) {
        this.cve__Icd9Cm2Days__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Cm2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Icd9Cm2__C() {
        return cve__Icd9Cm2__C;
    }

    /**
     * Sets the value of the cve__Icd9Cm2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Icd9Cm2__C(String value) {
        this.cve__Icd9Cm2__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Cm3Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Icd9Cm3Days__C() {
        return cve__Icd9Cm3Days__C;
    }

    /**
     * Sets the value of the cve__Icd9Cm3Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Icd9Cm3Days__C(Double value) {
        this.cve__Icd9Cm3Days__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Cm3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Icd9Cm3__C() {
        return cve__Icd9Cm3__C;
    }

    /**
     * Sets the value of the cve__Icd9Cm3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Icd9Cm3__C(String value) {
        this.cve__Icd9Cm3__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Days__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Icd9Days__C() {
        return cve__Icd9Days__C;
    }

    /**
     * Sets the value of the cve__Icd9Days__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Icd9Days__C(Double value) {
        this.cve__Icd9Days__C = value;
    }

    /**
     * Gets the value of the cve__Icd9Description__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Icd9Description__C() {
        return cve__Icd9Description__C;
    }

    /**
     * Sets the value of the cve__Icd9Description__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Icd9Description__C(String value) {
        this.cve__Icd9Description__C = value;
    }

    /**
     * Gets the value of the cve__Icd9__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Icd9__C() {
        return cve__Icd9__C;
    }

    /**
     * Sets the value of the cve__Icd9__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Icd9__C(String value) {
        this.cve__Icd9__C = value;
    }

    /**
     * Gets the value of the cve__InsideUsDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__InsideUsDays__C() {
        return cve__InsideUsDays__C;
    }

    /**
     * Sets the value of the cve__InsideUsDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__InsideUsDays__C(Double value) {
        this.cve__InsideUsDays__C = value;
    }

    /**
     * Gets the value of the cve__InsideUs__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__InsideUs__C() {
        return cve__InsideUs__C;
    }

    /**
     * Sets the value of the cve__InsideUs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__InsideUs__C(Boolean value) {
        this.cve__InsideUs__C = value;
    }

    /**
     * Gets the value of the cve__JobClassDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__JobClassDays__C() {
        return cve__JobClassDays__C;
    }

    /**
     * Sets the value of the cve__JobClassDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__JobClassDays__C(Double value) {
        this.cve__JobClassDays__C = value;
    }

    /**
     * Gets the value of the cve__JobClass__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__JobClass__C() {
        return cve__JobClass__C;
    }

    /**
     * Sets the value of the cve__JobClass__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__JobClass__C(String value) {
        this.cve__JobClass__C = value;
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
     * Gets the value of the cve__PredictedDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PredictedDays__C() {
        return cve__PredictedDays__C;
    }

    /**
     * Sets the value of the cve__PredictedDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PredictedDays__C(Double value) {
        this.cve__PredictedDays__C = value;
    }

    /**
     * Gets the value of the cve__PredictiveModelConditionFactors__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PredictiveModelConditionFactors__R() {
        return cve__PredictiveModelConditionFactors__R;
    }

    /**
     * Sets the value of the cve__PredictiveModelConditionFactors__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PredictiveModelConditionFactors__R(QueryResultType value) {
        this.cve__PredictiveModelConditionFactors__R = value;
    }

    /**
     * Gets the value of the cve__UsRegionDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__UsRegionDays__C() {
        return cve__UsRegionDays__C;
    }

    /**
     * Sets the value of the cve__UsRegionDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__UsRegionDays__C(Double value) {
        this.cve__UsRegionDays__C = value;
    }

    /**
     * Gets the value of the cve__UsRegion__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__UsRegion__C() {
        return cve__UsRegion__C;
    }

    /**
     * Sets the value of the cve__UsRegion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__UsRegion__C(String value) {
        this.cve__UsRegion__C = value;
    }

    /**
     * Gets the value of the cve__WorkersCompensationDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WorkersCompensationDays__C() {
        return cve__WorkersCompensationDays__C;
    }

    /**
     * Sets the value of the cve__WorkersCompensationDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WorkersCompensationDays__C(Double value) {
        this.cve__WorkersCompensationDays__C = value;
    }

    /**
     * Gets the value of the cve__WorkersCompensation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__WorkersCompensation__C() {
        return cve__WorkersCompensation__C;
    }

    /**
     * Sets the value of the cve__WorkersCompensation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__WorkersCompensation__C(Boolean value) {
        this.cve__WorkersCompensation__C = value;
    }

    /**
     * Gets the value of the cve__YearIncurredDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__YearIncurredDays__C() {
        return cve__YearIncurredDays__C;
    }

    /**
     * Sets the value of the cve__YearIncurredDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__YearIncurredDays__C(Double value) {
        this.cve__YearIncurredDays__C = value;
    }

    /**
     * Gets the value of the cve__YearIncurred__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__YearIncurred__C() {
        return cve__YearIncurred__C;
    }

    /**
     * Sets the value of the cve__YearIncurred__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__YearIncurred__C(String value) {
        this.cve__YearIncurred__C = value;
    }

}
