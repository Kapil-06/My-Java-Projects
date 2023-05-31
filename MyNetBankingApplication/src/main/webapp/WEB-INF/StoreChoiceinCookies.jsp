<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StoreCookies</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
        <h2>User Choice</h2>
        <hr>
        <%
        String cho=request.getParameter("genre");
        Cookie c1=new Cookie("prefgenre",cho);
        response.addCookie(c1);
        %>
		Your choice is stored in cookie
		</div>
</body>
</html>