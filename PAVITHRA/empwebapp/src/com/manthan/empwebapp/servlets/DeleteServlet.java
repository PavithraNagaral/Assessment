package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.Employeeinfobean;
import com.manthan.empwebapp.dao.Employeedao;
import com.manthan.empwebapp.util.EmpDaoMgr;

@WebServlet("/del")
public class DeleteServlet extends HttpServlet {
	private Employeedao dao=EmpDaoMgr.getDaoIns();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empid=Integer.parseInt(req.getParameter("empid"));
		Employeeinfobean employeeinfobean=new Employeeinfobean();
		employeeinfobean.setEmpid(empid);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		resp.setContentType("text/html");
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
			if(dao.delete(empid))
			{
				out.print("successfully deleted"+empid);
			}
			else {
				out.print("not success");
			}
			}
		else {
			out.print("unable to login");
			req.getRequestDispatcher("./Login.html").include(req, resp);
		}out.print("</body>");
			out.print("</html>");
			
	}
		
		

		 
	}


