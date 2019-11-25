<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>User login</legend>
		<form action="./loginJsp" method="post">
			<table>
				<tr>
					<td>UserName</td>
					<td>:</td>
					<td><input type="text" name="username" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				
				<td colspan="3"><br /> <input type="submit" value="Login"></td>
				<td colspan="3"><br /> <input type="reset" value="Reset"></td>
				
				</tr>

			</table>
			<a href=""> Forgot Password</a>
		</form>

	</fieldset>
	<a href='./Register.jsp'>Register</a></br>
</body>
</html>