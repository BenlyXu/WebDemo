package com.demo.chip.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行账户
 * @author Benly
 * @since Jul 14, 2015
 */
public class Account {
	/**
	 * Lock(Java5以后引入的api) vs synchronized
	 * 相同点：Lock能完成synchronized所实现的所有功能
	 * 不同点：Lock比synchronized有更精确的线程语义和更好的性能，而且不强制性的一定要获得锁；
	 *        synchronized会自动释放锁，而Lock一定要求程序猿手工释放，并且最好在finlly块中释放。
	 */
	private Lock accountLock = new ReentrantLock();
	
	/**
	 * 账户余额
	 */
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * 存钱
	 * @param money
	 */
	public void deposit(double money) {
		accountLock.lock();
		try {
			double newBalance = balance + money;
			Thread.sleep(10);
			balance = newBalance;
		} catch (Exception e) {
			
		} finally {
			accountLock.unlock();
		}
	}
}
