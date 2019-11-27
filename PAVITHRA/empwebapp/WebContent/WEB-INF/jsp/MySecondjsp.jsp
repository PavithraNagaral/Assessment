<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%!
   int a=100;
   public int geta()
   {
	   return a;
   }
   public void seta()
   {
	   this.a=a;
   }
   
   String name="kunal";
   public String getname()
   {
	   return name;
	   
   }
   
   public String getname(String givenname)
   {
	   return givenname;
   }
   
   public void setname(String name)
   {
	   this.name=name;
   }
   %>






<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%boolean istrue=true; %>
	<h2>hello user</h2>

	a1=<%=a %><br>
	 a2=<%=geta() %><br>
	  name1=<%=name %>
	name2=<%=getname() %>
	name3=<%=getname("abcd") %>
	
	<%for(int i=0;i<4;i++){ %>
	<%=getname("abcd") %>
	<%} %>

</body>
</html>


<%--<jsp:forward page="date.html"></jsp:forward> --%><%--static resource ie html pages --%>

<%--<jsp:forward page="/myfirstservlet"/> --%> <%-- dynamic resource ie servlets --%>
<jsp:include page="/WEB-INF/jsp/date.html"/>
