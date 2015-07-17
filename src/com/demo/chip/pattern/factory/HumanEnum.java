package com.demo.chip.pattern.factory;

public enum HumanEnum {

	YellowMaleHuman("com.demo.points.pattern.factory.YellowMaleHuman"),
	YellowFemaleHuman("com.demo.points.pattern.factory.YellowFemaleHuman"),
	WhiteMaleHuman("com.demo.points.pattern.factory.WhiteMaleHuman"),
	WhiteFemaleHuman("com.demo.points.pattern.factory.WhiteFemaleHuman"),
	BlackMaleHuman("com.demo.points.pattern.factory.BlackMaleHuman"),
	BlackFemaleHuman("com.demo.points.pattern.factory.BlackFemaleHuman");
	
	private String value = "";
	private HumanEnum(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
	
}
