package com.changyou.demo.points.thread;

public class TestThread extends Thread {
	private String val;
	public void run() {
		val = "hello world";
		System.out.println(this.getClass().getName());
	}
		
	public static void main(String[] args) {
		TestThread thread = new TestThread();
		System.out.println(thread.isAlive());  // false
		thread.start();
		System.out.println(thread.isAlive());  // true
		try {
			// 使异步执行的线程同步执行
			thread.join();
			System.out.println(thread.isAlive());  // false
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.val);
	}
}
