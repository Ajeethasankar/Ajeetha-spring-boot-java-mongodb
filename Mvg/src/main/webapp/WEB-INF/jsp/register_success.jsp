<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
 <div align="center">
        <h2>Registration Succeeded!</h2>
       <span>Employee id:</span><span>${user.userid}</span><br/>
        <span>Full name:</span><span>${user.name}</span><br/>
        <span>Mail:</span><span>${user.mail}</span><br/>
        <span>Password:</span><span>${user.password}</span><br/>
         <span>Password:</span><span>${user.birthday}</span><br/>
          <span>Gender:</span><span>${user.gender}</span><br/>
           <span>Address:</span><span>${user.address}</span><br/>
        <span>Profession:</span><span>${user.profession}</span><br/>
        
      </div>
</body>
</html>
