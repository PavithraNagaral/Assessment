package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	
	
	
	
	public MyFirstServlet() {
		System.out.println("instation phase");
	}
	@Override
	public void init() throws ServletException {
		System.out.println(" its init ");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" unside doget");
		Date d=new Date();
		
		PrintWriter out=resp.getWriter();
		// resp.setHeader("refresh", "1");
		ServletConfig confi=getServletConfig();
		String s=confi.getInitParameter("message");
		
		ServletContext context=getServletContext();
		String ss=context.getInitParameter("countrycode");
		out.print("<html>");
		//out.print("<head>");
		//out.print("<meta http-equiv='refresh' content='2'>");
		//out.print("</head>");
		out.print("<body>");
		out.print("<h1> current date and time <br>" +d +"</h1>");
		out.println(s);
		out.println(ss);
		out.print("</body>");
		out.print("</html>");
	}

}// class
