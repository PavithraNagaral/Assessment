package com.manthan.empwebapp.servlets;

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
@WebServlet("/searchemp")
public class Searchemployee extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			int empid=Integer.parseInt(req.getParameter("empid"));
			Employeedao dao=new EmployeeDAOImpl();
			Employeeinfobean employeeinfobean=dao.searchemployee(empid);
			
			
			if(employeeinfobean!=null)
			{
				req.setAttribute("searchemployee", employeeinfobean);
				
			}
			else
			{
				req.setAttribute("msg", "employee not found");
			}
			req.getRequestDispatcher("/searchemployeeform").forward(req, resp);
			
		}
		else {
			req.setAttribute("msg", "invalid details login first");
			req.getRequestDispatcher("/loginform").forward(req, resp);
		}
	}

}
