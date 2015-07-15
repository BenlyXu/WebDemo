package com.demo.points.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadOperation {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Implements interface Runnable
		new Thread(new ByImplementsRunnable()).start();
		
		// Extends class Thread
		new ByExtendsThread().start();
		
		// Anonymous
		new Thread() {
			public void run() {
				System.out.println(this.getClass().getName());
			}
		}.start();
		
		// Implements interface Callable
		List<Future<Integer>> list = new ArrayList<>();
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			list.add(service.submit(new ByImplementsCallable(new Random().nextInt(100))));
		}
		int sum = 0;
		for (Future<Integer> future : list) {
			sum += future.get();
		}
		System.out.println(sum);
	}

}
