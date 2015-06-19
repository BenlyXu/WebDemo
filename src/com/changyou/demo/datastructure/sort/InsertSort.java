package com.changyou.demo.datastructure.sort;

/**
 * 插入排序
 * 基本思想：将待插入的元素与已排序的元素比较；它是一个不稳定的排序方法，插入效率与数组初始顺序息息相关。
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * @author xubenling
 *
 */
public class InsertSort {
	
	public void sort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int toInsEle = arr[i];
			int j = i;
			for (; j > 0; j--) {
				if (arr[j - 1] < toInsEle) {
					break;
				}
				arr[j] = arr[j - 1];
			}
			arr[j] = toInsEle;
		}
	}

	public static void main(String[] args) {
		int[] arr = {11, 31, 12, 5, 34, 30, 26, 38, 36, 18};
		
		InsertSort is = new InsertSort();
		is.sort(arr);
		
		ArraysUtil.print(arr);
	}

}
