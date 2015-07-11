package com.demo.points.search;

/**
 * @description <p>二分查找</p>
 * @authors Benly
 * @date Jul 5, 2015 1:58:02 PM
 */
public class BinarySearch {

	public static int search(int[] array, int key) {
		if (null == array || 0 == array.length) {
			return -1;
		}
		int min = 0;
		int max = array.length - 1;
		int mid = 0;
		while (min <= max) {
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
		int[] array = {1, 2, 3, 8, 8, 8, 8, 8, 9};
//		System.out.println(search(array, 7));
		
		System.out.println(getNumberOfK(array, 8));
	}
}
