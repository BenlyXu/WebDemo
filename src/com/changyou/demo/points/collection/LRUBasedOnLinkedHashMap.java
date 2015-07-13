package com.changyou.demo.points.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 基于LinkedHashMap的LRU算法
 * @author xubenling
 * @since Jul 13, 2015
 */
public class LRUBasedOnLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 1L;
	
	// 最大容量
	private int maxCapacity;
	
	public LRUBasedOnLinkedHashMap(int maxCapacity) {
		super(16, 0.75f, true);
		this.maxCapacity = maxCapacity;
	}

	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {
		if (super.size() > maxCapacity) {
			return true;
		}
		return false;
	}



	public static void main(String[] args) {
		/**
		 * LinkedHashMap的特性：
		 * 经常被访问的元素会放到链表的末尾
		 */
//		Map<Integer, String> map = new LinkedHashMap<Integer, String>(10, 0.75f, true);
		Map<Integer, String> lruMap = new LRUBasedOnLinkedHashMap<Integer, String>(5);
		for (int i = 0; i < 10; i++) {
//			map.put(i, "key=" + i);
			lruMap.put(i, "key=" + i);
		}
		
		lruMap.get(7);
		
		for (Entry<Integer, String> entry : lruMap.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

}
