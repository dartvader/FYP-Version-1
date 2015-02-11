
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__Adjustment__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__Adjustment__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
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
 *         &lt;element name="cve__Amount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AppliedAdjustments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__AutomatedSource__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Automated__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecification__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecification__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSpecification__c" minOccurs="0"/>
 *         &lt;element name="cve__Percentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Period__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RecordTypeName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cve__Adjustment__c", propOrder = {
    "attachments",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "histories",
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
    "cve__Amount__C",
    "cve__AppliedAdjustments__R",
    "cve__AutomatedSource__C",
    "cve__Automated__C",
    "cve__PaymentSpecification__C",
    "cve__PaymentSpecification__R",
    "cve__Percentage__C",
    "cve__Period__C",
    "cve__RecordTypeName__C",
    "cve__Start__C",
    "cve__Status__C",
    "cve__Through__C",
    "cve__Type__C"
})
public class Cve__Adjustment__C
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
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResultType histories;
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
    @XmlElement(name = "cve__Amount__c", nillable = true)
    protected Double cve__Amount__C;
    @XmlElement(name = "cve__AppliedAdjustments__r", nillable = true)
    protected QueryResultType cve__AppliedAdjustments__R;
    @XmlElement(name = "cve__AutomatedSource__c", nillable = true)
    protected String cve__AutomatedSource__C;
    @XmlElement(name = "cve__Automated__c", nillable = true)
    protected Boolean cve__Automated__C;
    @XmlElement(name = "cve__PaymentSpecification__c", nillable = true)
    protected String cve__PaymentSpecification__C;
    @XmlElement(name = "cve__PaymentSpecification__r", nillable = true)
    protected Cve__PaymentSpecification__C cve__PaymentSpecification__R;
    @XmlElement(name = "cve__Percentage__c", nillable = true)
    protected Double cve__Percentage__C;
    @XmlElement(name = "cve__Period__c", nillable = true)
    protected String cve__Period__C;
    @XmlElement(name = "cve__RecordTypeName__c", nillable = true)
    protected String cve__RecordTypeName__C;
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
     * Gets the value of the cve__AutomatedSource__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AutomatedSource__C() {
        return cve__AutomatedSource__C;
    }

    /**
     * Sets the value of the cve__AutomatedSource__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AutomatedSource__C(String value) {
        this.cve__AutomatedSource__C = value;
    }

    /**
     * Gets the value of the cve__Automated__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Automated__C() {
        return cve__Automated__C;
    }

    /**
     * Sets the value of the cve__Automated__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Automated__C(Boolean value) {
        this.cve__Automated__C = value;
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
     * Gets the value of the cve__Percentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Percentage__C() {
        return cve__Percentage__C;
    }

    /**
     * Sets the value of the cve__Percentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Percentage__C(Double value) {
        this.cve__Percentage__C = value;
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
