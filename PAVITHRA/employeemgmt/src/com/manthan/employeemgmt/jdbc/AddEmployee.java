package com.manthan.employeemgmt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement psmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the id" );
		int empid=sc.nextInt();
		sc.nextLine();
		
		System.out.println(" enter the name");
		String empname=sc.nextLine();
		
		System.out.println("enter the age");
		int empage=sc.nextInt();
		
		System.out.println("enter the salary");
		double empsal=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("enter the desgination");
		String desg=sc.nextLine();
		
		System.out.println("enter mobile");
		long mob=sc.nextLong();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			String dburl="jdbc:mysql://localhost:3306/elf_employee_db";
			con=DriverManager.getConnection(dburl,"root","root");
			
			String query="insert into employee_info values(?,?,?,?,?,?)";
			
			psmt=con.prepareStatement(query);
			psmt.setInt(1, empid);
			psmt.setString(2, empname);
			psmt.setInt(3,empage);
			psmt.setDouble(4, empsal);
			psmt.setString(5, desg);
			psmt.setLong(6, mob);
			
			int n=psmt.executeUpdate();
			if(n>0)
			{
				System.out.println("record inserted");
			}
			else
			{
				System.out.println("failed");
			}
		}//try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				
				if(psmt!=null)
				{
					psmt.close();
				}
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
