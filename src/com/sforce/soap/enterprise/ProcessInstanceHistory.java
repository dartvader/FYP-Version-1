
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProcessInstanceHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessInstanceHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Actor" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="ActorId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ElapsedTimeInDays" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ElapsedTimeInHours" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ElapsedTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OriginalActor" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="OriginalActorId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ProcessInstance" type="{urn:sobject.enterprise.soap.sforce.com}ProcessInstance" minOccurs="0"/>
 *         &lt;element name="ProcessInstanceId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RemindersSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StepStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TargetObject" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="TargetObjectId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessInstanceHistory", propOrder = {
    "actor",
    "actorId",
    "comments",
    "createdBy",
    "createdById",
    "createdDate",
    "elapsedTimeInDays",
    "elapsedTimeInHours",
    "elapsedTimeInMinutes",
    "isDeleted",
    "isPending",
    "originalActor",
    "originalActorId",
    "processInstance",
    "processInstanceId",
    "remindersSent",
    "stepStatus",
    "systemModstamp",
    "targetObject",
    "targetObjectId"
})
public class ProcessInstanceHistory
    extends SObject
{

    @XmlElement(name = "Actor", nillable = true)
    protected Name actor;
    @XmlElement(name = "ActorId", nillable = true)
    protected String actorId;
    @XmlElement(name = "Comments", nillable = true)
    protected String comments;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "ElapsedTimeInDays", nillable = true)
    protected Double elapsedTimeInDays;
    @XmlElement(name = "ElapsedTimeInHours", nillable = true)
    protected Double elapsedTimeInHours;
    @XmlElement(name = "ElapsedTimeInMinutes", nillable = true)
    protected Double elapsedTimeInMinutes;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsPending", nillable = true)
    protected Boolean isPending;
    @XmlElement(name = "OriginalActor", nillable = true)
    protected Name originalActor;
    @XmlElement(name = "OriginalActorId", nillable = true)
    protected String originalActorId;
    @XmlElement(name = "ProcessInstance", nillable = true)
    protected ProcessInstance processInstance;
    @XmlElement(name = "ProcessInstanceId", nillable = true)
    protected String processInstanceId;
    @XmlElement(name = "RemindersSent", nillable = true)
    protected Integer remindersSent;
    @XmlElement(name = "StepStatus", nillable = true)
    protected String stepStatus;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TargetObject", nillable = true)
    protected Name targetObject;
    @XmlElement(name = "TargetObjectId", nillable = true)
    protected String targetObjectId;

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setActor(Name value) {
        this.actor = value;
    }

    /**
     * Gets the value of the actorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActorId() {
        return actorId;
    }

    /**
     * Sets the value of the actorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActorId(String value) {
        this.actorId = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the elapsedTimeInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElapsedTimeInDays() {
        return elapsedTimeInDays;
    }

    /**
     * Sets the value of the elapsedTimeInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElapsedTimeInDays(Double value) {
        this.elapsedTimeInDays = value;
    }

    /**
     * Gets the value of the elapsedTimeInHours property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElapsedTimeInHours() {
        return elapsedTimeInHours;
    }

    /**
     * Sets the value of the elapsedTimeInHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElapsedTimeInHours(Double value) {
        this.elapsedTimeInHours = value;
    }

    /**
     * Gets the value of the elapsedTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getElapsedTimeInMinutes() {
        return elapsedTimeInMinutes;
    }

    /**
     * Sets the value of the elapsedTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setElapsedTimeInMinutes(Double value) {
        this.elapsedTimeInMinutes = value;
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
     * Gets the value of the isPending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPending() {
        return isPending;
    }

    /**
     * Sets the value of the isPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPending(Boolean value) {
        this.isPending = value;
    }

    /**
     * Gets the value of the originalActor property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getOriginalActor() {
        return originalActor;
    }

    /**
     * Sets the value of the originalActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setOriginalActor(Name value) {
        this.originalActor = value;
    }

    /**
     * Gets the value of the originalActorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalActorId() {
        return originalActorId;
    }

    /**
     * Sets the value of the originalActorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalActorId(String value) {
        this.originalActorId = value;
    }

    /**
     * Gets the value of the processInstance property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessInstance }
     *     
     */
    public ProcessInstance getProcessInstance() {
        return processInstance;
    }

    /**
     * Sets the value of the processInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessInstance }
     *     
     */
    public void setProcessInstance(ProcessInstance value) {
        this.processInstance = value;
    }

    /**
     * Gets the value of the processInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * Sets the value of the processInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInstanceId(String value) {
        this.processInstanceId = value;
    }

    /**
     * Gets the value of the remindersSent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemindersSent() {
        return remindersSent;
    }

    /**
     * Sets the value of the remindersSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemindersSent(Integer value) {
        this.remindersSent = value;
    }

    /**
     * Gets the value of the stepStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepStatus() {
        return stepStatus;
    }

    /**
     * Sets the value of the stepStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepStatus(String value) {
        this.stepStatus = value;
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
     * Gets the value of the targetObject property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getTargetObject() {
        return targetObject;
    }

    /**
     * Sets the value of the targetObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setTargetObject(Name value) {
        this.targetObject = value;
    }

    /**
     * Gets the value of the targetObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetObjectId() {
        return targetObjectId;
    }

    /**
     * Sets the value of the targetObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetObjectId(String value) {
        this.targetObjectId = value;
    }

}
