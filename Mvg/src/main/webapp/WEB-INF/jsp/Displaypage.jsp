<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display</title>
<style type="text/css">
	input
	{
display: inline-block;
with: 200px;
margin: 10px;
text-align: left;
}

button{
padding: 10px;
margin: 10px;
}
</style>
</head>
<body>
<div align="center">
<h1> Display  Record </h1> <hr/>
<table border="5" width="45%">
	<tr>
		<th>  ID </th>
		<th>  Name </th>
		<th>  Email </th>
		<th>  Password</th>
		<th> Birthday</th>
		<th> Gender </th>
		<th> Address </th>
		<th> Profession </th>
			
	</tr>
		<c:forEach var="tab" items="${data }">
		<form action="update" method="POST">
	<tr>
		<input type="hidden" value="${tab.id }" name="id">
		<td> <input type="text" value="${tab.userid }" name="userid" readonly="readonly"> </td>
		<td> <input type="text" value="${tab.name }" name="name"> </td>
		<td> <input type="text" value="${tab.mail }" name="mail"> </td>
		<td> <input type="text" value="${tab.password }" name="password"> </td>
		<td> <input type="text" value="${tab.birthday }" name="birthday"> </td>
		<td> <input type="text" value="${tab.gender }" name="gender"> </td>
		<td> <input type="text" value="${tab.address }" name="address"> </td><br>
		<td> <input type="text" value="${tab.profession }" name="profession"> </td>
		
		<td>
			
		</td>
		</tr>
		</c:forEach>
</table>
	</div>
</body>
</html