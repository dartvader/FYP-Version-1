
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AcceptedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Account" type="{urn:sobject.enterprise.soap.sforce.com}Account" minOccurs="0"/>
 *         &lt;element name="AccountContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ActivityHistories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Assets" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="AssistantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssistantPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CampaignMembers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CaseContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Cases" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContractContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContractsSigned" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeclinedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailBouncedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmailBouncedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailStatuses" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="EventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Histories" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEmailBounced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Jigsaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JigsawContactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languages__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastActivityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastCURequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastCUUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LeadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Level__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{urn:enterprise.soap.sforce.com}address" minOccurs="0"/>
 *         &lt;element name="MailingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingLatitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MailingLongitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MailingPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterRecord" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="MasterRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpenActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Opportunities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OpportunityContactRoles" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="OtherAddress" type="{urn:enterprise.soap.sforce.com}address" minOccurs="0"/>
 *         &lt;element name="OtherCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherLatitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OtherLongitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OtherPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ReportsTo" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ReportsToId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shares" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Tasks" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UndecidedEventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__AccountName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Age__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Allocations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BankAccountNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankAccountType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankPhone__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BankRoutingNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BonusPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Bonus__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Children__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ClaimRelationshipsForConactLabel__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ClaimRelationships__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ClaimantInsuredBenefitsClaimed__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__Claims__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__ClassRelationships__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__CollegeMajor__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ContactHistories__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__DateOfEarningsIncrease__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfFullTimeHire__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfHire__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__DateOfRetirement__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__Degree__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EarningsPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Earnings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Employed__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__EmployeeIdentificationNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Employee__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__GedDiploma__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Gender__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__GraduateSchoolMajor__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HighSchoolDiploma__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HighestGradeCompleted__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__HoursWorkedPerWeek__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaidenName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MailingAddress__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MaritalStatus__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OccupationalDescription__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Parent__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Parent__r" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="cve__PaymentMethod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Payments__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PolicyRelationshipsForConactLabel__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PolicyRelationships__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__SocialSecurityNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Speciality__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Spouse__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Spouse__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__TaxIdNumber__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__TerminationDate__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__TerminationReason__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Testing__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WorkState__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__YearGraduatedFromCollege__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__YearGraduatedFromGraduateSchool__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__YearGraduatedFromHighSchool__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "acceptedEventRelations",
    "account",
    "accountContactRoles",
    "accountId",
    "activityHistories",
    "assets",
    "assistantName",
    "assistantPhone",
    "attachments",
    "birthdate",
    "campaignMembers",
    "caseContactRoles",
    "cases",
    "combinedAttachments",
    "contractContactRoles",
    "contractsSigned",
    "createdBy",
    "createdById",
    "createdDate",
    "declinedEventRelations",
    "department",
    "description",
    "email",
    "emailBouncedDate",
    "emailBouncedReason",
    "emailStatuses",
    "eventRelations",
    "events",
    "fax",
    "firstName",
    "histories",
    "homePhone",
    "isDeleted",
    "isEmailBounced",
    "jigsaw",
    "jigsawContactId",
    "languages__C",
    "lastActivityDate",
    "lastCURequestDate",
    "lastCUUpdateDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "lastReferencedDate",
    "lastViewedDate",
    "leadSource",
    "level__C",
    "lookedUpFromActivities",
    "mailingAddress",
    "mailingCity",
    "mailingCountry",
    "mailingLatitude",
    "mailingLongitude",
    "mailingPostalCode",
    "mailingState",
    "mailingStreet",
    "masterRecord",
    "masterRecordId",
    "mobilePhone",
    "name",
    "notes",
    "notesAndAttachments",
    "openActivities",
    "opportunities",
    "opportunityContactRoles",
    "otherAddress",
    "otherCity",
    "otherCountry",
    "otherLatitude",
    "otherLongitude",
    "otherPhone",
    "otherPostalCode",
    "otherState",
    "otherStreet",
    "owner",
    "ownerId",
    "phone",
    "photoUrl",
    "processInstances",
    "processSteps",
    "reportsTo",
    "reportsToId",
    "salutation",
    "shares",
    "systemModstamp",
    "tasks",
    "title",
    "topicAssignments",
    "undecidedEventRelations",
    "userRecordAccess",
    "cve__AccountName__C",
    "cve__Age__C",
    "cve__Allocations__R",
    "cve__BankAccountNumber__C",
    "cve__BankAccountType__C",
    "cve__BankName__C",
    "cve__BankPhone__C",
    "cve__BankRoutingNumber__C",
    "cve__BonusPeriod__C",
    "cve__Bonus__C",
    "cve__Children__R",
    "cve__ClaimRelationshipsForConactLabel__R",
    "cve__ClaimRelationships__R",
    "cve__ClaimantInsuredBenefitsClaimed__R",
    "cve__Claims__R",
    "cve__ClassRelationships__R",
    "cve__CollegeMajor__C",
    "cve__ContactHistories__R",
    "cve__DateOfEarningsIncrease__C",
    "cve__DateOfFullTimeHire__C",
    "cve__DateOfHire__C",
    "cve__DateOfRetirement__C",
    "cve__Degree__C",
    "cve__EarningsPeriod__C",
    "cve__Earnings__C",
    "cve__Employed__C",
    "cve__EmployeeIdentificationNumber__C",
    "cve__Employee__C",
    "cve__GedDiploma__C",
    "cve__Gender__C",
    "cve__GraduateSchoolMajor__C",
    "cve__HighSchoolDiploma__C",
    "cve__HighestGradeCompleted__C",
    "cve__HoursWorkedPerWeek__C",
    "cve__MaidenName__C",
    "cve__MailingAddress__C",
    "cve__MaritalStatus__C",
    "cve__OccupationalDescription__C",
    "cve__Parent__C",
    "cve__Parent__R",
    "cve__PaymentMethod__C",
    "cve__Payments__R",
    "cve__PolicyRelationshipsForConactLabel__R",
    "cve__PolicyRelationships__R",
    "cve__SocialSecurityNumber__C",
    "cve__Speciality__C",
    "cve__Spouse__C",
    "cve__Spouse__R",
    "cve__TaxIdNumber__C",
    "cve__TerminationDate__C",
    "cve__TerminationReason__C",
    "cve__Testing__C",
    "cve__WorkState__C",
    "cve__YearGraduatedFromCollege__C",
    "cve__YearGraduatedFromGraduateSchool__C",
    "cve__YearGraduatedFromHighSchool__C"
})
public class Contact
    extends SObject
{

    @XmlElement(name = "AcceptedEventRelations", nillable = true)
    protected QueryResultType acceptedEventRelations;
    @XmlElement(name = "Account", nillable = true)
    protected Account account;
    @XmlElement(name = "AccountContactRoles", nillable = true)
    protected QueryResultType accountContactRoles;
    @XmlElement(name = "AccountId", nillable = true)
    protected String accountId;
    @XmlElement(name = "ActivityHistories", nillable = true)
    protected QueryResultType activityHistories;
    @XmlElement(name = "Assets", nillable = true)
    protected QueryResultType assets;
    @XmlElement(name = "AssistantName", nillable = true)
    protected String assistantName;
    @XmlElement(name = "AssistantPhone", nillable = true)
    protected String assistantPhone;
    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResultType attachments;
    @XmlElement(name = "Birthdate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "CampaignMembers", nillable = true)
    protected QueryResultType campaignMembers;
    @XmlElement(name = "CaseContactRoles", nillable = true)
    protected QueryResultType caseContactRoles;
    @XmlElement(name = "Cases", nillable = true)
    protected QueryResultType cases;
    @XmlElement(name = "CombinedAttachments", nillable = true)
    protected QueryResultType combinedAttachments;
    @XmlElement(name = "ContractContactRoles", nillable = true)
    protected QueryResultType contractContactRoles;
    @XmlElement(name = "ContractsSigned", nillable = true)
    protected QueryResultType contractsSigned;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DeclinedEventRelations", nillable = true)
    protected QueryResultType declinedEventRelations;
    @XmlElement(name = "Department", nillable = true)
    protected String department;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Email", nillable = true)
    protected String email;
    @XmlElement(name = "EmailBouncedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emailBouncedDate;
    @XmlElement(name = "EmailBouncedReason", nillable = true)
    protected String emailBouncedReason;
    @XmlElement(name = "EmailStatuses", nillable = true)
    protected QueryResultType emailStatuses;
    @XmlElement(name = "EventRelations", nillable = true)
    protected QueryResultType eventRelations;
    @XmlElement(name = "Events", nillable = true)
    protected QueryResultType events;
    @XmlElement(name = "Fax", nillable = true)
    protected String fax;
    @XmlElement(name = "FirstName", nillable = true)
    protected String firstName;
    @XmlElement(name = "Histories", nillable = true)
    protected QueryResultType histories;
    @XmlElement(name = "HomePhone", nillable = true)
    protected String homePhone;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsEmailBounced", nillable = true)
    protected Boolean isEmailBounced;
    @XmlElement(name = "Jigsaw", nillable = true)
    protected String jigsaw;
    @XmlElement(name = "JigsawContactId", nillable = true)
    protected String jigsawContactId;
    @XmlElement(name = "Languages__c", nillable = true)
    protected String languages__C;
    @XmlElement(name = "LastActivityDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastActivityDate;
    @XmlElement(name = "LastCURequestDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCURequestDate;
    @XmlElement(name = "LastCUUpdateDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCUUpdateDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LastName", nillable = true)
    protected String lastName;
    @XmlElement(name = "LastReferencedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReferencedDate;
    @XmlElement(name = "LastViewedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastViewedDate;
    @XmlElement(name = "LeadSource", nillable = true)
    protected String leadSource;
    @XmlElement(name = "Level__c", nillable = true)
    protected String level__C;
    @XmlElement(name = "LookedUpFromActivities", nillable = true)
    protected QueryResultType lookedUpFromActivities;
    @XmlElement(name = "MailingAddress", nillable = true)
    protected AddressType mailingAddress;
    @XmlElement(name = "MailingCity", nillable = true)
    protected String mailingCity;
    @XmlElement(name = "MailingCountry", nillable = true)
    protected String mailingCountry;
    @XmlElement(name = "MailingLatitude", nillable = true)
    protected Double mailingLatitude;
    @XmlElement(name = "MailingLongitude", nillable = true)
    protected Double mailingLongitude;
    @XmlElement(name = "MailingPostalCode", nillable = true)
    protected String mailingPostalCode;
    @XmlElement(name = "MailingState", nillable = true)
    protected String mailingState;
    @XmlElement(name = "MailingStreet", nillable = true)
    protected String mailingStreet;
    @XmlElement(name = "MasterRecord", nillable = true)
    protected Contact masterRecord;
    @XmlElement(name = "MasterRecordId", nillable = true)
    protected String masterRecordId;
    @XmlElement(name = "MobilePhone", nillable = true)
    protected String mobilePhone;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResultType notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResultType notesAndAttachments;
    @XmlElement(name = "OpenActivities", nillable = true)
    protected QueryResultType openActivities;
    @XmlElement(name = "Opportunities", nillable = true)
    protected QueryResultType opportunities;
    @XmlElement(name = "OpportunityContactRoles", nillable = true)
    protected QueryResultType opportunityContactRoles;
    @XmlElement(name = "OtherAddress", nillable = true)
    protected AddressType otherAddress;
    @XmlElement(name = "OtherCity", nillable = true)
    protected String otherCity;
    @XmlElement(name = "OtherCountry", nillable = true)
    protected String otherCountry;
    @XmlElement(name = "OtherLatitude", nillable = true)
    protected Double otherLatitude;
    @XmlElement(name = "OtherLongitude", nillable = true)
    protected Double otherLongitude;
    @XmlElement(name = "OtherPhone", nillable = true)
    protected String otherPhone;
    @XmlElement(name = "OtherPostalCode", nillable = true)
    protected String otherPostalCode;
    @XmlElement(name = "OtherState", nillable = true)
    protected String otherState;
    @XmlElement(name = "OtherStreet", nillable = true)
    protected String otherStreet;
    @XmlElement(name = "Owner", nillable = true)
    protected User owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "PhotoUrl", nillable = true)
    protected String photoUrl;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResultType processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResultType processSteps;
    @XmlElement(name = "ReportsTo", nillable = true)
    protected Contact reportsTo;
    @XmlElement(name = "ReportsToId", nillable = true)
    protected String reportsToId;
    @XmlElement(name = "Salutation", nillable = true)
    protected String salutation;
    @XmlElement(name = "Shares", nillable = true)
    protected QueryResultType shares;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Tasks", nillable = true)
    protected QueryResultType tasks;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UndecidedEventRelations", nillable = true)
    protected QueryResultType undecidedEventRelations;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__AccountName__c", nillable = true)
    protected String cve__AccountName__C;
    @XmlElement(name = "cve__Age__c", nillable = true)
    protected Double cve__Age__C;
    @XmlElement(name = "cve__Allocations__r", nillable = true)
    protected QueryResultType cve__Allocations__R;
    @XmlElement(name = "cve__BankAccountNumber__c", nillable = true)
    protected String cve__BankAccountNumber__C;
    @XmlElement(name = "cve__BankAccountType__c", nillable = true)
    protected String cve__BankAccountType__C;
    @XmlElement(name = "cve__BankName__c", nillable = true)
    protected String cve__BankName__C;
    @XmlElement(name = "cve__BankPhone__c", nillable = true)
    protected String cve__BankPhone__C;
    @XmlElement(name = "cve__BankRoutingNumber__c", nillable = true)
    protected String cve__BankRoutingNumber__C;
    @XmlElement(name = "cve__BonusPeriod__c", nillable = true)
    protected String cve__BonusPeriod__C;
    @XmlElement(name = "cve__Bonus__c", nillable = true)
    protected Double cve__Bonus__C;
    @XmlElement(name = "cve__Children__r", nillable = true)
    protected QueryResultType cve__Children__R;
    @XmlElement(name = "cve__ClaimRelationshipsForConactLabel__r", nillable = true)
    protected QueryResultType cve__ClaimRelationshipsForConactLabel__R;
    @XmlElement(name = "cve__ClaimRelationships__r", nillable = true)
    protected QueryResultType cve__ClaimRelationships__R;
    @XmlElement(name = "cve__ClaimantInsuredBenefitsClaimed__r", nillable = true)
    protected QueryResultType cve__ClaimantInsuredBenefitsClaimed__R;
    @XmlElement(name = "cve__Claims__r", nillable = true)
    protected QueryResultType cve__Claims__R;
    @XmlElement(name = "cve__ClassRelationships__r", nillable = true)
    protected QueryResultType cve__ClassRelationships__R;
    @XmlElement(name = "cve__CollegeMajor__c", nillable = true)
    protected String cve__CollegeMajor__C;
    @XmlElement(name = "cve__ContactHistories__r", nillable = true)
    protected QueryResultType cve__ContactHistories__R;
    @XmlElement(name = "cve__DateOfEarningsIncrease__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfEarningsIncrease__C;
    @XmlElement(name = "cve__DateOfFullTimeHire__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfFullTimeHire__C;
    @XmlElement(name = "cve__DateOfHire__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfHire__C;
    @XmlElement(name = "cve__DateOfRetirement__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__DateOfRetirement__C;
    @XmlElement(name = "cve__Degree__c", nillable = true)
    protected String cve__Degree__C;
    @XmlElement(name = "cve__EarningsPeriod__c", nillable = true)
    protected String cve__EarningsPeriod__C;
    @XmlElement(name = "cve__Earnings__c", nillable = true)
    protected Double cve__Earnings__C;
    @XmlElement(name = "cve__Employed__c", nillable = true)
    protected Boolean cve__Employed__C;
    @XmlElement(name = "cve__EmployeeIdentificationNumber__c", nillable = true)
    protected String cve__EmployeeIdentificationNumber__C;
    @XmlElement(name = "cve__Employee__c", nillable = true)
    protected Boolean cve__Employee__C;
    @XmlElement(name = "cve__GedDiploma__c", nillable = true)
    protected Boolean cve__GedDiploma__C;
    @XmlElement(name = "cve__Gender__c", nillable = true)
    protected String cve__Gender__C;
    @XmlElement(name = "cve__GraduateSchoolMajor__c", nillable = true)
    protected String cve__GraduateSchoolMajor__C;
    @XmlElement(name = "cve__HighSchoolDiploma__c", nillable = true)
    protected Boolean cve__HighSchoolDiploma__C;
    @XmlElement(name = "cve__HighestGradeCompleted__c", nillable = true)
    protected String cve__HighestGradeCompleted__C;
    @XmlElement(name = "cve__HoursWorkedPerWeek__c", nillable = true)
    protected Double cve__HoursWorkedPerWeek__C;
    @XmlElement(name = "cve__MaidenName__c", nillable = true)
    protected String cve__MaidenName__C;
    @XmlElement(name = "cve__MailingAddress__c", nillable = true)
    protected String cve__MailingAddress__C;
    @XmlElement(name = "cve__MaritalStatus__c", nillable = true)
    protected String cve__MaritalStatus__C;
    @XmlElement(name = "cve__OccupationalDescription__c", nillable = true)
    protected String cve__OccupationalDescription__C;
    @XmlElement(name = "cve__Parent__c", nillable = true)
    protected String cve__Parent__C;
    @XmlElement(name = "cve__Parent__r", nillable = true)
    protected Contact cve__Parent__R;
    @XmlElement(name = "cve__PaymentMethod__c", nillable = true)
    protected String cve__PaymentMethod__C;
    @XmlElement(name = "cve__Payments__r", nillable = true)
    protected QueryResultType cve__Payments__R;
    @XmlElement(name = "cve__PolicyRelationshipsForConactLabel__r", nillable = true)
    protected QueryResultType cve__PolicyRelationshipsForConactLabel__R;
    @XmlElement(name = "cve__PolicyRelationships__r", nillable = true)
    protected QueryResultType cve__PolicyRelationships__R;
    @XmlElement(name = "cve__SocialSecurityNumber__c", nillable = true)
    protected String cve__SocialSecurityNumber__C;
    @XmlElement(name = "cve__Speciality__c", nillable = true)
    protected String cve__Speciality__C;
    @XmlElement(name = "cve__Spouse__c", nillable = true)
    protected String cve__Spouse__C;
    @XmlElement(name = "cve__Spouse__r", nillable = true)
    protected QueryResultType cve__Spouse__R;
    @XmlElement(name = "cve__TaxIdNumber__c", nillable = true)
    protected String cve__TaxIdNumber__C;
    @XmlElement(name = "cve__TerminationDate__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__TerminationDate__C;
    @XmlElement(name = "cve__TerminationReason__c", nillable = true)
    protected String cve__TerminationReason__C;
    @XmlElement(name = "cve__Testing__c", nillable = true)
    protected String cve__Testing__C;
    @XmlElement(name = "cve__WorkState__c", nillable = true)
    protected String cve__WorkState__C;
    @XmlElement(name = "cve__YearGraduatedFromCollege__c", nillable = true)
    protected String cve__YearGraduatedFromCollege__C;
    @XmlElement(name = "cve__YearGraduatedFromGraduateSchool__c", nillable = true)
    protected String cve__YearGraduatedFromGraduateSchool__C;
    @XmlElement(name = "cve__YearGraduatedFromHighSchool__c", nillable = true)
    protected String cve__YearGraduatedFromHighSchool__C;

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
     * Gets the value of the accountContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getAccountContactRoles() {
        return accountContactRoles;
    }

    /**
     * Sets the value of the accountContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setAccountContactRoles(QueryResultType value) {
        this.accountContactRoles = value;
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
     * Gets the value of the activityHistories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getActivityHistories() {
        return activityHistories;
    }

    /**
     * Sets the value of the activityHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setActivityHistories(QueryResultType value) {
        this.activityHistories = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setAssets(QueryResultType value) {
        this.assets = value;
    }

    /**
     * Gets the value of the assistantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistantName() {
        return assistantName;
    }

    /**
     * Sets the value of the assistantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistantName(String value) {
        this.assistantName = value;
    }

    /**
     * Gets the value of the assistantPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistantPhone() {
        return assistantPhone;
    }

    /**
     * Sets the value of the assistantPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistantPhone(String value) {
        this.assistantPhone = value;
    }

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
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the campaignMembers property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCampaignMembers() {
        return campaignMembers;
    }

    /**
     * Sets the value of the campaignMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCampaignMembers(QueryResultType value) {
        this.campaignMembers = value;
    }

    /**
     * Gets the value of the caseContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCaseContactRoles() {
        return caseContactRoles;
    }

    /**
     * Sets the value of the caseContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCaseContactRoles(QueryResultType value) {
        this.caseContactRoles = value;
    }

    /**
     * Gets the value of the cases property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCases() {
        return cases;
    }

    /**
     * Sets the value of the cases property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCases(QueryResultType value) {
        this.cases = value;
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
     * Gets the value of the contractContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getContractContactRoles() {
        return contractContactRoles;
    }

    /**
     * Sets the value of the contractContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setContractContactRoles(QueryResultType value) {
        this.contractContactRoles = value;
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
     * Gets the value of the emailBouncedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmailBouncedDate() {
        return emailBouncedDate;
    }

    /**
     * Sets the value of the emailBouncedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmailBouncedDate(XMLGregorianCalendar value) {
        this.emailBouncedDate = value;
    }

    /**
     * Gets the value of the emailBouncedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailBouncedReason() {
        return emailBouncedReason;
    }

    /**
     * Sets the value of the emailBouncedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailBouncedReason(String value) {
        this.emailBouncedReason = value;
    }

    /**
     * Gets the value of the emailStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getEmailStatuses() {
        return emailStatuses;
    }

    /**
     * Sets the value of the emailStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setEmailStatuses(QueryResultType value) {
        this.emailStatuses = value;
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
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setEvents(QueryResultType value) {
        this.events = value;
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
     * Gets the value of the histories property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getHistories() {
        return histories;
    }

    /**
     * Sets the value of the histories property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setHistories(QueryResultType value) {
        this.histories = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
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
     * Gets the value of the isEmailBounced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmailBounced() {
        return isEmailBounced;
    }

    /**
     * Sets the value of the isEmailBounced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmailBounced(Boolean value) {
        this.isEmailBounced = value;
    }

    /**
     * Gets the value of the jigsaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJigsaw() {
        return jigsaw;
    }

    /**
     * Sets the value of the jigsaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJigsaw(String value) {
        this.jigsaw = value;
    }

    /**
     * Gets the value of the jigsawContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJigsawContactId() {
        return jigsawContactId;
    }

    /**
     * Sets the value of the jigsawContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJigsawContactId(String value) {
        this.jigsawContactId = value;
    }

    /**
     * Gets the value of the languages__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguages__C() {
        return languages__C;
    }

    /**
     * Sets the value of the languages__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguages__C(String value) {
        this.languages__C = value;
    }

    /**
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActivityDate(XMLGregorianCalendar value) {
        this.lastActivityDate = value;
    }

    /**
     * Gets the value of the lastCURequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCURequestDate() {
        return lastCURequestDate;
    }

    /**
     * Sets the value of the lastCURequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCURequestDate(XMLGregorianCalendar value) {
        this.lastCURequestDate = value;
    }

    /**
     * Gets the value of the lastCUUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCUUpdateDate() {
        return lastCUUpdateDate;
    }

    /**
     * Sets the value of the lastCUUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCUUpdateDate(XMLGregorianCalendar value) {
        this.lastCUUpdateDate = value;
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
     * Gets the value of the leadSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the value of the leadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadSource(String value) {
        this.leadSource = value;
    }

    /**
     * Gets the value of the level__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel__C() {
        return level__C;
    }

    /**
     * Sets the value of the level__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel__C(String value) {
        this.level__C = value;
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
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setMailingAddress(AddressType value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the mailingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingCity() {
        return mailingCity;
    }

    /**
     * Sets the value of the mailingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingCity(String value) {
        this.mailingCity = value;
    }

    /**
     * Gets the value of the mailingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingCountry() {
        return mailingCountry;
    }

    /**
     * Sets the value of the mailingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingCountry(String value) {
        this.mailingCountry = value;
    }

    /**
     * Gets the value of the mailingLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMailingLatitude() {
        return mailingLatitude;
    }

    /**
     * Sets the value of the mailingLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMailingLatitude(Double value) {
        this.mailingLatitude = value;
    }

    /**
     * Gets the value of the mailingLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMailingLongitude() {
        return mailingLongitude;
    }

    /**
     * Sets the value of the mailingLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMailingLongitude(Double value) {
        this.mailingLongitude = value;
    }

    /**
     * Gets the value of the mailingPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    /**
     * Sets the value of the mailingPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingPostalCode(String value) {
        this.mailingPostalCode = value;
    }

    /**
     * Gets the value of the mailingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingState() {
        return mailingState;
    }

    /**
     * Sets the value of the mailingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingState(String value) {
        this.mailingState = value;
    }

    /**
     * Gets the value of the mailingStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingStreet() {
        return mailingStreet;
    }

    /**
     * Sets the value of the mailingStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingStreet(String value) {
        this.mailingStreet = value;
    }

    /**
     * Gets the value of the masterRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getMasterRecord() {
        return masterRecord;
    }

    /**
     * Sets the value of the masterRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setMasterRecord(Contact value) {
        this.masterRecord = value;
    }

    /**
     * Gets the value of the masterRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterRecordId() {
        return masterRecordId;
    }

    /**
     * Sets the value of the masterRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterRecordId(String value) {
        this.masterRecordId = value;
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
     * Gets the value of the openActivities property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getOpenActivities() {
        return openActivities;
    }

    /**
     * Sets the value of the openActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setOpenActivities(QueryResultType value) {
        this.openActivities = value;
    }

    /**
     * Gets the value of the opportunities property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getOpportunities() {
        return opportunities;
    }

    /**
     * Sets the value of the opportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setOpportunities(QueryResultType value) {
        this.opportunities = value;
    }

    /**
     * Gets the value of the opportunityContactRoles property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getOpportunityContactRoles() {
        return opportunityContactRoles;
    }

    /**
     * Sets the value of the opportunityContactRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setOpportunityContactRoles(QueryResultType value) {
        this.opportunityContactRoles = value;
    }

    /**
     * Gets the value of the otherAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getOtherAddress() {
        return otherAddress;
    }

    /**
     * Sets the value of the otherAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setOtherAddress(AddressType value) {
        this.otherAddress = value;
    }

    /**
     * Gets the value of the otherCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCity() {
        return otherCity;
    }

    /**
     * Sets the value of the otherCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCity(String value) {
        this.otherCity = value;
    }

    /**
     * Gets the value of the otherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCountry() {
        return otherCountry;
    }

    /**
     * Sets the value of the otherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCountry(String value) {
        this.otherCountry = value;
    }

    /**
     * Gets the value of the otherLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherLatitude() {
        return otherLatitude;
    }

    /**
     * Sets the value of the otherLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherLatitude(Double value) {
        this.otherLatitude = value;
    }

    /**
     * Gets the value of the otherLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtherLongitude() {
        return otherLongitude;
    }

    /**
     * Sets the value of the otherLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtherLongitude(Double value) {
        this.otherLongitude = value;
    }

    /**
     * Gets the value of the otherPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPhone() {
        return otherPhone;
    }

    /**
     * Sets the value of the otherPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPhone(String value) {
        this.otherPhone = value;
    }

    /**
     * Gets the value of the otherPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    /**
     * Sets the value of the otherPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPostalCode(String value) {
        this.otherPostalCode = value;
    }

    /**
     * Gets the value of the otherState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherState() {
        return otherState;
    }

    /**
     * Sets the value of the otherState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherState(String value) {
        this.otherState = value;
    }

    /**
     * Gets the value of the otherStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStreet() {
        return otherStreet;
    }

    /**
     * Sets the value of the otherStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStreet(String value) {
        this.otherStreet = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setOwner(User value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
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
     * Gets the value of the photoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * Sets the value of the photoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoUrl(String value) {
        this.photoUrl = value;
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
     * Gets the value of the reportsTo property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getReportsTo() {
        return reportsTo;
    }

    /**
     * Sets the value of the reportsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setReportsTo(Contact value) {
        this.reportsTo = value;
    }

    /**
     * Gets the value of the reportsToId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportsToId() {
        return reportsToId;
    }

    /**
     * Sets the value of the reportsToId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportsToId(String value) {
        this.reportsToId = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
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
     * Gets the value of the tasks property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getTasks() {
        return tasks;
    }

    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setTasks(QueryResultType value) {
        this.tasks = value;
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
     * Gets the value of the cve__AccountName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AccountName__C() {
        return cve__AccountName__C;
    }

    /**
     * Sets the value of the cve__AccountName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AccountName__C(String value) {
        this.cve__AccountName__C = value;
    }

    /**
     * Gets the value of the cve__Age__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Age__C() {
        return cve__Age__C;
    }

    /**
     * Sets the value of the cve__Age__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Age__C(Double value) {
        this.cve__Age__C = value;
    }

    /**
     * Gets the value of the cve__Allocations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Allocations__R() {
        return cve__Allocations__R;
    }

    /**
     * Sets the value of the cve__Allocations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Allocations__R(QueryResultType value) {
        this.cve__Allocations__R = value;
    }

    /**
     * Gets the value of the cve__BankAccountNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankAccountNumber__C() {
        return cve__BankAccountNumber__C;
    }

    /**
     * Sets the value of the cve__BankAccountNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankAccountNumber__C(String value) {
        this.cve__BankAccountNumber__C = value;
    }

    /**
     * Gets the value of the cve__BankAccountType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankAccountType__C() {
        return cve__BankAccountType__C;
    }

    /**
     * Sets the value of the cve__BankAccountType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankAccountType__C(String value) {
        this.cve__BankAccountType__C = value;
    }

    /**
     * Gets the value of the cve__BankName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankName__C() {
        return cve__BankName__C;
    }

    /**
     * Sets the value of the cve__BankName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankName__C(String value) {
        this.cve__BankName__C = value;
    }

    /**
     * Gets the value of the cve__BankPhone__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankPhone__C() {
        return cve__BankPhone__C;
    }

    /**
     * Sets the value of the cve__BankPhone__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankPhone__C(String value) {
        this.cve__BankPhone__C = value;
    }

    /**
     * Gets the value of the cve__BankRoutingNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BankRoutingNumber__C() {
        return cve__BankRoutingNumber__C;
    }

    /**
     * Sets the value of the cve__BankRoutingNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BankRoutingNumber__C(String value) {
        this.cve__BankRoutingNumber__C = value;
    }

    /**
     * Gets the value of the cve__BonusPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BonusPeriod__C() {
        return cve__BonusPeriod__C;
    }

    /**
     * Sets the value of the cve__BonusPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BonusPeriod__C(String value) {
        this.cve__BonusPeriod__C = value;
    }

    /**
     * Gets the value of the cve__Bonus__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Bonus__C() {
        return cve__Bonus__C;
    }

    /**
     * Sets the value of the cve__Bonus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Bonus__C(Double value) {
        this.cve__Bonus__C = value;
    }

    /**
     * Gets the value of the cve__Children__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Children__R() {
        return cve__Children__R;
    }

    /**
     * Sets the value of the cve__Children__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Children__R(QueryResultType value) {
        this.cve__Children__R = value;
    }

    /**
     * Gets the value of the cve__ClaimRelationshipsForConactLabel__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__ClaimRelationshipsForConactLabel__R() {
        return cve__ClaimRelationshipsForConactLabel__R;
    }

    /**
     * Sets the value of the cve__ClaimRelationshipsForConactLabel__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__ClaimRelationshipsForConactLabel__R(QueryResultType value) {
        this.cve__ClaimRelationshipsForConactLabel__R = value;
    }

    /**
     * Gets the value of the cve__ClaimRelationships__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__ClaimRelationships__R() {
        return cve__ClaimRelationships__R;
    }

    /**
     * Sets the value of the cve__ClaimRelationships__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__ClaimRelationships__R(QueryResultType value) {
        this.cve__ClaimRelationships__R = value;
    }

    /**
     * Gets the value of the cve__ClaimantInsuredBenefitsClaimed__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__ClaimantInsuredBenefitsClaimed__R() {
        return cve__ClaimantInsuredBenefitsClaimed__R;
    }

    /**
     * Sets the value of the cve__ClaimantInsuredBenefitsClaimed__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__ClaimantInsuredBenefitsClaimed__R(QueryResultType value) {
        this.cve__ClaimantInsuredBenefitsClaimed__R = value;
    }

    /**
     * Gets the value of the cve__Claims__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Claims__R() {
        return cve__Claims__R;
    }

    /**
     * Sets the value of the cve__Claims__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Claims__R(QueryResultType value) {
        this.cve__Claims__R = value;
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
     * Gets the value of the cve__CollegeMajor__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CollegeMajor__C() {
        return cve__CollegeMajor__C;
    }

    /**
     * Sets the value of the cve__CollegeMajor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CollegeMajor__C(String value) {
        this.cve__CollegeMajor__C = value;
    }

    /**
     * Gets the value of the cve__ContactHistories__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__ContactHistories__R() {
        return cve__ContactHistories__R;
    }

    /**
     * Sets the value of the cve__ContactHistories__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__ContactHistories__R(QueryResultType value) {
        this.cve__ContactHistories__R = value;
    }

    /**
     * Gets the value of the cve__DateOfEarningsIncrease__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfEarningsIncrease__C() {
        return cve__DateOfEarningsIncrease__C;
    }

    /**
     * Sets the value of the cve__DateOfEarningsIncrease__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfEarningsIncrease__C(XMLGregorianCalendar value) {
        this.cve__DateOfEarningsIncrease__C = value;
    }

    /**
     * Gets the value of the cve__DateOfFullTimeHire__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfFullTimeHire__C() {
        return cve__DateOfFullTimeHire__C;
    }

    /**
     * Sets the value of the cve__DateOfFullTimeHire__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfFullTimeHire__C(XMLGregorianCalendar value) {
        this.cve__DateOfFullTimeHire__C = value;
    }

    /**
     * Gets the value of the cve__DateOfHire__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfHire__C() {
        return cve__DateOfHire__C;
    }

    /**
     * Sets the value of the cve__DateOfHire__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfHire__C(XMLGregorianCalendar value) {
        this.cve__DateOfHire__C = value;
    }

    /**
     * Gets the value of the cve__DateOfRetirement__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__DateOfRetirement__C() {
        return cve__DateOfRetirement__C;
    }

    /**
     * Sets the value of the cve__DateOfRetirement__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__DateOfRetirement__C(XMLGregorianCalendar value) {
        this.cve__DateOfRetirement__C = value;
    }

    /**
     * Gets the value of the cve__Degree__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Degree__C() {
        return cve__Degree__C;
    }

    /**
     * Sets the value of the cve__Degree__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Degree__C(String value) {
        this.cve__Degree__C = value;
    }

    /**
     * Gets the value of the cve__EarningsPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EarningsPeriod__C() {
        return cve__EarningsPeriod__C;
    }

    /**
     * Sets the value of the cve__EarningsPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EarningsPeriod__C(String value) {
        this.cve__EarningsPeriod__C = value;
    }

    /**
     * Gets the value of the cve__Earnings__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Earnings__C() {
        return cve__Earnings__C;
    }

    /**
     * Sets the value of the cve__Earnings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Earnings__C(Double value) {
        this.cve__Earnings__C = value;
    }

    /**
     * Gets the value of the cve__Employed__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Employed__C() {
        return cve__Employed__C;
    }

    /**
     * Sets the value of the cve__Employed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Employed__C(Boolean value) {
        this.cve__Employed__C = value;
    }

    /**
     * Gets the value of the cve__EmployeeIdentificationNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EmployeeIdentificationNumber__C() {
        return cve__EmployeeIdentificationNumber__C;
    }

    /**
     * Sets the value of the cve__EmployeeIdentificationNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EmployeeIdentificationNumber__C(String value) {
        this.cve__EmployeeIdentificationNumber__C = value;
    }

    /**
     * Gets the value of the cve__Employee__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Employee__C() {
        return cve__Employee__C;
    }

    /**
     * Sets the value of the cve__Employee__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Employee__C(Boolean value) {
        this.cve__Employee__C = value;
    }

    /**
     * Gets the value of the cve__GedDiploma__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__GedDiploma__C() {
        return cve__GedDiploma__C;
    }

    /**
     * Sets the value of the cve__GedDiploma__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__GedDiploma__C(Boolean value) {
        this.cve__GedDiploma__C = value;
    }

    /**
     * Gets the value of the cve__Gender__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Gender__C() {
        return cve__Gender__C;
    }

    /**
     * Sets the value of the cve__Gender__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Gender__C(String value) {
        this.cve__Gender__C = value;
    }

    /**
     * Gets the value of the cve__GraduateSchoolMajor__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__GraduateSchoolMajor__C() {
        return cve__GraduateSchoolMajor__C;
    }

    /**
     * Sets the value of the cve__GraduateSchoolMajor__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__GraduateSchoolMajor__C(String value) {
        this.cve__GraduateSchoolMajor__C = value;
    }

    /**
     * Gets the value of the cve__HighSchoolDiploma__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HighSchoolDiploma__C() {
        return cve__HighSchoolDiploma__C;
    }

    /**
     * Sets the value of the cve__HighSchoolDiploma__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HighSchoolDiploma__C(Boolean value) {
        this.cve__HighSchoolDiploma__C = value;
    }

    /**
     * Gets the value of the cve__HighestGradeCompleted__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__HighestGradeCompleted__C() {
        return cve__HighestGradeCompleted__C;
    }

    /**
     * Sets the value of the cve__HighestGradeCompleted__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__HighestGradeCompleted__C(String value) {
        this.cve__HighestGradeCompleted__C = value;
    }

    /**
     * Gets the value of the cve__HoursWorkedPerWeek__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HoursWorkedPerWeek__C() {
        return cve__HoursWorkedPerWeek__C;
    }

    /**
     * Sets the value of the cve__HoursWorkedPerWeek__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HoursWorkedPerWeek__C(Double value) {
        this.cve__HoursWorkedPerWeek__C = value;
    }

    /**
     * Gets the value of the cve__MaidenName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MaidenName__C() {
        return cve__MaidenName__C;
    }

    /**
     * Sets the value of the cve__MaidenName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MaidenName__C(String value) {
        this.cve__MaidenName__C = value;
    }

    /**
     * Gets the value of the cve__MailingAddress__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MailingAddress__C() {
        return cve__MailingAddress__C;
    }

    /**
     * Sets the value of the cve__MailingAddress__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MailingAddress__C(String value) {
        this.cve__MailingAddress__C = value;
    }

    /**
     * Gets the value of the cve__MaritalStatus__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MaritalStatus__C() {
        return cve__MaritalStatus__C;
    }

    /**
     * Sets the value of the cve__MaritalStatus__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MaritalStatus__C(String value) {
        this.cve__MaritalStatus__C = value;
    }

    /**
     * Gets the value of the cve__OccupationalDescription__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__OccupationalDescription__C() {
        return cve__OccupationalDescription__C;
    }

    /**
     * Sets the value of the cve__OccupationalDescription__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__OccupationalDescription__C(String value) {
        this.cve__OccupationalDescription__C = value;
    }

    /**
     * Gets the value of the cve__Parent__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Parent__C() {
        return cve__Parent__C;
    }

    /**
     * Sets the value of the cve__Parent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Parent__C(String value) {
        this.cve__Parent__C = value;
    }

    /**
     * Gets the value of the cve__Parent__R property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getCve__Parent__R() {
        return cve__Parent__R;
    }

    /**
     * Sets the value of the cve__Parent__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setCve__Parent__R(Contact value) {
        this.cve__Parent__R = value;
    }

    /**
     * Gets the value of the cve__PaymentMethod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PaymentMethod__C() {
        return cve__PaymentMethod__C;
    }

    /**
     * Sets the value of the cve__PaymentMethod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PaymentMethod__C(String value) {
        this.cve__PaymentMethod__C = value;
    }

    /**
     * Gets the value of the cve__Payments__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Payments__R() {
        return cve__Payments__R;
    }

    /**
     * Sets the value of the cve__Payments__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Payments__R(QueryResultType value) {
        this.cve__Payments__R = value;
    }

    /**
     * Gets the value of the cve__PolicyRelationshipsForConactLabel__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PolicyRelationshipsForConactLabel__R() {
        return cve__PolicyRelationshipsForConactLabel__R;
    }

    /**
     * Sets the value of the cve__PolicyRelationshipsForConactLabel__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PolicyRelationshipsForConactLabel__R(QueryResultType value) {
        this.cve__PolicyRelationshipsForConactLabel__R = value;
    }

    /**
     * Gets the value of the cve__PolicyRelationships__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PolicyRelationships__R() {
        return cve__PolicyRelationships__R;
    }

    /**
     * Sets the value of the cve__PolicyRelationships__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PolicyRelationships__R(QueryResultType value) {
        this.cve__PolicyRelationships__R = value;
    }

    /**
     * Gets the value of the cve__SocialSecurityNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SocialSecurityNumber__C() {
        return cve__SocialSecurityNumber__C;
    }

    /**
     * Sets the value of the cve__SocialSecurityNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SocialSecurityNumber__C(String value) {
        this.cve__SocialSecurityNumber__C = value;
    }

    /**
     * Gets the value of the cve__Speciality__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Speciality__C() {
        return cve__Speciality__C;
    }

    /**
     * Sets the value of the cve__Speciality__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Speciality__C(String value) {
        this.cve__Speciality__C = value;
    }

    /**
     * Gets the value of the cve__Spouse__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Spouse__C() {
        return cve__Spouse__C;
    }

    /**
     * Sets the value of the cve__Spouse__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Spouse__C(String value) {
        this.cve__Spouse__C = value;
    }

    /**
     * Gets the value of the cve__Spouse__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Spouse__R() {
        return cve__Spouse__R;
    }

    /**
     * Sets the value of the cve__Spouse__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Spouse__R(QueryResultType value) {
        this.cve__Spouse__R = value;
    }

    /**
     * Gets the value of the cve__TaxIdNumber__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TaxIdNumber__C() {
        return cve__TaxIdNumber__C;
    }

    /**
     * Sets the value of the cve__TaxIdNumber__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TaxIdNumber__C(String value) {
        this.cve__TaxIdNumber__C = value;
    }

    /**
     * Gets the value of the cve__TerminationDate__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__TerminationDate__C() {
        return cve__TerminationDate__C;
    }

    /**
     * Sets the value of the cve__TerminationDate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__TerminationDate__C(XMLGregorianCalendar value) {
        this.cve__TerminationDate__C = value;
    }

    /**
     * Gets the value of the cve__TerminationReason__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__TerminationReason__C() {
        return cve__TerminationReason__C;
    }

    /**
     * Sets the value of the cve__TerminationReason__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__TerminationReason__C(String value) {
        this.cve__TerminationReason__C = value;
    }

    /**
     * Gets the value of the cve__Testing__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Testing__C() {
        return cve__Testing__C;
    }

    /**
     * Sets the value of the cve__Testing__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Testing__C(String value) {
        this.cve__Testing__C = value;
    }

    /**
     * Gets the value of the cve__WorkState__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WorkState__C() {
        return cve__WorkState__C;
    }

    /**
     * Sets the value of the cve__WorkState__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WorkState__C(String value) {
        this.cve__WorkState__C = value;
    }

    /**
     * Gets the value of the cve__YearGraduatedFromCollege__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__YearGraduatedFromCollege__C() {
        return cve__YearGraduatedFromCollege__C;
    }

    /**
     * Sets the value of the cve__YearGraduatedFromCollege__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__YearGraduatedFromCollege__C(String value) {
        this.cve__YearGraduatedFromCollege__C = value;
    }

    /**
     * Gets the value of the cve__YearGraduatedFromGraduateSchool__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__YearGraduatedFromGraduateSchool__C() {
        return cve__YearGraduatedFromGraduateSchool__C;
    }

    /**
     * Sets the value of the cve__YearGraduatedFromGraduateSchool__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__YearGraduatedFromGraduateSchool__C(String value) {
        this.cve__YearGraduatedFromGraduateSchool__C = value;
    }

    /**
     * Gets the value of the cve__YearGraduatedFromHighSchool__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__YearGraduatedFromHighSchool__C() {
        return cve__YearGraduatedFromHighSchool__C;
    }

    /**
     * Sets the value of the cve__YearGraduatedFromHighSchool__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__YearGraduatedFromHighSchool__C(String value) {
        this.cve__YearGraduatedFromHighSchool__C = value;
    }

}
