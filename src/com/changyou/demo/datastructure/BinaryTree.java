package com.changyou.demo.datastructure;

import lombok.Data;

@Data
public class BinaryTree {
	
	private Object data;
	private BinaryTree lchild, rchild;
	
	/**
	 * 前序遍历
	 * @param bt
	 */
	public void preOrderTraverse(BinaryTree bt) {
		if (bt == null) {
			return;
		}
		System.out.println(bt.getData());
		preOrderTraverse(bt.getLchild());
		preOrderTraverse(bt.getRchild());
	}
	
	
	/**
	 * 中序遍历
	 * @param bt
	 */
	public void inOrderTraverse(BinaryTree bt) {
		if (bt == null) {
			return;
		}
		inOrderTraverse(bt.getLchild());
		System.out.println(bt.getData());
		inOrderTraverse(bt.getRchild());
	}
	
	
	/**
	 * 后序遍历
	 * @param bt
	 */
	public void postOrderTraverse(BinaryTree bt) {
		if (bt == null) {
			return;
		}
		postOrderTraverse(bt.getLchild());
		postOrderTraverse(bt.getRchild());
		System.out.println(bt.getData());
	}

	
}
