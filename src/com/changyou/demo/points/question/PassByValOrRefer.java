package com.changyou.demo.points.question;

public class PassByValOrRefer {
	
	public void byVal(int a) {
		a = 2;
		System.out.println("方法中=" + a);
	}
	
	public void byVal(String str) {
		str = new String("hello java");
		System.out.println("方法中=" + str);
	}
	
	public void byVal(StringBuilder builder) {
		builder = new StringBuilder("hello java");
		System.out.println("方法中=" + builder.toString());
	}
	
	public void byVal(Test t) {
		t.a = 20;
		System.out.println("方法中=" + t.a);
	}

	public static void main(String[] args) {
		PassByValOrRefer obj = new PassByValOrRefer();
		
//		int a = 1;
//		obj.byVal(a);
//		System.out.println("a=" + a);  // 1
//		
//		String str = "hello world";
//		obj.byVal(str);
//		System.out.println("str=" + str);  // hello world
		
//		String string = new String("hello string");
//		obj.byVal(string);
//		System.out.println("string=" + string);  // hello string
		
		StringBuilder sb = new StringBuilder("hello builder");
		obj.byVal(sb);
		System.out.println("builder=" + sb.toString());
		
		Test t = new Test();
		t.a = 10;
		obj.byVal(t);
		System.out.println("Test.a=" + t.a);
	}
	
	private static class Test {
		int a = 0;
	}

}
