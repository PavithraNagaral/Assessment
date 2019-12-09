package com.manthan.shoppingapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manthan.shoppingappliction.bean.UserInfoBean;

public class UserInfoDaoImp implements UserInfoDao {

	@Override
	public boolean register(UserInfoBean userInfoBean) {
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean isAdded=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart?user=root&password=root");

			String query="insert into user_info values (?,?,?,?)";

			pstmt=con.prepareStatement(query);

			pstmt.setInt(1, userInfoBean.getUserId());
			pstmt.setString(2, userInfoBean.getUserName());
			pstmt.setString(3, userInfoBean.getEmail());
			pstmt.setString(4, userInfoBean.getPassword());





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

	@Override
	public UserInfoBean authenticate(String email, String password) {
		Connection con=null;
		java.sql.PreparedStatement pstmt=null;
		ResultSet rs=null;
		UserInfoBean userInfoBean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart?user=root&password=root");
			String query="select * from user_info where email=? and password=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				userInfoBean = new UserInfoBean();
				userInfoBean.setUserId(rs.getInt("user_id"));
				userInfoBean.setUserName(rs.getString("user_name"));
				userInfoBean.setUserName(rs.getString("email"));
				userInfoBean.setUserName(rs.getString("password"));




			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return userInfoBean;

	}

}
