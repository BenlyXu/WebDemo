package com.demo.points.question;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并输出它的后序遍历序列。
 * (测试用例中，"树"的输出形式类似于树的层次遍历，没有节点的用#来代替)
 * @author xubenling
 * @date Jul 1, 2015 3:41:52 PM
 */
public class RebuildBinaryTree {

	/**
	 * 通过前序和中序构建二叉树
	 * @param pre
	 * @param in
	 * @return
	 */
	public TreeNode reConstructByPreAndIn(int[] pre, int[] in) {
		if (null == pre || null == in) {
			return null;
		}
		return rebuildByPreAndIn(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }
	
	
	public TreeNode rebuildByPreAndIn(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
		// 构造根节点，前序遍历的第一个节点值
		TreeNode root = new TreeNode(pre[preStart]);
		if (preStart == preEnd && inStart == inEnd) {
			return root;
		}
		// 获取根节点在中序遍历的位置
		int rootIndex = inStart;
		for (; rootIndex <= inEnd; rootIndex++) {
			if (root.getVal() == in[rootIndex]) {
				break;
			}
		}
		// 分割左右子树
		int leftTreeLength = rootIndex - inStart;
		int rightTreeLength = inEnd - rootIndex;
		// 设置根节点的左右子树
		if (leftTreeLength > 0) {
			root.setLeft(rebuildByPreAndIn(pre, in, preStart + 1, preStart + leftTreeLength, inStart, rootIndex - 1));
		}
		if (rightTreeLength > 0) {
			root.setRight(rebuildByPreAndIn(pre, in, preStart + leftTreeLength + 1, preEnd, rootIndex + 1, inEnd));
		}
		return root;
	}
	
	
	/**
	 * 通过后序和中序构建二叉树
	 * @param post
	 * @param in
	 * @return
	 */
	public TreeNode reConstructByPostAndIn(int[] post, int[] in) {
		if (null == post || null == in) {
			return null;
		}
		return rebuildByPostAndIn(post, in, 0, post.length - 1, 0, in.length - 1);
    }
	
	public TreeNode rebuildByPostAndIn(int[] post, int[] in, int postStart, int postEnd, int inStart, int inEnd) {
		// 构造根节点，前序遍历的第一个节点值
		TreeNode root = new TreeNode(post[postEnd]);
		if (postStart == postEnd && inStart == inEnd) {
			return root;
		}
		// 获取根节点在中序遍历的位置
		int rootIndex = inStart;
		for (; rootIndex <= inEnd; rootIndex++) {
			if (root.getVal() == in[rootIndex]) {
				break;
			}
		}
		// 分割左右子树
		int leftTreeLength = rootIndex - inStart;
		int rightTreeLength = inEnd - rootIndex;
		// 设置根节点的左右子树
		if (leftTreeLength > 0) {
			root.setLeft(rebuildByPostAndIn(post, in, postStart, postStart + leftTreeLength - 1, inStart, rootIndex - 1));
		}
		if (rightTreeLength > 0) {
			root.setRight(rebuildByPostAndIn(post, in, postStart + leftTreeLength, postEnd - 1, rootIndex + 1, inEnd));
		}
		return root;
	}
	
	
	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		int[] post = {7, 4, 2, 5, 8, 6, 3, 1};
		
		RebuildBinaryTree obj = new RebuildBinaryTree();
		TreeNode.printByPostorder(obj.reConstructByPreAndIn(pre, in));
		System.out.println();
		TreeNode.printByPreorder(obj.reConstructByPostAndIn(post, in));
	}
	
}
