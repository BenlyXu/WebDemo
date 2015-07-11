package com.demo.points.question;

/**
 * 单链表反转
 * @author Ben
 * @date Jun 18, 2015 3:59:15 PM
 */
public class SingleLinkedNode {

	
	// 递归解决
	public ListNode recurReverse(ListNode head) {
		if (null == head || null == head.getNext()) {
	        return head;
        }
		// 递归
		ListNode reverseHead = recurReverse(head.getNext());
		// 获取先前的下一个结点，让该结点指向自身
		head.getNext().setNext(head);
		// 破坏自己以前的指向
		head.setNext(null);
		// 返回
		return reverseHead;
	}
	
	// 将当前结点的下一个结点缓存后，更改当前结点的指针
	public ListNode normalReverse(ListNode head) {
		if (null == head) {
	        return head;
        }
		ListNode pre = head;
		ListNode cur = head.getNext();
		ListNode next;
		while (cur != null) {
			// 缓存当前结点的下一个结点
	        next = cur.getNext();
	        // 然后重置当前结点的指针指向
	        cur.setNext(pre);
	        // 游标顺移
	        pre = cur;
	        cur = next;
        }
		// 将原来的头结点指向null
		head.setNext(null);

		// while结束时，pre指向的是新的头结点
		return pre;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.setNext(n2);
		n2.setNext(n3);
		
		SingleLinkedNode obj = new SingleLinkedNode();
		System.out.println(obj.recurReverse(n1));
		
	}

}
