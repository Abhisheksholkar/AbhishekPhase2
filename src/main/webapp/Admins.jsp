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

<c:choose>
<c:when test="${ (param.password==1234)}">
<p>you are logged in</p><br/>
<a href="homepage.html">home</a>
</c:when>
<c:otherwise>INVALID CREDENTIALS</c:otherwise>
</c:choose>
</body>
</html>