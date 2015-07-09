package com.changyou.demo.points.pattern.factory;

public enum HumanEnum {

	YellowMaleHuman("com.changyou.demo.points.pattern.factory.YellowMaleHuman"),
	YellowFemaleHuman("com.changyou.demo.points.pattern.factory.YellowFemaleHuman"),
	WhiteMaleHuman("com.changyou.demo.points.pattern.factory.WhiteMaleHuman"),
	WhiteFemaleHuman("com.changyou.demo.points.pattern.factory.WhiteFemaleHuman"),
	BlackMaleHuman("com.changyou.demo.points.pattern.factory.BlackMaleHuman"),
	BlackFemaleHuman("com.changyou.demo.points.pattern.factory.BlackFemaleHuman");
	
	private String value = "";
	private HumanEnum(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
	
}
