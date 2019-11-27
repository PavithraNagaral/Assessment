<%@page import="com.manthan.empwebapp.beans.Employeeinfobean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% Employeeinfobean employeeinfobean=(Employeeinfobean)session.getAttribute("employeeinfobean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h3 style="color: navy;"> hello <%=employeeinfobean.getEmpname()%>! </h3>
	<a href="./searchpage"> search employee</a><br>
	<a href="./addemployeeform"> add employee</a><br>
	<a href="./updateemployeeform"> update employee</a><br>
	<a href="./deleteemployeeform"> delete employee</a><br>
	<a href="./seeallemployeeform"> see employee</a><br>
	<a href="./logout"> logout</a>
	
	
</body>
</html>