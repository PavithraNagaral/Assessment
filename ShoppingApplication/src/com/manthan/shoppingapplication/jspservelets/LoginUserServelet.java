package com.manthan.shoppingapplication.jspservelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapplication.dao.UserInfoDao;
import com.manthan.shoppingapplication.dao.UserInfoDaoImp;
import com.manthan.shoppingappliction.bean.UserInfoBean;


@WebServlet("/loginuser")
public class LoginUserServelet extends HttpServlet{
	
	UserInfoDao dao = new UserInfoDaoImp();

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		UserInfoBean userInfoBean = dao.authenticate(email, password);
		
		
		if(userInfoBean!=null) {
			
			HttpSession session=req.getSession(true);
			session.setAttribute("userInfoBean", userInfoBean);
			req.getRequestDispatcher("./homepage").forward(req,resp);
		}
		else {
			req.setAttribute("msg", "Invalid credentials!!!");
			
			
			req.getRequestDispatcher("/loginuser").forward(req, resp);
		}
		
				
		

	
	}

}
