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
@WebServlet("/addemp")
public class addemp extends HttpServlet {
	
	private Employeedao dao=new EmployeeDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null)
		{
			int empid=Integer.parseInt(req.getParameter("empid"));
			String empname=req.getParameter("empname");
			int age=Integer.parseInt(req.getParameter("age"));
			Double salary=Double.parseDouble(req.getParameter("salary"));
			String designation=req.getParameter("designation");
			long mobile=Long.parseLong(req.getParameter("mobile"));

			Employeeinfobean employeeinfobean=new Employeeinfobean();
			employeeinfobean.setEmpid(empid);
			employeeinfobean.setEmpname(empname);
			employeeinfobean.setAge(age);
			employeeinfobean.setSalary(salary);
			employeeinfobean.setDesignation(designation);
			employeeinfobean.setMobile(mobile);
			
			if(dao.addemp(employeeinfobean)) {
				req.setAttribute("msg", "employeee added");
			}
			else {
				req.setAttribute("msg", "failed to insert");
			}
			req.getRequestDispatcher("/addemployeeform").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please login");
			req.getRequestDispatcher("/loginform").forward(req, resp);
		}
	}

}
