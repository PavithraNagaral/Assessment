package com.manthan.Collection;

import java.util.ArrayList;

public class B {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(8);
		al.add('f');
		al.add("simra");
		
		for(Object r:al)
		{
			System.out.println(r);
		}
	}

}
