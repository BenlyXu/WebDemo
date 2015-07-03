package com.changyou.demo.points.question;

import java.util.LinkedList;
import java.util.Queue;

import lombok.Data;

@Data
public class TreeNode {

	private int val;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
	}

	/**
	 * 后续遍历：PostorderTraversal
	 * LRN
	 */
	public static void printByPostorder(TreeNode treeNode) {
		if (null == treeNode) {
			return;
		}
		printByPostorder(treeNode.getLeft());
		printByPostorder(treeNode.getRight());
		System.out.print(treeNode.getVal() + " ");
	}
	
	/**
	 * 中序遍历：InorderTraversal
	 * LNR
	 * @param treeNode
	 */
	public static void printByInorder(TreeNode treeNode) {
		if (null == treeNode) {
			return;
		}
		printByInorder(treeNode.getLeft());
		System.out.print(treeNode.getVal() + " ");
		printByInorder(treeNode.getRight());
	}
	
	/**
	 * 前序遍历：PreorderTraversal
	 * NLR
	 * @param treeNode
	 */
	public static void printByPreorder(TreeNode treeNode) {
		if (null == treeNode) {
			return;
		}
		// 显示结点数据
		System.out.print(treeNode.getVal() + " ");
		// 先前序遍历左子树
		printByPreorder(treeNode.getLeft());
		// 再前续遍历右子树
		printByPreorder(treeNode.getRight());
	}
	
	/**
	 * 层序遍历
	 * 思路：如果根结点为空，直接返回；
	 * 否则，用一个队列存储根结点，然后从队列弹出根结点，并获取子结点添加到队列中，依次作上述操作。
	 * @param treeNode
	 */
	public static void printByLevelOrder(TreeNode treeNode) {
		if (null == treeNode) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(treeNode);
		while (!queue.isEmpty()) {
			TreeNode curr = queue.poll();
			System.out.println(curr.getVal());
			
			if (curr.getLeft() != null) {
				queue.offer(curr.getLeft());
			}
			if (curr.getRight() != null) {
				queue.offer(curr.getRight());
			}
		}
	}
}
