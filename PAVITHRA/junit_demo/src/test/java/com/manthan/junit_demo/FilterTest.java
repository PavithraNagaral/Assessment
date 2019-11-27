package com.manthan.junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class FilterTest {

	@Test
	void test() {
		
		DBUtil dbUtil=mock(DBUtil.class);
		Filter f=new Filter(dbUtil);
		when(dbUtil.getNames()).thenReturn(Arrays.asList("Amith","Banu"));
		List<String> mylist=f.myfilter();
		assertEquals(1, mylist.size());
		
	}

}
