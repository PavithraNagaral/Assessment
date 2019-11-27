
public class TestH {

	public static void main(String[] args) {
		Third t=new Third();
		System.out.println(" third generation");
		t.call();
		t.msg();
		t.radio();
		t.camera();
		Second s=new Second();
		System.out.println(" Sec generation");
		s.call();
		s.msg();
		s.radio();
		

	}

}
