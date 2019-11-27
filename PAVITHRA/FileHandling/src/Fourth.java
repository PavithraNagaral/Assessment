import java.io.FileWriter;
import java.io.IOException;

public class Fourth {
	public static void main(String[] args) {
		
		
		String msg="hoiii";
		char ch[]=msg.toCharArray();
		try {
			FileWriter fw=new FileWriter("p.txt");
			
			fw.write(ch);
			fw.flush();
			
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
