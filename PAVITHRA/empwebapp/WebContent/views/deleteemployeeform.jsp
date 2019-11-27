<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%String msg=(String)request.getAttribute("msg"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
<h3><%=msg %></h3>
<%} %>

<form action="./delpage" method="post">
employee id:<input type="text" name="empid" />
<input type="submit" value="delete">
</body>
</html>