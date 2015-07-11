package com.demo.points.sort;

import java.util.Arrays;

public final class ArraysUtil {

	public static void swap(int[] arr, int i, int j) {
		if (i != j) {
			// a.定义缓存变量
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
			
			// b.相加后再减，可能会溢出
//			arr[i] = arr[i] + arr[j];
//			arr[j] = arr[i] - arr[j];
//			arr[i] = arr[i] - arr[j];
			
			// c.与或
			arr[i] = arr[i] ^ arr[j];
			arr[j] = arr[i] ^ arr[j];
			arr[i] = arr[i] ^ arr[j];
		}
	}
	
	
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
}
