<!doctype html>
<html >
	<head>
		<title>Spring MVC + AngularJS Demo</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    	<script>
    	var app = angular.module('myApp', []);
    	app.controller('Hello', function($scope, $http) {
    		 $http.get('http://localhost:8080/Sample/springcontent.json').
 	        	success(function(data) {
 	        	$scope.user = data;
 	        });
    	});
    	</script>
	</head>
	<body  ng-app="myApp">
		<div ng-controller="Hello">
			<h2>Spring MVC + AngularJS Demo</h2>
			<p>EMail Id : {{user.emailId}}</p>
			<p>User Name : {{user.userName}}</p>
		</div>
		
		<div ng-app="" ng-init="names=['Jani','Hege','Kai']">
  			<ul>
   				 <li ng-repeat="x in names">
      				{{ x }}
    			</li>
  			</ul>
  			
  			<select ng-model="selectedName" ng-options="x for x in names">
			</select>
		</div>
	</body>
</html>