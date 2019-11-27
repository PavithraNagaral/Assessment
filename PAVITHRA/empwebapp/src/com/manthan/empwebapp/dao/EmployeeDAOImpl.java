package com.manthan.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manthan.empwebapp.beans.Employeeinfobean;

public class EmployeeDAOImpl implements Employeedao {
	@Override
	public Employeeinfobean searchemployee(int empid) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// boolean isadded=false;

		Employeeinfobean employeeinfobean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://mysql.cbzreavsclib.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");

			String query = "select * from employee_info where emp_id=?";
			// String query="insert into employee_info values(?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, empid);
			rs = pstmt.executeQuery();
			// int n=pstmt.executeUpdate();

			/*
			 * if(n>0) { isadded=true; }
			 */

			if (rs.next()) {
				employeeinfobean = new Employeeinfobean();
				employeeinfobean.setEmpid(rs.getInt("emp_id"));
				employeeinfobean.setEmpname(rs.getString("emp_name"));
				employeeinfobean.setAge(rs.getInt("age"));
				employeeinfobean.setDesignation(rs.getString("designation"));
				employeeinfobean.setSalary(rs.getDouble("salary"));
				employeeinfobean.setMobile(rs.getLong("mobile"));

			}
		} // try

		catch (Exception e) {
			e.printStackTrace();
		} // catch

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return employeeinfobean;

	}

	public boolean addemp(Employeeinfobean employeeinfobean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isadded = false;



		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://mysql.cbzreavsclib.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");

			// String query="select * from employee_info where emp_id=?";
			String query = "insert into employee_info values(?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			// pstmt.setInt(1,empid);
			pstmt.setInt(1, employeeinfobean.getEmpid());
			pstmt.setString(2, employeeinfobean.getEmpname());
			pstmt.setInt(3, employeeinfobean.getAge());
			pstmt.setDouble(4, employeeinfobean.getSalary());
			pstmt.setString(5, employeeinfobean.getDesignation());
			pstmt.setLong(6, employeeinfobean.getMobile());
			pstmt.setString(7, "abc");

			// rs=pstmt.executeQuery();
			int n = pstmt.executeUpdate();

			if (n > 0) {
				isadded = true;
			}

			/*
			 * if(rs.next()) { employeeinfobean=new Employeeinfobean();
			 * employeeinfobean.setEmpid(rs.getInt("emp_id"));
			 * employeeinfobean.setEmpname(rs.getString("emp_name"));
			 * employeeinfobean.setAge(rs.getInt("age"));
			 * employeeinfobean.setDesignation(rs.getString("designation"));
			 * employeeinfobean.setSalary(rs.getDouble("salary"));
			 * employeeinfobean.setMobile(rs.getLong("mobile"));
			 * 
			 * 
			 * }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isadded;
		

	}

	@Override
	public Employeeinfobean authenticate(int empid, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// boolean isadded=false;

		Employeeinfobean employeeinfobean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://mysql.cbzreavsclib.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");
			String query="select * from employee_info where emp_id=? and pw=?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,empid);
			pstmt.setString(2, password);

			rs=pstmt.executeQuery();
			if (rs.next()) {

				employeeinfobean = new Employeeinfobean();
				employeeinfobean.setEmpid(rs.getInt("emp_id"));
				employeeinfobean.setEmpname(rs.getString("emp_name"));
				employeeinfobean.setAge(rs.getInt("age"));
				employeeinfobean.setDesignation(rs.getString("designation"));
				employeeinfobean.setSalary(rs.getDouble("salary"));
				employeeinfobean.setMobile(rs.getLong("mobile"));

			}


		}

		catch (Exception e) {
			e.printStackTrace();
		} // catch

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return employeeinfobean;

	}

	@Override
	public boolean Update(int empid, int age) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isupdate=false;

		Employeeinfobean employeeinfobean = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://mysql.cbzreavsclib.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");

			String query = "update employee_info set age=? where emp_id=?";
			// String query="insert into employee_info values(?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(2, empid);
			pstmt.setInt(1, age);
			int n=pstmt.executeUpdate();
			
			if(n>0)
			{
				isupdate=true;
			}

		
		
	}
		catch (Exception e) {
			e.printStackTrace();
		} // catch

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isupdate;
	}

	@Override
	public boolean delete(int empid) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isdelete=false;

		Employeeinfobean employeeinfobean = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://mysql.cbzreavsclib.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");

			String query = "delete  from employee_info  where emp_id=?";
			// String query="insert into employee_info values(?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, empid);
			//pstmt.setInt(1, age);
			int n=pstmt.executeUpdate();
			
			if(n>0)
			{
				isdelete=true;
			}

		
		
	}
		catch (Exception e) {
			e.printStackTrace();
		} // catch

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isdelete;
	
		
	}

	
	

}
