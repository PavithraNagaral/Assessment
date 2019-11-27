package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.Employeeinfobean;
import com.manthan.empwebapp.dao.Employeedao;
import com.manthan.empwebapp.util.EmpDaoMgr;

@WebServlet("/login2")
public class Loginservlet2 extends HttpServlet {

	Employeedao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empid=Integer.parseInt(req.getParameter("empid"));
		String password=req.getParameter("password");

		Employeeinfobean employeeinfobean=dao.authenticate(empid, password);

		if (employeeinfobean != null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeinfobean", employeeinfobean);
			req.getRequestDispatcher("./home").forward(req, resp);


		} else {
			req.setAttribute("msg", "invalid ");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}





	}//dopost

}//servlet
