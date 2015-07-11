package com.demo.points.question;

import java.util.Arrays;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * @author xubenling
 * @date Jul 2, 2015 8:03:05 PM
 */
public class StackExtension {
	
	// 借用辅助栈存储min的大小，有两种方式，具体参考
	// http://stackoverflow.com/questions/685060/design-a-stack-such-that-getminimum-should-be-o1
	private int size;
	private int min = Integer.MAX_VALUE;
	private int max = Integer.MIN_VALUE;
	private Stack<Integer> minStack = new Stack<Integer>();
	private Integer[] elements = new Integer[10];
	
	private void ensureCapacity(int size) {
		int len = elements.length;
		if (size > len) {
			int newLen = (len * 3) / 2 + 1; // 每次扩容方式
			elements = Arrays.copyOf(elements, newLen);
		}
	}
	
	public boolean empty() {
		return size == 0;
	}

	public void push(int node) {
		ensureCapacity(size + 1);
		elements[size++] = node;
		if (node <= min) {
			minStack.push(node);
			min = minStack.peek();
		} else {
			minStack.push(min);
		}
	}

	public void pop() {
		Integer top = top();
		if (top != null) {
			elements[size - 1] = (Integer) null;
		}
		size--;
		minStack.pop();
		min = minStack.peek();
	}

	public int top() {
		if (!empty()) {
			if (size - 1 >= 0)
				return elements[size - 1];
		}
		return (Integer) null;
	}

	public int min() {
		return min;
	}
	
	public int max() {
		return max;
	}
	
	// --------------------------Split Line---------------------------------
	// extends Stack<Integer>
//	private Stack<Integer> minStack;
//    private Stack<Integer> maxStack;
//
//    public StackWithMinMax () {
//        minStack = new Stack<Integer>();    
//        maxStack = new Stack<Integer>();    
//    }
//
//    public void push(int value){
//        if (value <= min()) { // Note the '=' sign here
//            minStack.push(value);
//        }
//
//        if (value >= max()) {
//            maxStack.push(value);
//        }
//
//        super.push(value);
//    }
//
//    public Integer pop() {
//        int value = super.pop();
//
//        if (value == min()) {
//            minStack.pop();         
//        }
//
//        if (value == max()) {
//            maxStack.pop();         
//        }
//
//        return value;
//    }
//
//    public int min() {
//        if (minStack.isEmpty()) {
//            return Integer.MAX_VALUE;
//        } else {
//            return minStack.peek();
//        }
//    }
//
//    public int max() {
//        if (maxStack.isEmpty()) {
//            return Integer.MIN_VALUE;
//        } else {
//            return maxStack.peek();
//        }
//    }

	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		StackExtension se = new StackExtension();
		se.push(5);
		se.push(4);
		se.push(1);
		se.push(2);
		se.push(3);
		System.out.println(se.min());
	}

}
