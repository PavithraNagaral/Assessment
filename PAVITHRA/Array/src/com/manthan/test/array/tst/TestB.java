package com.manthan.test.array.tst;

public class TestB {

	public static void main(String[] args) {
		char c[]=new char[6];
		c[0]='a';
		c[4]='h';
		for(int i=0;i<c.length;i++) {


			System.out.println(c[i]);}

		for(int i=c.length-1;i>=0;i--) {


			System.out.println(c[i]);}
	}

}
