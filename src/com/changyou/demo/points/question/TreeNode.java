package com.changyou.demo.points.question;

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
	 * NLR 前序遍历：PreorderTraversal
	 * LNR 中序遍历：InorderTraversal
	 * LRN 后续遍历：PostorderTraversal
	 */
	public static void printByPostorder(TreeNode treeNode) {
		if (null == treeNode) {
			return;
		}
		printByPostorder(treeNode.getLeft());
		printByPostorder(treeNode.getRight());
		System.out.print(treeNode.getVal() + " ");
	}
	
	public static void printByInorder(TreeNode treeNode) {
		if (null == treeNode) {
			return;
		}
		printByInorder(treeNode.getLeft());
		System.out.print(treeNode.getVal() + " ");
		printByInorder(treeNode.getRight());
	}
	
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
	
}
