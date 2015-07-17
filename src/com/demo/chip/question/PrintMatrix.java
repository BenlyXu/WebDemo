package com.demo.chip.question;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author xubenling
 * @date Jul 2, 2015 4:59:53 PM
 */
public class PrintMatrix {

	public ArrayList<Integer> printMatrix(int[][] matrix) {
		if (matrix == null || 0 == matrix.length) {
			return null;
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		// 行
		int rows = matrix.length;
		// 列
		int cols = matrix[0].length;
		// 标识开始的下标
		int start = 0;
		while (rows > start * 2 && cols > start * 2) {
			printInCircle(matrix, start, rows, cols, result);
			start++;
		}
		return result;
    }
	
	
	public void printInCircle(int[][] matrix, int start, int rows, int cols, ArrayList<Integer> result) {
		int endX = cols - 1 - start;
		int endY = rows - 1 - start;
		
		for (int i = start; i <= endX; i++) {
			result.add(matrix[start][i]);
		}
		
		if (start < endY) {
			for (int i = start + 1; i <= endY; i++) {
				result.add(matrix[i][endX]);
			}
		}
		
		if (start < endY && start < endX) {
			for (int i = endX - 1; i >= start; i--) {
				result.add(matrix[endY][i]);
			}
		}
		
		if (start < endY - 1 && start < endX) {
			for (int i = endY - 1; i > start; i--) {
				result.add(matrix[i][start]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		PrintMatrix obj = new PrintMatrix();
		ArrayList<Integer> list = obj.printMatrix(matrix);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
}
