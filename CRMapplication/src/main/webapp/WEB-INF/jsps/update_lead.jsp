<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateddetails" method="post">
<pre>
id <input type="text" name="id" value="${lead.id}"  >
last name<input type="text" name="firstName" value="${lead.firstName}" />
last name<input type="text" name="lasttName" value="${lead.lasttName}"/>
email <input type="email" name="email" value="${lead.email}" />
mobile <input type="text" name="mobile" value="${lead.mobile}" />
<select name="leadSource" >
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