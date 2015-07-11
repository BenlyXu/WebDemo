package com.demo.points.pattern.singleton;

public class People {
	
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				President.getPresident().greet();
			}
		}.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				President.getPresident().greet();
			}
		}).start();
	}

}
