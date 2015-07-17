package com.demo.chip.question;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * @author xubenling
 * @date Jul 3, 2015 11:30:42 AM
 */
public class JudgeStackPopOrder {
	
	/**
	 * 遍历pushA中的元素入栈，遍历的过程中检索popA可以出栈的元素；
	 * 如果遍历结束后栈还不空，则说明该序列不是pop序列。
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean isPopOrder(ArrayList<Integer> pushA,ArrayList<Integer> popA) {
	    Stack<Integer> stack = new Stack<Integer>();
	    int i = 0;
	    for (Integer integer : pushA) {
			stack.push(integer);
			while (!stack.isEmpty() && stack.peek() == popA.get(i)) {
				stack.pop();
				i++;
			}
		}
	    return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		ArrayList<Integer> pushA = new ArrayList<Integer>();
		for (int i = 1; i <= 5; i++) {
			pushA.add(i);
		}
		
		ArrayList<Integer> popA = new ArrayList<Integer>();
		popA.add(4);
		popA.add(5);
		popA.add(3);
		popA.add(2);
		popA.add(1);
		
		JudgeStackPopOrder obj = new JudgeStackPopOrder();
		System.out.println(obj.isPopOrder(pushA, popA));
	}

}
