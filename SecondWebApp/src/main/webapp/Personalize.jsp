<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Data</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body Style="margin-top:50px">
<%
String nm, gndr, gnre;
nm=request.getParameter("unm");
gndr=request.getParameter("gen");
gnre=request.getParameter("genre");
%>

<div class="container">
<h2>Personalize JSP response</h2>
<hr>
<%
if(gndr.equals("male"))
{
%>
<span style="color:blue; font-size:15px">
Welcome Mr. <%=nm%> to JSP
</span>
<%
}
else{
%>
<span style="color:red; font-size:15px">
Welcome Ms. <%=nm%> to JSP
</span>
<% }
%>
<br> <br>
 
 <%
switch("gnre")
{
case "action" :
%>
   <iframe width="560" height="315" src="https://www.youtube.com/embed/2m1drlOZSDw" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
  <% break;
   
   case "comedy" :
  %> <iframe width="560" height="315" src="https://www.youtube.com/embed/_0a998z_G4g" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	<%break;
	
	default:
%>	<iframe width="560" height="315" src="https://www.youtube.com/embed/M5MJC5Lt_bI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	<%
}
%>

</div>

</body>
</html>