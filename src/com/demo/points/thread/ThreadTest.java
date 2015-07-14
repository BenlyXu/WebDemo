package com.demo.points.thread;

public class ThreadTest extends Thread {
	public void run() {
		System.out.println(this.getClass().getName());
	}
}
