package com.demo.chip.question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 面试时经常碰到的3个问题：求和、反转函数、反转栈
 * @author xubenling
 * @since Jul 20, 2015
 */
public class ThreeInterviewQuestions {
	/**
	 * 求从10到100中能被3或5整除的数的和
	 * @param start
	 * @param end
	 * @return
	 */
	private static int getSum(int start, int end) {
		if (start > end) {
			throw new IllegalArgumentException("不合法的参数");
		}
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	/**
	 * 将一个字符串逆序，不要使用反转函数
	 * @param str
	 * @return
	 */
	private static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
		// 借助StringBuilder的reverse函数
//		return new StringBuilder(str).reverse().toString();
	}
	
	/**
	 * 反转一个栈
	 * @param stack
	 */
	private static <E> void reverseStack(Stack<E> stack) {
		Queue<E> queue = new LinkedList<E>();
		while (!stack.isEmpty()) {
			queue.offer(stack.pop());
		}
		while (!queue.isEmpty()) {
			stack.push(queue.poll());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("从10到100中能被3或5整除的数的和：" + getSum(10, 100));
		
		System.out.println("字符串反转：" + reverseString("hello string"));
		
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		reverseStack(stack);
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
