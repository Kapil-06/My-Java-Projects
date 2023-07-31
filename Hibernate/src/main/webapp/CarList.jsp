<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.hibernate.*" %>
    <%@page import="org.hibernate.cfg.*" %>
    <%@page import="org.hibernate.query.Query" %>
    <%@page import="java.util.*" %>
    <%@page import="com.praffull.entities.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 45px;">
    <div class="container">
        <h1 class="display-4">List of cars</h1>
        <hr>
<table class="table table-bordered table-hover">
    <tr>
        <th>CarID</th>
        <th>Model Name</th>
        <th>Brand</th>
        <th>Price</th>
    </tr>

    <%
	Configuration cfg=new Configuration().configure();
	SessionFactory sf=cfg.addAnnotatedClass(Product.class).buildSessionFactory();
	Session ses=sf.getCurrentSession();
	ses.beginTransaction();
	
	Query<Product> q=ses.createQuery("from Product");
	List<Product> lst=q.getResultList();
	
	Product p;
	
	for(int i=0;i<lst.size();i++)
	{
		p=lst.get(i);
		%>
		<tr>
            <td><%=p.getCarid() %></td>
            <td><%=p.getCarnm() %></td>
            <td><%=p.getCompany() %></td>
            <td><%=p.getPrice() %></td>
        </tr>
		
		<%
		
	}
    %>

</table>
        </div>
</body>
</html>