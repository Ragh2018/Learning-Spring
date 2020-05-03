<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		<!-- we have given path so this will call the setter method setFirstName()-->
			First Name : <form:input path="firstName" />
		<br>
		<br>
			Last Name : <form:input path="lastName" />
		<br>
		<br>
			Country :
			<form:select path="country">
			<!-- 3rd way -->
			<form:options items="${theCountryOptions}" />
			<!-- 2nd way -->
			<%-- <form:options items="${student.countryOptions}" /> --%>
			<!-- 1st way -->
			<%-- <form:option value="Brazil" label="Brazil" />
				<form:option value="Germany" label="Germany" />
				<form:option value="France" label="France" />
				<form:option value="India" label="India" /> --%>
		</form:select>
		<br>
		<br>
		Favorite Language:
			Java <form:radiobutton path="favoriteLanguage" value="Java" /> 
			C# <form:radiobutton path="favoriteLanguage" value="C#" /> 
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" /> 
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>