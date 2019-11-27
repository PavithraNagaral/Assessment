
public class Touch implements Mouse,Keyboard{

	@Override
	public void click() {
		System.out.println(" clicking");
	}

	@Override
	public void press() {
		System.out.println(" pressinh");
	}

}
