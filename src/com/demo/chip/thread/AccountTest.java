package com.demo.chip.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试类
 * @author Benly
 * @since Jul 14, 2015
 */
public class AccountTest {
	public static void main(String[] args) {
		/**
		 * 当一个线程对银行账户进行存钱时，需要将此账户锁定，待其操作完成后，才允许其他的线程进行操作。
		 * 据此有以下3种解决方案：
		 * 1.在银行账户的存款方法（deposit）上添加synchronized关键字；
		 * 2.在线程调用存款方法时对银行账户进行同步；
		 * 3.通过Java5显示的锁机制，为每个银行账户创建一个锁对象，在存款操作进行加锁和解锁的操作。
		 * 当然也可以使用Semaphore或CountdownLatch来实现同步。
		 */
		Account account = new Account();
		
		ExecutorService service = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 100; i++) {
			service.execute(new AddMoneyThread(account, 1));
		}
		service.shutdown();
		while (!service.isTerminated()) {
			
		}
		System.out.println("账户余额：" + account.getBalance());
	}
}
