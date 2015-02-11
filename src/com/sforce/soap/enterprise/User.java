
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AcceptedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:enterprise.soap.sforce.com}address" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BadgeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallCenterId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CommunityNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContractsSigned" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeclinedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="DelegatedApproverId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DelegatedUsers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailEncodingKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailPreferencesAutoBcc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailPreferencesAutoBccStayInTouch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailPreferencesStayInTouchReminder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalDataUserAuths" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InstalledMobileApps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBadged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LanguageLocaleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LocaleSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ManagedUsers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Manager" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfflinePdaTrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OfflineTrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PermissionSetAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PermissionSetLicenseAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:sobject.enterprise.soap.sforce.com}Profile" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ReceivesAdminInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReceivesInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SenderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StayInTouchNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StayInTouchSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StayInTouchSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TimeZoneSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UndecidedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserPermissionsCallCenterAutoLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsChatterAnswersUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsInteractionUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsKnowledgeUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsMarketingUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsMobileUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsOfflineUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSFContentUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSiteforceContributorUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSiteforcePublisherUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSupportUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsWorkDotComUserFeature" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferences" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserPreferencesActivityRemindersPopup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesApexPagesDeveloperMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesContentEmailAsAndWhen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesContentNoEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableCoachingEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableFeedbackEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableGoalEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableWorkEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesEventRemindersCheckboxDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesHideCSNDesktopTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesHideCSNGetChatterMobileTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesHideChatterOnboardingSplash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesHideS1BrowserUI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesHideSecondChatterOnboardingSplash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesReminderSoundOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowCityToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowCityToGuestUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowCountryToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowCountryToGuestUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowEmailToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowFaxToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowManagerToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowMobilePhoneToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowPostalCodeToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowPostalCodeToGuestUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowProfilePicToGuestUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowStateToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowStateToGuestUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowStreetAddressToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowTitleToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowTitleToGuestUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowWorkPhoneToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesTaskRemindersCheckboxDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserRole" type="{urn:sobject.enterprise.soap.sforce.com}UserRole" minOccurs="0"/>
 *         &lt;element name="UserRoleId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="UserSites" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HideCaseManagementSections__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HidePaymentCalculationSections__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HideSplashScreen__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__LastAccessedClaimId__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PaymentCorrectionMode__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PlannedTasks__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__QuestionsLanguageCode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "acceptedEventRelations",
    "account",
    "accountId",
    "address",
    "alias",
    "badgeText",
    "callCenterId",
    "city",
    "combinedAttachments",
    "communityNickname",
    "companyName",
    "contact",
    "contactId",
    "contractsSigned",
    "country",
    "createdBy",
    "createdById",
    "createdDate",
    "declinedEventRelations",
    "delegatedApproverId",
    "delegatedUsers",
    "department",
    "division",
    "email",
    "emailEncodingKey",
    "emailPreferencesAutoBcc",
    "emailPreferencesAutoBccStayInTouch",
    "emailPreferencesStayInTouchReminder",
    "employeeNumber",
    "eventRelations",
    "extension",
    "externalDataUserAuths",
    "fax",
    "federationIdentifier",
    "firstName",
    "forecastEnabled",
    "installedMobileApps",
    "isActive",
    "isBadged",
    "languageLocaleKey",
    "lastLoginDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "lastPasswordChangeDate",
    "lastReferencedDate",
    "lastViewedDate",
    "latitude",
    "localeSidKey",
    "longitude",
    "managedUsers",
    "manager",
    "managerId",
    "mobilePhone",
    "name",
    "offlinePdaTrialExpirationDate",
    "offlineTrialExpirationDate",
    "permissionSetAssignments",
    "permissionSetLicenseAssignments",
    "phone",
    "postalCode",
    "profile",
    "profileId",
    "receivesAdminInfoEmails",
    "receivesInfoEmails",
    "senderEmail",
    "senderName",
    "shares",
    "signature",
    "state",
    "stayInTouchNote",
    "stayInTouchSignature",
    "stayInTouchSubject",
    "street",
    "systemModstamp",
    "timeZoneSidKey",
    "title",
    "undecidedEventRelations",
    "userPermissionsCallCenterAutoLogin",
    "userPermissionsChatterAnswersUser",
    "userPermissionsInteractionUser",
    "userPermissionsKnowledgeUser",
    "userPermissionsMarketingUser",
    "userPermissionsMobileUser",
    "userPermissionsOfflineUser",
    "userPermissionsSFContentUser",
    "userPermissionsSiteforceContributorUser",
    "userPermissionsSiteforcePublisherUser",
    "userPermissionsSupportUser",
    "userPermissionsWorkDotComUserFeature",
    "userPreferences",
    "userPreferencesActivityRemindersPopup",
    "userPreferencesApexPagesDeveloperMode",
    "userPreferencesContentEmailAsAndWhen",
    "userPreferencesContentNoEmail",
    "userPreferencesDisableCoachingEmail",
    "userPreferencesDisableFeedbackEmail",
    "userPreferencesDisableGoalEmail",
    "userPreferencesDisableWorkEmail",
    "userPreferencesEventRemindersCheckboxDefault",
    "userPreferencesHideCSNDesktopTask",
    "userPreferencesHideCSNGetChatterMobileTask",
    "userPreferencesHideChatterOnboardingSplash",
    "userPreferencesHideS1BrowserUI",
    "userPreferencesHideSecondChatterOnboardingSplash",
    "userPreferencesReminderSoundOff",
    "userPreferencesShowCityToExternalUsers",
    "userPreferencesShowCityToGuestUsers",
    "userPreferencesShowCountryToExternalUsers",
    "userPreferencesShowCountryToGuestUsers",
    "userPreferencesShowEmailToExternalUsers",
    "userPreferencesShowFaxToExternalUsers",
    "userPreferencesShowManagerToExternalUsers",
    "userPreferencesShowMobilePhoneToExternalUsers",
    "userPreferencesShowPostalCodeToExternalUsers",
    "userPreferencesShowPostalCodeToGuestUsers",
    "userPreferencesShowProfilePicToGuestUsers",
    "userPreferencesShowStateToExternalUsers",
    "userPreferencesShowStateToGuestUsers",
    "userPreferencesShowStreetAddressToExternalUsers",
    "userPreferencesShowTitleToExternalUsers",
    "userPreferencesShowTitleToGuestUsers",
    "userPreferencesShowWorkPhoneToExternalUsers",
    "userPreferencesTaskRemindersCheckboxDefault",
    "userRole",
    "userRoleId",
    "userSites",
    "userType",
    "username",
    "cve__HideCaseManagementSections__C",
    "cve__HidePaymentCalculationSections__C",
    "cve__HideSplashScreen__C",
    "cve__LastAccessedClaimId__C",
    "cve__PaymentCorrectionMode__C",
    "cve__PlannedTasks__R",
    "cve__QuestionsLanguageCode__C"
})
public class User
    extends SObject
{

    @XmlElement(name = "AcceptedEventRelations", nillable = true)
    protected QueryResultType acceptedEventRelations;
    @XmlElement(name = "Account", nillable = true)
    protected Account account;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "Address", nillable = true)
    protected AddressType address;
    @XmlElement(name = "Alias", nillable = true)
    protected String alias;
    @XmlElement(name = "BadgeText", nillable = true)
    protected String badgeText;
    @XmlElement(name = "CallCenterId", nillable = true)
    protected String callCenterId;
    @XmlElement(name = "City", nillable = true)
    protected String city;
    @XmlElement(name = "CombinedAttachments", nillable = true)
    protected QueryResultType combinedAttachments;
    @XmlElement(name = "CommunityNickname", nillable = true)
    protected String communityNickname;
    @XmlElement(name = "CompanyName", nillable = true)
    protected String companyName;
    @XmlElement(name = "Contact", nillable = true)
    protected Contact contact;
    @XmlElement(name = "ContactId", nillable = true)
    protected String contactId;
    @XmlElement(name = "ContractsSigned", nillable = true)
    protected QueryResultType contractsSigned;
    @XmlElement(name = "Country", nillable = true)
    protected String country;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DeclinedEventRelations", nillable = true)
    protected QueryResultType declinedEventRelations;
    @XmlElement(name = "DelegatedApproverId", nillable = true)
    protected String delegatedApproverId;
    @XmlElement(name = "DelegatedUsers", nillable = true)
    protected QueryResultType delegatedUsers;
    @XmlElement(name = "Department", nillable = true)
    protected String department;
    @XmlElement(name = "Division", nillable = true)
    protected String division;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "EmailEncodingKey", nillable = true)
    protected String emailEncodingKey;
    @XmlElement(name = "EmailPreferencesAutoBcc", nillable = true)
    protected Boolean emailPreferencesAutoBcc;
    @XmlElement(name = "EmailPreferencesAutoBccStayInTouch", nillable = true)
    protected Boolean emailPreferencesAutoBccStayInTouch;
    @XmlElement(name = "EmailPreferencesStayInTouchReminder", nillable = true)
    protected Boolean emailPreferencesStayInTouchReminder;
    @XmlElement(name = "EmployeeNumber", nillable = true)
    protected String employeeNumber;
    @XmlElement(name = "EventRelations", nillable = true)
    protected QueryResultType eventRelations;
    @XmlElement(name = "Extension", nillable = true)
    protected String extension;
    @XmlElement(name = "ExternalDataUserAuths", nillable = true)
    protected QueryResultType externalDataUserAuths;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FederationIdentifier", nillable = true)
    protected String federationIdentifier;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "ForecastEnabled", nillable = true)
    protected Boolean forecastEnabled;
    @XmlElement(name = "InstalledMobileApps", nillable = true)
    protected QueryResultType installedMobileApps;
    @XmlElement(name = "IsActive", nillable = true)
    protected Boolean isActive;
    @XmlElement(name = "IsBadged", nillable = true)
    protected Boolean isBadged;
    @XmlElement(name = "LanguageLocaleKey", nillable = true)
    protected String languageLocaleKey;
    @XmlElement(name = "LastLoginDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "LastPasswordChangeDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPasswordChangeDate;
    @XmlElement(name = "LastReferencedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReferencedDate;
    @XmlElement(name = "LastViewedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastViewedDate;
    @XmlElement(name = "Latitude", nillable = true)
    protected Double latitude;
    @XmlElement(name = "LocaleSidKey", nillable = true)
    protected String localeSidKey;
    @XmlElement(name = "Longitude", nillable = true)
    protected Double longitude;
    @XmlElement(name = "ManagedUsers", nillable = true)
    protected QueryResultType managedUsers;
    @XmlElement(name = "Manager", nillable = true)
    protected User manager;
    @XmlElement(name = "ManagerId", nillable = true)
    protected String managerId;
    @XmlElement(name = "MobilePhone", nillable = true)
    protected String mobilePhone;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "OfflinePdaTrialExpirationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offlinePdaTrialExpirationDate;
    @XmlElement(name = "OfflineTrialExpirationDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offlineTrialExpirationDate;
    @XmlElement(name = "PermissionSetAssignments", nillable = true)
    protected QueryResultType permissionSetAssignments;
    @XmlElement(name = "PermissionSetLicenseAssignments", nillable = true)
    protected QueryResultType permissionSetLicenseAssignments;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "PostalCode", nillable = true)
    protected String postalCode;
    @XmlElement(name = "Profile", nillable = true)
    protected Profile profile;
    @XmlElement(name = "ProfileId", nillable = true)
    protected String profileId;
    @XmlElement(name = "ReceivesAdminInfoEmails", nillable = true)
    protected Boolean receivesAdminInfoEmails;
    @XmlElement(name = "ReceivesInfoEmails", nillable = true)
    protected Boolean receivesInfoEmails;
    @XmlElement(name = "SenderEmail", nillable = true)
    protected String senderEmail;
    @XmlElement(name = "SenderName", nillable = true)
    protected String senderName;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResultType shares;
    @XmlElement(name = "Signature", nillable = true)
    protected String signature;
    @XmlElement(name = "State", nillable = true)
    protected String state;
    @XmlElement(name = "StayInTouchNote", nillable = true)
    protected String stayInTouchNote;
    @XmlElement(name = "StayInTouchSignature", nillable = true)
    protected String stayInTouchSignature;
    @XmlElement(name = "StayInTouchSubject", nillable = true)
    protected String stayInTouchSubject;
    @XmlElement(name = "Street", nillable = true)
    protected String street;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TimeZoneSidKey", nillable = true)
    protected String timeZoneSidKey;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "UndecidedEventRelations", nillable = true)
    protected QueryResultType undecidedEventRelations;
    @XmlElement(name = "UserPermissionsCallCenterAutoLogin", nillable = true)
    protected Boolean userPermissionsCallCenterAutoLogin;
    @XmlElement(name = "UserPermissionsChatterAnswersUser", nillable = true)
    protected Boolean userPermissionsChatterAnswersUser;
    @XmlElement(name = "UserPermissionsInteractionUser", nillable = true)
    protected Boolean userPermissionsInteractionUser;
    @XmlElement(name = "UserPermissionsKnowledgeUser", nillable = true)
    protected Boolean userPermissionsKnowledgeUser;
    @XmlElement(name = "UserPermissionsMarketingUser", nillable = true)
    protected Boolean userPermissionsMarketingUser;
    @XmlElement(name = "UserPermissionsMobileUser", nillable = true)
    protected Boolean userPermissionsMobileUser;
    @XmlElement(name = "UserPermissionsOfflineUser", nillable = true)
    protected Boolean userPermissionsOfflineUser;
    @XmlElement(name = "UserPermissionsSFContentUser", nillable = true)
    protected Boolean userPermissionsSFContentUser;
    @XmlElement(name = "UserPermissionsSiteforceContributorUser", nillable = true)
    protected Boolean userPermissionsSiteforceContributorUser;
    @XmlElement(name = "UserPermissionsSiteforcePublisherUser", nillable = true)
    protected Boolean userPermissionsSiteforcePublisherUser;
    @XmlElement(name = "UserPermissionsSupportUser", nillable = true)
    protected Boolean userPermissionsSupportUser;
    @XmlElement(name = "UserPermissionsWorkDotComUserFeature", nillable = true)
    protected Boolean userPermissionsWorkDotComUserFeature;
    @XmlElement(name = "UserPreferences", nillable = true)
    protected QueryResultType userPreferences;
    @XmlElement(name = "UserPreferencesActivityRemindersPopup", nillable = true)
    protected Boolean userPreferencesActivityRemindersPopup;
    @XmlElement(name = "UserPreferencesApexPagesDeveloperMode", nillable = true)
    protected Boolean userPreferencesApexPagesDeveloperMode;
    @XmlElement(name = "UserPreferencesContentEmailAsAndWhen", nillable = true)
    protected Boolean userPreferencesContentEmailAsAndWhen;
    @XmlElement(name = "UserPreferencesContentNoEmail", nillable = true)
    protected Boolean userPreferencesContentNoEmail;
    @XmlElement(name = "UserPreferencesDisableCoachingEmail", nillable = true)
    protected Boolean userPreferencesDisableCoachingEmail;
    @XmlElement(name = "UserPreferencesDisableFeedbackEmail", nillable = true)
    protected Boolean userPreferencesDisableFeedbackEmail;
    @XmlElement(name = "UserPreferencesDisableGoalEmail", nillable = true)
    protected Boolean userPreferencesDisableGoalEmail;
    @XmlElement(name = "UserPreferencesDisableWorkEmail", nillable = true)
    protected Boolean userPreferencesDisableWorkEmail;
    @XmlElement(name = "UserPreferencesEventRemindersCheckboxDefault", nillable = true)
    protected Boolean userPreferencesEventRemindersCheckboxDefault;
    @XmlElement(name = "UserPreferencesHideCSNDesktopTask", nillable = true)
    protected Boolean userPreferencesHideCSNDesktopTask;
    @XmlElement(name = "UserPreferencesHideCSNGetChatterMobileTask", nillable = true)
    protected Boolean userPreferencesHideCSNGetChatterMobileTask;
    @XmlElement(name = "UserPreferencesHideChatterOnboardingSplash", nillable = true)
    protected Boolean userPreferencesHideChatterOnboardingSplash;
    @XmlElement(name = "UserPreferencesHideS1BrowserUI", nillable = true)
    protected Boolean userPreferencesHideS1BrowserUI;
    @XmlElement(name = "UserPreferencesHideSecondChatterOnboardingSplash", nillable = true)
    protected Boolean userPreferencesHideSecondChatterOnboardingSplash;
    @XmlElement(name = "UserPreferencesReminderSoundOff", nillable = true)
    protected Boolean userPreferencesReminderSoundOff;
    @XmlElement(name = "UserPreferencesShowCityToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowCityToExternalUsers;
    @XmlElement(name = "UserPreferencesShowCityToGuestUsers", nillable = true)
    protected Boolean userPreferencesShowCityToGuestUsers;
    @XmlElement(name = "UserPreferencesShowCountryToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowCountryToExternalUsers;
    @XmlElement(name = "UserPreferencesShowCountryToGuestUsers", nillable = true)
    protected Boolean userPreferencesShowCountryToGuestUsers;
    @XmlElement(name = "UserPreferencesShowEmailToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowEmailToExternalUsers;
    @XmlElement(name = "UserPreferencesShowFaxToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowFaxToExternalUsers;
    @XmlElement(name = "UserPreferencesShowManagerToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowManagerToExternalUsers;
    @XmlElement(name = "UserPreferencesShowMobilePhoneToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowMobilePhoneToExternalUsers;
    @XmlElement(name = "UserPreferencesShowPostalCodeToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowPostalCodeToExternalUsers;
    @XmlElement(name = "UserPreferencesShowPostalCodeToGuestUsers", nillable = true)
    protected Boolean userPreferencesShowPostalCodeToGuestUsers;
    @XmlElement(name = "UserPreferencesShowProfilePicToGuestUsers", nillable = true)
    protected Boolean userPreferencesShowProfilePicToGuestUsers;
    @XmlElement(name = "UserPreferencesShowStateToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowStateToExternalUsers;
    @XmlElement(name = "UserPreferencesShowStateToGuestUsers", nillable = true)
    protected Boolean userPreferencesShowStateToGuestUsers;
    @XmlElement(name = "UserPreferencesShowStreetAddressToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowStreetAddressToExternalUsers;
    @XmlElement(name = "UserPreferencesShowTitleToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowTitleToExternalUsers;
    @XmlElement(name = "UserPreferencesShowTitleToGuestUsers", nillable = true)
    protected Boolean userPreferencesShowTitleToGuestUsers;
    @XmlElement(name = "UserPreferencesShowWorkPhoneToExternalUsers", nillable = true)
    protected Boolean userPreferencesShowWorkPhoneToExternalUsers;
    @XmlElement(name = "UserPreferencesTaskRemindersCheckboxDefault", nillable = true)
    protected Boolean userPreferencesTaskRemindersCheckboxDefault;
    @XmlElement(name = "UserRole", nillable = true)
    protected UserRole userRole;
    @XmlElement(name = "UserRoleId", nillable = true)
    protected String userRoleId;
    @XmlElement(name = "UserSites", nillable = true)
    protected QueryResultType userSites;
    @XmlElement(name = "UserType", nillable = true)
    protected String userType;
    @XmlElement(name = "Username", nillable = true)
    protected String username;
    @XmlElement(name = "cve__HideCaseManagementSections__c", nillable = true)
    protected Boolean cve__HideCaseManagementSections__C;
    @XmlElement(name = "cve__HidePaymentCalculationSections__c", nillable = true)
    protected Boolean cve__HidePaymentCalculationSections__C;
    @XmlElement(name = "cve__HideSplashScreen__c", nillable = true)
    protected Boolean cve__HideSplashScreen__C;
    @XmlElement(name = "cve__LastAccessedClaimId__c", nillable = true)
    protected String cve__LastAccessedClaimId__C;
    @XmlElement(name = "cve__PaymentCorrectionMode__c", nillable = true)
    protected Boolean cve__PaymentCorrectionMode__C;
    @XmlElement(name = "cve__PlannedTasks__r", nillable = true)
    protected QueryResultType cve__PlannedTasks__R;
    @XmlElement(name = "cve__QuestionsLanguageCode__c", nillable = true)
    protected String cve__QuestionsLanguageCode__C;

    /**
     * Gets the value of the acceptedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getAcceptedEventRelations() {
        return acceptedEventRelations;
    }

    /**
     * Sets the value of the acceptedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setAcceptedEventRelations(QueryResultType value) {
        this.acceptedEventRelations = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the badgeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadgeText() {
        return badgeText;
    }

    /**
     * Sets the value of the badgeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadgeText(String value) {
        this.badgeText = value;
    }

    /**
     * Gets the value of the callCenterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterId() {
        return callCenterId;
    }

    /**
     * Sets the value of the callCenterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallCenterId(String value) {
        this.callCenterId = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the communityNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityNickname() {
        return communityNickname;
    }

    /**
     * Sets the value of the communityNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityNickname(String value) {
        this.communityNickname = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contractsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getContractsSigned() {
        return contractsSigned;
    }

    /**
     * Sets the value of the contractsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setContractsSigned(QueryResultType value) {
        this.contractsSigned = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the declinedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getDeclinedEventRelations() {
        return declinedEventRelations;
    }

    /**
     * Sets the value of the declinedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setDeclinedEventRelations(QueryResultType value) {
        this.declinedEventRelations = value;
    }

    /**
     * Gets the value of the delegatedApproverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedApproverId() {
        return delegatedApproverId;
    }

    /**
     * Sets the value of the delegatedApproverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedApproverId(String value) {
        this.delegatedApproverId = value;
    }

    /**
     * Gets the value of the delegatedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getDelegatedUsers() {
        return delegatedUsers;
    }

    /**
     * Sets the value of the delegatedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setDelegatedUsers(QueryResultType value) {
        this.delegatedUsers = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailEncodingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEncodingKey() {
        return emailEncodingKey;
    }

    /**
     * Sets the value of the emailEncodingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEncodingKey(String value) {
        this.emailEncodingKey = value;
    }

    /**
     * Gets the value of the emailPreferencesAutoBcc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailPreferencesAutoBcc() {
        return emailPreferencesAutoBcc;
    }

    /**
     * Sets the value of the emailPreferencesAutoBcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailPreferencesAutoBcc(Boolean value) {
        this.emailPreferencesAutoBcc = value;
    }

    /**
     * Gets the value of the emailPreferencesAutoBccStayInTouch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailPreferencesAutoBccStayInTouch() {
        return emailPreferencesAutoBccStayInTouch;
    }

    /**
     * Sets the value of the emailPreferencesAutoBccStayInTouch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailPreferencesAutoBccStayInTouch(Boolean value) {
        this.emailPreferencesAutoBccStayInTouch = value;
    }

    /**
     * Gets the value of the emailPreferencesStayInTouchReminder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailPreferencesStayInTouchReminder() {
        return emailPreferencesStayInTouchReminder;
    }

    /**
     * Sets the value of the emailPreferencesStayInTouchReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailPreferencesStayInTouchReminder(Boolean value) {
        this.emailPreferencesStayInTouchReminder = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the eventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getEventRelations() {
        return eventRelations;
    }

    /**
     * Sets the value of the eventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setEventRelations(QueryResultType value) {
        this.eventRelations = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the externalDataUserAuths property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getExternalDataUserAuths() {
        return externalDataUserAuths;
    }

    /**
     * Sets the value of the externalDataUserAuths property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setExternalDataUserAuths(QueryResultType value) {
        this.externalDataUserAuths = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the federationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederationIdentifier() {
        return federationIdentifier;
    }

    /**
     * Sets the value of the federationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederationIdentifier(String value) {
        this.federationIdentifier = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the forecastEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastEnabled() {
        return forecastEnabled;
    }

    /**
     * Sets the value of the forecastEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastEnabled(Boolean value) {
        this.forecastEnabled = value;
    }

    /**
     * Gets the value of the installedMobileApps property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getInstalledMobileApps() {
        return installedMobileApps;
    }

    /**
     * Sets the value of the installedMobileApps property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setInstalledMobileApps(QueryResultType value) {
        this.installedMobileApps = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isBadged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBadged() {
        return isBadged;
    }

    /**
     * Sets the value of the isBadged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBadged(Boolean value) {
        this.isBadged = value;
    }

    /**
     * Gets the value of the languageLocaleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageLocaleKey() {
        return languageLocaleKey;
    }

    /**
     * Sets the value of the languageLocaleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageLocaleKey(String value) {
        this.languageLocaleKey = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginDate(XMLGregorianCalendar value) {
        this.lastLoginDate = value;
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPasswordChangeDate() {
        return lastPasswordChangeDate;
    }

    /**
     * Sets the value of the lastPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPasswordChangeDate(XMLGregorianCalendar value) {
        this.lastPasswordChangeDate = value;
    }

    /**
     * Gets the value of the lastReferencedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the value of the lastReferencedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReferencedDate(XMLGregorianCalendar value) {
        this.lastReferencedDate = value;
    }

    /**
     * Gets the value of the lastViewedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the value of the lastViewedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastViewedDate(XMLGregorianCalendar value) {
        this.lastViewedDate = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the localeSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleSidKey() {
        return localeSidKey;
    }

    /**
     * Sets the value of the localeSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleSidKey(String value) {
        this.localeSidKey = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the managedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getManagedUsers() {
        return managedUsers;
    }

    /**
     * Sets the value of the managedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setManagedUsers(QueryResultType value) {
        this.managedUsers = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setManager(User value) {
        this.manager = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
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
     * Gets the value of the offlinePdaTrialExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfflinePdaTrialExpirationDate() {
        return offlinePdaTrialExpirationDate;
    }

    /**
     * Sets the value of the offlinePdaTrialExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfflinePdaTrialExpirationDate(XMLGregorianCalendar value) {
        this.offlinePdaTrialExpirationDate = value;
    }

    /**
     * Gets the value of the offlineTrialExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfflineTrialExpirationDate() {
        return offlineTrialExpirationDate;
    }

    /**
     * Sets the value of the offlineTrialExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfflineTrialExpirationDate(XMLGregorianCalendar value) {
        this.offlineTrialExpirationDate = value;
    }

    /**
     * Gets the value of the permissionSetAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getPermissionSetAssignments() {
        return permissionSetAssignments;
    }

    /**
     * Sets the value of the permissionSetAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setPermissionSetAssignments(QueryResultType value) {
        this.permissionSetAssignments = value;
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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
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
     * Gets the value of the receivesAdminInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }

    /**
     * Sets the value of the receivesAdminInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivesAdminInfoEmails(Boolean value) {
        this.receivesAdminInfoEmails = value;
    }

    /**
     * Gets the value of the receivesInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceivesInfoEmails() {
        return receivesInfoEmails;
    }

    /**
     * Sets the value of the receivesInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceivesInfoEmails(Boolean value) {
        this.receivesInfoEmails = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setShares(QueryResultType value) {
        this.shares = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the stayInTouchNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayInTouchNote() {
        return stayInTouchNote;
    }

    /**
     * Sets the value of the stayInTouchNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayInTouchNote(String value) {
        this.stayInTouchNote = value;
    }

    /**
     * Gets the value of the stayInTouchSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayInTouchSignature() {
        return stayInTouchSignature;
    }

    /**
     * Sets the value of the stayInTouchSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayInTouchSignature(String value) {
        this.stayInTouchSignature = value;
    }

    /**
     * Gets the value of the stayInTouchSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayInTouchSubject() {
        return stayInTouchSubject;
    }

    /**
     * Sets the value of the stayInTouchSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayInTouchSubject(String value) {
        this.stayInTouchSubject = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
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
     * Gets the value of the timeZoneSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneSidKey() {
        return timeZoneSidKey;
    }

    /**
     * Sets the value of the timeZoneSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneSidKey(String value) {
        this.timeZoneSidKey = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the undecidedEventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getUndecidedEventRelations() {
        return undecidedEventRelations;
    }

    /**
     * Sets the value of the undecidedEventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setUndecidedEventRelations(QueryResultType value) {
        this.undecidedEventRelations = value;
    }

    /**
     * Gets the value of the userPermissionsCallCenterAutoLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsCallCenterAutoLogin() {
        return userPermissionsCallCenterAutoLogin;
    }

    /**
     * Sets the value of the userPermissionsCallCenterAutoLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsCallCenterAutoLogin(Boolean value) {
        this.userPermissionsCallCenterAutoLogin = value;
    }

    /**
     * Gets the value of the userPermissionsChatterAnswersUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsChatterAnswersUser() {
        return userPermissionsChatterAnswersUser;
    }

    /**
     * Sets the value of the userPermissionsChatterAnswersUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsChatterAnswersUser(Boolean value) {
        this.userPermissionsChatterAnswersUser = value;
    }

    /**
     * Gets the value of the userPermissionsInteractionUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsInteractionUser() {
        return userPermissionsInteractionUser;
    }

    /**
     * Sets the value of the userPermissionsInteractionUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsInteractionUser(Boolean value) {
        this.userPermissionsInteractionUser = value;
    }

    /**
     * Gets the value of the userPermissionsKnowledgeUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsKnowledgeUser() {
        return userPermissionsKnowledgeUser;
    }

    /**
     * Sets the value of the userPermissionsKnowledgeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsKnowledgeUser(Boolean value) {
        this.userPermissionsKnowledgeUser = value;
    }

    /**
     * Gets the value of the userPermissionsMarketingUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsMarketingUser() {
        return userPermissionsMarketingUser;
    }

    /**
     * Sets the value of the userPermissionsMarketingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsMarketingUser(Boolean value) {
        this.userPermissionsMarketingUser = value;
    }

    /**
     * Gets the value of the userPermissionsMobileUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsMobileUser() {
        return userPermissionsMobileUser;
    }

    /**
     * Sets the value of the userPermissionsMobileUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsMobileUser(Boolean value) {
        this.userPermissionsMobileUser = value;
    }

    /**
     * Gets the value of the userPermissionsOfflineUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsOfflineUser() {
        return userPermissionsOfflineUser;
    }

    /**
     * Sets the value of the userPermissionsOfflineUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsOfflineUser(Boolean value) {
        this.userPermissionsOfflineUser = value;
    }

    /**
     * Gets the value of the userPermissionsSFContentUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsSFContentUser() {
        return userPermissionsSFContentUser;
    }

    /**
     * Sets the value of the userPermissionsSFContentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsSFContentUser(Boolean value) {
        this.userPermissionsSFContentUser = value;
    }

    /**
     * Gets the value of the userPermissionsSiteforceContributorUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsSiteforceContributorUser() {
        return userPermissionsSiteforceContributorUser;
    }

    /**
     * Sets the value of the userPermissionsSiteforceContributorUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsSiteforceContributorUser(Boolean value) {
        this.userPermissionsSiteforceContributorUser = value;
    }

    /**
     * Gets the value of the userPermissionsSiteforcePublisherUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsSiteforcePublisherUser() {
        return userPermissionsSiteforcePublisherUser;
    }

    /**
     * Sets the value of the userPermissionsSiteforcePublisherUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsSiteforcePublisherUser(Boolean value) {
        this.userPermissionsSiteforcePublisherUser = value;
    }

    /**
     * Gets the value of the userPermissionsSupportUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsSupportUser() {
        return userPermissionsSupportUser;
    }

    /**
     * Sets the value of the userPermissionsSupportUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsSupportUser(Boolean value) {
        this.userPermissionsSupportUser = value;
    }

    /**
     * Gets the value of the userPermissionsWorkDotComUserFeature property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPermissionsWorkDotComUserFeature() {
        return userPermissionsWorkDotComUserFeature;
    }

    /**
     * Sets the value of the userPermissionsWorkDotComUserFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPermissionsWorkDotComUserFeature(Boolean value) {
        this.userPermissionsWorkDotComUserFeature = value;
    }

    /**
     * Gets the value of the userPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getUserPreferences() {
        return userPreferences;
    }

    /**
     * Sets the value of the userPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setUserPreferences(QueryResultType value) {
        this.userPreferences = value;
    }

    /**
     * Gets the value of the userPreferencesActivityRemindersPopup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesActivityRemindersPopup() {
        return userPreferencesActivityRemindersPopup;
    }

    /**
     * Sets the value of the userPreferencesActivityRemindersPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesActivityRemindersPopup(Boolean value) {
        this.userPreferencesActivityRemindersPopup = value;
    }

    /**
     * Gets the value of the userPreferencesApexPagesDeveloperMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesApexPagesDeveloperMode() {
        return userPreferencesApexPagesDeveloperMode;
    }

    /**
     * Sets the value of the userPreferencesApexPagesDeveloperMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesApexPagesDeveloperMode(Boolean value) {
        this.userPreferencesApexPagesDeveloperMode = value;
    }

    /**
     * Gets the value of the userPreferencesContentEmailAsAndWhen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesContentEmailAsAndWhen() {
        return userPreferencesContentEmailAsAndWhen;
    }

    /**
     * Sets the value of the userPreferencesContentEmailAsAndWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesContentEmailAsAndWhen(Boolean value) {
        this.userPreferencesContentEmailAsAndWhen = value;
    }

    /**
     * Gets the value of the userPreferencesContentNoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesContentNoEmail() {
        return userPreferencesContentNoEmail;
    }

    /**
     * Sets the value of the userPreferencesContentNoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesContentNoEmail(Boolean value) {
        this.userPreferencesContentNoEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableCoachingEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesDisableCoachingEmail() {
        return userPreferencesDisableCoachingEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableCoachingEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesDisableCoachingEmail(Boolean value) {
        this.userPreferencesDisableCoachingEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableFeedbackEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesDisableFeedbackEmail() {
        return userPreferencesDisableFeedbackEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableFeedbackEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesDisableFeedbackEmail(Boolean value) {
        this.userPreferencesDisableFeedbackEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableGoalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesDisableGoalEmail() {
        return userPreferencesDisableGoalEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableGoalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesDisableGoalEmail(Boolean value) {
        this.userPreferencesDisableGoalEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableWorkEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesDisableWorkEmail() {
        return userPreferencesDisableWorkEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableWorkEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesDisableWorkEmail(Boolean value) {
        this.userPreferencesDisableWorkEmail = value;
    }

    /**
     * Gets the value of the userPreferencesEventRemindersCheckboxDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesEventRemindersCheckboxDefault() {
        return userPreferencesEventRemindersCheckboxDefault;
    }

    /**
     * Sets the value of the userPreferencesEventRemindersCheckboxDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesEventRemindersCheckboxDefault(Boolean value) {
        this.userPreferencesEventRemindersCheckboxDefault = value;
    }

    /**
     * Gets the value of the userPreferencesHideCSNDesktopTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesHideCSNDesktopTask() {
        return userPreferencesHideCSNDesktopTask;
    }

    /**
     * Sets the value of the userPreferencesHideCSNDesktopTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesHideCSNDesktopTask(Boolean value) {
        this.userPreferencesHideCSNDesktopTask = value;
    }

    /**
     * Gets the value of the userPreferencesHideCSNGetChatterMobileTask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesHideCSNGetChatterMobileTask() {
        return userPreferencesHideCSNGetChatterMobileTask;
    }

    /**
     * Sets the value of the userPreferencesHideCSNGetChatterMobileTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesHideCSNGetChatterMobileTask(Boolean value) {
        this.userPreferencesHideCSNGetChatterMobileTask = value;
    }

    /**
     * Gets the value of the userPreferencesHideChatterOnboardingSplash property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesHideChatterOnboardingSplash() {
        return userPreferencesHideChatterOnboardingSplash;
    }

    /**
     * Sets the value of the userPreferencesHideChatterOnboardingSplash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesHideChatterOnboardingSplash(Boolean value) {
        this.userPreferencesHideChatterOnboardingSplash = value;
    }

    /**
     * Gets the value of the userPreferencesHideS1BrowserUI property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesHideS1BrowserUI() {
        return userPreferencesHideS1BrowserUI;
    }

    /**
     * Sets the value of the userPreferencesHideS1BrowserUI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesHideS1BrowserUI(Boolean value) {
        this.userPreferencesHideS1BrowserUI = value;
    }

    /**
     * Gets the value of the userPreferencesHideSecondChatterOnboardingSplash property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesHideSecondChatterOnboardingSplash() {
        return userPreferencesHideSecondChatterOnboardingSplash;
    }

    /**
     * Sets the value of the userPreferencesHideSecondChatterOnboardingSplash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesHideSecondChatterOnboardingSplash(Boolean value) {
        this.userPreferencesHideSecondChatterOnboardingSplash = value;
    }

    /**
     * Gets the value of the userPreferencesReminderSoundOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesReminderSoundOff() {
        return userPreferencesReminderSoundOff;
    }

    /**
     * Sets the value of the userPreferencesReminderSoundOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesReminderSoundOff(Boolean value) {
        this.userPreferencesReminderSoundOff = value;
    }

    /**
     * Gets the value of the userPreferencesShowCityToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowCityToExternalUsers() {
        return userPreferencesShowCityToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowCityToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowCityToExternalUsers(Boolean value) {
        this.userPreferencesShowCityToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowCityToGuestUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowCityToGuestUsers() {
        return userPreferencesShowCityToGuestUsers;
    }

    /**
     * Sets the value of the userPreferencesShowCityToGuestUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowCityToGuestUsers(Boolean value) {
        this.userPreferencesShowCityToGuestUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowCountryToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowCountryToExternalUsers() {
        return userPreferencesShowCountryToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowCountryToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowCountryToExternalUsers(Boolean value) {
        this.userPreferencesShowCountryToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowCountryToGuestUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowCountryToGuestUsers() {
        return userPreferencesShowCountryToGuestUsers;
    }

    /**
     * Sets the value of the userPreferencesShowCountryToGuestUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowCountryToGuestUsers(Boolean value) {
        this.userPreferencesShowCountryToGuestUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowEmailToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowEmailToExternalUsers() {
        return userPreferencesShowEmailToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowEmailToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowEmailToExternalUsers(Boolean value) {
        this.userPreferencesShowEmailToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowFaxToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowFaxToExternalUsers() {
        return userPreferencesShowFaxToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowFaxToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowFaxToExternalUsers(Boolean value) {
        this.userPreferencesShowFaxToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowManagerToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowManagerToExternalUsers() {
        return userPreferencesShowManagerToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowManagerToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowManagerToExternalUsers(Boolean value) {
        this.userPreferencesShowManagerToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowMobilePhoneToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowMobilePhoneToExternalUsers() {
        return userPreferencesShowMobilePhoneToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowMobilePhoneToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowMobilePhoneToExternalUsers(Boolean value) {
        this.userPreferencesShowMobilePhoneToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowPostalCodeToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowPostalCodeToExternalUsers() {
        return userPreferencesShowPostalCodeToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowPostalCodeToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowPostalCodeToExternalUsers(Boolean value) {
        this.userPreferencesShowPostalCodeToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowPostalCodeToGuestUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowPostalCodeToGuestUsers() {
        return userPreferencesShowPostalCodeToGuestUsers;
    }

    /**
     * Sets the value of the userPreferencesShowPostalCodeToGuestUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowPostalCodeToGuestUsers(Boolean value) {
        this.userPreferencesShowPostalCodeToGuestUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowProfilePicToGuestUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowProfilePicToGuestUsers() {
        return userPreferencesShowProfilePicToGuestUsers;
    }

    /**
     * Sets the value of the userPreferencesShowProfilePicToGuestUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowProfilePicToGuestUsers(Boolean value) {
        this.userPreferencesShowProfilePicToGuestUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowStateToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowStateToExternalUsers() {
        return userPreferencesShowStateToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowStateToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowStateToExternalUsers(Boolean value) {
        this.userPreferencesShowStateToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowStateToGuestUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowStateToGuestUsers() {
        return userPreferencesShowStateToGuestUsers;
    }

    /**
     * Sets the value of the userPreferencesShowStateToGuestUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowStateToGuestUsers(Boolean value) {
        this.userPreferencesShowStateToGuestUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowStreetAddressToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowStreetAddressToExternalUsers() {
        return userPreferencesShowStreetAddressToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowStreetAddressToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowStreetAddressToExternalUsers(Boolean value) {
        this.userPreferencesShowStreetAddressToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowTitleToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowTitleToExternalUsers() {
        return userPreferencesShowTitleToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowTitleToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowTitleToExternalUsers(Boolean value) {
        this.userPreferencesShowTitleToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowTitleToGuestUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowTitleToGuestUsers() {
        return userPreferencesShowTitleToGuestUsers;
    }

    /**
     * Sets the value of the userPreferencesShowTitleToGuestUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowTitleToGuestUsers(Boolean value) {
        this.userPreferencesShowTitleToGuestUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowWorkPhoneToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesShowWorkPhoneToExternalUsers() {
        return userPreferencesShowWorkPhoneToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowWorkPhoneToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesShowWorkPhoneToExternalUsers(Boolean value) {
        this.userPreferencesShowWorkPhoneToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesTaskRemindersCheckboxDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserPreferencesTaskRemindersCheckboxDefault() {
        return userPreferencesTaskRemindersCheckboxDefault;
    }

    /**
     * Sets the value of the userPreferencesTaskRemindersCheckboxDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserPreferencesTaskRemindersCheckboxDefault(Boolean value) {
        this.userPreferencesTaskRemindersCheckboxDefault = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link UserRole }
     *     
     */
    public UserRole getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRole }
     *     
     */
    public void setUserRole(UserRole value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the userRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRoleId() {
        return userRoleId;
    }

    /**
     * Sets the value of the userRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRoleId(String value) {
        this.userRoleId = value;
    }

    /**
     * Gets the value of the userSites property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getUserSites() {
        return userSites;
    }

    /**
     * Sets the value of the userSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setUserSites(QueryResultType value) {
        this.userSites = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the cve__HideCaseManagementSections__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideCaseManagementSections__C() {
        return cve__HideCaseManagementSections__C;
    }

    /**
     * Sets the value of the cve__HideCaseManagementSections__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideCaseManagementSections__C(Boolean value) {
        this.cve__HideCaseManagementSections__C = value;
    }

    /**
     * Gets the value of the cve__HidePaymentCalculationSections__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HidePaymentCalculationSections__C() {
        return cve__HidePaymentCalculationSections__C;
    }

    /**
     * Sets the value of the cve__HidePaymentCalculationSections__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HidePaymentCalculationSections__C(Boolean value) {
        this.cve__HidePaymentCalculationSections__C = value;
    }

    /**
     * Gets the value of the cve__HideSplashScreen__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HideSplashScreen__C() {
        return cve__HideSplashScreen__C;
    }

    /**
     * Sets the value of the cve__HideSplashScreen__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HideSplashScreen__C(Boolean value) {
        this.cve__HideSplashScreen__C = value;
    }

    /**
     * Gets the value of the cve__LastAccessedClaimId__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LastAccessedClaimId__C() {
        return cve__LastAccessedClaimId__C;
    }

    /**
     * Sets the value of the cve__LastAccessedClaimId__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LastAccessedClaimId__C(String value) {
        this.cve__LastAccessedClaimId__C = value;
    }

    /**
     * Gets the value of the cve__PaymentCorrectionMode__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PaymentCorrectionMode__C() {
        return cve__PaymentCorrectionMode__C;
    }

    /**
     * Sets the value of the cve__PaymentCorrectionMode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PaymentCorrectionMode__C(Boolean value) {
        this.cve__PaymentCorrectionMode__C = value;
    }

    /**
     * Gets the value of the cve__PlannedTasks__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PlannedTasks__R() {
        return cve__PlannedTasks__R;
    }

    /**
     * Sets the value of the cve__PlannedTasks__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PlannedTasks__R(QueryResultType value) {
        this.cve__PlannedTasks__R = value;
    }

    /**
     * Gets the value of the cve__QuestionsLanguageCode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__QuestionsLanguageCode__C() {
        return cve__QuestionsLanguageCode__C;
    }

    /**
     * Sets the value of the cve__QuestionsLanguageCode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__QuestionsLanguageCode__C(String value) {
        this.cve__QuestionsLanguageCode__C = value;
    }

}
