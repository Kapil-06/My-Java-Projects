<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.hibernate.*" %>
    <%@page import="org.hibernate.cfg.*" %>
    <%@page import="org.hibernate.query.Query" %>
    <%@page import="com.praffull.entities.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 45px;">
    <div class="container">
        <h1 class="display-4">Employee Report</h1>
        <hr>

        <table class="table table-bordered table-hover">
            <tr>
                <th>Employee Number</th>
                <th>Name</th>
                <th>Department</th>
                <th>Post</th>
                <th>Location</th>
                <th>Salary</th>
            </tr>

<%
Configuration cfg=new Configuration().configure();
SessionFactory sf=cfg.addAnnotatedClass(Employee.class).buildSessionFactory();
Session ses=sf.getCurrentSession();
ses.beginTransaction();

//from Employee -> select * from emp
Query<Employee> q=ses.createQuery("from Employee");
List<Employee> lst=q.getResultList();

Employee e;

for(int i=0;i<lst.size();i++)
{
e=(Employee) lst.get(i);

%>
<tr>
    <td><%=e.getEmpno() %></td>
    <td><%=e.getEmpnm() %></td>
    <td><%=e.getDept() %></td>
    <td><%=e.getPost() %></td>
    <td><%=e.getLocation() %></td>
    <td><%=e.getSalary() %></td>
    
</tr>

<%
}
%>


        </table>
        <a href="index.jsp">Home</a>
</div>
</body>
</html>