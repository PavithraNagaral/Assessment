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
<form action="./productadd" method="post">



<table>
			<tr>
				<td>product Id</td>
				<td>:</td>
				<td><input type="number" name="Id" required></td>
			</tr>

			<tr>
				<td>Product Name</td>
				<td>:</td>
				<td><input type="text" name="Name" required></td>
			</tr>

			<tr>
				<td>product cost</td>
				<td>:</td>
				<td><input type="number" name="cost" required></td>
			</tr>
			
			<tr>
				<td>product colour</td>
				<td>:</td>
				<td><input type="text" name="color" required></td>
			</tr>

			<tr>
				<td>Description</td>
				<td>:</td>
				<td><input type="text" name="disc" required></td>
			</tr>

			<tr>
				<td>number</td>
				<td>:</td>
				<td><input type="number" name="num" required></td>
			</tr>

			

		

		

			<tr>

				<td colspan="3" align="center"><td><input type="submit" name="Product_add" required>
			</td></tr>

		</table>







</form>
</body>
</html>