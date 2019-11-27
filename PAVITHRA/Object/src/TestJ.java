
public class TestJ {

	public static void main(String[] args) {
		Animall a=new Cow();
		a.cost=0;
		a.run();
		
		Cow r=(Cow)a;
		r.cost=0000;
		r.run();
		a.cost=00;
		
		System.out.println(a.cost);
	}

}
