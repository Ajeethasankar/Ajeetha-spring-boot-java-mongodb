<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
	h2 { color: #32CD32;}
	input {text-transform: capitalize;}
	 span {
        display: inline-block;
        width: 100px;
        text-align: left;
    }
</style>
</head>
<body>
<div align="center">
<h1> Registration Form </h1> <hr/>
<form action="insert" method="POST" modelAttribute="user" >
<span>	User Id:</span><input type="text" name="userid" autofocus="autofocus"/></span> <br>
	<br>
	 <span>Name:</span><input type="text" name="name"/><br>
	<br>
	<span>E-Mail:</span><input type="text" name="mail"/><br>
	<br>
	<span>Password :</span><input type="text" name="password"/><br>
	<br>
	<span>Birthday:</span> <input type="text" name="birthday"/><br>
	<br>
	<span>Select Gender:</span>
		<input type="radio" name="gender" value="Male" checked="checked">Male &nbsp;&nbsp;
		<input type="radio" name="gender" value="Female">Female <br>
		<br>
		 <span>Address</span> :<input type="text" name="address"> <br>
	</br>
	<span>Profession:</span> <input type="text" name="profession"> <br>
	<br>
	<input type="submit" value="REGISTER">	
</form>

	</div>
</body>
</html>