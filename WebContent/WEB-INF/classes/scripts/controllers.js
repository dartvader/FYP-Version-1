'use strict';
var fraudControllers = angular.module('fraudControllers', ['ngRoute','ngDialog']);

// Controller for individual functionalities
fraudControllers.controller('MainController', function($scope, $rootScope, $location, ngDialog){
	// Login shit and session id configuration to go here.
	
});

fraudControllers.controller('SessionController', function($scope, $rootScope, $location, SessionServices){
	// Login shit and session id configuration to go here.
	$scope.sessions;
	$scope.alerts = [];
	
	$scope.fireRules = function () {
		SessionServices.fireRules();
	};
	
	$scope.getAlerts = function () {
		var alertsPromise = SessionServices.getAlerts();
		$scope.alerts = [];
		
		alertsPromise.then(function(alerts) {
			$scope.alerts = alerts;
		});
	};
});

fraudControllers.controller('RuleCreationController', 
		function($rootScope, $scope, $location, ngDialog, SobObjectsService, ConditionService, RulesServices) {

	$scope.describedObjects = [];
	$scope.rules = [];
	$scope.ruleIdCount=0;
	$scope.newRule= {};
	$scope.newRuleMode = false;
	$scope.stringComparisions = [];
	$scope.numericComparisons = [];
	$scope.dateComparisions = [];
	$scope.selectedObject ={};

	$scope.init = function() {
		var returnedObjects = SobObjectsService.getSobObjectsDescription();
		
		$scope.stringComparisons = ConditionService.getStringComparison();
		$scope.numericComparisons = ConditionService.getNumericComparison();

		$scope.getRules();
		for (var i = returnedObjects.length - 1; i >= 0; i--) {
			$scope.describedObjects[i] = returnedObjects[i];
		};		
		return false;
	};

	$scope.addRule = function() {
		$scope.ruleIdCount = $scope.ruleIdCount+1;
		var ruleName = null,
			ruleId = $scope.ruleIdCount,
			rule = {name: ruleName, id: ruleId},
		    object = { sobApi: null, sobVar: null, sobLabel: null, sobType: null, sobFields:[]};
		$scope.ruleIdCount = $scope.ruleIdCount+1; 
		
        rule.consequence = {score: 0, recommendation: ""};
		rule.conditions = [];
		$scope.newRuleMode = true;
		
        $scope.newRule = rule;
		
		return false;
	};
	
	//TODO Adding Constraint with base object. Might need to re-evaluate this naming
	$scope.addObject = function(rule, selectedObject) {
		var object = selectedObject,
			alreadyAdded = false,
			rule = rule;
		
		if (object.sobApi == undefined) {
			alert("Please select a object in the drop down list");
			return false;
		}

		return false;
	};

	$scope.addCondition = function(rule, object) {
		var rule = rule,
			object = object,
			condition = {
				object :object,
				patterns: []
			};
		
		rule.conditions.push(condition);
		return false;
	};

	$scope.addPattern = function(condition, object, type) {
		var condition = condition,
			object = object,
			type = type,
			pattern = {
				object: object,
				type: type,
				constraints: []
			};
		if (type === 'Single') {
			$scope.addConstraint(pattern);
		}
		condition.patterns.push(pattern);
		return false;
	};

	$scope.addConstraint = function(pattern) {
		var pattern = pattern,
			constraint = {
				field : null,
				value: null,
				operator: null
			};
		pattern.constraints.push(constraint);
		return false;
	};
	
	$scope.containsNull = function(operatorName) {
		if (operatorName == undefined) return false;

		if (operatorName.indexOf("null") > -1) {
			return true;
		} else {
			return false;
		}
	};
	
	$scope.saveRule = function() {
		RulesServices.newRule(angular.toJson($scope.newRule));
		$scope.newRule = undefined;
		$scope.newRuleMode = false;
		
		$scope.getRules();
		return false;
	};
	
	$scope.cancelNewRule = function() {
		$scope.newRule = undefined;
		$scope.newRuleMode = false;
		return false;
	};
	
	$scope.getRules = function() {
		var rulesPromise = RulesServices.getRules();
		$scope.rules = [];
		
		rulesPromise.then(function(rules) {
			$scope.rules = rules;
		});
	};
	
	$scope.openSobjectSelection= function (r) {
		var rule = r;
		console.log("openSobjectSelection ");
		$scope.value = true;

		ngDialog.open({
			template: 'partials/SobjectSelection.html',
			className: 'ngdialog-theme-plain',
			scope: $scope,
			data: rule
		});
	};

	$scope.init();
});


