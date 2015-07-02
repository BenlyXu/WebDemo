package com.changyou.demo.points.question;

import lombok.Data;

/**
 * 单链表反转
 * @description TODO
 * @author Ben
 * @date Jun 18, 2015 3:59:15 PM
 */
public class SingleLinkedNode {

	
	// 递归解决
	public Node recurReverse(Node head) {
		if (null == head || null == head.getNext()) {
	        return head;
        }
		// 递归
		Node reverseHead = recurReverse(head.getNext());
		// 获取先前的下一个结点，让该结点指向自身
		head.getNext().setNext(head);
		// 破坏自己以前的指向
		head.setNext(null);
		// 返回
		return reverseHead;
	}
	
	// 将当前结点的下一个结点缓存后，更改当前结点的指针
	public Node normalReverse(Node head) {
		if (null == head) {
	        return head;
        }
		Node pre = head;
		Node cur = head.getNext();
		Node next;
		while (cur != null) {			
	        next = cur.getNext();
	        cur.setNext(pre);
	        pre = cur;
	        cur = next;
        }
		// 将原来的头结点指向null
		head.setNext(null);
		// 将原来的尾结点变成头结点
		head = pre;
		
		return head;
	}
	
	
	@Data
	public class Node {
		private int val;
		private Node next;
	}
}
