<%@page import="com.kapil.beans.AccountFinder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
    <br>
        <h5>Your Account Details</h5>
        <hr>
        <br>
        <%
        int accno=Integer.parseInt(request.getParameter("accno"));
        AccountFinder af=new AccountFinder();
        af.setAccno(accno);
        %>
		<div style="margin-left:20px">
		Account No. : <%=accno %>
		<br>
		Name : <%=af.getAccnm() %>
		<br>
		Type : <%=af.getAcctype() %>
		<br>
		Balance : <%=af.getBalance() %>
		</div>
    </div>


</body>
</html>