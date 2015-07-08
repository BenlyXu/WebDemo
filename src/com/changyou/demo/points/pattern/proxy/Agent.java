package com.changyou.demo.points.pattern.proxy;

/**
 * 房屋中介
 * @author xubenling
 * @date Jul 8, 2015 2:41:07 PM
 */
public class Agent implements Landlord {
	
	private Landlord landlord;
	
	public Agent() {
		landlord = new LandlordWang();
	}
	
	public Agent(Landlord landlord) {
		this.landlord = landlord;
	}

	@Override
	public void rentOut(String house, double price) {
		this.landlord.rentOut(house, price);
	}

}
