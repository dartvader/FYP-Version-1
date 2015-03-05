'use strict';
var fraudControllers = angular.module('fraudControllers', [ 'ngRoute', 'ngDialog' ]);

// Controller for individual functionalities
fraudControllers.controller('MainController', function($scope, $rootScope, $location, ngDialog, PackageServices) {

	$scope.loading = true;
	$scope.initLoadingApp = function() {
		console.log(" -----------   Loading Application --------------- ");

		var corePacakgePromise = PackageServices.loadCoreProduct();
		corePacakgePromise.then(function(corePackage) {
			console.log(" Load rules from UI ");
			$scope.corePackage = corePackage;
		});
	};

	$scope.$watch("corePackage", function() {
		console.log(" loadingcorePackage ");
		$scope.loading = false;
	});
	$scope.initLoadingApp();

});

fraudControllers.controller('PackageManagerController', 
		function($scope, $rootScope, $location, PackageServices, RulesServices) {

	$scope.packages;
	$scope.loadingPackages = true;
	$scope.loadingCorePackage = true;
	$scope.loadingExecution = true;

	$scope.inBuildingMode = false;
	$scope.inEditingMode = false;
	$scope.corePackage = {};
	
	$scope.selectedPackage;
	$scope.selectedPackages;

	$scope.initPackage = function() {
		console.log(" -----------   init Package Services --------------- ");

		$scope.getRules();
		$scope.Package = {};
		$scope.selectedPackages = [];

		var packagePromise = PackageServices.getPackages();
		
		$scope.loadingPackages = true;
		packagePromise.then(function(packages) {
			console.log("Package loaded " + packages);
			$scope.packages = packages;
		});
		
	};

	$scope.unselectPackage = function() {
		$scope.selectedPackage = {};
		$scope.selectedPackages = [];
	}

	$scope.isSelecetedPackage = function() {
		if ($scope.selectedPackage === undefined
				|| $scope.selectedPackage === null
				|| $scope.selectedPackage == ""
				|| $scope.selectedPackage == {}) {
			return false;
		} else {
			return true;
		}
	};

	$scope.objectExist = function(object) {
		if (object === undefined || object === null
				|| object == "") {
			return false;
		} else {
			return true;
		}
	};

	// TODO redo firing action as i will have to pass id/unique
	// name to this api to fire the correct Schedule
	$scope.executeRules = function(pacakgeId) {
		
		var executeRulePromise = PackageServices.executeRules(pacakgeId);
		$scope.loadingExecution = true;
		
		executeRulePromise.then(function(updatedPackage) {
			$scope.Package = updatedPackage;
		});
	};

	$scope.getRules = function() {
		var rulesPromise = RulesServices.getRules();
		console.log("Getting rules ");
		$scope.rules = [];
		rulesPromise.then(function(rules) {
			$scope.availableRules = rules;
		});
	};

	$scope.$watchCollection("selectedPackages", function() {

		console.log("Selected Package " + $scope.selectedPackages);
		
		if ($scope.objectExist($scope.selectedPackages)) {
			
			$scope.selectedPackage = {};
			console.log("Packages " + $scope.selectedPackages);
			$scope.selectedPackage = $scope.selectedPackages[0];
			
			$scope.loadingExecution = false;
			
			if ($scope.isSelecetedPackage() && $scope.objectExist($scope.selectedPackage.executions)) {
				Dashboard.draw('#dashboard', $scope.selectedPackage.executions);
			}
			
		}
	});

	$scope.$watch("packages", function() {
		console.log(" loadingPackages " + $scope.loadingPackages);
		$scope.loadingPackages = false;
	});

	$scope.$watch("selectedPackage", function() {
		$scope.loadingExecution = false;
	});

	$scope.initPackage();
});


fraudControllers.controller('PackageBuilderController', function($scope, $rootScope, $location, ngDialog, PackageServices, RulesServices) {

	$scope.loading = true;
	$scope.availableRules;
	$scope.newPackage;
	$scope.selectedNewRules;
	
	$scope.init = function() {
		console.log(" -----------   Loading Package builder --------------- ");
		$scope.newPackage = {};
		$scope.selectedNewRules = [];
		
		$scope.getRules();
	};

	$scope.getRules = function() {
		var rulesPromise = RulesServices.getRules();
		console.log("Getting rules ");
		$scope.rules = [];
		rulesPromise.then(function(rules) {
			$scope.availableRules = rules;
		});
	};
	
	$scope.saveNewPackage = function() {
		
		var listOfRuleName = [],
			numberOfSelectedRules = $scope.selectedNewRules.length;
		
		
		for (var i = 0; i < numberOfSelectedRules; i++) {
			console.log("rules in for loop " + JSON.stringify($scope.selectedNewRules[i]));
			listOfRuleName[i] = $scope.selectedNewRules[i].name;
		};
		
		$scope.newPackage.ruleNames = listOfRuleName;
		console.log("rules " + JSON.stringify($scope.newPackage.rules));
		
		// PackageServices.savePackage(angular.toJson($scope.newPackage));

		return false;
	};
	
	$scope.cancelNewPackage = function() {
		
		return false;
	};
	
	$scope.init();

});

fraudControllers.controller('RuleManagerController', function($window, $route,
		$rootScope, $scope, $location, ngDialog, RulesServices) {

	$scope.rules;
	$scope.oldRules;
	
	$scope.loadingRules = true;
	$scope.oneAtATime = true;
	
	$scope.savingChanges = false;

	$scope.init = function() {
		$scope.getRules();
		return false;
	};

	$scope.getRules = function() {
		var rulesPromise = RulesServices.getRules();
		$scope.loadingRules = true;
		
		rulesPromise.then(function(rules) {
			$scope.rules = rules;
			$scope.oldRules = rules;
		});
		
	};
	
	$scope.saveChanges = function() {
		console.log("saving changes");
		var rulesPromise = RulesServices.updateRuleConfiguration(angular.toJson($scope.rules));
		
		rulesPromise.then(function(success) {
			// Just assume it worked 
		});
	};
	
	$scope.undoChanges = function() {
		console.log("undoing changes");
		$scope.rules = {};
		$scope.rules = $scope.oldRules;
		
		if(!$scope.$$phase) {
			console.log("!$scope.$$phase");
			//$digest or $apply
			//$scope.$apply();
			//$scope.digest();
		}
	};
	
	$scope.isEmpty = function(value) {
		return value == 0 ? true : false;
	}

	$scope.$watch('rules', function(newVal, oldVal) {
		$scope.loadingRules = false;
		if(!$scope.$$phase) {
			  //$digest or $apply
			$scope.$apply();
			$scope.digest();
		}
	});

	$scope.init();
});


fraudControllers.controller('RuleBuilderController', function($scope, $rootScope,
		$location, ngDialog, RulesServices, SobObjectsService, ConditionService) {
	// Login shit and package id configuration to go here.

	$scope.describedObjects = [];
	$scope.stringComparisions = [];
	$scope.numericComparisons = [];
	$scope.dateComparisions = [];
	$scope.selectedObject = {};
	$scope.loading = true;
	$scope.newRule = {};
	$scope.newRuleMode = false;
	
	$scope.init = function() {
		console.log(" -----------   Loading Custom building rule --------------- ");
		
		var returnedObjects = SobObjectsService.getSobObjectsDescription();

		$scope.stringComparisons = ConditionService.getStringComparison();
		$scope.numericComparisons = ConditionService.getNumericComparison();
		for (var i = returnedObjects.length - 1; i >= 0; i--) {
			$scope.describedObjects[i] = returnedObjects[i];
		};
	};

	$scope.addRule = function() {
		var ruleName = null, rule = {
			name : ruleName
		}, object = {
			sobApi : null,
			sobVar : null,
			sobLabel : null,
			sobType : null,
			sobFields : []
		};

		rule.consequence = {
			score : 0,
			recommendation : ""
		};
		rule.conditions = [];
		$scope.newRuleMode = true;

		$scope.newRule = rule;

		return false;
	};

	$scope.addObject = function(rule, selectedObject) {
		var object = selectedObject, alreadyAdded = false, rule = rule;

		if (object.sobApi == undefined) {
			alert("Please select a object in the drop down list");
			return false;
		}

		return false;
	};

	$scope.addCondition = function(rule, object) {
		var rule = rule, object = object, condition = {
			object : object,
			patterns : []
		};

		rule.conditions.push(condition);
		return false;
	};

	$scope.addPattern = function(condition, object, type) {
		var condition = condition, object = object, type = type, pattern = {
			object : object,
			type : type,
			constraints : []
		};
		if (type === 'Single') {
			$scope.addConstraint(pattern);
		}
		condition.patterns.push(pattern);
		return false;
	};

	$scope.addConstraint = function(pattern) {
		var pattern = pattern, constraint = {
			field : null,
			value : null,
			operator : null
		};
		pattern.constraints.push(constraint);
		return false;
	};

	$scope.containsNull = function(operatorName) {
		if (operatorName == undefined)
			return false;

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

	$scope.openSobjectSelection = function(r) {
		var rule = r;
		$scope.value = true;

		ngDialog.open({
			template : 'partials/sobject-selection.html',
			className : 'ngdialog-theme-plain',
			scope : $scope,
			data : rule
		});
	};
	
	$scope.init();

});
