package com.changyou.demo.points.question;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class CollectionsAndArrays {
	
	// 中文拼音排序
	@SuppressWarnings("rawtypes")
	private static final Comparator CHINA_CMPARE = Collator.getInstance(Locale.CHINA);
	
	@SuppressWarnings("unchecked")
	private static void sortList() {
		List<String> list = Arrays.asList("张三", "李四", "王五");
		Collections.sort(list, CHINA_CMPARE);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	@SuppressWarnings("unchecked")
	private static void sortArray() {
		String[] arr = {"张三", "李四", "王五"};
		Arrays.sort(arr, CHINA_CMPARE);
		for (String string : arr) {
			System.out.println(string);
		}
	}
	
	
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("a", "b", "c");
		sortArray();
		System.out.println("------------------------");
		sortList();
	}

}
