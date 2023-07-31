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
        <h1 class="display-4">Search Result</h1>
        <hr>
        <%
        String dp=request.getParameter("dept");
        %>
        <b>Department : <%=dp%></b>
        <br><br>
        
        <%
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
        Session ses=sf.getCurrentSession();
        ses.beginTransaction();
        
        Query<Employee> q=ses.createQuery("from Employee where dept= :dep");
        q.setParameter("dep",dp);
        List<Employee> lst=q.getResultList();
        Employee e;
        
        out.println("<ul>");
        for(int i=0;i<lst.size();i++)
        {
        e=lst.get(i);
        out.println("<li>"+e.getEmpnm()+" | "+e.getPost()+" | "+e.getSalary());
        }
        out.println("</ul>");
        %>
		
        </div>

</body>
</html>