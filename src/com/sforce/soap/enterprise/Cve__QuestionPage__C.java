
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__QuestionPage__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__QuestionPage__c">
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
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__ActionCount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Actions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__AnswerColumnOneHeadingFr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AnswerColumnOneHeading__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AnswerColumnOneType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AnswerColumnTwoHeadingFr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AnswerColumnTwoHeading__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AnswerColumnTwoType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitQuestionPages__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__NextPage__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__NextPage__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__QuestionPage__c" minOccurs="0"/>
 *         &lt;element name="cve__Options__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PreviousQuestionPages__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__QuestionAlignment__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__QuestionCount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__QuestionPageActionCount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__QuestionPageParameterActions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Questions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__TitleFr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Title__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TotalActionCount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__QuestionPage__c", propOrder = {
    "attachments",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastReferencedDate",
    "lastViewedDate",
    "lookedUpFromActivities",
    "name",
    "notes",
    "notesAndAttachments",
    "owner",
    "ownerId",
    "processInstances",
    "processSteps",
    "systemModstamp",
    "topicAssignments",
    "userRecordAccess",
    "cve__ActionCount__C",
    "cve__Actions__R",
    "cve__AnswerColumnOneHeadingFr__C",
    "cve__AnswerColumnOneHeading__C",
    "cve__AnswerColumnOneType__C",
    "cve__AnswerColumnTwoHeadingFr__C",
    "cve__AnswerColumnTwoHeading__C",
    "cve__AnswerColumnTwoType__C",
    "cve__BenefitQuestionPages__R",
    "cve__NextPage__C",
    "cve__NextPage__R",
    "cve__Options__R",
    "cve__PreviousQuestionPages__R",
    "cve__QuestionAlignment__C",
    "cve__QuestionCount__C",
    "cve__QuestionPageActionCount__C",
    "cve__QuestionPageParameterActions__R",
    "cve__Questions__R",
    "cve__TitleFr__C",
    "cve__Title__C",
    "cve__TotalActionCount__C"
})
public class Cve__QuestionPage__C
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
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__ActionCount__c", nillable = true)
    protected Double cve__ActionCount__C;
    @XmlElement(name = "cve__Actions__r", nillable = true)
    protected QueryResultType cve__Actions__R;
    @XmlElement(name = "cve__AnswerColumnOneHeadingFr__c", nillable = true)
    protected String cve__AnswerColumnOneHeadingFr__C;
    @XmlElement(name = "cve__AnswerColumnOneHeading__c", nillable = true)
    protected String cve__AnswerColumnOneHeading__C;
    @XmlElement(name = "cve__AnswerColumnOneType__c", nillable = true)
    protected String cve__AnswerColumnOneType__C;
    @XmlElement(name = "cve__AnswerColumnTwoHeadingFr__c", nillable = true)
    protected String cve__AnswerColumnTwoHeadingFr__C;
    @XmlElement(name = "cve__AnswerColumnTwoHeading__c", nillable = true)
    protected String cve__AnswerColumnTwoHeading__C;
    @XmlElement(name = "cve__AnswerColumnTwoType__c", nillable = true)
    protected String cve__AnswerColumnTwoType__C;
    @XmlElement(name = "cve__BenefitQuestionPages__r", nillable = true)
    protected QueryResultType cve__BenefitQuestionPages__R;
    @XmlElement(name = "cve__NextPage__c", nillable = true)
    protected String cve__NextPage__C;
    @XmlElement(name = "cve__NextPage__r", nillable = true)
    protected Cve__QuestionPage__C cve__NextPage__R;
    @XmlElement(name = "cve__Options__r", nillable = true)
    protected QueryResultType cve__Options__R;
    @XmlElement(name = "cve__PreviousQuestionPages__r", nillable = true)
    protected QueryResultType cve__PreviousQuestionPages__R;
    @XmlElement(name = "cve__QuestionAlignment__c", nillable = true)
    protected String cve__QuestionAlignment__C;
    @XmlElement(name = "cve__QuestionCount__c", nillable = true)
    protected Double cve__QuestionCount__C;
    @XmlElement(name = "cve__QuestionPageActionCount__c", nillable = true)
    protected Double cve__QuestionPageActionCount__C;
    @XmlElement(name = "cve__QuestionPageParameterActions__r", nillable = true)
    protected QueryResultType cve__QuestionPageParameterActions__R;
    @XmlElement(name = "cve__Questions__r", nillable = true)
    protected QueryResultType cve__Questions__R;
    @XmlElement(name = "cve__TitleFr__c", nillable = true)
    protected String cve__TitleFr__C;
    @XmlElement(name = "cve__Title__c", nillable = true)
    protected String cve__Title__C;
    @XmlElement(name = "cve__TotalActionCount__c", nillable = true)
    protected Double cve__TotalActionCount__C;

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
     * Gets the value of the cve__ActionCount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ActionCount__C() {
        return cve__ActionCount__C;
    }

    /**
     * Sets the value of the cve__ActionCount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ActionCount__C(Double value) {
        this.cve__ActionCount__C = value;
    }

    /**
     * Gets the value of the cve__Actions__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Actions__R() {
        return cve__Actions__R;
    }

    /**
     * Sets the value of the cve__Actions__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Actions__R(QueryResultType value) {
        this.cve__Actions__R = value;
    }

    /**
     * Gets the value of the cve__AnswerColumnOneHeadingFr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnswerColumnOneHeadingFr__C() {
        return cve__AnswerColumnOneHeadingFr__C;
    }

    /**
     * Sets the value of the cve__AnswerColumnOneHeadingFr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnswerColumnOneHeadingFr__C(String value) {
        this.cve__AnswerColumnOneHeadingFr__C = value;
    }

    /**
     * Gets the value of the cve__AnswerColumnOneHeading__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnswerColumnOneHeading__C() {
        return cve__AnswerColumnOneHeading__C;
    }

    /**
     * Sets the value of the cve__AnswerColumnOneHeading__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnswerColumnOneHeading__C(String value) {
        this.cve__AnswerColumnOneHeading__C = value;
    }

    /**
     * Gets the value of the cve__AnswerColumnOneType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnswerColumnOneType__C() {
        return cve__AnswerColumnOneType__C;
    }

    /**
     * Sets the value of the cve__AnswerColumnOneType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnswerColumnOneType__C(String value) {
        this.cve__AnswerColumnOneType__C = value;
    }

    /**
     * Gets the value of the cve__AnswerColumnTwoHeadingFr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnswerColumnTwoHeadingFr__C() {
        return cve__AnswerColumnTwoHeadingFr__C;
    }

    /**
     * Sets the value of the cve__AnswerColumnTwoHeadingFr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnswerColumnTwoHeadingFr__C(String value) {
        this.cve__AnswerColumnTwoHeadingFr__C = value;
    }

    /**
     * Gets the value of the cve__AnswerColumnTwoHeading__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnswerColumnTwoHeading__C() {
        return cve__AnswerColumnTwoHeading__C;
    }

    /**
     * Sets the value of the cve__AnswerColumnTwoHeading__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnswerColumnTwoHeading__C(String value) {
        this.cve__AnswerColumnTwoHeading__C = value;
    }

    /**
     * Gets the value of the cve__AnswerColumnTwoType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnswerColumnTwoType__C() {
        return cve__AnswerColumnTwoType__C;
    }

    /**
     * Sets the value of the cve__AnswerColumnTwoType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnswerColumnTwoType__C(String value) {
        this.cve__AnswerColumnTwoType__C = value;
    }

    /**
     * Gets the value of the cve__BenefitQuestionPages__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__BenefitQuestionPages__R() {
        return cve__BenefitQuestionPages__R;
    }

    /**
     * Sets the value of the cve__BenefitQuestionPages__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__BenefitQuestionPages__R(QueryResultType value) {
        this.cve__BenefitQuestionPages__R = value;
    }

    /**
     * Gets the value of the cve__NextPage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__NextPage__C() {
        return cve__NextPage__C;
    }

    /**
     * Sets the value of the cve__NextPage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__NextPage__C(String value) {
        this.cve__NextPage__C = value;
    }

    /**
     * Gets the value of the cve__NextPage__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__QuestionPage__C }
     *     
     */
    public Cve__QuestionPage__C getCve__NextPage__R() {
        return cve__NextPage__R;
    }

    /**
     * Sets the value of the cve__NextPage__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__QuestionPage__C }
     *     
     */
    public void setCve__NextPage__R(Cve__QuestionPage__C value) {
        this.cve__NextPage__R = value;
    }

    /**
     * Gets the value of the cve__Options__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Options__R() {
        return cve__Options__R;
    }

    /**
     * Sets the value of the cve__Options__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Options__R(QueryResultType value) {
        this.cve__Options__R = value;
    }

    /**
     * Gets the value of the cve__PreviousQuestionPages__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PreviousQuestionPages__R() {
        return cve__PreviousQuestionPages__R;
    }

    /**
     * Sets the value of the cve__PreviousQuestionPages__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PreviousQuestionPages__R(QueryResultType value) {
        this.cve__PreviousQuestionPages__R = value;
    }

    /**
     * Gets the value of the cve__QuestionAlignment__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__QuestionAlignment__C() {
        return cve__QuestionAlignment__C;
    }

    /**
     * Sets the value of the cve__QuestionAlignment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__QuestionAlignment__C(String value) {
        this.cve__QuestionAlignment__C = value;
    }

    /**
     * Gets the value of the cve__QuestionCount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__QuestionCount__C() {
        return cve__QuestionCount__C;
    }

    /**
     * Sets the value of the cve__QuestionCount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__QuestionCount__C(Double value) {
        this.cve__QuestionCount__C = value;
    }

    /**
     * Gets the value of the cve__QuestionPageActionCount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__QuestionPageActionCount__C() {
        return cve__QuestionPageActionCount__C;
    }

    /**
     * Sets the value of the cve__QuestionPageActionCount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__QuestionPageActionCount__C(Double value) {
        this.cve__QuestionPageActionCount__C = value;
    }

    /**
     * Gets the value of the cve__QuestionPageParameterActions__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__QuestionPageParameterActions__R() {
        return cve__QuestionPageParameterActions__R;
    }

    /**
     * Sets the value of the cve__QuestionPageParameterActions__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__QuestionPageParameterActions__R(QueryResultType value) {
        this.cve__QuestionPageParameterActions__R = value;
    }

    /**
     * Gets the value of the cve__Questions__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Questions__R() {
        return cve__Questions__R;
    }

    /**
     * Sets the value of the cve__Questions__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Questions__R(QueryResultType value) {
        this.cve__Questions__R = value;
    }

    /**
     * Gets the value of the cve__TitleFr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TitleFr__C() {
        return cve__TitleFr__C;
    }

    /**
     * Sets the value of the cve__TitleFr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TitleFr__C(String value) {
        this.cve__TitleFr__C = value;
    }

    /**
     * Gets the value of the cve__Title__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Title__C() {
        return cve__Title__C;
    }

    /**
     * Sets the value of the cve__Title__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Title__C(String value) {
        this.cve__Title__C = value;
    }

    /**
     * Gets the value of the cve__TotalActionCount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TotalActionCount__C() {
        return cve__TotalActionCount__C;
    }

    /**
     * Sets the value of the cve__TotalActionCount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TotalActionCount__C(Double value) {
        this.cve__TotalActionCount__C = value;
    }

}
