package com.changyou.demo.points.string;

public class StringOperation {

	/**
	 * Get the index of string t in string s
	 * @param s
	 * @param t
	 * @return
	 */
	public int indexOf(String s, String t) {
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		
		int i = 0, j = 0;
		while (i < cs.length && j < ct.length) {
			if (cs[i] == ct[j]) {
				// if equals, compare next char
				++i;
				++j;
			} else {
				// if not equals
				// position i skip to the next
				i = i - j + 1;
				// position j reset
				j = 0;
			}
		}
		
		if (j == ct.length) {
			return i - ct.length;
		}
		return -1;
	}
	
	
	public String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringOperation so = new StringOperation();
		/**
		 * Test method: indexOf
		 */
//		String s = "abcdefg";
//		String t = "de";
//		System.out.println(s.indexOf(t));
//		System.out.println(so.indexOf(s, t));
		
		/**
		 * Test ==
		 */
//		String a = "a" + "b" + 1;
//		String b = "ab1";
//		String c = new String("ab1");
//		String d = "ab" + new String("1");
//		System.out.println(a == b);  // true
//		System.out.println(b == c);  // false
//		System.out.println(b == d);  // false
//		System.out.println(c == d);  // false
		
		/**
		 * 递归太深导致堆栈溢出
		 * Exception in thread "main" java.lang.StackOverflowError
		 */
//		String[] strs = {"a", "b", "c"};
//		StringOperation.main(strs);
		
//		String str = "###   @1=19168 /* INT meta=0 nullable=0 is_null=0 */";
//		String str = "###   @2='test12DIYUserManageAddPersonalToneBox' /* VARSTRING(300) meta=300 nullable=1 is_null=0 */";
//		System.out.println(str.substring(str.indexOf("=") + 1, str.indexOf(" /*")));
		
		/**
		 * 字符串反转
		 */
//		String s = "abcdefg";
//		System.out.println(so.reverse(s));
		
		
//		int i = 1, j = 2;
//		String s = "3";
//		System.out.println(i + j + s);  // 33
//		System.out.println(i + s + j);  // 132
		
//		String str1 = "abc";
//		String str2 = str1;
//		System.out.println(str1 == str2);  // true
		
	}

}
