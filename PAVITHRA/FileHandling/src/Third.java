import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Third {
public static void main(String[] args) {
		
		String msg="hiii hiii";
		byte[] by=msg.getBytes();
		
		
		try (FileOutputStream fout=new FileOutputStream("qspiders.txt")){
			
			fout.write(by);
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
