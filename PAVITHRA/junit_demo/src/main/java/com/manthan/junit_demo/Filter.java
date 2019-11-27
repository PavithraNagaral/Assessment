package com.manthan.junit_demo;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	
	private DBUtil dbUtil;

	public Filter(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}
	
	
	public List<String> myfilter()
	{
		List<String> newlist= new ArrayList<String>();
		List<String> fromdb=dbUtil.getNames();
		
		for(String name:fromdb)
		{
			if(name.startsWith("A"))
			{
				newlist.add(name);
			}
		}
		return newlist;
	}

}
