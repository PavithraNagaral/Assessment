package com.manthan.Collect.list;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class D {

	public static void main(String[] args) {
		TreeMap<Character,String> hs=new TreeMap<Character,String>();
		hs.put('p', "pppp");
		hs.put('r', "rrr");
		hs.put('a', "aaa");
		hs.put('s', "ssss");
		
		Set<Map.Entry<Character,String>> se=hs.entrySet();
		for(Map.Entry<Character,String> x:se)
		{
			System.out.println(x.getValue());
			System.out.println(x.toString());
			System.out.println("==========");
		}
	}

}
