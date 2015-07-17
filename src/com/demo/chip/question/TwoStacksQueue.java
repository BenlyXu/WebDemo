package com.demo.chip.question;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 * @author xubenling
 * @date Jul 1, 2015 4:59:34 PM
 */
public class TwoStacksQueue {

	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	public void offer(int node) {
		// 先将栈2的元素放入栈1
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		// 将node入栈1
		stack1.push(node);
    }
	
	public int poll() {
		// 先将栈1的元素放入栈2
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		// 出栈2
	    return stack2.pop();
	}

	public static void main(String[] args) {
		TwoStacksQueue obj = new TwoStacksQueue();
		obj.offer(1);  // 1
		obj.offer(2);  // 1, 2
		obj.poll();    // 2
		obj.offer(3);  // 2, 3
		obj.offer(4);  // 2, 3, 4
		obj.poll();    // 3, 4
		obj.poll();    // 4
	}

}
