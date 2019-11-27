package com.manthan.Collection;

import java.util.ArrayList;

public class A {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(8);
		al.add('f');
		al.add("simra");
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			Object r = al.get(i);
			System.out.println(r);
		}
		
		
				
	
	
	}
}
