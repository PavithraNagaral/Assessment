package com.manthan.exception.test;

public class TestD {

	public static void main(String[] args) {
		int a[]=new int[3];
		System.out.println("started");
		
		try
		{
			System.out.println(a[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("cant cross");
			
			//ae.getMessage();
			
			ae.printStackTrace();
		}
		
		System.out.println("ends");
	}

}
