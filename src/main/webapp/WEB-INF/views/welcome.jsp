<!DOCTYPE html>
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  	<script src="./resources/static/js/controller.js"></script>
  	<script>
    	function Hello($scope, $http) {
    	    $http.get('http://localhost:8080/SpringExamples/springcontent.json').
    	        success(function(data) {
    	            $scope.user = data;
    	        });
    	}
    	</script>
</head>


<!-- case -1  data binding <body ng-app ng-init="firstName = 'John'; lastName = 'Doe';">
  <strong>First name:</strong> {{firstName}}<br />
  <strong>Last name:</strong> <span ng-bind="lastName"></span></br>
  <!-- <label>Set the first name: <input type="text" ng-model="firstName"/></label></br>
  
  </div> -->
    <body ng-app="app">
  	<div ng-controller="simpleController">
   		 <strong>First name:</strong> {{firstName}}<br />
   		 <strong>Last name:</strong> <span ng-bind="lastName"></span><br />
   		 <strong>Full name:</strong> {{getFullName()}}<br />
   			 <br />
   		 <label>Set the first name: <input type="text" ng-model="firstName"/></label><br />
   		 <label>Set the last name: <input type="text" ng-model="lastName"/></label>
   	 </div>
   	 
   	 
   	 
   	 
    </body> 
    
  
  
</body>
</html>