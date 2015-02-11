
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PermissionSetLicense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetLicense">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MasterLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsActivateContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsActivateOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAllowUniversalSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAllowViewKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsApiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAssignPermissionSets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAssignTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsAuthorApex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsBulkApiHardDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCanUseNewDashboardBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsConnectOrgToEnvironmentHub" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsContentAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsConvertLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreateCustomizeFilters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreatePackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreateTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreateWorkBadgeDefinition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCreateWorkspaces" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCustomMobileAppsAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCustomSidebarOnAllPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsCustomizeApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsDeleteActivatedContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsDeleteTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsDistributeFromPersWksp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditActivatedOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditBrandTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditCaseComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditHtmlTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditOppLineItemUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditPublicDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditPublicTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditReadonlyFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEditTopics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailAdministration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailMass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailSingle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEmailTemplateManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsEnableNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsExportReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsFlowUFLRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsForceTwoFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsGovernNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsIdentityConnect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsIdentityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsImportLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsImportPersonal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsInstallPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageAnalyticSnapshots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageAuthProviders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageBusinessHourHolidays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCallCenters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageContentPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageContentProperties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageContentTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCssUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCustomPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageCustomReportTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageDataIntegrations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageDynamicDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageEmailClientConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageInteraction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageInternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageIpAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageKnowledgeImportExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageLoginAccessPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManagePasswordPolicies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageProfilesPermissionsets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageRemoteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageRoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSearchPromotionRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSelfService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSharing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageSynonyms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageTwoFactor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsManageUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsMassInlineEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsModifyAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsModifySecureAgents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsNewReportBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsPasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsPublishPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsResetPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsRunFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsRunReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsSalesConsole" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsScheduleReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsSendSitRequests" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsSolutionImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTransferAnyCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTransferAnyEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTransferAnyLead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsTwoFactorApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsUseTeamReassignWizards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewAllUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewEncryptedData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewEventLogFiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewHelpLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewMyTeamsDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsViewSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsWorkCalibrationUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumPermissionsWorkDotComUserPerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionSetLicenseAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PermissionSetLicenseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UsedLicenses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetLicense", propOrder = {
    "createdBy",
    "createdById",
    "createdDate",
    "developerName",
    "expirationDate",
    "isDeleted",
    "language",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "masterLabel",
    "maximumPermissionsActivateContract",
    "maximumPermissionsActivateOrder",
    "maximumPermissionsAllowUniversalSearch",
    "maximumPermissionsAllowViewKnowledge",
    "maximumPermissionsApiEnabled",
    "maximumPermissionsAssignPermissionSets",
    "maximumPermissionsAssignTopics",
    "maximumPermissionsAuthorApex",
    "maximumPermissionsBulkApiHardDelete",
    "maximumPermissionsCanUseNewDashboardBuilder",
    "maximumPermissionsConnectOrgToEnvironmentHub",
    "maximumPermissionsContentAdministrator",
    "maximumPermissionsConvertLeads",
    "maximumPermissionsCreateCustomizeFilters",
    "maximumPermissionsCreatePackaging",
    "maximumPermissionsCreateTopics",
    "maximumPermissionsCreateWorkBadgeDefinition",
    "maximumPermissionsCreateWorkspaces",
    "maximumPermissionsCustomMobileAppsAccess",
    "maximumPermissionsCustomSidebarOnAllPages",
    "maximumPermissionsCustomizeApplication",
    "maximumPermissionsDeleteActivatedContract",
    "maximumPermissionsDeleteTopics",
    "maximumPermissionsDistributeFromPersWksp",
    "maximumPermissionsEditActivatedOrders",
    "maximumPermissionsEditBrandTemplates",
    "maximumPermissionsEditCaseComments",
    "maximumPermissionsEditEvent",
    "maximumPermissionsEditHtmlTemplates",
    "maximumPermissionsEditKnowledge",
    "maximumPermissionsEditOppLineItemUnitPrice",
    "maximumPermissionsEditPublicDocuments",
    "maximumPermissionsEditPublicTemplates",
    "maximumPermissionsEditReadonlyFields",
    "maximumPermissionsEditReports",
    "maximumPermissionsEditTask",
    "maximumPermissionsEditTopics",
    "maximumPermissionsEmailAdministration",
    "maximumPermissionsEmailMass",
    "maximumPermissionsEmailSingle",
    "maximumPermissionsEmailTemplateManagement",
    "maximumPermissionsEnableNotifications",
    "maximumPermissionsExportReport",
    "maximumPermissionsFlowUFLRequired",
    "maximumPermissionsForceTwoFactor",
    "maximumPermissionsGovernNetworks",
    "maximumPermissionsIdentityConnect",
    "maximumPermissionsIdentityEnabled",
    "maximumPermissionsImportLeads",
    "maximumPermissionsImportPersonal",
    "maximumPermissionsInstallPackaging",
    "maximumPermissionsManageAnalyticSnapshots",
    "maximumPermissionsManageAuthProviders",
    "maximumPermissionsManageBusinessHourHolidays",
    "maximumPermissionsManageCallCenters",
    "maximumPermissionsManageCases",
    "maximumPermissionsManageCategories",
    "maximumPermissionsManageContentPermissions",
    "maximumPermissionsManageContentProperties",
    "maximumPermissionsManageContentTypes",
    "maximumPermissionsManageCssUsers",
    "maximumPermissionsManageCustomPermissions",
    "maximumPermissionsManageCustomReportTypes",
    "maximumPermissionsManageDashboards",
    "maximumPermissionsManageDataCategories",
    "maximumPermissionsManageDataIntegrations",
    "maximumPermissionsManageDynamicDashboards",
    "maximumPermissionsManageEmailClientConfig",
    "maximumPermissionsManageInteraction",
    "maximumPermissionsManageInternalUsers",
    "maximumPermissionsManageIpAddresses",
    "maximumPermissionsManageKnowledge",
    "maximumPermissionsManageKnowledgeImportExport",
    "maximumPermissionsManageLeads",
    "maximumPermissionsManageLoginAccessPolicies",
    "maximumPermissionsManageMobile",
    "maximumPermissionsManageNetworks",
    "maximumPermissionsManagePasswordPolicies",
    "maximumPermissionsManageProfilesPermissionsets",
    "maximumPermissionsManageRemoteAccess",
    "maximumPermissionsManageRoles",
    "maximumPermissionsManageSearchPromotionRules",
    "maximumPermissionsManageSelfService",
    "maximumPermissionsManageSharing",
    "maximumPermissionsManageSolutions",
    "maximumPermissionsManageSynonyms",
    "maximumPermissionsManageTwoFactor",
    "maximumPermissionsManageUsers",
    "maximumPermissionsMassInlineEdit",
    "maximumPermissionsModifyAllData",
    "maximumPermissionsModifySecureAgents",
    "maximumPermissionsNewReportBuilder",
    "maximumPermissionsPasswordNeverExpires",
    "maximumPermissionsPublishPackaging",
    "maximumPermissionsResetPasswords",
    "maximumPermissionsRunFlow",
    "maximumPermissionsRunReports",
    "maximumPermissionsSalesConsole",
    "maximumPermissionsScheduleReports",
    "maximumPermissionsSendSitRequests",
    "maximumPermissionsSolutionImport",
    "maximumPermissionsTransferAnyCase",
    "maximumPermissionsTransferAnyEntity",
    "maximumPermissionsTransferAnyLead",
    "maximumPermissionsTwoFactorApi",
    "maximumPermissionsUseTeamReassignWizards",
    "maximumPermissionsViewAllData",
    "maximumPermissionsViewAllUsers",
    "maximumPermissionsViewContent",
    "maximumPermissionsViewDataCategories",
    "maximumPermissionsViewEncryptedData",
    "maximumPermissionsViewEventLogFiles",
    "maximumPermissionsViewHelpLink",
    "maximumPermissionsViewMyTeamsDashboards",
    "maximumPermissionsViewSetup",
    "maximumPermissionsWorkCalibrationUser",
    "maximumPermissionsWorkDotComUserPerm",
    "permissionSetLicenseAssignments",
    "permissionSetLicenseKey",
    "status",
    "systemModstamp",
    "totalLicenses",
    "usedLicenses"
})
public class PermissionSetLicense
    extends SObject
{

    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DeveloperName", nillable = true)
    protected String developerName;
    @XmlElement(name = "ExpirationDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "MasterLabel", nillable = true)
    protected String masterLabel;
    @XmlElement(name = "MaximumPermissionsActivateContract", nillable = true)
    protected Boolean maximumPermissionsActivateContract;
    @XmlElement(name = "MaximumPermissionsActivateOrder", nillable = true)
    protected Boolean maximumPermissionsActivateOrder;
    @XmlElement(name = "MaximumPermissionsAllowUniversalSearch", nillable = true)
    protected Boolean maximumPermissionsAllowUniversalSearch;
    @XmlElement(name = "MaximumPermissionsAllowViewKnowledge", nillable = true)
    protected Boolean maximumPermissionsAllowViewKnowledge;
    @XmlElement(name = "MaximumPermissionsApiEnabled", nillable = true)
    protected Boolean maximumPermissionsApiEnabled;
    @XmlElement(name = "MaximumPermissionsAssignPermissionSets", nillable = true)
    protected Boolean maximumPermissionsAssignPermissionSets;
    @XmlElement(name = "MaximumPermissionsAssignTopics", nillable = true)
    protected Boolean maximumPermissionsAssignTopics;
    @XmlElement(name = "MaximumPermissionsAuthorApex", nillable = true)
    protected Boolean maximumPermissionsAuthorApex;
    @XmlElement(name = "MaximumPermissionsBulkApiHardDelete", nillable = true)
    protected Boolean maximumPermissionsBulkApiHardDelete;
    @XmlElement(name = "MaximumPermissionsCanUseNewDashboardBuilder", nillable = true)
    protected Boolean maximumPermissionsCanUseNewDashboardBuilder;
    @XmlElement(name = "MaximumPermissionsConnectOrgToEnvironmentHub", nillable = true)
    protected Boolean maximumPermissionsConnectOrgToEnvironmentHub;
    @XmlElement(name = "MaximumPermissionsContentAdministrator", nillable = true)
    protected Boolean maximumPermissionsContentAdministrator;
    @XmlElement(name = "MaximumPermissionsConvertLeads", nillable = true)
    protected Boolean maximumPermissionsConvertLeads;
    @XmlElement(name = "MaximumPermissionsCreateCustomizeFilters", nillable = true)
    protected Boolean maximumPermissionsCreateCustomizeFilters;
    @XmlElement(name = "MaximumPermissionsCreatePackaging", nillable = true)
    protected Boolean maximumPermissionsCreatePackaging;
    @XmlElement(name = "MaximumPermissionsCreateTopics", nillable = true)
    protected Boolean maximumPermissionsCreateTopics;
    @XmlElement(name = "MaximumPermissionsCreateWorkBadgeDefinition", nillable = true)
    protected Boolean maximumPermissionsCreateWorkBadgeDefinition;
    @XmlElement(name = "MaximumPermissionsCreateWorkspaces", nillable = true)
    protected Boolean maximumPermissionsCreateWorkspaces;
    @XmlElement(name = "MaximumPermissionsCustomMobileAppsAccess", nillable = true)
    protected Boolean maximumPermissionsCustomMobileAppsAccess;
    @XmlElement(name = "MaximumPermissionsCustomSidebarOnAllPages", nillable = true)
    protected Boolean maximumPermissionsCustomSidebarOnAllPages;
    @XmlElement(name = "MaximumPermissionsCustomizeApplication", nillable = true)
    protected Boolean maximumPermissionsCustomizeApplication;
    @XmlElement(name = "MaximumPermissionsDeleteActivatedContract", nillable = true)
    protected Boolean maximumPermissionsDeleteActivatedContract;
    @XmlElement(name = "MaximumPermissionsDeleteTopics", nillable = true)
    protected Boolean maximumPermissionsDeleteTopics;
    @XmlElement(name = "MaximumPermissionsDistributeFromPersWksp", nillable = true)
    protected Boolean maximumPermissionsDistributeFromPersWksp;
    @XmlElement(name = "MaximumPermissionsEditActivatedOrders", nillable = true)
    protected Boolean maximumPermissionsEditActivatedOrders;
    @XmlElement(name = "MaximumPermissionsEditBrandTemplates", nillable = true)
    protected Boolean maximumPermissionsEditBrandTemplates;
    @XmlElement(name = "MaximumPermissionsEditCaseComments", nillable = true)
    protected Boolean maximumPermissionsEditCaseComments;
    @XmlElement(name = "MaximumPermissionsEditEvent", nillable = true)
    protected Boolean maximumPermissionsEditEvent;
    @XmlElement(name = "MaximumPermissionsEditHtmlTemplates", nillable = true)
    protected Boolean maximumPermissionsEditHtmlTemplates;
    @XmlElement(name = "MaximumPermissionsEditKnowledge", nillable = true)
    protected Boolean maximumPermissionsEditKnowledge;
    @XmlElement(name = "MaximumPermissionsEditOppLineItemUnitPrice", nillable = true)
    protected Boolean maximumPermissionsEditOppLineItemUnitPrice;
    @XmlElement(name = "MaximumPermissionsEditPublicDocuments", nillable = true)
    protected Boolean maximumPermissionsEditPublicDocuments;
    @XmlElement(name = "MaximumPermissionsEditPublicTemplates", nillable = true)
    protected Boolean maximumPermissionsEditPublicTemplates;
    @XmlElement(name = "MaximumPermissionsEditReadonlyFields", nillable = true)
    protected Boolean maximumPermissionsEditReadonlyFields;
    @XmlElement(name = "MaximumPermissionsEditReports", nillable = true)
    protected Boolean maximumPermissionsEditReports;
    @XmlElement(name = "MaximumPermissionsEditTask", nillable = true)
    protected Boolean maximumPermissionsEditTask;
    @XmlElement(name = "MaximumPermissionsEditTopics", nillable = true)
    protected Boolean maximumPermissionsEditTopics;
    @XmlElement(name = "MaximumPermissionsEmailAdministration", nillable = true)
    protected Boolean maximumPermissionsEmailAdministration;
    @XmlElement(name = "MaximumPermissionsEmailMass", nillable = true)
    protected Boolean maximumPermissionsEmailMass;
    @XmlElement(name = "MaximumPermissionsEmailSingle", nillable = true)
    protected Boolean maximumPermissionsEmailSingle;
    @XmlElement(name = "MaximumPermissionsEmailTemplateManagement", nillable = true)
    protected Boolean maximumPermissionsEmailTemplateManagement;
    @XmlElement(name = "MaximumPermissionsEnableNotifications", nillable = true)
    protected Boolean maximumPermissionsEnableNotifications;
    @XmlElement(name = "MaximumPermissionsExportReport", nillable = true)
    protected Boolean maximumPermissionsExportReport;
    @XmlElement(name = "MaximumPermissionsFlowUFLRequired", nillable = true)
    protected Boolean maximumPermissionsFlowUFLRequired;
    @XmlElement(name = "MaximumPermissionsForceTwoFactor", nillable = true)
    protected Boolean maximumPermissionsForceTwoFactor;
    @XmlElement(name = "MaximumPermissionsGovernNetworks", nillable = true)
    protected Boolean maximumPermissionsGovernNetworks;
    @XmlElement(name = "MaximumPermissionsIdentityConnect", nillable = true)
    protected Boolean maximumPermissionsIdentityConnect;
    @XmlElement(name = "MaximumPermissionsIdentityEnabled", nillable = true)
    protected Boolean maximumPermissionsIdentityEnabled;
    @XmlElement(name = "MaximumPermissionsImportLeads", nillable = true)
    protected Boolean maximumPermissionsImportLeads;
    @XmlElement(name = "MaximumPermissionsImportPersonal", nillable = true)
    protected Boolean maximumPermissionsImportPersonal;
    @XmlElement(name = "MaximumPermissionsInstallPackaging", nillable = true)
    protected Boolean maximumPermissionsInstallPackaging;
    @XmlElement(name = "MaximumPermissionsManageAnalyticSnapshots", nillable = true)
    protected Boolean maximumPermissionsManageAnalyticSnapshots;
    @XmlElement(name = "MaximumPermissionsManageAuthProviders", nillable = true)
    protected Boolean maximumPermissionsManageAuthProviders;
    @XmlElement(name = "MaximumPermissionsManageBusinessHourHolidays", nillable = true)
    protected Boolean maximumPermissionsManageBusinessHourHolidays;
    @XmlElement(name = "MaximumPermissionsManageCallCenters", nillable = true)
    protected Boolean maximumPermissionsManageCallCenters;
    @XmlElement(name = "MaximumPermissionsManageCases", nillable = true)
    protected Boolean maximumPermissionsManageCases;
    @XmlElement(name = "MaximumPermissionsManageCategories", nillable = true)
    protected Boolean maximumPermissionsManageCategories;
    @XmlElement(name = "MaximumPermissionsManageContentPermissions", nillable = true)
    protected Boolean maximumPermissionsManageContentPermissions;
    @XmlElement(name = "MaximumPermissionsManageContentProperties", nillable = true)
    protected Boolean maximumPermissionsManageContentProperties;
    @XmlElement(name = "MaximumPermissionsManageContentTypes", nillable = true)
    protected Boolean maximumPermissionsManageContentTypes;
    @XmlElement(name = "MaximumPermissionsManageCssUsers", nillable = true)
    protected Boolean maximumPermissionsManageCssUsers;
    @XmlElement(name = "MaximumPermissionsManageCustomPermissions", nillable = true)
    protected Boolean maximumPermissionsManageCustomPermissions;
    @XmlElement(name = "MaximumPermissionsManageCustomReportTypes", nillable = true)
    protected Boolean maximumPermissionsManageCustomReportTypes;
    @XmlElement(name = "MaximumPermissionsManageDashboards", nillable = true)
    protected Boolean maximumPermissionsManageDashboards;
    @XmlElement(name = "MaximumPermissionsManageDataCategories", nillable = true)
    protected Boolean maximumPermissionsManageDataCategories;
    @XmlElement(name = "MaximumPermissionsManageDataIntegrations", nillable = true)
    protected Boolean maximumPermissionsManageDataIntegrations;
    @XmlElement(name = "MaximumPermissionsManageDynamicDashboards", nillable = true)
    protected Boolean maximumPermissionsManageDynamicDashboards;
    @XmlElement(name = "MaximumPermissionsManageEmailClientConfig", nillable = true)
    protected Boolean maximumPermissionsManageEmailClientConfig;
    @XmlElement(name = "MaximumPermissionsManageInteraction", nillable = true)
    protected Boolean maximumPermissionsManageInteraction;
    @XmlElement(name = "MaximumPermissionsManageInternalUsers", nillable = true)
    protected Boolean maximumPermissionsManageInternalUsers;
    @XmlElement(name = "MaximumPermissionsManageIpAddresses", nillable = true)
    protected Boolean maximumPermissionsManageIpAddresses;
    @XmlElement(name = "MaximumPermissionsManageKnowledge", nillable = true)
    protected Boolean maximumPermissionsManageKnowledge;
    @XmlElement(name = "MaximumPermissionsManageKnowledgeImportExport", nillable = true)
    protected Boolean maximumPermissionsManageKnowledgeImportExport;
    @XmlElement(name = "MaximumPermissionsManageLeads", nillable = true)
    protected Boolean maximumPermissionsManageLeads;
    @XmlElement(name = "MaximumPermissionsManageLoginAccessPolicies", nillable = true)
    protected Boolean maximumPermissionsManageLoginAccessPolicies;
    @XmlElement(name = "MaximumPermissionsManageMobile", nillable = true)
    protected Boolean maximumPermissionsManageMobile;
    @XmlElement(name = "MaximumPermissionsManageNetworks", nillable = true)
    protected Boolean maximumPermissionsManageNetworks;
    @XmlElement(name = "MaximumPermissionsManagePasswordPolicies", nillable = true)
    protected Boolean maximumPermissionsManagePasswordPolicies;
    @XmlElement(name = "MaximumPermissionsManageProfilesPermissionsets", nillable = true)
    protected Boolean maximumPermissionsManageProfilesPermissionsets;
    @XmlElement(name = "MaximumPermissionsManageRemoteAccess", nillable = true)
    protected Boolean maximumPermissionsManageRemoteAccess;
    @XmlElement(name = "MaximumPermissionsManageRoles", nillable = true)
    protected Boolean maximumPermissionsManageRoles;
    @XmlElement(name = "MaximumPermissionsManageSearchPromotionRules", nillable = true)
    protected Boolean maximumPermissionsManageSearchPromotionRules;
    @XmlElement(name = "MaximumPermissionsManageSelfService", nillable = true)
    protected Boolean maximumPermissionsManageSelfService;
    @XmlElement(name = "MaximumPermissionsManageSharing", nillable = true)
    protected Boolean maximumPermissionsManageSharing;
    @XmlElement(name = "MaximumPermissionsManageSolutions", nillable = true)
    protected Boolean maximumPermissionsManageSolutions;
    @XmlElement(name = "MaximumPermissionsManageSynonyms", nillable = true)
    protected Boolean maximumPermissionsManageSynonyms;
    @XmlElement(name = "MaximumPermissionsManageTwoFactor", nillable = true)
    protected Boolean maximumPermissionsManageTwoFactor;
    @XmlElement(name = "MaximumPermissionsManageUsers", nillable = true)
    protected Boolean maximumPermissionsManageUsers;
    @XmlElement(name = "MaximumPermissionsMassInlineEdit", nillable = true)
    protected Boolean maximumPermissionsMassInlineEdit;
    @XmlElement(name = "MaximumPermissionsModifyAllData", nillable = true)
    protected Boolean maximumPermissionsModifyAllData;
    @XmlElement(name = "MaximumPermissionsModifySecureAgents", nillable = true)
    protected Boolean maximumPermissionsModifySecureAgents;
    @XmlElement(name = "MaximumPermissionsNewReportBuilder", nillable = true)
    protected Boolean maximumPermissionsNewReportBuilder;
    @XmlElement(name = "MaximumPermissionsPasswordNeverExpires", nillable = true)
    protected Boolean maximumPermissionsPasswordNeverExpires;
    @XmlElement(name = "MaximumPermissionsPublishPackaging", nillable = true)
    protected Boolean maximumPermissionsPublishPackaging;
    @XmlElement(name = "MaximumPermissionsResetPasswords", nillable = true)
    protected Boolean maximumPermissionsResetPasswords;
    @XmlElement(name = "MaximumPermissionsRunFlow", nillable = true)
    protected Boolean maximumPermissionsRunFlow;
    @XmlElement(name = "MaximumPermissionsRunReports", nillable = true)
    protected Boolean maximumPermissionsRunReports;
    @XmlElement(name = "MaximumPermissionsSalesConsole", nillable = true)
    protected Boolean maximumPermissionsSalesConsole;
    @XmlElement(name = "MaximumPermissionsScheduleReports", nillable = true)
    protected Boolean maximumPermissionsScheduleReports;
    @XmlElement(name = "MaximumPermissionsSendSitRequests", nillable = true)
    protected Boolean maximumPermissionsSendSitRequests;
    @XmlElement(name = "MaximumPermissionsSolutionImport", nillable = true)
    protected Boolean maximumPermissionsSolutionImport;
    @XmlElement(name = "MaximumPermissionsTransferAnyCase", nillable = true)
    protected Boolean maximumPermissionsTransferAnyCase;
    @XmlElement(name = "MaximumPermissionsTransferAnyEntity", nillable = true)
    protected Boolean maximumPermissionsTransferAnyEntity;
    @XmlElement(name = "MaximumPermissionsTransferAnyLead", nillable = true)
    protected Boolean maximumPermissionsTransferAnyLead;
    @XmlElement(name = "MaximumPermissionsTwoFactorApi", nillable = true)
    protected Boolean maximumPermissionsTwoFactorApi;
    @XmlElement(name = "MaximumPermissionsUseTeamReassignWizards", nillable = true)
    protected Boolean maximumPermissionsUseTeamReassignWizards;
    @XmlElement(name = "MaximumPermissionsViewAllData", nillable = true)
    protected Boolean maximumPermissionsViewAllData;
    @XmlElement(name = "MaximumPermissionsViewAllUsers", nillable = true)
    protected Boolean maximumPermissionsViewAllUsers;
    @XmlElement(name = "MaximumPermissionsViewContent", nillable = true)
    protected Boolean maximumPermissionsViewContent;
    @XmlElement(name = "MaximumPermissionsViewDataCategories", nillable = true)
    protected Boolean maximumPermissionsViewDataCategories;
    @XmlElement(name = "MaximumPermissionsViewEncryptedData", nillable = true)
    protected Boolean maximumPermissionsViewEncryptedData;
    @XmlElement(name = "MaximumPermissionsViewEventLogFiles", nillable = true)
    protected Boolean maximumPermissionsViewEventLogFiles;
    @XmlElement(name = "MaximumPermissionsViewHelpLink", nillable = true)
    protected Boolean maximumPermissionsViewHelpLink;
    @XmlElement(name = "MaximumPermissionsViewMyTeamsDashboards", nillable = true)
    protected Boolean maximumPermissionsViewMyTeamsDashboards;
    @XmlElement(name = "MaximumPermissionsViewSetup", nillable = true)
    protected Boolean maximumPermissionsViewSetup;
    @XmlElement(name = "MaximumPermissionsWorkCalibrationUser", nillable = true)
    protected Boolean maximumPermissionsWorkCalibrationUser;
    @XmlElement(name = "MaximumPermissionsWorkDotComUserPerm", nillable = true)
    protected Boolean maximumPermissionsWorkDotComUserPerm;
    @XmlElement(name = "PermissionSetLicenseAssignments", nillable = true)
    protected QueryResultType permissionSetLicenseAssignments;
    @XmlElement(name = "PermissionSetLicenseKey", nillable = true)
    protected String permissionSetLicenseKey;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TotalLicenses", nillable = true)
    protected Integer totalLicenses;
    @XmlElement(name = "UsedLicenses", nillable = true)
    protected Integer usedLicenses;

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
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
     * Gets the value of the masterLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLabel() {
        return masterLabel;
    }

    /**
     * Sets the value of the masterLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLabel(String value) {
        this.masterLabel = value;
    }

    /**
     * Gets the value of the maximumPermissionsActivateContract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsActivateContract() {
        return maximumPermissionsActivateContract;
    }

    /**
     * Sets the value of the maximumPermissionsActivateContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsActivateContract(Boolean value) {
        this.maximumPermissionsActivateContract = value;
    }

    /**
     * Gets the value of the maximumPermissionsActivateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsActivateOrder() {
        return maximumPermissionsActivateOrder;
    }

    /**
     * Sets the value of the maximumPermissionsActivateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsActivateOrder(Boolean value) {
        this.maximumPermissionsActivateOrder = value;
    }

    /**
     * Gets the value of the maximumPermissionsAllowUniversalSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsAllowUniversalSearch() {
        return maximumPermissionsAllowUniversalSearch;
    }

    /**
     * Sets the value of the maximumPermissionsAllowUniversalSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsAllowUniversalSearch(Boolean value) {
        this.maximumPermissionsAllowUniversalSearch = value;
    }

    /**
     * Gets the value of the maximumPermissionsAllowViewKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsAllowViewKnowledge() {
        return maximumPermissionsAllowViewKnowledge;
    }

    /**
     * Sets the value of the maximumPermissionsAllowViewKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsAllowViewKnowledge(Boolean value) {
        this.maximumPermissionsAllowViewKnowledge = value;
    }

    /**
     * Gets the value of the maximumPermissionsApiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsApiEnabled() {
        return maximumPermissionsApiEnabled;
    }

    /**
     * Sets the value of the maximumPermissionsApiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsApiEnabled(Boolean value) {
        this.maximumPermissionsApiEnabled = value;
    }

    /**
     * Gets the value of the maximumPermissionsAssignPermissionSets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsAssignPermissionSets() {
        return maximumPermissionsAssignPermissionSets;
    }

    /**
     * Sets the value of the maximumPermissionsAssignPermissionSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsAssignPermissionSets(Boolean value) {
        this.maximumPermissionsAssignPermissionSets = value;
    }

    /**
     * Gets the value of the maximumPermissionsAssignTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsAssignTopics() {
        return maximumPermissionsAssignTopics;
    }

    /**
     * Sets the value of the maximumPermissionsAssignTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsAssignTopics(Boolean value) {
        this.maximumPermissionsAssignTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsAuthorApex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsAuthorApex() {
        return maximumPermissionsAuthorApex;
    }

    /**
     * Sets the value of the maximumPermissionsAuthorApex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsAuthorApex(Boolean value) {
        this.maximumPermissionsAuthorApex = value;
    }

    /**
     * Gets the value of the maximumPermissionsBulkApiHardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsBulkApiHardDelete() {
        return maximumPermissionsBulkApiHardDelete;
    }

    /**
     * Sets the value of the maximumPermissionsBulkApiHardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsBulkApiHardDelete(Boolean value) {
        this.maximumPermissionsBulkApiHardDelete = value;
    }

    /**
     * Gets the value of the maximumPermissionsCanUseNewDashboardBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCanUseNewDashboardBuilder() {
        return maximumPermissionsCanUseNewDashboardBuilder;
    }

    /**
     * Sets the value of the maximumPermissionsCanUseNewDashboardBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCanUseNewDashboardBuilder(Boolean value) {
        this.maximumPermissionsCanUseNewDashboardBuilder = value;
    }

    /**
     * Gets the value of the maximumPermissionsConnectOrgToEnvironmentHub property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsConnectOrgToEnvironmentHub() {
        return maximumPermissionsConnectOrgToEnvironmentHub;
    }

    /**
     * Sets the value of the maximumPermissionsConnectOrgToEnvironmentHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsConnectOrgToEnvironmentHub(Boolean value) {
        this.maximumPermissionsConnectOrgToEnvironmentHub = value;
    }

    /**
     * Gets the value of the maximumPermissionsContentAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsContentAdministrator() {
        return maximumPermissionsContentAdministrator;
    }

    /**
     * Sets the value of the maximumPermissionsContentAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsContentAdministrator(Boolean value) {
        this.maximumPermissionsContentAdministrator = value;
    }

    /**
     * Gets the value of the maximumPermissionsConvertLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsConvertLeads() {
        return maximumPermissionsConvertLeads;
    }

    /**
     * Sets the value of the maximumPermissionsConvertLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsConvertLeads(Boolean value) {
        this.maximumPermissionsConvertLeads = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreateCustomizeFilters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCreateCustomizeFilters() {
        return maximumPermissionsCreateCustomizeFilters;
    }

    /**
     * Sets the value of the maximumPermissionsCreateCustomizeFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCreateCustomizeFilters(Boolean value) {
        this.maximumPermissionsCreateCustomizeFilters = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreatePackaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCreatePackaging() {
        return maximumPermissionsCreatePackaging;
    }

    /**
     * Sets the value of the maximumPermissionsCreatePackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCreatePackaging(Boolean value) {
        this.maximumPermissionsCreatePackaging = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreateTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCreateTopics() {
        return maximumPermissionsCreateTopics;
    }

    /**
     * Sets the value of the maximumPermissionsCreateTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCreateTopics(Boolean value) {
        this.maximumPermissionsCreateTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreateWorkBadgeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCreateWorkBadgeDefinition() {
        return maximumPermissionsCreateWorkBadgeDefinition;
    }

    /**
     * Sets the value of the maximumPermissionsCreateWorkBadgeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCreateWorkBadgeDefinition(Boolean value) {
        this.maximumPermissionsCreateWorkBadgeDefinition = value;
    }

    /**
     * Gets the value of the maximumPermissionsCreateWorkspaces property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCreateWorkspaces() {
        return maximumPermissionsCreateWorkspaces;
    }

    /**
     * Sets the value of the maximumPermissionsCreateWorkspaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCreateWorkspaces(Boolean value) {
        this.maximumPermissionsCreateWorkspaces = value;
    }

    /**
     * Gets the value of the maximumPermissionsCustomMobileAppsAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCustomMobileAppsAccess() {
        return maximumPermissionsCustomMobileAppsAccess;
    }

    /**
     * Sets the value of the maximumPermissionsCustomMobileAppsAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCustomMobileAppsAccess(Boolean value) {
        this.maximumPermissionsCustomMobileAppsAccess = value;
    }

    /**
     * Gets the value of the maximumPermissionsCustomSidebarOnAllPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCustomSidebarOnAllPages() {
        return maximumPermissionsCustomSidebarOnAllPages;
    }

    /**
     * Sets the value of the maximumPermissionsCustomSidebarOnAllPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCustomSidebarOnAllPages(Boolean value) {
        this.maximumPermissionsCustomSidebarOnAllPages = value;
    }

    /**
     * Gets the value of the maximumPermissionsCustomizeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsCustomizeApplication() {
        return maximumPermissionsCustomizeApplication;
    }

    /**
     * Sets the value of the maximumPermissionsCustomizeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsCustomizeApplication(Boolean value) {
        this.maximumPermissionsCustomizeApplication = value;
    }

    /**
     * Gets the value of the maximumPermissionsDeleteActivatedContract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsDeleteActivatedContract() {
        return maximumPermissionsDeleteActivatedContract;
    }

    /**
     * Sets the value of the maximumPermissionsDeleteActivatedContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsDeleteActivatedContract(Boolean value) {
        this.maximumPermissionsDeleteActivatedContract = value;
    }

    /**
     * Gets the value of the maximumPermissionsDeleteTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsDeleteTopics() {
        return maximumPermissionsDeleteTopics;
    }

    /**
     * Sets the value of the maximumPermissionsDeleteTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsDeleteTopics(Boolean value) {
        this.maximumPermissionsDeleteTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsDistributeFromPersWksp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsDistributeFromPersWksp() {
        return maximumPermissionsDistributeFromPersWksp;
    }

    /**
     * Sets the value of the maximumPermissionsDistributeFromPersWksp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsDistributeFromPersWksp(Boolean value) {
        this.maximumPermissionsDistributeFromPersWksp = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditActivatedOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditActivatedOrders() {
        return maximumPermissionsEditActivatedOrders;
    }

    /**
     * Sets the value of the maximumPermissionsEditActivatedOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditActivatedOrders(Boolean value) {
        this.maximumPermissionsEditActivatedOrders = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditBrandTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditBrandTemplates() {
        return maximumPermissionsEditBrandTemplates;
    }

    /**
     * Sets the value of the maximumPermissionsEditBrandTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditBrandTemplates(Boolean value) {
        this.maximumPermissionsEditBrandTemplates = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditCaseComments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditCaseComments() {
        return maximumPermissionsEditCaseComments;
    }

    /**
     * Sets the value of the maximumPermissionsEditCaseComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditCaseComments(Boolean value) {
        this.maximumPermissionsEditCaseComments = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditEvent() {
        return maximumPermissionsEditEvent;
    }

    /**
     * Sets the value of the maximumPermissionsEditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditEvent(Boolean value) {
        this.maximumPermissionsEditEvent = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditHtmlTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditHtmlTemplates() {
        return maximumPermissionsEditHtmlTemplates;
    }

    /**
     * Sets the value of the maximumPermissionsEditHtmlTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditHtmlTemplates(Boolean value) {
        this.maximumPermissionsEditHtmlTemplates = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditKnowledge() {
        return maximumPermissionsEditKnowledge;
    }

    /**
     * Sets the value of the maximumPermissionsEditKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditKnowledge(Boolean value) {
        this.maximumPermissionsEditKnowledge = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditOppLineItemUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditOppLineItemUnitPrice() {
        return maximumPermissionsEditOppLineItemUnitPrice;
    }

    /**
     * Sets the value of the maximumPermissionsEditOppLineItemUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditOppLineItemUnitPrice(Boolean value) {
        this.maximumPermissionsEditOppLineItemUnitPrice = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditPublicDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditPublicDocuments() {
        return maximumPermissionsEditPublicDocuments;
    }

    /**
     * Sets the value of the maximumPermissionsEditPublicDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditPublicDocuments(Boolean value) {
        this.maximumPermissionsEditPublicDocuments = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditPublicTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditPublicTemplates() {
        return maximumPermissionsEditPublicTemplates;
    }

    /**
     * Sets the value of the maximumPermissionsEditPublicTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditPublicTemplates(Boolean value) {
        this.maximumPermissionsEditPublicTemplates = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditReadonlyFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditReadonlyFields() {
        return maximumPermissionsEditReadonlyFields;
    }

    /**
     * Sets the value of the maximumPermissionsEditReadonlyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditReadonlyFields(Boolean value) {
        this.maximumPermissionsEditReadonlyFields = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditReports() {
        return maximumPermissionsEditReports;
    }

    /**
     * Sets the value of the maximumPermissionsEditReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditReports(Boolean value) {
        this.maximumPermissionsEditReports = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditTask() {
        return maximumPermissionsEditTask;
    }

    /**
     * Sets the value of the maximumPermissionsEditTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditTask(Boolean value) {
        this.maximumPermissionsEditTask = value;
    }

    /**
     * Gets the value of the maximumPermissionsEditTopics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEditTopics() {
        return maximumPermissionsEditTopics;
    }

    /**
     * Sets the value of the maximumPermissionsEditTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEditTopics(Boolean value) {
        this.maximumPermissionsEditTopics = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEmailAdministration() {
        return maximumPermissionsEmailAdministration;
    }

    /**
     * Sets the value of the maximumPermissionsEmailAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEmailAdministration(Boolean value) {
        this.maximumPermissionsEmailAdministration = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailMass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEmailMass() {
        return maximumPermissionsEmailMass;
    }

    /**
     * Sets the value of the maximumPermissionsEmailMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEmailMass(Boolean value) {
        this.maximumPermissionsEmailMass = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailSingle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEmailSingle() {
        return maximumPermissionsEmailSingle;
    }

    /**
     * Sets the value of the maximumPermissionsEmailSingle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEmailSingle(Boolean value) {
        this.maximumPermissionsEmailSingle = value;
    }

    /**
     * Gets the value of the maximumPermissionsEmailTemplateManagement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEmailTemplateManagement() {
        return maximumPermissionsEmailTemplateManagement;
    }

    /**
     * Sets the value of the maximumPermissionsEmailTemplateManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEmailTemplateManagement(Boolean value) {
        this.maximumPermissionsEmailTemplateManagement = value;
    }

    /**
     * Gets the value of the maximumPermissionsEnableNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsEnableNotifications() {
        return maximumPermissionsEnableNotifications;
    }

    /**
     * Sets the value of the maximumPermissionsEnableNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsEnableNotifications(Boolean value) {
        this.maximumPermissionsEnableNotifications = value;
    }

    /**
     * Gets the value of the maximumPermissionsExportReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsExportReport() {
        return maximumPermissionsExportReport;
    }

    /**
     * Sets the value of the maximumPermissionsExportReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsExportReport(Boolean value) {
        this.maximumPermissionsExportReport = value;
    }

    /**
     * Gets the value of the maximumPermissionsFlowUFLRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsFlowUFLRequired() {
        return maximumPermissionsFlowUFLRequired;
    }

    /**
     * Sets the value of the maximumPermissionsFlowUFLRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsFlowUFLRequired(Boolean value) {
        this.maximumPermissionsFlowUFLRequired = value;
    }

    /**
     * Gets the value of the maximumPermissionsForceTwoFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsForceTwoFactor() {
        return maximumPermissionsForceTwoFactor;
    }

    /**
     * Sets the value of the maximumPermissionsForceTwoFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsForceTwoFactor(Boolean value) {
        this.maximumPermissionsForceTwoFactor = value;
    }

    /**
     * Gets the value of the maximumPermissionsGovernNetworks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsGovernNetworks() {
        return maximumPermissionsGovernNetworks;
    }

    /**
     * Sets the value of the maximumPermissionsGovernNetworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsGovernNetworks(Boolean value) {
        this.maximumPermissionsGovernNetworks = value;
    }

    /**
     * Gets the value of the maximumPermissionsIdentityConnect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsIdentityConnect() {
        return maximumPermissionsIdentityConnect;
    }

    /**
     * Sets the value of the maximumPermissionsIdentityConnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsIdentityConnect(Boolean value) {
        this.maximumPermissionsIdentityConnect = value;
    }

    /**
     * Gets the value of the maximumPermissionsIdentityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsIdentityEnabled() {
        return maximumPermissionsIdentityEnabled;
    }

    /**
     * Sets the value of the maximumPermissionsIdentityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsIdentityEnabled(Boolean value) {
        this.maximumPermissionsIdentityEnabled = value;
    }

    /**
     * Gets the value of the maximumPermissionsImportLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsImportLeads() {
        return maximumPermissionsImportLeads;
    }

    /**
     * Sets the value of the maximumPermissionsImportLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsImportLeads(Boolean value) {
        this.maximumPermissionsImportLeads = value;
    }

    /**
     * Gets the value of the maximumPermissionsImportPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsImportPersonal() {
        return maximumPermissionsImportPersonal;
    }

    /**
     * Sets the value of the maximumPermissionsImportPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsImportPersonal(Boolean value) {
        this.maximumPermissionsImportPersonal = value;
    }

    /**
     * Gets the value of the maximumPermissionsInstallPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsInstallPackaging() {
        return maximumPermissionsInstallPackaging;
    }

    /**
     * Sets the value of the maximumPermissionsInstallPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsInstallPackaging(Boolean value) {
        this.maximumPermissionsInstallPackaging = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageAnalyticSnapshots property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageAnalyticSnapshots() {
        return maximumPermissionsManageAnalyticSnapshots;
    }

    /**
     * Sets the value of the maximumPermissionsManageAnalyticSnapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageAnalyticSnapshots(Boolean value) {
        this.maximumPermissionsManageAnalyticSnapshots = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageAuthProviders property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageAuthProviders() {
        return maximumPermissionsManageAuthProviders;
    }

    /**
     * Sets the value of the maximumPermissionsManageAuthProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageAuthProviders(Boolean value) {
        this.maximumPermissionsManageAuthProviders = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageBusinessHourHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageBusinessHourHolidays() {
        return maximumPermissionsManageBusinessHourHolidays;
    }

    /**
     * Sets the value of the maximumPermissionsManageBusinessHourHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageBusinessHourHolidays(Boolean value) {
        this.maximumPermissionsManageBusinessHourHolidays = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCallCenters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageCallCenters() {
        return maximumPermissionsManageCallCenters;
    }

    /**
     * Sets the value of the maximumPermissionsManageCallCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageCallCenters(Boolean value) {
        this.maximumPermissionsManageCallCenters = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageCases() {
        return maximumPermissionsManageCases;
    }

    /**
     * Sets the value of the maximumPermissionsManageCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageCases(Boolean value) {
        this.maximumPermissionsManageCases = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageCategories() {
        return maximumPermissionsManageCategories;
    }

    /**
     * Sets the value of the maximumPermissionsManageCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageCategories(Boolean value) {
        this.maximumPermissionsManageCategories = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageContentPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageContentPermissions() {
        return maximumPermissionsManageContentPermissions;
    }

    /**
     * Sets the value of the maximumPermissionsManageContentPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageContentPermissions(Boolean value) {
        this.maximumPermissionsManageContentPermissions = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageContentProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageContentProperties() {
        return maximumPermissionsManageContentProperties;
    }

    /**
     * Sets the value of the maximumPermissionsManageContentProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageContentProperties(Boolean value) {
        this.maximumPermissionsManageContentProperties = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageContentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageContentTypes() {
        return maximumPermissionsManageContentTypes;
    }

    /**
     * Sets the value of the maximumPermissionsManageContentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageContentTypes(Boolean value) {
        this.maximumPermissionsManageContentTypes = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCssUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageCssUsers() {
        return maximumPermissionsManageCssUsers;
    }

    /**
     * Sets the value of the maximumPermissionsManageCssUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageCssUsers(Boolean value) {
        this.maximumPermissionsManageCssUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCustomPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageCustomPermissions() {
        return maximumPermissionsManageCustomPermissions;
    }

    /**
     * Sets the value of the maximumPermissionsManageCustomPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageCustomPermissions(Boolean value) {
        this.maximumPermissionsManageCustomPermissions = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageCustomReportTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageCustomReportTypes() {
        return maximumPermissionsManageCustomReportTypes;
    }

    /**
     * Sets the value of the maximumPermissionsManageCustomReportTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageCustomReportTypes(Boolean value) {
        this.maximumPermissionsManageCustomReportTypes = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageDashboards() {
        return maximumPermissionsManageDashboards;
    }

    /**
     * Sets the value of the maximumPermissionsManageDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageDashboards(Boolean value) {
        this.maximumPermissionsManageDashboards = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageDataCategories() {
        return maximumPermissionsManageDataCategories;
    }

    /**
     * Sets the value of the maximumPermissionsManageDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageDataCategories(Boolean value) {
        this.maximumPermissionsManageDataCategories = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageDataIntegrations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageDataIntegrations() {
        return maximumPermissionsManageDataIntegrations;
    }

    /**
     * Sets the value of the maximumPermissionsManageDataIntegrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageDataIntegrations(Boolean value) {
        this.maximumPermissionsManageDataIntegrations = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageDynamicDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageDynamicDashboards() {
        return maximumPermissionsManageDynamicDashboards;
    }

    /**
     * Sets the value of the maximumPermissionsManageDynamicDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageDynamicDashboards(Boolean value) {
        this.maximumPermissionsManageDynamicDashboards = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageEmailClientConfig property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageEmailClientConfig() {
        return maximumPermissionsManageEmailClientConfig;
    }

    /**
     * Sets the value of the maximumPermissionsManageEmailClientConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageEmailClientConfig(Boolean value) {
        this.maximumPermissionsManageEmailClientConfig = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageInteraction() {
        return maximumPermissionsManageInteraction;
    }

    /**
     * Sets the value of the maximumPermissionsManageInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageInteraction(Boolean value) {
        this.maximumPermissionsManageInteraction = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageInternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageInternalUsers() {
        return maximumPermissionsManageInternalUsers;
    }

    /**
     * Sets the value of the maximumPermissionsManageInternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageInternalUsers(Boolean value) {
        this.maximumPermissionsManageInternalUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageIpAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageIpAddresses() {
        return maximumPermissionsManageIpAddresses;
    }

    /**
     * Sets the value of the maximumPermissionsManageIpAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageIpAddresses(Boolean value) {
        this.maximumPermissionsManageIpAddresses = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageKnowledge() {
        return maximumPermissionsManageKnowledge;
    }

    /**
     * Sets the value of the maximumPermissionsManageKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageKnowledge(Boolean value) {
        this.maximumPermissionsManageKnowledge = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageKnowledgeImportExport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageKnowledgeImportExport() {
        return maximumPermissionsManageKnowledgeImportExport;
    }

    /**
     * Sets the value of the maximumPermissionsManageKnowledgeImportExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageKnowledgeImportExport(Boolean value) {
        this.maximumPermissionsManageKnowledgeImportExport = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageLeads() {
        return maximumPermissionsManageLeads;
    }

    /**
     * Sets the value of the maximumPermissionsManageLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageLeads(Boolean value) {
        this.maximumPermissionsManageLeads = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageLoginAccessPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageLoginAccessPolicies() {
        return maximumPermissionsManageLoginAccessPolicies;
    }

    /**
     * Sets the value of the maximumPermissionsManageLoginAccessPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageLoginAccessPolicies(Boolean value) {
        this.maximumPermissionsManageLoginAccessPolicies = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageMobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageMobile() {
        return maximumPermissionsManageMobile;
    }

    /**
     * Sets the value of the maximumPermissionsManageMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageMobile(Boolean value) {
        this.maximumPermissionsManageMobile = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageNetworks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageNetworks() {
        return maximumPermissionsManageNetworks;
    }

    /**
     * Sets the value of the maximumPermissionsManageNetworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageNetworks(Boolean value) {
        this.maximumPermissionsManageNetworks = value;
    }

    /**
     * Gets the value of the maximumPermissionsManagePasswordPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManagePasswordPolicies() {
        return maximumPermissionsManagePasswordPolicies;
    }

    /**
     * Sets the value of the maximumPermissionsManagePasswordPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManagePasswordPolicies(Boolean value) {
        this.maximumPermissionsManagePasswordPolicies = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageProfilesPermissionsets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageProfilesPermissionsets() {
        return maximumPermissionsManageProfilesPermissionsets;
    }

    /**
     * Sets the value of the maximumPermissionsManageProfilesPermissionsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageProfilesPermissionsets(Boolean value) {
        this.maximumPermissionsManageProfilesPermissionsets = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageRemoteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageRemoteAccess() {
        return maximumPermissionsManageRemoteAccess;
    }

    /**
     * Sets the value of the maximumPermissionsManageRemoteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageRemoteAccess(Boolean value) {
        this.maximumPermissionsManageRemoteAccess = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageRoles() {
        return maximumPermissionsManageRoles;
    }

    /**
     * Sets the value of the maximumPermissionsManageRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageRoles(Boolean value) {
        this.maximumPermissionsManageRoles = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSearchPromotionRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageSearchPromotionRules() {
        return maximumPermissionsManageSearchPromotionRules;
    }

    /**
     * Sets the value of the maximumPermissionsManageSearchPromotionRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageSearchPromotionRules(Boolean value) {
        this.maximumPermissionsManageSearchPromotionRules = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSelfService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageSelfService() {
        return maximumPermissionsManageSelfService;
    }

    /**
     * Sets the value of the maximumPermissionsManageSelfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageSelfService(Boolean value) {
        this.maximumPermissionsManageSelfService = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSharing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageSharing() {
        return maximumPermissionsManageSharing;
    }

    /**
     * Sets the value of the maximumPermissionsManageSharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageSharing(Boolean value) {
        this.maximumPermissionsManageSharing = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageSolutions() {
        return maximumPermissionsManageSolutions;
    }

    /**
     * Sets the value of the maximumPermissionsManageSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageSolutions(Boolean value) {
        this.maximumPermissionsManageSolutions = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageSynonyms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageSynonyms() {
        return maximumPermissionsManageSynonyms;
    }

    /**
     * Sets the value of the maximumPermissionsManageSynonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageSynonyms(Boolean value) {
        this.maximumPermissionsManageSynonyms = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageTwoFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageTwoFactor() {
        return maximumPermissionsManageTwoFactor;
    }

    /**
     * Sets the value of the maximumPermissionsManageTwoFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageTwoFactor(Boolean value) {
        this.maximumPermissionsManageTwoFactor = value;
    }

    /**
     * Gets the value of the maximumPermissionsManageUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsManageUsers() {
        return maximumPermissionsManageUsers;
    }

    /**
     * Sets the value of the maximumPermissionsManageUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsManageUsers(Boolean value) {
        this.maximumPermissionsManageUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsMassInlineEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsMassInlineEdit() {
        return maximumPermissionsMassInlineEdit;
    }

    /**
     * Sets the value of the maximumPermissionsMassInlineEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsMassInlineEdit(Boolean value) {
        this.maximumPermissionsMassInlineEdit = value;
    }

    /**
     * Gets the value of the maximumPermissionsModifyAllData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsModifyAllData() {
        return maximumPermissionsModifyAllData;
    }

    /**
     * Sets the value of the maximumPermissionsModifyAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsModifyAllData(Boolean value) {
        this.maximumPermissionsModifyAllData = value;
    }

    /**
     * Gets the value of the maximumPermissionsModifySecureAgents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsModifySecureAgents() {
        return maximumPermissionsModifySecureAgents;
    }

    /**
     * Sets the value of the maximumPermissionsModifySecureAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsModifySecureAgents(Boolean value) {
        this.maximumPermissionsModifySecureAgents = value;
    }

    /**
     * Gets the value of the maximumPermissionsNewReportBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsNewReportBuilder() {
        return maximumPermissionsNewReportBuilder;
    }

    /**
     * Sets the value of the maximumPermissionsNewReportBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsNewReportBuilder(Boolean value) {
        this.maximumPermissionsNewReportBuilder = value;
    }

    /**
     * Gets the value of the maximumPermissionsPasswordNeverExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsPasswordNeverExpires() {
        return maximumPermissionsPasswordNeverExpires;
    }

    /**
     * Sets the value of the maximumPermissionsPasswordNeverExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsPasswordNeverExpires(Boolean value) {
        this.maximumPermissionsPasswordNeverExpires = value;
    }

    /**
     * Gets the value of the maximumPermissionsPublishPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsPublishPackaging() {
        return maximumPermissionsPublishPackaging;
    }

    /**
     * Sets the value of the maximumPermissionsPublishPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsPublishPackaging(Boolean value) {
        this.maximumPermissionsPublishPackaging = value;
    }

    /**
     * Gets the value of the maximumPermissionsResetPasswords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsResetPasswords() {
        return maximumPermissionsResetPasswords;
    }

    /**
     * Sets the value of the maximumPermissionsResetPasswords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsResetPasswords(Boolean value) {
        this.maximumPermissionsResetPasswords = value;
    }

    /**
     * Gets the value of the maximumPermissionsRunFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsRunFlow() {
        return maximumPermissionsRunFlow;
    }

    /**
     * Sets the value of the maximumPermissionsRunFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsRunFlow(Boolean value) {
        this.maximumPermissionsRunFlow = value;
    }

    /**
     * Gets the value of the maximumPermissionsRunReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsRunReports() {
        return maximumPermissionsRunReports;
    }

    /**
     * Sets the value of the maximumPermissionsRunReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsRunReports(Boolean value) {
        this.maximumPermissionsRunReports = value;
    }

    /**
     * Gets the value of the maximumPermissionsSalesConsole property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsSalesConsole() {
        return maximumPermissionsSalesConsole;
    }

    /**
     * Sets the value of the maximumPermissionsSalesConsole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsSalesConsole(Boolean value) {
        this.maximumPermissionsSalesConsole = value;
    }

    /**
     * Gets the value of the maximumPermissionsScheduleReports property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsScheduleReports() {
        return maximumPermissionsScheduleReports;
    }

    /**
     * Sets the value of the maximumPermissionsScheduleReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsScheduleReports(Boolean value) {
        this.maximumPermissionsScheduleReports = value;
    }

    /**
     * Gets the value of the maximumPermissionsSendSitRequests property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsSendSitRequests() {
        return maximumPermissionsSendSitRequests;
    }

    /**
     * Sets the value of the maximumPermissionsSendSitRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsSendSitRequests(Boolean value) {
        this.maximumPermissionsSendSitRequests = value;
    }

    /**
     * Gets the value of the maximumPermissionsSolutionImport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsSolutionImport() {
        return maximumPermissionsSolutionImport;
    }

    /**
     * Sets the value of the maximumPermissionsSolutionImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsSolutionImport(Boolean value) {
        this.maximumPermissionsSolutionImport = value;
    }

    /**
     * Gets the value of the maximumPermissionsTransferAnyCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsTransferAnyCase() {
        return maximumPermissionsTransferAnyCase;
    }

    /**
     * Sets the value of the maximumPermissionsTransferAnyCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsTransferAnyCase(Boolean value) {
        this.maximumPermissionsTransferAnyCase = value;
    }

    /**
     * Gets the value of the maximumPermissionsTransferAnyEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsTransferAnyEntity() {
        return maximumPermissionsTransferAnyEntity;
    }

    /**
     * Sets the value of the maximumPermissionsTransferAnyEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsTransferAnyEntity(Boolean value) {
        this.maximumPermissionsTransferAnyEntity = value;
    }

    /**
     * Gets the value of the maximumPermissionsTransferAnyLead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsTransferAnyLead() {
        return maximumPermissionsTransferAnyLead;
    }

    /**
     * Sets the value of the maximumPermissionsTransferAnyLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsTransferAnyLead(Boolean value) {
        this.maximumPermissionsTransferAnyLead = value;
    }

    /**
     * Gets the value of the maximumPermissionsTwoFactorApi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsTwoFactorApi() {
        return maximumPermissionsTwoFactorApi;
    }

    /**
     * Sets the value of the maximumPermissionsTwoFactorApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsTwoFactorApi(Boolean value) {
        this.maximumPermissionsTwoFactorApi = value;
    }

    /**
     * Gets the value of the maximumPermissionsUseTeamReassignWizards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsUseTeamReassignWizards() {
        return maximumPermissionsUseTeamReassignWizards;
    }

    /**
     * Sets the value of the maximumPermissionsUseTeamReassignWizards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsUseTeamReassignWizards(Boolean value) {
        this.maximumPermissionsUseTeamReassignWizards = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewAllData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewAllData() {
        return maximumPermissionsViewAllData;
    }

    /**
     * Sets the value of the maximumPermissionsViewAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewAllData(Boolean value) {
        this.maximumPermissionsViewAllData = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewAllUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewAllUsers() {
        return maximumPermissionsViewAllUsers;
    }

    /**
     * Sets the value of the maximumPermissionsViewAllUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewAllUsers(Boolean value) {
        this.maximumPermissionsViewAllUsers = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewContent() {
        return maximumPermissionsViewContent;
    }

    /**
     * Sets the value of the maximumPermissionsViewContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewContent(Boolean value) {
        this.maximumPermissionsViewContent = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewDataCategories() {
        return maximumPermissionsViewDataCategories;
    }

    /**
     * Sets the value of the maximumPermissionsViewDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewDataCategories(Boolean value) {
        this.maximumPermissionsViewDataCategories = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewEncryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewEncryptedData() {
        return maximumPermissionsViewEncryptedData;
    }

    /**
     * Sets the value of the maximumPermissionsViewEncryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewEncryptedData(Boolean value) {
        this.maximumPermissionsViewEncryptedData = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewEventLogFiles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewEventLogFiles() {
        return maximumPermissionsViewEventLogFiles;
    }

    /**
     * Sets the value of the maximumPermissionsViewEventLogFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewEventLogFiles(Boolean value) {
        this.maximumPermissionsViewEventLogFiles = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewHelpLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewHelpLink() {
        return maximumPermissionsViewHelpLink;
    }

    /**
     * Sets the value of the maximumPermissionsViewHelpLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewHelpLink(Boolean value) {
        this.maximumPermissionsViewHelpLink = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewMyTeamsDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewMyTeamsDashboards() {
        return maximumPermissionsViewMyTeamsDashboards;
    }

    /**
     * Sets the value of the maximumPermissionsViewMyTeamsDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewMyTeamsDashboards(Boolean value) {
        this.maximumPermissionsViewMyTeamsDashboards = value;
    }

    /**
     * Gets the value of the maximumPermissionsViewSetup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsViewSetup() {
        return maximumPermissionsViewSetup;
    }

    /**
     * Sets the value of the maximumPermissionsViewSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsViewSetup(Boolean value) {
        this.maximumPermissionsViewSetup = value;
    }

    /**
     * Gets the value of the maximumPermissionsWorkCalibrationUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsWorkCalibrationUser() {
        return maximumPermissionsWorkCalibrationUser;
    }

    /**
     * Sets the value of the maximumPermissionsWorkCalibrationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsWorkCalibrationUser(Boolean value) {
        this.maximumPermissionsWorkCalibrationUser = value;
    }

    /**
     * Gets the value of the maximumPermissionsWorkDotComUserPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumPermissionsWorkDotComUserPerm() {
        return maximumPermissionsWorkDotComUserPerm;
    }

    /**
     * Sets the value of the maximumPermissionsWorkDotComUserPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumPermissionsWorkDotComUserPerm(Boolean value) {
        this.maximumPermissionsWorkDotComUserPerm = value;
    }

    /**
     * Gets the value of the permissionSetLicenseAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getPermissionSetLicenseAssignments() {
        return permissionSetLicenseAssignments;
    }

    /**
     * Sets the value of the permissionSetLicenseAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setPermissionSetLicenseAssignments(QueryResultType value) {
        this.permissionSetLicenseAssignments = value;
    }

    /**
     * Gets the value of the permissionSetLicenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionSetLicenseKey() {
        return permissionSetLicenseKey;
    }

    /**
     * Sets the value of the permissionSetLicenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionSetLicenseKey(String value) {
        this.permissionSetLicenseKey = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the totalLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLicenses() {
        return totalLicenses;
    }

    /**
     * Sets the value of the totalLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLicenses(Integer value) {
        this.totalLicenses = value;
    }

    /**
     * Gets the value of the usedLicenses property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsedLicenses() {
        return usedLicenses;
    }

    /**
     * Sets the value of the usedLicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsedLicenses(Integer value) {
        this.usedLicenses = value;
    }

}
