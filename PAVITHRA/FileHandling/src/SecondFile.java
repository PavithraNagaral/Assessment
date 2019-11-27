import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SecondFile {
	public static void main(String[] args) {
		
		String msg="hiii hiii";
		byte[] by=msg.getBytes();
		
		
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\CBT\\Desktop\\file\\p.txt");
			
			fout.write(by);
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
