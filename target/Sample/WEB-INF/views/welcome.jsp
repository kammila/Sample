<!DOCTYPE html>
<html>
<head>
  	<script src="angular.js"></script>
  	<script src="./webjars/angularjs/1.4.8/angular.js"></script>
	<script src="./webjars/angularjs/1.4.8/angular-resource.js"></script>
	<script src="./webjars/angularjs/1.4.8/angular-route.js"></script>
	<script src="../resources/static/js/controller.js"></script>
	
  
</head>


<!-- case -1  data binding <body ng-app ng-init="firstName = 'John'; lastName = 'Doe';">
  <strong>First name:</strong> {{firstName}}<br />
  <strong>Last name:</strong> <span ng-bind="lastName"></span></br>
  <!-- <label>Set the first name: <input type="text" ng-model="firstName"/></label></br>
  
  </div> -->
  <body ng-app>
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