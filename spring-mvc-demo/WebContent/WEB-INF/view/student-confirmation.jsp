<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	The Student is Confirmed:${student.firstName} ${student.lastName}
	<br>
	<!-- This will call getter method getCountry() -->
	Country: ${student.country}
	<br> Favorite Language : ${student.favoriteLanguage}
	<br> Operating Systems:
	<ol>
		<c:forEach var="temp" items="${student.operatingSystems }">
			<li>${temp}</li>
		</c:forEach>
	</ol>
	<br>
	<form action="showForm">
		<button>Back</button>
	</form>

</body>
</html>