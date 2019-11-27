import java.util.function.Consumer;



public class ConsumerAnimal {
	public static void main(String[] args) {
		
		
		Object a=new Cow();
		Consumer<Object> c=s->{
			if(s instanceof Cow)
			{
				System.out.println("mmmm");
			}
			else if (s instanceof Lion) {
				System.out.println("roar");
				
			}
			
		};
		c.accept(a);

	}

}
