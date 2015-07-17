package com.demo.chip.thread;

public class ByImplementsRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(this.getClass().getName());
	}

}
