package com.manthan.exception.test;

public class TestE {

	public static void main(String[] args) {
		
		System.out.println("main started");
		int a[]=new int[3];
		String s="aaaaa";
		try {
			//System.out.println(a[5]);
			System.out.println(" hii");
			System.out.println(" i m done");
			System.out.println(10/0);
			//System.out.println(s.length());
			
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println(" cant divide by zero");
			ae.printStackTrace();
			
			
		}
		
		catch(NullPointerException ne)
		{
			System.out.println("cant be null");
			
		}
		
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.getMessage();
		}
		
		catch(Exception e)
		{
			System.out.println(" general");
		}
		
		System.out.println("ends");
	}

}
