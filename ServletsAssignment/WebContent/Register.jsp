<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
<form action="./register" method="post">
		<table>
			
			<tr>
				<td>Username</td>
				<td>:</td>
				<td><input type="text" name="Name" required></td>
			</tr>
			
			<tr>
				<td>Designation</td>
				<td>:</td>
				<td><input type="text" name="designation" required></td>
			</tr>
			
			<tr>
				<td>age</td>
				<td>:</td>
				<td><input type="number" name="Age" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>