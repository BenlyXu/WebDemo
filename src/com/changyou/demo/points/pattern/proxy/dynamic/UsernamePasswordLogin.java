package com.changyou.demo.points.pattern.proxy.dynamic;

public class UsernamePasswordLogin implements ILogin {

	@Override
	public void login() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("成功登录...");
	}

	@Override
	public void rememberMe() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println("记住用户有效登录状态7天");
	}

}
