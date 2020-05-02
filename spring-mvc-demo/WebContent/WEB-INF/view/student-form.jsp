<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
			<!-- we have given path so this will call the setter method setFirstName()-->
			First Name : <form:input path="firstName"/>		
			<br><br>
			Last Name : <form:input path="lastName"/>	
			<br><br>
			Country :
			<form:select path="country">
				<form:options items="${theCountryOptions}" />
				<%--<form:options items="${student.countryOptions}" />
				 <form:option value="Brazil" label="Brazil" />
				<form:option value="Germany" label="Germany" />
				<form:option value="France" label="France" />
				<form:option value="India" label="India" /> --%>
			</form:select>
			<input type="submit" value="Submit"/>		
	</form:form>
</body>
</html>