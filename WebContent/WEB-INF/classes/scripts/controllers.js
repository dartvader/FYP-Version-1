'use strict';
var fraudControllers = angular.module('fraudControllers', ['ngRoute','ngDialog']);

// Controller for individual functionalities
fraudControllers.controller('MainController', function($scope, $rootScope, $location, ngDialog){
	// Login shit and session id configuration to go here.
	
});

fraudControllers.controller('SessionController', function($scope, $rootScope, $location, SessionServices, RulesServices){
	
	$scope.sessions;
	
	$scope.loadingSessions = true;
	$scope.loadingCoreSession = true;
	$scope.loadingExecution = false;
	
	$scope.inBuildingMode = false;
	$scope.inEditingMode = false;
	$scope.newSession = {};
	$scope.coreSession = {};
	$scope.selectedNewRules = [];
	$scope.availableRules;
	$scope.selectedSession;
	$scope.selectedSessions;
	
	/*
	 * 
	 */
	$scope.initSession = function() {

		console.log(" -----------   initSession --------------- ");
		
		$scope.getRules();
		$scope.selectedSession = {};
		$scope.selectedSessions = [];
		
		var sessionPromise = SessionServices.getSessions();
		
		$scope.loadingSessions = true;
		sessionPromise.then(function(sessions) {
			// console.log("Sessions loaded " + sessions);
			$scope.sessions = sessions;
		});

		$scope.loadingCoreSession = true;
		var coreSessionPromise = SessionServices.loadCoreProduct();
		coreSessionPromise.then(function(session) {	
			// console.log("Core Session loaded " + session);
			$scope.coreSession = session;
		});
	};
	
	$scope.buildNewSession = function() {
		$scope.inBuildingMode = true;
        $scope.newSession = {};
    	$scope.selectedNewRules = [];
		
		return false;
	};
	
	$scope.cancelNewSession = function() {
		$scope.inBuildingMode = false;
		$scope.selectedNewRules = [];
        $scope.newSession = {};
		return false;
	};
	
	$scope.unselectSession = function() {
		$scope.selectedSession = {};
		$scope.selectedSessions = [];
	}
	
	$scope.saveNewSession = function() {
		
		$scope.newSession.rules = $scope.selectedNewRules;
		
		SessionServices.saveSession(angular.toJson($scope.newSession));
		var newSessionPromise = SessionServices.getSessions();
		newSessionPromise.then(function(sessions) {
			$scope.sessions = [];
			$scope.sessions = sessions;
			$scope.loadingSessions = true;
		});
		
		$scope.selectedNewRules = [];
		$scope.newSession = {};
		$scope.inBuildingMode = false;
		
		return false;
	};
	
	$scope.cancelNewSession = function() {
		$scope.newSession = undefined;
		$scope.inBuildingMode = false;
		return false;
	};
	
	$scope.isSelecetedSession = function() {
		if ($scope.selectedSession  === undefined 
					|| $scope.selectedSession  === null 
					|| $scope.selectedSession  == "" 
					|| $scope.selectedSession  == {}) {
			return false;
		} else {
			return true;
		}
	};
	
	$scope.objectExist = function(object) {
		if (object  === undefined 
					|| object  === null 
					||  object  == "") {
			return false;
		} else {
			return true;
		}
	};
	
	// TODO redo firing action as i will have to pass id/unique name to this api to fire the correct Schedule
	$scope.executeRules = function (sessionId) {
		var executeRulePromise = SessionServices.executeRules(sessionId);

		$scope.loadingExecution = true;
		executeRulePromise.then(function(updatedSession) {
			$scope.selectedSession = updatedSession;
		});
	};
	
	$scope.getRules = function() {
		var rulesPromise = RulesServices.getRules();
		// console.log("Getting rules ");
		$scope.rules = [];
		
		rulesPromise.then(function(rules) {
			$scope.availableRules = rules;
		});
	};

	
	$scope.$watchCollection("selectedSessions", function(){
		$scope.selectedSession = {};
		$scope.selectedSession = $scope.selectedSessions[0];
		$scope.loadingExecution = false;
		if ($scope.isSelecetedSession() && $scope.objectExist($scope.selectedSession.executions)) {
	        Dashboard.draw('#dashboard', $scope.selectedSession.executions);
		}
	});
	
	$scope.$watch("coreSession", function(){
		console.log(" loadingCoreSession = false " + $scope.loadingCoreSession);
		$scope.loadingCoreSession = false;
	});
	
	$scope.$watch("sessions", function(){
		console.log(" loadingSessions " + $scope.loadingSessions);
		$scope.loadingSessions = false;
	});
	
	$scope.$watch("selectedSession", function(){
		$scope.loadingExecution = false;
	});
	
	$scope.initSession();
});

fraudControllers.controller('RuleCreationController', 
		function($window, $route, $rootScope, $scope, $location, ngDialog, SobObjectsService, ConditionService, RulesServices) {

	$scope.describedObjects = [];
	$scope.rules = [];
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
		var ruleName = null,
			rule = {name: ruleName},
		    object = { sobApi: null, sobVar: null, sobLabel: null, sobType: null, sobFields:[]};
		
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

		var rulesPromise = RulesServices.getRules();
		RulesServices.newRule(angular.toJson($scope.newRule));
		$scope.rules = [];
		$scope.loadingRules = true;
		rulesPromise.then(function(rules) {
			console.log(" loading rules " + $scope.loadingRules);
			console.log(" loading rules " + rules);
			$scope.rules = rules;
		});
		$scope.newRule = {};
		$scope.newRuleMode = false;
		return false;
	};
	
	$scope.cancelNewRule = function() {
		$scope.newRule = {};
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
		$scope.value = true;

		ngDialog.open({
			template: 'partials/sobject-selection.html',
			className: 'ngdialog-theme-plain',
			scope: $scope,
			data: rule
		});
	};
	
	$scope.$watch('rules', function(newVal, oldVal) {
	    $scope.loadingRules = false;
		
	});
	
	
	$scope.init();
});


