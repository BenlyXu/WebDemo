package com.changyou.demo.points.pattern.factory;

public class MaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createYellowHuman() {
		return super.createHuman(HumanEnum.YellowMaleHuman);
	}

	@Override
	public Human createWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

	@Override
	public Human createBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

}
