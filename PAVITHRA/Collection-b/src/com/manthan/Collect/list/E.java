package com.manthan.Collect.list;

import java.util.Map;
import java.util.Set;

import java.util.Hashtable;

public class E {

	public static void main(String[] args) {
		Hashtable<Character,String> hs=new Hashtable<Character,String>();
		hs.put('p', "pri");
		hs.put('r', "raina");
		hs.put('a', "abh");
		hs.put('s', "suder");
		
		Set<Map.Entry<Character,String>> se=hs.entrySet();
		for(Map.Entry<Character,String> x:se)
		{
			System.out.println(x.getValue());
			System.out.println(x.toString());
			System.out.println("==========");
		}
	}

}
