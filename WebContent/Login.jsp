<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  border-collapse: collapse;
  width: 80%;
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

<script>  
function validateForm(){  
var name=document.myform.name.value;  
var password=document.myform.password.value;  
  
if (name==null || name==""){  
	alert("name cant be blank"); 
	return false;  
}else if(password==""){ 
	alert("password cant blank");
  return false;  
  }  
}
</script>
</head>
<body>
<form name="myform" action="LoginController" method="post" onsubmit="return validateForm()">
<table align="center">
<h1 align="center">Login Form</h1>
<tr><td>Name:</td><td><input type="text" size="120" id="numloc" name="name" placeholder="Name">
<tr><td>password:</td><td><input type="text" size="120" id="numloc1" name="password" placeholder="Password">
<tr><td><input type="submit" value="Login"></td></tr>
</table>
</form>
</body>
</html>