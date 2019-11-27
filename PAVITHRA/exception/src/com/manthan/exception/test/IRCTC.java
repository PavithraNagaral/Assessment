package com.manthan.exception.test;

public class IRCTC {

	void confirm() {
		System.out.println(" confirm started");
		try {
			System.out.println(10/2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("handled by irctc");
			throw ae;
		}
		finally {
			System.out.println("confirm ended");
		}
	}


}
