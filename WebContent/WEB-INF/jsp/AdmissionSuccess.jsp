<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Application Successfully Submitted</title>
</head>
<body>
	<p>${message}</p><br>
	<h2>Congo, Your form is submitted.</h2><br>
	<h3>Details Submitted by you:</h3><br>
	<br>
	<table border="1px">
		<tr>
			<td>Name</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Father's Name:</td>
			<td>${student.fatherName}</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>DOB:</td>
			<td>${student.studentDOB}</td>
		</tr>
		
		<tr>
			<td>Skills:</td>
			<td>${student.studentSkills}</td>
		</tr>
		<tr>
			<td>Student Address :</td>
			<td>country: ${student.studentAddress.country}
			       city: ${student.studentAddress.city}
			     street: ${student.studentAddress.street}
			    pincode: ${student.studentAddress.pincode}</td>
		</tr>
	</table>
</body>
</html>