package com.demo.chip.pattern.singleton;

/**
 * 总统只有一个
 * @author xubenling
 * @date Jul 8, 2015 3:05:33 PM
 */
public class President {

	private President() {
		
	}
	
	private static President president = new President();
	
	public static President getPresident() {
		return president;
	}
	
	public synchronized void greet() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "同志们好，为人民服务！");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
