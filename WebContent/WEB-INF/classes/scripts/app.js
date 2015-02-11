'use strict';

var fraudApp = angular.module('fraudApp', [
		'ngDialog',
		'ngRoute',
		'trNgGrid',
		'fraudControllers',
		'fraudServices',
		]);

fraudApp.config(function ($routeProvider, ngDialogProvider) {
	
	$routeProvider.when('/dashboard', {
		templateUrl:'partials/dashboard.html', 
		controller:'MainController'
	}).
	when('/rules', {
		templateUrl:'partials/rules.html', 
		controller:'RuleCreationController'
	}).
	when('/sessions', {
		templateUrl:'partials/sessions.html', 
		controller:'SessionController'
	}).
	when('/maintainruleset', {
		templateUrl:'partials/maintainruleset.html', 
		controller:'MainController'
	}).
	otherwise({
		redirectTo:'/dashboard', 
		controller:'MainController'
	});

	ngDialogProvider.setDefaults({
		className: 'ngdialog-theme-default',
		plain: false,
		showClose: true,
		closeByDocument: true,
		closeByEscape: true,
		appendTo: false,
		preCloseCallback: function () {
			console.log('default pre-close callback');
		}
	});
});