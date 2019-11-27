package com.manthan.test.array.tst;

public class Stringclass {

	public static void main(String[] args) {
		String[] s=new String[8];
		s[0]="pppp";
		s[1]="qqq";
		
		String[] d= {"iii","jjjj"};

		for(int i=0;i<d.length;i++) {


			System.out.println(d[i]);}
		
		for(int i=d.length-1;i>=0;i--) {


			System.out.println(d[i]);}
	}
	
	

}
