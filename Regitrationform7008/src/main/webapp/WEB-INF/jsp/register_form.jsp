<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head><meta charset="ISO-8859-1">
<title>User registration form</title>
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
        <h2>User Registration</h2>

   <form:form action="register" method="post" modelAttribute="user">
                
    <form:label path="name">First name :</form:label>
    <form:input path="name"/><br/>
    
     <form:label path="email">E-Mail :</form:label>    
     <form:input path="email"/><br/> 
    
      <form:label path="password">Password:</form:label>
    <form:password path="password"/><br>
    
     <form:label path="birthday">Birthday:</form:label>
    <form:input path="birthday"/><br>
    
    <form:label path="profession"> Profession: </form:label>
    <form:select path="profession" items="${professionList}"/> <br>
    
      <form:button>Register</form:button>
   </form:form>
  
</div>
</body>
</html>


