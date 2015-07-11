package com.demo.points.question;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * @author xubenling
 * @date Jul 1, 2015 5:39:03 PM
 */
public class RotateArray {
	
	public int minNumberInRotateArray(int [] array) {
		if (null == array || 0 == array.length) {
			return 0;
		}
		// 这个数组的特点：部分递增，如[1, 2, 3, 4, 5]或[3, 4, 5, 1, 2]
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[0]) {
				return array[i];
			}
		}
		return array[0];
	}

	public static void main(String[] args) {
		RotateArray obj = new RotateArray();
		
		int[] array = {2, 3, 4, 5, 1};
		System.out.println(obj.minNumberInRotateArray(array));
	}

}
