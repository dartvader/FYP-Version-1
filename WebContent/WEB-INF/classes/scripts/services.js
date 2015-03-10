'use strict';
var fraudServices = angular.module('fraudServices', []);

var configForPost = {
    'headers': {
        'Content-Type': 'application/json',
        'Accept': 'application/json',
        'protocol':'https'
    }
};

var configForGet = {
    'headers': {
        'Accept': 'application/json',
        'protocol':'https'
    },
    cache: true
};

fraudServices.factory('SobObjectsService', function($http, $q){
	var factory = {};
	var objectsURL = "https://fraud-developer-edition.eu3.force.com/services/apexrest/v1/describe.json";

	factory.getSobObjectsDescription = function(){
		return Objects;
	};

	return factory;
});

fraudServices.factory('ConditionService', function($http, $q){
	var factory = {};
	
	factory.getStringComparison = function(){
		return stringComparisons;
	};

	factory.getNumericComparison = function(){
		return numericComparisons;
	};

	factory.getDateComparison = function(){
		return dateComparisons;
	};

	return factory;
});

fraudServices.factory('RulesServices', function($http, $q){
	var factory = {};
    
	factory.newRule = function(rule) {
		var postUrl = "http://localhost:8080/cvfraud-v1/rest/rules";
		var deferred = $q.defer();
		
		var promise = $http.post(postUrl, rule, configForPost).success(function(data) {
			// console.log(" Rule Creation was successful ");
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	factory.updateRuleConfiguration = function(rules) {
		var putUrl = "http://localhost:8080/cvfraud-v1/rest/rules";
		var deferred = $q.defer();
		
		var promise = $http.put(putUrl, rules, configForPost).success(function(data) {
			// console.log(" Rule Creation was successful ");
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	factory.getRules = function() {
		
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/rules";
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl, configForGet).success(function(data) {

			// console.log(" Get Rules " + JSON.stringify(data));
			
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	return factory;
});


fraudServices.factory('ExecutionServices', function($http, $q){
	var factory = {};
	
	factory.getExecutions = function() {
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/executions";
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl, configForGet).success(function(data) {
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	return factory;
});

fraudServices.factory('AlertServices', function($http, $q){
	var factory = {};
	
	factory.getAlerts = function() {
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/alerts";
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl, configForGet).success(function(data) {
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	return factory;
});


fraudServices.factory('PackageServices', function($http, $q){
	var factory = {};
	
	factory.getPackages = function() {
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/packages";
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl, configForGet).success(function(data) {
			
			console.log(">>>>> all packages ");
			
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});
		return deferred.promise;
	};
	
	factory.getPackageRules = function(packageId) {
		
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/packages/rules/" + packageId;
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl, configForGet).success(function(data) {
			
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});
		return deferred.promise;
	};
	
	factory.savePackage = function(newPackage) {
		var newPackage = newPackage;
		
		var postUrl = "http://localhost:8080/cvfraud-v1/rest/packages";
		var deferred = $q.defer();
		
		var promise = $http.post(postUrl, newPackage, configForPost).success(function(data) {
			
			deferred.resolve(data);
			
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});
		return deferred.promise;
	};
	
	factory.getAlerts = function() {
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/packages/alerts";
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl, configForGet).success(function(data) {
			// console.log("success " + JSON.stringify(data));
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	factory.executeRules= function(packageId) {
		console.log("execute rules");
		
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/packages/execute/" + packageId;
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl).success(function(data) {
			console.log("Executer rules " + data);
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	factory.loadCoreProduct= function() {
		console.log("Loading core product");
		
		var getUrl = "http://localhost:8080/cvfraud-v1/rest/packages/core";
		var deferred = $q.defer();
		
		var promise = $http.get(getUrl).success(function(data) {
			
			// console.log("Loading core product " + JSON.stringify(data));
			deferred.resolve(data);
		}).error(function(data, status, headers, config) {
			console.log("error " + status);
			console.log("error config " + JSON.stringify(config));
		});

		return deferred.promise;
	};
	
	return factory;
});


// No difference yet but defo to be when i come to flesh it out (Look at drools guvnor to handle this stuff)
var stringComparisons = [
{
	"name": "is equals to",
	"value": "=="
},
{
  "name": "is not equals to",
  "value": "!="
},
{
  "name": "is not null",
  "value": "!= null"
},
{
  "name": "is null",
  "value": "== null"
}];

var numericComparisons = [{
	"name": "Greater then",
	"value": ">",
},
{
	"name": "less then",
	"value": "<",
},
{
	"name": "Equals",
	"value": "==",
},
{
  "name": "is not equals to",
  "value": "!="
},
{
  "name": "is not null",
  "value": "!="
},
{
  "name": "is null",
  "value": "=="
},
{
  "name": "is less then or equal to",
  "value": "<="
},
{
  "name": "is greater then or equal to",
  "value": ">="
}];

var dateComparisons = [{
	"name": "Greater then",
	"value": ">",
},
{
	"name": "less then",
	"value": "<",
},
{
	"name": "Equals",
	"value": "==",
}];


var Objects = [
	{ "sobApi" : "cve__Claim__c",
    "sobFields" : [{ "api" : "cve__AllRequiredDocumentsReceived__c",
          "label" : "All Required Documents Received",
          "type" : "Date"
        },
        { "api" : "cve__AnticipatedClose__c",
          "label" : "Anticipated Close",
          "type" : "Date"
        },
        { "api" : "cve__BenefitSummary__c",
          "label" : "Benefit Summary",
          "type" : "TextArea"
        },
        { "api" : "cve__BenefitType__c",
          "label" : "Benefit Type",
          "type" : "String"
        },
        { "api" : "cve__ClaimantInsured__c",
          "label" : "Claimant/Insured",
          "type" : "Reference"
        },
        { "api" : "cve__ClaimantInsuredName__c",
          "label" : "Claimant/Insured Names",
          "type" : "String"
        },
        { "api" : "cve__ClaimantInsuredAccount__c",
          "label" : "Claimant/Insured Organization",
          "type" : "Reference"
        },
        { "api" : "cve__ClaimantInsuredAccountName__c",
          "label" : "Claimant/Insured Organization Names",
          "type" : "String"
        },
        { "api" : "Name",
          "label" : "Claim Number",
          "type" : "String"
        },
        { "api" : "CreatedById",
          "label" : "Created By ID",
          "type" : "Reference"
        },
        { "api" : "CreatedDate",
          "label" : "Created Date",
          "type" : "DateTime"
        },
        { "api" : "cve__DateOfDeath__c",
          "label" : "Date of Death",
          "type" : "Date"
        },
        { "api" : "cve__DateOfDiagnosis__c",
          "label" : "Date of Diagnosis",
          "type" : "Date"
        },
        { "api" : "cve__DateOfDisability__c",
          "label" : "Date of Disability",
          "type" : "Date"
        },
        { "api" : "cve__DateOfMaturityAnnuity__c",
          "label" : "Date of Maturity/Annuity",
          "type" : "Date"
        },
        { "api" : "cve__DateReceived__c",
          "label" : "Date Received",
          "type" : "Date"
        },
        { "api" : "IsDeleted",
          "label" : "Deleted",
          "type" : "Boolean"
        },
        { "api" : "cve__IncompleteDate__c",
          "label" : "Incomplete Date",
          "type" : "Date"
        },
        { "api" : "cve__IncurredBeforeTax__c",
          "label" : "Incurred Before Tax",
          "type" : "Double"
        },
        { "api" : "cve__IncurredLastCalculated__c",
          "label" : "Incurred Last Calculated",
          "type" : "DateTime"
        },
        { "api" : "cve__IncurredNet__c",
          "label" : "Incurred Net",
          "type" : "Double"
        },
        { "api" : "cve__InquiryPortalUrl__c",
          "label" : "Inquiry Portal URL",
          "type" : "String"
        },
        { "api" : "LastActivityDate",
          "label" : "Last Activity Date",
          "type" : "Date"
        },
        { "api" : "LastModifiedById",
          "label" : "Last Modified By ID",
          "type" : "Reference"
        },
        { "api" : "LastModifiedDate",
          "label" : "Last Modified Date",
          "type" : "DateTime"
        },
        { "api" : "LastReferencedDate",
          "label" : "Last Referenced Date",
          "type" : "DateTime"
        },
        { "api" : "LastViewedDate",
          "label" : "Last Viewed Date",
          "type" : "DateTime"
        },
        { "api" : "cve__LiabilityBeforeTax__c",
          "label" : "Liability Before Tax",
          "type" : "Double"
        },
        { "api" : "cve__LiabilityLastCalculated__c",
          "label" : "Liability Last Calculated",
          "type" : "DateTime"
        },
        { "api" : "cve__LiabilityNet__c",
          "label" : "Liability Net",
          "type" : "Double"
        },
        { "api" : "cve__OpaqueId__c",
          "label" : "Opaque Id",
          "type" : "String"
        },
        { "api" : "cve__OpaqueIdValidThrough__c",
          "label" : "Opaque Id Valid Through",
          "type" : "Date"
        },
        { "api" : "cve__OpenRequiredTaskCount__c",
          "label" : "Open Required Task Count",
          "type" : "Double"
        },
        { "api" : "cve__OpenTaskCount__c",
          "label" : "Open Task Count",
          "type" : "Double"
        },
        { "api" : "cve__OriginalName__c",
          "label" : "Original Claim Number",
          "type" : "String"
        },
        { "api" : "cve__OverpaymentBeforeTax__c",
          "label" : "Overpayment Before Tax",
          "type" : "Double"
        },
        { "api" : "cve__OverpaymentLastCalculated__c",
          "label" : "Overpayment Last Calculated",
          "type" : "DateTime"
        },
        { "api" : "cve__OverpaymentNet__c",
          "label" : "Overpayment Net",
          "type" : "Double"
        },
        { "api" : "OwnerId",
          "label" : "Owner ID",
          "type" : "Reference"
        },
        { "api" : "cve__PendingDate__c",
          "label" : "Pending Date",
          "type" : "Date"
        },
        { "api" : "cve__PerformanceGuarantee__c",
          "label" : "Performance Guarantee",
          "type" : "String"
        },
        { "api" : "cve__Policy__c",
          "label" : "Policy",
          "type" : "Reference"
        },
        { "api" : "cve__PolicyPremiumPaidThrough__c",
          "label" : "Policy Premium Paid Through",
          "type" : "Date"
        },
        { "api" : "cve__PolicyRelationship__c",
          "label" : "Policy Relationship",
          "type" : "Reference"
        },
        { "api" : "cve__PrecedingClaim__c",
          "label" : "Preceding Claim",
          "type" : "Reference"
        },
        { "api" : "cve__QuestionsLanguage__c",
          "label" : "Questions Language",
          "type" : "Picklist"
        },
        { "api" : "Id",
          "label" : "Record ID",
          "type" : "ID"
        },
        { "api" : "cve__Reopened__c",
          "label" : "Reopened",
          "type" : "Boolean"
        },
        { "api" : "cve__ReopenedDate__c",
          "label" : "Reopened Date",
          "type" : "DateTime"
        },
        { "api" : "cve__ReturnToWorkDate__c",
          "label" : "Return to Work Date",
          "type" : "Date"
        },
        { "api" : "cve__ReturnToWorkType__c",
          "label" : "Return to Work Type",
          "type" : "String"
        },
        { "api" : "cve__Status__c",
          "label" : "Status",
          "type" : "Picklist"
        },
        { "api" : "SystemModstamp",
          "label" : "System Modstamp",
          "type" : "DateTime"
        },
        { "api" : "cve__ToBeIncurredBeforeTax__c",
          "label" : "To Be Incurred Before Tax",
          "type" : "Double"
        },
        { "api" : "cve__ToBeIncurredLastCalculated__c",
          "label" : "To Be Incurred Last Calculated",
          "type" : "DateTime"
        },
        { "api" : "cve__ToBeIncurredNet__c",
          "label" : "To Be Incurred Net",
          "type" : "Double"
        },
        { "api" : "cve__TotalIncurredAsOf__c",
          "label" : "Total Incurred as of",
          "type" : "Date"
        },
        { "api" : "cve__TotalIncurred__c",
          "label" : "Total Incurred Before Taxes",
          "type" : "Double"
        }
      ],
    "sobLabel" : "Claim"
  },{
  	"sobApi" : "cve__Payment__c",
    "sobFields" : [ { "api" : "cve__AdjustedBenefitStartDateApplied__c",
          "label" : "Adjusted Benefit Start Date Applied",
          "type" : "Boolean"
        },
        { "api" : "cve__AdviceToPay__c",
          "label" : "Advice to Pay",
          "type" : "Boolean"
        },
        { "api" : "cve__BankAccountNumber__c",
          "label" : "Bank Account Number",
          "type" : "String"
        },
        { "api" : "cve__BankAccountType__c",
          "label" : "Bank Account Type",
          "type" : "Picklist"
        },
        { "api" : "cve__BankName__c",
          "label" : "Bank Name",
          "type" : "String"
        },
        { "api" : "cve__BankPhone__c",
          "label" : "Bank Phone",
          "type" : "Phone"
        },
        { "api" : "cve__BankRoutingNumber__c",
          "label" : "Bank Routing Number",
          "type" : "String"
        },
        { "api" : "cve__CheckOrEftNumber__c",
          "label" : "Check or EFT Number",
          "type" : "String"
        },
        { "api" : "cve__Claim__c",
          "label" : "Claim",
          "type" : "Reference"
        },
        { "api" : "cve__ConsolidatedPaymentStatus__c",
          "label" : "Consolidated Payment Status",
          "type" : "String"
        },
        { "api" : "CreatedById",
          "label" : "Created By ID",
          "type" : "Reference"
        },
        { "api" : "CreatedDate",
          "label" : "Created Date",
          "type" : "DateTime"
        },
        { "api" : "cve__Days__c",
          "label" : "Days",
          "type" : "Double"
        },
        { "api" : "IsDeleted",
          "label" : "Deleted",
          "type" : "Boolean"
        },
        { "api" : "cve__EmployerMatchingFica__c",
          "label" : "Employer Matching FICA",
          "type" : "Double"
        },
        { "api" : "cve__EmployerMatchingMedicare__c",
          "label" : "Employer Matching Medicare",
          "type" : "Double"
        },
        { "api" : "cve__FicaTaxableBenefitAmount__c",
          "label" : "FICA Taxable Benefit Amount",
          "type" : "Double"
        },
        { "api" : "cve__Issue__c",
          "label" : "Issue",
          "type" : "Date"
        },
        { "api" : "cve__IssueOverride__c",
          "label" : "Issue Override",
          "type" : "Date"
        },
        { "api" : "LastActivityDate",
          "label" : "Last Activity Date",
          "type" : "Date"
        },
        { "api" : "LastModifiedById",
          "label" : "Last Modified By ID",
          "type" : "Reference"
        },
        { "api" : "LastModifiedDate",
          "label" : "Last Modified Date",
          "type" : "DateTime"
        },
        { "api" : "LastReferencedDate",
          "label" : "Last Referenced Date",
          "type" : "DateTime"
        },
        { "api" : "LastViewedDate",
          "label" : "Last Viewed Date",
          "type" : "DateTime"
        },
        { "api" : "cve__MailingAddress__c",
          "label" : "Mailing Address",
          "type" : "String"
        },
        { "api" : "cve__MailingCity__c",
          "label" : "Mailing City",
          "type" : "String"
        },
        { "api" : "cve__MailingCountry__c",
          "label" : "Mailing Country",
          "type" : "String"
        },
        { "api" : "cve__MailingPostalCode__c",
          "label" : "Mailing Postal Code",
          "type" : "String"
        },
        { "api" : "cve__MailingState__c",
          "label" : "Mailing State",
          "type" : "String"
        },
        { "api" : "cve__MailingStreet__c",
          "label" : "Mailing Street",
          "type" : "TextArea"
        },
        { "api" : "cve__Net__c",
          "label" : "Net",
          "type" : "Double"
        },
        { "api" : "cve__NetAfterTaxes__c",
          "label" : "Net After Taxes",
          "type" : "Double"
        },
        { "api" : "cve__NetBeforeTaxes__c",
          "label" : "Net Before Taxes",
          "type" : "Double"
        },
        { "api" : "cve__NumberOfPaymentsConsolidated__c",
          "label" : "Number of Payments Consolidated",
          "type" : "Double"
        },
        { "api" : "cve__Account__c",
          "label" : "Organization",
          "type" : "Reference"
        },
        { "api" : "cve__OvernightDelivery__c",
          "label" : "Overnight Delivery",
          "type" : "Boolean"
        },
        { "api" : "cve__Paid__c",
          "label" : "Paid",
          "type" : "Boolean"
        },
        { "api" : "cve__Payable__c",
          "label" : "Payable",
          "type" : "Date"
        },
        { "api" : "cve__PayeeClaimRelationshipType__c",
          "label" : "Payee Claim Relationship Type",
          "type" : "String"
        },
        { "api" : "cve__PayeeName__c",
          "label" : "Payee Name",
          "type" : "String"
        },
        { "api" : "cve__PaymentMethod__c",
          "label" : "Payment Method",
          "type" : "Picklist"
        },
        { "api" : "Name",
          "label" : "Payment Name",
          "type" : "String"
        },
        { "api" : "cve__PaymentSpecification__c",
          "label" : "Payment Specification",
          "type" : "Reference"
        },
        { "api" : "cve__Contact__c",
          "label" : "Person",
          "type" : "Reference"
        },
        { "api" : "cve__Print__c",
          "label" : "Print",
          "type" : "Date"
        },
        { "api" : "Id",
          "label" : "Record ID",
          "type" : "ID"
        },
        { "api" : "RecordTypeId",
          "label" : "Record Type ID",
          "type" : "Reference"
        },
        { "api" : "cve__RecordTypeName__c",
          "label" : "Record Type Name",
          "type" : "String"
        },
        { "api" : "cve__Release__c",
          "label" : "Release",
          "type" : "Date"
        },
        { "api" : "cve__Start__c",
          "label" : "Start",
          "type" : "Date"
        },
        { "api" : "cve__Status__c",
          "label" : "Status",
          "type" : "Picklist"
        },
        { "api" : "cve__StopOrVoid__c",
          "label" : "Stop or Void",
          "type" : "Date"
        },
        { "api" : "SystemModstamp",
          "label" : "System Modstamp",
          "type" : "DateTime"
        },
        { "api" : "cve__Taxes__c",
          "label" : "Taxes",
          "type" : "Double"
        },
        { "api" : "cve__TaxIdNumber__c",
          "label" : "Tax ID Number",
          "type" : "String"
        },
        { "api" : "cve__Testing__c",
          "label" : "Testing",
          "type" : "String"
        },
        { "api" : "cve__Through__c",
          "label" : "Through",
          "type" : "Date"
        },
        { "api" : "cve__UnallocatedPayment__c",
          "label" : "Unallocated Payment",
          "type" : "Reference"
        },
        { "api" : "cve__WeekDays__c",
          "label" : "Week Days",
          "type" : "Double"
        }
      ],
    "sobLabel" : "Payment"
  }];


