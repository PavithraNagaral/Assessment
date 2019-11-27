package com.manthan.Collect.list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.activation.MailcapCommandMap;

public class B {

	public static void main(String[] args) {
		HashMap<Character,String> hs=new HashMap<Character,String>();
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
