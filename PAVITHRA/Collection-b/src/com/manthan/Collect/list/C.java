package com.manthan.Collect.list;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class C {

	public static void main(String[] args) {
		LinkedHashMap<Character,String> hs=new LinkedHashMap<Character,String>();
		hs.put('p', "pppp");
		hs.put('p', "rrr");
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
