<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance Info</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top:50px">
<div class="container">
<h2>Account info</h2>
<hr>
<br>
<%
String uid=session.getAttribute("userid").toString();
//out.println("userid :"+uid);
Connection con;
PreparedStatement pst;
ResultSet rs;
int ano=0;
double bal=0.0;

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
	
	ano=(Integer) session.getAttribute("accno");
	pst=con.prepareStatement("select * from accounts where accno=?");
	pst.setInt(1,ano);
	rs=pst.executeQuery();
	rs.next();
	bal=rs.getDouble("balance");
	con.close();
}
catch(Exception e){
	System.out.print(e);
}
%>

<div class="contaoner" style="color:blue">
	Account Number : <%=ano %>
	<br>
	User id : <%=uid %>
	<br>
	Balance : <%=bal %>
</div>

<a href=Customer.jsp>HOME</a>

</div>


</body>
</html>