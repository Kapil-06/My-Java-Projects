<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*;" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AccountReport</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body class="margin-top:50px">
	<div class="container">
	<%
		if(session.getAttribute("userid")!=null && session.getAttribute("usertype").equals("manager"))
		{
	%>
	<h3>Customer Account Reports</h3>
	<a href="Manager.jsp">Home</a>
		<table class="table table-bordered">
			<tr>
				<th>Account Number</th>
				<th>Name</th>
				<th>Account Type</th>
				<th>Balance</th>
			</tr>
			<%
				Connection con;
				Statement st;
				ResultSet rs;
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://bhod7pw8rcgxeqwgoffi-mysql.services.clever-cloud.com:3306/bhod7pw8rcgxeqwgoffi?user=ukdmlq4nnteyuvfo&password=stZ2gABP50qLdTH0RS3Q");
					st=con.createStatement();
					rs=st.executeQuery("Select * from accounts");
					while(rs.next()){
					%>
						<tr>
							<td><%=rs.getInt("accno") %></td>
							<td><%=rs.getString("accname") %></td>
							<td><%=rs.getString("acctype") %></td>
							<td><%=rs.getDouble("balance") %></td>
						</tr>
					<%
					}
				}
				catch(Exception e){
					System.out.print(e);
				}
			%>
			
		</table>
		<%
		}
		else{
			%>
			<h3>Session Invalid</h3>
			<hr>
			<h3>Please Login Again to See the Information</h3>
			<br>
			<a href="AdminLogin.jsp">Login</a>
			<%
		}
		%>
	</div>

</body>
</html>