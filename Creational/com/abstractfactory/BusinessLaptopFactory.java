package com.abstractfactory;

import com.abstractfactory.components.Display;
import com.abstractfactory.components.GraphicCard;
import com.abstractfactory.components.Processor;
import com.abstractfactory.laptops.BusinessDisplay;
import com.abstractfactory.laptops.BusinessGraphicCard;
import com.abstractfactory.laptops.BusinessProcessor;

public class BusinessLaptopFactory implements LaptopFactory {

	@Override
	public Processor createProcessor() {
		return new BusinessProcessor();
	}

	@Override
	public GraphicCard createGraphicCard() {
		return new BusinessGraphicCard();
	}

	@Override
	public Display createDisplay() {
		return new BusinessDisplay();
	}

}
