package com.demo.points.question;

/**
 * 基本类型，byte、char、short、int、long、float、double、boolean
 * @author xubenling
 * @date Jul 7, 2015 2:43:09 PM
 */
public class Primitive {
	
	public static void main(String[] args) {
		// byte: 1个字节，8位，-128～127
		System.out.println("byte");
		System.out.println(" size=" + Byte.SIZE + ", max_val=" + Byte.MAX_VALUE + ", min_val=" + Byte.MIN_VALUE);
		// char: 2个字节，16位
		System.out.println("char");
		System.out.println(" size=" + Character.SIZE + ", max_val=" + Character.MAX_VALUE + ", min_val=" + Character.MIN_VALUE);
		// short: 2个字节，16位
		System.out.println("short");
		System.out.println(" size=" + Short.SIZE + ", max_val=" + Short.MAX_VALUE + ", min_val=" + Short.MIN_VALUE);
		// int: 4个字节，32位
		System.out.println("int");
		System.out.println(" size=" + Integer.SIZE + ", max_val=" + Integer.MAX_VALUE + ", min_val=" + Integer.MIN_VALUE);
		// long: 8个字节，64位
		System.out.println("long");
		System.out.println(" size=" + Long.SIZE + ", max_val=" + Long.MAX_VALUE + ", min_val=" + Long.MIN_VALUE);
		// float: 4个字节，32位
		System.out.println("float");
		System.out.println(" size=" + Float.SIZE + ", max_val=" + Float.MAX_VALUE + ", min_val=" + Float.MIN_VALUE);
		// double: 8个字节，64位
		System.out.println("double");
		System.out.println(" size=" + Double.SIZE + ", max_val=" + Double.MAX_VALUE + ", min_val=" + Double.MIN_VALUE);
		
		char a = 'a';
		char z = '中';
	}
	
}
