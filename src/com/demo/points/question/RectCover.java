package com.demo.points.question;

public class RectCover {
	
	/**
	 * 递归实现
	 * @param target
	 * @return
	 */
	public static int cover(int target) {
		if (target <= 0) {
			return 0;
		} else if (target == 1) {
			return 1;
		} else if (target == 2) {
			return 2;
		} else {
			return cover(target - 1) + cover(target - 2);
		}
	}
	
	
	/**
	 * 非递归实现
	 * @param target
	 * @return
	 */
	public static int loopCover(int target) {
		if (target > 2) {
			int a = 1;
			int b = 2;
			int result = 0;
			for (int i = 3; i <= target; i++) {
				result = a + b;
				a = b;
				b = result;
			}
			return result;
		} else if (target < 0) {
			return 0;
		} else {
			// target == 0, 1, 2
			return target;
		}
	}

	public static void main(String[] args) {
		System.out.println(RectCover.cover(4));
		System.out.println(RectCover.loopCover(4));
	}

}
