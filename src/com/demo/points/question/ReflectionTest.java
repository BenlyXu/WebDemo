package com.demo.points.question;

import java.lang.reflect.Method;

/**
 * Java反射测试，参考<link>Reflection</link>
 * @author xubenling
 * @date Jul 7, 2015 2:30:03 PM
 */
public class ReflectionTest {
	
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.demo.points.question.Reflection");
//		Method[] methods = clazz.getMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
		Method method = clazz.getDeclaredMethod("sum", int.class, int.class);
		method.setAccessible(true);
		int sum = (Integer) method.invoke(clazz.newInstance(), 3, 4);
		System.out.println(sum);
		
		Reflection r = (Reflection) clazz.newInstance();
		r.print("hello world");
	}

}
