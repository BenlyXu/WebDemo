package com.changyou.demo.points.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.changyou.demo.model.User;

/**
 * 测试serialVersionUID对序列化和反序列化的作用
 * @author xubenling
 * @since Jul 14, 2015
 */
public class SerializeAndDeserialize {

	private static void serialize() throws FileNotFoundException, IOException {
		User u = new User();
		u.setId(1);
		u.setEmail("xubenling@cyou-inc.com");
		u.setUsername("Benny");
		u.setPassword("helloworld");
	
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("e:\\user.txt")));
		out.writeObject(u);
		out.close();
		System.out.println("序列化成功");
	}
	
	
	private static void deserialize() throws ClassNotFoundException, IOException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("e:\\user.txt")));
		User u = (User) in.readObject();
		in.close();
		System.out.println("反序列化成功");
		System.out.println(u.toString());
	}
	
	public static void main(String[] args) {
		try {
			serialize();
			deserialize();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
