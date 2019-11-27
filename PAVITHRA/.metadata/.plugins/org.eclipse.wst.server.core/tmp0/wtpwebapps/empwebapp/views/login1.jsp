<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%  String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null){ %>
<%= msg %>
<%} %>

<fieldset>
<legend>login</legend>
	<form action="./login1" method="post">
		<table border='2'>
			<tr>
				<td>username</td>
				<td><input type="text" name="username" /></td>
			</tr>

			<tr>
				<td>password</td>
				<td><input type="password" name="pw" /></td>
			</tr>
			
			<tr>
			<td colspan="3" align="center">
			<input type="submit" value="login">
			</td>
			</tr>
			
			<tr>
			<td colspan="3" align="center">
			<input type="reset">
			</td>
			</tr>
					</table>
		</form>
		</fieldset>
</body>
</html>