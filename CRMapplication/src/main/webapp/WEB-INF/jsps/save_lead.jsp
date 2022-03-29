<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>saving lead</title>
</head>
<body>
<h2>Lead ! create new lead</h2>
<hr>
<form action="savelaed" method="post">

<pre>
first name<input type="text" name="firstName" required/>
last name<input type="text" name="lasttName" required/>
email <input type="email" name="email" required/>
mobile <input type="text" name="mobile" required/>
<select name="leadSource" required>
		<option value="News Papper">news papper</option>
		<option value="Radio">Radio</option>
		<option value="Television">Television</option>
		<option value="online">online</option>
</select>
<input type="submit" value="save" />

</pre>
</form>
</body>
</html>