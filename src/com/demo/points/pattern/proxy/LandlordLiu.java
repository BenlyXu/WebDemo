package com.demo.points.pattern.proxy;

public class LandlordLiu implements Landlord {

	@Override
	public void rentOut(String house, double price) {
		System.out.println("招租，" + house + "，房租：" + price);
	}

}
