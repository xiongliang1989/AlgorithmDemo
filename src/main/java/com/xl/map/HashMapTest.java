package com.xl.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void testAdd(){
		Map<String, Integer> hash = new HashMap<String, Integer>();
		hash.put("math", 1);
		hash.put("chinese", 2);
		Set<String> set = hash.keySet();
		for (String string : set) {
			System.out.println(string);
		}
		Collection<Integer> values = hash.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}
		Set<Entry<String, Integer>> entryset = hash.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
}
