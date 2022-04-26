<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>student List</h1>
	<table>
		<tr>
			<th>firstname</th>
			<th>lastName</th>
			<th>rollnumber</th>
			<th>classnumber</th>
		</tr>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.studentFirstName}</td>
				<td>${student.studentLastName}</td>
				<td>${student.studentRollNumber}</td>
				<td>${student.classNumber}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="homepage.html">Home</a> <br/>
</body>
</html>