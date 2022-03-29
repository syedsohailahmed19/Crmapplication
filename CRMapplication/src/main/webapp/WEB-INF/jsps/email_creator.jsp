<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>email Composer</title>
</head>
<body>
<h2>Send Email</h2>
<form action="email" method="post">
<pre>
to <input type="email" name="email" value="${email}" />
sub <input type="text" name="subject" />
Message:
<textarea name="Message"  rows="10" cols="20"></textarea>
<input type="submit" value="send" />

</pre>
</form>

<div>
${msg}

</div>

</body>
</html>