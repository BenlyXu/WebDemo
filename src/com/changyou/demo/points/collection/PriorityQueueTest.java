package com.changyou.demo.points.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import lombok.Data;

/**
 * @description <p><code>PriorityQueue</code>基于优先级堆的无界队列，它的元素是按着自然顺序排序的。
 * 在创建的时候可以给它一个负责给元素排序的比较器。
 * 不允许null值，非线程安全，Java提供了<code>PriorityBlockingQueue</code>用于多线程环境。
 * 入队和出队的时间复杂度为O(logn)</p>
 * @authors Benly
 * @date Jul 9, 2015 9:57:46 PM
 */
public class PriorityQueueTest {
	
	public static void main(String[] args) {
		// Collator.getInstance(Locale.CHINA)按照中文音节排序
//		PriorityQueue<String> queue = new PriorityQueue<String>(3, Collator.getInstance(Locale.CHINA));
//		queue.offer("张三");
//		queue.offer("李四");
//		queue.offer("王五");		
//		while (!queue.isEmpty()) {
//			System.out.print(queue.poll() + " ");
//		}
		
		// 优先队列自然排序示例
		Queue<Integer> integerPriorityQueue = new PriorityQueue<Integer>(7);
		Random random = new Random();
		for (int i = 0; i < 7; i++) {
			Integer randomInt = Integer.valueOf(random.nextInt(100));
			System.out.println(randomInt + " is going into the priority queue.");
			integerPriorityQueue.add(randomInt);
		}
		while (!integerPriorityQueue.isEmpty()) {
			System.out.print(integerPriorityQueue.poll() + " ");
		}
		System.out.println();
		
		// 优先队列使用示例
		Queue<Customer> customerPriorityQueue = new PriorityQueue<PriorityQueueTest.Customer>(7, idComparator);
		addDataToQueue(customerPriorityQueue);
		pollDataFromQueue(customerPriorityQueue);
	}
	
	/**
	 * 匿名接口
	 */
	private static Comparator<Customer> idComparator = new Comparator<Customer>() {
		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.getId() - o2.getId();
		}
	};
	
	private static void addDataToQueue(Queue<Customer> customerPriorityQueue) {
		Random random = new Random();
		for (int i = 0; i < 7; i++) {
			int id = random.nextInt(100);
			customerPriorityQueue.add(new Customer(id, "customer:" + id));
		}
	}
	
	private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
		while (!customerPriorityQueue.isEmpty()) {
			System.out.println(customerPriorityQueue.poll());
		}
	}
	
	@Data
	private static class Customer {
		private int id;
		private String name;
		public Customer(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

}
