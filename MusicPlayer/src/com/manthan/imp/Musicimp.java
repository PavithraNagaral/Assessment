package com.manthan.imp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.manthan.bean.Musicbean;

public class Musicimp {
	
	 //song search by id
	public Musicbean search(long songid) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="select * from Musicsystem where Song_ID=?";		
			stmt=con.prepareStatement(query);
			stmt.setLong(1,songid);
			rs=stmt.executeQuery();
			if(rs.next()) {
				int sid11=rs.getInt("Song_ID");
				String sname=rs.getString("Song_Name");
				String artname=rs.getString("Artitst_name");
				String albname=rs.getString("Album_name");
				String sloc=rs.getString("Song_Location");
				String desc=rs.getString("Desc");
				
				System.out.println("Song_ID  "+sid11);
				System.out.println("Song_Name  "+sname);
				System.out.println("Artitst_name  "+artname);
				System.out.println("Album_name   "+albname);
				System.out.println("Song_Location  "+sloc);
				System.out.println("Desc  "+desc);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt !=null) {
					stmt.close();
				}
				if(con !=null) {
					con.close();
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return null;
	}
	
	//search of song by name
		public Musicbean play1(String songname) {
			int n=0;
			Connection con=null;
			PreparedStatement stmt=null;
			ResultSet rs=null;
			Scanner sc=new Scanner(System.in);
			

			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Music?user=root&password=root");
				String query="select * from Musicsysytem where Song_Name=?";		
				stmt=con.prepareStatement(query);
				stmt.setString(1,songname);
				rs=stmt.executeQuery();
				if(rs.next()) {
					int sid11=rs.getInt("Song_ID");
					String sname1=rs.getString("Song_Name");
					String artname=rs.getString("Artitst_name");
					String albname=rs.getString("Album_name");
					String sloc=rs.getString("Song_Location");
					String desc=rs.getString("Desc");
					
					System.out.println("Song_ID  "+sid11);
					System.out.println("Song_Name "+sname1);
					System.out.println("Artitst_name  "+artname);
					System.out.println("Album_name   "+albname);
					System.out.println("Song_Location     "+sloc);
					System.out.println("Descr  "+desc);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(stmt !=null) {
						stmt.close();
					}
					if(con !=null) {
						con.close();
					}

				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			return null;
		}
		

	
	
	//add song
	    int mbn=0;
	    public int add(Musicbean mbn ){
		int n=0; 
		
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter song id");
		long songid=sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter song name");
		String songname=sc.nextLine();

		System.out.println("Enter artist name");
		String artname=sc.nextLine();

		System.out.println("Enter album name");
		String albumname=sc.nextLine();

		System.out.println("Enter Song location");
		String songloc=sc.nextLine();
		
		System.out.println("Enter song description");
		String desc=sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Music?user=root&password=root");
			String query="insert into Musicsystem values(?,?,?,?,?,?)";		
			stmt=con.prepareStatement(query);
			stmt.setLong(1,songid);
			stmt.setString(2,songname);
			stmt.setString(3,artname);
			stmt.setString(4,albumname);
			stmt.setString(5,songloc);
			stmt.setString(6,desc);
			
			 n=stmt.executeUpdate();
			   if(n>0) {
				System.out.println("Song is added");
				
			}
			else {
				System.out.println("Song not added");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt !=null) {
					stmt.close();
				}
				if(con !=null) {
					con.close();
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return n;
	}
	    
	//delete song
	public int del(Musicbean mbn) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter song id");
		long sid=sc.nextLong();
		sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Music?user=root&password=root");
			String query="delete from Musicsystem where Song_Id=?";		
			stmt=con.prepareStatement(query);
			stmt.setLong(1,sid);
			n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Song is deleted");
				
			}
			else {
				System.out.println("Song not deleted");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt !=null) {
					stmt.close();
				}
				if(con !=null) {
					con.close();
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return n;
	}
	
	//upadte song
	public int edit(Musicbean mbn) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter song id");
		
		long songid=sc.nextLong();
		sc.nextLine();
	
		System.out.println("Enter song name");
		String songname=sc.nextLine();

		System.out.println("Enter artist name");
		String artname=sc.nextLine();

		System.out.println("Enter album name");
		String albumname=sc.nextLine();
		
		System.out.println("Enter Song location");
		String songloc=sc.nextLine();
		
		System.out.println("Enter song description");
		String desc=sc.nextLine();
		
		System.out.println("Enter song id");
		long songid1=sc.nextLong();
		sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Music?user=root&password=root");
			String query="update Musicsystem set Song_Id=?,Song_Name=?,Artitst_name=?,Album_name=?,Song_Location=? and Desc=? where Song_ID=?";		
			stmt=con.prepareStatement(query);	
			stmt.setString(1,songname);
			stmt.setLong(2,songid1);
			n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Song is updated");
				
			}
			else {
				System.out.println("Song not updated");
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt !=null) {
					stmt.close();
				}
				if(con !=null) {
					con.close();
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return n;
	}
	
	
  //show all songs
	  public int showAll() {
		int n=0;
		Connection con=null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Music?user=root&password=root");
			String query="select * from Musicsystem";		
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Song_Id"+"Song_Nme"+"Artitst_name"+"Album_name "+"Song_Location"+"Desc");
			while(rs.next()) {
				int songid=rs.getInt("Song_ID");
				String songname=rs.getString("Song_Name");
				String artname=rs.getString("Artitst_name");
				String albumname=rs.getString("Album_name");
				String songloc=rs.getString("Song_Location");
				String desc=rs.getString("Desc");
				System.out.println("songid "+ "songname" +  "artname"+ "albumname"+ "songloc" +"desc");	
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(stmt !=null) {
					stmt.close();
				}
				if(con !=null) {
					con.close();
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return mbn;
	}
	
	
	
		//order of songs by names
		public Musicbean playAll() {
			int n=0;
			Connection con=null;
			java.sql.Statement stmt=null;
			ResultSet rs=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Music?user=root&password=root");
				String query="select * from Musicsysytem order by Song_Name";		
				stmt=con.createStatement();
				rs=stmt.executeQuery(query);
				System.out.println("Song_Id"+"Song_Name"+"Artitst_name"+"Album_name "+"Song_Location"+"Desc");
				while(rs.next()) {
					int songid=rs.getInt("Song_ID");
					String songname=rs.getString("Song_Name");
					String artname=rs.getString("Artitst_name");
					String albumname=rs.getString("Album_name");
					String songloc=rs.getString("Song_Location");
					String desc=rs.getString("Desc");
					System.out.println("songid "+ "songname" +  "artname"+ "albumname"+ "songloc" +"desc");		
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(stmt !=null) {
						stmt.close();
					}
					if(con !=null) {
						con.close();
					}

				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			return null;
		}

}

