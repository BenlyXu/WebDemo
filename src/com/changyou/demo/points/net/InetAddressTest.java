package com.changyou.demo.points.net;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		/**
		 * 创建<code>InetAddress</code>的3种方式
		 */
		// 1.使用getLocalHost()方法创建
		InetAddress localAddr = InetAddress.getLocalHost();
		System.out.println(localAddr);  // CY4807/169.254.52.142
	
//		localAddr = Inet4Address.getLocalHost();
//		System.out.println(localAddr);
//		
//		localAddr = Inet6Address.getLocalHost();
//		System.out.println(localAddr);
		
		// 2.使用域名创建
		localAddr = InetAddress.getByName("www.baidu.com");
		System.out.println(localAddr.getHostName());

		// 3.使用IP地址创建
		localAddr= InetAddress.getByName("61.135.169.121");
		System.out.println(localAddr);
		
		InetAddress[] localAddressesInetAddress = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress : localAddressesInetAddress) {
			System.out.println(inetAddress);
		}
	}

}
