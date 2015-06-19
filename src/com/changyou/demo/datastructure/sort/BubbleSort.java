package com.changyou.demo.datastructure.sort;

/**
 * 冒泡排序
 * 基本思想：将待排序的元素看做竖直排列的气泡，较小的元素比较轻，从而要往上浮。
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * @author xubenling
 *
 */
public class BubbleSort {
	
	public void sort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					ArraysUtil.swap(arr, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {38, 17, 16, 16, 7, 31, 39, 32, 2, 11};
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
		ArraysUtil.print(arr);
	}

}
