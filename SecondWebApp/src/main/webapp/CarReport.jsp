<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top:50px">
<div class="container">
	<h2 class="display-4">Car Report</h2>
	<a href="index.html">Home</a>
	
	<hr>
	
	<table class="table table-bordered table-hover">
	<tr style="background-color:pink">
	<th>Model
	<th>Company
	<th>Price
	</tr>
	
	<%
	Connection con;
	Statement st;
	ResultSet rs;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
		st=con.createStatement();
		rs=st.executeQuery("Select * from cardetails");
		
		while(rs.next()){
	%>
		<tr>
		<td><%=rs.getString("carnm") %>
		<td><%=rs.getString("company") %>
		<td><%=rs.getDouble("price")%>
		</tr>
	<%
		}
		con.close();
	}
	catch (Exception e){
		out.println("error in code");
		System.out.println(e);
	}
	%>
	
	</table>
	
</div>

</body>
</html>