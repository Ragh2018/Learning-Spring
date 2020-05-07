<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	The Customer is Confirmed: ${customer.firstName} ${customer.lastName}
	<br> Freepasses : ${customer.freePasses}
	<br>
	<br>Postal Code : ${customer.postalcode}
	<br>
	<br>
	Course Code : ${customer.courseCode}
	<br>
	<br>
	<form action="showForm">
		<button>Back</button>
</body>
</html>