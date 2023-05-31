<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>YourCookie</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;">
    <div class="container">
        <h2>Your Cookie.....</h2>
        <hr>
        <%
        Cookie c[]=request.getCookies();
        if(c!=null){
        	for(int i=0;i<c.length;i++){
        		out.println("<br> Name : "+c[i].getName());
        		out.println("  | Value : "+c[i].getValue());
        	}
        }
        %>
    </div>

</body>
</html>