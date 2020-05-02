<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>>Hello World - Output Form</title>
</head>
<body>
	Hello World of Spring!
	<br>
	<br>
	
	Student Name: ${param.studentName}
	
	<br><br>
	
	The message :${message}
	
	<form action="showForm">
		<button >Back</button>
	</form>
	
</body>
</html>