<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>t</title>
</head>
<body>
<h2>Contact | information</h2>
<pre>
contact id : ${contact.id}
contact first name : ${contact.firstName}
contact last name : ${contact.lasttName}
contact email : ${contact.email}
contact mobile : ${contact.mobile}
contact leadsource : ${contact.leadSource}
</pre>
</body>
</html>