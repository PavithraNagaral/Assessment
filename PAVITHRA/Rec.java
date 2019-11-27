class Rec
{
	static int factt(int n)
	{
		if(n==0)
		{
			return 1;
		}
	return n*factt(n-1);
	}




public static void main(String args[])
	{
	int j=factt(6);
	System.out.println(j);
	}
}