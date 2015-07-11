package com.demo.points.thread;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(this.getClass().getName());
	}

}
