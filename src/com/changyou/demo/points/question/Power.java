package com.changyou.demo.points.question;

public class Power {
	
	public double power(double base, int exponent) {
//		double result = 1;
//		for (int i = 1; i <= exponent; i++) {
//			result *= base;
//		}
//		return result;
		
		return Math.pow(base, exponent);
	}

	public static void main(String[] args) {
		Power p = new Power();
		System.out.println(p.power(2, 3));
		System.out.println(p.power(1, 10));
		System.out.println(p.power(0, 1));
		
	}

}
