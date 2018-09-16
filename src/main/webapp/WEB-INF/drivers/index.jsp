<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset = "UFT-8">
<title>Driver's License</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
<h1>Information</h1>
<table>
    <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>License#</th>
            <th>State</th>
            <th>Expiration Date</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${drivers}" var="driver">
        <tr>
            <td><c:out value="${driver.firstName}"/></td>
            <td><c:out value="${driver.lastName}"/></td>
            <td><c:out value="${driver.license.number}"/></td>
            <td><c:out value="${driver.license.state}"/></td>
            <td><c:out value="${driver.license.expiration_date}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/drivers/new">Add New Driver</a>


</body>
</html>