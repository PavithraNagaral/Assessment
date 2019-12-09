package com.manthan.hotelapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.manthan.hotelapllication.bean.HotelApplicationBean;

public class HotelApplicationImp implements HotelApplicationDao {

	
	//deleting the food item
	@Override
	public boolean deleteitem(int item_code) {
		int n=0;
		boolean isdeleted = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get connection via driver
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
			
			//issue SQl query
			String query="delete from hotel_bill where item_code=?";
			pstmt=con.prepareStatement(query);
		    pstmt.setInt(1, item_code);
		    
		    //process the result
			n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("food item is deleted");
				isdeleted=true;
			}
			else{
				System.out.println("food item is not deleted");
				isdeleted=false;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//close all the jdbc connections
		finally {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}		
		return isdeleted;	
	}

	//modifying the food item 
	@Override
	public boolean updateitem(int item_code, String food_name) {
	
		boolean isupdated=false;
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		
				try {
					//load the driver
					Class.forName("com.mysql.jdbc.Driver");
					
					//get connection via driver
			       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
			       
			       //issue sql querry
			      String query="update hotel_bill set food_name=? where item_code=?";		
			      stmt=con.prepareStatement(query); 
			      stmt.setString(1,food_name);
			      stmt.setInt(2, item_code);
			      
			      //process the result
			     n=stmt.executeUpdate();
			    if(n>0) {
				isupdated=true;
				System.out.println("food item is updated");
				
			    }
			else {
				System.out.println("food item not updated");
			    }
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}//catch
				//close all the jdbc connections
		       finally {
			   try {
			   stmt.close();
			   } catch (SQLException e) {
				e.printStackTrace();
			   }
			   try {
				con.close();
			   } catch (SQLException e) {
				e.printStackTrace();
			   }
			}		
			return isupdated;
        
	}

	//to see all food items
	@Override
	public ResultSet seeAllitems() {
		
		    Connection con=null; // conncetion of jdbc
			Statement psmt=null; //  to take query
			ResultSet rs=null; // storing the result
			
			Scanner sc=new Scanner(System.in); 
			try
			{
				//load the driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//get connection via driver
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
				
				//issue SQl query
				String query="select * from hotel_bill";
				psmt=con.createStatement();
				rs=psmt.executeQuery(query);

				while(rs.next())
				{	
				System.out.println("item_code = "+rs.getInt("item_code"));
				System.out.println("Food_name= "+rs.getString("food_name"));
				System.out.println("Price of item = "+rs.getInt("price"));
				
				System.out.println("=====================================================");	
				}//end of while loop
				
			}//end of try
			
			catch(Exception e)
			{
				e.printStackTrace();
			}//catch
			
			//close all the jdbc connections
			finally {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					psmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				}		
				return null;
	}

 //to show the total bill
	@Override
	public void totalbill() {
		
	
		 Connection con=null; // conncetion of jdbc
			Statement psmt=null; //  to take query
			ResultSet rs=null; // storing the result
			
			Scanner sc=new Scanner(System.in); 
			try
			{
				//load the driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//get connection via driver
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
				
				//issue SQl query
				String query="select sum(price) from hotel_bill";
				psmt=con.createStatement();
				rs=psmt.executeQuery(query);
				
				while(rs.next()) {
					System.out.println("total bill- "+rs.getInt("sum(price)"));
				}
			}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}//catch
			   //close all the jdbc connections
				finally {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						psmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}	
			}
	}
	
//add item
@Override
public boolean additem(HotelApplicationBean hotelApllicationbean) {
	
	    int n=0;
	    boolean isadded =false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the food item code");
		int item_code = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the food  name");
		String food_name= sc.nextLine();
		
		System.out.println("enter the price");
		int price = sc.nextInt();
		sc.nextLine();
		
		try
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//get connection via driver
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_db?user=root&password=root");
			
			//issue SQl query
			String query="insert into hotel_bill values(?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, item_code);
			pstmt.setString(2, food_name);
			pstmt.setInt(3, price);
			
			n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("food item is added");
				isadded=true;
			}
			else{
				System.out.println("food item is not added");
				isadded=false;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//close all the jdbc connections
		finally {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}		
		return isadded;
	
  }
}//end of class
