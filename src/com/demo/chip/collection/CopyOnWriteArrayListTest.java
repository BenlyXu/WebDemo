package com.demo.chip.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("java");
		list.add("c");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		/*
		 * 如果在迭代的时候对列表进行改变，应使用<code>CopyOnWriteArrayList</code>
		 */
		for (String string : list) {
			if ("java".equals(string)) {
				list.remove(string);
				list.add("d");
				list.add("e");
			}
		}
		
		System.out.println();
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
