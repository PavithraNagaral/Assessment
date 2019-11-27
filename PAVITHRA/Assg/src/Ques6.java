import java.util.ArrayList;
import java.util.Comparator;

public class Ques6 {
	public static void main(String[] args) {
		
		ArrayList<Integer> f=new ArrayList<Integer>();
		f.add(100);
		f.add(89);
		f.add(60);
		f.add(78);
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(88);
		b.add(78);
		b.add(92);
		
		Comparator<Integer> c=(i,j)->i.compareTo(j);
		
		int a1=f.stream().max(c).get();
		System.out.println("the female topper is"+a1);
		
		int a2=b.stream().max(c).get();
		System.out.println("the male topper is"+a2);
		
		
	}

}
