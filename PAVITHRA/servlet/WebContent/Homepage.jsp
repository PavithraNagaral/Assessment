
<%@page import="com.manthan.project.userbean.UserBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <% UserBean user=(UserBean)session.getAttribute("userBean");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset></fieldset>
<h3>Hello!! <%=user.getName() %> !!</h3><br>
<h3>Age : <%=user.getAge() %> !!</h3><br>
<h3>Gender : <%=user.getgender() %> !!</h3><br>

<a href='./Register.jsp'>Register</a></br>
<a href='./LoginFile.jsp'>Logout!!</a></br>

</fieldset>
</body>
</html>