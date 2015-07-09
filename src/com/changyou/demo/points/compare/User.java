package com.changyou.demo.points.compare;

import lombok.Data;

@Data
public class User {
	
	private String name;
	
	public User(String name) {
		this.name = name;
	}

}
