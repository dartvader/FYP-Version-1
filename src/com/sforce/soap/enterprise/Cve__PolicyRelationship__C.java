
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__PolicyRelationship__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__PolicyRelationship__c">
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
 *         &lt;element name="cve__AccountWithAccountLabel__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__AccountWithAccountLabel__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__CertificateNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Claims__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ContactAccount__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ContactAccount__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__ContactWithContactLabel__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__ContactWithContactLabel__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="cve__Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="cve__PolicyEffective__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PolicyExpiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__PolicyGroupName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyVersion__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Policy__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Policy__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Policy__c" minOccurs="0"/>
 *         &lt;element name="cve__Start__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "cve__PolicyRelationship__c", propOrder = {
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
    "cve__AccountWithAccountLabel__C",
    "cve__AccountWithAccountLabel__R",
    "cve__Account__C",
    "cve__Account__R",
    "cve__CertificateNumber__C",
    "cve__Claims__R",
    "cve__ContactAccount__C",
    "cve__ContactAccount__R",
    "cve__ContactWithContactLabel__C",
    "cve__ContactWithContactLabel__R",
    "cve__Contact__C",
    "cve__Contact__R",
    "cve__PolicyEffective__C",
    "cve__PolicyExpiration__C",
    "cve__PolicyGroupName__C",
    "cve__PolicyStatus__C",
    "cve__PolicyVersion__C",
    "cve__Policy__C",
    "cve__Policy__R",
    "cve__Start__C",
    "cve__Through__C",
    "cve__Type__C"
})
public class Cve__PolicyRelationship__C
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
    @XmlElement(name = "cve__AccountWithAccountLabel__c", nillable = true)
    protected String cve__AccountWithAccountLabel__C;
    @XmlElement(name = "cve__AccountWithAccountLabel__r", nillable = true)
    protected Account cve__AccountWithAccountLabel__R;
    @XmlElement(name = "cve__Account__c", nillable = true)
    protected String cve__Account__C;
    @XmlElement(name = "cve__Account__r", nillable = true)
    protected Account cve__Account__R;
    @XmlElement(name = "cve__CertificateNumber__c", nillable = true)
    protected String cve__CertificateNumber__C;
    @XmlElement(name = "cve__Claims__r", nillable = true)
    protected QueryResultType cve__Claims__R;
    @XmlElement(name = "cve__ContactAccount__c", nillable = true)
    protected String cve__ContactAccount__C;
    @XmlElement(name = "cve__ContactAccount__r", nillable = true)
    protected Account cve__ContactAccount__R;
    @XmlElement(name = "cve__ContactWithContactLabel__c", nillable = true)
    protected String cve__ContactWithContactLabel__C;
    @XmlElement(name = "cve__ContactWithContactLabel__r", nillable = true)
    protected Contact cve__ContactWithContactLabel__R;
    @XmlElement(name = "cve__Contact__c", nillable = true)
    protected String cve__Contact__C;
    @XmlElement(name = "cve__Contact__r", nillable = true)
    protected Contact cve__Contact__R;
    @XmlElement(name = "cve__PolicyEffective__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PolicyEffective__C;
    @XmlElement(name = "cve__PolicyExpiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__PolicyExpiration__C;
    @XmlElement(name = "cve__PolicyGroupName__c", nillable = true)
    protected String cve__PolicyGroupName__C;
    @XmlElement(name = "cve__PolicyStatus__c", nillable = true)
    protected String cve__PolicyStatus__C;
    @XmlElement(name = "cve__PolicyVersion__c", nillable = true)
    protected String cve__PolicyVersion__C;
    @XmlElement(name = "cve__Policy__c", nillable = true)
    protected String cve__Policy__C;
    @XmlElement(name = "cve__Policy__r", nillable = true)
    protected Cve__Policy__C cve__Policy__R;
    @XmlElement(name = "cve__Start__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Start__C;
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
     * Gets the value of the cve__AccountWithAccountLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AccountWithAccountLabel__C() {
        return cve__AccountWithAccountLabel__C;
    }

    /**
     * Sets the value of the cve__AccountWithAccountLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AccountWithAccountLabel__C(String value) {
        this.cve__AccountWithAccountLabel__C = value;
    }

    /**
     * Gets the value of the cve__AccountWithAccountLabel__R property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCve__AccountWithAccountLabel__R() {
        return cve__AccountWithAccountLabel__R;
    }

    /**
     * Sets the value of the cve__AccountWithAccountLabel__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCve__AccountWithAccountLabel__R(Account value) {
        this.cve__AccountWithAccountLabel__R = value;
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
     * Gets the value of the cve__CertificateNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CertificateNumber__C() {
        return cve__CertificateNumber__C;
    }

    /**
     * Sets the value of the cve__CertificateNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CertificateNumber__C(String value) {
        this.cve__CertificateNumber__C = value;
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
     * Gets the value of the cve__ContactAccount__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ContactAccount__C() {
        return cve__ContactAccount__C;
    }

    /**
     * Sets the value of the cve__ContactAccount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ContactAccount__C(String value) {
        this.cve__ContactAccount__C = value;
    }

    /**
     * Gets the value of the cve__ContactAccount__R property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCve__ContactAccount__R() {
        return cve__ContactAccount__R;
    }

    /**
     * Sets the value of the cve__ContactAccount__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCve__ContactAccount__R(Account value) {
        this.cve__ContactAccount__R = value;
    }

    /**
     * Gets the value of the cve__ContactWithContactLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ContactWithContactLabel__C() {
        return cve__ContactWithContactLabel__C;
    }

    /**
     * Sets the value of the cve__ContactWithContactLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ContactWithContactLabel__C(String value) {
        this.cve__ContactWithContactLabel__C = value;
    }

    /**
     * Gets the value of the cve__ContactWithContactLabel__R property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getCve__ContactWithContactLabel__R() {
        return cve__ContactWithContactLabel__R;
    }

    /**
     * Sets the value of the cve__ContactWithContactLabel__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setCve__ContactWithContactLabel__R(Contact value) {
        this.cve__ContactWithContactLabel__R = value;
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
     * Gets the value of the cve__PolicyEffective__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PolicyEffective__C() {
        return cve__PolicyEffective__C;
    }

    /**
     * Sets the value of the cve__PolicyEffective__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PolicyEffective__C(XMLGregorianCalendar value) {
        this.cve__PolicyEffective__C = value;
    }

    /**
     * Gets the value of the cve__PolicyExpiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__PolicyExpiration__C() {
        return cve__PolicyExpiration__C;
    }

    /**
     * Sets the value of the cve__PolicyExpiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__PolicyExpiration__C(XMLGregorianCalendar value) {
        this.cve__PolicyExpiration__C = value;
    }

    /**
     * Gets the value of the cve__PolicyGroupName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyGroupName__C() {
        return cve__PolicyGroupName__C;
    }

    /**
     * Sets the value of the cve__PolicyGroupName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyGroupName__C(String value) {
        this.cve__PolicyGroupName__C = value;
    }

    /**
     * Gets the value of the cve__PolicyStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyStatus__C() {
        return cve__PolicyStatus__C;
    }

    /**
     * Sets the value of the cve__PolicyStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyStatus__C(String value) {
        this.cve__PolicyStatus__C = value;
    }

    /**
     * Gets the value of the cve__PolicyVersion__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyVersion__C() {
        return cve__PolicyVersion__C;
    }

    /**
     * Sets the value of the cve__PolicyVersion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyVersion__C(String value) {
        this.cve__PolicyVersion__C = value;
    }

    /**
     * Gets the value of the cve__Policy__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Policy__C() {
        return cve__Policy__C;
    }

    /**
     * Sets the value of the cve__Policy__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Policy__C(String value) {
        this.cve__Policy__C = value;
    }

    /**
     * Gets the value of the cve__Policy__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Policy__C }
     *     
     */
    public Cve__Policy__C getCve__Policy__R() {
        return cve__Policy__R;
    }

    /**
     * Sets the value of the cve__Policy__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Policy__C }
     *     
     */
    public void setCve__Policy__R(Cve__Policy__C value) {
        this.cve__Policy__R = value;
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
