
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__PlannedTask__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__PlannedTask__c">
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
 *         &lt;element name="cve__Active__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ActualTaskId__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ActualTask__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PlannedDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TaskActivityDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TaskDescription__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskOwnerId__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__TaskOwnerId__r" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="cve__TaskPriority__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskSubject__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskWhatId__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__PlannedTask__c", propOrder = {
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
    "cve__Active__C",
    "cve__ActualTaskId__C",
    "cve__ActualTask__C",
    "cve__PlannedDate__C",
    "cve__TaskActivityDate__C",
    "cve__TaskDescription__C",
    "cve__TaskOwnerId__C",
    "cve__TaskOwnerId__R",
    "cve__TaskPriority__C",
    "cve__TaskStatus__C",
    "cve__TaskSubject__C",
    "cve__TaskType__C",
    "cve__TaskWhatId__C"
})
public class Cve__PlannedTask__C
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
    @XmlElement(name = "cve__Active__c", nillable = true)
    protected Boolean cve__Active__C;
    @XmlElement(name = "cve__ActualTaskId__c", nillable = true)
    protected String cve__ActualTaskId__C;
    @XmlElement(name = "cve__ActualTask__c", nillable = true)
    protected String cve__ActualTask__C;
    @XmlElement(name = "cve__PlannedDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PlannedDate__C;
    @XmlElement(name = "cve__TaskActivityDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__TaskActivityDate__C;
    @XmlElement(name = "cve__TaskDescription__c", nillable = true)
    protected String cve__TaskDescription__C;
    @XmlElement(name = "cve__TaskOwnerId__c", nillable = true)
    protected String cve__TaskOwnerId__C;
    @XmlElement(name = "cve__TaskOwnerId__r", nillable = true)
    protected User cve__TaskOwnerId__R;
    @XmlElement(name = "cve__TaskPriority__c", nillable = true)
    protected String cve__TaskPriority__C;
    @XmlElement(name = "cve__TaskStatus__c", nillable = true)
    protected String cve__TaskStatus__C;
    @XmlElement(name = "cve__TaskSubject__c", nillable = true)
    protected String cve__TaskSubject__C;
    @XmlElement(name = "cve__TaskType__c", nillable = true)
    protected String cve__TaskType__C;
    @XmlElement(name = "cve__TaskWhatId__c", nillable = true)
    protected String cve__TaskWhatId__C;

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
     * Gets the value of the cve__Active__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Active__C() {
        return cve__Active__C;
    }

    /**
     * Sets the value of the cve__Active__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Active__C(Boolean value) {
        this.cve__Active__C = value;
    }

    /**
     * Gets the value of the cve__ActualTaskId__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ActualTaskId__C() {
        return cve__ActualTaskId__C;
    }

    /**
     * Sets the value of the cve__ActualTaskId__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ActualTaskId__C(String value) {
        this.cve__ActualTaskId__C = value;
    }

    /**
     * Gets the value of the cve__ActualTask__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ActualTask__C() {
        return cve__ActualTask__C;
    }

    /**
     * Sets the value of the cve__ActualTask__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ActualTask__C(String value) {
        this.cve__ActualTask__C = value;
    }

    /**
     * Gets the value of the cve__PlannedDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PlannedDate__C() {
        return cve__PlannedDate__C;
    }

    /**
     * Sets the value of the cve__PlannedDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PlannedDate__C(XMLGregorianCalendar value) {
        this.cve__PlannedDate__C = value;
    }

    /**
     * Gets the value of the cve__TaskActivityDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__TaskActivityDate__C() {
        return cve__TaskActivityDate__C;
    }

    /**
     * Sets the value of the cve__TaskActivityDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__TaskActivityDate__C(XMLGregorianCalendar value) {
        this.cve__TaskActivityDate__C = value;
    }

    /**
     * Gets the value of the cve__TaskDescription__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskDescription__C() {
        return cve__TaskDescription__C;
    }

    /**
     * Sets the value of the cve__TaskDescription__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskDescription__C(String value) {
        this.cve__TaskDescription__C = value;
    }

    /**
     * Gets the value of the cve__TaskOwnerId__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskOwnerId__C() {
        return cve__TaskOwnerId__C;
    }

    /**
     * Sets the value of the cve__TaskOwnerId__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskOwnerId__C(String value) {
        this.cve__TaskOwnerId__C = value;
    }

    /**
     * Gets the value of the cve__TaskOwnerId__R property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCve__TaskOwnerId__R() {
        return cve__TaskOwnerId__R;
    }

    /**
     * Sets the value of the cve__TaskOwnerId__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCve__TaskOwnerId__R(User value) {
        this.cve__TaskOwnerId__R = value;
    }

    /**
     * Gets the value of the cve__TaskPriority__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskPriority__C() {
        return cve__TaskPriority__C;
    }

    /**
     * Sets the value of the cve__TaskPriority__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskPriority__C(String value) {
        this.cve__TaskPriority__C = value;
    }

    /**
     * Gets the value of the cve__TaskStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskStatus__C() {
        return cve__TaskStatus__C;
    }

    /**
     * Sets the value of the cve__TaskStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskStatus__C(String value) {
        this.cve__TaskStatus__C = value;
    }

    /**
     * Gets the value of the cve__TaskSubject__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskSubject__C() {
        return cve__TaskSubject__C;
    }

    /**
     * Sets the value of the cve__TaskSubject__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskSubject__C(String value) {
        this.cve__TaskSubject__C = value;
    }

    /**
     * Gets the value of the cve__TaskType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskType__C() {
        return cve__TaskType__C;
    }

    /**
     * Sets the value of the cve__TaskType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskType__C(String value) {
        this.cve__TaskType__C = value;
    }

    /**
     * Gets the value of the cve__TaskWhatId__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskWhatId__C() {
        return cve__TaskWhatId__C;
    }

    /**
     * Sets the value of the cve__TaskWhatId__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskWhatId__C(String value) {
        this.cve__TaskWhatId__C = value;
    }

}
