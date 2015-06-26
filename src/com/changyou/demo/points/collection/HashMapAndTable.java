package com.changyou.demo.points.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 1.HashMap是非线程安全，而Hashtable是线程安全的
 * 2.HashMap的k-v允许null，而Hashtable不行
 * 3.因为线程安全的问题，HashMap的效率比Hashtable要高
 * 4.ConcurrentHashMap是线程安全的
 * @author xubenling
 * @date Jun 26, 2015 3:46:51 PM
 */
public class HashMapAndTable {
	
	public static void main(String[] args) {
		int[] data = {2, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 2, 3, 5, 2, 7, 8, 8, 7, 8, 7, 9, 0};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : data) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		
		// 第一种遍历map的方式
		System.out.println("------------------Map遍历方式1------------------");
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Integer> entry = it.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		// 第二种遍历map的方式
		System.out.println("------------------Map遍历方式2------------------");
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		// 第三种遍历map的方式
		System.out.println("------------------Map遍历方式3------------------");
		for (Integer key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
		
		
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
		});
		
		System.out.println("---------------------排序后---------------------");
		for (Entry<Integer, Integer> entry : list) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

}
