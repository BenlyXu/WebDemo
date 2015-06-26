package com.changyou.demo.points.sort;

/**
 * 插入排序
 * 基本思想：将待插入的元素与已排序的元素比较；它是一个不稳定的排序方法，插入效率与数组初始顺序息息相关。
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * @author xubenling
 *
 */
public class InsertSort {
	
	public void straightSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			// 当前元素小于前一个元素
			if (arr[i] < arr[i - 1]) {
				// 设置哨兵
				int temp = arr[i];
				// 记录后移
				int j = i - 1;
				for (; j >= 0 && arr[j] > temp; j--) {
					arr[j + 1] = arr[j];
				}
				// 哨兵入队
				arr[j + 1] = temp;
			}
		}
	}
	
	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int toInsEle = arr[i];
			int j = i - 1;
			for (; j >= 0 && toInsEle < arr[j]; j--) {
				// 将大于toInsEle的值整体后移一个单位
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = toInsEle;
		}
	}
	
	public void sortWithWhileLoop(int[] arr) {
		int i = 1;
		while (i < arr.length) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;			
			i++;
		}
	}

	public static void main(String[] args) {
		int[] arr = {11, 31, 12, 5, 34, 30, 26, 38, 36, 18};
		
		InsertSort is = new InsertSort();
//		is.sort(arr);
//		is.sortWithWhileLoop(arr);
		is.straightSort(arr);
		
		ArraysUtil.print(arr);
	}

}
