var CartController = function($scope, cartService) {
	$scope.data = cartService;
	$scope.removeFromCart = function(id) {
		console.log(id);
		for (var i = 1; i < $scope.data.cart.length; i++) {
			if ($scope.data.cart[i].id == id) {
				$scope.data.cart.splice(i, 1);
				break;
			}
		}
		$scope.data = cartService;
	};
};
angular.module("shopApp").controller("CartController", CartController);