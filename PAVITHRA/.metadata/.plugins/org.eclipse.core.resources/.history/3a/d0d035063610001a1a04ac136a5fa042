<%@page import="com.manthan.empwebapp.beans.Employeeinfobean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%Employeeinfobean employeeinfobean=(Employeeinfobean)request.getAttribute("searchemployee"); 
    
    String msg=(String)request.getAttribute("msg");
    
    
    %>
    
    <<jsp:include page="/home"></jsp:include>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>search employee</legend>
	<form action="./searchemp" method="get">
	employee id: <input type="text" name="empid"  required><br> <br>
	<input type="submit" value="search">
	
	
	</form>
	
	
	</fieldset>
	
	<%if(msg!=null && !msg.isEmpty()){ %> 
	<h3 style="color: red"><%=msg %></h3>
	
	<%} %>
	
	<%if( employeeinfobean!=null){ %>
	
	<table>
	<tr>
	<td> employee id</td>
	<td> :</td>
	<td> <%=employeeinfobean.getEmpid() %>
	</td>
	</tr>
	
	<tr>
	<td> employee name</td>
	<td> :</td>
	<td> <%=employeeinfobean.getEmpname() %>
	</td>
	</tr>
	
	<tr>
	<td> employee age</td>
	<td> :</td>
	<td> <%=employeeinfobean.getAge() %>
	</td>
	</tr>
	
	
	<tr>
	<td> employee salary</td>
	<td> :</td>
	<td> <%=employeeinfobean.getSalary() %>
	</td>
	</tr>
	
	
	<tr>
	<td> employee mobile</td>
	<td> :</td>
	<td> <%=employeeinfobean.getMobile() %>
	</td>
	</tr>
	
	
	<tr>
	<td> employee designation</td>
	<td> :</td>
	<td> <%=employeeinfobean.getDesignation() %>
	</td>
	</tr>
	
	
	
	
	</table>
	<%} %>
	
</body>
</html>