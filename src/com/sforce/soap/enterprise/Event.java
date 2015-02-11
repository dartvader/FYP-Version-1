
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AcceptedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ActivityDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeclinedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurationInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="GroupEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAllDayEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsGroupEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRecurrence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReminderSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RecurrenceActivityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RecurrenceDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceDayOfWeekMask" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceEndDateOnly" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RecurrenceInstance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecurrenceMonthOfYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RecurrenceTimeZoneSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurrenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecurringEvents" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ReminderDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShowAs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UndecidedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="What" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="WhatId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Who" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="WhoId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Closed__c" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cve__OverdueBusinessDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OverdueCalendarDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Required__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "acceptedEventRelations",
    "account",
    "accountId",
    "activityDate",
    "activityDateTime",
    "attachments",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "declinedEventRelations",
    "description",
    "durationInMinutes",
    "endDateTime",
    "eventRelations",
    "groupEventType",
    "isAllDayEvent",
    "isArchived",
    "isChild",
    "isDeleted",
    "isGroupEvent",
    "isPrivate",
    "isRecurrence",
    "isReminderSet",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "location",
    "owner",
    "ownerId",
    "recurrenceActivityId",
    "recurrenceDayOfMonth",
    "recurrenceDayOfWeekMask",
    "recurrenceEndDateOnly",
    "recurrenceInstance",
    "recurrenceInterval",
    "recurrenceMonthOfYear",
    "recurrenceStartDateTime",
    "recurrenceTimeZoneSidKey",
    "recurrenceType",
    "recurringEvents",
    "reminderDateTime",
    "showAs",
    "startDateTime",
    "subject",
    "systemModstamp",
    "topicAssignments",
    "undecidedEventRelations",
    "what",
    "whatId",
    "who",
    "whoId",
    "cve__Closed__C",
    "cve__OverdueBusinessDays__C",
    "cve__OverdueCalendarDays__C",
    "cve__Required__C"
})
public class Event
    extends SObject
{

    @XmlElement(name = "AcceptedEventRelations", nillable = true)
    protected QueryResultType acceptedEventRelations;
    @XmlElement(name = "Account", nillable = true)
    protected Account account;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "ActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityDate;
    @XmlElement(name = "ActivityDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activityDateTime;
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
    @XmlElement(name = "DeclinedEventRelations", nillable = true)
    protected QueryResultType declinedEventRelations;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DurationInMinutes", nillable = true)
    protected Integer durationInMinutes;
    @XmlElement(name = "EndDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "EventRelations", nillable = true)
    protected QueryResultType eventRelations;
    @XmlElement(name = "GroupEventType", nillable = true)
    protected String groupEventType;
    @XmlElement(name = "IsAllDayEvent", nillable = true)
    protected Boolean isAllDayEvent;
    @XmlElement(name = "IsArchived", nillable = true)
    protected Boolean isArchived;
    @XmlElement(name = "IsChild", nillable = true)
    protected Boolean isChild;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsGroupEvent", nillable = true)
    protected Boolean isGroupEvent;
    @XmlElement(name = "IsPrivate", nillable = true)
    protected Boolean isPrivate;
    @XmlElement(name = "IsRecurrence", nillable = true)
    protected Boolean isRecurrence;
    @XmlElement(name = "IsReminderSet", nillable = true)
    protected Boolean isReminderSet;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Location", nillable = true)
    protected String location;
    @XmlElement(name = "Owner", nillable = true)
    protected Name owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "RecurrenceActivityId", nillable = true)
    protected String recurrenceActivityId;
    @XmlElement(name = "RecurrenceDayOfMonth", nillable = true)
    protected Integer recurrenceDayOfMonth;
    @XmlElement(name = "RecurrenceDayOfWeekMask", nillable = true)
    protected Integer recurrenceDayOfWeekMask;
    @XmlElement(name = "RecurrenceEndDateOnly", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurrenceEndDateOnly;
    @XmlElement(name = "RecurrenceInstance", nillable = true)
    protected String recurrenceInstance;
    @XmlElement(name = "RecurrenceInterval", nillable = true)
    protected Integer recurrenceInterval;
    @XmlElement(name = "RecurrenceMonthOfYear", nillable = true)
    protected String recurrenceMonthOfYear;
    @XmlElement(name = "RecurrenceStartDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurrenceStartDateTime;
    @XmlElement(name = "RecurrenceTimeZoneSidKey", nillable = true)
    protected String recurrenceTimeZoneSidKey;
    @XmlElement(name = "RecurrenceType", nillable = true)
    protected String recurrenceType;
    @XmlElement(name = "RecurringEvents", nillable = true)
    protected QueryResultType recurringEvents;
    @XmlElement(name = "ReminderDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminderDateTime;
    @XmlElement(name = "ShowAs", nillable = true)
    protected String showAs;
    @XmlElement(name = "StartDateTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "Subject", nillable = true)
    protected String subject;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UndecidedEventRelations", nillable = true)
    protected QueryResultType undecidedEventRelations;
    @XmlElement(name = "What", nillable = true)
    protected Name what;
    @XmlElement(name = "WhatId", nillable = true)
    protected String whatId;
    @XmlElement(name = "Who", nillable = true)
    protected Name who;
    @XmlElement(name = "WhoId", nillable = true)
    protected String whoId;
    @XmlElement(name = "cve__Closed__c", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cve__Closed__C;
    @XmlElement(name = "cve__OverdueBusinessDays__c", nillable = true)
    protected Double cve__OverdueBusinessDays__C;
    @XmlElement(name = "cve__OverdueCalendarDays__c", nillable = true)
    protected Double cve__OverdueCalendarDays__C;
    @XmlElement(name = "cve__Required__c", nillable = true)
    protected Boolean cve__Required__C;

    /**
     * Gets the value of the acceptedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getAcceptedEventRelations() {
        return acceptedEventRelations;
    }

    /**
     * Sets the value of the acceptedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setAcceptedEventRelations(QueryResultType value) {
        this.acceptedEventRelations = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
    }

    /**
     * Gets the value of the activityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDateTime() {
        return activityDateTime;
    }

    /**
     * Sets the value of the activityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDateTime(XMLGregorianCalendar value) {
        this.activityDateTime = value;
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
     * Gets the value of the declinedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getDeclinedEventRelations() {
        return declinedEventRelations;
    }

    /**
     * Sets the value of the declinedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setDeclinedEventRelations(QueryResultType value) {
        this.declinedEventRelations = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the durationInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     * Sets the value of the durationInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationInMinutes(Integer value) {
        this.durationInMinutes = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the eventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getEventRelations() {
        return eventRelations;
    }

    /**
     * Sets the value of the eventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setEventRelations(QueryResultType value) {
        this.eventRelations = value;
    }

    /**
     * Gets the value of the groupEventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupEventType() {
        return groupEventType;
    }

    /**
     * Sets the value of the groupEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupEventType(String value) {
        this.groupEventType = value;
    }

    /**
     * Gets the value of the isAllDayEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllDayEvent() {
        return isAllDayEvent;
    }

    /**
     * Sets the value of the isAllDayEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllDayEvent(Boolean value) {
        this.isAllDayEvent = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchived(Boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the isChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChild() {
        return isChild;
    }

    /**
     * Sets the value of the isChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChild(Boolean value) {
        this.isChild = value;
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
     * Gets the value of the isGroupEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGroupEvent() {
        return isGroupEvent;
    }

    /**
     * Sets the value of the isGroupEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGroupEvent(Boolean value) {
        this.isGroupEvent = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the isRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurrence() {
        return isRecurrence;
    }

    /**
     * Sets the value of the isRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurrence(Boolean value) {
        this.isRecurrence = value;
    }

    /**
     * Gets the value of the isReminderSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReminderSet() {
        return isReminderSet;
    }

    /**
     * Sets the value of the isReminderSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReminderSet(Boolean value) {
        this.isReminderSet = value;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the recurrenceActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceActivityId() {
        return recurrenceActivityId;
    }

    /**
     * Sets the value of the recurrenceActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceActivityId(String value) {
        this.recurrenceActivityId = value;
    }

    /**
     * Gets the value of the recurrenceDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }

    /**
     * Sets the value of the recurrenceDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceDayOfMonth(Integer value) {
        this.recurrenceDayOfMonth = value;
    }

    /**
     * Gets the value of the recurrenceDayOfWeekMask property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }

    /**
     * Sets the value of the recurrenceDayOfWeekMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceDayOfWeekMask(Integer value) {
        this.recurrenceDayOfWeekMask = value;
    }

    /**
     * Gets the value of the recurrenceEndDateOnly property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceEndDateOnly() {
        return recurrenceEndDateOnly;
    }

    /**
     * Sets the value of the recurrenceEndDateOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceEndDateOnly(XMLGregorianCalendar value) {
        this.recurrenceEndDateOnly = value;
    }

    /**
     * Gets the value of the recurrenceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceInstance() {
        return recurrenceInstance;
    }

    /**
     * Sets the value of the recurrenceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceInstance(String value) {
        this.recurrenceInstance = value;
    }

    /**
     * Gets the value of the recurrenceInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }

    /**
     * Sets the value of the recurrenceInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurrenceInterval(Integer value) {
        this.recurrenceInterval = value;
    }

    /**
     * Gets the value of the recurrenceMonthOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }

    /**
     * Sets the value of the recurrenceMonthOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceMonthOfYear(String value) {
        this.recurrenceMonthOfYear = value;
    }

    /**
     * Gets the value of the recurrenceStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceStartDateTime() {
        return recurrenceStartDateTime;
    }

    /**
     * Sets the value of the recurrenceStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceStartDateTime(XMLGregorianCalendar value) {
        this.recurrenceStartDateTime = value;
    }

    /**
     * Gets the value of the recurrenceTimeZoneSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceTimeZoneSidKey() {
        return recurrenceTimeZoneSidKey;
    }

    /**
     * Sets the value of the recurrenceTimeZoneSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceTimeZoneSidKey(String value) {
        this.recurrenceTimeZoneSidKey = value;
    }

    /**
     * Gets the value of the recurrenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Sets the value of the recurrenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceType(String value) {
        this.recurrenceType = value;
    }

    /**
     * Gets the value of the recurringEvents property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getRecurringEvents() {
        return recurringEvents;
    }

    /**
     * Sets the value of the recurringEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setRecurringEvents(QueryResultType value) {
        this.recurringEvents = value;
    }

    /**
     * Gets the value of the reminderDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminderDateTime() {
        return reminderDateTime;
    }

    /**
     * Sets the value of the reminderDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminderDateTime(XMLGregorianCalendar value) {
        this.reminderDateTime = value;
    }

    /**
     * Gets the value of the showAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAs() {
        return showAs;
    }

    /**
     * Sets the value of the showAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAs(String value) {
        this.showAs = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
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
     * Gets the value of the undecidedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getUndecidedEventRelations() {
        return undecidedEventRelations;
    }

    /**
     * Sets the value of the undecidedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setUndecidedEventRelations(QueryResultType value) {
        this.undecidedEventRelations = value;
    }

    /**
     * Gets the value of the what property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getWhat() {
        return what;
    }

    /**
     * Sets the value of the what property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setWhat(Name value) {
        this.what = value;
    }

    /**
     * Gets the value of the whatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatId() {
        return whatId;
    }

    /**
     * Sets the value of the whatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatId(String value) {
        this.whatId = value;
    }

    /**
     * Gets the value of the who property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getWho() {
        return who;
    }

    /**
     * Sets the value of the who property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setWho(Name value) {
        this.who = value;
    }

    /**
     * Gets the value of the whoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhoId() {
        return whoId;
    }

    /**
     * Sets the value of the whoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhoId(String value) {
        this.whoId = value;
    }

    /**
     * Gets the value of the cve__Closed__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Closed__C() {
        return cve__Closed__C;
    }

    /**
     * Sets the value of the cve__Closed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Closed__C(XMLGregorianCalendar value) {
        this.cve__Closed__C = value;
    }

    /**
     * Gets the value of the cve__OverdueBusinessDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverdueBusinessDays__C() {
        return cve__OverdueBusinessDays__C;
    }

    /**
     * Sets the value of the cve__OverdueBusinessDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverdueBusinessDays__C(Double value) {
        this.cve__OverdueBusinessDays__C = value;
    }

    /**
     * Gets the value of the cve__OverdueCalendarDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OverdueCalendarDays__C() {
        return cve__OverdueCalendarDays__C;
    }

    /**
     * Sets the value of the cve__OverdueCalendarDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OverdueCalendarDays__C(Double value) {
        this.cve__OverdueCalendarDays__C = value;
    }

    /**
     * Gets the value of the cve__Required__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Required__C() {
        return cve__Required__C;
    }

    /**
     * Sets the value of the cve__Required__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Required__C(Boolean value) {
        this.cve__Required__C = value;
    }

}
