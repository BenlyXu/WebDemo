package com.changyou.demo.points.question;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author xubenling
 * @date Jul 2, 2015 9:57:07 AM
 */
public class ArrayOperation {

	public void reOrderArray(int [] array) {
		if (array == null || 0 == array.length) {
			return;
		}
		
		/* 
		 * 原理类似于快排
		 * 但是要保证奇数和奇数、偶数和偶数的相对位置不变，使用插排的思想
		 */
//    	int i = 0;
//    	int j = array.length - 1;
//    	while (i < j) {
//			while (i < j && array[i] % 2 == 1) {
//				// 奇数，游标i右移
//				i++;
//			}
//			while (i < j && array[j] % 2 == 0) {
//				// 偶数，游标j左移
//				j--;
//			}
//			if (i != j) {
//				// 交换位置
//				array[i] = array[i] ^ array[j];
//				array[j] = array[i] ^ array[j];
//				array[i] = array[i] ^ array[j];
//			}
//		}
		
		for (int i = 0; i < array.length; i++) {
			// 如果是奇数
			if (array[i] % 2 == 1) {
				// 缓存当前元素
				int temp = array[i];
				// 循环[0, i - 1]的元素，偶数元素整体后移
				int j = i - 1;
				for (; j >= 0 && array[j] % 2 == 0; j--) {
					array[j + 1] = array[j];
				}
				// 注意j--，所以待插入的位置是j + 1
				array[j + 1] = temp;
			}
		}
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		ArrayOperation obj = new ArrayOperation();
		obj.reOrderArray(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
