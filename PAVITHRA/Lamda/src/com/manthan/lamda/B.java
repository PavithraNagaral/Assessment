package com.manthan.lamda;

public class B {

	public static void main(String[] args) {
		Fact f=(x)->{
			int f1=1;
			for(int i=0;i<x;i++)
			{
				f1=f1*x;
			}
			return f1;
		};
		
		System.out.println(f.fact(5));
	
	}

}
