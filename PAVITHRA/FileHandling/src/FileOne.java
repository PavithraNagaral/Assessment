import java.io.File;
import java.io.IOException;

public class FileOne {
	public static void main(String[] args) {
		File f=new File("p.txt");
		
		try {
			f.createNewFile();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
