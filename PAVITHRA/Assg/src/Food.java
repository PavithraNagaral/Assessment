
public class Food {
	public static String Test(int i) {
		String s=null;
		if(i==1)
		{
			s="kurkure";
		}
		else if(i==2)
		{
			s="lays";
		}
		if(i==3)
		{
			s="bingo";
		}
		return s;
				
	}
	public static void main(String[] args) {
		System.out.println(Food.Test(1));
		System.out.println(Food.Test(2));
		System.out.println(Food.Test(3));
	}

}
