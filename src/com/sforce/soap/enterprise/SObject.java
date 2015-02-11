
package com.sforce.soap.enterprise;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldsToNull" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:enterprise.soap.sforce.com}ID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sObject", propOrder = {
    "fieldsToNull",
    "id"
})
@XmlSeeAlso({
    CaseSolution.class,
    ProcessInstanceNode.class,
    Cve__ClaimIntakeOptions__C.class,
    Cve__PaymentSchedule__C.class,
    ApexTestResult.class,
    ContractHistory.class,
    CaseContactRole.class,
    SearchPromotionRule.class,
    AuthSession.class,
    Document.class,
    OrderItemHistory.class,
    Cve__Switches__C.class,
    ProcessInstanceWorkitem.class,
    ContentWorkspace.class,
    Pricebook2History.class,
    Approval.class,
    Cve__JournalSection__C.class,
    Cve__QuestionPage__C.class,
    MailmergeTemplate.class,
    Cve__Policy__C.class,
    CronTrigger.class,
    Cve__PredictiveModel__C.class,
    ContentDocumentHistory.class,
    AssignmentRule.class,
    Cve__Options__C.class,
    PricebookEntry.class,
    Cve__Adjustment__C.class,
    Cve__DateConversionFactors__C.class,
    Cve__ExplanationOfBenefit__C.class,
    AccountPartner.class,
    QueueSobject.class,
    ApexClass.class,
    Note.class,
    SelfServiceUser.class,
    Cve__Investigation__C.class,
    Group.class,
    GroupMember.class,
    Cve__Contacts__C.class,
    LeadHistory.class,
    Cve__Mappings__C.class,
    FieldPermissions.class,
    Cve__Document__C.class,
    Cve__PaymentScheduleParameters__C.class,
    DeclinedEventRelation.class,
    Cve__CaseManagementSections__C.class,
    Cve__ClaimRelationship__C.class,
    ContentVersion.class,
    Cve__Product__C.class,
    EventRelation.class,
    Cve__BenefitQuestionPage__C.class,
    IdeaComment.class,
    ProcessInstanceHistory.class,
    Cve__Notes__C.class,
    ObjectPermissions.class,
    Cve__OperationImplementations__C.class,
    AcceptedEventRelation.class,
    CaseTeamTemplateMember.class,
    Cve__PaymentSpecification__C.class,
    OpportunityStage.class,
    Holiday.class,
    Cve__BenefitOption__C.class,
    Cve__Mapping__C.class,
    Event.class,
    UserPackageLicense.class,
    ApexComponent.class,
    Cve__Adjustment__History.class,
    Cve__TollingPeriod__History.class,
    TaskPriority.class,
    OpportunityLineItem.class,
    SetupEntityAccess.class,
    Dashboard.class,
    Attachment.class,
    UserLicense.class,
    Cve__Payment__C.class,
    OpportunityHistory.class,
    ContentDocumentLink.class,
    Name.class,
    ListView.class,
    Cve__PolicyRelationship__C.class,
    CaseTeamMember.class,
    EmailServicesFunction.class,
    FiscalYearSettings.class,
    OpportunityShare.class,
    Cve__BenefitReduction__C.class,
    UserLogin.class,
    SolutionStatus.class,
    Cve__HelpSectionFragments__C.class,
    Cve__Call__C.class,
    Cve__Payment__History.class,
    AdditionalNumber.class,
    CaseShare.class,
    Cve__ApprovalProcesses__C.class,
    RecentlyViewed.class,
    Cve__Constraints__C.class,
    Cve__Question__C.class,
    OrgWideEmailAddress.class,
    Cve__Answer__C.class,
    Campaign.class,
    Cve__PolicyBenefit__C.class,
    EmailTemplate.class,
    ProcessInstance.class,
    InstalledMobileApp.class,
    SiteHistory.class,
    Domain.class,
    PartnerRole.class,
    CategoryData.class,
    ContentDistribution.class,
    Cve__PhoneNote__C.class,
    OpportunityFieldHistory.class,
    ContractStatus.class,
    CaseComment.class,
    PermissionSetLicenseAssign.class,
    ProcessInstanceStep.class,
    Opportunity.class,
    Cve__ProfileNames__C.class,
    ApexTrigger.class,
    OauthToken.class,
    Cve__Tasks__C.class,
    Report.class,
    Cve__PaymentAssociation__C.class,
    DomainSite.class,
    BusinessHours.class,
    StaticResource.class,
    Cve__CoverageClaimed__C.class,
    ContactHistory.class,
    Cve__Questions__C.class,
    ApexPage.class,
    CampaignShare.class,
    ContentDocument.class,
    OpportunityPartner.class,
    UserRole.class,
    ContactShare.class,
    Cve__Claim__History.class,
    Cve__Benefit__C.class,
    Community.class,
    OpenActivity.class,
    BusinessProcess.class,
    Account.class,
    EmailStatus.class,
    LeadShare.class,
    CustomPermissionDependency.class,
    AuthConfig.class,
    Cve__Allocation__C.class,
    Cve__TollingPeriod__C.class,
    ForecastShare.class,
    MobileDeviceRegistrar.class,
    PushTopic.class,
    Scontrol.class,
    Cve__AnswerOption__C.class,
    Cve__PaymentSpecification__History.class,
    ClientBrowser.class,
    Cve__Journal__C.class,
    Asset.class,
    CronJobDetail.class,
    UserPreference.class,
    CampaignMember.class,
    Cve__ContactHistory__C.class,
    Cve__Coverage__C.class,
    Cve__HelpOptions__C.class,
    AccountContactRole.class,
    Cve__CaseManagementOptions__C.class,
    Vote.class,
    Pricebook2 .class,
    SecureAgentPlugin.class,
    Cve__Adjustments__C.class,
    EmailServicesAddress.class,
    CallCenter.class,
    Cve__AdjustmentParameters__C.class,
    Idea.class,
    Cve__PlannedTask__C.class,
    CaseStatus.class,
    Contract.class,
    EventLogFile.class,
    Site.class,
    CombinedAttachment.class,
    Organization.class,
    Product2 .class,
    Cve__PaymentScheduleItem__C.class,
    ActivityHistory.class,
    ExternalDataUserAuth.class,
    Folder.class,
    Profile.class,
    Case.class,
    Cve__Diagnosis__C.class,
    CaseTeamTemplate.class,
    Cve__Class__C.class,
    PermissionSetAssignment.class,
    ContentWorkspaceDoc.class,
    Lead.class,
    Cve__Action__C.class,
    AsyncApexJob.class,
    Partner.class,
    Cve__AssignmentParameters__C.class,
    Solution.class,
    Cve__Rates__C.class,
    ApexTestQueueItem.class,
    Cve__Titles__C.class,
    AuthConfigProviders.class,
    Cve__Claim__C.class,
    AuthProvider.class,
    CaseTeamRole.class,
    Cve__PaymentCalculationOptions__C.class,
    DocumentAttachmentMap.class,
    TaskStatus.class,
    UserRecordAccess.class,
    WebLink.class,
    Cve__RequiredDocuments__C.class,
    CategoryNode.class,
    TenantUsageEntitlement.class,
    OrderItem.class,
    Cve__ClaimSummaryOptions__C.class,
    Cve__BenefitClaimed__History.class,
    Task.class,
    ProcessNode.class,
    Cve__HelpSection__C.class,
    CaseTeamTemplateRecord.class,
    ProcessDefinition.class,
    SecureAgent.class,
    ExternalDataSource.class,
    CustomPermission.class,
    Cve__AppliedAdjustment__C.class,
    ContractContactRole.class,
    ThirdPartyAccountLink.class,
    AggregateResult.class,
    AccountHistory.class,
    Cve__PaymentAuthorityLevels__C.class,
    Cve__PurchasedOption__C.class,
    OrderHistory.class,
    Cve__Chatter__C.class,
    CaseHistory.class,
    LookedUpFromActivity.class,
    Order.class,
    PackageLicense.class,
    Cve__ClassRelationship__C.class,
    Cve__ConditionFactor__C.class,
    CampaignMemberStatus.class,
    Period.class,
    Cve__ClaimInquiryOptions__C.class,
    UserShare.class,
    LoginHistory.class,
    PermissionSet.class,
    Cve__Rehabilitation__C.class,
    Cve__ReturnToWork__C.class,
    DashboardComponent.class,
    OpportunityCompetitor.class,
    User.class,
    CustomObjectUserLicenseMetrics.class,
    Cve__Url__C.class,
    ContentDistributionView.class,
    NoteAndAttachment.class,
    AppMenuItem.class,
    LeadStatus.class,
    SolutionHistory.class,
    SamlSsoConfig.class,
    RecordType.class,
    Topic.class,
    SecureAgentPluginProperty.class,
    Cve__PaymentParameters__C.class,
    OpportunityContactRole.class,
    Cve__Attachments__C.class,
    ContentVersionHistory.class,
    Cve__LicenseKeys__C.class,
    PermissionSetLicense.class,
    Cve__Documents__C.class,
    BrandTemplate.class,
    Contact.class,
    LoginIp.class,
    Cve__RequiredFields__C.class,
    UndecidedEventRelation.class,
    Cve__UnallocatedPayment__C.class,
    AccountShare.class,
    ApexLog.class,
    Cve__BenefitClaimed__C.class,
    TopicAssignment.class
})
public class SObject {

    @XmlElement(nillable = true)
    protected List<String> fieldsToNull;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;

    /**
     * Gets the value of the fieldsToNull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldsToNull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldsToNull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldsToNull() {
        if (fieldsToNull == null) {
            fieldsToNull = new ArrayList<String>();
        }
        return this.fieldsToNull;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
