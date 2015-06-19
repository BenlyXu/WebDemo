package com.changyou.demo.datastructure.sort;

import java.util.Arrays;

public final class ArraysUtil {

	public static void swap(int[] arr, int i, int j) {
		if (i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
}
