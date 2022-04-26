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
	<h1>CLASS REPORT</h1>
	
	
	<table>
		<tr>

			<th>CLASSNUMBER</th>
			<th>TEACHER</th>
			<th>SUBJECT</th>
		
		</tr>
		
		<c:forEach var="report" items="${report}">
		<c:if test="${param.classno ==report.classnumber}">
			<tr>
				<td>${report.classnumber}</td>
				<td>${report.teacher}</td>
				<td>${report.subject}</td>
			</tr>
			</c:if>
		</c:forEach>
	</table>
	<br/>
	<h1>student List</h1>
	<table>
		<tr>
			<th>firstname</th>
			<th>lastName</th>
			<th>rollnumber</th>
			<th>classnumber</th>
		</tr>
		<c:forEach var="student" items="${students}">
		<c:if test="${param.classno ==student.classNumber}">
			<tr>
				<td>${student.studentFirstName}</td>
				<td>${student.studentLastName}</td>
				<td>${student.studentRollNumber}</td>
				<td>${student.classNumber}</td>
			
			</tr>
				</c:if>
		</c:forEach>
	</table>
	<br/>
	<a href="homepage.html">Home</a> <br/>
</body>
</html>