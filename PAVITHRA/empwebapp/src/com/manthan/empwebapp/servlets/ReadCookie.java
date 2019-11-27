package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookie")
public class ReadCookie extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c=req.getCookies();
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.print("<h2> cookie added</h2>");
		for(Cookie cookie:c)
		{
			out.print(cookie.getName());
			out.print(cookie.getValue());
		}
		
		//for(int i=0;i<c.length;i++)
		//{
			//out.prin
		//}
		out.println("</body>");
		out.println("</html>");
	}

}
