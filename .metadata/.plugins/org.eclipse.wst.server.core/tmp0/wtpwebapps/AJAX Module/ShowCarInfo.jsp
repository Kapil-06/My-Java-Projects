<%@page import="java.util.ArrayList"%>
<%@page import="com.kapil.beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CarInfo</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
        <h4>Car Details</h4>
        <hr>
        
        <table class="table table-bordered table-hover">
            <tr style="background-color: rgb(238, 171, 171);">
                <th>ProductID</th>
                <th>Model</th>
                <th>Company</th>
                <th>Price</th>
            </tr>
            <%
            String company=request.getParameter("company");
            
            CarInfoFinder cf=new CarInfoFinder();
            cf.setCompany(company);
        
            ArrayList<Car> list=cf.getCarlist();
            out.println("Total Model : "+list.size());
            for(int i=0; i < list.size(); i++)
            {
            %>
            <tr>
                <td><%=list.get(i).getProdid() %></td>
                <td><%=list.get(i).getProdnm() %></td>
                <td><%=company %></td>
                <td><%=list.get(i).getPrice() %></td>
            </tr>
        
            <%
        	}
        	%>
        </table>
    </div>
</body>
</html>