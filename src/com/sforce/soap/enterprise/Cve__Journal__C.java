
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__Journal__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__Journal__c">
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
 *         &lt;element name="cve__Answers__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimed__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimed__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__BenefitClaimed__c" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimeds__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__CalculatedAdjustmentsExplanation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CalculatedEarningsPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CalculatedEarnings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Claim__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Claim__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Claim__c" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccountName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredAccount__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__Diagnoses__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__EarningsDefinition__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPerMonth__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPerWeek__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EligibilityResult__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EligibilityStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ExpectedReturnToWork__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__FirstHospitalized__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__FirstSymptomsAppeared__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__FirstTreatment__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Investigations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__JobClassification__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__JobTitle__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__JournalSections__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__LastViewedTab__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PhoneNotes__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PredictiveModels__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Rehabilitations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ReturnToWorks__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__WorkRelated__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__Journal__c", propOrder = {
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
    "lookedUpFromActivities",
    "name",
    "notes",
    "notesAndAttachments",
    "openActivities",
    "owner",
    "ownerId",
    "processInstances",
    "processSteps",
    "systemModstamp",
    "tasks",
    "topicAssignments",
    "userRecordAccess",
    "cve__Answers__R",
    "cve__BenefitClaimed__C",
    "cve__BenefitClaimed__R",
    "cve__BenefitClaimeds__R",
    "cve__CalculatedAdjustmentsExplanation__C",
    "cve__CalculatedEarningsPeriod__C",
    "cve__CalculatedEarnings__C",
    "cve__Claim__C",
    "cve__Claim__R",
    "cve__ClaimantInsuredAccountName__C",
    "cve__ClaimantInsuredAccount__C",
    "cve__ClaimantInsuredAccount__R",
    "cve__Diagnoses__R",
    "cve__EarningsDefinition__C",
    "cve__EarningsPerMonth__C",
    "cve__EarningsPerWeek__C",
    "cve__EligibilityResult__C",
    "cve__EligibilityStatus__C",
    "cve__ExpectedReturnToWork__C",
    "cve__FirstHospitalized__C",
    "cve__FirstSymptomsAppeared__C",
    "cve__FirstTreatment__C",
    "cve__Investigations__R",
    "cve__JobClassification__C",
    "cve__JobTitle__C",
    "cve__JournalSections__R",
    "cve__LastViewedTab__C",
    "cve__PhoneNotes__R",
    "cve__PredictiveModels__R",
    "cve__Rehabilitations__R",
    "cve__ReturnToWorks__R",
    "cve__WorkRelated__C"
})
public class Cve__Journal__C
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
    @XmlElement(name = "cve__Answers__r", nillable = true)
    protected QueryResultType cve__Answers__R;
    @XmlElement(name = "cve__BenefitClaimed__c", nillable = true)
    protected String cve__BenefitClaimed__C;
    @XmlElement(name = "cve__BenefitClaimed__r", nillable = true)
    protected Cve__BenefitClaimed__C cve__BenefitClaimed__R;
    @XmlElement(name = "cve__BenefitClaimeds__r", nillable = true)
    protected QueryResultType cve__BenefitClaimeds__R;
    @XmlElement(name = "cve__CalculatedAdjustmentsExplanation__c", nillable = true)
    protected String cve__CalculatedAdjustmentsExplanation__C;
    @XmlElement(name = "cve__CalculatedEarningsPeriod__c", nillable = true)
    protected String cve__CalculatedEarningsPeriod__C;
    @XmlElement(name = "cve__CalculatedEarnings__c", nillable = true)
    protected Double cve__CalculatedEarnings__C;
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
    @XmlElement(name = "cve__Diagnoses__r", nillable = true)
    protected QueryResultType cve__Diagnoses__R;
    @XmlElement(name = "cve__EarningsDefinition__c", nillable = true)
    protected String cve__EarningsDefinition__C;
    @XmlElement(name = "cve__EarningsPerMonth__c", nillable = true)
    protected Double cve__EarningsPerMonth__C;
    @XmlElement(name = "cve__EarningsPerWeek__c", nillable = true)
    protected Double cve__EarningsPerWeek__C;
    @XmlElement(name = "cve__EligibilityResult__c", nillable = true)
    protected String cve__EligibilityResult__C;
    @XmlElement(name = "cve__EligibilityStatus__c", nillable = true)
    protected String cve__EligibilityStatus__C;
    @XmlElement(name = "cve__ExpectedReturnToWork__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__ExpectedReturnToWork__C;
    @XmlElement(name = "cve__FirstHospitalized__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__FirstHospitalized__C;
    @XmlElement(name = "cve__FirstSymptomsAppeared__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__FirstSymptomsAppeared__C;
    @XmlElement(name = "cve__FirstTreatment__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__FirstTreatment__C;
    @XmlElement(name = "cve__Investigations__r", nillable = true)
    protected QueryResultType cve__Investigations__R;
    @XmlElement(name = "cve__JobClassification__c", nillable = true)
    protected String cve__JobClassification__C;
    @XmlElement(name = "cve__JobTitle__c", nillable = true)
    protected String cve__JobTitle__C;
    @XmlElement(name = "cve__JournalSections__r", nillable = true)
    protected QueryResultType cve__JournalSections__R;
    @XmlElement(name = "cve__LastViewedTab__c", nillable = true)
    protected String cve__LastViewedTab__C;
    @XmlElement(name = "cve__PhoneNotes__r", nillable = true)
    protected QueryResultType cve__PhoneNotes__R;
    @XmlElement(name = "cve__PredictiveModels__r", nillable = true)
    protected QueryResultType cve__PredictiveModels__R;
    @XmlElement(name = "cve__Rehabilitations__r", nillable = true)
    protected QueryResultType cve__Rehabilitations__R;
    @XmlElement(name = "cve__ReturnToWorks__r", nillable = true)
    protected QueryResultType cve__ReturnToWorks__R;
    @XmlElement(name = "cve__WorkRelated__c", nillable = true)
    protected Boolean cve__WorkRelated__C;

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
     * Gets the value of the cve__Answers__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Answers__R() {
        return cve__Answers__R;
    }

    /**
     * Sets the value of the cve__Answers__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Answers__R(QueryResultType value) {
        this.cve__Answers__R = value;
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
     * Gets the value of the cve__CalculatedAdjustmentsExplanation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CalculatedAdjustmentsExplanation__C() {
        return cve__CalculatedAdjustmentsExplanation__C;
    }

    /**
     * Sets the value of the cve__CalculatedAdjustmentsExplanation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CalculatedAdjustmentsExplanation__C(String value) {
        this.cve__CalculatedAdjustmentsExplanation__C = value;
    }

    /**
     * Gets the value of the cve__CalculatedEarningsPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CalculatedEarningsPeriod__C() {
        return cve__CalculatedEarningsPeriod__C;
    }

    /**
     * Sets the value of the cve__CalculatedEarningsPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CalculatedEarningsPeriod__C(String value) {
        this.cve__CalculatedEarningsPeriod__C = value;
    }

    /**
     * Gets the value of the cve__CalculatedEarnings__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CalculatedEarnings__C() {
        return cve__CalculatedEarnings__C;
    }

    /**
     * Sets the value of the cve__CalculatedEarnings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CalculatedEarnings__C(Double value) {
        this.cve__CalculatedEarnings__C = value;
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
     * Gets the value of the cve__Diagnoses__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Diagnoses__R() {
        return cve__Diagnoses__R;
    }

    /**
     * Sets the value of the cve__Diagnoses__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Diagnoses__R(QueryResultType value) {
        this.cve__Diagnoses__R = value;
    }

    /**
     * Gets the value of the cve__EarningsDefinition__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EarningsDefinition__C() {
        return cve__EarningsDefinition__C;
    }

    /**
     * Sets the value of the cve__EarningsDefinition__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EarningsDefinition__C(String value) {
        this.cve__EarningsDefinition__C = value;
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
     * Gets the value of the cve__EligibilityResult__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EligibilityResult__C() {
        return cve__EligibilityResult__C;
    }

    /**
     * Sets the value of the cve__EligibilityResult__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EligibilityResult__C(String value) {
        this.cve__EligibilityResult__C = value;
    }

    /**
     * Gets the value of the cve__EligibilityStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EligibilityStatus__C() {
        return cve__EligibilityStatus__C;
    }

    /**
     * Sets the value of the cve__EligibilityStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EligibilityStatus__C(String value) {
        this.cve__EligibilityStatus__C = value;
    }

    /**
     * Gets the value of the cve__ExpectedReturnToWork__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__ExpectedReturnToWork__C() {
        return cve__ExpectedReturnToWork__C;
    }

    /**
     * Sets the value of the cve__ExpectedReturnToWork__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__ExpectedReturnToWork__C(XMLGregorianCalendar value) {
        this.cve__ExpectedReturnToWork__C = value;
    }

    /**
     * Gets the value of the cve__FirstHospitalized__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__FirstHospitalized__C() {
        return cve__FirstHospitalized__C;
    }

    /**
     * Sets the value of the cve__FirstHospitalized__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__FirstHospitalized__C(XMLGregorianCalendar value) {
        this.cve__FirstHospitalized__C = value;
    }

    /**
     * Gets the value of the cve__FirstSymptomsAppeared__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__FirstSymptomsAppeared__C() {
        return cve__FirstSymptomsAppeared__C;
    }

    /**
     * Sets the value of the cve__FirstSymptomsAppeared__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__FirstSymptomsAppeared__C(XMLGregorianCalendar value) {
        this.cve__FirstSymptomsAppeared__C = value;
    }

    /**
     * Gets the value of the cve__FirstTreatment__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__FirstTreatment__C() {
        return cve__FirstTreatment__C;
    }

    /**
     * Sets the value of the cve__FirstTreatment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__FirstTreatment__C(XMLGregorianCalendar value) {
        this.cve__FirstTreatment__C = value;
    }

    /**
     * Gets the value of the cve__Investigations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Investigations__R() {
        return cve__Investigations__R;
    }

    /**
     * Sets the value of the cve__Investigations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Investigations__R(QueryResultType value) {
        this.cve__Investigations__R = value;
    }

    /**
     * Gets the value of the cve__JobClassification__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__JobClassification__C() {
        return cve__JobClassification__C;
    }

    /**
     * Sets the value of the cve__JobClassification__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__JobClassification__C(String value) {
        this.cve__JobClassification__C = value;
    }

    /**
     * Gets the value of the cve__JobTitle__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__JobTitle__C() {
        return cve__JobTitle__C;
    }

    /**
     * Sets the value of the cve__JobTitle__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__JobTitle__C(String value) {
        this.cve__JobTitle__C = value;
    }

    /**
     * Gets the value of the cve__JournalSections__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__JournalSections__R() {
        return cve__JournalSections__R;
    }

    /**
     * Sets the value of the cve__JournalSections__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__JournalSections__R(QueryResultType value) {
        this.cve__JournalSections__R = value;
    }

    /**
     * Gets the value of the cve__LastViewedTab__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LastViewedTab__C() {
        return cve__LastViewedTab__C;
    }

    /**
     * Sets the value of the cve__LastViewedTab__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LastViewedTab__C(String value) {
        this.cve__LastViewedTab__C = value;
    }

    /**
     * Gets the value of the cve__PhoneNotes__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PhoneNotes__R() {
        return cve__PhoneNotes__R;
    }

    /**
     * Sets the value of the cve__PhoneNotes__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PhoneNotes__R(QueryResultType value) {
        this.cve__PhoneNotes__R = value;
    }

    /**
     * Gets the value of the cve__PredictiveModels__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PredictiveModels__R() {
        return cve__PredictiveModels__R;
    }

    /**
     * Sets the value of the cve__PredictiveModels__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PredictiveModels__R(QueryResultType value) {
        this.cve__PredictiveModels__R = value;
    }

    /**
     * Gets the value of the cve__Rehabilitations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Rehabilitations__R() {
        return cve__Rehabilitations__R;
    }

    /**
     * Sets the value of the cve__Rehabilitations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Rehabilitations__R(QueryResultType value) {
        this.cve__Rehabilitations__R = value;
    }

    /**
     * Gets the value of the cve__ReturnToWorks__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__ReturnToWorks__R() {
        return cve__ReturnToWorks__R;
    }

    /**
     * Sets the value of the cve__ReturnToWorks__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__ReturnToWorks__R(QueryResultType value) {
        this.cve__ReturnToWorks__R = value;
    }

    /**
     * Gets the value of the cve__WorkRelated__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__WorkRelated__C() {
        return cve__WorkRelated__C;
    }

    /**
     * Sets the value of the cve__WorkRelated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__WorkRelated__C(Boolean value) {
        this.cve__WorkRelated__C = value;
    }

}
