package com.manthan.project.jspservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.project.daoObj.Userdao;
import com.manthan.project.userbean.UserBean;

@WebServlet("/register")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			Userdao dao=new Userdao();
			
			UserBean bean=(UserBean) session.getAttribute("userBean");
			
			String name=req.getParameter("name");
			int age=Integer.parseInt(req.getParameter("age"));
			String gender=req.getParameter("gender");
			UserBean userbean=new UserBean();
			
			userbean.setName(name);
			
			userbean.setgender(gender);
			userbean.setAge(age);
			
			if(dao.register(userbean)) {
				req.setAttribute("msg", "Registered successfully");
			}
			else {
				req.setAttribute("msg", "Failed to register");
			}
			req.getRequestDispatcher("/Register.jsp").forward(req, resp);
			
		}
		else {
			req.setAttribute("msg", "Please login again");
			req.getRequestDispatcher("./LoginFile").forward(req, resp);
		}
	}
}
