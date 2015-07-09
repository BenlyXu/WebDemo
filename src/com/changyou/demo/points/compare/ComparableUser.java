package com.changyou.demo.points.compare;

import lombok.Data;

@Data
public class ComparableUser implements Comparable<ComparableUser> {
	
	private String name;
	
	public ComparableUser(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(ComparableUser o) {
		return this.name.compareTo(o.name);
	}

}
