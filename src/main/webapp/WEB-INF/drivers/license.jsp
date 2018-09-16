<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>New License</h1>
<form:form action="/license/new" method="post" modelAttribute="license">
    <p>
        <form:label path="driver">Driver</form:label>
        <form:errors path="driver"/>
        <form:input path="driver"/>        
    </p>
    <p>
        <form:label path="state">State</form:label>
        <form:errors path="state"/>
        <form:input path="state"/>
    </p>
    <p>
        <form:label path="exp">Expiration Date</form:label>
        <form:errors path="exp"/>
        <form:input path="exp"/>
    </p>
    
    <input type="submit" value="Create"/>
</form:form>    
</body>
</html>