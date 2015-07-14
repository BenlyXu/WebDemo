package com.changyou.demo.points.thread;

public class TestRunnable implements Runnable {

	private String val;
	
	public TestRunnable() {
	}
	
	public TestRunnable(String val) {
		this.val = val;
	}
	
	@Override
	public void run() {
		System.out.println(val);
//		System.out.println(this.getClass().getName());
	}
	
	public static void main(String[] args) {
		// 1.通过构造方法传值
//		TestRunnable runnable = new TestRunnable("hello world");
//		Thread thread = new Thread(runnable);
//		thread.start();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		// 2.通过setter方法传值
//		TestRunnable runnable = new TestRunnable();
//		runnable.val = "hello world";
//		Thread thread = new Thread(runnable);
//		thread.start();
//		try {
//			thread.join();
//		} catch (Exception e) {
//		}
		// 3.通过回调函数传值 http://www.blogjava.net/nokiaguy/archive/2009/03/16/260131.html
	}

}
