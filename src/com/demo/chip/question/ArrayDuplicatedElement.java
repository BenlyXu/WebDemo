package com.demo.chip.question;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @description 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3。
 * @authors Benly
 * @date Jul 4, 2015 12:18:53 PM
 */
public class ArrayDuplicatedElement {
	
	public boolean duplicate(int numbers[], int length, int [] duplication) {
		if (null == numbers || numbers.length != length) {
			return false;
		}
		boolean flag = false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < length; i++) {
			int val = numbers[i];
			if (map.containsKey(val)) {
				if (!flag) {
					flag = true;
				}
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
		}
		if (flag) {
			if (null == duplication) {
				duplication = new int[map.size()];
			}
			int i = 0;
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() > 1) {
					// 数组每两个元素为一个单位
					// 第一个是重复的数字，第二个是重复的次数
					duplication[i] = entry.getKey();
					duplication[++i] = entry.getValue();
					i++;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
//		int[] numbers = {2,3,1,0,2,5,3};
		int[] numbers = {2, 1, 3, 1, 4};
		int[] duplication = new int[numbers.length];
		
		ArrayDuplicatedElement obj = new ArrayDuplicatedElement();
		boolean flag = obj.duplicate(numbers, numbers.length, duplication);
		System.out.println(flag);
		for (int i : duplication) {
			System.out.print(i + " ");
		}
	}

}
