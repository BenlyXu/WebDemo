package com.demo.model;

import lombok.Data;

@Data
public class User {
	private int id;
	private String username;
	private String password;
	private String trueName;
	private String email;
}
