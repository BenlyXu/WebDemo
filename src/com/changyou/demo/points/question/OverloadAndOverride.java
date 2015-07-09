package com.changyou.demo.points.question;

/**
 * 重载Overload
 * --目的是让类以统一的方式处理不同类型数据的一种手段，多态性的一种表现
 * --一个类里多个同名函数同时存在，具有不同的参数个数或类型
 * --返回值类型可以相同，也可以不同，无法以此作为重载的区分标准
 * 
 * 重写Override
 * 子类重写或说覆盖父类的某一方法，方法名、参数列表、返回类型必须相同
 * 使用super关键字引用父类
 * 子类的访问权限不能少于父类
 * 
 * @author xubenling
 * @date Jul 9, 2015 3:08:30 PM
 */
public class OverloadAndOverride {
	
	private Integer id;
	
	public String greet(boolean flag, String msg) {
		if (flag) {
			return "hello" + msg;
		}
		return "hi" + msg;
	}
	
	public String greet(String msg, boolean flag) {
		if (flag) {
			return "hello" + msg;
		}
		return "hi" + msg;
	}
	
	public String greet(String msg) {
		return greet(msg, false);
	}
	
	
	
	@Override
	public String toString() {
		// 重写toString
		return this.getClass().getName();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof OverloadAndOverride) {
			OverloadAndOverride object = (OverloadAndOverride) obj;
			return this.id.intValue() == object.id.intValue();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
}
