package com.demo.chip.question;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 原理：整数减1再与自身做与运算，使最右边的1消失直到为0。
 * @author xubenling
 * @date Jul 1, 2015 6:23:11 PM
 */
public class BinaryOperation {
	
	public int countOne(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);
		}
		return count;
	}
	
	public int numberOf1(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		BinaryOperation b = new BinaryOperation();
		
		System.out.println(b.countOne(10));  // 1010
		System.out.println(b.countOne(15));  // 1111
		
		System.out.println(b.numberOf1(10));
	}

}
