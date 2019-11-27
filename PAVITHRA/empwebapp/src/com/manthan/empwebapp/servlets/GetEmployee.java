package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployee extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		ServletContext context=getServletContext();
		String ss=context.getInitParameter("countrycode");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1><i> employee details</i> </h1>");
		out.println("<i><b>employee id=101</b></i> <br>");
		out.println("<i><b>employee name=oooo</b></i> <br>");
		out.print(ss);
		out.println("</body>");
		out.println("</html>");
	}

}
