package com.changyou.demo.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;
	private String password;
	private String trueName;
	private String email;
	
	@Override
	public String toString() {
		return "User [id=" + this.id + ", username=" + this.username + ", password="
				+ this.password + ", truename=" + this.trueName + ", email=" + this.email + "]";
	}
	
}
