package com.demo.points.pattern.factory;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("黄人在笑");
	}

	@Override
	public void cry() {
		System.out.println("黄人在哭");
	}

	@Override
	public void talk() {
		System.out.println("黄人在说话");
	}

}
