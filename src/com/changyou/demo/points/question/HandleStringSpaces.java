package com.changyou.demo.points.question;

public class HandleStringSpaces {
	
	public static String replaceSpace(StringBuffer str) {
		if (null == str) {
			return null;
		}
		return str.toString().replaceAll(" ", "%20");
	}

	public static void main(String[] args) {
		System.out.println(HandleStringSpaces.replaceSpace(new StringBuffer("We Are Happy.")));
	}

}
