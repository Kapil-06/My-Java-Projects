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
<%	
	String uid=session.getAttribute("userid").toString(); 

%> 
    <div class="container">
        <h4 style="color:rgb(31, 73, 75);">Account Holder Home</h4>
        <hr>
           <marquee width="100%" behavior="alternate"  bgcolor="pink" style="color:darkblack"> Welcome <%=session.getAttribute("userid") %> to your Account </marquee>
            <hr><br><br>
            <table style="border:1px solid none; width:35%">
                <tr>
                    <td>
                        <div class="rounded-circle" style="width: 110px; height: 110px; overflow: hidden; ">
                            <img src="Images/<%=uid %>.jpg" alt="Image" class="img-fluid">
                        </div>
                    </td>
                    <td>
                        <ul>
                        	<br>
                        	<li> Accountant Name : <%=session.getAttribute("usernm") %>
                        	<li> Account Number : <%=session.getAttribute("accno") %>
                        	<li> Account Type : <%=session.getAttribute("acctype") %>
                        	<li> Session Id : <%=session.getId() %>
                            <li><a href="FindBalance.jsp">Check Balance</a>
                            <li><a href="TakeChoice.html">Take A choice for cookies</a>
                            <li><a href="ShowCookie.jsp">Show My Cookie</a>
                        </ul>
                    </td>
                </tr>
            </table>
          
            
           
        <br>
        <br>
        <ul>
        	
        </ul>
        <a href="Logout.jsp">Logout</a>
    </div>
</body>
</html>