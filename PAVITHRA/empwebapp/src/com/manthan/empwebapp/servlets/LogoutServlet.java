package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if (session != null) {
			session.invalidate();
			PrintWriter out=resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("logged out");
			
			req.getRequestDispatcher("./Login.html").include(req, resp);
			out.print("</body>");
			out.print("</html>");
			
		}
		else
		{
			req.getRequestDispatcher("./Login.html").include(req, resp);
		}
	}

}
