package com.abstractfactory.laptops;

import com.abstractfactory.components.GraphicCard;

public class BusinessGraphicCard implements GraphicCard {

	@Override
	public void describe() {
		System.out.println("Integrated Business Graphics");
	}

}
