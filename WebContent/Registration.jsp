<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  border-collapse: collapse;
  width: 50%;
}

th, td {
  text-align: left;
  padding: 14px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
<form name="myform" action="Controller" method="post" onsubmit="return validateForm()">
<table align="center">
<h1 align="center">Registration Form</h1>
<tr><td>Name:</td><td><input type="text" size="160" name="name" placeholder="Name" required="required">
<tr><td>Email:</td><td><input type="text"  size="160" name="email" placeholder="Email" required="required">
<tr><td>Mobile No:</td><td><input type="text" size="160" name="mobile" Placeholder="Mobile No"required="required">
<tr><td>password:</td><td><input type="password" size="160" name="password" Placeholder="pssword"required="required">
<tr><td>Confirm Password:</td><td><input type="password"  size="160" name="Confirm Password"Placeholder="Confirm Password"required="required">
<tr><td><input type="submit" name="Registration">
</table>
</form>
</body>
</html>