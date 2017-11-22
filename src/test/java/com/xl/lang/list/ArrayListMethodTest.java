package com.xl.lang.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArrayListMethodTest {
	
	List list = new ArrayList();
	
	@Before
	public void init(){
		
	}
	
	@Test
	public void testAdd(){
		list.add("a");
		list.add(1);
		list.add(new Object());
		System.out.println(list.size());
	}
	
	
}
