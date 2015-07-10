package com.changyou.demo.points.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

/**
 * Enumeration vs Iterator
 * 1.Enumeration速度是Iterator的两倍，也使用更少的内存
 * 2.Iterator更安全，当一个集合正在遍历的时候，它会阻止其他线程去修改集合
 * 3.Iterator允许从集合中移除元素，而Enumeration做不到
 * @author xubenling
 * @date Jul 10, 2015 11:55:03 AM
 */
public class EnumerationAndIterator {

	public static void main(String[] args) {
		String[] strs = {
				"a", "b", "c", "d", "e", "f", "g",
				"h", "i", "j", "k", "l", "m", "n",
				"o", "p", "q", "r", "s", "t",
				"u", "v", "w", "x", "y", "z"};
		Vector<String> v = new Vector<String>(1000);
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			v.add(strs[r.nextInt(strs.length)]);
		}
		
		Enumeration<String> en = v.elements();
		long start = System.currentTimeMillis();
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement());
		}
		System.out.println("\r\n耗时：" + (System.currentTimeMillis() - start));
		
		Iterator<String> it = v.iterator();
		start = System.currentTimeMillis();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println("\r\n耗时：" + (System.currentTimeMillis() - start));
		
	}
	
}
