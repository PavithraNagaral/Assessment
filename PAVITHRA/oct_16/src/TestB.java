

public class TestB {

	public static void main(String[] args) {
		Van v= new Van();
		v.cost=10000;
		v.model="shgff";
		v.move();
		v.stop();
		System.out.println(v.cost);
		System.out.println(v.model);

	}

}
