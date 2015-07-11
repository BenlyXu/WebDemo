package com.demo.points.pattern.factory;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("白人在笑");
	}

	@Override
	public void cry() {
		System.out.println("白人在哭");
	}

	@Override
	public void talk() {
		System.out.println("白人在说话");
	}

}
