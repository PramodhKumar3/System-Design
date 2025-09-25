package com.abstractfactory;

import com.abstractfactory.components.Display;
import com.abstractfactory.components.GraphicCard;
import com.abstractfactory.components.Processor;
import com.abstractfactory.laptops.GamingDisplay;
import com.abstractfactory.laptops.GamingGraphicCard;
import com.abstractfactory.laptops.GamingProcessor;

public class GamingLaptopFactory implements LaptopFactory {

	@Override
	public Processor createProcessor() {
		return new GamingProcessor();
	}

	@Override
	public GraphicCard createGraphicCard() {
		return new GamingGraphicCard();
	}

	@Override
	public Display createDisplay() {
		return new GamingDisplay();
	}

}
