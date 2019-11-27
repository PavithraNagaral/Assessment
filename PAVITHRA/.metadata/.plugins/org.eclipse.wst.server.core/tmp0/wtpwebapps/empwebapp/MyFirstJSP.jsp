 <%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%!
  public void jspInit()
  {
    	System.out.println("inside jspinit()----------");
  }
    public void jspDestroy()
    {
    	System.out.println("inside destroy()");
    }
    
    %>
    
<% 

System.out.println("inside jspservice--------vvT");
// java code to generate dynamic code

Date date=new Date();
%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>  current date and time</h2>
<%=date %>
</body>
</html>