import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class MusicDb {
	Musicbean mb=new Musicbean();
	int addMusic(Musicbean mb) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter song id");
		long sid=sc.nextLong();
		sc.nextLine();
		

		System.out.println("enter song name");
		String sname=sc.nextLine();

		System.out.println("enter artist name");
		String artname=sc.nextLine();

		System.out.println("enter album name");
		String albname=sc.nextLine();
		

		System.out.println("enter Song location");
		String sloc=sc.nextLine();
		
		System.out.println("enter song description");
		String desc=sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="insert into MusicFiles values(?,?,?,?,?,?)";		
			stmt=con.prepareStatement(query);
			stmt.setLong(1,sid);
			stmt.setString(2,sname);
			stmt.setString(3,artname);
			stmt.setString(4,albname);
			stmt.setString(5,sloc);
			stmt.setString(6,desc);
			 n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Music added");
				
			}
			else {
				System.out.println("Not added");
				
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
	
	int delMusic(Musicbean mb) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter song id");
		long sid=sc.nextLong();
		sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="delete from Musicfiles where Song_Id=?";		
			stmt=con.prepareStatement(query);
			stmt.setLong(1,sid);
			n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Music deleted");
				
			}
			else {
				System.out.println("Not deleted");
				
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
	
	int editMusic(Musicbean mb) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter song id");
		long sid=sc.nextLong();
		sc.nextLine();
		

		System.out.println("enter song name");
		String sname=sc.nextLine();

		System.out.println("enter artist name");
		String artname=sc.nextLine();

		System.out.println("enter album name");
		String albname=sc.nextLine();
		

		System.out.println("enter Song location");
		String sloc=sc.nextLine();
		
		System.out.println("enter song description");
		String desc=sc.nextLine();
		
		System.out.println("enter song id");
		long sid1=sc.nextLong();
		sc.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="update MusicFiles set Song_Id=?,Song_Title=?,Artitst_name=?,Album_name=?,Song_Location=? and Description=? where Song_ID=?";		
			stmt=con.prepareStatement(query);	
			stmt.setString(1,sname);
			stmt.setLong(2,sid1);
			n=stmt.executeUpdate();
			if(n>0) {
				System.out.println("Music updated");
				
			}
			else {
				System.out.println("Not updated");
				
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

	Musicbean showAllMusic() {
		int n=0;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="select * from MusicFiles";		
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Song_Id |"+"Song_Title |"+"Artitst_name |"+"Album_name |"+
					"Song_Location |"+"Description ");
			System.out.println("*************************************************************************************");
			while(rs.next()) {
				int sid=rs.getInt("Song_ID");
				String sname=rs.getString("Song_Title");
				String artname=rs.getString("Artitst_name");
				String albname=rs.getString("Album_name");
				String sloc=rs.getString("Song_Location");
				String desc=rs.getString("Description");
				System.out.println(sid+"\t"+sname+"   \t"+artname+"     \t"+albname+"   \t"+sloc+" \t"+desc+"\n");
				
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
		return mb;
	}
	
	Musicbean searchMusic(long sid) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="select * from MusicFiles where Song_ID=?";		
			stmt=con.prepareStatement(query);
			stmt.setLong(1,sid);
			rs=stmt.executeQuery();
			if(rs.next()) {
				int sid11=rs.getInt("Song_ID");
				String sname=rs.getString("Song_Title");
				String artname=rs.getString("Artitst_name");
				String albname=rs.getString("Album_name");
				String sloc=rs.getString("Song_Location");
				String desc=rs.getString("Description");
				
				System.out.println("Song_ID     "+sid11);
				System.out.println("Song_Title    "+sname);
				System.out.println("Artitst_name     "+artname);
				System.out.println("Album_name     "+albname);
				System.out.println("Song_Location     "+sloc);
				System.out.println("Description    "+desc);
				System.out.println("****************************");
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
		return mb;
	}
	
	Musicbean playParticular(String sname) {
		int n=0;
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="select * from MusicFiles where Song_Title=?";		
			stmt=con.prepareStatement(query);
			stmt.setString(1,sname);
			rs=stmt.executeQuery();
			if(rs.next()) {
				int sid11=rs.getInt("Song_ID");
				String sname1=rs.getString("Song_Title");
				String artname=rs.getString("Artitst_name");
				String albname=rs.getString("Album_name");
				String sloc=rs.getString("Song_Location");
				String desc=rs.getString("Description");
				
				System.out.println("Song_ID     "+sid11);
				System.out.println("Song_Title    "+sname1);
				System.out.println("Artitst_name     "+artname);
				System.out.println("Album_name     "+albname);
				System.out.println("Song_Location     "+sloc);
				System.out.println("Description    "+desc);
				System.out.println("****************************");
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
		return mb;
	}
	
	Musicbean playAll() {
		int n=0;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="select * from MusicFiles order by Song_Title";		
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Song_Id |"+"Song_Title |"+"Artitst_name |"+"Album_name |"+
					"Song_Location |"+"Description ");
			System.out.println("*************************************************************************************");
			while(rs.next()) {
				int sid=rs.getInt("Song_ID");
				String sname=rs.getString("Song_Title");
				String artname=rs.getString("Artitst_name");
				String albname=rs.getString("Album_name");
				String sloc=rs.getString("Song_Location");
				String desc=rs.getString("Description");
				System.out.println(sid+"\t"+sname+"   \t"+artname+"     \t"+albname+"   \t"+sloc+" \t"+desc+"\n");
				
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
		return mb;
	}

	Musicbean playRandom() {
		int n=0;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer?user=root&password=root");
			String query="select * from MusicFiles order by rand()";		
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Song_Id |"+"Song_Title |"+"Artitst_name |"+"Album_name |"+
					"Song_Location |"+"Description ");
			System.out.println("*************************************************************************************");
			while(rs.next()) {
				int sid=rs.getInt("Song_ID");
				String sname=rs.getString("Song_Title");
				String artname=rs.getString("Artitst_name");
				String albname=rs.getString("Album_name");
				String sloc=rs.getString("Song_Location");
				String desc=rs.getString("Description");
				
				
				System.out.println(sid+"\t"+sname+"   \t"+artname+"     \t"+albname+"   \t"+sloc+" \t"+desc+"\n");
				
				
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
		return mb;
	}
}//end of class



