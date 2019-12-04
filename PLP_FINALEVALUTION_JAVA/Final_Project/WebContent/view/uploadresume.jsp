<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search file</title>
</head>
<body>
    <form action="./Upload3"  method="post" enctype="multipart/form-data">
    <h3 align="right"><a href = "./search"> Search Resume</a></h3>

    <h2 align= "center" style="font-family:verdana;"><u>Upload Resume</u></h2><br>
    <p align= "center"><input type="file" name="filename" multiple/></p>
    <p align= "center"><input type="submit"  value="Upload" /></p>

    </form>
    <%if(msg!=null) {%>
    <h3 align="center" style="font-family:cursive;"><%=msg%></h3>
    <%} %>
    
</body>
</html>