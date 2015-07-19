package com.demo.chip.sort;

import java.util.Random;

/**
 * 内部排序（只使用内存）算法分类：
 * --交换排序：冒泡排序、快速排序
 * --选择排序：简单选择排序、堆排序
 * --插入排序：直接插入排序、希尔排序
 * --归并排序
 * 
 * 平均速度最快的是：快速排序O(nlogn)
 * 所需辅助空间最少的是：堆排序
 * 所需辅助空间最多的是：归并排序
 * 不稳定的排序是：快速排序、堆排序、希尔排序
 * @author Benly
 * @since Jul 18, 2015
 */
public class SortAlgorithmTest {
	
	private static final int ARRAY_LENGTH = 10;
	
	private static void isArrayIllegal(int[] arr) {
		if (null == arr || 0 == arr.length) {
			throw new IllegalArgumentException("Illegal argument array.");
		}
	}
			
	/**
	 * 构造数组
	 * 范围：1~100
	 * @param arrLength
	 * @return
	 */
	private static int[] buildRandomIntArray(int arrLength) {
		if (0 == arrLength) {
			throw new IllegalArgumentException("Parameter array's length must more than 0.");
		}
		int[] arr = new int[arrLength];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
		return arr;
	}
	
	/**
	 * 打印数组
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		if (arr != null && arr.length > 0) {
			StringBuilder sb = new StringBuilder(50);
			sb.append("  ");
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
				if (i != arr.length - 1) {
					sb.append(",");
				}
			}
			System.out.println(sb.toString());
		}
	}
	
	/**
	 * 交换值
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	///////////////////////////////////////////////////////////////
	// 交换排序-冒泡排序、快速排序
	///////////////////////////////////////////////////////////////
	/**
	 * 冒泡排序
	 * 两两比较交换顺序
	 * @param arr
	 */
	private static void bubbleSort(int[] arr) {
		isArrayIllegal(arr);
		for (int i = 1; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= i; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}
	}
	
	/**
	 * 快速排序
	 * @param arr
	 */
	private static void quickSort(int[] arr) {
		isArrayIllegal(arr);
		quickByRecursion(arr, 0, arr.length - 1);
	}
	/**
	 * 对低高区分别递归排序
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void quickByRecursion(int[] arr, int low, int high) {
		if (low < high) {
			// 获取中轴位置
			int middle = getQuickMiddle(arr, low, high);
			// 将数组一分为二
			// 对低端递归排序
			quickByRecursion(arr, low, middle - 1);
			// 对高端递归排序
			quickByRecursion(arr, middle + 1, high);
		}
	}
	/**
	 * 获取中轴位置
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int getQuickMiddle(int[] arr, int low, int high) {
		// 把数组low位置的元素作为基准
		int base = arr[low];
		while (low < high) {
			while (low < high && arr[high] >= base) {
				high--;
			}
			// 比中轴元素小的移到低端
			arr[low] = arr[high];
			while (low < high && arr[low] <= base) {
				low++;
			}
			// 比中轴元素大的移到高端
			arr[high] = arr[low];
		}
		// 此时low==high
		arr[low] = base;
		// 返回中轴位置
		return low;
	}
	
	///////////////////////////////////////////////////////////////
	// 选择排序-简单选择排序、堆排序
	///////////////////////////////////////////////////////////////
	/**
	 * 简单选择排序
	 * @param arr
	 */
	private static void simpleSelectionSort(int[] arr) {
		isArrayIllegal(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				swap(arr, i, minIndex);
			}
		}
	}
	
	///////////////////////////////////////////////////////////////
	// 插入排序-直接插入排序、希尔排序
	///////////////////////////////////////////////////////////////
	/**
	 * 直接插入排序
	 * @param arr
	 */
	private static void straightInsertionSort(int[] arr) {
		isArrayIllegal(arr);
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			if (temp < arr[i - 1]) {
				int j = i - 1;
				for (; j >= 0 && temp < arr[j]; j--) {
					arr[j + 1] = arr[j];
				}
				arr[j + 1] = temp;
			}
		}
	}
	/**
	 * 希尔排序（最小增量排序）
	 * @param arr
	 */
	private static void shellSort(int[] arr) {
		isArrayIllegal(arr);
		int inc = arr.length;
		do {
			// 增量序列
			inc = inc / 3 + 1;
			for (int i = inc; i < arr.length; i++) {
				if (arr[i] < arr[i - inc]) {
					// 需要将arr[i]插入有序增量子表
					int temp = arr[i];
					int j = i - inc;
					for (; j >= 0 && temp < arr[j]; j -= inc) {
						// 记录后移，查找插入位置
						arr[j + inc] = arr[j];
					}
					// 插入
					arr[j + inc] = temp;
				}
			}
		} while (inc > 1);
	}
	///////////////////////////////////////////////////////////////
	// 归并排序
	///////////////////////////////////////////////////////////////
	/**
	 * 将两个（或两个以上）有序表合成一个新的有序表；
	 * 即把待排序序列分成若干子序列，每个子序列是有序的，然后再把有序子序列合并为整体有序序列。
	 * @param arr
	 */
	private static void mergeSort(int[] arr) {
		isArrayIllegal(arr);
		sortByRecursion(arr, 0, arr.length - 1);
	}
	private static void sortByRecursion(int[] arr, int low, int high) {
		if (low < high) {
			// 找出中间索引
			int mid = (low + high) >>> 1;
			// 对左边数组进行递归
			sortByRecursion(arr, low, mid);
			// 对右边数组进行递归
			sortByRecursion(arr, mid + 1, high);
			// 合并
			merge(arr, low, mid, high);
		}
	}
	private static void merge(int[] arr, int low, int mid, int high) {
		// 创建缓存数组
		int[] tempArr = new int[arr.length];
		int i = low;
		int j = mid + 1;
		// 记录缓存数组的索引
		int k = low;
		int _low = low;
		while (i <= mid && j <= high) {
			// 从两个数组中取出最小的放入缓存数组
			if (arr[i] < arr[j]) {
				tempArr[k++] = arr[i++];
			} else {
				tempArr[k++] = arr[j++];
			}
		}
		// 将剩余部分依次放入缓存数组
		while (i <= mid) {
			tempArr[k++] = arr[i++];
		}
		while (j <= high) {
			tempArr[k++] = arr[j++];
		}
		// 将缓存数组的内容复制回原数组
		while (_low <= high) {
			arr[_low] = tempArr[_low];
			_low++;
		}
	}
	/**
	 * 测试主方法
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = buildRandomIntArray(ARRAY_LENGTH);
		System.out.println("ORIGINAL ARRAY: ");
		printArray(arr);
		
		/**
		 * 冒泡排序测试
		 */
		bubbleSort(arr);
		System.out.println("BUBBLE SORT: ");
		printArray(arr);
		
		/**
		 * 快速排序测试
		 */
		quickSort(arr);
		System.out.println("QUICK SORT: ");
		printArray(arr);
		
		/**
		 * 简单选择排序测试
		 */
		simpleSelectionSort(arr);
		System.out.println("SIMPLE SELECTION SORT: ");
		printArray(arr);
		
		/**
		 * 直接插入排序
		 */
		straightInsertionSort(arr);
		System.out.println("STRAIGHT INSERTION SORT: ");
		printArray(arr);
		
		/**
		 * 希尔排序
		 */
		shellSort(arr);
		System.out.println("SHELL SORT: ");
		printArray(arr);
		
		/**
		 * 归并排序
		 */
		mergeSort(arr);
		System.out.println("MERGE SORT: ");
		printArray(arr);
	}

}
