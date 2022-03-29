<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill information</title>
</head>
<body>
<h2>BILL GENERATIED</h2>
<H5>BILL INFORMATION</H5>

<pre>
id : ${bill.id}
first name : ${bill.firstName}
last name : ${bill.lasttname}
contact's email : ${bill.email}
contact's mobile : ${bill.mobile}

product name : ${bill.productName}
tota; bill amount : ${bill.amount}
</pre>


</body>
</html>