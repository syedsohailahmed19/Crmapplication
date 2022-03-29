<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>

<h2>Bill The Amount</h2>
<form action="savebill" method="post">
<pre>

first name<input type="text" name="firstName" value="${contact.firstName}"/>
last name<input type="text" name="Lasttname" value="${contact.lasttName}"/>
email <input type="email" name="email" value="${contact.email}"/>
mobile <input type="text" name="mobile" value="${contact.mobile}"/>
product name <input type="text" name="productName" />
amount <input type="text" name="amount" />
<input type="submit" value="bill" />

</pre>
</form>
</body>
</html>