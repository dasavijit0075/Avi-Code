 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Registration Form</title>
</head>
<body>
<h1>Welcome to TravelWorld</h1>

<form:form action="processdata" modelAttribute="C_obj">
 
 First name: <form:input path ="Fname"/>
<br>
<br>
Last name: <form:input path ="Lname"/>
<br>
<br>
<label>Country</label>
	<form:select path="Cname"  >
	<form:option value="India">INDIA</form:option>
	<form:option value="Italy">ITALY</form:option>
	<form:option value="Canada">CANADA</form:option>
	<form:option value="Brazil">BRAZIL</form:option>
	<form:option value="America">USA</form:option>
	</form:select><br><br>
<input type = "submit" value="Submit"/>
 </form:form>
</body>
</html>