
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__ClaimSummaryOptions__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__ClaimSummaryOptions__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
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
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SetupOwner" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="SetupOwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AllocationFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AllocationFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedFields3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimedFields4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitTypes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimFields3__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimFields4__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DiagnosisFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DiagnosisFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ExplanationOfBenefitFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ExplanationOfBenefitFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HideNewNoteButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideNewTaskButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__NoteFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__NoteFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecificationFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentSpecificationFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskFields1__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskFields2__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ViewHierarchyPage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__ClaimSummaryOptions__c", propOrder = {
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
    "processInstances",
    "processSteps",
    "setupOwner",
    "setupOwnerId",
    "systemModstamp",
    "topicAssignments",
    "userRecordAccess",
    "cve__AdjustmentFields1__C",
    "cve__AdjustmentFields2__C",
    "cve__AllocationFields1__C",
    "cve__AllocationFields2__C",
    "cve__BenefitClaimedFields1__C",
    "cve__BenefitClaimedFields2__C",
    "cve__BenefitClaimedFields3__C",
    "cve__BenefitClaimedFields4__C",
    "cve__BenefitTypes__C",
    "cve__ClaimFields1__C",
    "cve__ClaimFields2__C",
    "cve__ClaimFields3__C",
    "cve__ClaimFields4__C",
    "cve__DiagnosisFields1__C",
    "cve__DiagnosisFields2__C",
    "cve__ExplanationOfBenefitFields1__C",
    "cve__ExplanationOfBenefitFields2__C",
    "cve__HideNewNoteButton__C",
    "cve__HideNewTaskButton__C",
    "cve__NoteFields1__C",
    "cve__NoteFields2__C",
    "cve__PaymentFields1__C",
    "cve__PaymentFields2__C",
    "cve__PaymentSpecificationFields1__C",
    "cve__PaymentSpecificationFields2__C",
    "cve__TaskFields1__C",
    "cve__TaskFields2__C",
    "cve__ViewHierarchyPage__C"
})
public class Cve__ClaimSummaryOptions__C
    extends SObject
{

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
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResultType processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResultType processSteps;
    @XmlElement(name = "SetupOwner", nillable = true)
    protected Name setupOwner;
    @XmlElement(name = "SetupOwnerId", nillable = true)
    protected String setupOwnerId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__AdjustmentFields1__c", nillable = true)
    protected String cve__AdjustmentFields1__C;
    @XmlElement(name = "cve__AdjustmentFields2__c", nillable = true)
    protected String cve__AdjustmentFields2__C;
    @XmlElement(name = "cve__AllocationFields1__c", nillable = true)
    protected String cve__AllocationFields1__C;
    @XmlElement(name = "cve__AllocationFields2__c", nillable = true)
    protected String cve__AllocationFields2__C;
    @XmlElement(name = "cve__BenefitClaimedFields1__c", nillable = true)
    protected String cve__BenefitClaimedFields1__C;
    @XmlElement(name = "cve__BenefitClaimedFields2__c", nillable = true)
    protected String cve__BenefitClaimedFields2__C;
    @XmlElement(name = "cve__BenefitClaimedFields3__c", nillable = true)
    protected String cve__BenefitClaimedFields3__C;
    @XmlElement(name = "cve__BenefitClaimedFields4__c", nillable = true)
    protected String cve__BenefitClaimedFields4__C;
    @XmlElement(name = "cve__BenefitTypes__c", nillable = true)
    protected String cve__BenefitTypes__C;
    @XmlElement(name = "cve__ClaimFields1__c", nillable = true)
    protected String cve__ClaimFields1__C;
    @XmlElement(name = "cve__ClaimFields2__c", nillable = true)
    protected String cve__ClaimFields2__C;
    @XmlElement(name = "cve__ClaimFields3__c", nillable = true)
    protected String cve__ClaimFields3__C;
    @XmlElement(name = "cve__ClaimFields4__c", nillable = true)
    protected String cve__ClaimFields4__C;
    @XmlElement(name = "cve__DiagnosisFields1__c", nillable = true)
    protected String cve__DiagnosisFields1__C;
    @XmlElement(name = "cve__DiagnosisFields2__c", nillable = true)
    protected String cve__DiagnosisFields2__C;
    @XmlElement(name = "cve__ExplanationOfBenefitFields1__c", nillable = true)
    protected String cve__ExplanationOfBenefitFields1__C;
    @XmlElement(name = "cve__ExplanationOfBenefitFields2__c", nillable = true)
    protected String cve__ExplanationOfBenefitFields2__C;
    @XmlElement(name = "cve__HideNewNoteButton__c", nillable = true)
    protected Boolean cve__HideNewNoteButton__C;
    @XmlElement(name = "cve__HideNewTaskButton__c", nillable = true)
    protected Boolean cve__HideNewTaskButton__C;
    @XmlElement(name = "cve__NoteFields1__c", nillable = true)
    protected String cve__NoteFields1__C;
    @XmlElement(name = "cve__NoteFields2__c", nillable = true)
    protected String cve__NoteFields2__C;
    @XmlElement(name = "cve__PaymentFields1__c", nillable = true)
    protected String cve__PaymentFields1__C;
    @XmlElement(name = "cve__PaymentFields2__c", nillable = true)
    protected String cve__PaymentFields2__C;
    @XmlElement(name = "cve__PaymentSpecificationFields1__c", nillable = true)
    protected String cve__PaymentSpecificationFields1__C;
    @XmlElement(name = "cve__PaymentSpecificationFields2__c", nillable = true)
    protected String cve__PaymentSpecificationFields2__C;
    @XmlElement(name = "cve__TaskFields1__c", nillable = true)
    protected String cve__TaskFields1__C;
    @XmlElement(name = "cve__TaskFields2__c", nillable = true)
    protected String cve__TaskFields2__C;
    @XmlElement(name = "cve__ViewHierarchyPage__c", nillable = true)
    protected String cve__ViewHierarchyPage__C;

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
     * Gets the value of the setupOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getSetupOwner() {
        return setupOwner;
    }

    /**
     * Sets the value of the setupOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setSetupOwner(Name value) {
        this.setupOwner = value;
    }

    /**
     * Gets the value of the setupOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupOwnerId() {
        return setupOwnerId;
    }

    /**
     * Sets the value of the setupOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupOwnerId(String value) {
        this.setupOwnerId = value;
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
     * Gets the value of the cve__AdjustmentFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdjustmentFields1__C() {
        return cve__AdjustmentFields1__C;
    }

    /**
     * Sets the value of the cve__AdjustmentFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdjustmentFields1__C(String value) {
        this.cve__AdjustmentFields1__C = value;
    }

    /**
     * Gets the value of the cve__AdjustmentFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdjustmentFields2__C() {
        return cve__AdjustmentFields2__C;
    }

    /**
     * Sets the value of the cve__AdjustmentFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdjustmentFields2__C(String value) {
        this.cve__AdjustmentFields2__C = value;
    }

    /**
     * Gets the value of the cve__AllocationFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AllocationFields1__C() {
        return cve__AllocationFields1__C;
    }

    /**
     * Sets the value of the cve__AllocationFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AllocationFields1__C(String value) {
        this.cve__AllocationFields1__C = value;
    }

    /**
     * Gets the value of the cve__AllocationFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AllocationFields2__C() {
        return cve__AllocationFields2__C;
    }

    /**
     * Sets the value of the cve__AllocationFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AllocationFields2__C(String value) {
        this.cve__AllocationFields2__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitClaimedFields1__C() {
        return cve__BenefitClaimedFields1__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitClaimedFields1__C(String value) {
        this.cve__BenefitClaimedFields1__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitClaimedFields2__C() {
        return cve__BenefitClaimedFields2__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitClaimedFields2__C(String value) {
        this.cve__BenefitClaimedFields2__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedFields3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitClaimedFields3__C() {
        return cve__BenefitClaimedFields3__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedFields3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitClaimedFields3__C(String value) {
        this.cve__BenefitClaimedFields3__C = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimedFields4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitClaimedFields4__C() {
        return cve__BenefitClaimedFields4__C;
    }

    /**
     * Sets the value of the cve__BenefitClaimedFields4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitClaimedFields4__C(String value) {
        this.cve__BenefitClaimedFields4__C = value;
    }

    /**
     * Gets the value of the cve__BenefitTypes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitTypes__C() {
        return cve__BenefitTypes__C;
    }

    /**
     * Sets the value of the cve__BenefitTypes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitTypes__C(String value) {
        this.cve__BenefitTypes__C = value;
    }

    /**
     * Gets the value of the cve__ClaimFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimFields1__C() {
        return cve__ClaimFields1__C;
    }

    /**
     * Sets the value of the cve__ClaimFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimFields1__C(String value) {
        this.cve__ClaimFields1__C = value;
    }

    /**
     * Gets the value of the cve__ClaimFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimFields2__C() {
        return cve__ClaimFields2__C;
    }

    /**
     * Sets the value of the cve__ClaimFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimFields2__C(String value) {
        this.cve__ClaimFields2__C = value;
    }

    /**
     * Gets the value of the cve__ClaimFields3__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimFields3__C() {
        return cve__ClaimFields3__C;
    }

    /**
     * Sets the value of the cve__ClaimFields3__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimFields3__C(String value) {
        this.cve__ClaimFields3__C = value;
    }

    /**
     * Gets the value of the cve__ClaimFields4__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimFields4__C() {
        return cve__ClaimFields4__C;
    }

    /**
     * Sets the value of the cve__ClaimFields4__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimFields4__C(String value) {
        this.cve__ClaimFields4__C = value;
    }

    /**
     * Gets the value of the cve__DiagnosisFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DiagnosisFields1__C() {
        return cve__DiagnosisFields1__C;
    }

    /**
     * Sets the value of the cve__DiagnosisFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DiagnosisFields1__C(String value) {
        this.cve__DiagnosisFields1__C = value;
    }

    /**
     * Gets the value of the cve__DiagnosisFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DiagnosisFields2__C() {
        return cve__DiagnosisFields2__C;
    }

    /**
     * Sets the value of the cve__DiagnosisFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DiagnosisFields2__C(String value) {
        this.cve__DiagnosisFields2__C = value;
    }

    /**
     * Gets the value of the cve__ExplanationOfBenefitFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ExplanationOfBenefitFields1__C() {
        return cve__ExplanationOfBenefitFields1__C;
    }

    /**
     * Sets the value of the cve__ExplanationOfBenefitFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ExplanationOfBenefitFields1__C(String value) {
        this.cve__ExplanationOfBenefitFields1__C = value;
    }

    /**
     * Gets the value of the cve__ExplanationOfBenefitFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ExplanationOfBenefitFields2__C() {
        return cve__ExplanationOfBenefitFields2__C;
    }

    /**
     * Sets the value of the cve__ExplanationOfBenefitFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ExplanationOfBenefitFields2__C(String value) {
        this.cve__ExplanationOfBenefitFields2__C = value;
    }

    /**
     * Gets the value of the cve__HideNewNoteButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideNewNoteButton__C() {
        return cve__HideNewNoteButton__C;
    }

    /**
     * Sets the value of the cve__HideNewNoteButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideNewNoteButton__C(Boolean value) {
        this.cve__HideNewNoteButton__C = value;
    }

    /**
     * Gets the value of the cve__HideNewTaskButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideNewTaskButton__C() {
        return cve__HideNewTaskButton__C;
    }

    /**
     * Sets the value of the cve__HideNewTaskButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideNewTaskButton__C(Boolean value) {
        this.cve__HideNewTaskButton__C = value;
    }

    /**
     * Gets the value of the cve__NoteFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__NoteFields1__C() {
        return cve__NoteFields1__C;
    }

    /**
     * Sets the value of the cve__NoteFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__NoteFields1__C(String value) {
        this.cve__NoteFields1__C = value;
    }

    /**
     * Gets the value of the cve__NoteFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__NoteFields2__C() {
        return cve__NoteFields2__C;
    }

    /**
     * Sets the value of the cve__NoteFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__NoteFields2__C(String value) {
        this.cve__NoteFields2__C = value;
    }

    /**
     * Gets the value of the cve__PaymentFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentFields1__C() {
        return cve__PaymentFields1__C;
    }

    /**
     * Sets the value of the cve__PaymentFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentFields1__C(String value) {
        this.cve__PaymentFields1__C = value;
    }

    /**
     * Gets the value of the cve__PaymentFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentFields2__C() {
        return cve__PaymentFields2__C;
    }

    /**
     * Sets the value of the cve__PaymentFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentFields2__C(String value) {
        this.cve__PaymentFields2__C = value;
    }

    /**
     * Gets the value of the cve__PaymentSpecificationFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentSpecificationFields1__C() {
        return cve__PaymentSpecificationFields1__C;
    }

    /**
     * Sets the value of the cve__PaymentSpecificationFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentSpecificationFields1__C(String value) {
        this.cve__PaymentSpecificationFields1__C = value;
    }

    /**
     * Gets the value of the cve__PaymentSpecificationFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentSpecificationFields2__C() {
        return cve__PaymentSpecificationFields2__C;
    }

    /**
     * Sets the value of the cve__PaymentSpecificationFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentSpecificationFields2__C(String value) {
        this.cve__PaymentSpecificationFields2__C = value;
    }

    /**
     * Gets the value of the cve__TaskFields1__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskFields1__C() {
        return cve__TaskFields1__C;
    }

    /**
     * Sets the value of the cve__TaskFields1__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskFields1__C(String value) {
        this.cve__TaskFields1__C = value;
    }

    /**
     * Gets the value of the cve__TaskFields2__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskFields2__C() {
        return cve__TaskFields2__C;
    }

    /**
     * Sets the value of the cve__TaskFields2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskFields2__C(String value) {
        this.cve__TaskFields2__C = value;
    }

    /**
     * Gets the value of the cve__ViewHierarchyPage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ViewHierarchyPage__C() {
        return cve__ViewHierarchyPage__C;
    }

    /**
     * Sets the value of the cve__ViewHierarchyPage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ViewHierarchyPage__C(String value) {
        this.cve__ViewHierarchyPage__C = value;
    }

}
