package com.manthan.shoppingapplication.dao;

import java.util.ArrayList;

import com.manthan.shoppingappliction.bean.OrderInfoBean;

public interface OrderInfoDao {
	
	public String addToCart(int productId,int userId, double price);
	public ArrayList<OrderInfoBean> getOrderHistory(int userId);

}
