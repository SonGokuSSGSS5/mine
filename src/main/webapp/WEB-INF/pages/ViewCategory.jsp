<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="Cyan">

	
<h1> You have Entered View Category Page</h1>


<table border="2" align="center" cellspacing="10"  cellpadding="10">

	<tr>
		<th>CourseId</th>
		<th>CategoryName</th>
	</tr>

<c:forEach var="cr" items="${course }" >

		<tr>
			<th>${cr.categoryId }</th>
			
			<th>${cr.category }</th>
			
			<th><a href="updateCategoryPage?cid=${cr.categoryId}" >EDIT</a></th>
			
		</tr>
</c:forEach>

</table>

</body>
</html>