package com.changyou.demo.points.question;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @description TODO
 * @authors Benly
 * @date Jul 4, 2015 1:23:20 PM
 */
public class GetSum {
	
	public static int sum(int num1, int num2) {
		int n1 = num1;
		int n2 = num2;
		do {
			// 异或，实现相加但不求和
			n1 = num1 ^ num2;
			// 先位与，后左移，相当于进位
			n2 = (num1 & num2) << 1;
			num1 = n1;
			num2 = n2;
		} while (num2 != 0);
		return n1;
		
		// 递归算法
//		if (0 == num2) {
//			return num1;
//		}
//		int temp = num1;
//		num1 = num1 ^ num2;
//		num2 = (temp & num2) << 1;
//		return sum(num1, num2);
	}

	public static void main(String[] args) {
		System.out.println(GetSum.sum(1, 3));
	}

}
