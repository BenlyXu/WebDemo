package com.demo.points.thread;

public class ThreadOperation {

	public static void main(String[] args) {
		// Implements interface Runnable
		new Thread(new RunnableTest()).start();
		
		// Extends class Thread
		new ThreadTest().start();
		
		// Anonymous
		new Thread() {
			public void run() {
				System.out.println(this.getClass().getName());
			}
		}.start();
	}

}
