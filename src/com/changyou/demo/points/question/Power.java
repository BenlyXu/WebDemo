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
	
	// a^n = a^(n/2)*a^(n/2), n为偶数
	// a^n = a^((n-1)/2)*a^((n-1)/2)*a, n为奇数
	public double power2(double base, int exponent) {
		if (0 == exponent) {
			return 1;
		}
		if (1 == exponent) {
			return base;
		}
		double result = power2(base, exponent >> 1);  // 右移一位相当于除以2，注意exponent为整形，整除取整
		result *= result;
		if ((exponent & 0x1) == 1) {  // 与1位与判断奇偶
			result *= base;
		}
		return result;
	}

	public static void main(String[] args) {
		Power p = new Power();
//		System.out.println(p.power(2, 3));
//		System.out.println(p.power(1, 10));
//		System.out.println(p.power(0, 1));
		
		System.out.println(p.power2(2, 5));
//		System.out.println(p.power2(2, 4));
	}

}
