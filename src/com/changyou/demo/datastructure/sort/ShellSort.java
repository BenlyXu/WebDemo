package com.changyou.demo.datastructure.sort;

/**
 * 希尔排序
 * 不稳定的排序，时间复杂度为O(n^3/2)
 * 增量序列的最后一个增量值必须为1
 * @author xubenling
 * @date Jun 24, 2015 4:55:29 PM
 */
public class ShellSort {
	
	public void sort(int[] arr) {
		for (int increment = arr.length / 2; increment > 0; increment /= 2) {
			System.out.println("increment=" + increment);
			for (int i = 0; i < arr.length; i += increment) {
				System.out.println("i=" + i);
				for (int j = i; j > 0; j -= increment) {
					if (arr[j] < arr[j - increment]) {
						ArraysUtil.swap(arr, j, j - increment);
					}
				}
				ArraysUtil.print(arr);
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {9, 1, 5, 8, 3, 7, 4, 6, 2};
		ShellSort ss = new ShellSort();
		ss.sort(arr);
//		ArraysUtil.print(arr);
	}

}
