<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Leads</title>
</head>
<body>
<hr>
<h2>Leads Details </h2>
<hr>

	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>firstName</th>
				<th>lastName</th>
				<th>email</th>
				<th>mobile</th>
				<th>leadSource</th>
				<th>send email</th>
				<th>convert to contact</th>
				<th>delete</th>
				<th>update</th>
			</tr>
		</thead>
		<c:forEach var="leads" items="${lead}">
			<tbody>
				<tr>
					<td>${leads.id}</td>
					<td><a href="leadbyid?id=${leads.id}">${leads.firstName}</a></td>
					<td>${leads.lasttName}</td>
					<td>${leads.email}</td>
					<td>${leads.mobile}</td>
					<td>${leads.leadSource}</td>
					

					<td><form action="compose" method="post">
							<input type="hidden" name="email" value="${leads.email}" /> <input
								type="submit" value="send email" />
						</form></td>

					<td><form action="savecontact" method="post">
							<input type="hidden" name="id" value="${leads.id}" /> <input
								type="submit" value="convertl" />
						</form></td>
						
					<td><a href="deletebyid?id=${leads.id}">delete</a></td>
					
					<td><a href="updatedetails?id=${leads.id}">update</a></td>
					
				</tr>


			</tbody>

		</c:forEach>
	</table>

</body>
</html>