package com.manthan.junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorT {
	
	@Test
	public void testadd()
	{
		Calculator c=new Calculator();
		int res=c.add(10, 20);
		assertEquals(30, res);
	}


}
