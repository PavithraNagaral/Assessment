package com.manthan.exception.test;

public class TestJ {

	public static void main(String[] args) {
		System.out.println("main started");
		
		ATM a = new ATM();
		try
		{
			a.verify(10000);
		}
		catch(DayLimit de)
		{
			de.printStackTrace();
		}
		
		System.out.println("ends");
	}

}
