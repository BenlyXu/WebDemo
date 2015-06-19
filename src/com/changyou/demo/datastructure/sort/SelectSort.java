package com.changyou.demo.datastructure.sort;

/**
 * 选择排序
 * 基本思想：遍历数组
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * @author xubenling
 *
 */
public class SelectSort {
	
	public int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int selected = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[selected] > arr[j]) {
					selected = j;
				}
			}
			ArraysUtil.swap(arr, i, selected);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {38, 17, 16, 16, 7, 31, 39, 32, 2, 11};
		
		SelectSort obj = new SelectSort();
		obj.sort(arr);
		
		ArraysUtil.print(arr);
	}

}
