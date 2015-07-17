package com.demo.chip.pattern.proxy;

/**
 * 代理模式主要用了Java的多态，代理类和被代理的类继承了同一个接口
 * 租客
 * @author xubenling
 * @date Jul 8, 2015 2:49:03 PM
 */
public class Tenant {

	public static void main(String[] args) {
		// 找房屋代理
		Agent agent = new Agent();
		// 租个一室一厅，2000元
		agent.rentOut("一室一厅", 2000);
		
		// 上面的代理不靠谱，再找个
		Landlord liu = new LandlordLiu();
		Agent agentForLiu = new Agent(liu);
		agentForLiu.rentOut("两室一厅", 2600);
	}

}
