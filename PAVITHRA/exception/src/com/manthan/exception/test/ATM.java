package com.manthan.exception.test;

public class ATM {
	void verify(int amt)
	{
		if(amt>40000)
		{
			DayLimit x = new DayLimit();
			throw x;
		}
	}

}
