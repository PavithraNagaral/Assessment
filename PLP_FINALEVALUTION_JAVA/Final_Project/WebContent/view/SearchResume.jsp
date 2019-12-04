<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%ArrayList<File> array =(ArrayList<File>) request.getAttribute("filearr"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Resume</title>
<style type="text/css">
P.{font-style: italic; color: blue}
</style>
</head>
<body>
	<form action="./search2"  method="get" enctype="multipart/form-data">
	<h3 align="right"><a href = "./Upload "> Upload Resume</a></h3>
	<h2 align="center" style="font-family:verdana;"><u>Search Resume</u></h2><br>
	<p align="center"><input type="text" name="search" required></p>
	<p align="center"> <input type="submit"  value="search" /></p>
	</form>
	<%if(array!=null) {%>
		<%
		for(File f:array){
		%>
	 	<p align="center"><%=f.getName()%>&emsp;
	 	<a href="download2?filename=<%=f.getName()%>" >Download Resume</a>
	 	</p>
	<%}%>
    <%}%>
</body>
</html>