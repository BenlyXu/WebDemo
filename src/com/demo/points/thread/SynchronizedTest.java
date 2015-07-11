package com.demo.points.thread;

public class SynchronizedTest {
	// 普通无锁方法
	public void test() {
		int i = 5;
		while (i-- > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 对象锁形式1
	public void test1() {
		synchronized (this) {
			int i = 5;
			while (i-- > 0) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// 对象锁形式2
	public synchronized void test2() {
		int i = 5;
		while (i-- > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 类锁形式1
	public static void test3() {
		synchronized (SynchronizedTest.class) {
			int i = 5;
			while (i-- > 0) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// 类锁形式2
	public static synchronized void test4() {
		int i = 5;
		while (i-- > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		final SynchronizedTest obj = new SynchronizedTest();
		final SynchronizedTest otherObj = new SynchronizedTest();

		/*
		 * 注意一：
		 * 当两个并发线程访问同一个object的synchronized(this)同步代码块时，
		 * 同一时间内只有一个线程得到执行，另一个线程必须等待当前线程执行完这个代码块时才能执行该代码块
		 */
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				obj.test1();
//			}
//		}, "a").start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				obj.test1();
//			}
//		}, "b").start();
		
		/*
		 * 注意二：
		 * 当一个线程访问object的synchronized(this)同步代码块时，
		 * 另一个线程仍然可以访问该object的非synchronized(this)的代码块
		 */
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				obj.test1();
//			}
//		}, "c").start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				obj.test();
//			}
//		}, "d").start();
		
		/*
		 * 注意三：
		 * 当一个线程访问object的一个synchronized(this)同步代码块时，
		 * 其他线程对该object其他synchronized(this)的同步代码块的访问将被堵塞
		 */
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				obj.test1();
//			}
//		}, "e").start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				obj.test2();
//			}
//		}, "f").start();
		
		/*
		 * 注意三：
		 * 类锁、对象锁是两个不同的锁，控制着不同的区域，互不干扰。
		 * 线程获得对象锁的同时，也可以获得类锁，即同时获得两个锁，这是允许的。 
		 */
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				obj.test1();
//			}
//		}, "g").start();
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				SynchronizedTest.test3();
//			}
//		}, "h").start();
		
		/*
		 * 对象锁：又叫方法锁，不同对象访问同一个被synchronized修饰的方法是不会阻塞的。
		 * 类锁：
		 */
		new Thread(new Runnable() {
			@Override
			public void run() {
				obj.test1();
			}
		}, "a").start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				otherObj.test1();
			}
		}, "b").start();
	}

}
