package com.manthan.junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Calculatortestdiv {
	
	private Calculator c;
	
	
	@BeforeEach
	public void createObj()
	{
		c=new Calculator();
	}
	
	
	
	
	@Test
	public void testadd()
	{
		
		int res=c.add(10, 20);
		assertEquals(30, res);
	}

	

	@Test
	void test() {
		
		
		int res=c.div(10, 2);
		assertEquals(5, res);
	}
	
	@Test
	@Disabled
	public void divforexception()
	{
		
		assertThrows(ArithmeticException.class, ()->c.div(10,0));
	}
	

}
