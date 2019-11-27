package com.manthan.exception.test;

public class InvalidAge extends Exception {
	String msg="sorry your too youngS";

	public InvalidAge(String msg) {
		this.msg = msg;
	}
	public InvalidAge()
	{
		
	}
	public String getMsg() {
		return msg;
	}

}
