package com.changyou.demo.points.thread;

/**
 * 在使用volatile关键字时要慎重，并不是只要简单类型变量使用volatile修饰，对这个变量的所有操作都是原子操作，
 * 当变量的值由自身的上一个决定时，如n=n+1、n++等，volatile关键字将失效，
 * 只有当变量的值和自身上一个值无关时对该变量的操作才是原子级别的，如n = m + 1，这个就是原子级别的。
 * 所以在使用volatile关键时一定要谨慎，如果自己没有把握，可以使用synchronized来代替volatile。
 * @author xubenling
 * @since Jul 14, 2015
 */
public class VolatileTest implements Runnable {

//	private static volatile int n = 0;
	private static int n = 0;
	public static synchronized void inc() {
		n++;
	}	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
//			n++;
			inc();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		Thread[] threads = new Thread[100];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new VolatileTest());
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (Exception e) {
			}
		}
		System.out.println("n=" + VolatileTest.n);
		
	}
	
}
