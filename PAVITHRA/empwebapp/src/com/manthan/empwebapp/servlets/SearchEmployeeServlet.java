package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/abcd")
public class SearchEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String empvalue=req.getParameter("empid");//getting form data throught req
		 int empvalue1=Integer.parseInt(empvalue);
		 Connection con=null;
		 PreparedStatement pstmt=null;
		 ResultSet rs=null;
		 
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");
			 
			 String query="select * from employee_info where emp_id=?";
			 pstmt=con.prepareStatement(query);
			 pstmt.setInt(1,empvalue1);
			 
			 rs=pstmt.executeQuery();
			 
			 PrintWriter o=resp.getWriter();
			 o.print("<html>");
			 o.print("<body>");
			 if(rs.next()) {
				 o.print("empid "+empvalue1+"<br>");
				 o.print("name"+rs.getString("emp_name")+"<br>");;
				 o.print("age"+rs.getInt("age")+"<br>");
				 o.print("salary"+rs.getDouble("salary")+"<br>");
				 o.print("designation"+rs.getString("designation")+"<br>");
				 o.print("mobile"+rs.getLong("mobile")+"<br>");
				 
			 }
			 else
			 {
				 System.out.println("the employee id"+empvalue1+ "not found");
				 o.print("not found"+empvalue1);
				 
			 }
			 o.print("</body>");
			 o.print("</html>");
			 o.close();
			 
			 
		 }
		 catch(Exception e)
			{
				e.printStackTrace();
			}//catch
			
			finally
			{
				try {
					if(rs!=null)
					{
						rs.close();
					}
					if(pstmt!=null)
					{
						pstmt.close();
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
