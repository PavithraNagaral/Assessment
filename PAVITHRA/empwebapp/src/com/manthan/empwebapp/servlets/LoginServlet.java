package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.Employeeinfobean;
import com.manthan.empwebapp.dao.Employeedao;
import com.manthan.empwebapp.util.EmpDaoMgr;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	
	Employeedao dao=EmpDaoMgr.getDaoIns();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int empid= Integer.parseInt(req.getParameter("empid"));
		 String password=req.getParameter("password");
		 
		 Employeeinfobean employeeinfobean=dao.authenticate(empid, password);
		 PrintWriter out=resp.getWriter();
		 out.print("<html>");
		 out.print("<body>");
		 if(employeeinfobean!=null)
		 {
			
			 HttpSession session=req.getSession(true);
			 session.setAttribute("employeeinfobean", employeeinfobean);
			 out.print("<h2> welcome "+employeeinfobean.getEmpname()+"</h2>");
			 out.println("<a href='./AddEmp.html'> add new employee</a> <br>");
			 out.println("<a href='./search.html'> search new employee</a> <br>");
			 out.println("<a href='./Delete.html'> delete employee</a> <br>");
			 out.println("<a href='./Update.html'> update employee</a> <br>");
			 out.print("<a href='./logout'> logout</a>");
			 
		 }//if
		 else
		 {
			 out.println("invalid<br>");
			 req.getRequestDispatcher("./Login.html").include(req, resp);
			 out.print("</body>");
			 out.print("</html>");
		 }
	}
}
