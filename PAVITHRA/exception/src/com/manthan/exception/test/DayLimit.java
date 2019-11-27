package com.manthan.exception.test;

public class DayLimit extends RuntimeException 
{
	String msg="sorry you crossed day limit";

	public DayLimit(String msg) {
		this.msg = msg;
	}
	public DayLimit()
	{
		
	}
	public String getMsg() {
		return msg;
	}
	
}
