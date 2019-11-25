package com.manthan.project.daoObj;

import java.sql.DriverManager;
import java.sql.ResultSet;


import com.manthan.project.userbean.UserBean;

public class Userdao {
	public UserBean authenticate(String name, String password) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs=null;

		UserBean userbean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info_db", "root", "root");
		String sql="select * from user_info where name=? and password=?";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, password);
		
		rs=pstmt.executeQuery();
		if(rs.next()) {
			userbean=new UserBean();
			userbean.setName(rs.getString("name"));
			userbean.setPassword(rs.getString("password"));
			
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return userbean;
	}

	public boolean register(UserBean userBean) {
	
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean registered = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info_db", "root", "root");
			String sql = "insert into user_info values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, userBean.getName());
			pstmt.setString(2, userBean.getgender());
			pstmt.setInt(3, userBean.getAge());
			pstmt.setString(4, userBean.getPassword());
			
			int n = pstmt.executeUpdate();

			if (n > 0) {
				registered = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return registered;
	}
		
}
