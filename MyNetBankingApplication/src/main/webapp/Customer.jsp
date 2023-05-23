<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top:50px">
<%String uid=session.getAttribute("userid").toString(); %>
    <div class="container">
        <h4 style="color:rgb(31, 73, 75);">Account Holder Home</h4>
        <hr>
            Welcome <%=session.getAttribute("userid") %> to your Account
            <br><br>
            <div class="rounded-circle" style="width: 150px; height: 150px; overflow: hidden; ">
               <img src="Images/<%=uid %>.jpg" alt="Image" class="img-fluid">
            </div>
            
            
            <ul>
            	Account Number : <%=session.getAttribute("accno") %>
            </ul>
        <br>
        <br>
        <ul>
        	<a href="FindBalance.jsp">Check Balance</a>
        </ul>
        <a href="Logout.jsp">Logout</a>
    </div>
</body>
</html>