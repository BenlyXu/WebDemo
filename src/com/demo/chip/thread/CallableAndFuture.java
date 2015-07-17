package com.demo.chip.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Callable接口类似Runnable，但是Runnable不会返回结果，
 * 而Callable被线程执行后，可以返回值，这个返回值可以被Future拿到。
 * 也就是说，Future可以拿到异步执行任务的返回值。
 * @author Benly
 * @since Jul 15, 2015
 */
public class CallableAndFuture {

	public static void main(String[] args) {
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				return new Random().nextInt(100);
			}
		};
		
		/**
		 * FutureTask实现了RunnalbeFuture接口，而RunnableFuture继承了Runnable和Future两个接口。
		 * 所以，它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值。
		 */
		FutureTask<Integer> future = new FutureTask<Integer>(callable);
		new Thread(future).start();
		try {
			Thread.sleep(1000);
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
	
}
