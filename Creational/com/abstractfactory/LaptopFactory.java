package com.abstractfactory;

import com.abstractfactory.components.Display;
import com.abstractfactory.components.GraphicCard;
import com.abstractfactory.components.Processor;

public interface LaptopFactory {

	Processor createProcessor();

	GraphicCard createGraphicCard();

	Display createDisplay();

}
