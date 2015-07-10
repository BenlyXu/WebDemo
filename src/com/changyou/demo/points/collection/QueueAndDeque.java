package com.changyou.demo.points.collection;

import java.util.Deque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 双端队列（Double End Queue, 通常读作deck）
 * 支持在两端插入和移除元素
 * @author xubenling
 * @date Jul 10, 2015 11:38:23 AM
 */
public class QueueAndDeque {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedBlockingQueue<String>(5);
		Deque<String> deque = new LinkedBlockingDeque<String>(5);
		
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int r = random.nextInt(10);
			queue.add("queue:" + r);
			// 始终从头部开始插入
			deque.addFirst("deque:" + r);
		}
		
		pollDataFromQueue(queue);  // -->8 8 0 1 3-->
		System.out.println("-------Split Line-------");
		pollDataFromQueue(deque);  // -->3 1 0 8 8-->
	}
	
	private static void pollDataFromQueue(Queue<String> queue) {
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
