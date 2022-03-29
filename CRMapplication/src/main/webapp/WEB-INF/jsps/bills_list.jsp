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
<hr>
<h2>Bills Detailse Here</h2>
<table border="1">
	<thead>
		<tr>
			<th>id</th>
			<th>first name</th>
			<th>last name</th>
			<th>email</th>
			<th>mobile</th>
			<th>product name</th>
			<th>Amount</th>
		</tr>
	</thead>

<c:forEach var="contact" items="${bill}">
	<tbody>
		<tr>
			<td>${contact.id}</td>
			<td>${contact.firstName}</td>
			<td>${contact.lasttname}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.productName}</td>
			<td>${contact.amount}</td>
			
		</tr>
		
			
	
	
	</tbody>





</c:forEach>	



</table>
</body>
</html>