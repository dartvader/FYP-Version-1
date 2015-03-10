'use strict';
var fraudControllers = angular.module('fraudControllers', [ 'ngRoute', 'ngDialog' ]);

// Controller for individual functionalities
fraudControllers.controller('MainController', function($scope, $rootScope, $location, ngDialog, PackageServices) {

	$scope.loading = true;
	$scope.initLoadingApp = function() {
		console.log(" -----------   Loading Application --------------- ");

		var corePacakgePromise = PackageServices.loadCoreProduct();
		corePacakgePromise.then(function(corePackage) {
			$scope.corePackage = corePackage;
		});
		
		
	};

	$scope.$watch("corePackage", function() {
		$scope.loading = false;
	});
	$scope.initLoadingApp();

});

//Controller for individual functionalities
fraudControllers.controller('ClaimScoreBoardController', function($scope, $rootScope, $location, ngDialog, ExecutionServices, AlertServices) {
	
	$scope.executions;
	$scope.loadingExecutions = true;
	
	$scope.executionCalculated;
	$scope.calculatingScores = false;
	
	$scope.selectedClaim;
	
	$scope.init = function() {
		console.log(" -----------   Loading Claims Score Board Controller --------------- ");
		$scope.selectedClaim = [];
		
		$scope.loadingExecutions = true;
		var executionsPromise = ExecutionServices.getExecutions();
		executionsPromise.then(function(executions) {
			$scope.executions = executions;
		});
	};
	// Building the Calculated Score table
	$scope.calculateClaimsScores = function(execution) {
		var alerts = $scope.executions[execution].alerts;
		$scope.calculatingScores = true;
		var tempScoreMap = {};
		for (var i = 0; alerts.length > i; i++) {
			
			var claimId = alerts[i].claimId,
				claimName = alerts[i].claimName,
				claimantName = alerts[i].claimantName,
				claim = alerts[i].claim,
				score = alerts[i].score,
				rule = alerts[i].ruleName,
				recommendation = alerts[i].recommendation;

			console.log("score " + score);
			if (tempScoreMap[claimId] === undefined) {
				tempScoreMap[claimId] = {
						claimId: claimId,
						claimName : claimName,
						claimantName : claimantName,
						score : score,
						recommendation : [],
					    rules : [],
						claim : {}
				}
				tempScoreMap[claimId].recommendation.push(recommendation);
				tempScoreMap[claimId].rules.push([rule, score]);
				tempScoreMap[claimId].claim = claim;

			} else {
				// Adding the Scores.... Might need to do some sort of weighted algorithm for totalling
				var tempScore = tempScoreMap[claimId].score;
				tempScoreMap[claimId].score = score + tempScore;
				tempScoreMap[claimId].rules.push([rule, score]);
				tempScoreMap[claimId].recommendation.push(recommendation);
			}
		}
		
		$scope.executionCalculated = [];
		angular.forEach(tempScoreMap, function(list) {
			
            $scope.executionCalculated.push({
                claimId: list.claimId,
                claimName: list.claimName,
                claimantName: list.claimantName,
                claim : list.claim,
                score: list.score,
                NumberOfRulesFired: list.rules.length,
				recommendation : list.recommendation,
				rules : list.rules
            })
            
        });
		
		console.log("executionCalculated   " + JSON.stringify($scope.executionCalculated));
	};
	
	// Selected Claim Break down.
	$scope.drawBarChart = function(id, rulesData) {
		
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Rule Name');
        data.addColumn('number', 'Score');
        data.addRows(rulesData);
        var options = {
          title: 'Score Break Down'
        };

        var chart = new google.visualization.PieChart(document.getElementById(id));
        
        function selectHandler() {
          var selectedItem = chart.getSelection()[0];
          if (selectedItem) {
            var value = data.getValue(selectedItem.row, selectedItem.column);
            alert('The user selected ' + value);
          }
        }

        google.visualization.events.addListener(chart, 'select', selectHandler);
        
        chart.draw(data, options);
	}
	
	$scope.$watch("executions", function() {
		$scope.loadingExecutions = false;
	});
	
	$scope.$watchCollection("selectedClaim", function() {

		if ($scope.selectedClaim.length != 0) {
			$scope.drawBarChart("barChart", $scope.selectedClaim[0].rules);
		}
	});
	
	$scope.$watch("executionCalculated", function() {
		$scope.calculatingScores = false;
		
	});
	
	
	$scope.init();
});

fraudControllers.controller('PackageManagerController', 
		function($scope, $rootScope, $location, PackageServices, RulesServices) {

	$scope.packages;
	$scope.loadingPackages = true;
	$scope.loadingCorePackage = true;
	$scope.loadingExecution = true;
	$scope.loadingRules = true;

	$scope.inBuildingMode = false;
	$scope.inEditingMode = false;
	$scope.corePackage = {};
	
	$scope.selectedPackage;
	$scope.selectedPackageRules;
	$scope.selectedPackages;

	$scope.initPackage = function() {
		console.log(" -----------   init Package Manager Controller --------------- ");

		$scope.Package = {};
		$scope.selectedPackages = [];

		$scope.loadingPackages = true;
		var packagePromise = PackageServices.getPackages();
		packagePromise.then(function(packages) {
			$scope.packages = packages;
		});
		
	};

	$scope.unselectPackage = function() {
		$scope.selectedPackage = {};
		$scope.selectedPackages = [];
		$scope.selectedPackageRules = [];
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

	$scope.executeRules = function(pacakgeId) {
		
		var executeRulePromise = PackageServices.executeRules(pacakgeId);
		$scope.loadingExecution = true;
		
		executeRulePromise.then(function(updatedPackage) {
			$scope.selectedPackage = updatedPackage;
		});
	};


	$scope.$watchCollection("selectedPackages", function() {
		
		if ($scope.objectExist($scope.selectedPackages)) {
			
			$scope.selectedPackage = {};
			$scope.selectedPackage = $scope.selectedPackages[0];
			$scope.loadingExecution = false;

			$scope.loadingRules = true;
			var rulesPromise = PackageServices.getPackageRules($scope.selectedPackage.id);
			
			rulesPromise.then(function(rules) {
				console.log("getting package rules promise");
				$scope.selectedPackageRules = rules;
			});
			
			if ($scope.isSelecetedPackage() && $scope.objectExist($scope.selectedPackage.executions)) {
				Dashboard.draw('#dashboard', $scope.selectedPackage.executions);
			}
		}
	});

	$scope.$watch("packages", function() {
		console.log(" loading Packages  ");
		$scope.loadingPackages = false;
	});

	$scope.$watch("selectedPackage", function() {
		$scope.loadingExecution = false;
	});
	
	$scope.$watch("selectedPackageRules", function() {

		$scope.loadingRules = false;
	});

	$scope.initPackage();
});


fraudControllers.controller('PackageBuilderController', function($scope, $rootScope, $location, ngDialog, PackageServices, RulesServices) {

	$scope.loading = true;
	$scope.availableRules;
	$scope.newPackage;
	$scope.selectedNewRules;
	$scope.packageName;
	
	$scope.init = function() {
		console.log(" -----------   Loading Package builder --------------- ");
		$scope.newPackage = [];
		$scope.selectedNewRules = [];
		$scope.newPackage.packageName = "";
		
		$scope.getRules();
	};

	$scope.getRules = function() {
		var rulesPromise = RulesServices.getRules();
		
		$scope.loading = true;
		
		rulesPromise.then(function(rules) {
			$scope.availableRules = rules;
		});
	};
	
	$scope.saveNewPackage = function() {

		var listOfRuleName = [], 
			numberOfSelectedRules = $scope.selectedNewRules.length;
		
		$scope.newPackage.ruleNames = [];
		for (var i = 0; i < numberOfSelectedRules; i++) {
			$scope.newPackage.push($scope.selectedNewRules[i].name);
		};
		
		PackageServices.savePackage(angular.toJson($scope.newPackage));
		
		return false;
	};
	
	$scope.cancelNewPackage = function() {
		return false;
	};
	
	$scope.$watch('availableRules', function() {
		console.log("rules updated " + $scope.loading);
		$scope.loading = false;
		if(!$scope.$$phase) {
			//$digest or $apply
			$scope.$apply();
			$scope.digest();
		}

	});
	
	$scope.init();

});

fraudControllers.controller('RuleManagerController', function($window, $route,
		$rootScope, $scope, $location, ngDialog, RulesServices) {

	$scope.rules;
	$scope.oldRules;
	$scope.loadingRules = true;
	$scope.oneAtATime = true;
	
	$scope.init = function() {

		console.log(" ---- init rules manager ----- ");
		$scope.getRules();
		return false;
	};

	$scope.getRules = function() {
		var rulesPromise = RulesServices.getRules();
		
		$scope.loadingRules = true;
		rulesPromise.then(function(rules) {
			
			$scope.rules = rules;
			//$scope.oldRules = rules;
		});
	};
	
	$scope.saveChanges = function() {
		
		$scope.loadingRules = true;
		var rulesPromise = RulesServices.updateRuleConfiguration(angular.toJson($scope.rules));
		rulesPromise.then(function(updateRules) {
			
			$scope.rules = updatedRules;
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

	$scope.$watch('rules', function() {
		console.log("rules updated " + $scope.loadingRules);
		$scope.loadingRules = false;

		console.log("rules updated " + JSON.stringify($scope.rules));
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
		console.log(" -----------   init Custom building rule --------------- ");
		
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
		var condition = condition, 
			object = object, 
			type = type, 
			pattern = {
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
