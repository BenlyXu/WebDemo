package com.demo.chip.question;

public class StringToInt {
	
	
	public static int s2i(String s) throws Exception {
		if (null == s || 0 == s.length()) {
			throw new IllegalArgumentException("Illegal number string");
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		String s = "12345";
		int number = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			number = number * 10 + chars[i] - '0';
		}
		System.out.println(number);
	}

}
