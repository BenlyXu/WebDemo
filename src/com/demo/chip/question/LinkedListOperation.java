package com.demo.chip.question;

/**
 * @description <p>链表操作</p>
 * @authors Benly
 * @date Jul 5, 2015 12:07:45 PM
 */
public class LinkedListOperation {
	
	/**
	 * @description <p>打印链表</p>
	 * @authors Benly
	 * @date Jul 5, 2015 12:16:30 PM
	 * @param head
	 */
	public static <T> void print(Node<T> head) {
		if (null == head) {
			return;
		}
		while (null != head) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	/**
	 * @description <p>从尾部开始打印链表</p>
	 * @authors Benly
	 * @date Jul 5, 2015 12:56:33 PM
	 * @param head
	 */
	public static <T> void printFromTailToHead(Node<T> head) {
		if (null == head) {
			return;
		}
		printFromTailToHead(head.next);
		System.out.print(head.data + " ");
		// 或者借助栈来实现
	}
	
	/**
	 * @description <p>向尾部增加结点</p>
	 * @authors Benly
	 * @date Jul 5, 2015 12:18:52 PM
	 * @param args
	 */
	public static <T> void addToTail(Node<T> head, Node<T> node) {
		if (null == node) {
			return;
		}
		if (null == head) {
			head = node;
		}
		while (null != head.next) {
			head = head.next;
		}
		head.next = node;
		node.next = null;
	}
	
	/**
	 * @description <p>从尾部删除结点</p>
	 * @authors Benly
	 * @date Jul 5, 2015 12:49:48 PM
	 * @param head
	 */
	public static <T> void delFromTail(Node<T> head) {
		if (null == head) {
			return;
		}
		Node<T> pre = null;
		Node<T> cur = head;
		while (null != cur.next) {
			pre = cur;
			cur = cur.next;
		}
		pre.next = null;
	}
	

	public static void main(String[] args) {
		Node<String> node1 = new Node<String>("a");
		Node<String> node2 = new Node<String>("b");
		Node<String> node3 = new Node<String>("c");
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		
//		print(node1);
		
//		Node<String> node4 = new Node<String>("d");
//		addToTail(node1, node4);
//		print(node1);
		
//		delFromTail(node1);
//		print(node1);
//		System.out.println(node3 == null);
		
		printFromTailToHead(node1);
	}
	
	public static class Node<T> {
		T data;
		Node<T> next;
		public Node(T data) {
			this.data = data;
		}
	}
}
