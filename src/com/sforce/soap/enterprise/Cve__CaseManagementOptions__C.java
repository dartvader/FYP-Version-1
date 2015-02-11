
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__CaseManagementOptions__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__CaseManagementOptions__c">
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
 *         &lt;element name="cve__CauseSectionBenefitClaimedInputFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CauseSectionBenefitClaimedRequiredFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__FastTrackCreatesDocuments__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__FastTrackInsuranceAgencyId__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__FastTrackUrl__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HideApprovedApprovalButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideDeniedApprovalButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideFastTrackButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideMDGuidelinesLookupButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideMDGuidelinesOverrideButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__JavaScriptStaticResourceName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MdGuidelinesUrl__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MedicalTabExtraSectionStaticResourceName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MedicalTabExtraSectionTitle__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PageToRouteThroughOnDenial__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__CaseManagementOptions__c", propOrder = {
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
    "cve__CauseSectionBenefitClaimedInputFields__C",
    "cve__CauseSectionBenefitClaimedRequiredFields__C",
    "cve__FastTrackCreatesDocuments__C",
    "cve__FastTrackInsuranceAgencyId__C",
    "cve__FastTrackUrl__C",
    "cve__HideApprovedApprovalButton__C",
    "cve__HideDeniedApprovalButton__C",
    "cve__HideFastTrackButton__C",
    "cve__HideMDGuidelinesLookupButton__C",
    "cve__HideMDGuidelinesOverrideButton__C",
    "cve__JavaScriptStaticResourceName__C",
    "cve__MdGuidelinesUrl__C",
    "cve__MedicalTabExtraSectionStaticResourceName__C",
    "cve__MedicalTabExtraSectionTitle__C",
    "cve__PageToRouteThroughOnDenial__C"
})
public class Cve__CaseManagementOptions__C
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
    @XmlElement(name = "cve__CauseSectionBenefitClaimedInputFields__c", nillable = true)
    protected String cve__CauseSectionBenefitClaimedInputFields__C;
    @XmlElement(name = "cve__CauseSectionBenefitClaimedRequiredFields__c", nillable = true)
    protected String cve__CauseSectionBenefitClaimedRequiredFields__C;
    @XmlElement(name = "cve__FastTrackCreatesDocuments__c", nillable = true)
    protected Boolean cve__FastTrackCreatesDocuments__C;
    @XmlElement(name = "cve__FastTrackInsuranceAgencyId__c", nillable = true)
    protected String cve__FastTrackInsuranceAgencyId__C;
    @XmlElement(name = "cve__FastTrackUrl__c", nillable = true)
    protected String cve__FastTrackUrl__C;
    @XmlElement(name = "cve__HideApprovedApprovalButton__c", nillable = true)
    protected Boolean cve__HideApprovedApprovalButton__C;
    @XmlElement(name = "cve__HideDeniedApprovalButton__c", nillable = true)
    protected Boolean cve__HideDeniedApprovalButton__C;
    @XmlElement(name = "cve__HideFastTrackButton__c", nillable = true)
    protected Boolean cve__HideFastTrackButton__C;
    @XmlElement(name = "cve__HideMDGuidelinesLookupButton__c", nillable = true)
    protected Boolean cve__HideMDGuidelinesLookupButton__C;
    @XmlElement(name = "cve__HideMDGuidelinesOverrideButton__c", nillable = true)
    protected Boolean cve__HideMDGuidelinesOverrideButton__C;
    @XmlElement(name = "cve__JavaScriptStaticResourceName__c", nillable = true)
    protected String cve__JavaScriptStaticResourceName__C;
    @XmlElement(name = "cve__MdGuidelinesUrl__c", nillable = true)
    protected String cve__MdGuidelinesUrl__C;
    @XmlElement(name = "cve__MedicalTabExtraSectionStaticResourceName__c", nillable = true)
    protected String cve__MedicalTabExtraSectionStaticResourceName__C;
    @XmlElement(name = "cve__MedicalTabExtraSectionTitle__c", nillable = true)
    protected String cve__MedicalTabExtraSectionTitle__C;
    @XmlElement(name = "cve__PageToRouteThroughOnDenial__c", nillable = true)
    protected String cve__PageToRouteThroughOnDenial__C;

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
     * Gets the value of the cve__CauseSectionBenefitClaimedInputFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CauseSectionBenefitClaimedInputFields__C() {
        return cve__CauseSectionBenefitClaimedInputFields__C;
    }

    /**
     * Sets the value of the cve__CauseSectionBenefitClaimedInputFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CauseSectionBenefitClaimedInputFields__C(String value) {
        this.cve__CauseSectionBenefitClaimedInputFields__C = value;
    }

    /**
     * Gets the value of the cve__CauseSectionBenefitClaimedRequiredFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CauseSectionBenefitClaimedRequiredFields__C() {
        return cve__CauseSectionBenefitClaimedRequiredFields__C;
    }

    /**
     * Sets the value of the cve__CauseSectionBenefitClaimedRequiredFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CauseSectionBenefitClaimedRequiredFields__C(String value) {
        this.cve__CauseSectionBenefitClaimedRequiredFields__C = value;
    }

    /**
     * Gets the value of the cve__FastTrackCreatesDocuments__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__FastTrackCreatesDocuments__C() {
        return cve__FastTrackCreatesDocuments__C;
    }

    /**
     * Sets the value of the cve__FastTrackCreatesDocuments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__FastTrackCreatesDocuments__C(Boolean value) {
        this.cve__FastTrackCreatesDocuments__C = value;
    }

    /**
     * Gets the value of the cve__FastTrackInsuranceAgencyId__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__FastTrackInsuranceAgencyId__C() {
        return cve__FastTrackInsuranceAgencyId__C;
    }

    /**
     * Sets the value of the cve__FastTrackInsuranceAgencyId__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__FastTrackInsuranceAgencyId__C(String value) {
        this.cve__FastTrackInsuranceAgencyId__C = value;
    }

    /**
     * Gets the value of the cve__FastTrackUrl__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__FastTrackUrl__C() {
        return cve__FastTrackUrl__C;
    }

    /**
     * Sets the value of the cve__FastTrackUrl__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__FastTrackUrl__C(String value) {
        this.cve__FastTrackUrl__C = value;
    }

    /**
     * Gets the value of the cve__HideApprovedApprovalButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideApprovedApprovalButton__C() {
        return cve__HideApprovedApprovalButton__C;
    }

    /**
     * Sets the value of the cve__HideApprovedApprovalButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideApprovedApprovalButton__C(Boolean value) {
        this.cve__HideApprovedApprovalButton__C = value;
    }

    /**
     * Gets the value of the cve__HideDeniedApprovalButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideDeniedApprovalButton__C() {
        return cve__HideDeniedApprovalButton__C;
    }

    /**
     * Sets the value of the cve__HideDeniedApprovalButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideDeniedApprovalButton__C(Boolean value) {
        this.cve__HideDeniedApprovalButton__C = value;
    }

    /**
     * Gets the value of the cve__HideFastTrackButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideFastTrackButton__C() {
        return cve__HideFastTrackButton__C;
    }

    /**
     * Sets the value of the cve__HideFastTrackButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideFastTrackButton__C(Boolean value) {
        this.cve__HideFastTrackButton__C = value;
    }

    /**
     * Gets the value of the cve__HideMDGuidelinesLookupButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideMDGuidelinesLookupButton__C() {
        return cve__HideMDGuidelinesLookupButton__C;
    }

    /**
     * Sets the value of the cve__HideMDGuidelinesLookupButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideMDGuidelinesLookupButton__C(Boolean value) {
        this.cve__HideMDGuidelinesLookupButton__C = value;
    }

    /**
     * Gets the value of the cve__HideMDGuidelinesOverrideButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideMDGuidelinesOverrideButton__C() {
        return cve__HideMDGuidelinesOverrideButton__C;
    }

    /**
     * Sets the value of the cve__HideMDGuidelinesOverrideButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideMDGuidelinesOverrideButton__C(Boolean value) {
        this.cve__HideMDGuidelinesOverrideButton__C = value;
    }

    /**
     * Gets the value of the cve__JavaScriptStaticResourceName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__JavaScriptStaticResourceName__C() {
        return cve__JavaScriptStaticResourceName__C;
    }

    /**
     * Sets the value of the cve__JavaScriptStaticResourceName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__JavaScriptStaticResourceName__C(String value) {
        this.cve__JavaScriptStaticResourceName__C = value;
    }

    /**
     * Gets the value of the cve__MdGuidelinesUrl__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MdGuidelinesUrl__C() {
        return cve__MdGuidelinesUrl__C;
    }

    /**
     * Sets the value of the cve__MdGuidelinesUrl__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MdGuidelinesUrl__C(String value) {
        this.cve__MdGuidelinesUrl__C = value;
    }

    /**
     * Gets the value of the cve__MedicalTabExtraSectionStaticResourceName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MedicalTabExtraSectionStaticResourceName__C() {
        return cve__MedicalTabExtraSectionStaticResourceName__C;
    }

    /**
     * Sets the value of the cve__MedicalTabExtraSectionStaticResourceName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MedicalTabExtraSectionStaticResourceName__C(String value) {
        this.cve__MedicalTabExtraSectionStaticResourceName__C = value;
    }

    /**
     * Gets the value of the cve__MedicalTabExtraSectionTitle__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MedicalTabExtraSectionTitle__C() {
        return cve__MedicalTabExtraSectionTitle__C;
    }

    /**
     * Sets the value of the cve__MedicalTabExtraSectionTitle__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MedicalTabExtraSectionTitle__C(String value) {
        this.cve__MedicalTabExtraSectionTitle__C = value;
    }

    /**
     * Gets the value of the cve__PageToRouteThroughOnDenial__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PageToRouteThroughOnDenial__C() {
        return cve__PageToRouteThroughOnDenial__C;
    }

    /**
     * Sets the value of the cve__PageToRouteThroughOnDenial__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PageToRouteThroughOnDenial__C(String value) {
        this.cve__PageToRouteThroughOnDenial__C = value;
    }

}
