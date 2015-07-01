package com.changyou.demo.points.question;

/**
 * 反转二位数组
 * @author xubenling
 * @date Jul 1, 2015 11:23:09 AM
 */
public class ReverseTwoDimensionArray {

	public static int[][] reverse(int[][] array) {
		int[][] temp = new int[array[0].length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				temp[j][i] = array[i][j];
			}
		}
		return temp;
	}
	
	public static void printTDArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] < 10) {
					System.out.print(arr[i][j] + "  ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		ReverseTwoDimensionArray.printTDArray(arr);
		
		System.out.println("-------------------------");
		int[][] temp = ReverseTwoDimensionArray.reverse(arr);
		
		ReverseTwoDimensionArray.printTDArray(temp);
	}
	
}
