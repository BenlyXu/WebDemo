package com.changyou.demo.points.question;

public class PrintRandomListNode {
	
	public ListNode findKthToTail(ListNode head,int k) {
		if (null == head) {
			return null;
		}
		
		int i = 1;
		while (head != null) {
			if (i == k) {
				return head;
			}
			i++;
			head = head.getNext();
		}
		
		// k已超出链表的长度，不存在该结点
		return null;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(null);
		
		PrintRandomListNode obj = new PrintRandomListNode();
		System.out.println(obj.findKthToTail(n1, 1));
	}

}
