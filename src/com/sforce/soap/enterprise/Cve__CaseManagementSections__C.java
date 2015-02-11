
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__CaseManagementSections__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__CaseManagementSections__c">
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
 *         &lt;element name="cve__ActionPlanLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AdjustmentsAndOffsetsLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ChildDocumentFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CorrespondenceLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EligibilityEditable__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__EligibilityLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EligibilityLogicDoesUpdate__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__FinancialLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HideChildAttachments__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideChildDocuments__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideChildNotes__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__InvestigativeLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LegalLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MedicalLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__NoteCategories__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OccupationalLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OpenTaskFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OtherLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PhoneNoteFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__QuestionsAndAnswersLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ReferenceLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RehabilitationLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ReturnToWorkFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ReturnToWorkLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SectionOrder__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ShowActionPlan__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowAdjustmentsAndOffsets__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowBenefitClaimedTasks__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowClaimTasks__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowCorrespondence__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowEligibilityCheckButton__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowEligibility__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowFinancial__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowInvestigative__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowLegal__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowLimitationsNotes__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowMedical__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowOccupational__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowOther__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowPredictiveModel__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowQuestionsAndAnswers__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowReference__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowRehabilitation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowRequirementsNotes__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowRestrictionsNotes__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowReturnToWork__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ShowSynopsis__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SynopsisLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TaskHistoryFields__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__CaseManagementSections__c", propOrder = {
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
    "cve__ActionPlanLabel__C",
    "cve__AdjustmentFields__C",
    "cve__AdjustmentsAndOffsetsLabel__C",
    "cve__ChildDocumentFields__C",
    "cve__CorrespondenceLabel__C",
    "cve__EligibilityEditable__C",
    "cve__EligibilityLabel__C",
    "cve__EligibilityLogicDoesUpdate__C",
    "cve__FinancialLabel__C",
    "cve__HideChildAttachments__C",
    "cve__HideChildDocuments__C",
    "cve__HideChildNotes__C",
    "cve__InvestigativeLabel__C",
    "cve__LegalLabel__C",
    "cve__MedicalLabel__C",
    "cve__NoteCategories__C",
    "cve__OccupationalLabel__C",
    "cve__OpenTaskFields__C",
    "cve__OtherLabel__C",
    "cve__PhoneNoteFields__C",
    "cve__QuestionsAndAnswersLabel__C",
    "cve__ReferenceLabel__C",
    "cve__RehabilitationLabel__C",
    "cve__ReturnToWorkFields__C",
    "cve__ReturnToWorkLabel__C",
    "cve__SectionOrder__C",
    "cve__ShowActionPlan__C",
    "cve__ShowAdjustmentsAndOffsets__C",
    "cve__ShowBenefitClaimedTasks__C",
    "cve__ShowClaimTasks__C",
    "cve__ShowCorrespondence__C",
    "cve__ShowEligibilityCheckButton__C",
    "cve__ShowEligibility__C",
    "cve__ShowFinancial__C",
    "cve__ShowInvestigative__C",
    "cve__ShowLegal__C",
    "cve__ShowLimitationsNotes__C",
    "cve__ShowMedical__C",
    "cve__ShowOccupational__C",
    "cve__ShowOther__C",
    "cve__ShowPredictiveModel__C",
    "cve__ShowQuestionsAndAnswers__C",
    "cve__ShowReference__C",
    "cve__ShowRehabilitation__C",
    "cve__ShowRequirementsNotes__C",
    "cve__ShowRestrictionsNotes__C",
    "cve__ShowReturnToWork__C",
    "cve__ShowSynopsis__C",
    "cve__SynopsisLabel__C",
    "cve__TaskHistoryFields__C"
})
public class Cve__CaseManagementSections__C
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
    @XmlElement(name = "cve__ActionPlanLabel__c", nillable = true)
    protected String cve__ActionPlanLabel__C;
    @XmlElement(name = "cve__AdjustmentFields__c", nillable = true)
    protected String cve__AdjustmentFields__C;
    @XmlElement(name = "cve__AdjustmentsAndOffsetsLabel__c", nillable = true)
    protected String cve__AdjustmentsAndOffsetsLabel__C;
    @XmlElement(name = "cve__ChildDocumentFields__c", nillable = true)
    protected String cve__ChildDocumentFields__C;
    @XmlElement(name = "cve__CorrespondenceLabel__c", nillable = true)
    protected String cve__CorrespondenceLabel__C;
    @XmlElement(name = "cve__EligibilityEditable__c", nillable = true)
    protected Boolean cve__EligibilityEditable__C;
    @XmlElement(name = "cve__EligibilityLabel__c", nillable = true)
    protected String cve__EligibilityLabel__C;
    @XmlElement(name = "cve__EligibilityLogicDoesUpdate__c", nillable = true)
    protected Boolean cve__EligibilityLogicDoesUpdate__C;
    @XmlElement(name = "cve__FinancialLabel__c", nillable = true)
    protected String cve__FinancialLabel__C;
    @XmlElement(name = "cve__HideChildAttachments__c", nillable = true)
    protected Boolean cve__HideChildAttachments__C;
    @XmlElement(name = "cve__HideChildDocuments__c", nillable = true)
    protected Boolean cve__HideChildDocuments__C;
    @XmlElement(name = "cve__HideChildNotes__c", nillable = true)
    protected Boolean cve__HideChildNotes__C;
    @XmlElement(name = "cve__InvestigativeLabel__c", nillable = true)
    protected String cve__InvestigativeLabel__C;
    @XmlElement(name = "cve__LegalLabel__c", nillable = true)
    protected String cve__LegalLabel__C;
    @XmlElement(name = "cve__MedicalLabel__c", nillable = true)
    protected String cve__MedicalLabel__C;
    @XmlElement(name = "cve__NoteCategories__c", nillable = true)
    protected String cve__NoteCategories__C;
    @XmlElement(name = "cve__OccupationalLabel__c", nillable = true)
    protected String cve__OccupationalLabel__C;
    @XmlElement(name = "cve__OpenTaskFields__c", nillable = true)
    protected String cve__OpenTaskFields__C;
    @XmlElement(name = "cve__OtherLabel__c", nillable = true)
    protected String cve__OtherLabel__C;
    @XmlElement(name = "cve__PhoneNoteFields__c", nillable = true)
    protected String cve__PhoneNoteFields__C;
    @XmlElement(name = "cve__QuestionsAndAnswersLabel__c", nillable = true)
    protected String cve__QuestionsAndAnswersLabel__C;
    @XmlElement(name = "cve__ReferenceLabel__c", nillable = true)
    protected String cve__ReferenceLabel__C;
    @XmlElement(name = "cve__RehabilitationLabel__c", nillable = true)
    protected String cve__RehabilitationLabel__C;
    @XmlElement(name = "cve__ReturnToWorkFields__c", nillable = true)
    protected String cve__ReturnToWorkFields__C;
    @XmlElement(name = "cve__ReturnToWorkLabel__c", nillable = true)
    protected String cve__ReturnToWorkLabel__C;
    @XmlElement(name = "cve__SectionOrder__c", nillable = true)
    protected String cve__SectionOrder__C;
    @XmlElement(name = "cve__ShowActionPlan__c", nillable = true)
    protected Boolean cve__ShowActionPlan__C;
    @XmlElement(name = "cve__ShowAdjustmentsAndOffsets__c", nillable = true)
    protected Boolean cve__ShowAdjustmentsAndOffsets__C;
    @XmlElement(name = "cve__ShowBenefitClaimedTasks__c", nillable = true)
    protected Boolean cve__ShowBenefitClaimedTasks__C;
    @XmlElement(name = "cve__ShowClaimTasks__c", nillable = true)
    protected Boolean cve__ShowClaimTasks__C;
    @XmlElement(name = "cve__ShowCorrespondence__c", nillable = true)
    protected Boolean cve__ShowCorrespondence__C;
    @XmlElement(name = "cve__ShowEligibilityCheckButton__c", nillable = true)
    protected Boolean cve__ShowEligibilityCheckButton__C;
    @XmlElement(name = "cve__ShowEligibility__c", nillable = true)
    protected Boolean cve__ShowEligibility__C;
    @XmlElement(name = "cve__ShowFinancial__c", nillable = true)
    protected Boolean cve__ShowFinancial__C;
    @XmlElement(name = "cve__ShowInvestigative__c", nillable = true)
    protected Boolean cve__ShowInvestigative__C;
    @XmlElement(name = "cve__ShowLegal__c", nillable = true)
    protected Boolean cve__ShowLegal__C;
    @XmlElement(name = "cve__ShowLimitationsNotes__c", nillable = true)
    protected Boolean cve__ShowLimitationsNotes__C;
    @XmlElement(name = "cve__ShowMedical__c", nillable = true)
    protected Boolean cve__ShowMedical__C;
    @XmlElement(name = "cve__ShowOccupational__c", nillable = true)
    protected Boolean cve__ShowOccupational__C;
    @XmlElement(name = "cve__ShowOther__c", nillable = true)
    protected Boolean cve__ShowOther__C;
    @XmlElement(name = "cve__ShowPredictiveModel__c", nillable = true)
    protected Boolean cve__ShowPredictiveModel__C;
    @XmlElement(name = "cve__ShowQuestionsAndAnswers__c", nillable = true)
    protected Boolean cve__ShowQuestionsAndAnswers__C;
    @XmlElement(name = "cve__ShowReference__c", nillable = true)
    protected Boolean cve__ShowReference__C;
    @XmlElement(name = "cve__ShowRehabilitation__c", nillable = true)
    protected Boolean cve__ShowRehabilitation__C;
    @XmlElement(name = "cve__ShowRequirementsNotes__c", nillable = true)
    protected Boolean cve__ShowRequirementsNotes__C;
    @XmlElement(name = "cve__ShowRestrictionsNotes__c", nillable = true)
    protected Boolean cve__ShowRestrictionsNotes__C;
    @XmlElement(name = "cve__ShowReturnToWork__c", nillable = true)
    protected Boolean cve__ShowReturnToWork__C;
    @XmlElement(name = "cve__ShowSynopsis__c", nillable = true)
    protected Boolean cve__ShowSynopsis__C;
    @XmlElement(name = "cve__SynopsisLabel__c", nillable = true)
    protected String cve__SynopsisLabel__C;
    @XmlElement(name = "cve__TaskHistoryFields__c", nillable = true)
    protected String cve__TaskHistoryFields__C;

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
     * Gets the value of the cve__ActionPlanLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ActionPlanLabel__C() {
        return cve__ActionPlanLabel__C;
    }

    /**
     * Sets the value of the cve__ActionPlanLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ActionPlanLabel__C(String value) {
        this.cve__ActionPlanLabel__C = value;
    }

    /**
     * Gets the value of the cve__AdjustmentFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdjustmentFields__C() {
        return cve__AdjustmentFields__C;
    }

    /**
     * Sets the value of the cve__AdjustmentFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdjustmentFields__C(String value) {
        this.cve__AdjustmentFields__C = value;
    }

    /**
     * Gets the value of the cve__AdjustmentsAndOffsetsLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AdjustmentsAndOffsetsLabel__C() {
        return cve__AdjustmentsAndOffsetsLabel__C;
    }

    /**
     * Sets the value of the cve__AdjustmentsAndOffsetsLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AdjustmentsAndOffsetsLabel__C(String value) {
        this.cve__AdjustmentsAndOffsetsLabel__C = value;
    }

    /**
     * Gets the value of the cve__ChildDocumentFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ChildDocumentFields__C() {
        return cve__ChildDocumentFields__C;
    }

    /**
     * Sets the value of the cve__ChildDocumentFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ChildDocumentFields__C(String value) {
        this.cve__ChildDocumentFields__C = value;
    }

    /**
     * Gets the value of the cve__CorrespondenceLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CorrespondenceLabel__C() {
        return cve__CorrespondenceLabel__C;
    }

    /**
     * Sets the value of the cve__CorrespondenceLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CorrespondenceLabel__C(String value) {
        this.cve__CorrespondenceLabel__C = value;
    }

    /**
     * Gets the value of the cve__EligibilityEditable__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__EligibilityEditable__C() {
        return cve__EligibilityEditable__C;
    }

    /**
     * Sets the value of the cve__EligibilityEditable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__EligibilityEditable__C(Boolean value) {
        this.cve__EligibilityEditable__C = value;
    }

    /**
     * Gets the value of the cve__EligibilityLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EligibilityLabel__C() {
        return cve__EligibilityLabel__C;
    }

    /**
     * Sets the value of the cve__EligibilityLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EligibilityLabel__C(String value) {
        this.cve__EligibilityLabel__C = value;
    }

    /**
     * Gets the value of the cve__EligibilityLogicDoesUpdate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__EligibilityLogicDoesUpdate__C() {
        return cve__EligibilityLogicDoesUpdate__C;
    }

    /**
     * Sets the value of the cve__EligibilityLogicDoesUpdate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__EligibilityLogicDoesUpdate__C(Boolean value) {
        this.cve__EligibilityLogicDoesUpdate__C = value;
    }

    /**
     * Gets the value of the cve__FinancialLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__FinancialLabel__C() {
        return cve__FinancialLabel__C;
    }

    /**
     * Sets the value of the cve__FinancialLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__FinancialLabel__C(String value) {
        this.cve__FinancialLabel__C = value;
    }

    /**
     * Gets the value of the cve__HideChildAttachments__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideChildAttachments__C() {
        return cve__HideChildAttachments__C;
    }

    /**
     * Sets the value of the cve__HideChildAttachments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideChildAttachments__C(Boolean value) {
        this.cve__HideChildAttachments__C = value;
    }

    /**
     * Gets the value of the cve__HideChildDocuments__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideChildDocuments__C() {
        return cve__HideChildDocuments__C;
    }

    /**
     * Sets the value of the cve__HideChildDocuments__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideChildDocuments__C(Boolean value) {
        this.cve__HideChildDocuments__C = value;
    }

    /**
     * Gets the value of the cve__HideChildNotes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideChildNotes__C() {
        return cve__HideChildNotes__C;
    }

    /**
     * Sets the value of the cve__HideChildNotes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideChildNotes__C(Boolean value) {
        this.cve__HideChildNotes__C = value;
    }

    /**
     * Gets the value of the cve__InvestigativeLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__InvestigativeLabel__C() {
        return cve__InvestigativeLabel__C;
    }

    /**
     * Sets the value of the cve__InvestigativeLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__InvestigativeLabel__C(String value) {
        this.cve__InvestigativeLabel__C = value;
    }

    /**
     * Gets the value of the cve__LegalLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LegalLabel__C() {
        return cve__LegalLabel__C;
    }

    /**
     * Sets the value of the cve__LegalLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LegalLabel__C(String value) {
        this.cve__LegalLabel__C = value;
    }

    /**
     * Gets the value of the cve__MedicalLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MedicalLabel__C() {
        return cve__MedicalLabel__C;
    }

    /**
     * Sets the value of the cve__MedicalLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MedicalLabel__C(String value) {
        this.cve__MedicalLabel__C = value;
    }

    /**
     * Gets the value of the cve__NoteCategories__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__NoteCategories__C() {
        return cve__NoteCategories__C;
    }

    /**
     * Sets the value of the cve__NoteCategories__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__NoteCategories__C(String value) {
        this.cve__NoteCategories__C = value;
    }

    /**
     * Gets the value of the cve__OccupationalLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__OccupationalLabel__C() {
        return cve__OccupationalLabel__C;
    }

    /**
     * Sets the value of the cve__OccupationalLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__OccupationalLabel__C(String value) {
        this.cve__OccupationalLabel__C = value;
    }

    /**
     * Gets the value of the cve__OpenTaskFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__OpenTaskFields__C() {
        return cve__OpenTaskFields__C;
    }

    /**
     * Sets the value of the cve__OpenTaskFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__OpenTaskFields__C(String value) {
        this.cve__OpenTaskFields__C = value;
    }

    /**
     * Gets the value of the cve__OtherLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__OtherLabel__C() {
        return cve__OtherLabel__C;
    }

    /**
     * Sets the value of the cve__OtherLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__OtherLabel__C(String value) {
        this.cve__OtherLabel__C = value;
    }

    /**
     * Gets the value of the cve__PhoneNoteFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PhoneNoteFields__C() {
        return cve__PhoneNoteFields__C;
    }

    /**
     * Sets the value of the cve__PhoneNoteFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PhoneNoteFields__C(String value) {
        this.cve__PhoneNoteFields__C = value;
    }

    /**
     * Gets the value of the cve__QuestionsAndAnswersLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__QuestionsAndAnswersLabel__C() {
        return cve__QuestionsAndAnswersLabel__C;
    }

    /**
     * Sets the value of the cve__QuestionsAndAnswersLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__QuestionsAndAnswersLabel__C(String value) {
        this.cve__QuestionsAndAnswersLabel__C = value;
    }

    /**
     * Gets the value of the cve__ReferenceLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ReferenceLabel__C() {
        return cve__ReferenceLabel__C;
    }

    /**
     * Sets the value of the cve__ReferenceLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ReferenceLabel__C(String value) {
        this.cve__ReferenceLabel__C = value;
    }

    /**
     * Gets the value of the cve__RehabilitationLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RehabilitationLabel__C() {
        return cve__RehabilitationLabel__C;
    }

    /**
     * Sets the value of the cve__RehabilitationLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RehabilitationLabel__C(String value) {
        this.cve__RehabilitationLabel__C = value;
    }

    /**
     * Gets the value of the cve__ReturnToWorkFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ReturnToWorkFields__C() {
        return cve__ReturnToWorkFields__C;
    }

    /**
     * Sets the value of the cve__ReturnToWorkFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ReturnToWorkFields__C(String value) {
        this.cve__ReturnToWorkFields__C = value;
    }

    /**
     * Gets the value of the cve__ReturnToWorkLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ReturnToWorkLabel__C() {
        return cve__ReturnToWorkLabel__C;
    }

    /**
     * Sets the value of the cve__ReturnToWorkLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ReturnToWorkLabel__C(String value) {
        this.cve__ReturnToWorkLabel__C = value;
    }

    /**
     * Gets the value of the cve__SectionOrder__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SectionOrder__C() {
        return cve__SectionOrder__C;
    }

    /**
     * Sets the value of the cve__SectionOrder__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SectionOrder__C(String value) {
        this.cve__SectionOrder__C = value;
    }

    /**
     * Gets the value of the cve__ShowActionPlan__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowActionPlan__C() {
        return cve__ShowActionPlan__C;
    }

    /**
     * Sets the value of the cve__ShowActionPlan__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowActionPlan__C(Boolean value) {
        this.cve__ShowActionPlan__C = value;
    }

    /**
     * Gets the value of the cve__ShowAdjustmentsAndOffsets__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowAdjustmentsAndOffsets__C() {
        return cve__ShowAdjustmentsAndOffsets__C;
    }

    /**
     * Sets the value of the cve__ShowAdjustmentsAndOffsets__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowAdjustmentsAndOffsets__C(Boolean value) {
        this.cve__ShowAdjustmentsAndOffsets__C = value;
    }

    /**
     * Gets the value of the cve__ShowBenefitClaimedTasks__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowBenefitClaimedTasks__C() {
        return cve__ShowBenefitClaimedTasks__C;
    }

    /**
     * Sets the value of the cve__ShowBenefitClaimedTasks__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowBenefitClaimedTasks__C(Boolean value) {
        this.cve__ShowBenefitClaimedTasks__C = value;
    }

    /**
     * Gets the value of the cve__ShowClaimTasks__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowClaimTasks__C() {
        return cve__ShowClaimTasks__C;
    }

    /**
     * Sets the value of the cve__ShowClaimTasks__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowClaimTasks__C(Boolean value) {
        this.cve__ShowClaimTasks__C = value;
    }

    /**
     * Gets the value of the cve__ShowCorrespondence__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowCorrespondence__C() {
        return cve__ShowCorrespondence__C;
    }

    /**
     * Sets the value of the cve__ShowCorrespondence__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowCorrespondence__C(Boolean value) {
        this.cve__ShowCorrespondence__C = value;
    }

    /**
     * Gets the value of the cve__ShowEligibilityCheckButton__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowEligibilityCheckButton__C() {
        return cve__ShowEligibilityCheckButton__C;
    }

    /**
     * Sets the value of the cve__ShowEligibilityCheckButton__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowEligibilityCheckButton__C(Boolean value) {
        this.cve__ShowEligibilityCheckButton__C = value;
    }

    /**
     * Gets the value of the cve__ShowEligibility__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowEligibility__C() {
        return cve__ShowEligibility__C;
    }

    /**
     * Sets the value of the cve__ShowEligibility__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowEligibility__C(Boolean value) {
        this.cve__ShowEligibility__C = value;
    }

    /**
     * Gets the value of the cve__ShowFinancial__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowFinancial__C() {
        return cve__ShowFinancial__C;
    }

    /**
     * Sets the value of the cve__ShowFinancial__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowFinancial__C(Boolean value) {
        this.cve__ShowFinancial__C = value;
    }

    /**
     * Gets the value of the cve__ShowInvestigative__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowInvestigative__C() {
        return cve__ShowInvestigative__C;
    }

    /**
     * Sets the value of the cve__ShowInvestigative__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowInvestigative__C(Boolean value) {
        this.cve__ShowInvestigative__C = value;
    }

    /**
     * Gets the value of the cve__ShowLegal__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowLegal__C() {
        return cve__ShowLegal__C;
    }

    /**
     * Sets the value of the cve__ShowLegal__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowLegal__C(Boolean value) {
        this.cve__ShowLegal__C = value;
    }

    /**
     * Gets the value of the cve__ShowLimitationsNotes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowLimitationsNotes__C() {
        return cve__ShowLimitationsNotes__C;
    }

    /**
     * Sets the value of the cve__ShowLimitationsNotes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowLimitationsNotes__C(Boolean value) {
        this.cve__ShowLimitationsNotes__C = value;
    }

    /**
     * Gets the value of the cve__ShowMedical__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowMedical__C() {
        return cve__ShowMedical__C;
    }

    /**
     * Sets the value of the cve__ShowMedical__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowMedical__C(Boolean value) {
        this.cve__ShowMedical__C = value;
    }

    /**
     * Gets the value of the cve__ShowOccupational__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowOccupational__C() {
        return cve__ShowOccupational__C;
    }

    /**
     * Sets the value of the cve__ShowOccupational__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowOccupational__C(Boolean value) {
        this.cve__ShowOccupational__C = value;
    }

    /**
     * Gets the value of the cve__ShowOther__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowOther__C() {
        return cve__ShowOther__C;
    }

    /**
     * Sets the value of the cve__ShowOther__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowOther__C(Boolean value) {
        this.cve__ShowOther__C = value;
    }

    /**
     * Gets the value of the cve__ShowPredictiveModel__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowPredictiveModel__C() {
        return cve__ShowPredictiveModel__C;
    }

    /**
     * Sets the value of the cve__ShowPredictiveModel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowPredictiveModel__C(Boolean value) {
        this.cve__ShowPredictiveModel__C = value;
    }

    /**
     * Gets the value of the cve__ShowQuestionsAndAnswers__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowQuestionsAndAnswers__C() {
        return cve__ShowQuestionsAndAnswers__C;
    }

    /**
     * Sets the value of the cve__ShowQuestionsAndAnswers__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowQuestionsAndAnswers__C(Boolean value) {
        this.cve__ShowQuestionsAndAnswers__C = value;
    }

    /**
     * Gets the value of the cve__ShowReference__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowReference__C() {
        return cve__ShowReference__C;
    }

    /**
     * Sets the value of the cve__ShowReference__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowReference__C(Boolean value) {
        this.cve__ShowReference__C = value;
    }

    /**
     * Gets the value of the cve__ShowRehabilitation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowRehabilitation__C() {
        return cve__ShowRehabilitation__C;
    }

    /**
     * Sets the value of the cve__ShowRehabilitation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowRehabilitation__C(Boolean value) {
        this.cve__ShowRehabilitation__C = value;
    }

    /**
     * Gets the value of the cve__ShowRequirementsNotes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowRequirementsNotes__C() {
        return cve__ShowRequirementsNotes__C;
    }

    /**
     * Sets the value of the cve__ShowRequirementsNotes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowRequirementsNotes__C(Boolean value) {
        this.cve__ShowRequirementsNotes__C = value;
    }

    /**
     * Gets the value of the cve__ShowRestrictionsNotes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowRestrictionsNotes__C() {
        return cve__ShowRestrictionsNotes__C;
    }

    /**
     * Sets the value of the cve__ShowRestrictionsNotes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowRestrictionsNotes__C(Boolean value) {
        this.cve__ShowRestrictionsNotes__C = value;
    }

    /**
     * Gets the value of the cve__ShowReturnToWork__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowReturnToWork__C() {
        return cve__ShowReturnToWork__C;
    }

    /**
     * Sets the value of the cve__ShowReturnToWork__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowReturnToWork__C(Boolean value) {
        this.cve__ShowReturnToWork__C = value;
    }

    /**
     * Gets the value of the cve__ShowSynopsis__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ShowSynopsis__C() {
        return cve__ShowSynopsis__C;
    }

    /**
     * Sets the value of the cve__ShowSynopsis__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ShowSynopsis__C(Boolean value) {
        this.cve__ShowSynopsis__C = value;
    }

    /**
     * Gets the value of the cve__SynopsisLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SynopsisLabel__C() {
        return cve__SynopsisLabel__C;
    }

    /**
     * Sets the value of the cve__SynopsisLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SynopsisLabel__C(String value) {
        this.cve__SynopsisLabel__C = value;
    }

    /**
     * Gets the value of the cve__TaskHistoryFields__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaskHistoryFields__C() {
        return cve__TaskHistoryFields__C;
    }

    /**
     * Sets the value of the cve__TaskHistoryFields__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaskHistoryFields__C(String value) {
        this.cve__TaskHistoryFields__C = value;
    }

}
