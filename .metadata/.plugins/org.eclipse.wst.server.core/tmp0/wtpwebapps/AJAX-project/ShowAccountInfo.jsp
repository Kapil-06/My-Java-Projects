<%@page import="com.kapil.beans.AccountInfoFinder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AccountDetails</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
    <br>
        <h6>Your Account Details</h6>
        
        <br>
        <%
        int accno=Integer.parseInt(request.getParameter("accno"));
        AccountInfoFinder af=new AccountInfoFinder();
        af.setAccno(accno);
        %>
        <div class="container">
        Account No : <%=accno %><br>
        Name : <%=af.getAccnm() %><br>
        Type : <%=af.getAcctype() %><br>
        Balance : <%=af.getBalance() %>
        </div>
		
    </div>

</body>
</html>