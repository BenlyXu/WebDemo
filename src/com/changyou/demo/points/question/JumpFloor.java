package com.changyou.demo.points.question;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author xubenling
 * @date Jun 30, 2015 5:38:21 PM
 */
public class JumpFloor {
	
	public static int jump(int target) {
		if (target <= 0) {
			return 0;
		} else if (1 == target) {
			return 1;
		} else if (2 == target) {
			return 2;
		} else {
			return jump(target - 1) + jump(target - 2);
		}
	}
	
	/**
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
	 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
	 * @param target
	 * @return
	 */
	public static int superJump(int target) {
		if (target <= 0) {
			return 0;
		} else if (1 == target) {
			return 1;
		} else if (2 == target) {
			return 2;
		} else if (3 == target) {
			return 4;
		} else {
			return 2 * superJump(target - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(JumpFloor.jump(3));
		System.out.println(superJump(4));
	}

}
