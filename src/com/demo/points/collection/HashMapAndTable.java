package com.demo.points.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

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
		
		/**
		 * HashMap vs Hashtable
		 * 1.HashMap允许key和value为null，而Hashtable不允许
		 * 2.HashTable是同步的，而HashMap不是。所以HashMap适合单线程环境，Hashtable适合多线程环境
		 * 3.如果要求输入输出的顺序相同，可以使用HashMap的子类LinkedHashMap；而Hashtable的顺序是不可预知的;TreeMap会对放入的元素按key进行排序
		 * 4.Hashtable被认为是个遗留的类，如果你寻求在迭代的时候修改Map，应该使用ConcurrentHashMap
		 * 
		 */
		System.out.println("------------------------Split Line------------------------");
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>(10);
		Map<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>(10);
		Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<Integer, Integer>(10);
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> table = new Hashtable<Integer, Integer>(10);
		Random random = new Random();
		for (int i = 'A'; i > 'A' - 10; i--) {
			int r = random.nextInt(100);
			hashMap.put(i, r);
			linkedHashMap.put(i, r);
			concurrentHashMap.put(i, r);
			treeMap.put(i, r);
			table.put(i, r);
		}
		iterateMap(hashMap);  // 无序
		iterateMap(linkedHashMap);  // 有序
		iterateMap(concurrentHashMap);  // 无序
		iterateMap(treeMap);  // 有序
		iterateMap(table);  // 无序
		
	}
	
	/**
	 * 遍历map
	 * @param map
	 */
	private static void iterateMap(Map<Integer, Integer> map) {
		System.out.println(map.getClass().getSimpleName());
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
		}
		System.out.println();
	}

}
