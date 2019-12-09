package com.manthan.shoppingapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.manthan.shoppingappliction.bean.ProductInfoBean;
import com.manthan.shoppingappliction.bean.UserInfoBean;

public class ProductInfoDaoImp implements ProductInfoDao {

	@Override
	public boolean register(ProductInfoBean productInfoBean) {
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean isAdded=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart?user=root&password=root");

			String query="insert into product_info values (?,?,?,?,?,?)";

			pstmt=con.prepareStatement(query);


			pstmt.setInt(1,productInfoBean.getProductId());
			pstmt.setString(2, productInfoBean.getProductName());
			pstmt.setDouble(3, productInfoBean.getProductCost());
			pstmt.setString(4, productInfoBean.getProductColor());
			pstmt.setString(5, productInfoBean.getDescription());
			pstmt.setInt(1,productInfoBean.getNumberOfProducts());




			int n=pstmt.executeUpdate();
			if(n>0)
				isAdded=true;


		}
		catch(Exception e) {
			e.printStackTrace();
		}

		finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return isAdded;
	}




}
