package com.changyou.demo.datastructure.sort;

/**
 * 快速排序，不稳定的排序方法
 * 平均时间复杂度：O(nlogn)
 * 平均空间复杂度：O(logn)
 * @author xubenling
 * @date Jun 24, 2015 4:59:06 PM
 */
public class QuickSort {

	
	public void sort(int[] data, int start, int end) {
		// 以第一个元素作为基准
		int temp = getPivotkey(data, start, end);  //data[start];
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
	
	/**
	 * 避免选择的基准数是最大数或最小数
	 * @param data
	 * @param start
	 * @param end
	 * @return
	 */
	public int getPivotkey(int[] data, int start, int end) {
		// 计算中间元素的下标
		int m = start + (end - start) / 2;
		// 交换左端与右端数据，保证左端较小
		if (data[start] > data[end]) {
			ArraysUtil.swap(data, start, end);
		}
		// 交换中间与右端数据，保证中间较小
		if (data[m] > data[end]) {
			ArraysUtil.swap(data, m, end);
		}
		// 交换中间与左端数据，保证中间较小
		if (data[m] > data[start]) {
			ArraysUtil.swap(data, m, start);
		}
		System.out.println("privot key=" + data[start]);
		return data[start];
	}
	
	
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		
		int[] arr = { 49, 38, 65, 97, 76, 13, 27, 50, 78, 34, 12, 64, 5, 4 };
		qs.sort(arr, 0, arr.length - 1);
		
		ArraysUtil.print(arr);
	}

}
