package com.demo.chip.string;

import java.util.StringTokenizer;

/**
 * StringBuilder: 非线性安全
 * StringBuffer: 线程安全
 * @author xubenling
 * @date Jun 26, 2015 3:18:29 PM
 */
public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		/**
		 * Time consuming
		 * String类在追加的时候，源字符串不变（这就是为什么说String是不可变的字符串类型），和新串连接后，重新开辟一个内存。
		 * 这样就会造成每次连接一个新串后，都会让之前的串报废，因此也造成了不可避免的内存泄露。
		 */
//		String s = "0";
//		int n = 10000;
//		long start = System.currentTimeMillis();
//		for (int i = 1; i <= n; i++) {
//			s += i;
//		}
//		System.out.println("String, consume time=" + (System.currentTimeMillis() - start) + "ms.");
//		
//		StringBuffer buffer = new StringBuffer("0");
//		start = System.currentTimeMillis();
//		for (int i = 1; i <= n; i++) {
//			buffer.append(i);
//		}
//		System.out.println("StringBuffer, consume time=" + (System.currentTimeMillis() - start) + "ms.");
//		
//		StringBuilder builder = new StringBuilder("0");
//		start = System.currentTimeMillis();
//		for (int i = 1; i <= n; i++) {
//			builder.append(i);
//		}
//		System.out.println("StringBuilder, consume time=" + (System.currentTimeMillis() - start) + "ms.");
		
		/**
		 * String类重写了Object的equals()，所以只需要看内容是否相等即可；
		 * 但是StringBuffer没有重写equals()，此处的equals()仍然是调用的Object类的，
		 * 所以，调用StringBuffer类的equals()，只有地址和内容都相等的字符串，结果才会返回true。
		 */
//		StringBuffer sb1 = new StringBuffer("string buffer");
//		StringBuffer sb2 = new StringBuffer("string buffer");
//		System.out.println(sb1.equals(sb2));  // false
		
		
		/**
		 * trimToSize
		 */
//		StringBuilder sb = new StringBuilder("hello string builder");
//		System.out.println("length=" + sb.length());
//		System.out.println("capacity=" + sb.capacity());
//		sb.trimToSize();
//		System.out.println("capacity after invoking method trimToSize=" + sb.capacity());
		
		
		/**
		 * StringTokenizer
		 */
		String s = "I like java language very much !";
		StringTokenizer st = new StringTokenizer(s, " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
