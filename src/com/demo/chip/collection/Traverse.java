package com.demo.chip.collection;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 栈和队列的遍历
 * @author xubenling
 * @date Jul 1, 2015 2:39:42 PM
 */
public class Traverse {
	
	public static void printSplitLine() {
		System.out.println("\r\n-------------------");
	}

	public static void main(String[] args) {
		// Build stack
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		// for-each循环遍历
		for (Integer integer : stack) {
			System.out.print(integer + " ");
		}
		Traverse.printSplitLine();
		
		// 出栈遍历
		while (!stack.isEmpty()) {  // stack.peek() != null 不健壮的判断方式，容易抛出异常
			System.out.print(stack.pop() + " ");
		}
		Traverse.printSplitLine();
		
		
		// Build queue
		Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		
		for (Integer integer : queue) {
			System.out.print(integer + " ");
		}
		Traverse.printSplitLine();
		
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
		Traverse.printSplitLine();
		
	}

}
