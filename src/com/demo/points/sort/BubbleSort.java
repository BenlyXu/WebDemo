package com.demo.points.sort;

import java.util.Random;

/**
 * 冒泡排序
 * 基本思想：两两比较，交换相邻的元素
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * @author xubenling
 *
 */
public class BubbleSort {
	
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					ArraysUtil.swap(arr, i, j);
				}
			}
		}
	}
	
	/**
	 * 真正意义上的冒泡排序
	 * @param arr
	 */
	public void realSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			// 从后往前循环
			for (int j = arr.length - 1; j >= i; j--) {
				// 两两比较，后者小于前者，则交换位置
				if (arr[j] < arr[j - 1]) {
					ArraysUtil.swap(arr, j, j - 1);
				}
			}
		}
	}
	
	/**
	 * 对冒泡排序的优化
	 * @param arr
	 */
	public void realSort2(int[] arr) {
		boolean flag = true;
		for (int i = 1; i < arr.length && flag; i++) {
			flag = false;
			for (int j = arr.length - 1; j >= i; j--) {
				if (arr[j] < arr[j - 1]) {
					ArraysUtil.swap(arr, j, j - 1);
					flag = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		int[] arr = new int[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10000);
		}
		
		long start = System.currentTimeMillis();
//		bs.sort(arr);
//		bs.realSort(arr);
		bs.realSort2(arr);
		System.out.println("Cost time: " + (System.currentTimeMillis() - start) + "ms.");
		
		ArraysUtil.print(arr);
	}

}
