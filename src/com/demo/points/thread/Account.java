package com.demo.points.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行账户
 * @author Benly
 * @since Jul 14, 2015
 */
public class Account {
	
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
		double newBalance = balance + money;
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		balance = newBalance;
		accountLock.unlock();
	}
}
