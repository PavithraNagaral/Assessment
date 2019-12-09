package com.manthan.shoppingapplication.jspservelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapplication.dao.UserInfoDao;
import com.manthan.shoppingapplication.dao.UserInfoDaoImp;
import com.manthan.shoppingappliction.bean.UserInfoBean;

@WebServlet("/Register")
public class RegisterUserServelet {
	
	UserInfoDao dao = new UserInfoDaoImp();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null) {
			UserInfoBean userInfoBean = new UserInfoBean();

		  int userid=Integer.parseInt(req.getParameter("user_id"));
	      String userName=req.getParameter("user_name");
	      String email=req.getParameter("email");
	      String password=req.getParameter("password");
	    
	      userInfoBean.setUserId(userid);
	      userInfoBean.setUserName(userName);
	      userInfoBean.setEmail(email);
	      userInfoBean.setPassword(password);
	   
	      if(dao.register(userInfoBean)) {
	    	  req.setAttribute("msg", "User added success");
	      }
	      else {
	    	  req.setAttribute("msg", "Failed to insert record");
	      }
	      req.getRequestDispatcher("./Register1").forward(req, resp);
		}
		else {
	
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginuser").forward(req, resp);
		}
		
	}

}
