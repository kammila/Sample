'use strict';


angular.module("app", []).controller("simpleController", function($scope) {
	$scope.firstName = "John";
    $scope.lastName = "Doe";
    $scope.getFullName = function ()
    {
      return $scope.firstName + " " + $scope.lastName;
    };
});






