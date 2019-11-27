
package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.Employeeinfobean;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;
import com.manthan.empwebapp.dao.Employeedao;
import com.manthan.empwebapp.util.EmpDaoMgr;
@WebServlet("/xyz")

public class Searchemp extends HttpServlet {
	//private Employeedao dao=new EmployeeDAOImpl();
	private Employeedao dao=EmpDaoMgr.getDaoIns();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id=Integer.parseInt(req.getParameter("empid"));

		Employeeinfobean employeeinfobean=dao.searchemployee(id);

		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");

		if (employeeinfobean != null) {
			out.print("<h2> employee id"+id+"found</h2>");
			out.print("<br>emplouee name"+employeeinfobean.getEmpname());
			out.print("<br> employee age"+employeeinfobean.getAge());



		}//if
		else
		{
			out.print("not found for this" +id );
		}//else

		out.print("</body>");
		out.append("</html>");
		out.close();
	}

}
