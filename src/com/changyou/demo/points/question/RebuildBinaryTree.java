package com.changyou.demo.points.question;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并输出它的后序遍历序列。
 * (测试用例中，"树"的输出形式类似于树的层次遍历，没有节点的用#来代替)
 * @author xubenling
 * @date Jul 1, 2015 3:41:52 PM
 */
public class RebuildBinaryTree {

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (null == pre || null == in) {
			return null;
		}
		return rebuildByRecursion(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }
	
	
	public TreeNode rebuildByRecursion(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
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
			root.setLeft(rebuildByRecursion(pre, in, preStart + 1, preStart + leftTreeLength, inStart, rootIndex - 1));
		}
		if (rightTreeLength > 0) {
			root.setRight(rebuildByRecursion(pre, in, preStart + leftTreeLength + 1, preEnd, rootIndex + 1, inEnd));
		}
		return root;
	}
	
	/**
	 * NLR 前序遍历：PreorderTraversal
	 * LNR 中序遍历：InorderTraversal
	 * LRN 后续遍历：PostorderTraversal
	 */
	public void printByPostorder(TreeNode treeNode) {
		if (null == treeNode) {
			return;
		}
		// 先后序遍历左子树
		printByPostorder(treeNode.getLeft());
		// 再后续遍历右子树
		printByPostorder(treeNode.getRight());
		// 显示结点数据
		System.out.print(treeNode.getVal() + " ");
	}
	
	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		
		RebuildBinaryTree obj = new RebuildBinaryTree();
		obj.printByPostorder(obj.reConstructBinaryTree(pre, in));
	}
	
}
