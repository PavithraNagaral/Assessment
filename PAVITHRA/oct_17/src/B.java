
public class B extends A
{
	int i=60;
	void m()
	{
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}

}
