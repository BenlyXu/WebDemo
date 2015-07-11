package com.demo.points.question;

import java.util.Arrays;

/**
 * @description <p>数组a和数组b是有序的，现合并两个数组，并且有序递增。</p>
 * @authors Benly
 * @date Jul 4, 2015 11:36:17 PM
 */
public class MergeTwoArray {
	
	public static int[] merge(int[] a, int[] b) {
		if (null == a || 0 == a.length) {
			return b;
		}
		if (null == b || 0 == b.length) {
			return a;
		}
		int[] mergedArray = Arrays.copyOf(a, a.length + b.length);
		int index = mergedArray.length - 1;
		int i = a.length - 1;
		int j = b.length - 1;
		while (i >= 0 && j >= 0) {
			if (a[i] >= b[j]) {
				mergedArray[index] = a[i];
				i--;
			} else {
				mergedArray[index] = b[j];
				j--;
			}
			index--;
		}
		while (i >= 0) {
			mergedArray[index] = a[i];
			i--;
			index--;
		}
		while (j >= 0) {
			mergedArray[index] = b[j];
			j--;
			index--;
		}
		return mergedArray;
	}

	
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 8, 9, 10};
		int[] b = {2, 4, 6, 7};
		int[] resultArray = MergeTwoArray.merge(a, b);
		for (int i : resultArray) {
			System.out.print(i + " ");
		}
	}
}
