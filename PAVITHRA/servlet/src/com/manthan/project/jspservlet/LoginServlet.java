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

@WebServlet("/loginJsp")

public class LoginServlet extends HttpServlet {


Userdao dao=new Userdao();
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("username");
	String password=req.getParameter("password");

	UserBean userBean=dao.authenticate(name, password);
	if(userBean!=null) {
      HttpSession session=req.getSession(true);
      session.setAttribute("userBean", userBean);
      req.getRequestDispatcher("./Homepage.jsp").forward(req, resp);
	}
	else {
		
		req.setAttribute("msg", "Invalid credentials!!");
		req.getRequestDispatcher("./LoginFile.jsp").forward(req, resp);
	}
	
	
}
}
