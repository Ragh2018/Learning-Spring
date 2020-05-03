<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<br>
	Favorite Language : ${student.favoriteLanguage}
	<form action="showForm">
		<button>Back</button>
	</form>

</body>
</html>