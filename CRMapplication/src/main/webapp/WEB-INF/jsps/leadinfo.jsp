<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead</title>
</head>
<body>
<h2>Saved Lead Information</h2>
<pre>
id: ${lead.id}
First Nmae: ${lead.firstName}
Last Name: ${lead.lasttName}
Email: ${lead.email}
Mobile: ${lead.mobile}
Lead Source: ${lead.leadSource}
</pre>

<form action="compose" method="post">
Send Email to your Lead<input type="hidden" name="email" value="${lead.email}"/>
<input type="submit" value="send email"/>
</form>

<form action="savecontact" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
Convert Lead to Contact<input type="submit" value="convertl"/>
</form>

${msg}


</body>
</html>