<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top:50px">
<div class="container">
 <h1 style="color:darkcyan">Welcome to my JSP page</h1>
 <hr>
 <%
 	String nm="Kapil Kadu";
 	out.println("My name is "+nm);
  
	Calendar cal=Calendar.getInstance();
	out.println("<br>Today : "+cal.getTime());
%>
</div>
</body>
</html>