package com.demo.chip.pattern.factory;

public enum HumanEnum {

	YellowMaleHuman("com.demo.chip.pattern.factory.YellowMaleHuman"),
	YellowFemaleHuman("com.demo.chip.pattern.factory.YellowFemaleHuman"),
	WhiteMaleHuman("com.demo.chip.pattern.factory.WhiteMaleHuman"),
	WhiteFemaleHuman("com.demo.chip.pattern.factory.WhiteFemaleHuman"),
	BlackMaleHuman("com.demo.chip.pattern.factory.BlackMaleHuman"),
	BlackFemaleHuman("com.demo.chip.pattern.factory.BlackFemaleHuman");
	
	private String value = "";
	private HumanEnum(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
	
}
