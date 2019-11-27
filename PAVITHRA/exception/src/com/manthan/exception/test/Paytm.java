package com.manthan.exception.test;

public class Paytm {
	
	void book()
	{
		System.out.println(" booking started");
		
		IRCTC i=new IRCTC();
		
		try {
		i.confirm();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" caught at book");
		}
		System.out.println(" booking endes");
	}

}
