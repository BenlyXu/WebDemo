package com.demo.chip.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		List<ComparableUser> comparableUserList = new ArrayList<ComparableUser>();
		comparableUserList.add(new ComparableUser("cc"));
		comparableUserList.add(new ComparableUser("aa"));
		comparableUserList.add(new ComparableUser("BB"));
		
		Collections.sort(comparableUserList);
		
		for (ComparableUser comparableUser : comparableUserList) {
			System.out.print(comparableUser.getName() + " ");
		}
	}
	
}
