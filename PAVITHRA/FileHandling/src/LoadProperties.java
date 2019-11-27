import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	public static void main(String[] args) {
		
			try {
				FileInputStream fin=new FileInputStream("my.properties");
				
				Properties pr=new Properties();
				pr.load(fin);
				
				
				String user=pr.getProperty("name");
				String url=pr.getProperty("url");
				
				System.out.println("user"+user);
				System.out.println("url"+url);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

	}

}
