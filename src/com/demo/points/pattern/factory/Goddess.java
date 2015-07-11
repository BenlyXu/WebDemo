package com.demo.points.pattern.factory;

/**
 * 女娲造人
 * @author xubenling
 * @date Jul 8, 2015 3:33:11 PM
 */
public class Goddess {
	
	public static void main(String[] args) {
		Human yellow = AbstractHumanFactory.createHuman(AbstractYellowHuman.class);
		yellow.laugh();
		yellow.cry();
		yellow.talk();
//		
//		Human black = AbstractHumanFactory.createHuman(AbstractBlackHuman.class);
//		black.laugh();
//		black.cry();
//		black.talk();
		
//		for (int i = 0; i < 1000; i++) {
//			Human human = AbstractHumanFactory.createHuman();
//			human.laugh();
//			human.cry();
//			human.talk();
//		}
		
		HumanFactory maleHumanFactory = new MaleHumanFactory();
		Human yellowHuman = maleHumanFactory.createYellowHuman();
		yellowHuman.sex();;
		
		HumanFactory femaleHumanFactory = new FemaleHumanFactory();
		Human blackHuman = femaleHumanFactory.createBlackHuman();
		blackHuman.sex();
	}

}
