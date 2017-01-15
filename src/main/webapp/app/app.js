/*var app = angular.module('myapp', [ 'ngRoute' ]);
app.config(function($routeProvider) {
	$routeProvider.when('/', {
		controller : 'NameController',
		templateUrl : 'app/views/name.html'
	}).when('/contact', {
		controller : 'ContactController',
		templateUrl : 'app/views/contact.html'
	}).otherwise({
		redirectTo : '/'
	});
});*/
var module = angular.module("shopApp", [ 'ngRoute' ]);
module.config(function($routeProvider) {
	$routeProvider.when('/', {
		controller : 'ShopController',
		templateUrl : 'app/views/shop.html'
	}).when('/cart', {
		controller : 'CartController',
		templateUrl : 'app/views/cart.html'
	}).otherwise({
		redirectTo : '/'
	});
});