package com.demo.points.thread;

public class TestThread extends Thread {
	public void run() {
		System.out.println(this.getClass().getName());
	}
}
