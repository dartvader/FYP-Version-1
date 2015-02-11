
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__Class__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__Class__c">
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
 *         &lt;element name="cve__Account__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Account__r" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="cve__ClassRelationships__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Effective__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__EmployeeContributionPostTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployeeContributionPreTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployeeContribution__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployeePostTaxPremium__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__EmployerContributionPostTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerContributionPreTax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerContribution__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmploymentClassification__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__HoursRequired__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdPaymentSchedule__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__LtdPaymentSchedule__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSchedule__c" minOccurs="0"/>
 *         &lt;element name="cve__PolicyBenefits__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__StdPaymentSchedule__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__StdPaymentSchedule__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__PaymentSchedule__c" minOccurs="0"/>
 *         &lt;element name="cve__VariableContribution__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__Class__c", propOrder = {
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
    "cve__Account__C",
    "cve__Account__R",
    "cve__ClassRelationships__R",
    "cve__Effective__C",
    "cve__EmployeeContributionPostTax__C",
    "cve__EmployeeContributionPreTax__C",
    "cve__EmployeeContribution__C",
    "cve__EmployeePostTaxPremium__C",
    "cve__EmployerContributionPostTax__C",
    "cve__EmployerContributionPreTax__C",
    "cve__EmployerContribution__C",
    "cve__EmploymentClassification__C",
    "cve__Expiration__C",
    "cve__HoursRequired__C",
    "cve__LtdPaymentSchedule__C",
    "cve__LtdPaymentSchedule__R",
    "cve__PolicyBenefits__R",
    "cve__StdPaymentSchedule__C",
    "cve__StdPaymentSchedule__R",
    "cve__VariableContribution__C"
})
public class Cve__Class__C
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
    @XmlElement(name = "cve__Account__c", nillable = true)
    protected String cve__Account__C;
    @XmlElement(name = "cve__Account__r", nillable = true)
    protected Account cve__Account__R;
    @XmlElement(name = "cve__ClassRelationships__r", nillable = true)
    protected QueryResultType cve__ClassRelationships__R;
    @XmlElement(name = "cve__Effective__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Effective__C;
    @XmlElement(name = "cve__EmployeeContributionPostTax__c", nillable = true)
    protected Double cve__EmployeeContributionPostTax__C;
    @XmlElement(name = "cve__EmployeeContributionPreTax__c", nillable = true)
    protected Double cve__EmployeeContributionPreTax__C;
    @XmlElement(name = "cve__EmployeeContribution__c", nillable = true)
    protected Double cve__EmployeeContribution__C;
    @XmlElement(name = "cve__EmployeePostTaxPremium__c", nillable = true)
    protected Boolean cve__EmployeePostTaxPremium__C;
    @XmlElement(name = "cve__EmployerContributionPostTax__c", nillable = true)
    protected Double cve__EmployerContributionPostTax__C;
    @XmlElement(name = "cve__EmployerContributionPreTax__c", nillable = true)
    protected Double cve__EmployerContributionPreTax__C;
    @XmlElement(name = "cve__EmployerContribution__c", nillable = true)
    protected Double cve__EmployerContribution__C;
    @XmlElement(name = "cve__EmploymentClassification__c", nillable = true)
    protected String cve__EmploymentClassification__C;
    @XmlElement(name = "cve__Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Expiration__C;
    @XmlElement(name = "cve__HoursRequired__c", nillable = true)
    protected Double cve__HoursRequired__C;
    @XmlElement(name = "cve__LtdPaymentSchedule__c", nillable = true)
    protected String cve__LtdPaymentSchedule__C;
    @XmlElement(name = "cve__LtdPaymentSchedule__r", nillable = true)
    protected Cve__PaymentSchedule__C cve__LtdPaymentSchedule__R;
    @XmlElement(name = "cve__PolicyBenefits__r", nillable = true)
    protected QueryResultType cve__PolicyBenefits__R;
    @XmlElement(name = "cve__StdPaymentSchedule__c", nillable = true)
    protected String cve__StdPaymentSchedule__C;
    @XmlElement(name = "cve__StdPaymentSchedule__r", nillable = true)
    protected Cve__PaymentSchedule__C cve__StdPaymentSchedule__R;
    @XmlElement(name = "cve__VariableContribution__c", nillable = true)
    protected Boolean cve__VariableContribution__C;

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
     * Gets the value of the cve__ClassRelationships__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__ClassRelationships__R() {
        return cve__ClassRelationships__R;
    }

    /**
     * Sets the value of the cve__ClassRelationships__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__ClassRelationships__R(QueryResultType value) {
        this.cve__ClassRelationships__R = value;
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
     * Gets the value of the cve__EmployeeContributionPostTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeeContributionPostTax__C() {
        return cve__EmployeeContributionPostTax__C;
    }

    /**
     * Sets the value of the cve__EmployeeContributionPostTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeeContributionPostTax__C(Double value) {
        this.cve__EmployeeContributionPostTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployeeContributionPreTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeeContributionPreTax__C() {
        return cve__EmployeeContributionPreTax__C;
    }

    /**
     * Sets the value of the cve__EmployeeContributionPreTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeeContributionPreTax__C(Double value) {
        this.cve__EmployeeContributionPreTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployeeContribution__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeeContribution__C() {
        return cve__EmployeeContribution__C;
    }

    /**
     * Sets the value of the cve__EmployeeContribution__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeeContribution__C(Double value) {
        this.cve__EmployeeContribution__C = value;
    }

    /**
     * Gets the value of the cve__EmployeePostTaxPremium__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__EmployeePostTaxPremium__C() {
        return cve__EmployeePostTaxPremium__C;
    }

    /**
     * Sets the value of the cve__EmployeePostTaxPremium__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__EmployeePostTaxPremium__C(Boolean value) {
        this.cve__EmployeePostTaxPremium__C = value;
    }

    /**
     * Gets the value of the cve__EmployerContributionPostTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerContributionPostTax__C() {
        return cve__EmployerContributionPostTax__C;
    }

    /**
     * Sets the value of the cve__EmployerContributionPostTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerContributionPostTax__C(Double value) {
        this.cve__EmployerContributionPostTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployerContributionPreTax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerContributionPreTax__C() {
        return cve__EmployerContributionPreTax__C;
    }

    /**
     * Sets the value of the cve__EmployerContributionPreTax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerContributionPreTax__C(Double value) {
        this.cve__EmployerContributionPreTax__C = value;
    }

    /**
     * Gets the value of the cve__EmployerContribution__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerContribution__C() {
        return cve__EmployerContribution__C;
    }

    /**
     * Sets the value of the cve__EmployerContribution__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerContribution__C(Double value) {
        this.cve__EmployerContribution__C = value;
    }

    /**
     * Gets the value of the cve__EmploymentClassification__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EmploymentClassification__C() {
        return cve__EmploymentClassification__C;
    }

    /**
     * Sets the value of the cve__EmploymentClassification__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EmploymentClassification__C(String value) {
        this.cve__EmploymentClassification__C = value;
    }

    /**
     * Gets the value of the cve__Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Expiration__C() {
        return cve__Expiration__C;
    }

    /**
     * Sets the value of the cve__Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Expiration__C(XMLGregorianCalendar value) {
        this.cve__Expiration__C = value;
    }

    /**
     * Gets the value of the cve__HoursRequired__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HoursRequired__C() {
        return cve__HoursRequired__C;
    }

    /**
     * Sets the value of the cve__HoursRequired__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HoursRequired__C(Double value) {
        this.cve__HoursRequired__C = value;
    }

    /**
     * Gets the value of the cve__LtdPaymentSchedule__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LtdPaymentSchedule__C() {
        return cve__LtdPaymentSchedule__C;
    }

    /**
     * Sets the value of the cve__LtdPaymentSchedule__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LtdPaymentSchedule__C(String value) {
        this.cve__LtdPaymentSchedule__C = value;
    }

    /**
     * Gets the value of the cve__LtdPaymentSchedule__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__PaymentSchedule__C }
     *     
     */
    public Cve__PaymentSchedule__C getCve__LtdPaymentSchedule__R() {
        return cve__LtdPaymentSchedule__R;
    }

    /**
     * Sets the value of the cve__LtdPaymentSchedule__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__PaymentSchedule__C }
     *     
     */
    public void setCve__LtdPaymentSchedule__R(Cve__PaymentSchedule__C value) {
        this.cve__LtdPaymentSchedule__R = value;
    }

    /**
     * Gets the value of the cve__PolicyBenefits__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PolicyBenefits__R() {
        return cve__PolicyBenefits__R;
    }

    /**
     * Sets the value of the cve__PolicyBenefits__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PolicyBenefits__R(QueryResultType value) {
        this.cve__PolicyBenefits__R = value;
    }

    /**
     * Gets the value of the cve__StdPaymentSchedule__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StdPaymentSchedule__C() {
        return cve__StdPaymentSchedule__C;
    }

    /**
     * Sets the value of the cve__StdPaymentSchedule__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StdPaymentSchedule__C(String value) {
        this.cve__StdPaymentSchedule__C = value;
    }

    /**
     * Gets the value of the cve__StdPaymentSchedule__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__PaymentSchedule__C }
     *     
     */
    public Cve__PaymentSchedule__C getCve__StdPaymentSchedule__R() {
        return cve__StdPaymentSchedule__R;
    }

    /**
     * Sets the value of the cve__StdPaymentSchedule__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__PaymentSchedule__C }
     *     
     */
    public void setCve__StdPaymentSchedule__R(Cve__PaymentSchedule__C value) {
        this.cve__StdPaymentSchedule__R = value;
    }

    /**
     * Gets the value of the cve__VariableContribution__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__VariableContribution__C() {
        return cve__VariableContribution__C;
    }

    /**
     * Sets the value of the cve__VariableContribution__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__VariableContribution__C(Boolean value) {
        this.cve__VariableContribution__C = value;
    }

}
