package com.demo.points.question;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @authors Benly
 * @date Jul 4, 2015 12:59:43 PM
 */
public class SumOneToN {
	
	// n * (n + 1) / 2
	public int sum(int n) {
		if (0 == n) {
			return 0;
		}
		return n + sum(n - 1);
	}
	
	public static void main(String[] args) {
		SumOneToN obj = new SumOneToN();
		System.out.println(obj.sum(100));
	}

}
