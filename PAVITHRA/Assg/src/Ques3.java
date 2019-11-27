import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Supplier;

public class Ques3 {
	
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("press 1 for array");
		System.out.println("press 2 for linked");
		System.out.println("press 3 for vector");
		ArrayList< Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		
		Supplier<Object> sc=()->{
			int id=sc1.nextInt();
			if(id==1)
				return al;
			else if(id==2)
				return l;
			else if(id==3)
				return v;
			
		
		return null;
		
	
		
	};
	
	Object o=sc.get();
	System.out.println(o);

}
}
