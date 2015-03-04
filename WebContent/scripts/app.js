'use strict';

var fraudApp = angular.module('fraudApp', [
		'ngDialog',
		'ngRoute',
		'trNgGrid',
		'fraudControllers',
		'fraudServices',
		'ui.bootstrap'
		]);

fraudApp.config(function ($routeProvider, ngDialogProvider) {
	
	$routeProvider.when('/dashboard', {
		templateUrl:'partials/dashboard.html', 
		controller:'MainController'
	}).
	when('/rules', {
		templateUrl:'partials/rules.html', 
		controller:'RuleConfigurationController'
	}).
	when('/session-manager', {
		templateUrl:'partials/session-manager.html', 
		controller:'SessionController'
	}).
	when('/new-rule', {
		templateUrl:'partials/new-rule.html', 
		controller:'CustomBuildRuleController'
	}).
	otherwise({
		redirectTo:'/dashboard', 
		controller:'MainController'
	});

});