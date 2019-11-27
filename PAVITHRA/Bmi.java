class Bmi
{
	public static void main(String args[])
	{
		double h,w,res;
		h=1.75;
		w=80;
		res=w/(h*h);
		if(res<=18.5)
		{
			System.out.println("underweight");
		}
		else if((res>18.5)&& (res<=25))
		{
			System.out.println("normal");
		}
		else if((res>25)&& (res<=30))
		{
			System.out.println("overweight");
		}
		
		else 
		{
			System.out.println("obesity");
		}
	}
}