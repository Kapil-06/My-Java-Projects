<%@page import="com.kapil.beans.CheckAccountName"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AmountTransfer</title>
<link rel="stylesheet" href="bootstrap.min.css">
<body style="margin-top: 50px;">
<div class="container">

    <%
    int no=Integer.parseInt(request.getParameter("accno"));
    System.out.println(no);
    
    CheckAccountName an=new CheckAccountName();
    an.setNo(no);
    
    %>
    
	<%=an.getNm() %>
</div>
</body>
</html>