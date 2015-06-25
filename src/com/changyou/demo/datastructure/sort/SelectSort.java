package com.changyou.demo.datastructure.sort;

/**
 * 选择排序
 * 基本思想：选取关键字最小的记录作为有序序列的第i个记录
 * 时间复杂度：O(n^2)，性能上略优于冒泡排序
 * 空间复杂度：O(1)
 * @author xubenling
 *
 */
public class SelectSort {
	
	/**
	 * 简单选择排序
	 * @param arr
	 * @return
	 */
	public int[] simpleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (i != min) {
				ArraysUtil.swap(arr, i, min);
			}
		}
		return arr;
	}
	
	
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {38, 17, 16, 16, 7, 31, 39, 32, 2, 11};
		
		SelectSort ss = new SelectSort();
		ss.simpleSort(arr);
		
		ArraysUtil.print(arr);
	}

}
