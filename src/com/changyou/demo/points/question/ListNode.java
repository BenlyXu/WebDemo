package com.changyou.demo.points.question;

import lombok.Data;

@Data
public class ListNode {
	private int val;
	private ListNode next = null;
	
	public ListNode(int val) {
		this.val = val;
	}
}
