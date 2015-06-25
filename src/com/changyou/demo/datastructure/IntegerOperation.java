package com.changyou.demo.datastructure;

public class IntegerOperation {

	public static void main(String[] args) {
		Integer i1 = 1;
		Integer i2 = 1;
		Integer i3 = 128;
		Integer i4 = 128;
		Integer i5 = new Integer(127);
		Integer i6 = 127;
		Integer i7 = Integer.valueOf(127);
		System.out.println(i1 == i2);  // true
		System.out.println(i3 == i4);  // false
		System.out.println(i5 == i6);  // false
		System.out.println(i6 == i7);  // true
	}

}
