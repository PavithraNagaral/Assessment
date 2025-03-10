package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.Employeeinfobean;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;
import com.manthan.empwebapp.dao.Employeedao;

@WebServlet("/searchemp12")

public class searchjsp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			int emp_id=Integer.parseInt(req.getParameter("empid"));
			Employeedao dao=new EmployeeDAOImpl();
			Employeeinfobean employeeinfobean=dao.searchemployee(emp_id);
			if(employeeinfobean!=null)
			 {
				 session.setAttribute("searchemployeeform", employeeinfobean);
			
		}
			else {
				req.getRequestDispatcher("msg");
			}
			req.getRequestDispatcher("./searchpage").forward(req, resp);
	}
		else {
			req.setAttribute("msg","loginfirst");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
			
		}
	

}

