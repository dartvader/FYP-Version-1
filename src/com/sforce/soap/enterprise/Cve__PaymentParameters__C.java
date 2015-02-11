
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__PaymentParameters__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__PaymentParameters__c">
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
 *         &lt;element name="cve__AnnualSalaryMultipleToNextThousand__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AttorneyFeesCap__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CheckIssueOffsetBusinessHoursName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CheckPayableOffsetBusinessHoursName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DefaultLtdPaymentScheduleName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DefaultStdPaymentScheduleName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EftIssueOffsetBusinessHoursName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EftPayableOffsetBusinessHoursName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__InitialNumberOfLtdPayments__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__InitialNumberOfStdPayments__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IssueNeverInThePast__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__LtdCheckIssueOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdCheckPayableOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdEftIssueOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdEftPayableOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdPaymentPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LtdThroughDateBaseDateField__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PayableNeverInThePast__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__StdCheckIssueOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__StdCheckPayableOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__StdEftIssueOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__StdEftPayableOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__StdPaymentPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__StdThroughDateBaseDateField__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TermLifeCheckIssueOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TermLifeCheckPayableOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TermLifeEftIssueOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TermLifeEftPayableOffset__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__PaymentParameters__c", propOrder = {
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
    "cve__AnnualSalaryMultipleToNextThousand__C",
    "cve__AttorneyFeesCap__C",
    "cve__CheckIssueOffsetBusinessHoursName__C",
    "cve__CheckPayableOffsetBusinessHoursName__C",
    "cve__DefaultLtdPaymentScheduleName__C",
    "cve__DefaultStdPaymentScheduleName__C",
    "cve__EftIssueOffsetBusinessHoursName__C",
    "cve__EftPayableOffsetBusinessHoursName__C",
    "cve__InitialNumberOfLtdPayments__C",
    "cve__InitialNumberOfStdPayments__C",
    "cve__IssueNeverInThePast__C",
    "cve__LtdCheckIssueOffset__C",
    "cve__LtdCheckPayableOffset__C",
    "cve__LtdEftIssueOffset__C",
    "cve__LtdEftPayableOffset__C",
    "cve__LtdPaymentPeriod__C",
    "cve__LtdThroughDateBaseDateField__C",
    "cve__PayableNeverInThePast__C",
    "cve__StdCheckIssueOffset__C",
    "cve__StdCheckPayableOffset__C",
    "cve__StdEftIssueOffset__C",
    "cve__StdEftPayableOffset__C",
    "cve__StdPaymentPeriod__C",
    "cve__StdThroughDateBaseDateField__C",
    "cve__TermLifeCheckIssueOffset__C",
    "cve__TermLifeCheckPayableOffset__C",
    "cve__TermLifeEftIssueOffset__C",
    "cve__TermLifeEftPayableOffset__C"
})
public class Cve__PaymentParameters__C
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
    @XmlElement(name = "cve__AnnualSalaryMultipleToNextThousand__c", nillable = true)
    protected Boolean cve__AnnualSalaryMultipleToNextThousand__C;
    @XmlElement(name = "cve__AttorneyFeesCap__c", nillable = true)
    protected Double cve__AttorneyFeesCap__C;
    @XmlElement(name = "cve__CheckIssueOffsetBusinessHoursName__c", nillable = true)
    protected String cve__CheckIssueOffsetBusinessHoursName__C;
    @XmlElement(name = "cve__CheckPayableOffsetBusinessHoursName__c", nillable = true)
    protected String cve__CheckPayableOffsetBusinessHoursName__C;
    @XmlElement(name = "cve__DefaultLtdPaymentScheduleName__c", nillable = true)
    protected String cve__DefaultLtdPaymentScheduleName__C;
    @XmlElement(name = "cve__DefaultStdPaymentScheduleName__c", nillable = true)
    protected String cve__DefaultStdPaymentScheduleName__C;
    @XmlElement(name = "cve__EftIssueOffsetBusinessHoursName__c", nillable = true)
    protected String cve__EftIssueOffsetBusinessHoursName__C;
    @XmlElement(name = "cve__EftPayableOffsetBusinessHoursName__c", nillable = true)
    protected String cve__EftPayableOffsetBusinessHoursName__C;
    @XmlElement(name = "cve__InitialNumberOfLtdPayments__c", nillable = true)
    protected Double cve__InitialNumberOfLtdPayments__C;
    @XmlElement(name = "cve__InitialNumberOfStdPayments__c", nillable = true)
    protected Double cve__InitialNumberOfStdPayments__C;
    @XmlElement(name = "cve__IssueNeverInThePast__c", nillable = true)
    protected Boolean cve__IssueNeverInThePast__C;
    @XmlElement(name = "cve__LtdCheckIssueOffset__c", nillable = true)
    protected Double cve__LtdCheckIssueOffset__C;
    @XmlElement(name = "cve__LtdCheckPayableOffset__c", nillable = true)
    protected Double cve__LtdCheckPayableOffset__C;
    @XmlElement(name = "cve__LtdEftIssueOffset__c", nillable = true)
    protected Double cve__LtdEftIssueOffset__C;
    @XmlElement(name = "cve__LtdEftPayableOffset__c", nillable = true)
    protected Double cve__LtdEftPayableOffset__C;
    @XmlElement(name = "cve__LtdPaymentPeriod__c", nillable = true)
    protected String cve__LtdPaymentPeriod__C;
    @XmlElement(name = "cve__LtdThroughDateBaseDateField__c", nillable = true)
    protected String cve__LtdThroughDateBaseDateField__C;
    @XmlElement(name = "cve__PayableNeverInThePast__c", nillable = true)
    protected Boolean cve__PayableNeverInThePast__C;
    @XmlElement(name = "cve__StdCheckIssueOffset__c", nillable = true)
    protected Double cve__StdCheckIssueOffset__C;
    @XmlElement(name = "cve__StdCheckPayableOffset__c", nillable = true)
    protected Double cve__StdCheckPayableOffset__C;
    @XmlElement(name = "cve__StdEftIssueOffset__c", nillable = true)
    protected Double cve__StdEftIssueOffset__C;
    @XmlElement(name = "cve__StdEftPayableOffset__c", nillable = true)
    protected Double cve__StdEftPayableOffset__C;
    @XmlElement(name = "cve__StdPaymentPeriod__c", nillable = true)
    protected String cve__StdPaymentPeriod__C;
    @XmlElement(name = "cve__StdThroughDateBaseDateField__c", nillable = true)
    protected String cve__StdThroughDateBaseDateField__C;
    @XmlElement(name = "cve__TermLifeCheckIssueOffset__c", nillable = true)
    protected Double cve__TermLifeCheckIssueOffset__C;
    @XmlElement(name = "cve__TermLifeCheckPayableOffset__c", nillable = true)
    protected Double cve__TermLifeCheckPayableOffset__C;
    @XmlElement(name = "cve__TermLifeEftIssueOffset__c", nillable = true)
    protected Double cve__TermLifeEftIssueOffset__C;
    @XmlElement(name = "cve__TermLifeEftPayableOffset__c", nillable = true)
    protected Double cve__TermLifeEftPayableOffset__C;

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
     * Gets the value of the cve__AnnualSalaryMultipleToNextThousand__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AnnualSalaryMultipleToNextThousand__C() {
        return cve__AnnualSalaryMultipleToNextThousand__C;
    }

    /**
     * Sets the value of the cve__AnnualSalaryMultipleToNextThousand__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AnnualSalaryMultipleToNextThousand__C(Boolean value) {
        this.cve__AnnualSalaryMultipleToNextThousand__C = value;
    }

    /**
     * Gets the value of the cve__AttorneyFeesCap__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AttorneyFeesCap__C() {
        return cve__AttorneyFeesCap__C;
    }

    /**
     * Sets the value of the cve__AttorneyFeesCap__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AttorneyFeesCap__C(Double value) {
        this.cve__AttorneyFeesCap__C = value;
    }

    /**
     * Gets the value of the cve__CheckIssueOffsetBusinessHoursName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CheckIssueOffsetBusinessHoursName__C() {
        return cve__CheckIssueOffsetBusinessHoursName__C;
    }

    /**
     * Sets the value of the cve__CheckIssueOffsetBusinessHoursName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CheckIssueOffsetBusinessHoursName__C(String value) {
        this.cve__CheckIssueOffsetBusinessHoursName__C = value;
    }

    /**
     * Gets the value of the cve__CheckPayableOffsetBusinessHoursName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CheckPayableOffsetBusinessHoursName__C() {
        return cve__CheckPayableOffsetBusinessHoursName__C;
    }

    /**
     * Sets the value of the cve__CheckPayableOffsetBusinessHoursName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CheckPayableOffsetBusinessHoursName__C(String value) {
        this.cve__CheckPayableOffsetBusinessHoursName__C = value;
    }

    /**
     * Gets the value of the cve__DefaultLtdPaymentScheduleName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DefaultLtdPaymentScheduleName__C() {
        return cve__DefaultLtdPaymentScheduleName__C;
    }

    /**
     * Sets the value of the cve__DefaultLtdPaymentScheduleName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DefaultLtdPaymentScheduleName__C(String value) {
        this.cve__DefaultLtdPaymentScheduleName__C = value;
    }

    /**
     * Gets the value of the cve__DefaultStdPaymentScheduleName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DefaultStdPaymentScheduleName__C() {
        return cve__DefaultStdPaymentScheduleName__C;
    }

    /**
     * Sets the value of the cve__DefaultStdPaymentScheduleName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DefaultStdPaymentScheduleName__C(String value) {
        this.cve__DefaultStdPaymentScheduleName__C = value;
    }

    /**
     * Gets the value of the cve__EftIssueOffsetBusinessHoursName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EftIssueOffsetBusinessHoursName__C() {
        return cve__EftIssueOffsetBusinessHoursName__C;
    }

    /**
     * Sets the value of the cve__EftIssueOffsetBusinessHoursName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EftIssueOffsetBusinessHoursName__C(String value) {
        this.cve__EftIssueOffsetBusinessHoursName__C = value;
    }

    /**
     * Gets the value of the cve__EftPayableOffsetBusinessHoursName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EftPayableOffsetBusinessHoursName__C() {
        return cve__EftPayableOffsetBusinessHoursName__C;
    }

    /**
     * Sets the value of the cve__EftPayableOffsetBusinessHoursName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EftPayableOffsetBusinessHoursName__C(String value) {
        this.cve__EftPayableOffsetBusinessHoursName__C = value;
    }

    /**
     * Gets the value of the cve__InitialNumberOfLtdPayments__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__InitialNumberOfLtdPayments__C() {
        return cve__InitialNumberOfLtdPayments__C;
    }

    /**
     * Sets the value of the cve__InitialNumberOfLtdPayments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__InitialNumberOfLtdPayments__C(Double value) {
        this.cve__InitialNumberOfLtdPayments__C = value;
    }

    /**
     * Gets the value of the cve__InitialNumberOfStdPayments__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__InitialNumberOfStdPayments__C() {
        return cve__InitialNumberOfStdPayments__C;
    }

    /**
     * Sets the value of the cve__InitialNumberOfStdPayments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__InitialNumberOfStdPayments__C(Double value) {
        this.cve__InitialNumberOfStdPayments__C = value;
    }

    /**
     * Gets the value of the cve__IssueNeverInThePast__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__IssueNeverInThePast__C() {
        return cve__IssueNeverInThePast__C;
    }

    /**
     * Sets the value of the cve__IssueNeverInThePast__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__IssueNeverInThePast__C(Boolean value) {
        this.cve__IssueNeverInThePast__C = value;
    }

    /**
     * Gets the value of the cve__LtdCheckIssueOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LtdCheckIssueOffset__C() {
        return cve__LtdCheckIssueOffset__C;
    }

    /**
     * Sets the value of the cve__LtdCheckIssueOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LtdCheckIssueOffset__C(Double value) {
        this.cve__LtdCheckIssueOffset__C = value;
    }

    /**
     * Gets the value of the cve__LtdCheckPayableOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LtdCheckPayableOffset__C() {
        return cve__LtdCheckPayableOffset__C;
    }

    /**
     * Sets the value of the cve__LtdCheckPayableOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LtdCheckPayableOffset__C(Double value) {
        this.cve__LtdCheckPayableOffset__C = value;
    }

    /**
     * Gets the value of the cve__LtdEftIssueOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LtdEftIssueOffset__C() {
        return cve__LtdEftIssueOffset__C;
    }

    /**
     * Sets the value of the cve__LtdEftIssueOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LtdEftIssueOffset__C(Double value) {
        this.cve__LtdEftIssueOffset__C = value;
    }

    /**
     * Gets the value of the cve__LtdEftPayableOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LtdEftPayableOffset__C() {
        return cve__LtdEftPayableOffset__C;
    }

    /**
     * Sets the value of the cve__LtdEftPayableOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LtdEftPayableOffset__C(Double value) {
        this.cve__LtdEftPayableOffset__C = value;
    }

    /**
     * Gets the value of the cve__LtdPaymentPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LtdPaymentPeriod__C() {
        return cve__LtdPaymentPeriod__C;
    }

    /**
     * Sets the value of the cve__LtdPaymentPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LtdPaymentPeriod__C(String value) {
        this.cve__LtdPaymentPeriod__C = value;
    }

    /**
     * Gets the value of the cve__LtdThroughDateBaseDateField__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LtdThroughDateBaseDateField__C() {
        return cve__LtdThroughDateBaseDateField__C;
    }

    /**
     * Sets the value of the cve__LtdThroughDateBaseDateField__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LtdThroughDateBaseDateField__C(String value) {
        this.cve__LtdThroughDateBaseDateField__C = value;
    }

    /**
     * Gets the value of the cve__PayableNeverInThePast__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PayableNeverInThePast__C() {
        return cve__PayableNeverInThePast__C;
    }

    /**
     * Sets the value of the cve__PayableNeverInThePast__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PayableNeverInThePast__C(Boolean value) {
        this.cve__PayableNeverInThePast__C = value;
    }

    /**
     * Gets the value of the cve__StdCheckIssueOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__StdCheckIssueOffset__C() {
        return cve__StdCheckIssueOffset__C;
    }

    /**
     * Sets the value of the cve__StdCheckIssueOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__StdCheckIssueOffset__C(Double value) {
        this.cve__StdCheckIssueOffset__C = value;
    }

    /**
     * Gets the value of the cve__StdCheckPayableOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__StdCheckPayableOffset__C() {
        return cve__StdCheckPayableOffset__C;
    }

    /**
     * Sets the value of the cve__StdCheckPayableOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__StdCheckPayableOffset__C(Double value) {
        this.cve__StdCheckPayableOffset__C = value;
    }

    /**
     * Gets the value of the cve__StdEftIssueOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__StdEftIssueOffset__C() {
        return cve__StdEftIssueOffset__C;
    }

    /**
     * Sets the value of the cve__StdEftIssueOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__StdEftIssueOffset__C(Double value) {
        this.cve__StdEftIssueOffset__C = value;
    }

    /**
     * Gets the value of the cve__StdEftPayableOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__StdEftPayableOffset__C() {
        return cve__StdEftPayableOffset__C;
    }

    /**
     * Sets the value of the cve__StdEftPayableOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__StdEftPayableOffset__C(Double value) {
        this.cve__StdEftPayableOffset__C = value;
    }

    /**
     * Gets the value of the cve__StdPaymentPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StdPaymentPeriod__C() {
        return cve__StdPaymentPeriod__C;
    }

    /**
     * Sets the value of the cve__StdPaymentPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StdPaymentPeriod__C(String value) {
        this.cve__StdPaymentPeriod__C = value;
    }

    /**
     * Gets the value of the cve__StdThroughDateBaseDateField__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StdThroughDateBaseDateField__C() {
        return cve__StdThroughDateBaseDateField__C;
    }

    /**
     * Sets the value of the cve__StdThroughDateBaseDateField__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StdThroughDateBaseDateField__C(String value) {
        this.cve__StdThroughDateBaseDateField__C = value;
    }

    /**
     * Gets the value of the cve__TermLifeCheckIssueOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TermLifeCheckIssueOffset__C() {
        return cve__TermLifeCheckIssueOffset__C;
    }

    /**
     * Sets the value of the cve__TermLifeCheckIssueOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TermLifeCheckIssueOffset__C(Double value) {
        this.cve__TermLifeCheckIssueOffset__C = value;
    }

    /**
     * Gets the value of the cve__TermLifeCheckPayableOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TermLifeCheckPayableOffset__C() {
        return cve__TermLifeCheckPayableOffset__C;
    }

    /**
     * Sets the value of the cve__TermLifeCheckPayableOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TermLifeCheckPayableOffset__C(Double value) {
        this.cve__TermLifeCheckPayableOffset__C = value;
    }

    /**
     * Gets the value of the cve__TermLifeEftIssueOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TermLifeEftIssueOffset__C() {
        return cve__TermLifeEftIssueOffset__C;
    }

    /**
     * Sets the value of the cve__TermLifeEftIssueOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TermLifeEftIssueOffset__C(Double value) {
        this.cve__TermLifeEftIssueOffset__C = value;
    }

    /**
     * Gets the value of the cve__TermLifeEftPayableOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TermLifeEftPayableOffset__C() {
        return cve__TermLifeEftPayableOffset__C;
    }

    /**
     * Sets the value of the cve__TermLifeEftPayableOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TermLifeEftPayableOffset__C(Double value) {
        this.cve__TermLifeEftPayableOffset__C = value;
    }

}
