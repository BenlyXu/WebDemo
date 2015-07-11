package com.demo.points.pattern.proxy;

/**
 * 房东，王
 * @author xubenling
 * @date Jul 8, 2015 2:43:08 PM
 */
public class LandlordWang implements Landlord {

	@Override
	public void rentOut(String house, double price) {
		System.out.println("招租，" + house + "，房租：" + price);
	}

}
