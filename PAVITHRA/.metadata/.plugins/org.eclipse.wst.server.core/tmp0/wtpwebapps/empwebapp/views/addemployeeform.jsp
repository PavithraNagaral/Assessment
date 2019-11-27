<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%String msg=(String)request.getAttribute("msg"); %>
    <jsp:include page="/home"></jsp:include>
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
<form action="./addemp" method="post">
		<table>
			<tr>
				<td>empid</td>
				<td><input type="number" name="empid" /></td>
			</tr>

			<tr>
				<td>empname</td>
				<td><input type="text" name="empname" /></td>
			</tr>

			<tr>
				<td>empage</td>
				<td><input type="number" name="age" /></td>
			</tr>

			<tr>
				<td>empsalary</td>
				<td><input type="number" name="salary" /></td>
			</tr>

			<tr>
				<td>empdesignation</td>
				<td><input type="text" name="designation" /></td>
			</tr>

			<tr>
				<td>empmobile</td>
				<td><input type="number" name="mobile" /></td>
			</tr>
			
			<tr>
			<td colspan="3" align="center">
			<input type="submit" name="add">
			</td>
			</tr>

		</table>
	</form>
</body>
</html>