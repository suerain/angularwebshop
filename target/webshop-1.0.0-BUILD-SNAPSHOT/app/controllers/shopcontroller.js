var ShopController = function($scope, $http, cartService) {
	$scope.data = cartService;
	$scope.cd = {
		id : "",
		name : "",
		price : ""
	};
	$scope.retrieveCDs = function() {
		$http.get("REST/shop/cds").success(
				function(data, status, header, config) {
					$scope.cds = data;
				})
	};
	$scope.retrieveCDs();
	$scope.addCD = function() {
		$http.post("REST/shop/cd", $scope.cd).success(
				function(data, status, header, config) {
					$scope.retrieveCDs();
				});
	};
	$scope.removeCD = function(id) {
		$http.delete("REST/shop/cd1/" + id).success(
				function(data, status, header, config) {
					console.log("deleted");
					$scope.retrieveCDs();
				});
	};
	
	$scope.addToCart = function(cd) {
		console.log("add to cart is called");
		$scope.data.cart.push({"id":cd.id,
			"name":cd.name,
			"price": cd.price});
		console.log($scope.data.cart);
		$scope.data = cartService;
		
	};

};
angular.module("shopApp").controller("ShopController", ShopController);