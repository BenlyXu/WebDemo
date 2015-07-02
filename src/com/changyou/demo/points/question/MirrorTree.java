package com.changyou.demo.points.question;

/**
 * 输入一个二叉树，输出其镜像。
 * @author xubenling
 * @date Jul 2, 2015 4:42:25 PM
 */
public class MirrorTree {

	/**
	 * 镜像，即交换左右子树
	 * @param root
	 */
	public void mirror(TreeNode root) {
    	if (null == root) {
			return;
		}
    	// 1
    	TreeNode tempLeft = root.getLeft();
    	root.setLeft(root.getRight());
    	root.setRight(tempLeft);
    	
    	// 2
    	mirror(root.getLeft());
    	mirror(root.getRight());
    	
    	// 交换1、2代码块的位置，同样正确
    }
	
	public static void main(String[] args) {
		
	}
}
