package com.demo.points.thread;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		System.out.println(this.getClass().getName());
	}

}
