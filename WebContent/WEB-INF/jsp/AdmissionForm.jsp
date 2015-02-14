<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Admission Form</title>
</head>
<body>
	<h3>${message}</h3>
	<h2>STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h2>
	<form:errors path="student.*"/>
	<form action="/SpringMVCDemo/admissionSuccess" method="post">
			Student Name:<input type="text" name="studentName"/><br/>
			Father's Name:<input type="text" name="fatherName"/><br/>
			Student's Mobile:<input type="text" name="studentMobile"/><br/>
			Student's DOB:<input type="text" name="studentDOB"/><br/>
			Skill Set:<select name="studentSkills" multiple="multiple">
					  		<option value="Java Core">Core Java</option>
					  		<option value="Spring Core">Core Spring</option>
					  		<option value="Spring MVC">Spring MVC</option>
					  </select>
			<table>
				<tr><td>Student's Address : </td></tr> 
				<tr>
					<td>country: <input type="text" name="studentAddress.country"/></td>
					<td>city: <input type="text" name="studentAddress.city" /></td>
					<td>street: <input type="text" name="studentAddress.street" /></td> 
					<td>pincode:<input type="text" name="studentAddress.pincode" /></td>
				</tr>
			</table>
			<input type="submit" name="SUBMIT"/>
	</form>
</body>
</html>