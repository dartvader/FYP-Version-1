
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PermissionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSet">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Assignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldPerms" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsOwnedByProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectPerms" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PermissionsActivateContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsActivateOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsAllowUniversalSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsAllowViewKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsApiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsAssignPermissionSets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsAssignTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsAuthorApex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsBulkApiHardDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCanUseNewDashboardBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsConnectOrgToEnvironmentHub" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsContentAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsConvertLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCreateCustomizeFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCreatePackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCreateTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCreateWorkBadgeDefinition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCreateWorkspaces" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCustomMobileAppsAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCustomSidebarOnAllPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCustomizeApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsDeleteActivatedContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsDeleteTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsDistributeFromPersWksp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditActivatedOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditBrandTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditCaseComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditHtmlTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditOppLineItemUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditPublicDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditPublicTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditReadonlyFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailAdministration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailMass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailSingle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailTemplateManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEnableNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsExportReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsFlowUFLRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsForceTwoFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsGovernNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsIdentityConnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsIdentityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsImportLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsImportPersonal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsInstallPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageAnalyticSnapshots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageAuthProviders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageBusinessHourHolidays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCallCenters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageContentPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageContentProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageContentTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCssUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCustomPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCustomReportTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDataIntegrations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDynamicDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageEmailClientConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageInteraction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageInternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageIpAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageKnowledgeImportExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageLoginAccessPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManagePasswordPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageProfilesPermissionsets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageRemoteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageRoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSearchPromotionRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSelfService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSharing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSynonyms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageTwoFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsMassInlineEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsModifyAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsModifySecureAgents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsNewReportBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsPasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsPublishPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsResetPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsRunFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsRunReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsSalesConsole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsScheduleReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsSendSitRequests" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsSolutionImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyLead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTwoFactorApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsUseTeamReassignWizards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewAllUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewEncryptedData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewEventLogFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewHelpLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewMyTeamsDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsWorkCalibrationUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsWorkDotComUserPerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:sobject.enterprise.soap.sforce.com}Profile" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SetupEntityAccessItems" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserLicense" type="{urn:sobject.enterprise.soap.sforce.com}UserLicense" minOccurs="0"/>
 *         &lt;element name="UserLicenseId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSet", propOrder = {
    "assignments",
    "createdBy",
    "createdById",
    "createdDate",
    "description",
    "fieldPerms",
    "isOwnedByProfile",
    "label",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "namespacePrefix",
    "objectPerms",
    "permissionsActivateContract",
    "permissionsActivateOrder",
    "permissionsAllowUniversalSearch",
    "permissionsAllowViewKnowledge",
    "permissionsApiEnabled",
    "permissionsAssignPermissionSets",
    "permissionsAssignTopics",
    "permissionsAuthorApex",
    "permissionsBulkApiHardDelete",
    "permissionsCanUseNewDashboardBuilder",
    "permissionsConnectOrgToEnvironmentHub",
    "permissionsContentAdministrator",
    "permissionsConvertLeads",
    "permissionsCreateCustomizeFilters",
    "permissionsCreatePackaging",
    "permissionsCreateTopics",
    "permissionsCreateWorkBadgeDefinition",
    "permissionsCreateWorkspaces",
    "permissionsCustomMobileAppsAccess",
    "permissionsCustomSidebarOnAllPages",
    "permissionsCustomizeApplication",
    "permissionsDeleteActivatedContract",
    "permissionsDeleteTopics",
    "permissionsDistributeFromPersWksp",
    "permissionsEditActivatedOrders",
    "permissionsEditBrandTemplates",
    "permissionsEditCaseComments",
    "permissionsEditEvent",
    "permissionsEditHtmlTemplates",
    "permissionsEditKnowledge",
    "permissionsEditOppLineItemUnitPrice",
    "permissionsEditPublicDocuments",
    "permissionsEditPublicTemplates",
    "permissionsEditReadonlyFields",
    "permissionsEditReports",
    "permissionsEditTask",
    "permissionsEditTopics",
    "permissionsEmailAdministration",
    "permissionsEmailMass",
    "permissionsEmailSingle",
    "permissionsEmailTemplateManagement",
    "permissionsEnableNotifications",
    "permissionsExportReport",
    "permissionsFlowUFLRequired",
    "permissionsForceTwoFactor",
    "permissionsGovernNetworks",
    "permissionsIdentityConnect",
    "permissionsIdentityEnabled",
    "permissionsImportLeads",
    "permissionsImportPersonal",
    "permissionsInstallPackaging",
    "permissionsManageAnalyticSnapshots",
    "permissionsManageAuthProviders",
    "permissionsManageBusinessHourHolidays",
    "permissionsManageCallCenters",
    "permissionsManageCases",
    "permissionsManageCategories",
    "permissionsManageContentPermissions",
    "permissionsManageContentProperties",
    "permissionsManageContentTypes",
    "permissionsManageCssUsers",
    "permissionsManageCustomPermissions",
    "permissionsManageCustomReportTypes",
    "permissionsManageDashboards",
    "permissionsManageDataCategories",
    "permissionsManageDataIntegrations",
    "permissionsManageDynamicDashboards",
    "permissionsManageEmailClientConfig",
    "permissionsManageInteraction",
    "permissionsManageInternalUsers",
    "permissionsManageIpAddresses",
    "permissionsManageKnowledge",
    "permissionsManageKnowledgeImportExport",
    "permissionsManageLeads",
    "permissionsManageLoginAccessPolicies",
    "permissionsManageMobile",
    "permissionsManageNetworks",
    "permissionsManagePasswordPolicies",
    "permissionsManageProfilesPermissionsets",
    "permissionsManageRemoteAccess",
    "permissionsManageRoles",
    "permissionsManageSearchPromotionRules",
    "permissionsManageSelfService",
    "permissionsManageSharing",
    "permissionsManageSolutions",
    "permissionsManageSynonyms",
    "permissionsManageTwoFactor",
    "permissionsManageUsers",
    "permissionsMassInlineEdit",
    "permissionsModifyAllData",
    "permissionsModifySecureAgents",
    "permissionsNewReportBuilder",
    "permissionsPasswordNeverExpires",
    "permissionsPublishPackaging",
    "permissionsResetPasswords",
    "permissionsRunFlow",
    "permissionsRunReports",
    "permissionsSalesConsole",
    "permissionsScheduleReports",
    "permissionsSendSitRequests",
    "permissionsSolutionImport",
    "permissionsTransferAnyCase",
    "permissionsTransferAnyEntity",
    "permissionsTransferAnyLead",
    "permissionsTwoFactorApi",
    "permissionsUseTeamReassignWizards",
    "permissionsViewAllData",
    "permissionsViewAllUsers",
    "permissionsViewContent",
    "permissionsViewDataCategories",
    "permissionsViewEncryptedData",
    "permissionsViewEventLogFiles",
    "permissionsViewHelpLink",
    "permissionsViewMyTeamsDashboards",
    "permissionsViewSetup",
    "permissionsWorkCalibrationUser",
    "permissionsWorkDotComUserPerm",
    "profile",
    "profileId",
    "setupEntityAccessItems",
    "systemModstamp",
    "userLicense",
    "userLicenseId"
})
public class PermissionSet
    extends SObject
{

    @XmlElement(name = "Assignments", nillable = true)
    protected QueryResultType assignments;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "FieldPerms", nillable = true)
    protected QueryResultType fieldPerms;
    @XmlElement(name = "IsOwnedByProfile", nillable = true)
    protected Boolean isOwnedByProfile;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NamespacePrefix", nillable = true)
    protected String namespacePrefix;
    @XmlElement(name = "ObjectPerms", nillable = true)
    protected QueryResultType objectPerms;
    @XmlElement(name = "PermissionsActivateContract", nillable = true)
    protected Boolean permissionsActivateContract;
    @XmlElement(name = "PermissionsActivateOrder", nillable = true)
    protected Boolean permissionsActivateOrder;
    @XmlElement(name = "PermissionsAllowUniversalSearch", nillable = true)
    protected Boolean permissionsAllowUniversalSearch;
    @XmlElement(name = "PermissionsAllowViewKnowledge", nillable = true)
    protected Boolean permissionsAllowViewKnowledge;
    @XmlElement(name = "PermissionsApiEnabled", nillable = true)
    protected Boolean permissionsApiEnabled;
    @XmlElement(name = "PermissionsAssignPermissionSets", nillable = true)
    protected Boolean permissionsAssignPermissionSets;
    @XmlElement(name = "PermissionsAssignTopics", nillable = true)
    protected Boolean permissionsAssignTopics;
    @XmlElement(name = "PermissionsAuthorApex", nillable = true)
    protected Boolean permissionsAuthorApex;
    @XmlElement(name = "PermissionsBulkApiHardDelete", nillable = true)
    protected Boolean permissionsBulkApiHardDelete;
    @XmlElement(name = "PermissionsCanUseNewDashboardBuilder", nillable = true)
    protected Boolean permissionsCanUseNewDashboardBuilder;
    @XmlElement(name = "PermissionsConnectOrgToEnvironmentHub", nillable = true)
    protected Boolean permissionsConnectOrgToEnvironmentHub;
    @XmlElement(name = "PermissionsContentAdministrator", nillable = true)
    protected Boolean permissionsContentAdministrator;
    @XmlElement(name = "PermissionsConvertLeads", nillable = true)
    protected Boolean permissionsConvertLeads;
    @XmlElement(name = "PermissionsCreateCustomizeFilters", nillable = true)
    protected Boolean permissionsCreateCustomizeFilters;
    @XmlElement(name = "PermissionsCreatePackaging", nillable = true)
    protected Boolean permissionsCreatePackaging;
    @XmlElement(name = "PermissionsCreateTopics", nillable = true)
    protected Boolean permissionsCreateTopics;
    @XmlElement(name = "PermissionsCreateWorkBadgeDefinition", nillable = true)
    protected Boolean permissionsCreateWorkBadgeDefinition;
    @XmlElement(name = "PermissionsCreateWorkspaces", nillable = true)
    protected Boolean permissionsCreateWorkspaces;
    @XmlElement(name = "PermissionsCustomMobileAppsAccess", nillable = true)
    protected Boolean permissionsCustomMobileAppsAccess;
    @XmlElement(name = "PermissionsCustomSidebarOnAllPages", nillable = true)
    protected Boolean permissionsCustomSidebarOnAllPages;
    @XmlElement(name = "PermissionsCustomizeApplication", nillable = true)
    protected Boolean permissionsCustomizeApplication;
    @XmlElement(name = "PermissionsDeleteActivatedContract", nillable = true)
    protected Boolean permissionsDeleteActivatedContract;
    @XmlElement(name = "PermissionsDeleteTopics", nillable = true)
    protected Boolean permissionsDeleteTopics;
    @XmlElement(name = "PermissionsDistributeFromPersWksp", nillable = true)
    protected Boolean permissionsDistributeFromPersWksp;
    @XmlElement(name = "PermissionsEditActivatedOrders", nillable = true)
    protected Boolean permissionsEditActivatedOrders;
    @XmlElement(name = "PermissionsEditBrandTemplates", nillable = true)
    protected Boolean permissionsEditBrandTemplates;
    @XmlElement(name = "PermissionsEditCaseComments", nillable = true)
    protected Boolean permissionsEditCaseComments;
    @XmlElement(name = "PermissionsEditEvent", nillable = true)
    protected Boolean permissionsEditEvent;
    @XmlElement(name = "PermissionsEditHtmlTemplates", nillable = true)
    protected Boolean permissionsEditHtmlTemplates;
    @XmlElement(name = "PermissionsEditKnowledge", nillable = true)
    protected Boolean permissionsEditKnowledge;
    @XmlElement(name = "PermissionsEditOppLineItemUnitPrice", nillable = true)
    protected Boolean permissionsEditOppLineItemUnitPrice;
    @XmlElement(name = "PermissionsEditPublicDocuments", nillable = true)
    protected Boolean permissionsEditPublicDocuments;
    @XmlElement(name = "PermissionsEditPublicTemplates", nillable = true)
    protected Boolean permissionsEditPublicTemplates;
    @XmlElement(name = "PermissionsEditReadonlyFields", nillable = true)
    protected Boolean permissionsEditReadonlyFields;
    @XmlElement(name = "PermissionsEditReports", nillable = true)
    protected Boolean permissionsEditReports;
    @XmlElement(name = "PermissionsEditTask", nillable = true)
    protected Boolean permissionsEditTask;
    @XmlElement(name = "PermissionsEditTopics", nillable = true)
    protected Boolean permissionsEditTopics;
    @XmlElement(name = "PermissionsEmailAdministration", nillable = true)
    protected Boolean permissionsEmailAdministration;
    @XmlElement(name = "PermissionsEmailMass", nillable = true)
    protected Boolean permissionsEmailMass;
    @XmlElement(name = "PermissionsEmailSingle", nillable = true)
    protected Boolean permissionsEmailSingle;
    @XmlElement(name = "PermissionsEmailTemplateManagement", nillable = true)
    protected Boolean permissionsEmailTemplateManagement;
    @XmlElement(name = "PermissionsEnableNotifications", nillable = true)
    protected Boolean permissionsEnableNotifications;
    @XmlElement(name = "PermissionsExportReport", nillable = true)
    protected Boolean permissionsExportReport;
    @XmlElement(name = "PermissionsFlowUFLRequired", nillable = true)
    protected Boolean permissionsFlowUFLRequired;
    @XmlElement(name = "PermissionsForceTwoFactor", nillable = true)
    protected Boolean permissionsForceTwoFactor;
    @XmlElement(name = "PermissionsGovernNetworks", nillable = true)
    protected Boolean permissionsGovernNetworks;
    @XmlElement(name = "PermissionsIdentityConnect", nillable = true)
    protected Boolean permissionsIdentityConnect;
    @XmlElement(name = "PermissionsIdentityEnabled", nillable = true)
    protected Boolean permissionsIdentityEnabled;
    @XmlElement(name = "PermissionsImportLeads", nillable = true)
    protected Boolean permissionsImportLeads;
    @XmlElement(name = "PermissionsImportPersonal", nillable = true)
    protected Boolean permissionsImportPersonal;
    @XmlElement(name = "PermissionsInstallPackaging", nillable = true)
    protected Boolean permissionsInstallPackaging;
    @XmlElement(name = "PermissionsManageAnalyticSnapshots", nillable = true)
    protected Boolean permissionsManageAnalyticSnapshots;
    @XmlElement(name = "PermissionsManageAuthProviders", nillable = true)
    protected Boolean permissionsManageAuthProviders;
    @XmlElement(name = "PermissionsManageBusinessHourHolidays", nillable = true)
    protected Boolean permissionsManageBusinessHourHolidays;
    @XmlElement(name = "PermissionsManageCallCenters", nillable = true)
    protected Boolean permissionsManageCallCenters;
    @XmlElement(name = "PermissionsManageCases", nillable = true)
    protected Boolean permissionsManageCases;
    @XmlElement(name = "PermissionsManageCategories", nillable = true)
    protected Boolean permissionsManageCategories;
    @XmlElement(name = "PermissionsManageContentPermissions", nillable = true)
    protected Boolean permissionsManageContentPermissions;
    @XmlElement(name = "PermissionsManageContentProperties", nillable = true)
    protected Boolean permissionsManageContentProperties;
    @XmlElement(name = "PermissionsManageContentTypes", nillable = true)
    protected Boolean permissionsManageContentTypes;
    @XmlElement(name = "PermissionsManageCssUsers", nillable = true)
    protected Boolean permissionsManageCssUsers;
    @XmlElement(name = "PermissionsManageCustomPermissions", nillable = true)
    protected Boolean permissionsManageCustomPermissions;
    @XmlElement(name = "PermissionsManageCustomReportTypes", nillable = true)
    protected Boolean permissionsManageCustomReportTypes;
    @XmlElement(name = "PermissionsManageDashboards", nillable = true)
    protected Boolean permissionsManageDashboards;
    @XmlElement(name = "PermissionsManageDataCategories", nillable = true)
    protected Boolean permissionsManageDataCategories;
    @XmlElement(name = "PermissionsManageDataIntegrations", nillable = true)
    protected Boolean permissionsManageDataIntegrations;
    @XmlElement(name = "PermissionsManageDynamicDashboards", nillable = true)
    protected Boolean permissionsManageDynamicDashboards;
    @XmlElement(name = "PermissionsManageEmailClientConfig", nillable = true)
    protected Boolean permissionsManageEmailClientConfig;
    @XmlElement(name = "PermissionsManageInteraction", nillable = true)
    protected Boolean permissionsManageInteraction;
    @XmlElement(name = "PermissionsManageInternalUsers", nillable = true)
    protected Boolean permissionsManageInternalUsers;
    @XmlElement(name = "PermissionsManageIpAddresses", nillable = true)
    protected Boolean permissionsManageIpAddresses;
    @XmlElement(name = "PermissionsManageKnowledge", nillable = true)
    protected Boolean permissionsManageKnowledge;
    @XmlElement(name = "PermissionsManageKnowledgeImportExport", nillable = true)
    protected Boolean permissionsManageKnowledgeImportExport;
    @XmlElement(name = "PermissionsManageLeads", nillable = true)
    protected Boolean permissionsManageLeads;
    @XmlElement(name = "PermissionsManageLoginAccessPolicies", nillable = true)
    protected Boolean permissionsManageLoginAccessPolicies;
    @XmlElement(name = "PermissionsManageMobile", nillable = true)
    protected Boolean permissionsManageMobile;
    @XmlElement(name = "PermissionsManageNetworks", nillable = true)
    protected Boolean permissionsManageNetworks;
    @XmlElement(name = "PermissionsManagePasswordPolicies", nillable = true)
    protected Boolean permissionsManagePasswordPolicies;
    @XmlElement(name = "PermissionsManageProfilesPermissionsets", nillable = true)
    protected Boolean permissionsManageProfilesPermissionsets;
    @XmlElement(name = "PermissionsManageRemoteAccess", nillable = true)
    protected Boolean permissionsManageRemoteAccess;
    @XmlElement(name = "PermissionsManageRoles", nillable = true)
    protected Boolean permissionsManageRoles;
    @XmlElement(name = "PermissionsManageSearchPromotionRules", nillable = true)
    protected Boolean permissionsManageSearchPromotionRules;
    @XmlElement(name = "PermissionsManageSelfService", nillable = true)
    protected Boolean permissionsManageSelfService;
    @XmlElement(name = "PermissionsManageSharing", nillable = true)
    protected Boolean permissionsManageSharing;
    @XmlElement(name = "PermissionsManageSolutions", nillable = true)
    protected Boolean permissionsManageSolutions;
    @XmlElement(name = "PermissionsManageSynonyms", nillable = true)
    protected Boolean permissionsManageSynonyms;
    @XmlElement(name = "PermissionsManageTwoFactor", nillable = true)
    protected Boolean permissionsManageTwoFactor;
    @XmlElement(name = "PermissionsManageUsers", nillable = true)
    protected Boolean permissionsManageUsers;
    @XmlElement(name = "PermissionsMassInlineEdit", nillable = true)
    protected Boolean permissionsMassInlineEdit;
    @XmlElement(name = "PermissionsModifyAllData", nillable = true)
    protected Boolean permissionsModifyAllData;
    @XmlElement(name = "PermissionsModifySecureAgents", nillable = true)
    protected Boolean permissionsModifySecureAgents;
    @XmlElement(name = "PermissionsNewReportBuilder", nillable = true)
    protected Boolean permissionsNewReportBuilder;
    @XmlElement(name = "PermissionsPasswordNeverExpires", nillable = true)
    protected Boolean permissionsPasswordNeverExpires;
    @XmlElement(name = "PermissionsPublishPackaging", nillable = true)
    protected Boolean permissionsPublishPackaging;
    @XmlElement(name = "PermissionsResetPasswords", nillable = true)
    protected Boolean permissionsResetPasswords;
    @XmlElement(name = "PermissionsRunFlow", nillable = true)
    protected Boolean permissionsRunFlow;
    @XmlElement(name = "PermissionsRunReports", nillable = true)
    protected Boolean permissionsRunReports;
    @XmlElement(name = "PermissionsSalesConsole", nillable = true)
    protected Boolean permissionsSalesConsole;
    @XmlElement(name = "PermissionsScheduleReports", nillable = true)
    protected Boolean permissionsScheduleReports;
    @XmlElement(name = "PermissionsSendSitRequests", nillable = true)
    protected Boolean permissionsSendSitRequests;
    @XmlElement(name = "PermissionsSolutionImport", nillable = true)
    protected Boolean permissionsSolutionImport;
    @XmlElement(name = "PermissionsTransferAnyCase", nillable = true)
    protected Boolean permissionsTransferAnyCase;
    @XmlElement(name = "PermissionsTransferAnyEntity", nillable = true)
    protected Boolean permissionsTransferAnyEntity;
    @XmlElement(name = "PermissionsTransferAnyLead", nillable = true)
    protected Boolean permissionsTransferAnyLead;
    @XmlElement(name = "PermissionsTwoFactorApi", nillable = true)
    protected Boolean permissionsTwoFactorApi;
    @XmlElement(name = "PermissionsUseTeamReassignWizards", nillable = true)
    protected Boolean permissionsUseTeamReassignWizards;
    @XmlElement(name = "PermissionsViewAllData", nillable = true)
    protected Boolean permissionsViewAllData;
    @XmlElement(name = "PermissionsViewAllUsers", nillable = true)
    protected Boolean permissionsViewAllUsers;
    @XmlElement(name = "PermissionsViewContent", nillable = true)
    protected Boolean permissionsViewContent;
    @XmlElement(name = "PermissionsViewDataCategories", nillable = true)
    protected Boolean permissionsViewDataCategories;
    @XmlElement(name = "PermissionsViewEncryptedData", nillable = true)
    protected Boolean permissionsViewEncryptedData;
    @XmlElement(name = "PermissionsViewEventLogFiles", nillable = true)
    protected Boolean permissionsViewEventLogFiles;
    @XmlElement(name = "PermissionsViewHelpLink", nillable = true)
    protected Boolean permissionsViewHelpLink;
    @XmlElement(name = "PermissionsViewMyTeamsDashboards", nillable = true)
    protected Boolean permissionsViewMyTeamsDashboards;
    @XmlElement(name = "PermissionsViewSetup", nillable = true)
    protected Boolean permissionsViewSetup;
    @XmlElement(name = "PermissionsWorkCalibrationUser", nillable = true)
    protected Boolean permissionsWorkCalibrationUser;
    @XmlElement(name = "PermissionsWorkDotComUserPerm", nillable = true)
    protected Boolean permissionsWorkDotComUserPerm;
    @XmlElement(name = "Profile", nillable = true)
    protected Profile profile;
    @XmlElement(name = "ProfileId", nillable = true)
    protected String profileId;
    @XmlElement(name = "SetupEntityAccessItems", nillable = true)
    protected QueryResultType setupEntityAccessItems;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "UserLicense", nillable = true)
    protected UserLicense userLicense;
    @XmlElement(name = "UserLicenseId", nillable = true)
    protected String userLicenseId;

    /**
     * Gets the value of the assignments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getAssignments() {
        return assignments;
    }

    /**
     * Sets the value of the assignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setAssignments(QueryResultType value) {
        this.assignments = value;
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
     * Gets the value of the fieldPerms property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getFieldPerms() {
        return fieldPerms;
    }

    /**
     * Sets the value of the fieldPerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setFieldPerms(QueryResultType value) {
        this.fieldPerms = value;
    }

    /**
     * Gets the value of the isOwnedByProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwnedByProfile() {
        return isOwnedByProfile;
    }

    /**
     * Sets the value of the isOwnedByProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwnedByProfile(Boolean value) {
        this.isOwnedByProfile = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefix(String value) {
        this.namespacePrefix = value;
    }

    /**
     * Gets the value of the objectPerms property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getObjectPerms() {
        return objectPerms;
    }

    /**
     * Sets the value of the objectPerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setObjectPerms(QueryResultType value) {
        this.objectPerms = value;
    }

    /**
     * Gets the value of the permissionsActivateContract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsActivateContract() {
        return permissionsActivateContract;
    }

    /**
     * Sets the value of the permissionsActivateContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsActivateContract(Boolean value) {
        this.permissionsActivateContract = value;
    }

    /**
     * Gets the value of the permissionsActivateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsActivateOrder() {
        return permissionsActivateOrder;
    }

    /**
     * Sets the value of the permissionsActivateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsActivateOrder(Boolean value) {
        this.permissionsActivateOrder = value;
    }

    /**
     * Gets the value of the permissionsAllowUniversalSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsAllowUniversalSearch() {
        return permissionsAllowUniversalSearch;
    }

    /**
     * Sets the value of the permissionsAllowUniversalSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsAllowUniversalSearch(Boolean value) {
        this.permissionsAllowUniversalSearch = value;
    }

    /**
     * Gets the value of the permissionsAllowViewKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsAllowViewKnowledge() {
        return permissionsAllowViewKnowledge;
    }

    /**
     * Sets the value of the permissionsAllowViewKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsAllowViewKnowledge(Boolean value) {
        this.permissionsAllowViewKnowledge = value;
    }

    /**
     * Gets the value of the permissionsApiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsApiEnabled() {
        return permissionsApiEnabled;
    }

    /**
     * Sets the value of the permissionsApiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsApiEnabled(Boolean value) {
        this.permissionsApiEnabled = value;
    }

    /**
     * Gets the value of the permissionsAssignPermissionSets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsAssignPermissionSets() {
        return permissionsAssignPermissionSets;
    }

    /**
     * Sets the value of the permissionsAssignPermissionSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsAssignPermissionSets(Boolean value) {
        this.permissionsAssignPermissionSets = value;
    }

    /**
     * Gets the value of the permissionsAssignTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsAssignTopics() {
        return permissionsAssignTopics;
    }

    /**
     * Sets the value of the permissionsAssignTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsAssignTopics(Boolean value) {
        this.permissionsAssignTopics = value;
    }

    /**
     * Gets the value of the permissionsAuthorApex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsAuthorApex() {
        return permissionsAuthorApex;
    }

    /**
     * Sets the value of the permissionsAuthorApex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsAuthorApex(Boolean value) {
        this.permissionsAuthorApex = value;
    }

    /**
     * Gets the value of the permissionsBulkApiHardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsBulkApiHardDelete() {
        return permissionsBulkApiHardDelete;
    }

    /**
     * Sets the value of the permissionsBulkApiHardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsBulkApiHardDelete(Boolean value) {
        this.permissionsBulkApiHardDelete = value;
    }

    /**
     * Gets the value of the permissionsCanUseNewDashboardBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCanUseNewDashboardBuilder() {
        return permissionsCanUseNewDashboardBuilder;
    }

    /**
     * Sets the value of the permissionsCanUseNewDashboardBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCanUseNewDashboardBuilder(Boolean value) {
        this.permissionsCanUseNewDashboardBuilder = value;
    }

    /**
     * Gets the value of the permissionsConnectOrgToEnvironmentHub property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsConnectOrgToEnvironmentHub() {
        return permissionsConnectOrgToEnvironmentHub;
    }

    /**
     * Sets the value of the permissionsConnectOrgToEnvironmentHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsConnectOrgToEnvironmentHub(Boolean value) {
        this.permissionsConnectOrgToEnvironmentHub = value;
    }

    /**
     * Gets the value of the permissionsContentAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsContentAdministrator() {
        return permissionsContentAdministrator;
    }

    /**
     * Sets the value of the permissionsContentAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsContentAdministrator(Boolean value) {
        this.permissionsContentAdministrator = value;
    }

    /**
     * Gets the value of the permissionsConvertLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsConvertLeads() {
        return permissionsConvertLeads;
    }

    /**
     * Sets the value of the permissionsConvertLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsConvertLeads(Boolean value) {
        this.permissionsConvertLeads = value;
    }

    /**
     * Gets the value of the permissionsCreateCustomizeFilters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCreateCustomizeFilters() {
        return permissionsCreateCustomizeFilters;
    }

    /**
     * Sets the value of the permissionsCreateCustomizeFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCreateCustomizeFilters(Boolean value) {
        this.permissionsCreateCustomizeFilters = value;
    }

    /**
     * Gets the value of the permissionsCreatePackaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCreatePackaging() {
        return permissionsCreatePackaging;
    }

    /**
     * Sets the value of the permissionsCreatePackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCreatePackaging(Boolean value) {
        this.permissionsCreatePackaging = value;
    }

    /**
     * Gets the value of the permissionsCreateTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCreateTopics() {
        return permissionsCreateTopics;
    }

    /**
     * Sets the value of the permissionsCreateTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCreateTopics(Boolean value) {
        this.permissionsCreateTopics = value;
    }

    /**
     * Gets the value of the permissionsCreateWorkBadgeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCreateWorkBadgeDefinition() {
        return permissionsCreateWorkBadgeDefinition;
    }

    /**
     * Sets the value of the permissionsCreateWorkBadgeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCreateWorkBadgeDefinition(Boolean value) {
        this.permissionsCreateWorkBadgeDefinition = value;
    }

    /**
     * Gets the value of the permissionsCreateWorkspaces property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCreateWorkspaces() {
        return permissionsCreateWorkspaces;
    }

    /**
     * Sets the value of the permissionsCreateWorkspaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCreateWorkspaces(Boolean value) {
        this.permissionsCreateWorkspaces = value;
    }

    /**
     * Gets the value of the permissionsCustomMobileAppsAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCustomMobileAppsAccess() {
        return permissionsCustomMobileAppsAccess;
    }

    /**
     * Sets the value of the permissionsCustomMobileAppsAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCustomMobileAppsAccess(Boolean value) {
        this.permissionsCustomMobileAppsAccess = value;
    }

    /**
     * Gets the value of the permissionsCustomSidebarOnAllPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCustomSidebarOnAllPages() {
        return permissionsCustomSidebarOnAllPages;
    }

    /**
     * Sets the value of the permissionsCustomSidebarOnAllPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCustomSidebarOnAllPages(Boolean value) {
        this.permissionsCustomSidebarOnAllPages = value;
    }

    /**
     * Gets the value of the permissionsCustomizeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsCustomizeApplication() {
        return permissionsCustomizeApplication;
    }

    /**
     * Sets the value of the permissionsCustomizeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsCustomizeApplication(Boolean value) {
        this.permissionsCustomizeApplication = value;
    }

    /**
     * Gets the value of the permissionsDeleteActivatedContract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsDeleteActivatedContract() {
        return permissionsDeleteActivatedContract;
    }

    /**
     * Sets the value of the permissionsDeleteActivatedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsDeleteActivatedContract(Boolean value) {
        this.permissionsDeleteActivatedContract = value;
    }

    /**
     * Gets the value of the permissionsDeleteTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsDeleteTopics() {
        return permissionsDeleteTopics;
    }

    /**
     * Sets the value of the permissionsDeleteTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsDeleteTopics(Boolean value) {
        this.permissionsDeleteTopics = value;
    }

    /**
     * Gets the value of the permissionsDistributeFromPersWksp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsDistributeFromPersWksp() {
        return permissionsDistributeFromPersWksp;
    }

    /**
     * Sets the value of the permissionsDistributeFromPersWksp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsDistributeFromPersWksp(Boolean value) {
        this.permissionsDistributeFromPersWksp = value;
    }

    /**
     * Gets the value of the permissionsEditActivatedOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditActivatedOrders() {
        return permissionsEditActivatedOrders;
    }

    /**
     * Sets the value of the permissionsEditActivatedOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditActivatedOrders(Boolean value) {
        this.permissionsEditActivatedOrders = value;
    }

    /**
     * Gets the value of the permissionsEditBrandTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditBrandTemplates() {
        return permissionsEditBrandTemplates;
    }

    /**
     * Sets the value of the permissionsEditBrandTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditBrandTemplates(Boolean value) {
        this.permissionsEditBrandTemplates = value;
    }

    /**
     * Gets the value of the permissionsEditCaseComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditCaseComments() {
        return permissionsEditCaseComments;
    }

    /**
     * Sets the value of the permissionsEditCaseComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditCaseComments(Boolean value) {
        this.permissionsEditCaseComments = value;
    }

    /**
     * Gets the value of the permissionsEditEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditEvent() {
        return permissionsEditEvent;
    }

    /**
     * Sets the value of the permissionsEditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditEvent(Boolean value) {
        this.permissionsEditEvent = value;
    }

    /**
     * Gets the value of the permissionsEditHtmlTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditHtmlTemplates() {
        return permissionsEditHtmlTemplates;
    }

    /**
     * Sets the value of the permissionsEditHtmlTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditHtmlTemplates(Boolean value) {
        this.permissionsEditHtmlTemplates = value;
    }

    /**
     * Gets the value of the permissionsEditKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditKnowledge() {
        return permissionsEditKnowledge;
    }

    /**
     * Sets the value of the permissionsEditKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditKnowledge(Boolean value) {
        this.permissionsEditKnowledge = value;
    }

    /**
     * Gets the value of the permissionsEditOppLineItemUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditOppLineItemUnitPrice() {
        return permissionsEditOppLineItemUnitPrice;
    }

    /**
     * Sets the value of the permissionsEditOppLineItemUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditOppLineItemUnitPrice(Boolean value) {
        this.permissionsEditOppLineItemUnitPrice = value;
    }

    /**
     * Gets the value of the permissionsEditPublicDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditPublicDocuments() {
        return permissionsEditPublicDocuments;
    }

    /**
     * Sets the value of the permissionsEditPublicDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditPublicDocuments(Boolean value) {
        this.permissionsEditPublicDocuments = value;
    }

    /**
     * Gets the value of the permissionsEditPublicTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditPublicTemplates() {
        return permissionsEditPublicTemplates;
    }

    /**
     * Sets the value of the permissionsEditPublicTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditPublicTemplates(Boolean value) {
        this.permissionsEditPublicTemplates = value;
    }

    /**
     * Gets the value of the permissionsEditReadonlyFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditReadonlyFields() {
        return permissionsEditReadonlyFields;
    }

    /**
     * Sets the value of the permissionsEditReadonlyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditReadonlyFields(Boolean value) {
        this.permissionsEditReadonlyFields = value;
    }

    /**
     * Gets the value of the permissionsEditReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditReports() {
        return permissionsEditReports;
    }

    /**
     * Sets the value of the permissionsEditReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditReports(Boolean value) {
        this.permissionsEditReports = value;
    }

    /**
     * Gets the value of the permissionsEditTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditTask() {
        return permissionsEditTask;
    }

    /**
     * Sets the value of the permissionsEditTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditTask(Boolean value) {
        this.permissionsEditTask = value;
    }

    /**
     * Gets the value of the permissionsEditTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEditTopics() {
        return permissionsEditTopics;
    }

    /**
     * Sets the value of the permissionsEditTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEditTopics(Boolean value) {
        this.permissionsEditTopics = value;
    }

    /**
     * Gets the value of the permissionsEmailAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEmailAdministration() {
        return permissionsEmailAdministration;
    }

    /**
     * Sets the value of the permissionsEmailAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEmailAdministration(Boolean value) {
        this.permissionsEmailAdministration = value;
    }

    /**
     * Gets the value of the permissionsEmailMass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEmailMass() {
        return permissionsEmailMass;
    }

    /**
     * Sets the value of the permissionsEmailMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEmailMass(Boolean value) {
        this.permissionsEmailMass = value;
    }

    /**
     * Gets the value of the permissionsEmailSingle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEmailSingle() {
        return permissionsEmailSingle;
    }

    /**
     * Sets the value of the permissionsEmailSingle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEmailSingle(Boolean value) {
        this.permissionsEmailSingle = value;
    }

    /**
     * Gets the value of the permissionsEmailTemplateManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEmailTemplateManagement() {
        return permissionsEmailTemplateManagement;
    }

    /**
     * Sets the value of the permissionsEmailTemplateManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEmailTemplateManagement(Boolean value) {
        this.permissionsEmailTemplateManagement = value;
    }

    /**
     * Gets the value of the permissionsEnableNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsEnableNotifications() {
        return permissionsEnableNotifications;
    }

    /**
     * Sets the value of the permissionsEnableNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsEnableNotifications(Boolean value) {
        this.permissionsEnableNotifications = value;
    }

    /**
     * Gets the value of the permissionsExportReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsExportReport() {
        return permissionsExportReport;
    }

    /**
     * Sets the value of the permissionsExportReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsExportReport(Boolean value) {
        this.permissionsExportReport = value;
    }

    /**
     * Gets the value of the permissionsFlowUFLRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsFlowUFLRequired() {
        return permissionsFlowUFLRequired;
    }

    /**
     * Sets the value of the permissionsFlowUFLRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsFlowUFLRequired(Boolean value) {
        this.permissionsFlowUFLRequired = value;
    }

    /**
     * Gets the value of the permissionsForceTwoFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsForceTwoFactor() {
        return permissionsForceTwoFactor;
    }

    /**
     * Sets the value of the permissionsForceTwoFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsForceTwoFactor(Boolean value) {
        this.permissionsForceTwoFactor = value;
    }

    /**
     * Gets the value of the permissionsGovernNetworks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsGovernNetworks() {
        return permissionsGovernNetworks;
    }

    /**
     * Sets the value of the permissionsGovernNetworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsGovernNetworks(Boolean value) {
        this.permissionsGovernNetworks = value;
    }

    /**
     * Gets the value of the permissionsIdentityConnect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsIdentityConnect() {
        return permissionsIdentityConnect;
    }

    /**
     * Sets the value of the permissionsIdentityConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsIdentityConnect(Boolean value) {
        this.permissionsIdentityConnect = value;
    }

    /**
     * Gets the value of the permissionsIdentityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsIdentityEnabled() {
        return permissionsIdentityEnabled;
    }

    /**
     * Sets the value of the permissionsIdentityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsIdentityEnabled(Boolean value) {
        this.permissionsIdentityEnabled = value;
    }

    /**
     * Gets the value of the permissionsImportLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsImportLeads() {
        return permissionsImportLeads;
    }

    /**
     * Sets the value of the permissionsImportLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsImportLeads(Boolean value) {
        this.permissionsImportLeads = value;
    }

    /**
     * Gets the value of the permissionsImportPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsImportPersonal() {
        return permissionsImportPersonal;
    }

    /**
     * Sets the value of the permissionsImportPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsImportPersonal(Boolean value) {
        this.permissionsImportPersonal = value;
    }

    /**
     * Gets the value of the permissionsInstallPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsInstallPackaging() {
        return permissionsInstallPackaging;
    }

    /**
     * Sets the value of the permissionsInstallPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsInstallPackaging(Boolean value) {
        this.permissionsInstallPackaging = value;
    }

    /**
     * Gets the value of the permissionsManageAnalyticSnapshots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageAnalyticSnapshots() {
        return permissionsManageAnalyticSnapshots;
    }

    /**
     * Sets the value of the permissionsManageAnalyticSnapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageAnalyticSnapshots(Boolean value) {
        this.permissionsManageAnalyticSnapshots = value;
    }

    /**
     * Gets the value of the permissionsManageAuthProviders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageAuthProviders() {
        return permissionsManageAuthProviders;
    }

    /**
     * Sets the value of the permissionsManageAuthProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageAuthProviders(Boolean value) {
        this.permissionsManageAuthProviders = value;
    }

    /**
     * Gets the value of the permissionsManageBusinessHourHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageBusinessHourHolidays() {
        return permissionsManageBusinessHourHolidays;
    }

    /**
     * Sets the value of the permissionsManageBusinessHourHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageBusinessHourHolidays(Boolean value) {
        this.permissionsManageBusinessHourHolidays = value;
    }

    /**
     * Gets the value of the permissionsManageCallCenters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCallCenters() {
        return permissionsManageCallCenters;
    }

    /**
     * Sets the value of the permissionsManageCallCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCallCenters(Boolean value) {
        this.permissionsManageCallCenters = value;
    }

    /**
     * Gets the value of the permissionsManageCases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCases() {
        return permissionsManageCases;
    }

    /**
     * Sets the value of the permissionsManageCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCases(Boolean value) {
        this.permissionsManageCases = value;
    }

    /**
     * Gets the value of the permissionsManageCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCategories() {
        return permissionsManageCategories;
    }

    /**
     * Sets the value of the permissionsManageCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCategories(Boolean value) {
        this.permissionsManageCategories = value;
    }

    /**
     * Gets the value of the permissionsManageContentPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageContentPermissions() {
        return permissionsManageContentPermissions;
    }

    /**
     * Sets the value of the permissionsManageContentPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageContentPermissions(Boolean value) {
        this.permissionsManageContentPermissions = value;
    }

    /**
     * Gets the value of the permissionsManageContentProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageContentProperties() {
        return permissionsManageContentProperties;
    }

    /**
     * Sets the value of the permissionsManageContentProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageContentProperties(Boolean value) {
        this.permissionsManageContentProperties = value;
    }

    /**
     * Gets the value of the permissionsManageContentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageContentTypes() {
        return permissionsManageContentTypes;
    }

    /**
     * Sets the value of the permissionsManageContentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageContentTypes(Boolean value) {
        this.permissionsManageContentTypes = value;
    }

    /**
     * Gets the value of the permissionsManageCssUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCssUsers() {
        return permissionsManageCssUsers;
    }

    /**
     * Sets the value of the permissionsManageCssUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCssUsers(Boolean value) {
        this.permissionsManageCssUsers = value;
    }

    /**
     * Gets the value of the permissionsManageCustomPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCustomPermissions() {
        return permissionsManageCustomPermissions;
    }

    /**
     * Sets the value of the permissionsManageCustomPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCustomPermissions(Boolean value) {
        this.permissionsManageCustomPermissions = value;
    }

    /**
     * Gets the value of the permissionsManageCustomReportTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageCustomReportTypes() {
        return permissionsManageCustomReportTypes;
    }

    /**
     * Sets the value of the permissionsManageCustomReportTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageCustomReportTypes(Boolean value) {
        this.permissionsManageCustomReportTypes = value;
    }

    /**
     * Gets the value of the permissionsManageDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDashboards() {
        return permissionsManageDashboards;
    }

    /**
     * Sets the value of the permissionsManageDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDashboards(Boolean value) {
        this.permissionsManageDashboards = value;
    }

    /**
     * Gets the value of the permissionsManageDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDataCategories() {
        return permissionsManageDataCategories;
    }

    /**
     * Sets the value of the permissionsManageDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDataCategories(Boolean value) {
        this.permissionsManageDataCategories = value;
    }

    /**
     * Gets the value of the permissionsManageDataIntegrations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDataIntegrations() {
        return permissionsManageDataIntegrations;
    }

    /**
     * Sets the value of the permissionsManageDataIntegrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDataIntegrations(Boolean value) {
        this.permissionsManageDataIntegrations = value;
    }

    /**
     * Gets the value of the permissionsManageDynamicDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageDynamicDashboards() {
        return permissionsManageDynamicDashboards;
    }

    /**
     * Sets the value of the permissionsManageDynamicDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageDynamicDashboards(Boolean value) {
        this.permissionsManageDynamicDashboards = value;
    }

    /**
     * Gets the value of the permissionsManageEmailClientConfig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageEmailClientConfig() {
        return permissionsManageEmailClientConfig;
    }

    /**
     * Sets the value of the permissionsManageEmailClientConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageEmailClientConfig(Boolean value) {
        this.permissionsManageEmailClientConfig = value;
    }

    /**
     * Gets the value of the permissionsManageInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageInteraction() {
        return permissionsManageInteraction;
    }

    /**
     * Sets the value of the permissionsManageInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageInteraction(Boolean value) {
        this.permissionsManageInteraction = value;
    }

    /**
     * Gets the value of the permissionsManageInternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageInternalUsers() {
        return permissionsManageInternalUsers;
    }

    /**
     * Sets the value of the permissionsManageInternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageInternalUsers(Boolean value) {
        this.permissionsManageInternalUsers = value;
    }

    /**
     * Gets the value of the permissionsManageIpAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageIpAddresses() {
        return permissionsManageIpAddresses;
    }

    /**
     * Sets the value of the permissionsManageIpAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageIpAddresses(Boolean value) {
        this.permissionsManageIpAddresses = value;
    }

    /**
     * Gets the value of the permissionsManageKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageKnowledge() {
        return permissionsManageKnowledge;
    }

    /**
     * Sets the value of the permissionsManageKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageKnowledge(Boolean value) {
        this.permissionsManageKnowledge = value;
    }

    /**
     * Gets the value of the permissionsManageKnowledgeImportExport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageKnowledgeImportExport() {
        return permissionsManageKnowledgeImportExport;
    }

    /**
     * Sets the value of the permissionsManageKnowledgeImportExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageKnowledgeImportExport(Boolean value) {
        this.permissionsManageKnowledgeImportExport = value;
    }

    /**
     * Gets the value of the permissionsManageLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageLeads() {
        return permissionsManageLeads;
    }

    /**
     * Sets the value of the permissionsManageLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageLeads(Boolean value) {
        this.permissionsManageLeads = value;
    }

    /**
     * Gets the value of the permissionsManageLoginAccessPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageLoginAccessPolicies() {
        return permissionsManageLoginAccessPolicies;
    }

    /**
     * Sets the value of the permissionsManageLoginAccessPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageLoginAccessPolicies(Boolean value) {
        this.permissionsManageLoginAccessPolicies = value;
    }

    /**
     * Gets the value of the permissionsManageMobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageMobile() {
        return permissionsManageMobile;
    }

    /**
     * Sets the value of the permissionsManageMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageMobile(Boolean value) {
        this.permissionsManageMobile = value;
    }

    /**
     * Gets the value of the permissionsManageNetworks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageNetworks() {
        return permissionsManageNetworks;
    }

    /**
     * Sets the value of the permissionsManageNetworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageNetworks(Boolean value) {
        this.permissionsManageNetworks = value;
    }

    /**
     * Gets the value of the permissionsManagePasswordPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManagePasswordPolicies() {
        return permissionsManagePasswordPolicies;
    }

    /**
     * Sets the value of the permissionsManagePasswordPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManagePasswordPolicies(Boolean value) {
        this.permissionsManagePasswordPolicies = value;
    }

    /**
     * Gets the value of the permissionsManageProfilesPermissionsets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageProfilesPermissionsets() {
        return permissionsManageProfilesPermissionsets;
    }

    /**
     * Sets the value of the permissionsManageProfilesPermissionsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageProfilesPermissionsets(Boolean value) {
        this.permissionsManageProfilesPermissionsets = value;
    }

    /**
     * Gets the value of the permissionsManageRemoteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageRemoteAccess() {
        return permissionsManageRemoteAccess;
    }

    /**
     * Sets the value of the permissionsManageRemoteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageRemoteAccess(Boolean value) {
        this.permissionsManageRemoteAccess = value;
    }

    /**
     * Gets the value of the permissionsManageRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageRoles() {
        return permissionsManageRoles;
    }

    /**
     * Sets the value of the permissionsManageRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageRoles(Boolean value) {
        this.permissionsManageRoles = value;
    }

    /**
     * Gets the value of the permissionsManageSearchPromotionRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageSearchPromotionRules() {
        return permissionsManageSearchPromotionRules;
    }

    /**
     * Sets the value of the permissionsManageSearchPromotionRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageSearchPromotionRules(Boolean value) {
        this.permissionsManageSearchPromotionRules = value;
    }

    /**
     * Gets the value of the permissionsManageSelfService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageSelfService() {
        return permissionsManageSelfService;
    }

    /**
     * Sets the value of the permissionsManageSelfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageSelfService(Boolean value) {
        this.permissionsManageSelfService = value;
    }

    /**
     * Gets the value of the permissionsManageSharing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageSharing() {
        return permissionsManageSharing;
    }

    /**
     * Sets the value of the permissionsManageSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageSharing(Boolean value) {
        this.permissionsManageSharing = value;
    }

    /**
     * Gets the value of the permissionsManageSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageSolutions() {
        return permissionsManageSolutions;
    }

    /**
     * Sets the value of the permissionsManageSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageSolutions(Boolean value) {
        this.permissionsManageSolutions = value;
    }

    /**
     * Gets the value of the permissionsManageSynonyms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageSynonyms() {
        return permissionsManageSynonyms;
    }

    /**
     * Sets the value of the permissionsManageSynonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageSynonyms(Boolean value) {
        this.permissionsManageSynonyms = value;
    }

    /**
     * Gets the value of the permissionsManageTwoFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageTwoFactor() {
        return permissionsManageTwoFactor;
    }

    /**
     * Sets the value of the permissionsManageTwoFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageTwoFactor(Boolean value) {
        this.permissionsManageTwoFactor = value;
    }

    /**
     * Gets the value of the permissionsManageUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsManageUsers() {
        return permissionsManageUsers;
    }

    /**
     * Sets the value of the permissionsManageUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsManageUsers(Boolean value) {
        this.permissionsManageUsers = value;
    }

    /**
     * Gets the value of the permissionsMassInlineEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsMassInlineEdit() {
        return permissionsMassInlineEdit;
    }

    /**
     * Sets the value of the permissionsMassInlineEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsMassInlineEdit(Boolean value) {
        this.permissionsMassInlineEdit = value;
    }

    /**
     * Gets the value of the permissionsModifyAllData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsModifyAllData() {
        return permissionsModifyAllData;
    }

    /**
     * Sets the value of the permissionsModifyAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsModifyAllData(Boolean value) {
        this.permissionsModifyAllData = value;
    }

    /**
     * Gets the value of the permissionsModifySecureAgents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsModifySecureAgents() {
        return permissionsModifySecureAgents;
    }

    /**
     * Sets the value of the permissionsModifySecureAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsModifySecureAgents(Boolean value) {
        this.permissionsModifySecureAgents = value;
    }

    /**
     * Gets the value of the permissionsNewReportBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsNewReportBuilder() {
        return permissionsNewReportBuilder;
    }

    /**
     * Sets the value of the permissionsNewReportBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsNewReportBuilder(Boolean value) {
        this.permissionsNewReportBuilder = value;
    }

    /**
     * Gets the value of the permissionsPasswordNeverExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsPasswordNeverExpires() {
        return permissionsPasswordNeverExpires;
    }

    /**
     * Sets the value of the permissionsPasswordNeverExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsPasswordNeverExpires(Boolean value) {
        this.permissionsPasswordNeverExpires = value;
    }

    /**
     * Gets the value of the permissionsPublishPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsPublishPackaging() {
        return permissionsPublishPackaging;
    }

    /**
     * Sets the value of the permissionsPublishPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsPublishPackaging(Boolean value) {
        this.permissionsPublishPackaging = value;
    }

    /**
     * Gets the value of the permissionsResetPasswords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsResetPasswords() {
        return permissionsResetPasswords;
    }

    /**
     * Sets the value of the permissionsResetPasswords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsResetPasswords(Boolean value) {
        this.permissionsResetPasswords = value;
    }

    /**
     * Gets the value of the permissionsRunFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsRunFlow() {
        return permissionsRunFlow;
    }

    /**
     * Sets the value of the permissionsRunFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsRunFlow(Boolean value) {
        this.permissionsRunFlow = value;
    }

    /**
     * Gets the value of the permissionsRunReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsRunReports() {
        return permissionsRunReports;
    }

    /**
     * Sets the value of the permissionsRunReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsRunReports(Boolean value) {
        this.permissionsRunReports = value;
    }

    /**
     * Gets the value of the permissionsSalesConsole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsSalesConsole() {
        return permissionsSalesConsole;
    }

    /**
     * Sets the value of the permissionsSalesConsole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsSalesConsole(Boolean value) {
        this.permissionsSalesConsole = value;
    }

    /**
     * Gets the value of the permissionsScheduleReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsScheduleReports() {
        return permissionsScheduleReports;
    }

    /**
     * Sets the value of the permissionsScheduleReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsScheduleReports(Boolean value) {
        this.permissionsScheduleReports = value;
    }

    /**
     * Gets the value of the permissionsSendSitRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsSendSitRequests() {
        return permissionsSendSitRequests;
    }

    /**
     * Sets the value of the permissionsSendSitRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsSendSitRequests(Boolean value) {
        this.permissionsSendSitRequests = value;
    }

    /**
     * Gets the value of the permissionsSolutionImport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsSolutionImport() {
        return permissionsSolutionImport;
    }

    /**
     * Sets the value of the permissionsSolutionImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsSolutionImport(Boolean value) {
        this.permissionsSolutionImport = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsTransferAnyCase() {
        return permissionsTransferAnyCase;
    }

    /**
     * Sets the value of the permissionsTransferAnyCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsTransferAnyCase(Boolean value) {
        this.permissionsTransferAnyCase = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsTransferAnyEntity() {
        return permissionsTransferAnyEntity;
    }

    /**
     * Sets the value of the permissionsTransferAnyEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsTransferAnyEntity(Boolean value) {
        this.permissionsTransferAnyEntity = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyLead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsTransferAnyLead() {
        return permissionsTransferAnyLead;
    }

    /**
     * Sets the value of the permissionsTransferAnyLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsTransferAnyLead(Boolean value) {
        this.permissionsTransferAnyLead = value;
    }

    /**
     * Gets the value of the permissionsTwoFactorApi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsTwoFactorApi() {
        return permissionsTwoFactorApi;
    }

    /**
     * Sets the value of the permissionsTwoFactorApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsTwoFactorApi(Boolean value) {
        this.permissionsTwoFactorApi = value;
    }

    /**
     * Gets the value of the permissionsUseTeamReassignWizards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsUseTeamReassignWizards() {
        return permissionsUseTeamReassignWizards;
    }

    /**
     * Sets the value of the permissionsUseTeamReassignWizards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsUseTeamReassignWizards(Boolean value) {
        this.permissionsUseTeamReassignWizards = value;
    }

    /**
     * Gets the value of the permissionsViewAllData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewAllData() {
        return permissionsViewAllData;
    }

    /**
     * Sets the value of the permissionsViewAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewAllData(Boolean value) {
        this.permissionsViewAllData = value;
    }

    /**
     * Gets the value of the permissionsViewAllUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewAllUsers() {
        return permissionsViewAllUsers;
    }

    /**
     * Sets the value of the permissionsViewAllUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewAllUsers(Boolean value) {
        this.permissionsViewAllUsers = value;
    }

    /**
     * Gets the value of the permissionsViewContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewContent() {
        return permissionsViewContent;
    }

    /**
     * Sets the value of the permissionsViewContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewContent(Boolean value) {
        this.permissionsViewContent = value;
    }

    /**
     * Gets the value of the permissionsViewDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewDataCategories() {
        return permissionsViewDataCategories;
    }

    /**
     * Sets the value of the permissionsViewDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewDataCategories(Boolean value) {
        this.permissionsViewDataCategories = value;
    }

    /**
     * Gets the value of the permissionsViewEncryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewEncryptedData() {
        return permissionsViewEncryptedData;
    }

    /**
     * Sets the value of the permissionsViewEncryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewEncryptedData(Boolean value) {
        this.permissionsViewEncryptedData = value;
    }

    /**
     * Gets the value of the permissionsViewEventLogFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewEventLogFiles() {
        return permissionsViewEventLogFiles;
    }

    /**
     * Sets the value of the permissionsViewEventLogFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewEventLogFiles(Boolean value) {
        this.permissionsViewEventLogFiles = value;
    }

    /**
     * Gets the value of the permissionsViewHelpLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewHelpLink() {
        return permissionsViewHelpLink;
    }

    /**
     * Sets the value of the permissionsViewHelpLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewHelpLink(Boolean value) {
        this.permissionsViewHelpLink = value;
    }

    /**
     * Gets the value of the permissionsViewMyTeamsDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewMyTeamsDashboards() {
        return permissionsViewMyTeamsDashboards;
    }

    /**
     * Sets the value of the permissionsViewMyTeamsDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewMyTeamsDashboards(Boolean value) {
        this.permissionsViewMyTeamsDashboards = value;
    }

    /**
     * Gets the value of the permissionsViewSetup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsViewSetup() {
        return permissionsViewSetup;
    }

    /**
     * Sets the value of the permissionsViewSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsViewSetup(Boolean value) {
        this.permissionsViewSetup = value;
    }

    /**
     * Gets the value of the permissionsWorkCalibrationUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsWorkCalibrationUser() {
        return permissionsWorkCalibrationUser;
    }

    /**
     * Sets the value of the permissionsWorkCalibrationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsWorkCalibrationUser(Boolean value) {
        this.permissionsWorkCalibrationUser = value;
    }

    /**
     * Gets the value of the permissionsWorkDotComUserPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionsWorkDotComUserPerm() {
        return permissionsWorkDotComUserPerm;
    }

    /**
     * Sets the value of the permissionsWorkDotComUserPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionsWorkDotComUserPerm(Boolean value) {
        this.permissionsWorkDotComUserPerm = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setProfile(Profile value) {
        this.profile = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the setupEntityAccessItems property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getSetupEntityAccessItems() {
        return setupEntityAccessItems;
    }

    /**
     * Sets the value of the setupEntityAccessItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setSetupEntityAccessItems(QueryResultType value) {
        this.setupEntityAccessItems = value;
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
     * Gets the value of the userLicense property.
     * 
     * @return
     *     possible object is
     *     {@link UserLicense }
     *     
     */
    public UserLicense getUserLicense() {
        return userLicense;
    }

    /**
     * Sets the value of the userLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLicense }
     *     
     */
    public void setUserLicense(UserLicense value) {
        this.userLicense = value;
    }

    /**
     * Gets the value of the userLicenseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLicenseId() {
        return userLicenseId;
    }

    /**
     * Sets the value of the userLicenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLicenseId(String value) {
        this.userLicenseId = value;
    }

}
