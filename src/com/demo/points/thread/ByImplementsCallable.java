package com.demo.points.thread;

import java.util.concurrent.Callable;

public class ByImplementsCallable implements Callable<Integer> {
	
	private int upperBounds;
	
	public ByImplementsCallable(int upperBounds) {
		this.upperBounds = upperBounds;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= upperBounds; i++) {
			sum += i;
		}
		return sum;
	}

}
