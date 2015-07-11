package com.demo.points.pattern.factory;

import java.util.List;
import java.util.Random;

import com.demo.util.ClassUtil;

public abstract class AbstractHumanFactory implements HumanFactory {

	public static Human createHuman(Class<?> clazz) {
		Human human = null;
		try {
			human = (Human) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return human;
	}
	
	@SuppressWarnings("rawtypes")
	public static Human createHuman() {
		List<Class> classes = ClassUtil.getAllClassByInterface(Human.class);
		Random random = new Random();
		int rand = random.nextInt(classes.size());
		Human human = createHuman(classes.get(rand));
		return human;
	}
	
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		if (!"".equals(humanEnum.getValue())) {
			try {
				human = (Human) Class.forName(humanEnum.getValue()).newInstance();
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return human;
	}
	

}
