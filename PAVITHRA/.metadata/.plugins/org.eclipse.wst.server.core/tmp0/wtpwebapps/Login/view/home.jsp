<%@page import="com.manthan.bean.userinfobean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%userinfobean userinfobean=(userinfobean)session.getAttribute("userinfobean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3 style="color: navy;"> hello <%=userinfobean.getAge()%>! </h3>
<h3 style="color: navy;"> hello <%=userinfobean.getGender()%>! </h3>


	
	<a href="./updateform"> update password</a><br>
	
	<a href="./logout"> logout</a>
</body>
</html>