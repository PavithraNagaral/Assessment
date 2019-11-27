package com.manthan.exception.test;

public class TestF {

	public static void main(String[] args) {
		System.out.println(" main started");
		
		Paytm p=new Paytm();
		try {
		p.book();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" handled by main");
		}
		
		System.out.println(" main ended");
	}

}
