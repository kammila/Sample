


var simpleController = function ($scope)
{
	alert();
  // Initialize the model variables
  $scope.firstName = "John";
  $scope.lastName = "Doe";

  // Define utility functions
  $scope.getFullName = function ()
  {
    return $scope.firstName + " " + $scope.lastName;
  };
};
