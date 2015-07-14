package com.demo.points.exception;

public class Human {
	
	public static void main(String[] args) throws Exception {
		/**
		 * 结果：
		 * Caught Annoyance
		 * Caught Sneeze
		 * Hello World!
		 */
		try {
			try {
				throw new Sneeze();
			} catch (Annoyance a) {
				System.out.println("Caught Annoyance");
                throw a;
			}
		} catch (Exception s) {
			System.out.println("Caught Sneeze");
            return ;
		} finally {
			System.out.println("Hello World!");
		}
		
		/**
		 * e.g.
		 * 前提：类ExampleA继承Exception，类ExampleB继承ExampleA
		 */
		/////////////////////////////////////////////////////
		//		try {
		//		    throw new ExampleB("b")
		//		} catch（ExampleA e）{
		//		    System.out.println("ExampleA");
		//		} catch（Exception e）{
		//		    System.out.println("Exception");
		//		}
		/////////////////////////////////////////////////////
		/**
		 * 输出ExampleA。
		 * 根据里氏代换原则[能使用父类型的地方一定能使用子类型]，
		 * 抓取ExampleA类型异常的catch块能够抓住try块中抛出的ExampleB类型的异常
		 */
		
	}

}
