package com.manthan.Collection;

import java.util.ArrayList;

public class F {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(2.4);
		a.add(5.8);
		a.add(3.6);
		a.add(4.1);
		
		for(int i=0;i<a.size();i++)
		{
			 Double r=  a.get(i);
			System.out.println(r);
		}
	}

}
