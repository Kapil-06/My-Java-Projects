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
	
	<h3>Customer Account Reports</h3>
	<a href="Manager.jsp">Home</a>
	<hr>
		<table class="table table-bordered table-hover">
			<tr style="background-color: rgb(224, 178, 201);">
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
					while(rs.next())
					{
					%>
						<tr>
							<td><%=rs.getInt("accno") %></td>
							<td><%=rs.getString("accnm") %></td>
							<td><%=rs.getString("acctype") %></td>
							<td><%=rs.getDouble("balance") %></td>
						</tr>
					<%
					}
					con.close();
				}
				catch(Exception e){
					System.out.print(e);
				}
			%>
			
		</table>
			
	</div>

</body>
</html>