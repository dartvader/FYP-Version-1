
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__ClaimIntakeOptions__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__ClaimIntakeOptions__c">
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
 *         &lt;element name="cve__BenefitListFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitMustBeSelected__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__BenefitTypes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantCreateEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantOrganizationFilterEditable__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantSearchEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DateOfDisabilityDerived__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__IdentifyingCauses__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IdentifyingClaimantIsNotPolicyholder__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IdentifyingClaimantIsPolicyholder__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IdentifyingInvalidCauseBenefitPairs__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IdentifyingPageEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__IdentifyingValidCombinedSelections__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MedicalCodeSearchEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__MedicalCodeSearchRecordTypes__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__NewOrganizationMaximumNameLength__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NewPersonMaximumNameLength__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__NotPolicyholderClaimingOptionLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OrganizationFilterEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__OrganizationFilterMaximumResults__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OrganizationListFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OrganizationSearchNameFieldOnly__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PersonListFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PersonSearchNameFieldOnly__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PersonSoqlSearchFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PhysicianPageEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicyMustBeSelected__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicyRelationshipCreationEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicySearchEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderClaimRelationshipType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderClaimingOptionLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderClaimingSectionLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderCreateEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderIsEmployee__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderNotEmployeeMessage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PolicyholderSearchEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ProductMustBeSelected__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ProductSearchEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PurchasedOptionFilterEnabled__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowDateReceived__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowLifePolicyFaceAmount__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SocialSecurityNumberErrorMessage__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SocialSecurityNumberFormat__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SuppressSameClaimantInSummary__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__UsePersonAccounts__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__ClaimIntakeOptions__c", propOrder = {
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
    "cve__BenefitListFields__C",
    "cve__BenefitMustBeSelected__C",
    "cve__BenefitTypes__C",
    "cve__ClaimantCreateEnabled__C",
    "cve__ClaimantLabel__C",
    "cve__ClaimantOrganizationFilterEditable__C",
    "cve__ClaimantSearchEnabled__C",
    "cve__DateOfDisabilityDerived__C",
    "cve__IdentifyingCauses__C",
    "cve__IdentifyingClaimantIsNotPolicyholder__C",
    "cve__IdentifyingClaimantIsPolicyholder__C",
    "cve__IdentifyingInvalidCauseBenefitPairs__C",
    "cve__IdentifyingPageEnabled__C",
    "cve__IdentifyingValidCombinedSelections__C",
    "cve__MedicalCodeSearchEnabled__C",
    "cve__MedicalCodeSearchRecordTypes__C",
    "cve__NewOrganizationMaximumNameLength__C",
    "cve__NewPersonMaximumNameLength__C",
    "cve__NotPolicyholderClaimingOptionLabel__C",
    "cve__OrganizationFilterEnabled__C",
    "cve__OrganizationFilterMaximumResults__C",
    "cve__OrganizationListFields__C",
    "cve__OrganizationSearchNameFieldOnly__C",
    "cve__PersonListFields__C",
    "cve__PersonSearchNameFieldOnly__C",
    "cve__PersonSoqlSearchFields__C",
    "cve__PhysicianPageEnabled__C",
    "cve__PolicyMustBeSelected__C",
    "cve__PolicyRelationshipCreationEnabled__C",
    "cve__PolicySearchEnabled__C",
    "cve__PolicyholderClaimRelationshipType__C",
    "cve__PolicyholderClaimingOptionLabel__C",
    "cve__PolicyholderClaimingSectionLabel__C",
    "cve__PolicyholderCreateEnabled__C",
    "cve__PolicyholderIsEmployee__C",
    "cve__PolicyholderLabel__C",
    "cve__PolicyholderNotEmployeeMessage__C",
    "cve__PolicyholderSearchEnabled__C",
    "cve__ProductMustBeSelected__C",
    "cve__ProductSearchEnabled__C",
    "cve__PurchasedOptionFilterEnabled__C",
    "cve__ShowDateReceived__C",
    "cve__ShowLifePolicyFaceAmount__C",
    "cve__SocialSecurityNumberErrorMessage__C",
    "cve__SocialSecurityNumberFormat__C",
    "cve__SuppressSameClaimantInSummary__C",
    "cve__UsePersonAccounts__C"
})
public class Cve__ClaimIntakeOptions__C
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
    @XmlElement(name = "cve__BenefitListFields__c", nillable = true)
    protected String cve__BenefitListFields__C;
    @XmlElement(name = "cve__BenefitMustBeSelected__c", nillable = true)
    protected Boolean cve__BenefitMustBeSelected__C;
    @XmlElement(name = "cve__BenefitTypes__c", nillable = true)
    protected String cve__BenefitTypes__C;
    @XmlElement(name = "cve__ClaimantCreateEnabled__c", nillable = true)
    protected Boolean cve__ClaimantCreateEnabled__C;
    @XmlElement(name = "cve__ClaimantLabel__c", nillable = true)
    protected String cve__ClaimantLabel__C;
    @XmlElement(name = "cve__ClaimantOrganizationFilterEditable__c", nillable = true)
    protected Boolean cve__ClaimantOrganizationFilterEditable__C;
    @XmlElement(name = "cve__ClaimantSearchEnabled__c", nillable = true)
    protected Boolean cve__ClaimantSearchEnabled__C;
    @XmlElement(name = "cve__DateOfDisabilityDerived__c", nillable = true)
    protected Boolean cve__DateOfDisabilityDerived__C;
    @XmlElement(name = "cve__IdentifyingCauses__c", nillable = true)
    protected String cve__IdentifyingCauses__C;
    @XmlElement(name = "cve__IdentifyingClaimantIsNotPolicyholder__c", nillable = true)
    protected String cve__IdentifyingClaimantIsNotPolicyholder__C;
    @XmlElement(name = "cve__IdentifyingClaimantIsPolicyholder__c", nillable = true)
    protected String cve__IdentifyingClaimantIsPolicyholder__C;
    @XmlElement(name = "cve__IdentifyingInvalidCauseBenefitPairs__c", nillable = true)
    protected String cve__IdentifyingInvalidCauseBenefitPairs__C;
    @XmlElement(name = "cve__IdentifyingPageEnabled__c", nillable = true)
    protected Boolean cve__IdentifyingPageEnabled__C;
    @XmlElement(name = "cve__IdentifyingValidCombinedSelections__c", nillable = true)
    protected String cve__IdentifyingValidCombinedSelections__C;
    @XmlElement(name = "cve__MedicalCodeSearchEnabled__c", nillable = true)
    protected Boolean cve__MedicalCodeSearchEnabled__C;
    @XmlElement(name = "cve__MedicalCodeSearchRecordTypes__c", nillable = true)
    protected String cve__MedicalCodeSearchRecordTypes__C;
    @XmlElement(name = "cve__NewOrganizationMaximumNameLength__c", nillable = true)
    protected Double cve__NewOrganizationMaximumNameLength__C;
    @XmlElement(name = "cve__NewPersonMaximumNameLength__c", nillable = true)
    protected Double cve__NewPersonMaximumNameLength__C;
    @XmlElement(name = "cve__NotPolicyholderClaimingOptionLabel__c", nillable = true)
    protected String cve__NotPolicyholderClaimingOptionLabel__C;
    @XmlElement(name = "cve__OrganizationFilterEnabled__c", nillable = true)
    protected Boolean cve__OrganizationFilterEnabled__C;
    @XmlElement(name = "cve__OrganizationFilterMaximumResults__c", nillable = true)
    protected Double cve__OrganizationFilterMaximumResults__C;
    @XmlElement(name = "cve__OrganizationListFields__c", nillable = true)
    protected String cve__OrganizationListFields__C;
    @XmlElement(name = "cve__OrganizationSearchNameFieldOnly__c", nillable = true)
    protected Boolean cve__OrganizationSearchNameFieldOnly__C;
    @XmlElement(name = "cve__PersonListFields__c", nillable = true)
    protected String cve__PersonListFields__C;
    @XmlElement(name = "cve__PersonSearchNameFieldOnly__c", nillable = true)
    protected Boolean cve__PersonSearchNameFieldOnly__C;
    @XmlElement(name = "cve__PersonSoqlSearchFields__c", nillable = true)
    protected String cve__PersonSoqlSearchFields__C;
    @XmlElement(name = "cve__PhysicianPageEnabled__c", nillable = true)
    protected Boolean cve__PhysicianPageEnabled__C;
    @XmlElement(name = "cve__PolicyMustBeSelected__c", nillable = true)
    protected Boolean cve__PolicyMustBeSelected__C;
    @XmlElement(name = "cve__PolicyRelationshipCreationEnabled__c", nillable = true)
    protected Boolean cve__PolicyRelationshipCreationEnabled__C;
    @XmlElement(name = "cve__PolicySearchEnabled__c", nillable = true)
    protected Boolean cve__PolicySearchEnabled__C;
    @XmlElement(name = "cve__PolicyholderClaimRelationshipType__c", nillable = true)
    protected String cve__PolicyholderClaimRelationshipType__C;
    @XmlElement(name = "cve__PolicyholderClaimingOptionLabel__c", nillable = true)
    protected String cve__PolicyholderClaimingOptionLabel__C;
    @XmlElement(name = "cve__PolicyholderClaimingSectionLabel__c", nillable = true)
    protected String cve__PolicyholderClaimingSectionLabel__C;
    @XmlElement(name = "cve__PolicyholderCreateEnabled__c", nillable = true)
    protected Boolean cve__PolicyholderCreateEnabled__C;
    @XmlElement(name = "cve__PolicyholderIsEmployee__c", nillable = true)
    protected Boolean cve__PolicyholderIsEmployee__C;
    @XmlElement(name = "cve__PolicyholderLabel__c", nillable = true)
    protected String cve__PolicyholderLabel__C;
    @XmlElement(name = "cve__PolicyholderNotEmployeeMessage__c", nillable = true)
    protected String cve__PolicyholderNotEmployeeMessage__C;
    @XmlElement(name = "cve__PolicyholderSearchEnabled__c", nillable = true)
    protected Boolean cve__PolicyholderSearchEnabled__C;
    @XmlElement(name = "cve__ProductMustBeSelected__c", nillable = true)
    protected Boolean cve__ProductMustBeSelected__C;
    @XmlElement(name = "cve__ProductSearchEnabled__c", nillable = true)
    protected Boolean cve__ProductSearchEnabled__C;
    @XmlElement(name = "cve__PurchasedOptionFilterEnabled__c", nillable = true)
    protected Boolean cve__PurchasedOptionFilterEnabled__C;
    @XmlElement(name = "cve__ShowDateReceived__c", nillable = true)
    protected Boolean cve__ShowDateReceived__C;
    @XmlElement(name = "cve__ShowLifePolicyFaceAmount__c", nillable = true)
    protected Boolean cve__ShowLifePolicyFaceAmount__C;
    @XmlElement(name = "cve__SocialSecurityNumberErrorMessage__c", nillable = true)
    protected String cve__SocialSecurityNumberErrorMessage__C;
    @XmlElement(name = "cve__SocialSecurityNumberFormat__c", nillable = true)
    protected String cve__SocialSecurityNumberFormat__C;
    @XmlElement(name = "cve__SuppressSameClaimantInSummary__c", nillable = true)
    protected Boolean cve__SuppressSameClaimantInSummary__C;
    @XmlElement(name = "cve__UsePersonAccounts__c", nillable = true)
    protected Boolean cve__UsePersonAccounts__C;

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
     * Gets the value of the cve__BenefitListFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitListFields__C() {
        return cve__BenefitListFields__C;
    }

    /**
     * Sets the value of the cve__BenefitListFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitListFields__C(String value) {
        this.cve__BenefitListFields__C = value;
    }

    /**
     * Gets the value of the cve__BenefitMustBeSelected__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__BenefitMustBeSelected__C() {
        return cve__BenefitMustBeSelected__C;
    }

    /**
     * Sets the value of the cve__BenefitMustBeSelected__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__BenefitMustBeSelected__C(Boolean value) {
        this.cve__BenefitMustBeSelected__C = value;
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
     * Gets the value of the cve__ClaimantCreateEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ClaimantCreateEnabled__C() {
        return cve__ClaimantCreateEnabled__C;
    }

    /**
     * Sets the value of the cve__ClaimantCreateEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ClaimantCreateEnabled__C(Boolean value) {
        this.cve__ClaimantCreateEnabled__C = value;
    }

    /**
     * Gets the value of the cve__ClaimantLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ClaimantLabel__C() {
        return cve__ClaimantLabel__C;
    }

    /**
     * Sets the value of the cve__ClaimantLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ClaimantLabel__C(String value) {
        this.cve__ClaimantLabel__C = value;
    }

    /**
     * Gets the value of the cve__ClaimantOrganizationFilterEditable__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ClaimantOrganizationFilterEditable__C() {
        return cve__ClaimantOrganizationFilterEditable__C;
    }

    /**
     * Sets the value of the cve__ClaimantOrganizationFilterEditable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ClaimantOrganizationFilterEditable__C(Boolean value) {
        this.cve__ClaimantOrganizationFilterEditable__C = value;
    }

    /**
     * Gets the value of the cve__ClaimantSearchEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ClaimantSearchEnabled__C() {
        return cve__ClaimantSearchEnabled__C;
    }

    /**
     * Sets the value of the cve__ClaimantSearchEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ClaimantSearchEnabled__C(Boolean value) {
        this.cve__ClaimantSearchEnabled__C = value;
    }

    /**
     * Gets the value of the cve__DateOfDisabilityDerived__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DateOfDisabilityDerived__C() {
        return cve__DateOfDisabilityDerived__C;
    }

    /**
     * Sets the value of the cve__DateOfDisabilityDerived__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DateOfDisabilityDerived__C(Boolean value) {
        this.cve__DateOfDisabilityDerived__C = value;
    }

    /**
     * Gets the value of the cve__IdentifyingCauses__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IdentifyingCauses__C() {
        return cve__IdentifyingCauses__C;
    }

    /**
     * Sets the value of the cve__IdentifyingCauses__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IdentifyingCauses__C(String value) {
        this.cve__IdentifyingCauses__C = value;
    }

    /**
     * Gets the value of the cve__IdentifyingClaimantIsNotPolicyholder__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IdentifyingClaimantIsNotPolicyholder__C() {
        return cve__IdentifyingClaimantIsNotPolicyholder__C;
    }

    /**
     * Sets the value of the cve__IdentifyingClaimantIsNotPolicyholder__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IdentifyingClaimantIsNotPolicyholder__C(String value) {
        this.cve__IdentifyingClaimantIsNotPolicyholder__C = value;
    }

    /**
     * Gets the value of the cve__IdentifyingClaimantIsPolicyholder__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IdentifyingClaimantIsPolicyholder__C() {
        return cve__IdentifyingClaimantIsPolicyholder__C;
    }

    /**
     * Sets the value of the cve__IdentifyingClaimantIsPolicyholder__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IdentifyingClaimantIsPolicyholder__C(String value) {
        this.cve__IdentifyingClaimantIsPolicyholder__C = value;
    }

    /**
     * Gets the value of the cve__IdentifyingInvalidCauseBenefitPairs__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IdentifyingInvalidCauseBenefitPairs__C() {
        return cve__IdentifyingInvalidCauseBenefitPairs__C;
    }

    /**
     * Sets the value of the cve__IdentifyingInvalidCauseBenefitPairs__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IdentifyingInvalidCauseBenefitPairs__C(String value) {
        this.cve__IdentifyingInvalidCauseBenefitPairs__C = value;
    }

    /**
     * Gets the value of the cve__IdentifyingPageEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__IdentifyingPageEnabled__C() {
        return cve__IdentifyingPageEnabled__C;
    }

    /**
     * Sets the value of the cve__IdentifyingPageEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__IdentifyingPageEnabled__C(Boolean value) {
        this.cve__IdentifyingPageEnabled__C = value;
    }

    /**
     * Gets the value of the cve__IdentifyingValidCombinedSelections__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IdentifyingValidCombinedSelections__C() {
        return cve__IdentifyingValidCombinedSelections__C;
    }

    /**
     * Sets the value of the cve__IdentifyingValidCombinedSelections__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IdentifyingValidCombinedSelections__C(String value) {
        this.cve__IdentifyingValidCombinedSelections__C = value;
    }

    /**
     * Gets the value of the cve__MedicalCodeSearchEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__MedicalCodeSearchEnabled__C() {
        return cve__MedicalCodeSearchEnabled__C;
    }

    /**
     * Sets the value of the cve__MedicalCodeSearchEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__MedicalCodeSearchEnabled__C(Boolean value) {
        this.cve__MedicalCodeSearchEnabled__C = value;
    }

    /**
     * Gets the value of the cve__MedicalCodeSearchRecordTypes__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MedicalCodeSearchRecordTypes__C() {
        return cve__MedicalCodeSearchRecordTypes__C;
    }

    /**
     * Sets the value of the cve__MedicalCodeSearchRecordTypes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MedicalCodeSearchRecordTypes__C(String value) {
        this.cve__MedicalCodeSearchRecordTypes__C = value;
    }

    /**
     * Gets the value of the cve__NewOrganizationMaximumNameLength__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NewOrganizationMaximumNameLength__C() {
        return cve__NewOrganizationMaximumNameLength__C;
    }

    /**
     * Sets the value of the cve__NewOrganizationMaximumNameLength__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NewOrganizationMaximumNameLength__C(Double value) {
        this.cve__NewOrganizationMaximumNameLength__C = value;
    }

    /**
     * Gets the value of the cve__NewPersonMaximumNameLength__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__NewPersonMaximumNameLength__C() {
        return cve__NewPersonMaximumNameLength__C;
    }

    /**
     * Sets the value of the cve__NewPersonMaximumNameLength__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__NewPersonMaximumNameLength__C(Double value) {
        this.cve__NewPersonMaximumNameLength__C = value;
    }

    /**
     * Gets the value of the cve__NotPolicyholderClaimingOptionLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__NotPolicyholderClaimingOptionLabel__C() {
        return cve__NotPolicyholderClaimingOptionLabel__C;
    }

    /**
     * Sets the value of the cve__NotPolicyholderClaimingOptionLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__NotPolicyholderClaimingOptionLabel__C(String value) {
        this.cve__NotPolicyholderClaimingOptionLabel__C = value;
    }

    /**
     * Gets the value of the cve__OrganizationFilterEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OrganizationFilterEnabled__C() {
        return cve__OrganizationFilterEnabled__C;
    }

    /**
     * Sets the value of the cve__OrganizationFilterEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OrganizationFilterEnabled__C(Boolean value) {
        this.cve__OrganizationFilterEnabled__C = value;
    }

    /**
     * Gets the value of the cve__OrganizationFilterMaximumResults__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OrganizationFilterMaximumResults__C() {
        return cve__OrganizationFilterMaximumResults__C;
    }

    /**
     * Sets the value of the cve__OrganizationFilterMaximumResults__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OrganizationFilterMaximumResults__C(Double value) {
        this.cve__OrganizationFilterMaximumResults__C = value;
    }

    /**
     * Gets the value of the cve__OrganizationListFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__OrganizationListFields__C() {
        return cve__OrganizationListFields__C;
    }

    /**
     * Sets the value of the cve__OrganizationListFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__OrganizationListFields__C(String value) {
        this.cve__OrganizationListFields__C = value;
    }

    /**
     * Gets the value of the cve__OrganizationSearchNameFieldOnly__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OrganizationSearchNameFieldOnly__C() {
        return cve__OrganizationSearchNameFieldOnly__C;
    }

    /**
     * Sets the value of the cve__OrganizationSearchNameFieldOnly__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OrganizationSearchNameFieldOnly__C(Boolean value) {
        this.cve__OrganizationSearchNameFieldOnly__C = value;
    }

    /**
     * Gets the value of the cve__PersonListFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PersonListFields__C() {
        return cve__PersonListFields__C;
    }

    /**
     * Sets the value of the cve__PersonListFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PersonListFields__C(String value) {
        this.cve__PersonListFields__C = value;
    }

    /**
     * Gets the value of the cve__PersonSearchNameFieldOnly__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PersonSearchNameFieldOnly__C() {
        return cve__PersonSearchNameFieldOnly__C;
    }

    /**
     * Sets the value of the cve__PersonSearchNameFieldOnly__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PersonSearchNameFieldOnly__C(Boolean value) {
        this.cve__PersonSearchNameFieldOnly__C = value;
    }

    /**
     * Gets the value of the cve__PersonSoqlSearchFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PersonSoqlSearchFields__C() {
        return cve__PersonSoqlSearchFields__C;
    }

    /**
     * Sets the value of the cve__PersonSoqlSearchFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PersonSoqlSearchFields__C(String value) {
        this.cve__PersonSoqlSearchFields__C = value;
    }

    /**
     * Gets the value of the cve__PhysicianPageEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PhysicianPageEnabled__C() {
        return cve__PhysicianPageEnabled__C;
    }

    /**
     * Sets the value of the cve__PhysicianPageEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PhysicianPageEnabled__C(Boolean value) {
        this.cve__PhysicianPageEnabled__C = value;
    }

    /**
     * Gets the value of the cve__PolicyMustBeSelected__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PolicyMustBeSelected__C() {
        return cve__PolicyMustBeSelected__C;
    }

    /**
     * Sets the value of the cve__PolicyMustBeSelected__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PolicyMustBeSelected__C(Boolean value) {
        this.cve__PolicyMustBeSelected__C = value;
    }

    /**
     * Gets the value of the cve__PolicyRelationshipCreationEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PolicyRelationshipCreationEnabled__C() {
        return cve__PolicyRelationshipCreationEnabled__C;
    }

    /**
     * Sets the value of the cve__PolicyRelationshipCreationEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PolicyRelationshipCreationEnabled__C(Boolean value) {
        this.cve__PolicyRelationshipCreationEnabled__C = value;
    }

    /**
     * Gets the value of the cve__PolicySearchEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PolicySearchEnabled__C() {
        return cve__PolicySearchEnabled__C;
    }

    /**
     * Sets the value of the cve__PolicySearchEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PolicySearchEnabled__C(Boolean value) {
        this.cve__PolicySearchEnabled__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderClaimRelationshipType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyholderClaimRelationshipType__C() {
        return cve__PolicyholderClaimRelationshipType__C;
    }

    /**
     * Sets the value of the cve__PolicyholderClaimRelationshipType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyholderClaimRelationshipType__C(String value) {
        this.cve__PolicyholderClaimRelationshipType__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderClaimingOptionLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyholderClaimingOptionLabel__C() {
        return cve__PolicyholderClaimingOptionLabel__C;
    }

    /**
     * Sets the value of the cve__PolicyholderClaimingOptionLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyholderClaimingOptionLabel__C(String value) {
        this.cve__PolicyholderClaimingOptionLabel__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderClaimingSectionLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyholderClaimingSectionLabel__C() {
        return cve__PolicyholderClaimingSectionLabel__C;
    }

    /**
     * Sets the value of the cve__PolicyholderClaimingSectionLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyholderClaimingSectionLabel__C(String value) {
        this.cve__PolicyholderClaimingSectionLabel__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderCreateEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PolicyholderCreateEnabled__C() {
        return cve__PolicyholderCreateEnabled__C;
    }

    /**
     * Sets the value of the cve__PolicyholderCreateEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PolicyholderCreateEnabled__C(Boolean value) {
        this.cve__PolicyholderCreateEnabled__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderIsEmployee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PolicyholderIsEmployee__C() {
        return cve__PolicyholderIsEmployee__C;
    }

    /**
     * Sets the value of the cve__PolicyholderIsEmployee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PolicyholderIsEmployee__C(Boolean value) {
        this.cve__PolicyholderIsEmployee__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyholderLabel__C() {
        return cve__PolicyholderLabel__C;
    }

    /**
     * Sets the value of the cve__PolicyholderLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyholderLabel__C(String value) {
        this.cve__PolicyholderLabel__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderNotEmployeeMessage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PolicyholderNotEmployeeMessage__C() {
        return cve__PolicyholderNotEmployeeMessage__C;
    }

    /**
     * Sets the value of the cve__PolicyholderNotEmployeeMessage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PolicyholderNotEmployeeMessage__C(String value) {
        this.cve__PolicyholderNotEmployeeMessage__C = value;
    }

    /**
     * Gets the value of the cve__PolicyholderSearchEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PolicyholderSearchEnabled__C() {
        return cve__PolicyholderSearchEnabled__C;
    }

    /**
     * Sets the value of the cve__PolicyholderSearchEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PolicyholderSearchEnabled__C(Boolean value) {
        this.cve__PolicyholderSearchEnabled__C = value;
    }

    /**
     * Gets the value of the cve__ProductMustBeSelected__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ProductMustBeSelected__C() {
        return cve__ProductMustBeSelected__C;
    }

    /**
     * Sets the value of the cve__ProductMustBeSelected__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ProductMustBeSelected__C(Boolean value) {
        this.cve__ProductMustBeSelected__C = value;
    }

    /**
     * Gets the value of the cve__ProductSearchEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ProductSearchEnabled__C() {
        return cve__ProductSearchEnabled__C;
    }

    /**
     * Sets the value of the cve__ProductSearchEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ProductSearchEnabled__C(Boolean value) {
        this.cve__ProductSearchEnabled__C = value;
    }

    /**
     * Gets the value of the cve__PurchasedOptionFilterEnabled__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PurchasedOptionFilterEnabled__C() {
        return cve__PurchasedOptionFilterEnabled__C;
    }

    /**
     * Sets the value of the cve__PurchasedOptionFilterEnabled__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PurchasedOptionFilterEnabled__C(Boolean value) {
        this.cve__PurchasedOptionFilterEnabled__C = value;
    }

    /**
     * Gets the value of the cve__ShowDateReceived__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowDateReceived__C() {
        return cve__ShowDateReceived__C;
    }

    /**
     * Sets the value of the cve__ShowDateReceived__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowDateReceived__C(Boolean value) {
        this.cve__ShowDateReceived__C = value;
    }

    /**
     * Gets the value of the cve__ShowLifePolicyFaceAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowLifePolicyFaceAmount__C() {
        return cve__ShowLifePolicyFaceAmount__C;
    }

    /**
     * Sets the value of the cve__ShowLifePolicyFaceAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowLifePolicyFaceAmount__C(Boolean value) {
        this.cve__ShowLifePolicyFaceAmount__C = value;
    }

    /**
     * Gets the value of the cve__SocialSecurityNumberErrorMessage__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SocialSecurityNumberErrorMessage__C() {
        return cve__SocialSecurityNumberErrorMessage__C;
    }

    /**
     * Sets the value of the cve__SocialSecurityNumberErrorMessage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SocialSecurityNumberErrorMessage__C(String value) {
        this.cve__SocialSecurityNumberErrorMessage__C = value;
    }

    /**
     * Gets the value of the cve__SocialSecurityNumberFormat__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SocialSecurityNumberFormat__C() {
        return cve__SocialSecurityNumberFormat__C;
    }

    /**
     * Sets the value of the cve__SocialSecurityNumberFormat__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SocialSecurityNumberFormat__C(String value) {
        this.cve__SocialSecurityNumberFormat__C = value;
    }

    /**
     * Gets the value of the cve__SuppressSameClaimantInSummary__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SuppressSameClaimantInSummary__C() {
        return cve__SuppressSameClaimantInSummary__C;
    }

    /**
     * Sets the value of the cve__SuppressSameClaimantInSummary__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SuppressSameClaimantInSummary__C(Boolean value) {
        this.cve__SuppressSameClaimantInSummary__C = value;
    }

    /**
     * Gets the value of the cve__UsePersonAccounts__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__UsePersonAccounts__C() {
        return cve__UsePersonAccounts__C;
    }

    /**
     * Sets the value of the cve__UsePersonAccounts__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__UsePersonAccounts__C(Boolean value) {
        this.cve__UsePersonAccounts__C = value;
    }

}
