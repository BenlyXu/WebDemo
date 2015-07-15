package com.demo.points.search;

/**
 * @description <p>二分查找</p>
 * @authors Benly
 * @date Jul 5, 2015 1:58:02 PM
 */
public class BinarySearch {

	
	/**
	 * 循环实现
	 * @param array
	 * @param key
	 * @return
	 */
	public static int search(int[] array, int key) {
		if (null == array || 0 == array.length) {
			return -1;
		}
		int min = 0;
		int max = array.length - 1;
		int mid = 0;
		while (min <= max) {
			/**
			 * 计算mid时不要使用(min + max) / 2，因为加法运算可能导致整数越界，可以使用以下3种方式之一：
			 * 1. min + (max - min) / 2
			 * 2. min + (max - min) >> 1
			 * 3. (min + max) >>> 1
			 * >>>是无符号右移
			 */
			mid = (min + max) / 2;
			if (key < array[mid]) {
				// 在左半区域
				max = mid - 1;
			} else if (key > array[mid]) {
				// 在有半区域
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public static int searchByRecursion(int[] arr, int low, int high, int key) {
		if (low <= high) {
			int mid = (low + high) >>> 1;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return searchByRecursion(arr, low, mid - 1, key);
			}
			if (arr[mid] < key) {
				return searchByRecursion(arr, mid + 1, high, key);
			}
		}
		return -1;
	}
	
	
	// 统计某个数字在排序数组中出现的次数
	public static int getNumberOfK(int[] array, int k) {
		int number = 0;
		if (array != null && array.length > 0) {
			int firstK = getFirstK(array, k, 0, array.length - 1);
			int lastK = getLastK(array, k, 0, array.length - 1);
			if (firstK > -1 && lastK > -1) {
				number = lastK - firstK + 1;
			}
		}
		return number;
	}
	// 找到第一个k的位置
	public static int getFirstK(int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middleIndex = (start + end) / 2;
		int middleData = array[middleIndex];
		if (middleData == k) {
			if (middleIndex > 0 && array[middleIndex - 1] != k || middleIndex == 0) {
				return middleIndex;
			} else {
				end = middleIndex - 1;
			}
		} else if (middleData > k) {
			end = middleIndex - 1;
		} else {
			start = middleIndex + 1;
		}
		return getFirstK(array, k, start, end);
	}
	// 找到最后一个k的位置
	public static int getLastK(int[] array, int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middleIndex = (start + end) / 2;
		int middleData = array[middleIndex];
		if (middleData == k) {
			if (middleIndex < array.length - 1 && array[middleIndex + 1] != k || middleIndex == array.length - 1) {
				return middleIndex;
			} else {
				start = middleIndex + 1;
			}
		} else if (middleData < k) {
			start = middleIndex + 1;
		} else {
			end = middleIndex - 1;
		}
		return getLastK(array, k, start, end);
	}
	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(searchByRecursion(array, 0, array.length - 1, 7));
		
//		System.out.println(getNumberOfK(array, 8));
	}
}
