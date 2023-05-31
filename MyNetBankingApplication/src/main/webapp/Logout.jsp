<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
<div class="container">
	<h3 class="display=5">You are Successfully logged out....</h3>
	<hr>
	<%session.invalidate(); %>
	<br>
	<a href="index.jsp">Back</a>
</div>

</body>
</html>