package com.manthan.exception.test;

public class AgeSim {
	
	void verify(int age) throws InvalidAge
	{
		if(age<18)
		{
			InvalidAge ag=new InvalidAge();
			throw ag;
		}
	}

}
