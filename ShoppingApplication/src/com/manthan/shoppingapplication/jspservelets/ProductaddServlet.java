package com.manthan.shoppingapplication.jspservelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapplication.dao.ProductInfoDao;
import com.manthan.shoppingapplication.dao.ProductInfoDaoImp;
import com.manthan.shoppingappliction.bean.ProductInfoBean;
@WebServlet("/productadd")
public class ProductaddServlet extends HttpServlet {
	
	
	ProductInfoDao dao = new ProductInfoDaoImp();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null) {
			
			ProductInfoBean ProductInfoBean = new ProductInfoBean();
			
			

		  int productid=Integer.parseInt(req.getParameter("product_id"));
		  
	      String productName=req.getParameter("product_name");
	      String productcolor=req.getParameter("product_color");
	      String desc=req.getParameter("description");
	      int num=Integer.parseInt(req.getParameter("number_of_products"));
	      double cost=Double.parseDouble(req.getParameter("product_cost"));
	      
	      ProductInfoBean.setProductId(productid);
	      ProductInfoBean.setProductName(productName);
	      ProductInfoBean.setDescription(desc);
	      ProductInfoBean.setNumberOfProducts(num);
	      ProductInfoBean.setProductColor(productcolor);
	      ProductInfoBean.setProductCost(cost);
	   
	      if(dao.register(ProductInfoBean)) {
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
