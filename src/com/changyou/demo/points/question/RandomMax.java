package com.changyou.demo.points.question;

import java.util.Arrays;

public class RandomMax {

	/**
	 * Get the second max number
	 * @param arr
	 * @return
	 */
	public static int getSecondMax(int[] arr) {
		int firstMax = arr[0];
		int secondMax = arr[1];
		if (firstMax < secondMax) {
			firstMax = secondMax;
			secondMax = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			int tmp = arr[i];
			if (tmp > firstMax) {
				firstMax = tmp;
			} else if (tmp > secondMax) {
				secondMax = tmp;
			}
		}
		return secondMax;
	}
	
	/**
	 * Get the random max number
	 * @param arr
	 * @param r
	 * @return
	 */
	public static int getRandomMax(int[] arr, int r) {
		if (r > arr.length) {
			throw new IllegalArgumentException("parameter r should less than arr's length.");
		}
		Arrays.sort(arr);
		return arr[arr.length - r];
	}
	
	
	/**
	 * Test
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3, -1, 2, 8, 4, 1};
		System.out.println(getSecondMax(arr));
		System.out.println(getRandomMax(arr, 4));
	}

}
