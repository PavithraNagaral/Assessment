package com.manthan.Collect.list;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class F {

	public static void main(String[] args) {
		TreeMap<Integer,String> hs=new TreeMap<Integer,String>();
		hs.put(9, "pppp");
		hs.put(10, "rrr");
		hs.put(3, "aaa");
		hs.put(13, "ssss");
		
		Set<Map.Entry<Integer,String>> se=hs.entrySet();
		for(Map.Entry<Integer,String> x:se)
		{
			System.out.println(x.getValue());
			System.out.println(x.toString());
			System.out.println("==========");
		}
	}

}
