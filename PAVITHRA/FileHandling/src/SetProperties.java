import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetProperties {
	
	public static void main(String[] args) {
		Properties pr=new Properties();
		pr.setProperty("driverName", "com.mysql.jdbcDriver");
		pr.setProperty("url", "jdbc:mysql://localhost:3306");
		pr.setProperty("name", "root");
		pr.setProperty("password", "root");
		
		
		try {
			FileOutputStream fout=new FileOutputStream("my.properties");
			
			pr.store(fout, "storing data");
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
