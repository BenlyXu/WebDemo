package com.demo.chip.thread;

/**
 * 存钱线程类
 * @author Benly
 * @since Jul 14, 2015
 */
public class AddMoneyThread implements Runnable {
	/**
	 * 账户
	 */
	private Account account;
	
	/**
	 * 存入的钱
	 */
	private double money;
	
	/**
	 * 通过构造方法传参
	 * @param account
	 * @param money
	 */
	public AddMoneyThread(Account account, double money) {
		this.account = account;
		this.money = money;
	}

	@Override
	public void run() {
		account.deposit(money);
	}
}
