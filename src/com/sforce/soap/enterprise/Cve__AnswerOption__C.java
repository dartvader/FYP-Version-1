
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__AnswerOption__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__AnswerOption__c">
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
 *         &lt;element name="cve__ActionCount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Actions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__AnswerType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CheckboxValue__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CurrencyValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DateValue__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__EmailValue__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__NextPage__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__NextPage__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__QuestionPage__c" minOccurs="0"/>
 *         &lt;element name="cve__NumberValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Operator__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PercentageValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PhoneValue__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PicklistValueFr__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PicklistValue__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Question__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Question__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Question__c" minOccurs="0"/>
 *         &lt;element name="cve__Sequence__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TextAreaValue__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TextValue__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ValueAsText__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__AnswerOption__c", propOrder = {
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
    "cve__ActionCount__C",
    "cve__Actions__R",
    "cve__AnswerType__C",
    "cve__CheckboxValue__C",
    "cve__CurrencyValue__C",
    "cve__DateValue__C",
    "cve__EmailValue__C",
    "cve__NextPage__C",
    "cve__NextPage__R",
    "cve__NumberValue__C",
    "cve__Operator__C",
    "cve__PercentageValue__C",
    "cve__PhoneValue__C",
    "cve__PicklistValueFr__C",
    "cve__PicklistValue__C",
    "cve__Question__C",
    "cve__Question__R",
    "cve__Sequence__C",
    "cve__TextAreaValue__C",
    "cve__TextValue__C",
    "cve__ValueAsText__C"
})
public class Cve__AnswerOption__C
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
    @XmlElement(name = "cve__ActionCount__c", nillable = true)
    protected Double cve__ActionCount__C;
    @XmlElement(name = "cve__Actions__r", nillable = true)
    protected QueryResultType cve__Actions__R;
    @XmlElement(name = "cve__AnswerType__c", nillable = true)
    protected String cve__AnswerType__C;
    @XmlElement(name = "cve__CheckboxValue__c", nillable = true)
    protected Boolean cve__CheckboxValue__C;
    @XmlElement(name = "cve__CurrencyValue__c", nillable = true)
    protected Double cve__CurrencyValue__C;
    @XmlElement(name = "cve__DateValue__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateValue__C;
    @XmlElement(name = "cve__EmailValue__c", nillable = true)
    protected String cve__EmailValue__C;
    @XmlElement(name = "cve__NextPage__c", nillable = true)
    protected String cve__NextPage__C;
    @XmlElement(name = "cve__NextPage__r", nillable = true)
    protected Cve__QuestionPage__C cve__NextPage__R;
    @XmlElement(name = "cve__NumberValue__c", nillable = true)
    protected Double cve__NumberValue__C;
    @XmlElement(name = "cve__Operator__c", nillable = true)
    protected String cve__Operator__C;
    @XmlElement(name = "cve__PercentageValue__c", nillable = true)
    protected Double cve__PercentageValue__C;
    @XmlElement(name = "cve__PhoneValue__c", nillable = true)
    protected String cve__PhoneValue__C;
    @XmlElement(name = "cve__PicklistValueFr__c", nillable = true)
    protected String cve__PicklistValueFr__C;
    @XmlElement(name = "cve__PicklistValue__c", nillable = true)
    protected String cve__PicklistValue__C;
    @XmlElement(name = "cve__Question__c", nillable = true)
    protected String cve__Question__C;
    @XmlElement(name = "cve__Question__r", nillable = true)
    protected Cve__Question__C cve__Question__R;
    @XmlElement(name = "cve__Sequence__c", nillable = true)
    protected Double cve__Sequence__C;
    @XmlElement(name = "cve__TextAreaValue__c", nillable = true)
    protected String cve__TextAreaValue__C;
    @XmlElement(name = "cve__TextValue__c", nillable = true)
    protected String cve__TextValue__C;
    @XmlElement(name = "cve__ValueAsText__c", nillable = true)
    protected String cve__ValueAsText__C;

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
     * Gets the value of the cve__AnswerType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnswerType__C() {
        return cve__AnswerType__C;
    }

    /**
     * Sets the value of the cve__AnswerType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnswerType__C(String value) {
        this.cve__AnswerType__C = value;
    }

    /**
     * Gets the value of the cve__CheckboxValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__CheckboxValue__C() {
        return cve__CheckboxValue__C;
    }

    /**
     * Sets the value of the cve__CheckboxValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__CheckboxValue__C(Boolean value) {
        this.cve__CheckboxValue__C = value;
    }

    /**
     * Gets the value of the cve__CurrencyValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CurrencyValue__C() {
        return cve__CurrencyValue__C;
    }

    /**
     * Sets the value of the cve__CurrencyValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CurrencyValue__C(Double value) {
        this.cve__CurrencyValue__C = value;
    }

    /**
     * Gets the value of the cve__DateValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateValue__C() {
        return cve__DateValue__C;
    }

    /**
     * Sets the value of the cve__DateValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateValue__C(XMLGregorianCalendar value) {
        this.cve__DateValue__C = value;
    }

    /**
     * Gets the value of the cve__EmailValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EmailValue__C() {
        return cve__EmailValue__C;
    }

    /**
     * Sets the value of the cve__EmailValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EmailValue__C(String value) {
        this.cve__EmailValue__C = value;
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
     * Gets the value of the cve__NumberValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NumberValue__C() {
        return cve__NumberValue__C;
    }

    /**
     * Sets the value of the cve__NumberValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NumberValue__C(Double value) {
        this.cve__NumberValue__C = value;
    }

    /**
     * Gets the value of the cve__Operator__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Operator__C() {
        return cve__Operator__C;
    }

    /**
     * Sets the value of the cve__Operator__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Operator__C(String value) {
        this.cve__Operator__C = value;
    }

    /**
     * Gets the value of the cve__PercentageValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PercentageValue__C() {
        return cve__PercentageValue__C;
    }

    /**
     * Sets the value of the cve__PercentageValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PercentageValue__C(Double value) {
        this.cve__PercentageValue__C = value;
    }

    /**
     * Gets the value of the cve__PhoneValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PhoneValue__C() {
        return cve__PhoneValue__C;
    }

    /**
     * Sets the value of the cve__PhoneValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PhoneValue__C(String value) {
        this.cve__PhoneValue__C = value;
    }

    /**
     * Gets the value of the cve__PicklistValueFr__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PicklistValueFr__C() {
        return cve__PicklistValueFr__C;
    }

    /**
     * Sets the value of the cve__PicklistValueFr__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PicklistValueFr__C(String value) {
        this.cve__PicklistValueFr__C = value;
    }

    /**
     * Gets the value of the cve__PicklistValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PicklistValue__C() {
        return cve__PicklistValue__C;
    }

    /**
     * Sets the value of the cve__PicklistValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PicklistValue__C(String value) {
        this.cve__PicklistValue__C = value;
    }

    /**
     * Gets the value of the cve__Question__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Question__C() {
        return cve__Question__C;
    }

    /**
     * Sets the value of the cve__Question__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Question__C(String value) {
        this.cve__Question__C = value;
    }

    /**
     * Gets the value of the cve__Question__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Question__C }
     *     
     */
    public Cve__Question__C getCve__Question__R() {
        return cve__Question__R;
    }

    /**
     * Sets the value of the cve__Question__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Question__C }
     *     
     */
    public void setCve__Question__R(Cve__Question__C value) {
        this.cve__Question__R = value;
    }

    /**
     * Gets the value of the cve__Sequence__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Sequence__C() {
        return cve__Sequence__C;
    }

    /**
     * Sets the value of the cve__Sequence__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Sequence__C(Double value) {
        this.cve__Sequence__C = value;
    }

    /**
     * Gets the value of the cve__TextAreaValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TextAreaValue__C() {
        return cve__TextAreaValue__C;
    }

    /**
     * Sets the value of the cve__TextAreaValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TextAreaValue__C(String value) {
        this.cve__TextAreaValue__C = value;
    }

    /**
     * Gets the value of the cve__TextValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TextValue__C() {
        return cve__TextValue__C;
    }

    /**
     * Sets the value of the cve__TextValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TextValue__C(String value) {
        this.cve__TextValue__C = value;
    }

    /**
     * Gets the value of the cve__ValueAsText__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ValueAsText__C() {
        return cve__ValueAsText__C;
    }

    /**
     * Sets the value of the cve__ValueAsText__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ValueAsText__C(String value) {
        this.cve__ValueAsText__C = value;
    }

}
