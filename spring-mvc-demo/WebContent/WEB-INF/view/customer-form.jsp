<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>
	<i>Fill out the form. (*) means required field</i>
	<br>
	<br>
	<form:form action="processForm" modelAttribute="customer">
		<!-- we have given path so this will call the setter method setFirstName()-->
			First Name : <form:input path="firstName" />
		<br>
		<br>
			Last Name (*) : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
			FreePasses :<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error"></form:errors>
		<br>
		<br>
			Postal Code :<form:input path="postalcode" />
		<form:errors path="postalcode" cssClass="error"></form:errors>
			
		<br>
		<br>
		Course Code :<form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error"></form:errors>
			
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>