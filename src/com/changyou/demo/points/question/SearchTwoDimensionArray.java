package com.changyou.demo.points.question;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author xubenling
 * @date Jul 1, 2015 10:34:02 AM
 */
public class SearchTwoDimensionArray {

	public static boolean search(int[][] arr, int target) {
		/* 
		 * 思路：
		 * 从数组右上角开始搜索，
		 * 若等于target，返回true；
		 * 若小于target，去掉该行；
		 * 若大于target，去掉该列。
		 */
		System.out.println("target=" + target);
		// 行数
		int rowCount = arr.length;
		// 列数
		int colCount = arr[0].length;
		for (int i = 0, j = colCount - 1; i < rowCount && j >= 0;) {
			int temp = arr[i][j];
			System.out.println("[" + i + "][" + j + "]=" + temp);
			if (target == temp) {
				System.out.println("Bingo~[" + i + "][" + j + "]=" + temp);
				return true;
			}
			if (target > temp) {
				i++;
				continue;
			}
			if (target < temp) {
				j--;
			}
		}		
		return false;
	}
	
	public static void main(String[] args) {
//		int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
		int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
//		System.out.println("行数i=" + arr.length);
//		System.out.println("列数j=" + arr[0].length);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.println("[" + i + "][" + j + "]=" + arr[i][j]);
//			}
//		}
		
		boolean flag = SearchTwoDimensionArray.search(arr, 7);
		System.out.println(flag);
	}

}
