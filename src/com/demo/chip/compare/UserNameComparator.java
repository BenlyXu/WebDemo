package com.demo.chip.compare;

import java.util.Comparator;

public class UserNameComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// 不区分大小写
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
