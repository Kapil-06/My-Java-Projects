<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.kapil.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show result</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
        <h3>Student Result</h3>
        <hr>
        <br>
        <%
        String nm, sb;
        int mks;
        
        nm=request.getParameter("snm");
        sb=request.getParameter("sub");
        mks=Integer.parseInt(request.getParameter("mrks"));
        
        StudentResult sr=new StudentResult();
        sr.setMarks(mks);
        
        %>
        
        Student name : <%=nm %>
        <br>
        subject : <%=sb %>
        <br>
        Marks : <%=mks %>
        <br>
        <b>
        Result : <%=sr.getResult() %>
        </b>
</body>
</html>