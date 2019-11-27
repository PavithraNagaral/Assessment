package com.manthan.employeemgmt.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class MyFirst {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//Driver driver=new Driver();
			//DriverManager.registerDriver(driver);
			//Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from employee_info");
			
			while(rs.next())
			{
				int empid=rs.getInt("emp_id");
				String name=rs.getString("emp_name");
				int age=rs.getInt("age");
				double salary=rs.getDouble("salary");
				String designation=rs.getString("designation");
				long mobile=rs.getLong("mobile");
				
				System.out.println("id          "         +empid);
				System.out.println("name        "       +name);
				System.out.println("age         "        +age);
				System.out.println("salary      "     +salary);
				System.out.println("designation "+designation);
				System.out.println("mobile      "     +mobile);
				System.out.println("-----------------------");
			}//while
		}//try
		catch(Exception e)
		{
			e.printStackTrace();
		}//catch
		finally {
			try {
				if(con!=null) {
					con.close();
					
				}//if
			}//try
			catch(Exception e)
			{
				e.printStackTrace();
			}//catch
		}//finally
	
		
	}//end of main

}//end of cls
