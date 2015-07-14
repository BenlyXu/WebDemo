package com.changyou.demo.points;

/**
 * 外部类和内部类
 * @author xubenling
 * @since Jul 14, 2015
 */
/**
 * @author xubenling
 * @since Jul 14, 2015
 */
public class OuterInnerClass {
	
	private int age = 12;
	
	private static String name = "Benny";
	
	public static void main(String[] args) {
//		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
//		inner.print();
//		
//		OuterClass.StaticInnerClass sic = new StaticInnerClass();
//		sic.print();
		
		OuterInnerClass.PrivateInnerClass pic = new OuterInnerClass().new PrivateInnerClass();
		pic.print();
	}
	
	/**
	 * 普通内部类
	 * @author xubenling
	 * @since Jul 14, 2015
	 */
	class InnerClass {
		private int age = 13;
		public void print() {
			int age = 14;
			System.out.println(age);
			System.out.println("局部变量=" + age);
			System.out.println("内部类变量=" + this.age);
			System.out.println("外部类变量=" + OuterInnerClass.this.age);
		}
	}

	
	/**
	 * 静态内部类
	 * @author xubenling
	 * @since Jul 14, 2015
	 */
	static class StaticInnerClass {
		public void print() {
			System.out.println(name);
		}
	}
	
	
	
	/**
	 * 私有内部类
	 * @author xubenling
	 * @since Jul 14, 2015
	 */
	private class PrivateInnerClass {
		public void print() {
			System.out.println(age);
		}
	}
	public void outerPrint() {
		new PrivateInnerClass().print();
	}
}
