'use strict';

var fraudApp = angular.module('fraudApp', [
		'ngDialog',
		'ngRoute',
		'trNgGrid',
		'fraudControllers',
		'fraudServices',
		'ui.bootstrap'
		]);

google.load('visualization', '1', {
   packages: ['corechart']
});
 
google.setOnLoadCallback(function() {
   angular.bootstrap(document.body, ['fraudApp']);
});

fraudApp.config(function ($routeProvider, ngDialogProvider) {
	
	$routeProvider.when('/dashboard', {
		templateUrl:'partials/dashboard.html', 
		controller:'MainController'
	}).
	when('/claims-score-board', {
		templateUrl:'partials/claims-score-board.html', 
		controller:'ClaimScoreBoardController'
	}).
	when('/rule-manager', {
		templateUrl:'partials/rule-manager.html', 
		controller:'RuleManagerController'
	}).
	when('/package-manager', {
		templateUrl:'partials/package-manager.html', 
		controller:'PackageManagerController'
	}).
	when('/package-builder', {
		templateUrl:'partials/package-builder.html', 
		controller:'PackageBuilderController'
	}).
	when('/rule-builder', {
		templateUrl:'partials/rule-builder.html', 
		controller:'RuleBuilderController'
	}).
	otherwise({
		redirectTo:'/dashboard', 
		controller:'MainController'
	});

});