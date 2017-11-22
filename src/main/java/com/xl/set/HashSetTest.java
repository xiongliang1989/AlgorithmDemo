package com.xl.set;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.xl.set.entity.User;

public class HashSetTest {
	
	@Test 
	public void testAdd(){
		Set<User> hashSet = new HashSet<User>();
		User user1 = new User();
		User user2 = new User();
		user1.setUsername("xiongliang");
		user1.setPassword("1111");
		user2.setUsername("xiongliang");
		user2.setPassword("1111");
		hashSet.add(user1);
		hashSet.add(user2);
		for (User user : hashSet) {
			System.out.println(user.getUsername());
		}
		
	}

}
