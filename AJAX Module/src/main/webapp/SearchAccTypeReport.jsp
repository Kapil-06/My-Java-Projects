<%@page import="java.util.ArrayList"%>
<%@page import="com.kapil.beans.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AccountReport</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
	
        <%
        String type=request.getParameter("acctype");
        System.out.println(type);
        %>
		<h4><%=type %> Account report</h4>

        <table class="table table-borderd table-hover">
            <tr style="background-color: rgb(171, 226, 229);">
                <th>Account Number</th>
                <th>Name</th>
                <th>Type</th>
                <th>Balance</th>
            </tr>
            <%
            AccountTypeReport tr=new AccountTypeReport();
            tr.setAcctype(type);
            
            ArrayList<Account> list=tr.getAcclist();
            for(int i=0;i<list.size();i++)
            {
            %>
                <tr>
                    <td><%=list.get(i).getAccno() %></td>
                    <td><%=list.get(i).getAccnm() %></td>
                    <td><%=type %></td>
                    <td><%=list.get(i).getBalance() %></td>
                </tr>
            <%
            }
            %>
        </table>
    </div>
</body>
</html>