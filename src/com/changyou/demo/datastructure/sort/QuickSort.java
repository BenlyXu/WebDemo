package com.changyou.demo.datastructure.sort;

/**
 * 快速排序
 * @author xubenling
 * @date Jun 24, 2015 4:59:06 PM
 */
public class QuickSort {

	
	public void sort(int[] data, int start, int end) {
		// 以第一个元素作为基准
		int temp = data[start];
		int i = start, j = end;
		while (i < j) {
			while (i < j && data[j] >= temp) {
				j--;
			}
			data[i] = data[j];
			while (i < j && data[i] <= temp) {
				i++;
			}
			data[j] = data[i];
		}
		// 此时，i==j
		data[i] = temp;
		
		if (start < i - 1) {
			sort(data, start, i - 1);
		}
		if (end > i + 1) {
			sort(data, i + 1, end);
		}
	}
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4 };
		qs.sort(arr, 0, arr.length - 1);
		
		ArraysUtil.print(arr);
	}

}
