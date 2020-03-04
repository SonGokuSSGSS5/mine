<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<h1 align="center"> Category Registration</h1>
<form:form action="addCategoryRep" method="post" modelAttribute="categoryRep">

	First Name<form:input path="firstName" name="firstName"/></br></br>
	Last Name<form:input path="lastName" name="lastName"/></br></br>
	DOB<form:input path="dob" name="dob"/></br></br>
	       Gender:   
        Male <form:radiobutton path="gender" value="Male"/>  
        Female <form:radiobutton path="gender" value="Female"/>  
        <br><br>  
	Contact Number<form:input path="phno" name="phno"/></br></br>
	Category<form:input path="category" name="category"/></br></br>
	Password<form:input path="password" name="password"/></br></br>

		<input type="submit" value="Register">

	</form:form>
	
</body>
</html>