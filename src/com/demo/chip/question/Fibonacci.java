package com.demo.chip.question;

/**
 * 求第n个斐波那契数列的值
 * @author xubenling
 * @date Jul 1, 2015 11:44:10 AM
 */
public class Fibonacci {
	
	/**
	 * 普通求法
	 * @param n
	 * @return
	 */
	public int fibN(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		
		int a = 1;
		int b = 1;
		int result = 0;
		for (int i = 3; i <= n; i++) {
			result = a + b;
			a = b;
			b = result;
		}
		return result;
	}
	
	/**
	 * 递归求法
	 * @param n
	 * @return
	 */
	public int fib(int n) {
		if (1 == n || 2 == n) {
			return 1;
		}
		
		return fib(n - 1) + fib(n - 2);
	}

	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
		Fibonacci obj = new Fibonacci();
		System.out.println(obj.fibN(8));
		System.out.println(obj.fib(8));
	}

}
