
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__RequiredDocuments__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__RequiredDocuments__c">
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
 *         &lt;element name="cve__AccidentExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Accident__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AdadDeathExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AdadDeath__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AdadDismembermentExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AdadDismemberment__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AnnuityExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Annuity__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IncomeProtectionExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IncomeProtection__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IndemnityExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Indemnity__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LongTermDisabilityExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LongTermDisability__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ShortTermDisabilityExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ShortTermDisability__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SurvivorExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Survivor__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TermLifeAcceleratedPaymentExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TermLifeAcceleratedPayment__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TermLifeExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TermLife__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TotalAndPermanentDisabilityExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TotalAndPermanentDisability__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__UniversalLifeExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__UniversalLife__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WaiverOfPremiumExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WaiverOfPremium__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WholeLifeExt__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WholeLife__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__RequiredDocuments__c", propOrder = {
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
    "cve__AccidentExt__C",
    "cve__Accident__C",
    "cve__AdadDeathExt__C",
    "cve__AdadDeath__C",
    "cve__AdadDismembermentExt__C",
    "cve__AdadDismemberment__C",
    "cve__AnnuityExt__C",
    "cve__Annuity__C",
    "cve__IncomeProtectionExt__C",
    "cve__IncomeProtection__C",
    "cve__IndemnityExt__C",
    "cve__Indemnity__C",
    "cve__LongTermDisabilityExt__C",
    "cve__LongTermDisability__C",
    "cve__ShortTermDisabilityExt__C",
    "cve__ShortTermDisability__C",
    "cve__SurvivorExt__C",
    "cve__Survivor__C",
    "cve__TermLifeAcceleratedPaymentExt__C",
    "cve__TermLifeAcceleratedPayment__C",
    "cve__TermLifeExt__C",
    "cve__TermLife__C",
    "cve__TotalAndPermanentDisabilityExt__C",
    "cve__TotalAndPermanentDisability__C",
    "cve__UniversalLifeExt__C",
    "cve__UniversalLife__C",
    "cve__WaiverOfPremiumExt__C",
    "cve__WaiverOfPremium__C",
    "cve__WholeLifeExt__C",
    "cve__WholeLife__C"
})
public class Cve__RequiredDocuments__C
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
    @XmlElement(name = "cve__AccidentExt__c", nillable = true)
    protected String cve__AccidentExt__C;
    @XmlElement(name = "cve__Accident__c", nillable = true)
    protected String cve__Accident__C;
    @XmlElement(name = "cve__AdadDeathExt__c", nillable = true)
    protected String cve__AdadDeathExt__C;
    @XmlElement(name = "cve__AdadDeath__c", nillable = true)
    protected String cve__AdadDeath__C;
    @XmlElement(name = "cve__AdadDismembermentExt__c", nillable = true)
    protected String cve__AdadDismembermentExt__C;
    @XmlElement(name = "cve__AdadDismemberment__c", nillable = true)
    protected String cve__AdadDismemberment__C;
    @XmlElement(name = "cve__AnnuityExt__c", nillable = true)
    protected String cve__AnnuityExt__C;
    @XmlElement(name = "cve__Annuity__c", nillable = true)
    protected String cve__Annuity__C;
    @XmlElement(name = "cve__IncomeProtectionExt__c", nillable = true)
    protected String cve__IncomeProtectionExt__C;
    @XmlElement(name = "cve__IncomeProtection__c", nillable = true)
    protected String cve__IncomeProtection__C;
    @XmlElement(name = "cve__IndemnityExt__c", nillable = true)
    protected String cve__IndemnityExt__C;
    @XmlElement(name = "cve__Indemnity__c", nillable = true)
    protected String cve__Indemnity__C;
    @XmlElement(name = "cve__LongTermDisabilityExt__c", nillable = true)
    protected String cve__LongTermDisabilityExt__C;
    @XmlElement(name = "cve__LongTermDisability__c", nillable = true)
    protected String cve__LongTermDisability__C;
    @XmlElement(name = "cve__ShortTermDisabilityExt__c", nillable = true)
    protected String cve__ShortTermDisabilityExt__C;
    @XmlElement(name = "cve__ShortTermDisability__c", nillable = true)
    protected String cve__ShortTermDisability__C;
    @XmlElement(name = "cve__SurvivorExt__c", nillable = true)
    protected String cve__SurvivorExt__C;
    @XmlElement(name = "cve__Survivor__c", nillable = true)
    protected String cve__Survivor__C;
    @XmlElement(name = "cve__TermLifeAcceleratedPaymentExt__c", nillable = true)
    protected String cve__TermLifeAcceleratedPaymentExt__C;
    @XmlElement(name = "cve__TermLifeAcceleratedPayment__c", nillable = true)
    protected String cve__TermLifeAcceleratedPayment__C;
    @XmlElement(name = "cve__TermLifeExt__c", nillable = true)
    protected String cve__TermLifeExt__C;
    @XmlElement(name = "cve__TermLife__c", nillable = true)
    protected String cve__TermLife__C;
    @XmlElement(name = "cve__TotalAndPermanentDisabilityExt__c", nillable = true)
    protected String cve__TotalAndPermanentDisabilityExt__C;
    @XmlElement(name = "cve__TotalAndPermanentDisability__c", nillable = true)
    protected String cve__TotalAndPermanentDisability__C;
    @XmlElement(name = "cve__UniversalLifeExt__c", nillable = true)
    protected String cve__UniversalLifeExt__C;
    @XmlElement(name = "cve__UniversalLife__c", nillable = true)
    protected String cve__UniversalLife__C;
    @XmlElement(name = "cve__WaiverOfPremiumExt__c", nillable = true)
    protected String cve__WaiverOfPremiumExt__C;
    @XmlElement(name = "cve__WaiverOfPremium__c", nillable = true)
    protected String cve__WaiverOfPremium__C;
    @XmlElement(name = "cve__WholeLifeExt__c", nillable = true)
    protected String cve__WholeLifeExt__C;
    @XmlElement(name = "cve__WholeLife__c", nillable = true)
    protected String cve__WholeLife__C;

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
     * Gets the value of the cve__AccidentExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AccidentExt__C() {
        return cve__AccidentExt__C;
    }

    /**
     * Sets the value of the cve__AccidentExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AccidentExt__C(String value) {
        this.cve__AccidentExt__C = value;
    }

    /**
     * Gets the value of the cve__Accident__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Accident__C() {
        return cve__Accident__C;
    }

    /**
     * Sets the value of the cve__Accident__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Accident__C(String value) {
        this.cve__Accident__C = value;
    }

    /**
     * Gets the value of the cve__AdadDeathExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdadDeathExt__C() {
        return cve__AdadDeathExt__C;
    }

    /**
     * Sets the value of the cve__AdadDeathExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdadDeathExt__C(String value) {
        this.cve__AdadDeathExt__C = value;
    }

    /**
     * Gets the value of the cve__AdadDeath__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdadDeath__C() {
        return cve__AdadDeath__C;
    }

    /**
     * Sets the value of the cve__AdadDeath__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdadDeath__C(String value) {
        this.cve__AdadDeath__C = value;
    }

    /**
     * Gets the value of the cve__AdadDismembermentExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdadDismembermentExt__C() {
        return cve__AdadDismembermentExt__C;
    }

    /**
     * Sets the value of the cve__AdadDismembermentExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdadDismembermentExt__C(String value) {
        this.cve__AdadDismembermentExt__C = value;
    }

    /**
     * Gets the value of the cve__AdadDismemberment__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdadDismemberment__C() {
        return cve__AdadDismemberment__C;
    }

    /**
     * Sets the value of the cve__AdadDismemberment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdadDismemberment__C(String value) {
        this.cve__AdadDismemberment__C = value;
    }

    /**
     * Gets the value of the cve__AnnuityExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AnnuityExt__C() {
        return cve__AnnuityExt__C;
    }

    /**
     * Sets the value of the cve__AnnuityExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AnnuityExt__C(String value) {
        this.cve__AnnuityExt__C = value;
    }

    /**
     * Gets the value of the cve__Annuity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Annuity__C() {
        return cve__Annuity__C;
    }

    /**
     * Sets the value of the cve__Annuity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Annuity__C(String value) {
        this.cve__Annuity__C = value;
    }

    /**
     * Gets the value of the cve__IncomeProtectionExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IncomeProtectionExt__C() {
        return cve__IncomeProtectionExt__C;
    }

    /**
     * Sets the value of the cve__IncomeProtectionExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IncomeProtectionExt__C(String value) {
        this.cve__IncomeProtectionExt__C = value;
    }

    /**
     * Gets the value of the cve__IncomeProtection__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IncomeProtection__C() {
        return cve__IncomeProtection__C;
    }

    /**
     * Sets the value of the cve__IncomeProtection__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IncomeProtection__C(String value) {
        this.cve__IncomeProtection__C = value;
    }

    /**
     * Gets the value of the cve__IndemnityExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IndemnityExt__C() {
        return cve__IndemnityExt__C;
    }

    /**
     * Sets the value of the cve__IndemnityExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IndemnityExt__C(String value) {
        this.cve__IndemnityExt__C = value;
    }

    /**
     * Gets the value of the cve__Indemnity__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Indemnity__C() {
        return cve__Indemnity__C;
    }

    /**
     * Sets the value of the cve__Indemnity__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Indemnity__C(String value) {
        this.cve__Indemnity__C = value;
    }

    /**
     * Gets the value of the cve__LongTermDisabilityExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LongTermDisabilityExt__C() {
        return cve__LongTermDisabilityExt__C;
    }

    /**
     * Sets the value of the cve__LongTermDisabilityExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LongTermDisabilityExt__C(String value) {
        this.cve__LongTermDisabilityExt__C = value;
    }

    /**
     * Gets the value of the cve__LongTermDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LongTermDisability__C() {
        return cve__LongTermDisability__C;
    }

    /**
     * Sets the value of the cve__LongTermDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LongTermDisability__C(String value) {
        this.cve__LongTermDisability__C = value;
    }

    /**
     * Gets the value of the cve__ShortTermDisabilityExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ShortTermDisabilityExt__C() {
        return cve__ShortTermDisabilityExt__C;
    }

    /**
     * Sets the value of the cve__ShortTermDisabilityExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ShortTermDisabilityExt__C(String value) {
        this.cve__ShortTermDisabilityExt__C = value;
    }

    /**
     * Gets the value of the cve__ShortTermDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ShortTermDisability__C() {
        return cve__ShortTermDisability__C;
    }

    /**
     * Sets the value of the cve__ShortTermDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ShortTermDisability__C(String value) {
        this.cve__ShortTermDisability__C = value;
    }

    /**
     * Gets the value of the cve__SurvivorExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SurvivorExt__C() {
        return cve__SurvivorExt__C;
    }

    /**
     * Sets the value of the cve__SurvivorExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SurvivorExt__C(String value) {
        this.cve__SurvivorExt__C = value;
    }

    /**
     * Gets the value of the cve__Survivor__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Survivor__C() {
        return cve__Survivor__C;
    }

    /**
     * Sets the value of the cve__Survivor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Survivor__C(String value) {
        this.cve__Survivor__C = value;
    }

    /**
     * Gets the value of the cve__TermLifeAcceleratedPaymentExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TermLifeAcceleratedPaymentExt__C() {
        return cve__TermLifeAcceleratedPaymentExt__C;
    }

    /**
     * Sets the value of the cve__TermLifeAcceleratedPaymentExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TermLifeAcceleratedPaymentExt__C(String value) {
        this.cve__TermLifeAcceleratedPaymentExt__C = value;
    }

    /**
     * Gets the value of the cve__TermLifeAcceleratedPayment__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TermLifeAcceleratedPayment__C() {
        return cve__TermLifeAcceleratedPayment__C;
    }

    /**
     * Sets the value of the cve__TermLifeAcceleratedPayment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TermLifeAcceleratedPayment__C(String value) {
        this.cve__TermLifeAcceleratedPayment__C = value;
    }

    /**
     * Gets the value of the cve__TermLifeExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TermLifeExt__C() {
        return cve__TermLifeExt__C;
    }

    /**
     * Sets the value of the cve__TermLifeExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TermLifeExt__C(String value) {
        this.cve__TermLifeExt__C = value;
    }

    /**
     * Gets the value of the cve__TermLife__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TermLife__C() {
        return cve__TermLife__C;
    }

    /**
     * Sets the value of the cve__TermLife__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TermLife__C(String value) {
        this.cve__TermLife__C = value;
    }

    /**
     * Gets the value of the cve__TotalAndPermanentDisabilityExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TotalAndPermanentDisabilityExt__C() {
        return cve__TotalAndPermanentDisabilityExt__C;
    }

    /**
     * Sets the value of the cve__TotalAndPermanentDisabilityExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TotalAndPermanentDisabilityExt__C(String value) {
        this.cve__TotalAndPermanentDisabilityExt__C = value;
    }

    /**
     * Gets the value of the cve__TotalAndPermanentDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TotalAndPermanentDisability__C() {
        return cve__TotalAndPermanentDisability__C;
    }

    /**
     * Sets the value of the cve__TotalAndPermanentDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TotalAndPermanentDisability__C(String value) {
        this.cve__TotalAndPermanentDisability__C = value;
    }

    /**
     * Gets the value of the cve__UniversalLifeExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__UniversalLifeExt__C() {
        return cve__UniversalLifeExt__C;
    }

    /**
     * Sets the value of the cve__UniversalLifeExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__UniversalLifeExt__C(String value) {
        this.cve__UniversalLifeExt__C = value;
    }

    /**
     * Gets the value of the cve__UniversalLife__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__UniversalLife__C() {
        return cve__UniversalLife__C;
    }

    /**
     * Sets the value of the cve__UniversalLife__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__UniversalLife__C(String value) {
        this.cve__UniversalLife__C = value;
    }

    /**
     * Gets the value of the cve__WaiverOfPremiumExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WaiverOfPremiumExt__C() {
        return cve__WaiverOfPremiumExt__C;
    }

    /**
     * Sets the value of the cve__WaiverOfPremiumExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WaiverOfPremiumExt__C(String value) {
        this.cve__WaiverOfPremiumExt__C = value;
    }

    /**
     * Gets the value of the cve__WaiverOfPremium__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WaiverOfPremium__C() {
        return cve__WaiverOfPremium__C;
    }

    /**
     * Sets the value of the cve__WaiverOfPremium__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WaiverOfPremium__C(String value) {
        this.cve__WaiverOfPremium__C = value;
    }

    /**
     * Gets the value of the cve__WholeLifeExt__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WholeLifeExt__C() {
        return cve__WholeLifeExt__C;
    }

    /**
     * Sets the value of the cve__WholeLifeExt__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WholeLifeExt__C(String value) {
        this.cve__WholeLifeExt__C = value;
    }

    /**
     * Gets the value of the cve__WholeLife__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WholeLife__C() {
        return cve__WholeLife__C;
    }

    /**
     * Sets the value of the cve__WholeLife__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WholeLife__C(String value) {
        this.cve__WholeLife__C = value;
    }

}
