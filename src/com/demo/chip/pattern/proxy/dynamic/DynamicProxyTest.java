package com.demo.chip.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		// 动态代理
		ILogin upLogin = new UsernamePasswordLogin();
		InvocationHandler handler = new LoginInvocationHandler(upLogin);
		// 创建动态代理对象
		ILogin proxy = (ILogin) Proxy.newProxyInstance(upLogin.getClass().getClassLoader(), upLogin.getClass().getInterfaces(), handler);
		proxy.login();
		
		// 当接口增加rememberMe方法时，只需修改被代理类，而代理类无需做任何的修改
		proxy.rememberMe();
	}
	
}
