package com.demo.points.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		final List<String> list = Arrays.asList("Jack", "Tom", "Ben", "Bob", "Tony", "John", "Kim", "James", "David", "Michael", "Paul", "Robert", "William");
		final List<String> onlyReadList = Collections.unmodifiableList(list);
		final List<String> synchronizedList = Collections.synchronizedList(list);
		
		/*
		 * 测试线程的并非安全
		 */		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (String string : list) {
					System.out.println(Thread.currentThread().getName() + ":" + string);
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (String string : list) {
					System.out.println(Thread.currentThread().getName() + ":" + string);
				}
			}
		}).start();
		
	}

}
