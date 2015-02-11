
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__ContactHistory__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__ContactHistory__c">
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
 *         &lt;element name="cve__BankAccountNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankAccountType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankPhone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankRoutingNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Birthdate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__BonusPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Bonus__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Contact__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Contact__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="cve__DateOfHire__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Earnings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Effective__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__FirstName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__FullName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HoursWorkedPerWeek__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LastApplied__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__LastModifiedAfterLastApplied__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LastModified__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__LastName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingCity__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingCountry__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingPostalCode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingState__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingStreet__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentMethod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Salutation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SocialSecurityNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaxIdNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Title__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__ContactHistory__c", propOrder = {
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
    "cve__BankAccountNumber__C",
    "cve__BankAccountType__C",
    "cve__BankName__C",
    "cve__BankPhone__C",
    "cve__BankRoutingNumber__C",
    "cve__Birthdate__C",
    "cve__BonusPeriod__C",
    "cve__Bonus__C",
    "cve__Contact__C",
    "cve__Contact__R",
    "cve__DateOfHire__C",
    "cve__EarningsPeriod__C",
    "cve__Earnings__C",
    "cve__Effective__C",
    "cve__FirstName__C",
    "cve__FullName__C",
    "cve__HoursWorkedPerWeek__C",
    "cve__LastApplied__C",
    "cve__LastModifiedAfterLastApplied__C",
    "cve__LastModified__C",
    "cve__LastName__C",
    "cve__MailingCity__C",
    "cve__MailingCountry__C",
    "cve__MailingPostalCode__C",
    "cve__MailingState__C",
    "cve__MailingStreet__C",
    "cve__PaymentMethod__C",
    "cve__Salutation__C",
    "cve__SocialSecurityNumber__C",
    "cve__TaxIdNumber__C",
    "cve__Title__C"
})
public class Cve__ContactHistory__C
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
    @XmlElement(name = "cve__BankAccountNumber__c", nillable = true)
    protected String cve__BankAccountNumber__C;
    @XmlElement(name = "cve__BankAccountType__c", nillable = true)
    protected String cve__BankAccountType__C;
    @XmlElement(name = "cve__BankName__c", nillable = true)
    protected String cve__BankName__C;
    @XmlElement(name = "cve__BankPhone__c", nillable = true)
    protected String cve__BankPhone__C;
    @XmlElement(name = "cve__BankRoutingNumber__c", nillable = true)
    protected String cve__BankRoutingNumber__C;
    @XmlElement(name = "cve__Birthdate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Birthdate__C;
    @XmlElement(name = "cve__BonusPeriod__c", nillable = true)
    protected String cve__BonusPeriod__C;
    @XmlElement(name = "cve__Bonus__c", nillable = true)
    protected Double cve__Bonus__C;
    @XmlElement(name = "cve__Contact__c", nillable = true)
    protected String cve__Contact__C;
    @XmlElement(name = "cve__Contact__r", nillable = true)
    protected Contact cve__Contact__R;
    @XmlElement(name = "cve__DateOfHire__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfHire__C;
    @XmlElement(name = "cve__EarningsPeriod__c", nillable = true)
    protected String cve__EarningsPeriod__C;
    @XmlElement(name = "cve__Earnings__c", nillable = true)
    protected Double cve__Earnings__C;
    @XmlElement(name = "cve__Effective__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Effective__C;
    @XmlElement(name = "cve__FirstName__c", nillable = true)
    protected String cve__FirstName__C;
    @XmlElement(name = "cve__FullName__c", nillable = true)
    protected String cve__FullName__C;
    @XmlElement(name = "cve__HoursWorkedPerWeek__c", nillable = true)
    protected Double cve__HoursWorkedPerWeek__C;
    @XmlElement(name = "cve__LastApplied__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__LastApplied__C;
    @XmlElement(name = "cve__LastModifiedAfterLastApplied__c", nillable = true)
    protected Double cve__LastModifiedAfterLastApplied__C;
    @XmlElement(name = "cve__LastModified__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__LastModified__C;
    @XmlElement(name = "cve__LastName__c", nillable = true)
    protected String cve__LastName__C;
    @XmlElement(name = "cve__MailingCity__c", nillable = true)
    protected String cve__MailingCity__C;
    @XmlElement(name = "cve__MailingCountry__c", nillable = true)
    protected String cve__MailingCountry__C;
    @XmlElement(name = "cve__MailingPostalCode__c", nillable = true)
    protected String cve__MailingPostalCode__C;
    @XmlElement(name = "cve__MailingState__c", nillable = true)
    protected String cve__MailingState__C;
    @XmlElement(name = "cve__MailingStreet__c", nillable = true)
    protected String cve__MailingStreet__C;
    @XmlElement(name = "cve__PaymentMethod__c", nillable = true)
    protected String cve__PaymentMethod__C;
    @XmlElement(name = "cve__Salutation__c", nillable = true)
    protected String cve__Salutation__C;
    @XmlElement(name = "cve__SocialSecurityNumber__c", nillable = true)
    protected String cve__SocialSecurityNumber__C;
    @XmlElement(name = "cve__TaxIdNumber__c", nillable = true)
    protected String cve__TaxIdNumber__C;
    @XmlElement(name = "cve__Title__c", nillable = true)
    protected String cve__Title__C;

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
     * Gets the value of the cve__BankAccountNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankAccountNumber__C() {
        return cve__BankAccountNumber__C;
    }

    /**
     * Sets the value of the cve__BankAccountNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankAccountNumber__C(String value) {
        this.cve__BankAccountNumber__C = value;
    }

    /**
     * Gets the value of the cve__BankAccountType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankAccountType__C() {
        return cve__BankAccountType__C;
    }

    /**
     * Sets the value of the cve__BankAccountType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankAccountType__C(String value) {
        this.cve__BankAccountType__C = value;
    }

    /**
     * Gets the value of the cve__BankName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankName__C() {
        return cve__BankName__C;
    }

    /**
     * Sets the value of the cve__BankName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankName__C(String value) {
        this.cve__BankName__C = value;
    }

    /**
     * Gets the value of the cve__BankPhone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankPhone__C() {
        return cve__BankPhone__C;
    }

    /**
     * Sets the value of the cve__BankPhone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankPhone__C(String value) {
        this.cve__BankPhone__C = value;
    }

    /**
     * Gets the value of the cve__BankRoutingNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankRoutingNumber__C() {
        return cve__BankRoutingNumber__C;
    }

    /**
     * Sets the value of the cve__BankRoutingNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankRoutingNumber__C(String value) {
        this.cve__BankRoutingNumber__C = value;
    }

    /**
     * Gets the value of the cve__Birthdate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Birthdate__C() {
        return cve__Birthdate__C;
    }

    /**
     * Sets the value of the cve__Birthdate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Birthdate__C(XMLGregorianCalendar value) {
        this.cve__Birthdate__C = value;
    }

    /**
     * Gets the value of the cve__BonusPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BonusPeriod__C() {
        return cve__BonusPeriod__C;
    }

    /**
     * Sets the value of the cve__BonusPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BonusPeriod__C(String value) {
        this.cve__BonusPeriod__C = value;
    }

    /**
     * Gets the value of the cve__Bonus__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Bonus__C() {
        return cve__Bonus__C;
    }

    /**
     * Sets the value of the cve__Bonus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Bonus__C(Double value) {
        this.cve__Bonus__C = value;
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
     * Gets the value of the cve__DateOfHire__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfHire__C() {
        return cve__DateOfHire__C;
    }

    /**
     * Sets the value of the cve__DateOfHire__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfHire__C(XMLGregorianCalendar value) {
        this.cve__DateOfHire__C = value;
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
     * Gets the value of the cve__FirstName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__FirstName__C() {
        return cve__FirstName__C;
    }

    /**
     * Sets the value of the cve__FirstName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__FirstName__C(String value) {
        this.cve__FirstName__C = value;
    }

    /**
     * Gets the value of the cve__FullName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__FullName__C() {
        return cve__FullName__C;
    }

    /**
     * Sets the value of the cve__FullName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__FullName__C(String value) {
        this.cve__FullName__C = value;
    }

    /**
     * Gets the value of the cve__HoursWorkedPerWeek__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HoursWorkedPerWeek__C() {
        return cve__HoursWorkedPerWeek__C;
    }

    /**
     * Sets the value of the cve__HoursWorkedPerWeek__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HoursWorkedPerWeek__C(Double value) {
        this.cve__HoursWorkedPerWeek__C = value;
    }

    /**
     * Gets the value of the cve__LastApplied__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LastApplied__C() {
        return cve__LastApplied__C;
    }

    /**
     * Sets the value of the cve__LastApplied__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LastApplied__C(XMLGregorianCalendar value) {
        this.cve__LastApplied__C = value;
    }

    /**
     * Gets the value of the cve__LastModifiedAfterLastApplied__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LastModifiedAfterLastApplied__C() {
        return cve__LastModifiedAfterLastApplied__C;
    }

    /**
     * Sets the value of the cve__LastModifiedAfterLastApplied__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LastModifiedAfterLastApplied__C(Double value) {
        this.cve__LastModifiedAfterLastApplied__C = value;
    }

    /**
     * Gets the value of the cve__LastModified__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__LastModified__C() {
        return cve__LastModified__C;
    }

    /**
     * Sets the value of the cve__LastModified__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__LastModified__C(XMLGregorianCalendar value) {
        this.cve__LastModified__C = value;
    }

    /**
     * Gets the value of the cve__LastName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LastName__C() {
        return cve__LastName__C;
    }

    /**
     * Sets the value of the cve__LastName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LastName__C(String value) {
        this.cve__LastName__C = value;
    }

    /**
     * Gets the value of the cve__MailingCity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingCity__C() {
        return cve__MailingCity__C;
    }

    /**
     * Sets the value of the cve__MailingCity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingCity__C(String value) {
        this.cve__MailingCity__C = value;
    }

    /**
     * Gets the value of the cve__MailingCountry__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingCountry__C() {
        return cve__MailingCountry__C;
    }

    /**
     * Sets the value of the cve__MailingCountry__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingCountry__C(String value) {
        this.cve__MailingCountry__C = value;
    }

    /**
     * Gets the value of the cve__MailingPostalCode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingPostalCode__C() {
        return cve__MailingPostalCode__C;
    }

    /**
     * Sets the value of the cve__MailingPostalCode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingPostalCode__C(String value) {
        this.cve__MailingPostalCode__C = value;
    }

    /**
     * Gets the value of the cve__MailingState__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingState__C() {
        return cve__MailingState__C;
    }

    /**
     * Sets the value of the cve__MailingState__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingState__C(String value) {
        this.cve__MailingState__C = value;
    }

    /**
     * Gets the value of the cve__MailingStreet__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingStreet__C() {
        return cve__MailingStreet__C;
    }

    /**
     * Sets the value of the cve__MailingStreet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingStreet__C(String value) {
        this.cve__MailingStreet__C = value;
    }

    /**
     * Gets the value of the cve__PaymentMethod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentMethod__C() {
        return cve__PaymentMethod__C;
    }

    /**
     * Sets the value of the cve__PaymentMethod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentMethod__C(String value) {
        this.cve__PaymentMethod__C = value;
    }

    /**
     * Gets the value of the cve__Salutation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Salutation__C() {
        return cve__Salutation__C;
    }

    /**
     * Sets the value of the cve__Salutation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Salutation__C(String value) {
        this.cve__Salutation__C = value;
    }

    /**
     * Gets the value of the cve__SocialSecurityNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SocialSecurityNumber__C() {
        return cve__SocialSecurityNumber__C;
    }

    /**
     * Sets the value of the cve__SocialSecurityNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SocialSecurityNumber__C(String value) {
        this.cve__SocialSecurityNumber__C = value;
    }

    /**
     * Gets the value of the cve__TaxIdNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaxIdNumber__C() {
        return cve__TaxIdNumber__C;
    }

    /**
     * Sets the value of the cve__TaxIdNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaxIdNumber__C(String value) {
        this.cve__TaxIdNumber__C = value;
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

}
