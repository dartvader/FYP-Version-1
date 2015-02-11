
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cve__Benefit__c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cve__Benefit__c">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Attachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LookedUpFromActivities" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="NotesAndAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessInstances" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ProcessSteps" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TopicAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="cve__AcceleratedPaymentAllowed__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AcceleratedPaymentType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AccidentDurationOfBenefits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AccidentEliminationDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AccidentEliminationPeriodUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AccidentEliminationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AccidentEliminationUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ActiveMemberOfArmedForcesExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AdaptiveHomeVehicleAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdaptiveHomeVehicleAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdaptiveHomeVehiclePercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AdaptiveHomeVehicle__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AirBagAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AirBagAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AirBagFlatAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AirBagPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__AircraftOperationExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__AllSources__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__AppliesToRelationship__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BaseBenefit__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__BaseBenefit__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Benefit__c" minOccurs="0"/>
 *         &lt;element name="cve__BenefitClaimeds__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BenefitFlatAmountPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitFlatAmountValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__BenefitFlatAmount__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__BenefitOptions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BenefitPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__BenefitQuestionPages__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BenefitReductions__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BenefitVariations__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__BothFeet__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__BothHands__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CareerAdjustmentAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CareerAdjustmentMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CareerAdjustmentPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CareerAdjustment__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ChildAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildCareAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildCareMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildCarePercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildCare__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ChildEducationAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildEducationAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildEducationPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildEducation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ChildMaximumAgeNonStudent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildMaximumAgeStudent2__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ChildMaximumAgeStudent__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ComaAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ComaAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ComaPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Coma__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ContestabilityPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__ContinuityOfCoverage__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CosmeCosmeticElectiveSurgeryExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CosmeticElectiveSurgeryExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CostOfLivingAdjustmentDefined__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CostOfLivingAdjustment__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CoverageAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CoverageAnnualSalaryMultiple__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CoverageBenefitMultiple__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CoverageRoundingMode__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__CoverageRoundingPrecision__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CoverageType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Coverages__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__CriminalActivityExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__CriticalBurnAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CriticalBurnAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CriticalBurnPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__CriticalBurn__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DailyCoverageAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DayCareAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DayCareAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DayCarePercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DayCare__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DefinitionOfDisabilityDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DefinitionOfDisabilityPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DefinitionOfDisabilityUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DefinitionOfDisability__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DefinitionOfEarnings__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DependentConversion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DependentCoverage__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DependentPortable__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DomesticPartner__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DoubleIndemnityCommonCarrierAmtMax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DoubleIndemnityCommonCarrierAmtMin__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DoubleIndemnityCommonCarrierPctMax__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DoubleIndemnityCommonCarrier__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DrugAndAlcoholAbuseLimitationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DrugAndAlcoholAbuseLimitation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DrugAndAlcoholExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__DurationOfBenefitsDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DurationOfBenefitsPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__DurationOfBenefitsUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__DurationOfBenefits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Effective__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__EitherHandOrFootAndSightInOneEye__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EliminationDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EliminationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EliminationUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EmployeeContributionPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmployerContributionPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmploymentClassification__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EmploymentTimeDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmploymentTimePeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__EmploymentTimeUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__EvidenceOfInsurabilityRequired__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ExcludeFromIntake__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Expiration__c" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cve__FeloniousAssaultAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__FeloniousAssaultAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__FeloniousAssaultPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__FeloniousAssault__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__FelonyExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__FicaMatching__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__FirstDayHospitalization__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__GroupClass__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__GroupDivision__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__GuaranteedIssueAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HealthInsurancePaymentPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HealthInsurancePayment__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Hemiplegia__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HighRiskActivityExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HigherEducationAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HigherEducationBenefit__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__HigherEducationMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HigherEducationPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__HoursRequired__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IllegalOccupationExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__IllnessDurationOfBenefits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IllnessEliminationDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IllnessEliminationPeriodUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IllnessEliminationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__IllnessEliminationUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__IllnessExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__LifeBenefitPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LineOfBusiness__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LoanAvailability__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__LoanInterestRate__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdDurationOfBenefitsSchedule__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LtdDurationOfBenefits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__LtdEliminationDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdEliminationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__LtdEliminationUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MaximumAcceleratedAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumAcceleratedPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumAmountAppliedType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MaximumAnnualEarnings__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumBenefitPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MaximumBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumCoverageAge__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumCoverageAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumCoverageAnnualSalaryMultiple__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumCoveragePeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MaximumCoverageType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MaximumCoverageUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MentalNervousLimitationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MentalNervousLimitation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__MinimumAcceleratedAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumAcceleratedPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumAmountAppliedType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MinimumAmountNotAppliedToDependents__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__MinimumBenefitPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumBenefitPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MinimumBenefit__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumCoverageAge__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumCoverageAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumCoverageAnnualSalaryMultiple__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumCoveragePeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__MinimumCoverageType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__MinimumCoverageUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__NoFaultInsurance__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__NormalDentalCareExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__OneFootPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OneHandAndOneFoot__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OneHandPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__OtherExclusions__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__OtherOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__OuiDuiExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Paraplegia__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ParticipationValue__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Participation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PensionContributionPaymentPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PensionContributionPayment__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PensionDisabilityOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PensionRetirementOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PolicyBenefits__r" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="cve__PreexistingConditionLimitationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PreexistingConditionLimitation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PreexistingConditionProvision__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PreexistingCondition__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PregnancyChildbirthExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__PregnancyDurationOfBenefits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PregnancyEliminationDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PregnancyEliminationPeriodUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__PregnancyEliminationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__PregnancyEliminationUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Product__c" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="cve__Product__r" type="{urn:sobject.enterprise.soap.sforce.com}cve__Product__c" minOccurs="0"/>
 *         &lt;element name="cve__Quadriplegia__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__RailroadRetirementOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__RecordTypeLabel__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RecordTypeName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RecurrentDisabilityCondition__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RecurrentDisabilityOccupation__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RecurrentDisabilityPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__RecurrentDisabilityUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RehabilitationAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__RehabilitationAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__RehabilitationPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Rehabilitation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ReinsuranceAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__ReinsuranceType__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Reinsured__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ReinsurerName__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__RepatriationAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__RepatriationAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__RepatriationPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Repatriation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ReturnToWorkEarningsOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SeatBeltAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SeatBeltAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SeatBeltFlatAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SeatBeltPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SelfInflictedExclusionPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SelfInflictedExclusionUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SelfInflictedExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SicknessExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SightInBothEyes__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SightInOneEyePercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SocialSecurityDisability__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SocialSecurityRetirementOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SpeechAndHearingInBothEars__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SpeechOrHearingInBothEars__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SpouseAmount__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SpouseEducationAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SpouseEducationAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SpouseEducationPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SpouseEducation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__StateDisability__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__StatesOfferedIn__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__Status__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__StrikeContinuationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__StrikeContinuationUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SubjectiveConditionLimitationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SubjectiveConditionLimitation__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SuicideExclusionPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__SuicideExclusionUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__SuicideExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__SurvivorIncomeBenefit__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__TherapeuticCounselingAmountMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TherapeuticCounselingAmountMinimum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TherapeuticCounselingPercentageMaximum__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TherapeuticCounseling__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ThirdPartyLiabilityOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__ThumbAndIndexFingerOfEitherHand__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TravelAssistance__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Triplegia__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__TwoOrMoreLossesPercentage__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__Unemployment__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__Uniplegia__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__VoluntarilyTakingPoisonExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__WaitingDays__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WaitingFirstOfTheMonth__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__WaitingPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WaitingUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WarExclusion__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__WopDependentsContinuationPeriod__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WopDependentsContinuationUnits__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WopDependents__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cve__WopReductionAge__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WopTerminationAge__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WopTotalDisabilityBeginMaximumAge__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WopTotalDisabilityBeginMinimumAge__c" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cve__WorkWeekDays__c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cve__WorkersCompensationOffset__c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cve__Benefit__c", propOrder = {
    "attachments",
    "combinedAttachments",
    "createdBy",
    "createdById",
    "createdDate",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastReferencedDate",
    "lastViewedDate",
    "lookedUpFromActivities",
    "name",
    "notes",
    "notesAndAttachments",
    "processInstances",
    "processSteps",
    "recordType",
    "recordTypeId",
    "systemModstamp",
    "topicAssignments",
    "userRecordAccess",
    "cve__AcceleratedPaymentAllowed__C",
    "cve__AcceleratedPaymentType__C",
    "cve__AccidentDurationOfBenefits__C",
    "cve__AccidentEliminationDays__C",
    "cve__AccidentEliminationPeriodUnits__C",
    "cve__AccidentEliminationPeriod__C",
    "cve__AccidentEliminationUnits__C",
    "cve__ActiveMemberOfArmedForcesExclusion__C",
    "cve__AdaptiveHomeVehicleAmountMaximum__C",
    "cve__AdaptiveHomeVehicleAmountMinimum__C",
    "cve__AdaptiveHomeVehiclePercentageMaximum__C",
    "cve__AdaptiveHomeVehicle__C",
    "cve__AirBagAmountMaximum__C",
    "cve__AirBagAmountMinimum__C",
    "cve__AirBagFlatAmount__C",
    "cve__AirBagPercentage__C",
    "cve__AircraftOperationExclusion__C",
    "cve__AllSources__C",
    "cve__AppliesToRelationship__C",
    "cve__BaseBenefit__C",
    "cve__BaseBenefit__R",
    "cve__BenefitClaimeds__R",
    "cve__BenefitFlatAmountPeriod__C",
    "cve__BenefitFlatAmountValue__C",
    "cve__BenefitFlatAmount__C",
    "cve__BenefitOptions__R",
    "cve__BenefitPercentage__C",
    "cve__BenefitQuestionPages__R",
    "cve__BenefitReductions__R",
    "cve__BenefitVariations__R",
    "cve__BothFeet__C",
    "cve__BothHands__C",
    "cve__CareerAdjustmentAmountMinimum__C",
    "cve__CareerAdjustmentMaximum__C",
    "cve__CareerAdjustmentPercentageMaximum__C",
    "cve__CareerAdjustment__C",
    "cve__ChildAmount__C",
    "cve__ChildCareAmountMinimum__C",
    "cve__ChildCareMaximum__C",
    "cve__ChildCarePercentageMaximum__C",
    "cve__ChildCare__C",
    "cve__ChildEducationAmountMaximum__C",
    "cve__ChildEducationAmountMinimum__C",
    "cve__ChildEducationPercentageMaximum__C",
    "cve__ChildEducation__C",
    "cve__ChildMaximumAgeNonStudent__C",
    "cve__ChildMaximumAgeStudent2__C",
    "cve__ChildMaximumAgeStudent__C",
    "cve__ComaAmountMaximum__C",
    "cve__ComaAmountMinimum__C",
    "cve__ComaPercentageMaximum__C",
    "cve__Coma__C",
    "cve__ContestabilityPeriod__C",
    "cve__ContinuityOfCoverage__C",
    "cve__CosmeCosmeticElectiveSurgeryExclusion__C",
    "cve__CosmeticElectiveSurgeryExclusion__C",
    "cve__CostOfLivingAdjustmentDefined__C",
    "cve__CostOfLivingAdjustment__C",
    "cve__CoverageAmount__C",
    "cve__CoverageAnnualSalaryMultiple__C",
    "cve__CoverageBenefitMultiple__C",
    "cve__CoverageRoundingMode__C",
    "cve__CoverageRoundingPrecision__C",
    "cve__CoverageType__C",
    "cve__Coverages__R",
    "cve__CriminalActivityExclusion__C",
    "cve__CriticalBurnAmountMaximum__C",
    "cve__CriticalBurnAmountMinimum__C",
    "cve__CriticalBurnPercentageMaximum__C",
    "cve__CriticalBurn__C",
    "cve__DailyCoverageAmount__C",
    "cve__DayCareAmountMaximum__C",
    "cve__DayCareAmountMinimum__C",
    "cve__DayCarePercentageMaximum__C",
    "cve__DayCare__C",
    "cve__DefinitionOfDisabilityDays__C",
    "cve__DefinitionOfDisabilityPeriod__C",
    "cve__DefinitionOfDisabilityUnits__C",
    "cve__DefinitionOfDisability__C",
    "cve__DefinitionOfEarnings__C",
    "cve__DependentConversion__C",
    "cve__DependentCoverage__C",
    "cve__DependentPortable__C",
    "cve__DomesticPartner__C",
    "cve__DoubleIndemnityCommonCarrierAmtMax__C",
    "cve__DoubleIndemnityCommonCarrierAmtMin__C",
    "cve__DoubleIndemnityCommonCarrierPctMax__C",
    "cve__DoubleIndemnityCommonCarrier__C",
    "cve__DrugAndAlcoholAbuseLimitationPeriod__C",
    "cve__DrugAndAlcoholAbuseLimitation__C",
    "cve__DrugAndAlcoholExclusion__C",
    "cve__DurationOfBenefitsDays__C",
    "cve__DurationOfBenefitsPeriod__C",
    "cve__DurationOfBenefitsUnits__C",
    "cve__DurationOfBenefits__C",
    "cve__Effective__C",
    "cve__EitherHandOrFootAndSightInOneEye__C",
    "cve__EliminationDays__C",
    "cve__EliminationPeriod__C",
    "cve__EliminationUnits__C",
    "cve__EmployeeContributionPercentage__C",
    "cve__EmployerContributionPercentage__C",
    "cve__EmploymentClassification__C",
    "cve__EmploymentTimeDays__C",
    "cve__EmploymentTimePeriod__C",
    "cve__EmploymentTimeUnits__C",
    "cve__EvidenceOfInsurabilityRequired__C",
    "cve__ExcludeFromIntake__C",
    "cve__Expiration__C",
    "cve__FeloniousAssaultAmountMaximum__C",
    "cve__FeloniousAssaultAmountMinimum__C",
    "cve__FeloniousAssaultPercentageMaximum__C",
    "cve__FeloniousAssault__C",
    "cve__FelonyExclusion__C",
    "cve__FicaMatching__C",
    "cve__FirstDayHospitalization__C",
    "cve__GroupClass__C",
    "cve__GroupDivision__C",
    "cve__GuaranteedIssueAmount__C",
    "cve__HealthInsurancePaymentPercentage__C",
    "cve__HealthInsurancePayment__C",
    "cve__Hemiplegia__C",
    "cve__HighRiskActivityExclusion__C",
    "cve__HigherEducationAmountMinimum__C",
    "cve__HigherEducationBenefit__C",
    "cve__HigherEducationMaximum__C",
    "cve__HigherEducationPercentageMaximum__C",
    "cve__HoursRequired__C",
    "cve__IllegalOccupationExclusion__C",
    "cve__IllnessDurationOfBenefits__C",
    "cve__IllnessEliminationDays__C",
    "cve__IllnessEliminationPeriodUnits__C",
    "cve__IllnessEliminationPeriod__C",
    "cve__IllnessEliminationUnits__C",
    "cve__IllnessExclusion__C",
    "cve__LifeBenefitPercentage__C",
    "cve__LineOfBusiness__C",
    "cve__LoanAvailability__C",
    "cve__LoanInterestRate__C",
    "cve__LtdDurationOfBenefitsSchedule__C",
    "cve__LtdDurationOfBenefits__C",
    "cve__LtdEliminationDays__C",
    "cve__LtdEliminationPeriod__C",
    "cve__LtdEliminationUnits__C",
    "cve__MaximumAcceleratedAmount__C",
    "cve__MaximumAcceleratedPercentage__C",
    "cve__MaximumAmountAppliedType__C",
    "cve__MaximumAnnualEarnings__C",
    "cve__MaximumBenefitPeriod__C",
    "cve__MaximumBenefit__C",
    "cve__MaximumCoverageAge__C",
    "cve__MaximumCoverageAmount__C",
    "cve__MaximumCoverageAnnualSalaryMultiple__C",
    "cve__MaximumCoveragePeriod__C",
    "cve__MaximumCoverageType__C",
    "cve__MaximumCoverageUnits__C",
    "cve__MentalNervousLimitationPeriod__C",
    "cve__MentalNervousLimitation__C",
    "cve__MinimumAcceleratedAmount__C",
    "cve__MinimumAcceleratedPercentage__C",
    "cve__MinimumAmountAppliedType__C",
    "cve__MinimumAmountNotAppliedToDependents__C",
    "cve__MinimumBenefitPercentage__C",
    "cve__MinimumBenefitPeriod__C",
    "cve__MinimumBenefit__C",
    "cve__MinimumCoverageAge__C",
    "cve__MinimumCoverageAmount__C",
    "cve__MinimumCoverageAnnualSalaryMultiple__C",
    "cve__MinimumCoveragePeriod__C",
    "cve__MinimumCoverageType__C",
    "cve__MinimumCoverageUnits__C",
    "cve__NoFaultInsurance__C",
    "cve__NormalDentalCareExclusion__C",
    "cve__OneFootPercentage__C",
    "cve__OneHandAndOneFoot__C",
    "cve__OneHandPercentage__C",
    "cve__OtherExclusions__C",
    "cve__OtherOffset__C",
    "cve__OuiDuiExclusion__C",
    "cve__Paraplegia__C",
    "cve__ParticipationValue__C",
    "cve__Participation__C",
    "cve__PensionContributionPaymentPercentage__C",
    "cve__PensionContributionPayment__C",
    "cve__PensionDisabilityOffset__C",
    "cve__PensionRetirementOffset__C",
    "cve__PolicyBenefits__R",
    "cve__PreexistingConditionLimitationPeriod__C",
    "cve__PreexistingConditionLimitation__C",
    "cve__PreexistingConditionProvision__C",
    "cve__PreexistingCondition__C",
    "cve__PregnancyChildbirthExclusion__C",
    "cve__PregnancyDurationOfBenefits__C",
    "cve__PregnancyEliminationDays__C",
    "cve__PregnancyEliminationPeriodUnits__C",
    "cve__PregnancyEliminationPeriod__C",
    "cve__PregnancyEliminationUnits__C",
    "cve__Product__C",
    "cve__Product__R",
    "cve__Quadriplegia__C",
    "cve__RailroadRetirementOffset__C",
    "cve__RecordTypeLabel__C",
    "cve__RecordTypeName__C",
    "cve__RecurrentDisabilityCondition__C",
    "cve__RecurrentDisabilityOccupation__C",
    "cve__RecurrentDisabilityPeriod__C",
    "cve__RecurrentDisabilityUnits__C",
    "cve__RehabilitationAmountMaximum__C",
    "cve__RehabilitationAmountMinimum__C",
    "cve__RehabilitationPercentageMaximum__C",
    "cve__Rehabilitation__C",
    "cve__ReinsuranceAmount__C",
    "cve__ReinsuranceType__C",
    "cve__Reinsured__C",
    "cve__ReinsurerName__C",
    "cve__RepatriationAmountMaximum__C",
    "cve__RepatriationAmountMinimum__C",
    "cve__RepatriationPercentageMaximum__C",
    "cve__Repatriation__C",
    "cve__ReturnToWorkEarningsOffset__C",
    "cve__SeatBeltAmountMaximum__C",
    "cve__SeatBeltAmountMinimum__C",
    "cve__SeatBeltFlatAmount__C",
    "cve__SeatBeltPercentage__C",
    "cve__SelfInflictedExclusionPeriod__C",
    "cve__SelfInflictedExclusionUnits__C",
    "cve__SelfInflictedExclusion__C",
    "cve__SicknessExclusion__C",
    "cve__SightInBothEyes__C",
    "cve__SightInOneEyePercentage__C",
    "cve__SocialSecurityDisability__C",
    "cve__SocialSecurityRetirementOffset__C",
    "cve__SpeechAndHearingInBothEars__C",
    "cve__SpeechOrHearingInBothEars__C",
    "cve__SpouseAmount__C",
    "cve__SpouseEducationAmountMaximum__C",
    "cve__SpouseEducationAmountMinimum__C",
    "cve__SpouseEducationPercentageMaximum__C",
    "cve__SpouseEducation__C",
    "cve__StateDisability__C",
    "cve__StatesOfferedIn__C",
    "cve__Status__C",
    "cve__StrikeContinuationPeriod__C",
    "cve__StrikeContinuationUnits__C",
    "cve__SubjectiveConditionLimitationPeriod__C",
    "cve__SubjectiveConditionLimitation__C",
    "cve__SuicideExclusionPeriod__C",
    "cve__SuicideExclusionUnits__C",
    "cve__SuicideExclusion__C",
    "cve__SurvivorIncomeBenefit__C",
    "cve__TherapeuticCounselingAmountMaximum__C",
    "cve__TherapeuticCounselingAmountMinimum__C",
    "cve__TherapeuticCounselingPercentageMaximum__C",
    "cve__TherapeuticCounseling__C",
    "cve__ThirdPartyLiabilityOffset__C",
    "cve__ThumbAndIndexFingerOfEitherHand__C",
    "cve__TravelAssistance__C",
    "cve__Triplegia__C",
    "cve__TwoOrMoreLossesPercentage__C",
    "cve__Unemployment__C",
    "cve__Uniplegia__C",
    "cve__VoluntarilyTakingPoisonExclusion__C",
    "cve__WaitingDays__C",
    "cve__WaitingFirstOfTheMonth__C",
    "cve__WaitingPeriod__C",
    "cve__WaitingUnits__C",
    "cve__WarExclusion__C",
    "cve__WopDependentsContinuationPeriod__C",
    "cve__WopDependentsContinuationUnits__C",
    "cve__WopDependents__C",
    "cve__WopReductionAge__C",
    "cve__WopTerminationAge__C",
    "cve__WopTotalDisabilityBeginMaximumAge__C",
    "cve__WopTotalDisabilityBeginMinimumAge__C",
    "cve__WorkWeekDays__C",
    "cve__WorkersCompensationOffset__C"
})
public class Cve__Benefit__C
    extends SObject
{

    @XmlElement(name = "Attachments", nillable = true)
    protected QueryResultType attachments;
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
    @XmlElement(name = "LastReferencedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReferencedDate;
    @XmlElement(name = "LastViewedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastViewedDate;
    @XmlElement(name = "LookedUpFromActivities", nillable = true)
    protected QueryResultType lookedUpFromActivities;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Notes", nillable = true)
    protected QueryResultType notes;
    @XmlElement(name = "NotesAndAttachments", nillable = true)
    protected QueryResultType notesAndAttachments;
    @XmlElement(name = "ProcessInstances", nillable = true)
    protected QueryResultType processInstances;
    @XmlElement(name = "ProcessSteps", nillable = true)
    protected QueryResultType processSteps;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TopicAssignments", nillable = true)
    protected QueryResultType topicAssignments;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "cve__AcceleratedPaymentAllowed__c", nillable = true)
    protected Boolean cve__AcceleratedPaymentAllowed__C;
    @XmlElement(name = "cve__AcceleratedPaymentType__c", nillable = true)
    protected String cve__AcceleratedPaymentType__C;
    @XmlElement(name = "cve__AccidentDurationOfBenefits__c", nillable = true)
    protected String cve__AccidentDurationOfBenefits__C;
    @XmlElement(name = "cve__AccidentEliminationDays__c", nillable = true)
    protected Double cve__AccidentEliminationDays__C;
    @XmlElement(name = "cve__AccidentEliminationPeriodUnits__c", nillable = true)
    protected String cve__AccidentEliminationPeriodUnits__C;
    @XmlElement(name = "cve__AccidentEliminationPeriod__c", nillable = true)
    protected Double cve__AccidentEliminationPeriod__C;
    @XmlElement(name = "cve__AccidentEliminationUnits__c", nillable = true)
    protected String cve__AccidentEliminationUnits__C;
    @XmlElement(name = "cve__ActiveMemberOfArmedForcesExclusion__c", nillable = true)
    protected Boolean cve__ActiveMemberOfArmedForcesExclusion__C;
    @XmlElement(name = "cve__AdaptiveHomeVehicleAmountMaximum__c", nillable = true)
    protected Double cve__AdaptiveHomeVehicleAmountMaximum__C;
    @XmlElement(name = "cve__AdaptiveHomeVehicleAmountMinimum__c", nillable = true)
    protected Double cve__AdaptiveHomeVehicleAmountMinimum__C;
    @XmlElement(name = "cve__AdaptiveHomeVehiclePercentageMaximum__c", nillable = true)
    protected Double cve__AdaptiveHomeVehiclePercentageMaximum__C;
    @XmlElement(name = "cve__AdaptiveHomeVehicle__c", nillable = true)
    protected Boolean cve__AdaptiveHomeVehicle__C;
    @XmlElement(name = "cve__AirBagAmountMaximum__c", nillable = true)
    protected Double cve__AirBagAmountMaximum__C;
    @XmlElement(name = "cve__AirBagAmountMinimum__c", nillable = true)
    protected Double cve__AirBagAmountMinimum__C;
    @XmlElement(name = "cve__AirBagFlatAmount__c", nillable = true)
    protected Double cve__AirBagFlatAmount__C;
    @XmlElement(name = "cve__AirBagPercentage__c", nillable = true)
    protected Double cve__AirBagPercentage__C;
    @XmlElement(name = "cve__AircraftOperationExclusion__c", nillable = true)
    protected Boolean cve__AircraftOperationExclusion__C;
    @XmlElement(name = "cve__AllSources__c", nillable = true)
    protected String cve__AllSources__C;
    @XmlElement(name = "cve__AppliesToRelationship__c", nillable = true)
    protected String cve__AppliesToRelationship__C;
    @XmlElement(name = "cve__BaseBenefit__c", nillable = true)
    protected String cve__BaseBenefit__C;
    @XmlElement(name = "cve__BaseBenefit__r", nillable = true)
    protected Cve__Benefit__C cve__BaseBenefit__R;
    @XmlElement(name = "cve__BenefitClaimeds__r", nillable = true)
    protected QueryResultType cve__BenefitClaimeds__R;
    @XmlElement(name = "cve__BenefitFlatAmountPeriod__c", nillable = true)
    protected String cve__BenefitFlatAmountPeriod__C;
    @XmlElement(name = "cve__BenefitFlatAmountValue__c", nillable = true)
    protected Double cve__BenefitFlatAmountValue__C;
    @XmlElement(name = "cve__BenefitFlatAmount__c", nillable = true)
    protected String cve__BenefitFlatAmount__C;
    @XmlElement(name = "cve__BenefitOptions__r", nillable = true)
    protected QueryResultType cve__BenefitOptions__R;
    @XmlElement(name = "cve__BenefitPercentage__c", nillable = true)
    protected Double cve__BenefitPercentage__C;
    @XmlElement(name = "cve__BenefitQuestionPages__r", nillable = true)
    protected QueryResultType cve__BenefitQuestionPages__R;
    @XmlElement(name = "cve__BenefitReductions__r", nillable = true)
    protected QueryResultType cve__BenefitReductions__R;
    @XmlElement(name = "cve__BenefitVariations__r", nillable = true)
    protected QueryResultType cve__BenefitVariations__R;
    @XmlElement(name = "cve__BothFeet__c", nillable = true)
    protected Double cve__BothFeet__C;
    @XmlElement(name = "cve__BothHands__c", nillable = true)
    protected Double cve__BothHands__C;
    @XmlElement(name = "cve__CareerAdjustmentAmountMinimum__c", nillable = true)
    protected Double cve__CareerAdjustmentAmountMinimum__C;
    @XmlElement(name = "cve__CareerAdjustmentMaximum__c", nillable = true)
    protected Double cve__CareerAdjustmentMaximum__C;
    @XmlElement(name = "cve__CareerAdjustmentPercentageMaximum__c", nillable = true)
    protected Double cve__CareerAdjustmentPercentageMaximum__C;
    @XmlElement(name = "cve__CareerAdjustment__c", nillable = true)
    protected Boolean cve__CareerAdjustment__C;
    @XmlElement(name = "cve__ChildAmount__c", nillable = true)
    protected Double cve__ChildAmount__C;
    @XmlElement(name = "cve__ChildCareAmountMinimum__c", nillable = true)
    protected Double cve__ChildCareAmountMinimum__C;
    @XmlElement(name = "cve__ChildCareMaximum__c", nillable = true)
    protected Double cve__ChildCareMaximum__C;
    @XmlElement(name = "cve__ChildCarePercentageMaximum__c", nillable = true)
    protected Double cve__ChildCarePercentageMaximum__C;
    @XmlElement(name = "cve__ChildCare__c", nillable = true)
    protected Boolean cve__ChildCare__C;
    @XmlElement(name = "cve__ChildEducationAmountMaximum__c", nillable = true)
    protected Double cve__ChildEducationAmountMaximum__C;
    @XmlElement(name = "cve__ChildEducationAmountMinimum__c", nillable = true)
    protected Double cve__ChildEducationAmountMinimum__C;
    @XmlElement(name = "cve__ChildEducationPercentageMaximum__c", nillable = true)
    protected Double cve__ChildEducationPercentageMaximum__C;
    @XmlElement(name = "cve__ChildEducation__c", nillable = true)
    protected Boolean cve__ChildEducation__C;
    @XmlElement(name = "cve__ChildMaximumAgeNonStudent__c", nillable = true)
    protected Double cve__ChildMaximumAgeNonStudent__C;
    @XmlElement(name = "cve__ChildMaximumAgeStudent2__c", nillable = true)
    protected Double cve__ChildMaximumAgeStudent2__C;
    @XmlElement(name = "cve__ChildMaximumAgeStudent__c", nillable = true)
    protected Double cve__ChildMaximumAgeStudent__C;
    @XmlElement(name = "cve__ComaAmountMaximum__c", nillable = true)
    protected Double cve__ComaAmountMaximum__C;
    @XmlElement(name = "cve__ComaAmountMinimum__c", nillable = true)
    protected Double cve__ComaAmountMinimum__C;
    @XmlElement(name = "cve__ComaPercentageMaximum__c", nillable = true)
    protected Double cve__ComaPercentageMaximum__C;
    @XmlElement(name = "cve__Coma__c", nillable = true)
    protected Boolean cve__Coma__C;
    @XmlElement(name = "cve__ContestabilityPeriod__c", nillable = true)
    protected String cve__ContestabilityPeriod__C;
    @XmlElement(name = "cve__ContinuityOfCoverage__c", nillable = true)
    protected Boolean cve__ContinuityOfCoverage__C;
    @XmlElement(name = "cve__CosmeCosmeticElectiveSurgeryExclusion__c", nillable = true)
    protected Boolean cve__CosmeCosmeticElectiveSurgeryExclusion__C;
    @XmlElement(name = "cve__CosmeticElectiveSurgeryExclusion__c", nillable = true)
    protected Boolean cve__CosmeticElectiveSurgeryExclusion__C;
    @XmlElement(name = "cve__CostOfLivingAdjustmentDefined__c", nillable = true)
    protected String cve__CostOfLivingAdjustmentDefined__C;
    @XmlElement(name = "cve__CostOfLivingAdjustment__c", nillable = true)
    protected Boolean cve__CostOfLivingAdjustment__C;
    @XmlElement(name = "cve__CoverageAmount__c", nillable = true)
    protected Double cve__CoverageAmount__C;
    @XmlElement(name = "cve__CoverageAnnualSalaryMultiple__c", nillable = true)
    protected Double cve__CoverageAnnualSalaryMultiple__C;
    @XmlElement(name = "cve__CoverageBenefitMultiple__c", nillable = true)
    protected Double cve__CoverageBenefitMultiple__C;
    @XmlElement(name = "cve__CoverageRoundingMode__c", nillable = true)
    protected String cve__CoverageRoundingMode__C;
    @XmlElement(name = "cve__CoverageRoundingPrecision__c", nillable = true)
    protected Double cve__CoverageRoundingPrecision__C;
    @XmlElement(name = "cve__CoverageType__c", nillable = true)
    protected String cve__CoverageType__C;
    @XmlElement(name = "cve__Coverages__r", nillable = true)
    protected QueryResultType cve__Coverages__R;
    @XmlElement(name = "cve__CriminalActivityExclusion__c", nillable = true)
    protected Boolean cve__CriminalActivityExclusion__C;
    @XmlElement(name = "cve__CriticalBurnAmountMaximum__c", nillable = true)
    protected Double cve__CriticalBurnAmountMaximum__C;
    @XmlElement(name = "cve__CriticalBurnAmountMinimum__c", nillable = true)
    protected Double cve__CriticalBurnAmountMinimum__C;
    @XmlElement(name = "cve__CriticalBurnPercentageMaximum__c", nillable = true)
    protected Double cve__CriticalBurnPercentageMaximum__C;
    @XmlElement(name = "cve__CriticalBurn__c", nillable = true)
    protected Boolean cve__CriticalBurn__C;
    @XmlElement(name = "cve__DailyCoverageAmount__c", nillable = true)
    protected Double cve__DailyCoverageAmount__C;
    @XmlElement(name = "cve__DayCareAmountMaximum__c", nillable = true)
    protected Double cve__DayCareAmountMaximum__C;
    @XmlElement(name = "cve__DayCareAmountMinimum__c", nillable = true)
    protected Double cve__DayCareAmountMinimum__C;
    @XmlElement(name = "cve__DayCarePercentageMaximum__c", nillable = true)
    protected Double cve__DayCarePercentageMaximum__C;
    @XmlElement(name = "cve__DayCare__c", nillable = true)
    protected Boolean cve__DayCare__C;
    @XmlElement(name = "cve__DefinitionOfDisabilityDays__c", nillable = true)
    protected Double cve__DefinitionOfDisabilityDays__C;
    @XmlElement(name = "cve__DefinitionOfDisabilityPeriod__c", nillable = true)
    protected Double cve__DefinitionOfDisabilityPeriod__C;
    @XmlElement(name = "cve__DefinitionOfDisabilityUnits__c", nillable = true)
    protected String cve__DefinitionOfDisabilityUnits__C;
    @XmlElement(name = "cve__DefinitionOfDisability__c", nillable = true)
    protected String cve__DefinitionOfDisability__C;
    @XmlElement(name = "cve__DefinitionOfEarnings__c", nillable = true)
    protected String cve__DefinitionOfEarnings__C;
    @XmlElement(name = "cve__DependentConversion__c", nillable = true)
    protected Boolean cve__DependentConversion__C;
    @XmlElement(name = "cve__DependentCoverage__c", nillable = true)
    protected Boolean cve__DependentCoverage__C;
    @XmlElement(name = "cve__DependentPortable__c", nillable = true)
    protected Boolean cve__DependentPortable__C;
    @XmlElement(name = "cve__DomesticPartner__c", nillable = true)
    protected Boolean cve__DomesticPartner__C;
    @XmlElement(name = "cve__DoubleIndemnityCommonCarrierAmtMax__c", nillable = true)
    protected Double cve__DoubleIndemnityCommonCarrierAmtMax__C;
    @XmlElement(name = "cve__DoubleIndemnityCommonCarrierAmtMin__c", nillable = true)
    protected Double cve__DoubleIndemnityCommonCarrierAmtMin__C;
    @XmlElement(name = "cve__DoubleIndemnityCommonCarrierPctMax__c", nillable = true)
    protected Double cve__DoubleIndemnityCommonCarrierPctMax__C;
    @XmlElement(name = "cve__DoubleIndemnityCommonCarrier__c", nillable = true)
    protected Boolean cve__DoubleIndemnityCommonCarrier__C;
    @XmlElement(name = "cve__DrugAndAlcoholAbuseLimitationPeriod__c", nillable = true)
    protected String cve__DrugAndAlcoholAbuseLimitationPeriod__C;
    @XmlElement(name = "cve__DrugAndAlcoholAbuseLimitation__c", nillable = true)
    protected Boolean cve__DrugAndAlcoholAbuseLimitation__C;
    @XmlElement(name = "cve__DrugAndAlcoholExclusion__c", nillable = true)
    protected Boolean cve__DrugAndAlcoholExclusion__C;
    @XmlElement(name = "cve__DurationOfBenefitsDays__c", nillable = true)
    protected Double cve__DurationOfBenefitsDays__C;
    @XmlElement(name = "cve__DurationOfBenefitsPeriod__c", nillable = true)
    protected Double cve__DurationOfBenefitsPeriod__C;
    @XmlElement(name = "cve__DurationOfBenefitsUnits__c", nillable = true)
    protected String cve__DurationOfBenefitsUnits__C;
    @XmlElement(name = "cve__DurationOfBenefits__c", nillable = true)
    protected String cve__DurationOfBenefits__C;
    @XmlElement(name = "cve__Effective__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Effective__C;
    @XmlElement(name = "cve__EitherHandOrFootAndSightInOneEye__c", nillable = true)
    protected Double cve__EitherHandOrFootAndSightInOneEye__C;
    @XmlElement(name = "cve__EliminationDays__c", nillable = true)
    protected Double cve__EliminationDays__C;
    @XmlElement(name = "cve__EliminationPeriod__c", nillable = true)
    protected Double cve__EliminationPeriod__C;
    @XmlElement(name = "cve__EliminationUnits__c", nillable = true)
    protected String cve__EliminationUnits__C;
    @XmlElement(name = "cve__EmployeeContributionPercentage__c", nillable = true)
    protected Double cve__EmployeeContributionPercentage__C;
    @XmlElement(name = "cve__EmployerContributionPercentage__c", nillable = true)
    protected Double cve__EmployerContributionPercentage__C;
    @XmlElement(name = "cve__EmploymentClassification__c", nillable = true)
    protected String cve__EmploymentClassification__C;
    @XmlElement(name = "cve__EmploymentTimeDays__c", nillable = true)
    protected Double cve__EmploymentTimeDays__C;
    @XmlElement(name = "cve__EmploymentTimePeriod__c", nillable = true)
    protected Double cve__EmploymentTimePeriod__C;
    @XmlElement(name = "cve__EmploymentTimeUnits__c", nillable = true)
    protected String cve__EmploymentTimeUnits__C;
    @XmlElement(name = "cve__EvidenceOfInsurabilityRequired__c", nillable = true)
    protected Boolean cve__EvidenceOfInsurabilityRequired__C;
    @XmlElement(name = "cve__ExcludeFromIntake__c", nillable = true)
    protected Boolean cve__ExcludeFromIntake__C;
    @XmlElement(name = "cve__Expiration__c", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cve__Expiration__C;
    @XmlElement(name = "cve__FeloniousAssaultAmountMaximum__c", nillable = true)
    protected Double cve__FeloniousAssaultAmountMaximum__C;
    @XmlElement(name = "cve__FeloniousAssaultAmountMinimum__c", nillable = true)
    protected Double cve__FeloniousAssaultAmountMinimum__C;
    @XmlElement(name = "cve__FeloniousAssaultPercentageMaximum__c", nillable = true)
    protected Double cve__FeloniousAssaultPercentageMaximum__C;
    @XmlElement(name = "cve__FeloniousAssault__c", nillable = true)
    protected Boolean cve__FeloniousAssault__C;
    @XmlElement(name = "cve__FelonyExclusion__c", nillable = true)
    protected Boolean cve__FelonyExclusion__C;
    @XmlElement(name = "cve__FicaMatching__c", nillable = true)
    protected Boolean cve__FicaMatching__C;
    @XmlElement(name = "cve__FirstDayHospitalization__c", nillable = true)
    protected Boolean cve__FirstDayHospitalization__C;
    @XmlElement(name = "cve__GroupClass__c", nillable = true)
    protected String cve__GroupClass__C;
    @XmlElement(name = "cve__GroupDivision__c", nillable = true)
    protected String cve__GroupDivision__C;
    @XmlElement(name = "cve__GuaranteedIssueAmount__c", nillable = true)
    protected Double cve__GuaranteedIssueAmount__C;
    @XmlElement(name = "cve__HealthInsurancePaymentPercentage__c", nillable = true)
    protected Double cve__HealthInsurancePaymentPercentage__C;
    @XmlElement(name = "cve__HealthInsurancePayment__c", nillable = true)
    protected Boolean cve__HealthInsurancePayment__C;
    @XmlElement(name = "cve__Hemiplegia__c", nillable = true)
    protected Double cve__Hemiplegia__C;
    @XmlElement(name = "cve__HighRiskActivityExclusion__c", nillable = true)
    protected Boolean cve__HighRiskActivityExclusion__C;
    @XmlElement(name = "cve__HigherEducationAmountMinimum__c", nillable = true)
    protected Double cve__HigherEducationAmountMinimum__C;
    @XmlElement(name = "cve__HigherEducationBenefit__c", nillable = true)
    protected Boolean cve__HigherEducationBenefit__C;
    @XmlElement(name = "cve__HigherEducationMaximum__c", nillable = true)
    protected Double cve__HigherEducationMaximum__C;
    @XmlElement(name = "cve__HigherEducationPercentageMaximum__c", nillable = true)
    protected Double cve__HigherEducationPercentageMaximum__C;
    @XmlElement(name = "cve__HoursRequired__c", nillable = true)
    protected Double cve__HoursRequired__C;
    @XmlElement(name = "cve__IllegalOccupationExclusion__c", nillable = true)
    protected Boolean cve__IllegalOccupationExclusion__C;
    @XmlElement(name = "cve__IllnessDurationOfBenefits__c", nillable = true)
    protected String cve__IllnessDurationOfBenefits__C;
    @XmlElement(name = "cve__IllnessEliminationDays__c", nillable = true)
    protected Double cve__IllnessEliminationDays__C;
    @XmlElement(name = "cve__IllnessEliminationPeriodUnits__c", nillable = true)
    protected String cve__IllnessEliminationPeriodUnits__C;
    @XmlElement(name = "cve__IllnessEliminationPeriod__c", nillable = true)
    protected Double cve__IllnessEliminationPeriod__C;
    @XmlElement(name = "cve__IllnessEliminationUnits__c", nillable = true)
    protected String cve__IllnessEliminationUnits__C;
    @XmlElement(name = "cve__IllnessExclusion__c", nillable = true)
    protected Boolean cve__IllnessExclusion__C;
    @XmlElement(name = "cve__LifeBenefitPercentage__c", nillable = true)
    protected Double cve__LifeBenefitPercentage__C;
    @XmlElement(name = "cve__LineOfBusiness__c", nillable = true)
    protected String cve__LineOfBusiness__C;
    @XmlElement(name = "cve__LoanAvailability__c", nillable = true)
    protected Boolean cve__LoanAvailability__C;
    @XmlElement(name = "cve__LoanInterestRate__c", nillable = true)
    protected Double cve__LoanInterestRate__C;
    @XmlElement(name = "cve__LtdDurationOfBenefitsSchedule__c", nillable = true)
    protected String cve__LtdDurationOfBenefitsSchedule__C;
    @XmlElement(name = "cve__LtdDurationOfBenefits__c", nillable = true)
    protected String cve__LtdDurationOfBenefits__C;
    @XmlElement(name = "cve__LtdEliminationDays__c", nillable = true)
    protected Double cve__LtdEliminationDays__C;
    @XmlElement(name = "cve__LtdEliminationPeriod__c", nillable = true)
    protected Double cve__LtdEliminationPeriod__C;
    @XmlElement(name = "cve__LtdEliminationUnits__c", nillable = true)
    protected String cve__LtdEliminationUnits__C;
    @XmlElement(name = "cve__MaximumAcceleratedAmount__c", nillable = true)
    protected Double cve__MaximumAcceleratedAmount__C;
    @XmlElement(name = "cve__MaximumAcceleratedPercentage__c", nillable = true)
    protected Double cve__MaximumAcceleratedPercentage__C;
    @XmlElement(name = "cve__MaximumAmountAppliedType__c", nillable = true)
    protected String cve__MaximumAmountAppliedType__C;
    @XmlElement(name = "cve__MaximumAnnualEarnings__c", nillable = true)
    protected Double cve__MaximumAnnualEarnings__C;
    @XmlElement(name = "cve__MaximumBenefitPeriod__c", nillable = true)
    protected String cve__MaximumBenefitPeriod__C;
    @XmlElement(name = "cve__MaximumBenefit__c", nillable = true)
    protected Double cve__MaximumBenefit__C;
    @XmlElement(name = "cve__MaximumCoverageAge__c", nillable = true)
    protected Double cve__MaximumCoverageAge__C;
    @XmlElement(name = "cve__MaximumCoverageAmount__c", nillable = true)
    protected Double cve__MaximumCoverageAmount__C;
    @XmlElement(name = "cve__MaximumCoverageAnnualSalaryMultiple__c", nillable = true)
    protected Double cve__MaximumCoverageAnnualSalaryMultiple__C;
    @XmlElement(name = "cve__MaximumCoveragePeriod__c", nillable = true)
    protected Double cve__MaximumCoveragePeriod__C;
    @XmlElement(name = "cve__MaximumCoverageType__c", nillable = true)
    protected String cve__MaximumCoverageType__C;
    @XmlElement(name = "cve__MaximumCoverageUnits__c", nillable = true)
    protected String cve__MaximumCoverageUnits__C;
    @XmlElement(name = "cve__MentalNervousLimitationPeriod__c", nillable = true)
    protected String cve__MentalNervousLimitationPeriod__C;
    @XmlElement(name = "cve__MentalNervousLimitation__c", nillable = true)
    protected Boolean cve__MentalNervousLimitation__C;
    @XmlElement(name = "cve__MinimumAcceleratedAmount__c", nillable = true)
    protected Double cve__MinimumAcceleratedAmount__C;
    @XmlElement(name = "cve__MinimumAcceleratedPercentage__c", nillable = true)
    protected Double cve__MinimumAcceleratedPercentage__C;
    @XmlElement(name = "cve__MinimumAmountAppliedType__c", nillable = true)
    protected String cve__MinimumAmountAppliedType__C;
    @XmlElement(name = "cve__MinimumAmountNotAppliedToDependents__c", nillable = true)
    protected Boolean cve__MinimumAmountNotAppliedToDependents__C;
    @XmlElement(name = "cve__MinimumBenefitPercentage__c", nillable = true)
    protected Double cve__MinimumBenefitPercentage__C;
    @XmlElement(name = "cve__MinimumBenefitPeriod__c", nillable = true)
    protected String cve__MinimumBenefitPeriod__C;
    @XmlElement(name = "cve__MinimumBenefit__c", nillable = true)
    protected Double cve__MinimumBenefit__C;
    @XmlElement(name = "cve__MinimumCoverageAge__c", nillable = true)
    protected Double cve__MinimumCoverageAge__C;
    @XmlElement(name = "cve__MinimumCoverageAmount__c", nillable = true)
    protected Double cve__MinimumCoverageAmount__C;
    @XmlElement(name = "cve__MinimumCoverageAnnualSalaryMultiple__c", nillable = true)
    protected Double cve__MinimumCoverageAnnualSalaryMultiple__C;
    @XmlElement(name = "cve__MinimumCoveragePeriod__c", nillable = true)
    protected Double cve__MinimumCoveragePeriod__C;
    @XmlElement(name = "cve__MinimumCoverageType__c", nillable = true)
    protected String cve__MinimumCoverageType__C;
    @XmlElement(name = "cve__MinimumCoverageUnits__c", nillable = true)
    protected String cve__MinimumCoverageUnits__C;
    @XmlElement(name = "cve__NoFaultInsurance__c", nillable = true)
    protected Boolean cve__NoFaultInsurance__C;
    @XmlElement(name = "cve__NormalDentalCareExclusion__c", nillable = true)
    protected Boolean cve__NormalDentalCareExclusion__C;
    @XmlElement(name = "cve__OneFootPercentage__c", nillable = true)
    protected Double cve__OneFootPercentage__C;
    @XmlElement(name = "cve__OneHandAndOneFoot__c", nillable = true)
    protected Double cve__OneHandAndOneFoot__C;
    @XmlElement(name = "cve__OneHandPercentage__c", nillable = true)
    protected Double cve__OneHandPercentage__C;
    @XmlElement(name = "cve__OtherExclusions__c", nillable = true)
    protected String cve__OtherExclusions__C;
    @XmlElement(name = "cve__OtherOffset__c", nillable = true)
    protected Boolean cve__OtherOffset__C;
    @XmlElement(name = "cve__OuiDuiExclusion__c", nillable = true)
    protected Boolean cve__OuiDuiExclusion__C;
    @XmlElement(name = "cve__Paraplegia__c", nillable = true)
    protected Double cve__Paraplegia__C;
    @XmlElement(name = "cve__ParticipationValue__c", nillable = true)
    protected Double cve__ParticipationValue__C;
    @XmlElement(name = "cve__Participation__c", nillable = true)
    protected Boolean cve__Participation__C;
    @XmlElement(name = "cve__PensionContributionPaymentPercentage__c", nillable = true)
    protected Double cve__PensionContributionPaymentPercentage__C;
    @XmlElement(name = "cve__PensionContributionPayment__c", nillable = true)
    protected Boolean cve__PensionContributionPayment__C;
    @XmlElement(name = "cve__PensionDisabilityOffset__c", nillable = true)
    protected Boolean cve__PensionDisabilityOffset__C;
    @XmlElement(name = "cve__PensionRetirementOffset__c", nillable = true)
    protected Boolean cve__PensionRetirementOffset__C;
    @XmlElement(name = "cve__PolicyBenefits__r", nillable = true)
    protected QueryResultType cve__PolicyBenefits__R;
    @XmlElement(name = "cve__PreexistingConditionLimitationPeriod__c", nillable = true)
    protected String cve__PreexistingConditionLimitationPeriod__C;
    @XmlElement(name = "cve__PreexistingConditionLimitation__c", nillable = true)
    protected Boolean cve__PreexistingConditionLimitation__C;
    @XmlElement(name = "cve__PreexistingConditionProvision__c", nillable = true)
    protected String cve__PreexistingConditionProvision__C;
    @XmlElement(name = "cve__PreexistingCondition__c", nillable = true)
    protected Boolean cve__PreexistingCondition__C;
    @XmlElement(name = "cve__PregnancyChildbirthExclusion__c", nillable = true)
    protected Boolean cve__PregnancyChildbirthExclusion__C;
    @XmlElement(name = "cve__PregnancyDurationOfBenefits__c", nillable = true)
    protected String cve__PregnancyDurationOfBenefits__C;
    @XmlElement(name = "cve__PregnancyEliminationDays__c", nillable = true)
    protected Double cve__PregnancyEliminationDays__C;
    @XmlElement(name = "cve__PregnancyEliminationPeriodUnits__c", nillable = true)
    protected String cve__PregnancyEliminationPeriodUnits__C;
    @XmlElement(name = "cve__PregnancyEliminationPeriod__c", nillable = true)
    protected Double cve__PregnancyEliminationPeriod__C;
    @XmlElement(name = "cve__PregnancyEliminationUnits__c", nillable = true)
    protected String cve__PregnancyEliminationUnits__C;
    @XmlElement(name = "cve__Product__c", nillable = true)
    protected String cve__Product__C;
    @XmlElement(name = "cve__Product__r", nillable = true)
    protected Cve__Product__C cve__Product__R;
    @XmlElement(name = "cve__Quadriplegia__c", nillable = true)
    protected Double cve__Quadriplegia__C;
    @XmlElement(name = "cve__RailroadRetirementOffset__c", nillable = true)
    protected Boolean cve__RailroadRetirementOffset__C;
    @XmlElement(name = "cve__RecordTypeLabel__c", nillable = true)
    protected String cve__RecordTypeLabel__C;
    @XmlElement(name = "cve__RecordTypeName__c", nillable = true)
    protected String cve__RecordTypeName__C;
    @XmlElement(name = "cve__RecurrentDisabilityCondition__c", nillable = true)
    protected String cve__RecurrentDisabilityCondition__C;
    @XmlElement(name = "cve__RecurrentDisabilityOccupation__c", nillable = true)
    protected String cve__RecurrentDisabilityOccupation__C;
    @XmlElement(name = "cve__RecurrentDisabilityPeriod__c", nillable = true)
    protected Double cve__RecurrentDisabilityPeriod__C;
    @XmlElement(name = "cve__RecurrentDisabilityUnits__c", nillable = true)
    protected String cve__RecurrentDisabilityUnits__C;
    @XmlElement(name = "cve__RehabilitationAmountMaximum__c", nillable = true)
    protected Double cve__RehabilitationAmountMaximum__C;
    @XmlElement(name = "cve__RehabilitationAmountMinimum__c", nillable = true)
    protected Double cve__RehabilitationAmountMinimum__C;
    @XmlElement(name = "cve__RehabilitationPercentageMaximum__c", nillable = true)
    protected Double cve__RehabilitationPercentageMaximum__C;
    @XmlElement(name = "cve__Rehabilitation__c", nillable = true)
    protected Boolean cve__Rehabilitation__C;
    @XmlElement(name = "cve__ReinsuranceAmount__c", nillable = true)
    protected Double cve__ReinsuranceAmount__C;
    @XmlElement(name = "cve__ReinsuranceType__c", nillable = true)
    protected String cve__ReinsuranceType__C;
    @XmlElement(name = "cve__Reinsured__c", nillable = true)
    protected Boolean cve__Reinsured__C;
    @XmlElement(name = "cve__ReinsurerName__c", nillable = true)
    protected String cve__ReinsurerName__C;
    @XmlElement(name = "cve__RepatriationAmountMaximum__c", nillable = true)
    protected Double cve__RepatriationAmountMaximum__C;
    @XmlElement(name = "cve__RepatriationAmountMinimum__c", nillable = true)
    protected Double cve__RepatriationAmountMinimum__C;
    @XmlElement(name = "cve__RepatriationPercentageMaximum__c", nillable = true)
    protected Double cve__RepatriationPercentageMaximum__C;
    @XmlElement(name = "cve__Repatriation__c", nillable = true)
    protected Boolean cve__Repatriation__C;
    @XmlElement(name = "cve__ReturnToWorkEarningsOffset__c", nillable = true)
    protected Boolean cve__ReturnToWorkEarningsOffset__C;
    @XmlElement(name = "cve__SeatBeltAmountMaximum__c", nillable = true)
    protected Double cve__SeatBeltAmountMaximum__C;
    @XmlElement(name = "cve__SeatBeltAmountMinimum__c", nillable = true)
    protected Double cve__SeatBeltAmountMinimum__C;
    @XmlElement(name = "cve__SeatBeltFlatAmount__c", nillable = true)
    protected Double cve__SeatBeltFlatAmount__C;
    @XmlElement(name = "cve__SeatBeltPercentage__c", nillable = true)
    protected Double cve__SeatBeltPercentage__C;
    @XmlElement(name = "cve__SelfInflictedExclusionPeriod__c", nillable = true)
    protected Double cve__SelfInflictedExclusionPeriod__C;
    @XmlElement(name = "cve__SelfInflictedExclusionUnits__c", nillable = true)
    protected String cve__SelfInflictedExclusionUnits__C;
    @XmlElement(name = "cve__SelfInflictedExclusion__c", nillable = true)
    protected Boolean cve__SelfInflictedExclusion__C;
    @XmlElement(name = "cve__SicknessExclusion__c", nillable = true)
    protected Boolean cve__SicknessExclusion__C;
    @XmlElement(name = "cve__SightInBothEyes__c", nillable = true)
    protected Double cve__SightInBothEyes__C;
    @XmlElement(name = "cve__SightInOneEyePercentage__c", nillable = true)
    protected Double cve__SightInOneEyePercentage__C;
    @XmlElement(name = "cve__SocialSecurityDisability__c", nillable = true)
    protected String cve__SocialSecurityDisability__C;
    @XmlElement(name = "cve__SocialSecurityRetirementOffset__c", nillable = true)
    protected Boolean cve__SocialSecurityRetirementOffset__C;
    @XmlElement(name = "cve__SpeechAndHearingInBothEars__c", nillable = true)
    protected Double cve__SpeechAndHearingInBothEars__C;
    @XmlElement(name = "cve__SpeechOrHearingInBothEars__c", nillable = true)
    protected Double cve__SpeechOrHearingInBothEars__C;
    @XmlElement(name = "cve__SpouseAmount__c", nillable = true)
    protected Double cve__SpouseAmount__C;
    @XmlElement(name = "cve__SpouseEducationAmountMaximum__c", nillable = true)
    protected Double cve__SpouseEducationAmountMaximum__C;
    @XmlElement(name = "cve__SpouseEducationAmountMinimum__c", nillable = true)
    protected Double cve__SpouseEducationAmountMinimum__C;
    @XmlElement(name = "cve__SpouseEducationPercentageMaximum__c", nillable = true)
    protected Double cve__SpouseEducationPercentageMaximum__C;
    @XmlElement(name = "cve__SpouseEducation__c", nillable = true)
    protected Boolean cve__SpouseEducation__C;
    @XmlElement(name = "cve__StateDisability__c", nillable = true)
    protected Boolean cve__StateDisability__C;
    @XmlElement(name = "cve__StatesOfferedIn__c", nillable = true)
    protected String cve__StatesOfferedIn__C;
    @XmlElement(name = "cve__Status__c", nillable = true)
    protected String cve__Status__C;
    @XmlElement(name = "cve__StrikeContinuationPeriod__c", nillable = true)
    protected Double cve__StrikeContinuationPeriod__C;
    @XmlElement(name = "cve__StrikeContinuationUnits__c", nillable = true)
    protected String cve__StrikeContinuationUnits__C;
    @XmlElement(name = "cve__SubjectiveConditionLimitationPeriod__c", nillable = true)
    protected String cve__SubjectiveConditionLimitationPeriod__C;
    @XmlElement(name = "cve__SubjectiveConditionLimitation__c", nillable = true)
    protected Boolean cve__SubjectiveConditionLimitation__C;
    @XmlElement(name = "cve__SuicideExclusionPeriod__c", nillable = true)
    protected Double cve__SuicideExclusionPeriod__C;
    @XmlElement(name = "cve__SuicideExclusionUnits__c", nillable = true)
    protected String cve__SuicideExclusionUnits__C;
    @XmlElement(name = "cve__SuicideExclusion__c", nillable = true)
    protected Boolean cve__SuicideExclusion__C;
    @XmlElement(name = "cve__SurvivorIncomeBenefit__c", nillable = true)
    protected Boolean cve__SurvivorIncomeBenefit__C;
    @XmlElement(name = "cve__TherapeuticCounselingAmountMaximum__c", nillable = true)
    protected Double cve__TherapeuticCounselingAmountMaximum__C;
    @XmlElement(name = "cve__TherapeuticCounselingAmountMinimum__c", nillable = true)
    protected Double cve__TherapeuticCounselingAmountMinimum__C;
    @XmlElement(name = "cve__TherapeuticCounselingPercentageMaximum__c", nillable = true)
    protected Double cve__TherapeuticCounselingPercentageMaximum__C;
    @XmlElement(name = "cve__TherapeuticCounseling__c", nillable = true)
    protected Boolean cve__TherapeuticCounseling__C;
    @XmlElement(name = "cve__ThirdPartyLiabilityOffset__c", nillable = true)
    protected Boolean cve__ThirdPartyLiabilityOffset__C;
    @XmlElement(name = "cve__ThumbAndIndexFingerOfEitherHand__c", nillable = true)
    protected Double cve__ThumbAndIndexFingerOfEitherHand__C;
    @XmlElement(name = "cve__TravelAssistance__c", nillable = true)
    protected Boolean cve__TravelAssistance__C;
    @XmlElement(name = "cve__Triplegia__c", nillable = true)
    protected Double cve__Triplegia__C;
    @XmlElement(name = "cve__TwoOrMoreLossesPercentage__c", nillable = true)
    protected Double cve__TwoOrMoreLossesPercentage__C;
    @XmlElement(name = "cve__Unemployment__c", nillable = true)
    protected Boolean cve__Unemployment__C;
    @XmlElement(name = "cve__Uniplegia__c", nillable = true)
    protected Double cve__Uniplegia__C;
    @XmlElement(name = "cve__VoluntarilyTakingPoisonExclusion__c", nillable = true)
    protected Boolean cve__VoluntarilyTakingPoisonExclusion__C;
    @XmlElement(name = "cve__WaitingDays__c", nillable = true)
    protected Double cve__WaitingDays__C;
    @XmlElement(name = "cve__WaitingFirstOfTheMonth__c", nillable = true)
    protected Boolean cve__WaitingFirstOfTheMonth__C;
    @XmlElement(name = "cve__WaitingPeriod__c", nillable = true)
    protected Double cve__WaitingPeriod__C;
    @XmlElement(name = "cve__WaitingUnits__c", nillable = true)
    protected String cve__WaitingUnits__C;
    @XmlElement(name = "cve__WarExclusion__c", nillable = true)
    protected Boolean cve__WarExclusion__C;
    @XmlElement(name = "cve__WopDependentsContinuationPeriod__c", nillable = true)
    protected Double cve__WopDependentsContinuationPeriod__C;
    @XmlElement(name = "cve__WopDependentsContinuationUnits__c", nillable = true)
    protected String cve__WopDependentsContinuationUnits__C;
    @XmlElement(name = "cve__WopDependents__c", nillable = true)
    protected Boolean cve__WopDependents__C;
    @XmlElement(name = "cve__WopReductionAge__c", nillable = true)
    protected Double cve__WopReductionAge__C;
    @XmlElement(name = "cve__WopTerminationAge__c", nillable = true)
    protected Double cve__WopTerminationAge__C;
    @XmlElement(name = "cve__WopTotalDisabilityBeginMaximumAge__c", nillable = true)
    protected Double cve__WopTotalDisabilityBeginMaximumAge__C;
    @XmlElement(name = "cve__WopTotalDisabilityBeginMinimumAge__c", nillable = true)
    protected Double cve__WopTotalDisabilityBeginMinimumAge__C;
    @XmlElement(name = "cve__WorkWeekDays__c", nillable = true)
    protected String cve__WorkWeekDays__C;
    @XmlElement(name = "cve__WorkersCompensationOffset__c", nillable = true)
    protected Boolean cve__WorkersCompensationOffset__C;

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
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setRecordType(RecordType value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
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
     * Gets the value of the cve__AcceleratedPaymentAllowed__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AcceleratedPaymentAllowed__C() {
        return cve__AcceleratedPaymentAllowed__C;
    }

    /**
     * Sets the value of the cve__AcceleratedPaymentAllowed__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AcceleratedPaymentAllowed__C(Boolean value) {
        this.cve__AcceleratedPaymentAllowed__C = value;
    }

    /**
     * Gets the value of the cve__AcceleratedPaymentType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AcceleratedPaymentType__C() {
        return cve__AcceleratedPaymentType__C;
    }

    /**
     * Sets the value of the cve__AcceleratedPaymentType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AcceleratedPaymentType__C(String value) {
        this.cve__AcceleratedPaymentType__C = value;
    }

    /**
     * Gets the value of the cve__AccidentDurationOfBenefits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AccidentDurationOfBenefits__C() {
        return cve__AccidentDurationOfBenefits__C;
    }

    /**
     * Sets the value of the cve__AccidentDurationOfBenefits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AccidentDurationOfBenefits__C(String value) {
        this.cve__AccidentDurationOfBenefits__C = value;
    }

    /**
     * Gets the value of the cve__AccidentEliminationDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AccidentEliminationDays__C() {
        return cve__AccidentEliminationDays__C;
    }

    /**
     * Sets the value of the cve__AccidentEliminationDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AccidentEliminationDays__C(Double value) {
        this.cve__AccidentEliminationDays__C = value;
    }

    /**
     * Gets the value of the cve__AccidentEliminationPeriodUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AccidentEliminationPeriodUnits__C() {
        return cve__AccidentEliminationPeriodUnits__C;
    }

    /**
     * Sets the value of the cve__AccidentEliminationPeriodUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AccidentEliminationPeriodUnits__C(String value) {
        this.cve__AccidentEliminationPeriodUnits__C = value;
    }

    /**
     * Gets the value of the cve__AccidentEliminationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AccidentEliminationPeriod__C() {
        return cve__AccidentEliminationPeriod__C;
    }

    /**
     * Sets the value of the cve__AccidentEliminationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AccidentEliminationPeriod__C(Double value) {
        this.cve__AccidentEliminationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__AccidentEliminationUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AccidentEliminationUnits__C() {
        return cve__AccidentEliminationUnits__C;
    }

    /**
     * Sets the value of the cve__AccidentEliminationUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AccidentEliminationUnits__C(String value) {
        this.cve__AccidentEliminationUnits__C = value;
    }

    /**
     * Gets the value of the cve__ActiveMemberOfArmedForcesExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ActiveMemberOfArmedForcesExclusion__C() {
        return cve__ActiveMemberOfArmedForcesExclusion__C;
    }

    /**
     * Sets the value of the cve__ActiveMemberOfArmedForcesExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ActiveMemberOfArmedForcesExclusion__C(Boolean value) {
        this.cve__ActiveMemberOfArmedForcesExclusion__C = value;
    }

    /**
     * Gets the value of the cve__AdaptiveHomeVehicleAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdaptiveHomeVehicleAmountMaximum__C() {
        return cve__AdaptiveHomeVehicleAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__AdaptiveHomeVehicleAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdaptiveHomeVehicleAmountMaximum__C(Double value) {
        this.cve__AdaptiveHomeVehicleAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__AdaptiveHomeVehicleAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdaptiveHomeVehicleAmountMinimum__C() {
        return cve__AdaptiveHomeVehicleAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__AdaptiveHomeVehicleAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdaptiveHomeVehicleAmountMinimum__C(Double value) {
        this.cve__AdaptiveHomeVehicleAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__AdaptiveHomeVehiclePercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AdaptiveHomeVehiclePercentageMaximum__C() {
        return cve__AdaptiveHomeVehiclePercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__AdaptiveHomeVehiclePercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AdaptiveHomeVehiclePercentageMaximum__C(Double value) {
        this.cve__AdaptiveHomeVehiclePercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__AdaptiveHomeVehicle__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AdaptiveHomeVehicle__C() {
        return cve__AdaptiveHomeVehicle__C;
    }

    /**
     * Sets the value of the cve__AdaptiveHomeVehicle__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AdaptiveHomeVehicle__C(Boolean value) {
        this.cve__AdaptiveHomeVehicle__C = value;
    }

    /**
     * Gets the value of the cve__AirBagAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AirBagAmountMaximum__C() {
        return cve__AirBagAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__AirBagAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AirBagAmountMaximum__C(Double value) {
        this.cve__AirBagAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__AirBagAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AirBagAmountMinimum__C() {
        return cve__AirBagAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__AirBagAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AirBagAmountMinimum__C(Double value) {
        this.cve__AirBagAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__AirBagFlatAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AirBagFlatAmount__C() {
        return cve__AirBagFlatAmount__C;
    }

    /**
     * Sets the value of the cve__AirBagFlatAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AirBagFlatAmount__C(Double value) {
        this.cve__AirBagFlatAmount__C = value;
    }

    /**
     * Gets the value of the cve__AirBagPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__AirBagPercentage__C() {
        return cve__AirBagPercentage__C;
    }

    /**
     * Sets the value of the cve__AirBagPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__AirBagPercentage__C(Double value) {
        this.cve__AirBagPercentage__C = value;
    }

    /**
     * Gets the value of the cve__AircraftOperationExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__AircraftOperationExclusion__C() {
        return cve__AircraftOperationExclusion__C;
    }

    /**
     * Sets the value of the cve__AircraftOperationExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__AircraftOperationExclusion__C(Boolean value) {
        this.cve__AircraftOperationExclusion__C = value;
    }

    /**
     * Gets the value of the cve__AllSources__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AllSources__C() {
        return cve__AllSources__C;
    }

    /**
     * Sets the value of the cve__AllSources__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AllSources__C(String value) {
        this.cve__AllSources__C = value;
    }

    /**
     * Gets the value of the cve__AppliesToRelationship__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__AppliesToRelationship__C() {
        return cve__AppliesToRelationship__C;
    }

    /**
     * Sets the value of the cve__AppliesToRelationship__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__AppliesToRelationship__C(String value) {
        this.cve__AppliesToRelationship__C = value;
    }

    /**
     * Gets the value of the cve__BaseBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BaseBenefit__C() {
        return cve__BaseBenefit__C;
    }

    /**
     * Sets the value of the cve__BaseBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BaseBenefit__C(String value) {
        this.cve__BaseBenefit__C = value;
    }

    /**
     * Gets the value of the cve__BaseBenefit__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Benefit__C }
     *     
     */
    public Cve__Benefit__C getCve__BaseBenefit__R() {
        return cve__BaseBenefit__R;
    }

    /**
     * Sets the value of the cve__BaseBenefit__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Benefit__C }
     *     
     */
    public void setCve__BaseBenefit__R(Cve__Benefit__C value) {
        this.cve__BaseBenefit__R = value;
    }

    /**
     * Gets the value of the cve__BenefitClaimeds__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__BenefitClaimeds__R() {
        return cve__BenefitClaimeds__R;
    }

    /**
     * Sets the value of the cve__BenefitClaimeds__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__BenefitClaimeds__R(QueryResultType value) {
        this.cve__BenefitClaimeds__R = value;
    }

    /**
     * Gets the value of the cve__BenefitFlatAmountPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitFlatAmountPeriod__C() {
        return cve__BenefitFlatAmountPeriod__C;
    }

    /**
     * Sets the value of the cve__BenefitFlatAmountPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitFlatAmountPeriod__C(String value) {
        this.cve__BenefitFlatAmountPeriod__C = value;
    }

    /**
     * Gets the value of the cve__BenefitFlatAmountValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__BenefitFlatAmountValue__C() {
        return cve__BenefitFlatAmountValue__C;
    }

    /**
     * Sets the value of the cve__BenefitFlatAmountValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__BenefitFlatAmountValue__C(Double value) {
        this.cve__BenefitFlatAmountValue__C = value;
    }

    /**
     * Gets the value of the cve__BenefitFlatAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__BenefitFlatAmount__C() {
        return cve__BenefitFlatAmount__C;
    }

    /**
     * Sets the value of the cve__BenefitFlatAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__BenefitFlatAmount__C(String value) {
        this.cve__BenefitFlatAmount__C = value;
    }

    /**
     * Gets the value of the cve__BenefitOptions__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__BenefitOptions__R() {
        return cve__BenefitOptions__R;
    }

    /**
     * Sets the value of the cve__BenefitOptions__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__BenefitOptions__R(QueryResultType value) {
        this.cve__BenefitOptions__R = value;
    }

    /**
     * Gets the value of the cve__BenefitPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__BenefitPercentage__C() {
        return cve__BenefitPercentage__C;
    }

    /**
     * Sets the value of the cve__BenefitPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__BenefitPercentage__C(Double value) {
        this.cve__BenefitPercentage__C = value;
    }

    /**
     * Gets the value of the cve__BenefitQuestionPages__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__BenefitQuestionPages__R() {
        return cve__BenefitQuestionPages__R;
    }

    /**
     * Sets the value of the cve__BenefitQuestionPages__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__BenefitQuestionPages__R(QueryResultType value) {
        this.cve__BenefitQuestionPages__R = value;
    }

    /**
     * Gets the value of the cve__BenefitReductions__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__BenefitReductions__R() {
        return cve__BenefitReductions__R;
    }

    /**
     * Sets the value of the cve__BenefitReductions__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__BenefitReductions__R(QueryResultType value) {
        this.cve__BenefitReductions__R = value;
    }

    /**
     * Gets the value of the cve__BenefitVariations__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__BenefitVariations__R() {
        return cve__BenefitVariations__R;
    }

    /**
     * Sets the value of the cve__BenefitVariations__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__BenefitVariations__R(QueryResultType value) {
        this.cve__BenefitVariations__R = value;
    }

    /**
     * Gets the value of the cve__BothFeet__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__BothFeet__C() {
        return cve__BothFeet__C;
    }

    /**
     * Sets the value of the cve__BothFeet__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__BothFeet__C(Double value) {
        this.cve__BothFeet__C = value;
    }

    /**
     * Gets the value of the cve__BothHands__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__BothHands__C() {
        return cve__BothHands__C;
    }

    /**
     * Sets the value of the cve__BothHands__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__BothHands__C(Double value) {
        this.cve__BothHands__C = value;
    }

    /**
     * Gets the value of the cve__CareerAdjustmentAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CareerAdjustmentAmountMinimum__C() {
        return cve__CareerAdjustmentAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__CareerAdjustmentAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CareerAdjustmentAmountMinimum__C(Double value) {
        this.cve__CareerAdjustmentAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__CareerAdjustmentMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CareerAdjustmentMaximum__C() {
        return cve__CareerAdjustmentMaximum__C;
    }

    /**
     * Sets the value of the cve__CareerAdjustmentMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CareerAdjustmentMaximum__C(Double value) {
        this.cve__CareerAdjustmentMaximum__C = value;
    }

    /**
     * Gets the value of the cve__CareerAdjustmentPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CareerAdjustmentPercentageMaximum__C() {
        return cve__CareerAdjustmentPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__CareerAdjustmentPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CareerAdjustmentPercentageMaximum__C(Double value) {
        this.cve__CareerAdjustmentPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__CareerAdjustment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__CareerAdjustment__C() {
        return cve__CareerAdjustment__C;
    }

    /**
     * Sets the value of the cve__CareerAdjustment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__CareerAdjustment__C(Boolean value) {
        this.cve__CareerAdjustment__C = value;
    }

    /**
     * Gets the value of the cve__ChildAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildAmount__C() {
        return cve__ChildAmount__C;
    }

    /**
     * Sets the value of the cve__ChildAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildAmount__C(Double value) {
        this.cve__ChildAmount__C = value;
    }

    /**
     * Gets the value of the cve__ChildCareAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildCareAmountMinimum__C() {
        return cve__ChildCareAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__ChildCareAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildCareAmountMinimum__C(Double value) {
        this.cve__ChildCareAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__ChildCareMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildCareMaximum__C() {
        return cve__ChildCareMaximum__C;
    }

    /**
     * Sets the value of the cve__ChildCareMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildCareMaximum__C(Double value) {
        this.cve__ChildCareMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ChildCarePercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildCarePercentageMaximum__C() {
        return cve__ChildCarePercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__ChildCarePercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildCarePercentageMaximum__C(Double value) {
        this.cve__ChildCarePercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ChildCare__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ChildCare__C() {
        return cve__ChildCare__C;
    }

    /**
     * Sets the value of the cve__ChildCare__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ChildCare__C(Boolean value) {
        this.cve__ChildCare__C = value;
    }

    /**
     * Gets the value of the cve__ChildEducationAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildEducationAmountMaximum__C() {
        return cve__ChildEducationAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__ChildEducationAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildEducationAmountMaximum__C(Double value) {
        this.cve__ChildEducationAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ChildEducationAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildEducationAmountMinimum__C() {
        return cve__ChildEducationAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__ChildEducationAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildEducationAmountMinimum__C(Double value) {
        this.cve__ChildEducationAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__ChildEducationPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildEducationPercentageMaximum__C() {
        return cve__ChildEducationPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__ChildEducationPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildEducationPercentageMaximum__C(Double value) {
        this.cve__ChildEducationPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ChildEducation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ChildEducation__C() {
        return cve__ChildEducation__C;
    }

    /**
     * Sets the value of the cve__ChildEducation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ChildEducation__C(Boolean value) {
        this.cve__ChildEducation__C = value;
    }

    /**
     * Gets the value of the cve__ChildMaximumAgeNonStudent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildMaximumAgeNonStudent__C() {
        return cve__ChildMaximumAgeNonStudent__C;
    }

    /**
     * Sets the value of the cve__ChildMaximumAgeNonStudent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildMaximumAgeNonStudent__C(Double value) {
        this.cve__ChildMaximumAgeNonStudent__C = value;
    }

    /**
     * Gets the value of the cve__ChildMaximumAgeStudent2__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildMaximumAgeStudent2__C() {
        return cve__ChildMaximumAgeStudent2__C;
    }

    /**
     * Sets the value of the cve__ChildMaximumAgeStudent2__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildMaximumAgeStudent2__C(Double value) {
        this.cve__ChildMaximumAgeStudent2__C = value;
    }

    /**
     * Gets the value of the cve__ChildMaximumAgeStudent__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ChildMaximumAgeStudent__C() {
        return cve__ChildMaximumAgeStudent__C;
    }

    /**
     * Sets the value of the cve__ChildMaximumAgeStudent__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ChildMaximumAgeStudent__C(Double value) {
        this.cve__ChildMaximumAgeStudent__C = value;
    }

    /**
     * Gets the value of the cve__ComaAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ComaAmountMaximum__C() {
        return cve__ComaAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__ComaAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ComaAmountMaximum__C(Double value) {
        this.cve__ComaAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__ComaAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ComaAmountMinimum__C() {
        return cve__ComaAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__ComaAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ComaAmountMinimum__C(Double value) {
        this.cve__ComaAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__ComaPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ComaPercentageMaximum__C() {
        return cve__ComaPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__ComaPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ComaPercentageMaximum__C(Double value) {
        this.cve__ComaPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__Coma__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Coma__C() {
        return cve__Coma__C;
    }

    /**
     * Sets the value of the cve__Coma__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Coma__C(Boolean value) {
        this.cve__Coma__C = value;
    }

    /**
     * Gets the value of the cve__ContestabilityPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ContestabilityPeriod__C() {
        return cve__ContestabilityPeriod__C;
    }

    /**
     * Sets the value of the cve__ContestabilityPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ContestabilityPeriod__C(String value) {
        this.cve__ContestabilityPeriod__C = value;
    }

    /**
     * Gets the value of the cve__ContinuityOfCoverage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ContinuityOfCoverage__C() {
        return cve__ContinuityOfCoverage__C;
    }

    /**
     * Sets the value of the cve__ContinuityOfCoverage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ContinuityOfCoverage__C(Boolean value) {
        this.cve__ContinuityOfCoverage__C = value;
    }

    /**
     * Gets the value of the cve__CosmeCosmeticElectiveSurgeryExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__CosmeCosmeticElectiveSurgeryExclusion__C() {
        return cve__CosmeCosmeticElectiveSurgeryExclusion__C;
    }

    /**
     * Sets the value of the cve__CosmeCosmeticElectiveSurgeryExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__CosmeCosmeticElectiveSurgeryExclusion__C(Boolean value) {
        this.cve__CosmeCosmeticElectiveSurgeryExclusion__C = value;
    }

    /**
     * Gets the value of the cve__CosmeticElectiveSurgeryExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__CosmeticElectiveSurgeryExclusion__C() {
        return cve__CosmeticElectiveSurgeryExclusion__C;
    }

    /**
     * Sets the value of the cve__CosmeticElectiveSurgeryExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__CosmeticElectiveSurgeryExclusion__C(Boolean value) {
        this.cve__CosmeticElectiveSurgeryExclusion__C = value;
    }

    /**
     * Gets the value of the cve__CostOfLivingAdjustmentDefined__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CostOfLivingAdjustmentDefined__C() {
        return cve__CostOfLivingAdjustmentDefined__C;
    }

    /**
     * Sets the value of the cve__CostOfLivingAdjustmentDefined__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CostOfLivingAdjustmentDefined__C(String value) {
        this.cve__CostOfLivingAdjustmentDefined__C = value;
    }

    /**
     * Gets the value of the cve__CostOfLivingAdjustment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__CostOfLivingAdjustment__C() {
        return cve__CostOfLivingAdjustment__C;
    }

    /**
     * Sets the value of the cve__CostOfLivingAdjustment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__CostOfLivingAdjustment__C(Boolean value) {
        this.cve__CostOfLivingAdjustment__C = value;
    }

    /**
     * Gets the value of the cve__CoverageAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CoverageAmount__C() {
        return cve__CoverageAmount__C;
    }

    /**
     * Sets the value of the cve__CoverageAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CoverageAmount__C(Double value) {
        this.cve__CoverageAmount__C = value;
    }

    /**
     * Gets the value of the cve__CoverageAnnualSalaryMultiple__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CoverageAnnualSalaryMultiple__C() {
        return cve__CoverageAnnualSalaryMultiple__C;
    }

    /**
     * Sets the value of the cve__CoverageAnnualSalaryMultiple__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CoverageAnnualSalaryMultiple__C(Double value) {
        this.cve__CoverageAnnualSalaryMultiple__C = value;
    }

    /**
     * Gets the value of the cve__CoverageBenefitMultiple__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CoverageBenefitMultiple__C() {
        return cve__CoverageBenefitMultiple__C;
    }

    /**
     * Sets the value of the cve__CoverageBenefitMultiple__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CoverageBenefitMultiple__C(Double value) {
        this.cve__CoverageBenefitMultiple__C = value;
    }

    /**
     * Gets the value of the cve__CoverageRoundingMode__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CoverageRoundingMode__C() {
        return cve__CoverageRoundingMode__C;
    }

    /**
     * Sets the value of the cve__CoverageRoundingMode__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CoverageRoundingMode__C(String value) {
        this.cve__CoverageRoundingMode__C = value;
    }

    /**
     * Gets the value of the cve__CoverageRoundingPrecision__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CoverageRoundingPrecision__C() {
        return cve__CoverageRoundingPrecision__C;
    }

    /**
     * Sets the value of the cve__CoverageRoundingPrecision__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CoverageRoundingPrecision__C(Double value) {
        this.cve__CoverageRoundingPrecision__C = value;
    }

    /**
     * Gets the value of the cve__CoverageType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__CoverageType__C() {
        return cve__CoverageType__C;
    }

    /**
     * Sets the value of the cve__CoverageType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__CoverageType__C(String value) {
        this.cve__CoverageType__C = value;
    }

    /**
     * Gets the value of the cve__Coverages__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__Coverages__R() {
        return cve__Coverages__R;
    }

    /**
     * Sets the value of the cve__Coverages__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__Coverages__R(QueryResultType value) {
        this.cve__Coverages__R = value;
    }

    /**
     * Gets the value of the cve__CriminalActivityExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__CriminalActivityExclusion__C() {
        return cve__CriminalActivityExclusion__C;
    }

    /**
     * Sets the value of the cve__CriminalActivityExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__CriminalActivityExclusion__C(Boolean value) {
        this.cve__CriminalActivityExclusion__C = value;
    }

    /**
     * Gets the value of the cve__CriticalBurnAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CriticalBurnAmountMaximum__C() {
        return cve__CriticalBurnAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__CriticalBurnAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CriticalBurnAmountMaximum__C(Double value) {
        this.cve__CriticalBurnAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__CriticalBurnAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CriticalBurnAmountMinimum__C() {
        return cve__CriticalBurnAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__CriticalBurnAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CriticalBurnAmountMinimum__C(Double value) {
        this.cve__CriticalBurnAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__CriticalBurnPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__CriticalBurnPercentageMaximum__C() {
        return cve__CriticalBurnPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__CriticalBurnPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__CriticalBurnPercentageMaximum__C(Double value) {
        this.cve__CriticalBurnPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__CriticalBurn__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__CriticalBurn__C() {
        return cve__CriticalBurn__C;
    }

    /**
     * Sets the value of the cve__CriticalBurn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__CriticalBurn__C(Boolean value) {
        this.cve__CriticalBurn__C = value;
    }

    /**
     * Gets the value of the cve__DailyCoverageAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DailyCoverageAmount__C() {
        return cve__DailyCoverageAmount__C;
    }

    /**
     * Sets the value of the cve__DailyCoverageAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DailyCoverageAmount__C(Double value) {
        this.cve__DailyCoverageAmount__C = value;
    }

    /**
     * Gets the value of the cve__DayCareAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DayCareAmountMaximum__C() {
        return cve__DayCareAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__DayCareAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DayCareAmountMaximum__C(Double value) {
        this.cve__DayCareAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__DayCareAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DayCareAmountMinimum__C() {
        return cve__DayCareAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__DayCareAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DayCareAmountMinimum__C(Double value) {
        this.cve__DayCareAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__DayCarePercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DayCarePercentageMaximum__C() {
        return cve__DayCarePercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__DayCarePercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DayCarePercentageMaximum__C(Double value) {
        this.cve__DayCarePercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__DayCare__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DayCare__C() {
        return cve__DayCare__C;
    }

    /**
     * Sets the value of the cve__DayCare__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DayCare__C(Boolean value) {
        this.cve__DayCare__C = value;
    }

    /**
     * Gets the value of the cve__DefinitionOfDisabilityDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DefinitionOfDisabilityDays__C() {
        return cve__DefinitionOfDisabilityDays__C;
    }

    /**
     * Sets the value of the cve__DefinitionOfDisabilityDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DefinitionOfDisabilityDays__C(Double value) {
        this.cve__DefinitionOfDisabilityDays__C = value;
    }

    /**
     * Gets the value of the cve__DefinitionOfDisabilityPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DefinitionOfDisabilityPeriod__C() {
        return cve__DefinitionOfDisabilityPeriod__C;
    }

    /**
     * Sets the value of the cve__DefinitionOfDisabilityPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DefinitionOfDisabilityPeriod__C(Double value) {
        this.cve__DefinitionOfDisabilityPeriod__C = value;
    }

    /**
     * Gets the value of the cve__DefinitionOfDisabilityUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DefinitionOfDisabilityUnits__C() {
        return cve__DefinitionOfDisabilityUnits__C;
    }

    /**
     * Sets the value of the cve__DefinitionOfDisabilityUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DefinitionOfDisabilityUnits__C(String value) {
        this.cve__DefinitionOfDisabilityUnits__C = value;
    }

    /**
     * Gets the value of the cve__DefinitionOfDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DefinitionOfDisability__C() {
        return cve__DefinitionOfDisability__C;
    }

    /**
     * Sets the value of the cve__DefinitionOfDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DefinitionOfDisability__C(String value) {
        this.cve__DefinitionOfDisability__C = value;
    }

    /**
     * Gets the value of the cve__DefinitionOfEarnings__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DefinitionOfEarnings__C() {
        return cve__DefinitionOfEarnings__C;
    }

    /**
     * Sets the value of the cve__DefinitionOfEarnings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DefinitionOfEarnings__C(String value) {
        this.cve__DefinitionOfEarnings__C = value;
    }

    /**
     * Gets the value of the cve__DependentConversion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DependentConversion__C() {
        return cve__DependentConversion__C;
    }

    /**
     * Sets the value of the cve__DependentConversion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DependentConversion__C(Boolean value) {
        this.cve__DependentConversion__C = value;
    }

    /**
     * Gets the value of the cve__DependentCoverage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DependentCoverage__C() {
        return cve__DependentCoverage__C;
    }

    /**
     * Sets the value of the cve__DependentCoverage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DependentCoverage__C(Boolean value) {
        this.cve__DependentCoverage__C = value;
    }

    /**
     * Gets the value of the cve__DependentPortable__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DependentPortable__C() {
        return cve__DependentPortable__C;
    }

    /**
     * Sets the value of the cve__DependentPortable__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DependentPortable__C(Boolean value) {
        this.cve__DependentPortable__C = value;
    }

    /**
     * Gets the value of the cve__DomesticPartner__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DomesticPartner__C() {
        return cve__DomesticPartner__C;
    }

    /**
     * Sets the value of the cve__DomesticPartner__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DomesticPartner__C(Boolean value) {
        this.cve__DomesticPartner__C = value;
    }

    /**
     * Gets the value of the cve__DoubleIndemnityCommonCarrierAmtMax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DoubleIndemnityCommonCarrierAmtMax__C() {
        return cve__DoubleIndemnityCommonCarrierAmtMax__C;
    }

    /**
     * Sets the value of the cve__DoubleIndemnityCommonCarrierAmtMax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DoubleIndemnityCommonCarrierAmtMax__C(Double value) {
        this.cve__DoubleIndemnityCommonCarrierAmtMax__C = value;
    }

    /**
     * Gets the value of the cve__DoubleIndemnityCommonCarrierAmtMin__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DoubleIndemnityCommonCarrierAmtMin__C() {
        return cve__DoubleIndemnityCommonCarrierAmtMin__C;
    }

    /**
     * Sets the value of the cve__DoubleIndemnityCommonCarrierAmtMin__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DoubleIndemnityCommonCarrierAmtMin__C(Double value) {
        this.cve__DoubleIndemnityCommonCarrierAmtMin__C = value;
    }

    /**
     * Gets the value of the cve__DoubleIndemnityCommonCarrierPctMax__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DoubleIndemnityCommonCarrierPctMax__C() {
        return cve__DoubleIndemnityCommonCarrierPctMax__C;
    }

    /**
     * Sets the value of the cve__DoubleIndemnityCommonCarrierPctMax__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DoubleIndemnityCommonCarrierPctMax__C(Double value) {
        this.cve__DoubleIndemnityCommonCarrierPctMax__C = value;
    }

    /**
     * Gets the value of the cve__DoubleIndemnityCommonCarrier__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DoubleIndemnityCommonCarrier__C() {
        return cve__DoubleIndemnityCommonCarrier__C;
    }

    /**
     * Sets the value of the cve__DoubleIndemnityCommonCarrier__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DoubleIndemnityCommonCarrier__C(Boolean value) {
        this.cve__DoubleIndemnityCommonCarrier__C = value;
    }

    /**
     * Gets the value of the cve__DrugAndAlcoholAbuseLimitationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DrugAndAlcoholAbuseLimitationPeriod__C() {
        return cve__DrugAndAlcoholAbuseLimitationPeriod__C;
    }

    /**
     * Sets the value of the cve__DrugAndAlcoholAbuseLimitationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DrugAndAlcoholAbuseLimitationPeriod__C(String value) {
        this.cve__DrugAndAlcoholAbuseLimitationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__DrugAndAlcoholAbuseLimitation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DrugAndAlcoholAbuseLimitation__C() {
        return cve__DrugAndAlcoholAbuseLimitation__C;
    }

    /**
     * Sets the value of the cve__DrugAndAlcoholAbuseLimitation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DrugAndAlcoholAbuseLimitation__C(Boolean value) {
        this.cve__DrugAndAlcoholAbuseLimitation__C = value;
    }

    /**
     * Gets the value of the cve__DrugAndAlcoholExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__DrugAndAlcoholExclusion__C() {
        return cve__DrugAndAlcoholExclusion__C;
    }

    /**
     * Sets the value of the cve__DrugAndAlcoholExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__DrugAndAlcoholExclusion__C(Boolean value) {
        this.cve__DrugAndAlcoholExclusion__C = value;
    }

    /**
     * Gets the value of the cve__DurationOfBenefitsDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DurationOfBenefitsDays__C() {
        return cve__DurationOfBenefitsDays__C;
    }

    /**
     * Sets the value of the cve__DurationOfBenefitsDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DurationOfBenefitsDays__C(Double value) {
        this.cve__DurationOfBenefitsDays__C = value;
    }

    /**
     * Gets the value of the cve__DurationOfBenefitsPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__DurationOfBenefitsPeriod__C() {
        return cve__DurationOfBenefitsPeriod__C;
    }

    /**
     * Sets the value of the cve__DurationOfBenefitsPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__DurationOfBenefitsPeriod__C(Double value) {
        this.cve__DurationOfBenefitsPeriod__C = value;
    }

    /**
     * Gets the value of the cve__DurationOfBenefitsUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DurationOfBenefitsUnits__C() {
        return cve__DurationOfBenefitsUnits__C;
    }

    /**
     * Sets the value of the cve__DurationOfBenefitsUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DurationOfBenefitsUnits__C(String value) {
        this.cve__DurationOfBenefitsUnits__C = value;
    }

    /**
     * Gets the value of the cve__DurationOfBenefits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__DurationOfBenefits__C() {
        return cve__DurationOfBenefits__C;
    }

    /**
     * Sets the value of the cve__DurationOfBenefits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__DurationOfBenefits__C(String value) {
        this.cve__DurationOfBenefits__C = value;
    }

    /**
     * Gets the value of the cve__Effective__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Effective__C() {
        return cve__Effective__C;
    }

    /**
     * Sets the value of the cve__Effective__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Effective__C(XMLGregorianCalendar value) {
        this.cve__Effective__C = value;
    }

    /**
     * Gets the value of the cve__EitherHandOrFootAndSightInOneEye__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EitherHandOrFootAndSightInOneEye__C() {
        return cve__EitherHandOrFootAndSightInOneEye__C;
    }

    /**
     * Sets the value of the cve__EitherHandOrFootAndSightInOneEye__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EitherHandOrFootAndSightInOneEye__C(Double value) {
        this.cve__EitherHandOrFootAndSightInOneEye__C = value;
    }

    /**
     * Gets the value of the cve__EliminationDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EliminationDays__C() {
        return cve__EliminationDays__C;
    }

    /**
     * Sets the value of the cve__EliminationDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EliminationDays__C(Double value) {
        this.cve__EliminationDays__C = value;
    }

    /**
     * Gets the value of the cve__EliminationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EliminationPeriod__C() {
        return cve__EliminationPeriod__C;
    }

    /**
     * Sets the value of the cve__EliminationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EliminationPeriod__C(Double value) {
        this.cve__EliminationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__EliminationUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EliminationUnits__C() {
        return cve__EliminationUnits__C;
    }

    /**
     * Sets the value of the cve__EliminationUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EliminationUnits__C(String value) {
        this.cve__EliminationUnits__C = value;
    }

    /**
     * Gets the value of the cve__EmployeeContributionPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployeeContributionPercentage__C() {
        return cve__EmployeeContributionPercentage__C;
    }

    /**
     * Sets the value of the cve__EmployeeContributionPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployeeContributionPercentage__C(Double value) {
        this.cve__EmployeeContributionPercentage__C = value;
    }

    /**
     * Gets the value of the cve__EmployerContributionPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmployerContributionPercentage__C() {
        return cve__EmployerContributionPercentage__C;
    }

    /**
     * Sets the value of the cve__EmployerContributionPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmployerContributionPercentage__C(Double value) {
        this.cve__EmployerContributionPercentage__C = value;
    }

    /**
     * Gets the value of the cve__EmploymentClassification__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EmploymentClassification__C() {
        return cve__EmploymentClassification__C;
    }

    /**
     * Sets the value of the cve__EmploymentClassification__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EmploymentClassification__C(String value) {
        this.cve__EmploymentClassification__C = value;
    }

    /**
     * Gets the value of the cve__EmploymentTimeDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmploymentTimeDays__C() {
        return cve__EmploymentTimeDays__C;
    }

    /**
     * Sets the value of the cve__EmploymentTimeDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmploymentTimeDays__C(Double value) {
        this.cve__EmploymentTimeDays__C = value;
    }

    /**
     * Gets the value of the cve__EmploymentTimePeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__EmploymentTimePeriod__C() {
        return cve__EmploymentTimePeriod__C;
    }

    /**
     * Sets the value of the cve__EmploymentTimePeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__EmploymentTimePeriod__C(Double value) {
        this.cve__EmploymentTimePeriod__C = value;
    }

    /**
     * Gets the value of the cve__EmploymentTimeUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__EmploymentTimeUnits__C() {
        return cve__EmploymentTimeUnits__C;
    }

    /**
     * Sets the value of the cve__EmploymentTimeUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__EmploymentTimeUnits__C(String value) {
        this.cve__EmploymentTimeUnits__C = value;
    }

    /**
     * Gets the value of the cve__EvidenceOfInsurabilityRequired__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__EvidenceOfInsurabilityRequired__C() {
        return cve__EvidenceOfInsurabilityRequired__C;
    }

    /**
     * Sets the value of the cve__EvidenceOfInsurabilityRequired__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__EvidenceOfInsurabilityRequired__C(Boolean value) {
        this.cve__EvidenceOfInsurabilityRequired__C = value;
    }

    /**
     * Gets the value of the cve__ExcludeFromIntake__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ExcludeFromIntake__C() {
        return cve__ExcludeFromIntake__C;
    }

    /**
     * Sets the value of the cve__ExcludeFromIntake__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ExcludeFromIntake__C(Boolean value) {
        this.cve__ExcludeFromIntake__C = value;
    }

    /**
     * Gets the value of the cve__Expiration__C property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCve__Expiration__C() {
        return cve__Expiration__C;
    }

    /**
     * Sets the value of the cve__Expiration__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCve__Expiration__C(XMLGregorianCalendar value) {
        this.cve__Expiration__C = value;
    }

    /**
     * Gets the value of the cve__FeloniousAssaultAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__FeloniousAssaultAmountMaximum__C() {
        return cve__FeloniousAssaultAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__FeloniousAssaultAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__FeloniousAssaultAmountMaximum__C(Double value) {
        this.cve__FeloniousAssaultAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__FeloniousAssaultAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__FeloniousAssaultAmountMinimum__C() {
        return cve__FeloniousAssaultAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__FeloniousAssaultAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__FeloniousAssaultAmountMinimum__C(Double value) {
        this.cve__FeloniousAssaultAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__FeloniousAssaultPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__FeloniousAssaultPercentageMaximum__C() {
        return cve__FeloniousAssaultPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__FeloniousAssaultPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__FeloniousAssaultPercentageMaximum__C(Double value) {
        this.cve__FeloniousAssaultPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__FeloniousAssault__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__FeloniousAssault__C() {
        return cve__FeloniousAssault__C;
    }

    /**
     * Sets the value of the cve__FeloniousAssault__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__FeloniousAssault__C(Boolean value) {
        this.cve__FeloniousAssault__C = value;
    }

    /**
     * Gets the value of the cve__FelonyExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__FelonyExclusion__C() {
        return cve__FelonyExclusion__C;
    }

    /**
     * Sets the value of the cve__FelonyExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__FelonyExclusion__C(Boolean value) {
        this.cve__FelonyExclusion__C = value;
    }

    /**
     * Gets the value of the cve__FicaMatching__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__FicaMatching__C() {
        return cve__FicaMatching__C;
    }

    /**
     * Sets the value of the cve__FicaMatching__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__FicaMatching__C(Boolean value) {
        this.cve__FicaMatching__C = value;
    }

    /**
     * Gets the value of the cve__FirstDayHospitalization__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__FirstDayHospitalization__C() {
        return cve__FirstDayHospitalization__C;
    }

    /**
     * Sets the value of the cve__FirstDayHospitalization__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__FirstDayHospitalization__C(Boolean value) {
        this.cve__FirstDayHospitalization__C = value;
    }

    /**
     * Gets the value of the cve__GroupClass__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__GroupClass__C() {
        return cve__GroupClass__C;
    }

    /**
     * Sets the value of the cve__GroupClass__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__GroupClass__C(String value) {
        this.cve__GroupClass__C = value;
    }

    /**
     * Gets the value of the cve__GroupDivision__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__GroupDivision__C() {
        return cve__GroupDivision__C;
    }

    /**
     * Sets the value of the cve__GroupDivision__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__GroupDivision__C(String value) {
        this.cve__GroupDivision__C = value;
    }

    /**
     * Gets the value of the cve__GuaranteedIssueAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__GuaranteedIssueAmount__C() {
        return cve__GuaranteedIssueAmount__C;
    }

    /**
     * Sets the value of the cve__GuaranteedIssueAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__GuaranteedIssueAmount__C(Double value) {
        this.cve__GuaranteedIssueAmount__C = value;
    }

    /**
     * Gets the value of the cve__HealthInsurancePaymentPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HealthInsurancePaymentPercentage__C() {
        return cve__HealthInsurancePaymentPercentage__C;
    }

    /**
     * Sets the value of the cve__HealthInsurancePaymentPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HealthInsurancePaymentPercentage__C(Double value) {
        this.cve__HealthInsurancePaymentPercentage__C = value;
    }

    /**
     * Gets the value of the cve__HealthInsurancePayment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HealthInsurancePayment__C() {
        return cve__HealthInsurancePayment__C;
    }

    /**
     * Sets the value of the cve__HealthInsurancePayment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HealthInsurancePayment__C(Boolean value) {
        this.cve__HealthInsurancePayment__C = value;
    }

    /**
     * Gets the value of the cve__Hemiplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Hemiplegia__C() {
        return cve__Hemiplegia__C;
    }

    /**
     * Sets the value of the cve__Hemiplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Hemiplegia__C(Double value) {
        this.cve__Hemiplegia__C = value;
    }

    /**
     * Gets the value of the cve__HighRiskActivityExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HighRiskActivityExclusion__C() {
        return cve__HighRiskActivityExclusion__C;
    }

    /**
     * Sets the value of the cve__HighRiskActivityExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HighRiskActivityExclusion__C(Boolean value) {
        this.cve__HighRiskActivityExclusion__C = value;
    }

    /**
     * Gets the value of the cve__HigherEducationAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HigherEducationAmountMinimum__C() {
        return cve__HigherEducationAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__HigherEducationAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HigherEducationAmountMinimum__C(Double value) {
        this.cve__HigherEducationAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__HigherEducationBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__HigherEducationBenefit__C() {
        return cve__HigherEducationBenefit__C;
    }

    /**
     * Sets the value of the cve__HigherEducationBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__HigherEducationBenefit__C(Boolean value) {
        this.cve__HigherEducationBenefit__C = value;
    }

    /**
     * Gets the value of the cve__HigherEducationMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HigherEducationMaximum__C() {
        return cve__HigherEducationMaximum__C;
    }

    /**
     * Sets the value of the cve__HigherEducationMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HigherEducationMaximum__C(Double value) {
        this.cve__HigherEducationMaximum__C = value;
    }

    /**
     * Gets the value of the cve__HigherEducationPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HigherEducationPercentageMaximum__C() {
        return cve__HigherEducationPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__HigherEducationPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HigherEducationPercentageMaximum__C(Double value) {
        this.cve__HigherEducationPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__HoursRequired__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__HoursRequired__C() {
        return cve__HoursRequired__C;
    }

    /**
     * Sets the value of the cve__HoursRequired__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__HoursRequired__C(Double value) {
        this.cve__HoursRequired__C = value;
    }

    /**
     * Gets the value of the cve__IllegalOccupationExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__IllegalOccupationExclusion__C() {
        return cve__IllegalOccupationExclusion__C;
    }

    /**
     * Sets the value of the cve__IllegalOccupationExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__IllegalOccupationExclusion__C(Boolean value) {
        this.cve__IllegalOccupationExclusion__C = value;
    }

    /**
     * Gets the value of the cve__IllnessDurationOfBenefits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IllnessDurationOfBenefits__C() {
        return cve__IllnessDurationOfBenefits__C;
    }

    /**
     * Sets the value of the cve__IllnessDurationOfBenefits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IllnessDurationOfBenefits__C(String value) {
        this.cve__IllnessDurationOfBenefits__C = value;
    }

    /**
     * Gets the value of the cve__IllnessEliminationDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__IllnessEliminationDays__C() {
        return cve__IllnessEliminationDays__C;
    }

    /**
     * Sets the value of the cve__IllnessEliminationDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__IllnessEliminationDays__C(Double value) {
        this.cve__IllnessEliminationDays__C = value;
    }

    /**
     * Gets the value of the cve__IllnessEliminationPeriodUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IllnessEliminationPeriodUnits__C() {
        return cve__IllnessEliminationPeriodUnits__C;
    }

    /**
     * Sets the value of the cve__IllnessEliminationPeriodUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IllnessEliminationPeriodUnits__C(String value) {
        this.cve__IllnessEliminationPeriodUnits__C = value;
    }

    /**
     * Gets the value of the cve__IllnessEliminationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__IllnessEliminationPeriod__C() {
        return cve__IllnessEliminationPeriod__C;
    }

    /**
     * Sets the value of the cve__IllnessEliminationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__IllnessEliminationPeriod__C(Double value) {
        this.cve__IllnessEliminationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__IllnessEliminationUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__IllnessEliminationUnits__C() {
        return cve__IllnessEliminationUnits__C;
    }

    /**
     * Sets the value of the cve__IllnessEliminationUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__IllnessEliminationUnits__C(String value) {
        this.cve__IllnessEliminationUnits__C = value;
    }

    /**
     * Gets the value of the cve__IllnessExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__IllnessExclusion__C() {
        return cve__IllnessExclusion__C;
    }

    /**
     * Sets the value of the cve__IllnessExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__IllnessExclusion__C(Boolean value) {
        this.cve__IllnessExclusion__C = value;
    }

    /**
     * Gets the value of the cve__LifeBenefitPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LifeBenefitPercentage__C() {
        return cve__LifeBenefitPercentage__C;
    }

    /**
     * Sets the value of the cve__LifeBenefitPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LifeBenefitPercentage__C(Double value) {
        this.cve__LifeBenefitPercentage__C = value;
    }

    /**
     * Gets the value of the cve__LineOfBusiness__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LineOfBusiness__C() {
        return cve__LineOfBusiness__C;
    }

    /**
     * Sets the value of the cve__LineOfBusiness__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LineOfBusiness__C(String value) {
        this.cve__LineOfBusiness__C = value;
    }

    /**
     * Gets the value of the cve__LoanAvailability__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__LoanAvailability__C() {
        return cve__LoanAvailability__C;
    }

    /**
     * Sets the value of the cve__LoanAvailability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__LoanAvailability__C(Boolean value) {
        this.cve__LoanAvailability__C = value;
    }

    /**
     * Gets the value of the cve__LoanInterestRate__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LoanInterestRate__C() {
        return cve__LoanInterestRate__C;
    }

    /**
     * Sets the value of the cve__LoanInterestRate__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LoanInterestRate__C(Double value) {
        this.cve__LoanInterestRate__C = value;
    }

    /**
     * Gets the value of the cve__LtdDurationOfBenefitsSchedule__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LtdDurationOfBenefitsSchedule__C() {
        return cve__LtdDurationOfBenefitsSchedule__C;
    }

    /**
     * Sets the value of the cve__LtdDurationOfBenefitsSchedule__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LtdDurationOfBenefitsSchedule__C(String value) {
        this.cve__LtdDurationOfBenefitsSchedule__C = value;
    }

    /**
     * Gets the value of the cve__LtdDurationOfBenefits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LtdDurationOfBenefits__C() {
        return cve__LtdDurationOfBenefits__C;
    }

    /**
     * Sets the value of the cve__LtdDurationOfBenefits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LtdDurationOfBenefits__C(String value) {
        this.cve__LtdDurationOfBenefits__C = value;
    }

    /**
     * Gets the value of the cve__LtdEliminationDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LtdEliminationDays__C() {
        return cve__LtdEliminationDays__C;
    }

    /**
     * Sets the value of the cve__LtdEliminationDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LtdEliminationDays__C(Double value) {
        this.cve__LtdEliminationDays__C = value;
    }

    /**
     * Gets the value of the cve__LtdEliminationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__LtdEliminationPeriod__C() {
        return cve__LtdEliminationPeriod__C;
    }

    /**
     * Sets the value of the cve__LtdEliminationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__LtdEliminationPeriod__C(Double value) {
        this.cve__LtdEliminationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__LtdEliminationUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__LtdEliminationUnits__C() {
        return cve__LtdEliminationUnits__C;
    }

    /**
     * Sets the value of the cve__LtdEliminationUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__LtdEliminationUnits__C(String value) {
        this.cve__LtdEliminationUnits__C = value;
    }

    /**
     * Gets the value of the cve__MaximumAcceleratedAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumAcceleratedAmount__C() {
        return cve__MaximumAcceleratedAmount__C;
    }

    /**
     * Sets the value of the cve__MaximumAcceleratedAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumAcceleratedAmount__C(Double value) {
        this.cve__MaximumAcceleratedAmount__C = value;
    }

    /**
     * Gets the value of the cve__MaximumAcceleratedPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumAcceleratedPercentage__C() {
        return cve__MaximumAcceleratedPercentage__C;
    }

    /**
     * Sets the value of the cve__MaximumAcceleratedPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumAcceleratedPercentage__C(Double value) {
        this.cve__MaximumAcceleratedPercentage__C = value;
    }

    /**
     * Gets the value of the cve__MaximumAmountAppliedType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MaximumAmountAppliedType__C() {
        return cve__MaximumAmountAppliedType__C;
    }

    /**
     * Sets the value of the cve__MaximumAmountAppliedType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MaximumAmountAppliedType__C(String value) {
        this.cve__MaximumAmountAppliedType__C = value;
    }

    /**
     * Gets the value of the cve__MaximumAnnualEarnings__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumAnnualEarnings__C() {
        return cve__MaximumAnnualEarnings__C;
    }

    /**
     * Sets the value of the cve__MaximumAnnualEarnings__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumAnnualEarnings__C(Double value) {
        this.cve__MaximumAnnualEarnings__C = value;
    }

    /**
     * Gets the value of the cve__MaximumBenefitPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MaximumBenefitPeriod__C() {
        return cve__MaximumBenefitPeriod__C;
    }

    /**
     * Sets the value of the cve__MaximumBenefitPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MaximumBenefitPeriod__C(String value) {
        this.cve__MaximumBenefitPeriod__C = value;
    }

    /**
     * Gets the value of the cve__MaximumBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumBenefit__C() {
        return cve__MaximumBenefit__C;
    }

    /**
     * Sets the value of the cve__MaximumBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumBenefit__C(Double value) {
        this.cve__MaximumBenefit__C = value;
    }

    /**
     * Gets the value of the cve__MaximumCoverageAge__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumCoverageAge__C() {
        return cve__MaximumCoverageAge__C;
    }

    /**
     * Sets the value of the cve__MaximumCoverageAge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumCoverageAge__C(Double value) {
        this.cve__MaximumCoverageAge__C = value;
    }

    /**
     * Gets the value of the cve__MaximumCoverageAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumCoverageAmount__C() {
        return cve__MaximumCoverageAmount__C;
    }

    /**
     * Sets the value of the cve__MaximumCoverageAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumCoverageAmount__C(Double value) {
        this.cve__MaximumCoverageAmount__C = value;
    }

    /**
     * Gets the value of the cve__MaximumCoverageAnnualSalaryMultiple__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumCoverageAnnualSalaryMultiple__C() {
        return cve__MaximumCoverageAnnualSalaryMultiple__C;
    }

    /**
     * Sets the value of the cve__MaximumCoverageAnnualSalaryMultiple__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumCoverageAnnualSalaryMultiple__C(Double value) {
        this.cve__MaximumCoverageAnnualSalaryMultiple__C = value;
    }

    /**
     * Gets the value of the cve__MaximumCoveragePeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MaximumCoveragePeriod__C() {
        return cve__MaximumCoveragePeriod__C;
    }

    /**
     * Sets the value of the cve__MaximumCoveragePeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MaximumCoveragePeriod__C(Double value) {
        this.cve__MaximumCoveragePeriod__C = value;
    }

    /**
     * Gets the value of the cve__MaximumCoverageType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MaximumCoverageType__C() {
        return cve__MaximumCoverageType__C;
    }

    /**
     * Sets the value of the cve__MaximumCoverageType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MaximumCoverageType__C(String value) {
        this.cve__MaximumCoverageType__C = value;
    }

    /**
     * Gets the value of the cve__MaximumCoverageUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MaximumCoverageUnits__C() {
        return cve__MaximumCoverageUnits__C;
    }

    /**
     * Sets the value of the cve__MaximumCoverageUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MaximumCoverageUnits__C(String value) {
        this.cve__MaximumCoverageUnits__C = value;
    }

    /**
     * Gets the value of the cve__MentalNervousLimitationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MentalNervousLimitationPeriod__C() {
        return cve__MentalNervousLimitationPeriod__C;
    }

    /**
     * Sets the value of the cve__MentalNervousLimitationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MentalNervousLimitationPeriod__C(String value) {
        this.cve__MentalNervousLimitationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__MentalNervousLimitation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__MentalNervousLimitation__C() {
        return cve__MentalNervousLimitation__C;
    }

    /**
     * Sets the value of the cve__MentalNervousLimitation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__MentalNervousLimitation__C(Boolean value) {
        this.cve__MentalNervousLimitation__C = value;
    }

    /**
     * Gets the value of the cve__MinimumAcceleratedAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumAcceleratedAmount__C() {
        return cve__MinimumAcceleratedAmount__C;
    }

    /**
     * Sets the value of the cve__MinimumAcceleratedAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumAcceleratedAmount__C(Double value) {
        this.cve__MinimumAcceleratedAmount__C = value;
    }

    /**
     * Gets the value of the cve__MinimumAcceleratedPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumAcceleratedPercentage__C() {
        return cve__MinimumAcceleratedPercentage__C;
    }

    /**
     * Sets the value of the cve__MinimumAcceleratedPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumAcceleratedPercentage__C(Double value) {
        this.cve__MinimumAcceleratedPercentage__C = value;
    }

    /**
     * Gets the value of the cve__MinimumAmountAppliedType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MinimumAmountAppliedType__C() {
        return cve__MinimumAmountAppliedType__C;
    }

    /**
     * Sets the value of the cve__MinimumAmountAppliedType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MinimumAmountAppliedType__C(String value) {
        this.cve__MinimumAmountAppliedType__C = value;
    }

    /**
     * Gets the value of the cve__MinimumAmountNotAppliedToDependents__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__MinimumAmountNotAppliedToDependents__C() {
        return cve__MinimumAmountNotAppliedToDependents__C;
    }

    /**
     * Sets the value of the cve__MinimumAmountNotAppliedToDependents__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__MinimumAmountNotAppliedToDependents__C(Boolean value) {
        this.cve__MinimumAmountNotAppliedToDependents__C = value;
    }

    /**
     * Gets the value of the cve__MinimumBenefitPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumBenefitPercentage__C() {
        return cve__MinimumBenefitPercentage__C;
    }

    /**
     * Sets the value of the cve__MinimumBenefitPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumBenefitPercentage__C(Double value) {
        this.cve__MinimumBenefitPercentage__C = value;
    }

    /**
     * Gets the value of the cve__MinimumBenefitPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MinimumBenefitPeriod__C() {
        return cve__MinimumBenefitPeriod__C;
    }

    /**
     * Sets the value of the cve__MinimumBenefitPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MinimumBenefitPeriod__C(String value) {
        this.cve__MinimumBenefitPeriod__C = value;
    }

    /**
     * Gets the value of the cve__MinimumBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumBenefit__C() {
        return cve__MinimumBenefit__C;
    }

    /**
     * Sets the value of the cve__MinimumBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumBenefit__C(Double value) {
        this.cve__MinimumBenefit__C = value;
    }

    /**
     * Gets the value of the cve__MinimumCoverageAge__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumCoverageAge__C() {
        return cve__MinimumCoverageAge__C;
    }

    /**
     * Sets the value of the cve__MinimumCoverageAge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumCoverageAge__C(Double value) {
        this.cve__MinimumCoverageAge__C = value;
    }

    /**
     * Gets the value of the cve__MinimumCoverageAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumCoverageAmount__C() {
        return cve__MinimumCoverageAmount__C;
    }

    /**
     * Sets the value of the cve__MinimumCoverageAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumCoverageAmount__C(Double value) {
        this.cve__MinimumCoverageAmount__C = value;
    }

    /**
     * Gets the value of the cve__MinimumCoverageAnnualSalaryMultiple__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumCoverageAnnualSalaryMultiple__C() {
        return cve__MinimumCoverageAnnualSalaryMultiple__C;
    }

    /**
     * Sets the value of the cve__MinimumCoverageAnnualSalaryMultiple__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumCoverageAnnualSalaryMultiple__C(Double value) {
        this.cve__MinimumCoverageAnnualSalaryMultiple__C = value;
    }

    /**
     * Gets the value of the cve__MinimumCoveragePeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__MinimumCoveragePeriod__C() {
        return cve__MinimumCoveragePeriod__C;
    }

    /**
     * Sets the value of the cve__MinimumCoveragePeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__MinimumCoveragePeriod__C(Double value) {
        this.cve__MinimumCoveragePeriod__C = value;
    }

    /**
     * Gets the value of the cve__MinimumCoverageType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MinimumCoverageType__C() {
        return cve__MinimumCoverageType__C;
    }

    /**
     * Sets the value of the cve__MinimumCoverageType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MinimumCoverageType__C(String value) {
        this.cve__MinimumCoverageType__C = value;
    }

    /**
     * Gets the value of the cve__MinimumCoverageUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__MinimumCoverageUnits__C() {
        return cve__MinimumCoverageUnits__C;
    }

    /**
     * Sets the value of the cve__MinimumCoverageUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__MinimumCoverageUnits__C(String value) {
        this.cve__MinimumCoverageUnits__C = value;
    }

    /**
     * Gets the value of the cve__NoFaultInsurance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__NoFaultInsurance__C() {
        return cve__NoFaultInsurance__C;
    }

    /**
     * Sets the value of the cve__NoFaultInsurance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__NoFaultInsurance__C(Boolean value) {
        this.cve__NoFaultInsurance__C = value;
    }

    /**
     * Gets the value of the cve__NormalDentalCareExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__NormalDentalCareExclusion__C() {
        return cve__NormalDentalCareExclusion__C;
    }

    /**
     * Sets the value of the cve__NormalDentalCareExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__NormalDentalCareExclusion__C(Boolean value) {
        this.cve__NormalDentalCareExclusion__C = value;
    }

    /**
     * Gets the value of the cve__OneFootPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OneFootPercentage__C() {
        return cve__OneFootPercentage__C;
    }

    /**
     * Sets the value of the cve__OneFootPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OneFootPercentage__C(Double value) {
        this.cve__OneFootPercentage__C = value;
    }

    /**
     * Gets the value of the cve__OneHandAndOneFoot__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OneHandAndOneFoot__C() {
        return cve__OneHandAndOneFoot__C;
    }

    /**
     * Sets the value of the cve__OneHandAndOneFoot__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OneHandAndOneFoot__C(Double value) {
        this.cve__OneHandAndOneFoot__C = value;
    }

    /**
     * Gets the value of the cve__OneHandPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__OneHandPercentage__C() {
        return cve__OneHandPercentage__C;
    }

    /**
     * Sets the value of the cve__OneHandPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__OneHandPercentage__C(Double value) {
        this.cve__OneHandPercentage__C = value;
    }

    /**
     * Gets the value of the cve__OtherExclusions__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__OtherExclusions__C() {
        return cve__OtherExclusions__C;
    }

    /**
     * Sets the value of the cve__OtherExclusions__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__OtherExclusions__C(String value) {
        this.cve__OtherExclusions__C = value;
    }

    /**
     * Gets the value of the cve__OtherOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OtherOffset__C() {
        return cve__OtherOffset__C;
    }

    /**
     * Sets the value of the cve__OtherOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OtherOffset__C(Boolean value) {
        this.cve__OtherOffset__C = value;
    }

    /**
     * Gets the value of the cve__OuiDuiExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__OuiDuiExclusion__C() {
        return cve__OuiDuiExclusion__C;
    }

    /**
     * Sets the value of the cve__OuiDuiExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__OuiDuiExclusion__C(Boolean value) {
        this.cve__OuiDuiExclusion__C = value;
    }

    /**
     * Gets the value of the cve__Paraplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Paraplegia__C() {
        return cve__Paraplegia__C;
    }

    /**
     * Sets the value of the cve__Paraplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Paraplegia__C(Double value) {
        this.cve__Paraplegia__C = value;
    }

    /**
     * Gets the value of the cve__ParticipationValue__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ParticipationValue__C() {
        return cve__ParticipationValue__C;
    }

    /**
     * Sets the value of the cve__ParticipationValue__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ParticipationValue__C(Double value) {
        this.cve__ParticipationValue__C = value;
    }

    /**
     * Gets the value of the cve__Participation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Participation__C() {
        return cve__Participation__C;
    }

    /**
     * Sets the value of the cve__Participation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Participation__C(Boolean value) {
        this.cve__Participation__C = value;
    }

    /**
     * Gets the value of the cve__PensionContributionPaymentPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PensionContributionPaymentPercentage__C() {
        return cve__PensionContributionPaymentPercentage__C;
    }

    /**
     * Sets the value of the cve__PensionContributionPaymentPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PensionContributionPaymentPercentage__C(Double value) {
        this.cve__PensionContributionPaymentPercentage__C = value;
    }

    /**
     * Gets the value of the cve__PensionContributionPayment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PensionContributionPayment__C() {
        return cve__PensionContributionPayment__C;
    }

    /**
     * Sets the value of the cve__PensionContributionPayment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PensionContributionPayment__C(Boolean value) {
        this.cve__PensionContributionPayment__C = value;
    }

    /**
     * Gets the value of the cve__PensionDisabilityOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PensionDisabilityOffset__C() {
        return cve__PensionDisabilityOffset__C;
    }

    /**
     * Sets the value of the cve__PensionDisabilityOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PensionDisabilityOffset__C(Boolean value) {
        this.cve__PensionDisabilityOffset__C = value;
    }

    /**
     * Gets the value of the cve__PensionRetirementOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PensionRetirementOffset__C() {
        return cve__PensionRetirementOffset__C;
    }

    /**
     * Sets the value of the cve__PensionRetirementOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PensionRetirementOffset__C(Boolean value) {
        this.cve__PensionRetirementOffset__C = value;
    }

    /**
     * Gets the value of the cve__PolicyBenefits__R property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCve__PolicyBenefits__R() {
        return cve__PolicyBenefits__R;
    }

    /**
     * Sets the value of the cve__PolicyBenefits__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCve__PolicyBenefits__R(QueryResultType value) {
        this.cve__PolicyBenefits__R = value;
    }

    /**
     * Gets the value of the cve__PreexistingConditionLimitationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PreexistingConditionLimitationPeriod__C() {
        return cve__PreexistingConditionLimitationPeriod__C;
    }

    /**
     * Sets the value of the cve__PreexistingConditionLimitationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PreexistingConditionLimitationPeriod__C(String value) {
        this.cve__PreexistingConditionLimitationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__PreexistingConditionLimitation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PreexistingConditionLimitation__C() {
        return cve__PreexistingConditionLimitation__C;
    }

    /**
     * Sets the value of the cve__PreexistingConditionLimitation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PreexistingConditionLimitation__C(Boolean value) {
        this.cve__PreexistingConditionLimitation__C = value;
    }

    /**
     * Gets the value of the cve__PreexistingConditionProvision__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PreexistingConditionProvision__C() {
        return cve__PreexistingConditionProvision__C;
    }

    /**
     * Sets the value of the cve__PreexistingConditionProvision__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PreexistingConditionProvision__C(String value) {
        this.cve__PreexistingConditionProvision__C = value;
    }

    /**
     * Gets the value of the cve__PreexistingCondition__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PreexistingCondition__C() {
        return cve__PreexistingCondition__C;
    }

    /**
     * Sets the value of the cve__PreexistingCondition__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PreexistingCondition__C(Boolean value) {
        this.cve__PreexistingCondition__C = value;
    }

    /**
     * Gets the value of the cve__PregnancyChildbirthExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__PregnancyChildbirthExclusion__C() {
        return cve__PregnancyChildbirthExclusion__C;
    }

    /**
     * Sets the value of the cve__PregnancyChildbirthExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__PregnancyChildbirthExclusion__C(Boolean value) {
        this.cve__PregnancyChildbirthExclusion__C = value;
    }

    /**
     * Gets the value of the cve__PregnancyDurationOfBenefits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PregnancyDurationOfBenefits__C() {
        return cve__PregnancyDurationOfBenefits__C;
    }

    /**
     * Sets the value of the cve__PregnancyDurationOfBenefits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PregnancyDurationOfBenefits__C(String value) {
        this.cve__PregnancyDurationOfBenefits__C = value;
    }

    /**
     * Gets the value of the cve__PregnancyEliminationDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PregnancyEliminationDays__C() {
        return cve__PregnancyEliminationDays__C;
    }

    /**
     * Sets the value of the cve__PregnancyEliminationDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PregnancyEliminationDays__C(Double value) {
        this.cve__PregnancyEliminationDays__C = value;
    }

    /**
     * Gets the value of the cve__PregnancyEliminationPeriodUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PregnancyEliminationPeriodUnits__C() {
        return cve__PregnancyEliminationPeriodUnits__C;
    }

    /**
     * Sets the value of the cve__PregnancyEliminationPeriodUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PregnancyEliminationPeriodUnits__C(String value) {
        this.cve__PregnancyEliminationPeriodUnits__C = value;
    }

    /**
     * Gets the value of the cve__PregnancyEliminationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__PregnancyEliminationPeriod__C() {
        return cve__PregnancyEliminationPeriod__C;
    }

    /**
     * Sets the value of the cve__PregnancyEliminationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__PregnancyEliminationPeriod__C(Double value) {
        this.cve__PregnancyEliminationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__PregnancyEliminationUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__PregnancyEliminationUnits__C() {
        return cve__PregnancyEliminationUnits__C;
    }

    /**
     * Sets the value of the cve__PregnancyEliminationUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__PregnancyEliminationUnits__C(String value) {
        this.cve__PregnancyEliminationUnits__C = value;
    }

    /**
     * Gets the value of the cve__Product__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Product__C() {
        return cve__Product__C;
    }

    /**
     * Sets the value of the cve__Product__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Product__C(String value) {
        this.cve__Product__C = value;
    }

    /**
     * Gets the value of the cve__Product__R property.
     * 
     * @return
     *     possible object is
     *     {@link Cve__Product__C }
     *     
     */
    public Cve__Product__C getCve__Product__R() {
        return cve__Product__R;
    }

    /**
     * Sets the value of the cve__Product__R property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cve__Product__C }
     *     
     */
    public void setCve__Product__R(Cve__Product__C value) {
        this.cve__Product__R = value;
    }

    /**
     * Gets the value of the cve__Quadriplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Quadriplegia__C() {
        return cve__Quadriplegia__C;
    }

    /**
     * Sets the value of the cve__Quadriplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Quadriplegia__C(Double value) {
        this.cve__Quadriplegia__C = value;
    }

    /**
     * Gets the value of the cve__RailroadRetirementOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__RailroadRetirementOffset__C() {
        return cve__RailroadRetirementOffset__C;
    }

    /**
     * Sets the value of the cve__RailroadRetirementOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__RailroadRetirementOffset__C(Boolean value) {
        this.cve__RailroadRetirementOffset__C = value;
    }

    /**
     * Gets the value of the cve__RecordTypeLabel__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RecordTypeLabel__C() {
        return cve__RecordTypeLabel__C;
    }

    /**
     * Sets the value of the cve__RecordTypeLabel__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RecordTypeLabel__C(String value) {
        this.cve__RecordTypeLabel__C = value;
    }

    /**
     * Gets the value of the cve__RecordTypeName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RecordTypeName__C() {
        return cve__RecordTypeName__C;
    }

    /**
     * Sets the value of the cve__RecordTypeName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RecordTypeName__C(String value) {
        this.cve__RecordTypeName__C = value;
    }

    /**
     * Gets the value of the cve__RecurrentDisabilityCondition__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RecurrentDisabilityCondition__C() {
        return cve__RecurrentDisabilityCondition__C;
    }

    /**
     * Sets the value of the cve__RecurrentDisabilityCondition__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RecurrentDisabilityCondition__C(String value) {
        this.cve__RecurrentDisabilityCondition__C = value;
    }

    /**
     * Gets the value of the cve__RecurrentDisabilityOccupation__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RecurrentDisabilityOccupation__C() {
        return cve__RecurrentDisabilityOccupation__C;
    }

    /**
     * Sets the value of the cve__RecurrentDisabilityOccupation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RecurrentDisabilityOccupation__C(String value) {
        this.cve__RecurrentDisabilityOccupation__C = value;
    }

    /**
     * Gets the value of the cve__RecurrentDisabilityPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RecurrentDisabilityPeriod__C() {
        return cve__RecurrentDisabilityPeriod__C;
    }

    /**
     * Sets the value of the cve__RecurrentDisabilityPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RecurrentDisabilityPeriod__C(Double value) {
        this.cve__RecurrentDisabilityPeriod__C = value;
    }

    /**
     * Gets the value of the cve__RecurrentDisabilityUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__RecurrentDisabilityUnits__C() {
        return cve__RecurrentDisabilityUnits__C;
    }

    /**
     * Sets the value of the cve__RecurrentDisabilityUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__RecurrentDisabilityUnits__C(String value) {
        this.cve__RecurrentDisabilityUnits__C = value;
    }

    /**
     * Gets the value of the cve__RehabilitationAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RehabilitationAmountMaximum__C() {
        return cve__RehabilitationAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__RehabilitationAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RehabilitationAmountMaximum__C(Double value) {
        this.cve__RehabilitationAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__RehabilitationAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RehabilitationAmountMinimum__C() {
        return cve__RehabilitationAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__RehabilitationAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RehabilitationAmountMinimum__C(Double value) {
        this.cve__RehabilitationAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__RehabilitationPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RehabilitationPercentageMaximum__C() {
        return cve__RehabilitationPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__RehabilitationPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RehabilitationPercentageMaximum__C(Double value) {
        this.cve__RehabilitationPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__Rehabilitation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Rehabilitation__C() {
        return cve__Rehabilitation__C;
    }

    /**
     * Sets the value of the cve__Rehabilitation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Rehabilitation__C(Boolean value) {
        this.cve__Rehabilitation__C = value;
    }

    /**
     * Gets the value of the cve__ReinsuranceAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ReinsuranceAmount__C() {
        return cve__ReinsuranceAmount__C;
    }

    /**
     * Sets the value of the cve__ReinsuranceAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ReinsuranceAmount__C(Double value) {
        this.cve__ReinsuranceAmount__C = value;
    }

    /**
     * Gets the value of the cve__ReinsuranceType__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ReinsuranceType__C() {
        return cve__ReinsuranceType__C;
    }

    /**
     * Sets the value of the cve__ReinsuranceType__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ReinsuranceType__C(String value) {
        this.cve__ReinsuranceType__C = value;
    }

    /**
     * Gets the value of the cve__Reinsured__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Reinsured__C() {
        return cve__Reinsured__C;
    }

    /**
     * Sets the value of the cve__Reinsured__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Reinsured__C(Boolean value) {
        this.cve__Reinsured__C = value;
    }

    /**
     * Gets the value of the cve__ReinsurerName__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__ReinsurerName__C() {
        return cve__ReinsurerName__C;
    }

    /**
     * Sets the value of the cve__ReinsurerName__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__ReinsurerName__C(String value) {
        this.cve__ReinsurerName__C = value;
    }

    /**
     * Gets the value of the cve__RepatriationAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RepatriationAmountMaximum__C() {
        return cve__RepatriationAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__RepatriationAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RepatriationAmountMaximum__C(Double value) {
        this.cve__RepatriationAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__RepatriationAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RepatriationAmountMinimum__C() {
        return cve__RepatriationAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__RepatriationAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RepatriationAmountMinimum__C(Double value) {
        this.cve__RepatriationAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__RepatriationPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__RepatriationPercentageMaximum__C() {
        return cve__RepatriationPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__RepatriationPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__RepatriationPercentageMaximum__C(Double value) {
        this.cve__RepatriationPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__Repatriation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Repatriation__C() {
        return cve__Repatriation__C;
    }

    /**
     * Sets the value of the cve__Repatriation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Repatriation__C(Boolean value) {
        this.cve__Repatriation__C = value;
    }

    /**
     * Gets the value of the cve__ReturnToWorkEarningsOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ReturnToWorkEarningsOffset__C() {
        return cve__ReturnToWorkEarningsOffset__C;
    }

    /**
     * Sets the value of the cve__ReturnToWorkEarningsOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ReturnToWorkEarningsOffset__C(Boolean value) {
        this.cve__ReturnToWorkEarningsOffset__C = value;
    }

    /**
     * Gets the value of the cve__SeatBeltAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SeatBeltAmountMaximum__C() {
        return cve__SeatBeltAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__SeatBeltAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SeatBeltAmountMaximum__C(Double value) {
        this.cve__SeatBeltAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__SeatBeltAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SeatBeltAmountMinimum__C() {
        return cve__SeatBeltAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__SeatBeltAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SeatBeltAmountMinimum__C(Double value) {
        this.cve__SeatBeltAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__SeatBeltFlatAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SeatBeltFlatAmount__C() {
        return cve__SeatBeltFlatAmount__C;
    }

    /**
     * Sets the value of the cve__SeatBeltFlatAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SeatBeltFlatAmount__C(Double value) {
        this.cve__SeatBeltFlatAmount__C = value;
    }

    /**
     * Gets the value of the cve__SeatBeltPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SeatBeltPercentage__C() {
        return cve__SeatBeltPercentage__C;
    }

    /**
     * Sets the value of the cve__SeatBeltPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SeatBeltPercentage__C(Double value) {
        this.cve__SeatBeltPercentage__C = value;
    }

    /**
     * Gets the value of the cve__SelfInflictedExclusionPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SelfInflictedExclusionPeriod__C() {
        return cve__SelfInflictedExclusionPeriod__C;
    }

    /**
     * Sets the value of the cve__SelfInflictedExclusionPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SelfInflictedExclusionPeriod__C(Double value) {
        this.cve__SelfInflictedExclusionPeriod__C = value;
    }

    /**
     * Gets the value of the cve__SelfInflictedExclusionUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SelfInflictedExclusionUnits__C() {
        return cve__SelfInflictedExclusionUnits__C;
    }

    /**
     * Sets the value of the cve__SelfInflictedExclusionUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SelfInflictedExclusionUnits__C(String value) {
        this.cve__SelfInflictedExclusionUnits__C = value;
    }

    /**
     * Gets the value of the cve__SelfInflictedExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SelfInflictedExclusion__C() {
        return cve__SelfInflictedExclusion__C;
    }

    /**
     * Sets the value of the cve__SelfInflictedExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SelfInflictedExclusion__C(Boolean value) {
        this.cve__SelfInflictedExclusion__C = value;
    }

    /**
     * Gets the value of the cve__SicknessExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SicknessExclusion__C() {
        return cve__SicknessExclusion__C;
    }

    /**
     * Sets the value of the cve__SicknessExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SicknessExclusion__C(Boolean value) {
        this.cve__SicknessExclusion__C = value;
    }

    /**
     * Gets the value of the cve__SightInBothEyes__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SightInBothEyes__C() {
        return cve__SightInBothEyes__C;
    }

    /**
     * Sets the value of the cve__SightInBothEyes__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SightInBothEyes__C(Double value) {
        this.cve__SightInBothEyes__C = value;
    }

    /**
     * Gets the value of the cve__SightInOneEyePercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SightInOneEyePercentage__C() {
        return cve__SightInOneEyePercentage__C;
    }

    /**
     * Sets the value of the cve__SightInOneEyePercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SightInOneEyePercentage__C(Double value) {
        this.cve__SightInOneEyePercentage__C = value;
    }

    /**
     * Gets the value of the cve__SocialSecurityDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SocialSecurityDisability__C() {
        return cve__SocialSecurityDisability__C;
    }

    /**
     * Sets the value of the cve__SocialSecurityDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SocialSecurityDisability__C(String value) {
        this.cve__SocialSecurityDisability__C = value;
    }

    /**
     * Gets the value of the cve__SocialSecurityRetirementOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SocialSecurityRetirementOffset__C() {
        return cve__SocialSecurityRetirementOffset__C;
    }

    /**
     * Sets the value of the cve__SocialSecurityRetirementOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SocialSecurityRetirementOffset__C(Boolean value) {
        this.cve__SocialSecurityRetirementOffset__C = value;
    }

    /**
     * Gets the value of the cve__SpeechAndHearingInBothEars__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SpeechAndHearingInBothEars__C() {
        return cve__SpeechAndHearingInBothEars__C;
    }

    /**
     * Sets the value of the cve__SpeechAndHearingInBothEars__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SpeechAndHearingInBothEars__C(Double value) {
        this.cve__SpeechAndHearingInBothEars__C = value;
    }

    /**
     * Gets the value of the cve__SpeechOrHearingInBothEars__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SpeechOrHearingInBothEars__C() {
        return cve__SpeechOrHearingInBothEars__C;
    }

    /**
     * Sets the value of the cve__SpeechOrHearingInBothEars__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SpeechOrHearingInBothEars__C(Double value) {
        this.cve__SpeechOrHearingInBothEars__C = value;
    }

    /**
     * Gets the value of the cve__SpouseAmount__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SpouseAmount__C() {
        return cve__SpouseAmount__C;
    }

    /**
     * Sets the value of the cve__SpouseAmount__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SpouseAmount__C(Double value) {
        this.cve__SpouseAmount__C = value;
    }

    /**
     * Gets the value of the cve__SpouseEducationAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SpouseEducationAmountMaximum__C() {
        return cve__SpouseEducationAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__SpouseEducationAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SpouseEducationAmountMaximum__C(Double value) {
        this.cve__SpouseEducationAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__SpouseEducationAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SpouseEducationAmountMinimum__C() {
        return cve__SpouseEducationAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__SpouseEducationAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SpouseEducationAmountMinimum__C(Double value) {
        this.cve__SpouseEducationAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__SpouseEducationPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SpouseEducationPercentageMaximum__C() {
        return cve__SpouseEducationPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__SpouseEducationPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SpouseEducationPercentageMaximum__C(Double value) {
        this.cve__SpouseEducationPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__SpouseEducation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SpouseEducation__C() {
        return cve__SpouseEducation__C;
    }

    /**
     * Sets the value of the cve__SpouseEducation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SpouseEducation__C(Boolean value) {
        this.cve__SpouseEducation__C = value;
    }

    /**
     * Gets the value of the cve__StateDisability__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__StateDisability__C() {
        return cve__StateDisability__C;
    }

    /**
     * Sets the value of the cve__StateDisability__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__StateDisability__C(Boolean value) {
        this.cve__StateDisability__C = value;
    }

    /**
     * Gets the value of the cve__StatesOfferedIn__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StatesOfferedIn__C() {
        return cve__StatesOfferedIn__C;
    }

    /**
     * Sets the value of the cve__StatesOfferedIn__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StatesOfferedIn__C(String value) {
        this.cve__StatesOfferedIn__C = value;
    }

    /**
     * Gets the value of the cve__Status__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__Status__C() {
        return cve__Status__C;
    }

    /**
     * Sets the value of the cve__Status__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__Status__C(String value) {
        this.cve__Status__C = value;
    }

    /**
     * Gets the value of the cve__StrikeContinuationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__StrikeContinuationPeriod__C() {
        return cve__StrikeContinuationPeriod__C;
    }

    /**
     * Sets the value of the cve__StrikeContinuationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__StrikeContinuationPeriod__C(Double value) {
        this.cve__StrikeContinuationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__StrikeContinuationUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__StrikeContinuationUnits__C() {
        return cve__StrikeContinuationUnits__C;
    }

    /**
     * Sets the value of the cve__StrikeContinuationUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__StrikeContinuationUnits__C(String value) {
        this.cve__StrikeContinuationUnits__C = value;
    }

    /**
     * Gets the value of the cve__SubjectiveConditionLimitationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SubjectiveConditionLimitationPeriod__C() {
        return cve__SubjectiveConditionLimitationPeriod__C;
    }

    /**
     * Sets the value of the cve__SubjectiveConditionLimitationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SubjectiveConditionLimitationPeriod__C(String value) {
        this.cve__SubjectiveConditionLimitationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__SubjectiveConditionLimitation__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SubjectiveConditionLimitation__C() {
        return cve__SubjectiveConditionLimitation__C;
    }

    /**
     * Sets the value of the cve__SubjectiveConditionLimitation__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SubjectiveConditionLimitation__C(Boolean value) {
        this.cve__SubjectiveConditionLimitation__C = value;
    }

    /**
     * Gets the value of the cve__SuicideExclusionPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__SuicideExclusionPeriod__C() {
        return cve__SuicideExclusionPeriod__C;
    }

    /**
     * Sets the value of the cve__SuicideExclusionPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__SuicideExclusionPeriod__C(Double value) {
        this.cve__SuicideExclusionPeriod__C = value;
    }

    /**
     * Gets the value of the cve__SuicideExclusionUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__SuicideExclusionUnits__C() {
        return cve__SuicideExclusionUnits__C;
    }

    /**
     * Sets the value of the cve__SuicideExclusionUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__SuicideExclusionUnits__C(String value) {
        this.cve__SuicideExclusionUnits__C = value;
    }

    /**
     * Gets the value of the cve__SuicideExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SuicideExclusion__C() {
        return cve__SuicideExclusion__C;
    }

    /**
     * Sets the value of the cve__SuicideExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SuicideExclusion__C(Boolean value) {
        this.cve__SuicideExclusion__C = value;
    }

    /**
     * Gets the value of the cve__SurvivorIncomeBenefit__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__SurvivorIncomeBenefit__C() {
        return cve__SurvivorIncomeBenefit__C;
    }

    /**
     * Sets the value of the cve__SurvivorIncomeBenefit__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__SurvivorIncomeBenefit__C(Boolean value) {
        this.cve__SurvivorIncomeBenefit__C = value;
    }

    /**
     * Gets the value of the cve__TherapeuticCounselingAmountMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TherapeuticCounselingAmountMaximum__C() {
        return cve__TherapeuticCounselingAmountMaximum__C;
    }

    /**
     * Sets the value of the cve__TherapeuticCounselingAmountMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TherapeuticCounselingAmountMaximum__C(Double value) {
        this.cve__TherapeuticCounselingAmountMaximum__C = value;
    }

    /**
     * Gets the value of the cve__TherapeuticCounselingAmountMinimum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TherapeuticCounselingAmountMinimum__C() {
        return cve__TherapeuticCounselingAmountMinimum__C;
    }

    /**
     * Sets the value of the cve__TherapeuticCounselingAmountMinimum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TherapeuticCounselingAmountMinimum__C(Double value) {
        this.cve__TherapeuticCounselingAmountMinimum__C = value;
    }

    /**
     * Gets the value of the cve__TherapeuticCounselingPercentageMaximum__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TherapeuticCounselingPercentageMaximum__C() {
        return cve__TherapeuticCounselingPercentageMaximum__C;
    }

    /**
     * Sets the value of the cve__TherapeuticCounselingPercentageMaximum__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TherapeuticCounselingPercentageMaximum__C(Double value) {
        this.cve__TherapeuticCounselingPercentageMaximum__C = value;
    }

    /**
     * Gets the value of the cve__TherapeuticCounseling__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__TherapeuticCounseling__C() {
        return cve__TherapeuticCounseling__C;
    }

    /**
     * Sets the value of the cve__TherapeuticCounseling__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__TherapeuticCounseling__C(Boolean value) {
        this.cve__TherapeuticCounseling__C = value;
    }

    /**
     * Gets the value of the cve__ThirdPartyLiabilityOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__ThirdPartyLiabilityOffset__C() {
        return cve__ThirdPartyLiabilityOffset__C;
    }

    /**
     * Sets the value of the cve__ThirdPartyLiabilityOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__ThirdPartyLiabilityOffset__C(Boolean value) {
        this.cve__ThirdPartyLiabilityOffset__C = value;
    }

    /**
     * Gets the value of the cve__ThumbAndIndexFingerOfEitherHand__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__ThumbAndIndexFingerOfEitherHand__C() {
        return cve__ThumbAndIndexFingerOfEitherHand__C;
    }

    /**
     * Sets the value of the cve__ThumbAndIndexFingerOfEitherHand__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__ThumbAndIndexFingerOfEitherHand__C(Double value) {
        this.cve__ThumbAndIndexFingerOfEitherHand__C = value;
    }

    /**
     * Gets the value of the cve__TravelAssistance__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__TravelAssistance__C() {
        return cve__TravelAssistance__C;
    }

    /**
     * Sets the value of the cve__TravelAssistance__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__TravelAssistance__C(Boolean value) {
        this.cve__TravelAssistance__C = value;
    }

    /**
     * Gets the value of the cve__Triplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Triplegia__C() {
        return cve__Triplegia__C;
    }

    /**
     * Sets the value of the cve__Triplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Triplegia__C(Double value) {
        this.cve__Triplegia__C = value;
    }

    /**
     * Gets the value of the cve__TwoOrMoreLossesPercentage__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__TwoOrMoreLossesPercentage__C() {
        return cve__TwoOrMoreLossesPercentage__C;
    }

    /**
     * Sets the value of the cve__TwoOrMoreLossesPercentage__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__TwoOrMoreLossesPercentage__C(Double value) {
        this.cve__TwoOrMoreLossesPercentage__C = value;
    }

    /**
     * Gets the value of the cve__Unemployment__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__Unemployment__C() {
        return cve__Unemployment__C;
    }

    /**
     * Sets the value of the cve__Unemployment__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__Unemployment__C(Boolean value) {
        this.cve__Unemployment__C = value;
    }

    /**
     * Gets the value of the cve__Uniplegia__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__Uniplegia__C() {
        return cve__Uniplegia__C;
    }

    /**
     * Sets the value of the cve__Uniplegia__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__Uniplegia__C(Double value) {
        this.cve__Uniplegia__C = value;
    }

    /**
     * Gets the value of the cve__VoluntarilyTakingPoisonExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__VoluntarilyTakingPoisonExclusion__C() {
        return cve__VoluntarilyTakingPoisonExclusion__C;
    }

    /**
     * Sets the value of the cve__VoluntarilyTakingPoisonExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__VoluntarilyTakingPoisonExclusion__C(Boolean value) {
        this.cve__VoluntarilyTakingPoisonExclusion__C = value;
    }

    /**
     * Gets the value of the cve__WaitingDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WaitingDays__C() {
        return cve__WaitingDays__C;
    }

    /**
     * Sets the value of the cve__WaitingDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WaitingDays__C(Double value) {
        this.cve__WaitingDays__C = value;
    }

    /**
     * Gets the value of the cve__WaitingFirstOfTheMonth__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__WaitingFirstOfTheMonth__C() {
        return cve__WaitingFirstOfTheMonth__C;
    }

    /**
     * Sets the value of the cve__WaitingFirstOfTheMonth__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__WaitingFirstOfTheMonth__C(Boolean value) {
        this.cve__WaitingFirstOfTheMonth__C = value;
    }

    /**
     * Gets the value of the cve__WaitingPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WaitingPeriod__C() {
        return cve__WaitingPeriod__C;
    }

    /**
     * Sets the value of the cve__WaitingPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WaitingPeriod__C(Double value) {
        this.cve__WaitingPeriod__C = value;
    }

    /**
     * Gets the value of the cve__WaitingUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WaitingUnits__C() {
        return cve__WaitingUnits__C;
    }

    /**
     * Sets the value of the cve__WaitingUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WaitingUnits__C(String value) {
        this.cve__WaitingUnits__C = value;
    }

    /**
     * Gets the value of the cve__WarExclusion__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__WarExclusion__C() {
        return cve__WarExclusion__C;
    }

    /**
     * Sets the value of the cve__WarExclusion__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__WarExclusion__C(Boolean value) {
        this.cve__WarExclusion__C = value;
    }

    /**
     * Gets the value of the cve__WopDependentsContinuationPeriod__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WopDependentsContinuationPeriod__C() {
        return cve__WopDependentsContinuationPeriod__C;
    }

    /**
     * Sets the value of the cve__WopDependentsContinuationPeriod__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WopDependentsContinuationPeriod__C(Double value) {
        this.cve__WopDependentsContinuationPeriod__C = value;
    }

    /**
     * Gets the value of the cve__WopDependentsContinuationUnits__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WopDependentsContinuationUnits__C() {
        return cve__WopDependentsContinuationUnits__C;
    }

    /**
     * Sets the value of the cve__WopDependentsContinuationUnits__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WopDependentsContinuationUnits__C(String value) {
        this.cve__WopDependentsContinuationUnits__C = value;
    }

    /**
     * Gets the value of the cve__WopDependents__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__WopDependents__C() {
        return cve__WopDependents__C;
    }

    /**
     * Sets the value of the cve__WopDependents__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__WopDependents__C(Boolean value) {
        this.cve__WopDependents__C = value;
    }

    /**
     * Gets the value of the cve__WopReductionAge__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WopReductionAge__C() {
        return cve__WopReductionAge__C;
    }

    /**
     * Sets the value of the cve__WopReductionAge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WopReductionAge__C(Double value) {
        this.cve__WopReductionAge__C = value;
    }

    /**
     * Gets the value of the cve__WopTerminationAge__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WopTerminationAge__C() {
        return cve__WopTerminationAge__C;
    }

    /**
     * Sets the value of the cve__WopTerminationAge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WopTerminationAge__C(Double value) {
        this.cve__WopTerminationAge__C = value;
    }

    /**
     * Gets the value of the cve__WopTotalDisabilityBeginMaximumAge__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WopTotalDisabilityBeginMaximumAge__C() {
        return cve__WopTotalDisabilityBeginMaximumAge__C;
    }

    /**
     * Sets the value of the cve__WopTotalDisabilityBeginMaximumAge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WopTotalDisabilityBeginMaximumAge__C(Double value) {
        this.cve__WopTotalDisabilityBeginMaximumAge__C = value;
    }

    /**
     * Gets the value of the cve__WopTotalDisabilityBeginMinimumAge__C property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCve__WopTotalDisabilityBeginMinimumAge__C() {
        return cve__WopTotalDisabilityBeginMinimumAge__C;
    }

    /**
     * Sets the value of the cve__WopTotalDisabilityBeginMinimumAge__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCve__WopTotalDisabilityBeginMinimumAge__C(Double value) {
        this.cve__WopTotalDisabilityBeginMinimumAge__C = value;
    }

    /**
     * Gets the value of the cve__WorkWeekDays__C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCve__WorkWeekDays__C() {
        return cve__WorkWeekDays__C;
    }

    /**
     * Sets the value of the cve__WorkWeekDays__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCve__WorkWeekDays__C(String value) {
        this.cve__WorkWeekDays__C = value;
    }

    /**
     * Gets the value of the cve__WorkersCompensationOffset__C property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCve__WorkersCompensationOffset__C() {
        return cve__WorkersCompensationOffset__C;
    }

    /**
     * Sets the value of the cve__WorkersCompensationOffset__C property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCve__WorkersCompensationOffset__C(Boolean value) {
        this.cve__WorkersCompensationOffset__C = value;
    }

}
