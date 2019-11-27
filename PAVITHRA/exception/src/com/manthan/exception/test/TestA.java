package com.manthan.exception.test;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main started");
		
		try {
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(" dint divide by zero");
		}
		
		System.out.println("ended");
	}

}
