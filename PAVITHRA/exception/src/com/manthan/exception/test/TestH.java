package com.manthan.exception.test;

public class TestH {

	public static void main(String[] args)  {
		System.out.println("MAIN STARTED");
		AgeSim a=new AgeSim();
		try {
			a.verify(14);
		}
		catch(InvalidAge                                                       d)
		{
			d.printStackTrace();
		}
		System.out.println("ended");
	}

}
