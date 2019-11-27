package com.manthan.lamda;

public class A {

	public static void main(String[] args) {
		Pen p= (i,j)->i*j;
		int s=p.add(10, 20);
		System.out.println(s);
		
	}

}
