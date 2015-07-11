package com.demo.points.question;

public class MergeListNode {
	
	/**
	 * 递归合并
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode mergeByRecursion(ListNode list1, ListNode list2) {
		// 空链表的判断处理
		if (null == list1) {
			return list2;
		}
		if (null == list2) {
			return list1;
		}
		
		// 巧妙的递归处理
		ListNode mergeHead;
		if (list1.getVal() < list2.getVal()) {
			mergeHead = list1;
			mergeHead.setNext(mergeByRecursion(list1.getNext(), list2));
		} else {
			mergeHead = list2;
			mergeHead.setNext(mergeByRecursion(list1, list2.getNext()));
		}
		return mergeHead;
	}
	
	
	/**
	 * 非递归方式实现链表合并
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode merge(ListNode list1, ListNode list2) {
		// 空链表的判断处理
		if (null == list1) {
			return list2;
		}
		if (null == list2) {
			return list1;
		}
		
		// 构造虚拟头结点
		ListNode n = new ListNode(-1);
		// 缓存该结点，以便返回
		ListNode q = n;
		// 当其中一个链表为null时，比较结束
		while (list1 != null && list2 != null) {
			if (list1.getVal() < list2.getVal()) {
				n.setNext(list1);
				list1 = list1.getNext();
			} else {
				n.setNext(list2);
				list2 = list2.getNext();
			}
			// 重置游标
			n = n.getNext();
		}
		// 继续链接剩余的链表
		if (list1 != null) {
			n.setNext(list1);
		}
		if (list2 != null) {
			n.setNext(list2);
		}
		
		return q.getNext();
	}
	
	

	public static void main(String[] args) {
		// 构造两个测试链表
		// n1->n3->n5->null
		// n2->n4
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.setNext(n3);
		n3.setNext(n5);
		n2.setNext(n4);
		
		// 经过merge后
		// n1->n2->n3->n4->n5->null
		MergeListNode obj = new MergeListNode();
//		ListNode.print(obj.merge(n1, n2));
		ListNode.print(obj.mergeByRecursion(n1, n2));
	}

}
