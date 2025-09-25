package com.abstractfactory.laptops;

import com.abstractfactory.components.GraphicCard;

public class GamingGraphicCard implements GraphicCard {

	@Override
	public void describe() {
		System.out.println("Dedicated Gaming Graphics Card");
	}

}
