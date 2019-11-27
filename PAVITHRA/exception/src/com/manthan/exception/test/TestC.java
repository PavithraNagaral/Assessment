package com.manthan.exception.test;

public class TestC {

	public static void main(String[] args) {
		System.out.println(" MAIN STARTED");
		
		String s=null;
		try {
		System.out.println(10/0);
		System.out.println("hii");
		System.out.println("good day");
		System.out.println(s.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println(" dont");
		}
		
		catch(NullPointerException ne)
		{
			System.out.println(" no null allowed");
		}
		System.out.println(" ENDS");
	}

}
