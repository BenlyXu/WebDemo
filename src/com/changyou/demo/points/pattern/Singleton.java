package com.changyou.demo.points.pattern;

/**
 * 几种单例模式
 * @authors Benly
 * @date Jul 4, 2015 9:25:34 PM
 */
public class Singleton {
	
	private Singleton() {
		// The object can't be created instance by "new"
	}
	
	/**
	 * 懒汉模式，线程不安全
	 */
//	private static Singleton instance;
//	public static Singleton getInstance() {
//		if (null == instance) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	/**
	 * 懒汉模式，线程安全
	 */
//	private static Singleton instance;
//	public static synchronized Singleton getInstance() {
//		if (null == instance) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	/**
	 * 饿汉模式，基于classloader机制避免了多线程同步的问题
	 */
	private static Singleton instance = new Singleton();
	public static Singleton getInstance() {
		return instance;
	}
	
	/**
	 * 饿汉模式，变种
	 */
//	private static Singleton instance;
//	static {
//		instance = new Singleton();
//	}
//	public Singleton getInstance() {
//		return instance;
//	}
	
	/**
	 * 静态内部类（推荐）
	 */
//	public static final Singleton getInstance() {
//		return SingletonHolder.INSTANCE;
//	}
//	private static class SingletonHolder {
//		private static final Singleton INSTANCE = new Singleton();
//	}
	
	/**
	 * 枚举，不仅能避免多线程同步问题，而且还能防止反序列化时创建新的对象
	 */
//	public enum Singleton {
//		INSTANCE;
//		public void whateverMethod() {
//			
//		}
//	}
	
	/**
	 * 双重校验锁
	 */
//	private static Singleton instance;
//	public static Singleton getInstance() {
//		if (null == instance) {
//			synchronized (instance) {
//				if (null == instance) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}
	

}
