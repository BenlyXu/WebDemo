package com.demo.points.thread;

public class ByExtendsThread extends Thread {
	public void run() {
		System.out.println(this.getClass().getName());
	}
}
