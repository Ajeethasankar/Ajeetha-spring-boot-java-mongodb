<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User registration form</title>
<style type="text/css">

table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
 <div align="center">
 <table>
<thead>
 <tbody>
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>password</th>
    <th>birthday</th>
    <th>profession</th>
  </tr>
  <tr>
     <tr th:each="user : ${userList}">
    <td th:text="${user.name}"></td>
    <td th:text="${user.email}"></td>
    <td th:text="${user.password}"></td>
    <td th:text="${user.birthday}"></td>
    <td th:text="${user.profession}"></td>
   <td></td>
   </tr>
   </tbody>
 </table>
</div>
</body>
</html>

