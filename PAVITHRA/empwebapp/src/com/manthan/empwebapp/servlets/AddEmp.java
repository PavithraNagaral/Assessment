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
@WebServlet("/qq")
public class AddEmp extends HttpServlet {

	private Employeedao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session=req.getSession(false);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		
			


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
			if(session!=null) {
				Employeeinfobean bean=(Employeeinfobean) session.getAttribute("employeeinfobean");

			if(dao.addemp(employeeinfobean))
			{
				out.print("success");
				out.print("<h3> thanks "+bean.getEmpname()+"added");
			}
			else {
				out.print("not success");
				out.print("<h3>"+bean.getEmpname()+" unable to add");
			}
			}
		else {
			out.print("unable to login");
			req.getRequestDispatcher("./Login.html").include(req, resp);
		}out.print("</body>");
			out.print("</html>");
			
	}

}
