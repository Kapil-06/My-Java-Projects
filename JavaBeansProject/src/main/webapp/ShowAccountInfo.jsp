<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.kapil.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accountinfo</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
        <h3>Account Details</h3>
        <hr>
        <br>
        <%
        int accno;
        double bal;
        String anm, atyp;
        
        accno=Integer.parseInt(request.getParameter("ano"));
        AccountFinder af=new AccountFinder();
        af.setAccno(accno);
        %>
        Accountant Name : <%=af.getAccnm() %>
        <br>
        Account Type : <%=af.getAtype() %>
        <br>
        Account No. : <%=accno %>
        <br>
        Balance : <%=af.getBal() %>
        <br>
        <br>
        <a href="index.jsp">Home</a>
    </div>
</body>
</html>