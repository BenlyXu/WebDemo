package com.demo.points.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoginInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	public LoginInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		long start = System.currentTimeMillis();
		
		Object result = method.invoke(target, args);
		
		System.out.println("耗时统计：" + (System.currentTimeMillis() - start));
		return result;
	}

}
