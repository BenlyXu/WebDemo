package com.demo.chip.pattern.proxy;

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
		System.out.println("我正在代理类：" + this.landlord.getClass().getName());
		this.landlord.rentOut(house, price);
		System.out.println("代理结束");
	}

}
