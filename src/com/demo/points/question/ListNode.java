package com.demo.points.question;

import lombok.Data;

@Data
public class ListNode {
	private int val;
	private ListNode next = null;
	
	public ListNode(int val) {
		this.val = val;
	}
	
	public static void print(ListNode head) {
		if (null == head) {
			return;
		}
		while (head != null) {
			System.out.print(head.getVal() + " ");
			head = head.getNext();
		}
	}
}
