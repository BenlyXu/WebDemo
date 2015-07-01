package com.changyou.demo.points.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。返回新链表的头结点。
 * @author xubenling
 * @date Jul 1, 2015 11:57:46 AM
 */
public class PrintListFromTail {
	
	public List<Integer> printListFromTailToHeadByStack(ListNode listNode) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<ListNode> stack = new Stack<ListNode>();
		while (listNode != null) {
			stack.push(listNode);
			listNode = listNode.getNext();
		}
		
//		while (stack.peek() != null) {  // 不健壮的遍历，容易抛出异常java.util.EmptyStackException
		while (!stack.isEmpty()) {
			list.add(stack.pop().getVal());
		}
		
		return list;
	}

	
	List<Integer> tempList = new ArrayList<Integer>();
	public List<Integer> printListFromTailToHeadByRecursion(ListNode listNode) {
		if (listNode != null) {
			printListFromTailToHeadByRecursion(listNode.getNext());
			tempList.add(listNode.getVal());
		}
		return tempList;
	}
	
	
	public List<Integer> printListFromTailToHead(ListNode listNode) {
		List<Integer> list = new ArrayList<Integer>();
		
		while (listNode != null) {
			list.add(listNode.getVal());
			listNode = listNode.getNext();
		}
		Collections.reverse(list);
		
//		while (listNode != null) {
//			list.add(0, listNode.getVal());  // 注意这个方法list.add(index, E)
//			listNode = listNode.getNext();
//		}
		return list;
	}

	public static void main(String[] args) {
		// Build object
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ln1.setNext(ln2);
		ln2.setNext(ln3);
		
		PrintListFromTail obj = new PrintListFromTail();
		List<Integer> tempList = obj.printListFromTailToHead(ln1);
//		List<Integer> tempList = obj.printListFromTailToHeadByRecursion(ln1);
//		List<Integer> tempList = obj.printListFromTailToHeadByStack(ln1);
		
		// Print list
		for (Integer integer : tempList) {
			System.out.println(integer);
		}
	}

}
