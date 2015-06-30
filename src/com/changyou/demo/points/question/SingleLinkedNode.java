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
		// 获取先前的下一个节点，让该节点指向自身
		head.getNext().setNext(head);
		// 破坏自己以前的指向
		head.setNext(null);
		// 返回
		return reverseHead;
	}
	
	// 将当前节点的下一个节点缓存后，更改当前节点的指针
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
		head.setNext(null);
		head = pre;
		
		return head;
	}
	
	
	@Data
	public class Node {
		private int val;
		private Node next;
	}
}
