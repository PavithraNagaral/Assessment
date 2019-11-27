package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet 
public class GetEmployee2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empvalueid=req.getParameter("empid");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>  ");
		out.println("<h1><i> employee details for " +empvalueid+"</i> </h1>");
		out.println("<i><b>employee id=101</b></i> <br>");
		out.println("<i><b>employee name=oooo</b></i> <br>");
		out.println("</body>");
		out.println("</html>");
	}

}
