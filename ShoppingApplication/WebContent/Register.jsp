<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%  String msg =(String)request.getAttribute("msg");
 %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if (msg!=null && !msg.isEmpty()) { %>

<h2><%=msg %></h2>
<%} %>
<form action="./Register" method="post">



<table>
			<tr>
				<td>User Id</td>
				<td>:</td>
				<td><input type="text" name="UserId" required></td>
			</tr>

			<tr>
				<td>User Name</td>
				<td>:</td>
				<td><input type="text" name="User_Name" required></td>
			</tr>

			<tr>
				<td>email</td>
				<td>:</td>
				<td><input type="text" name="email" required></td>
			</tr>

			

			<tr>
				<td>password</td>
				<td>:</td>
				<td><input type="password" name="password" required></td>
			</tr>

		

			<tr>

				<td colspan="3" align="center"><td><input type="submit" name="Register" required>
			</td></tr>

		</table>







</form>
</body>
</html>