package com.manthan.exception.test;

public class TestB {

	public static void main(String[] args) {
		System.out.println(" main started");
		
		String name=null;
		try {
			System.out.println(name.length());
			
		}
		
		catch(NullPointerException ne)
		{
			System.out.println(" cantbe null");
		}
		
		System.out.println(" ended");
	}

}
