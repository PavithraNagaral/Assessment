package com.manthan.empwebapp.servletsforjsp;

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
@WebServlet("/delpage")
public class deleteemployee extends HttpServlet {
	private Employeedao dao=EmpDaoMgr.getDaoIns();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			session.invalidate();
			int empid=Integer.parseInt(req.getParameter("empid"));
			
			
			if(dao.delete(empid))
			{
				req.setAttribute("msg", "employeee deleted");
			}
			else {
				req.setAttribute("msg", "not deleted");
			}
			req.getRequestDispatcher("./deleteemployeeform").forward(req, resp);
			}
		else {
			req.setAttribute("msg", "please login");
			
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
			
		}
		
		

}

