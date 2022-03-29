<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
  <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>id</th>
			<th>first name</th>
			<th>last name</th>
			<th>email</th>
			<th>mobile</th>
			<th>Lead Source</th>
			<th>Bill</th>
		</tr>
	</thead>

<c:forEach var="contact" items="${contacts}">
	<tbody>
		<tr>
			<td>${contact.id}</td>
			<td>${contact.firstName}</td>
			<td>${contact.lasttName}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.leadSource}</td>
			<td><a href="billing?id=${contact.id}">Billing</a></td>
			
		</tr>
		
			
	
	
	</tbody>





</c:forEach>	



</table>
</body>
</html>