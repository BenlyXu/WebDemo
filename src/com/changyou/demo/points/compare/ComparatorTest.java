package com.changyou.demo.points.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
	
	public static void main(String[] args) {

		List<User> userList = Arrays.asList(new User("cc"), new User("aa"), new User("BB"));
		
		Collections.sort(userList, new UserNameComparator());
		
		for (User user : userList) {
			System.out.print(user.getName() + " ");
		}
	}

}
