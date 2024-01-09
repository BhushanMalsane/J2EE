<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- display data in table format -->
<table border='2'>
<tr>
<th>Employee id</th>
<th>Employee Name</th>
<th>Employee Sal</th>

</tr>
<!--it will retrieve list from request object and apply for loop to generate 
row in the table for each employee -->



<c:forEach var="emp" items="${list}">
<tr>
<!-- it gives call to appropriate getter methods -->

<td> ${emp.id} </td>
<td> ${emp.name} </td>
<td> ${emp.sal} </td>

</tr>
</c:forEach>
</table>

</body>
</html>