package com.abstractfactory;

import com.abstractfactory.components.Display;
import com.abstractfactory.components.GraphicCard;
import com.abstractfactory.components.Processor;

public class AbstractFactoryMain {
	private final LaptopFactory factory;

	public AbstractFactoryMain(LaptopFactory factory) {
		super();
		this.factory = factory;
	}

	public void assembleLaptop() {
		Processor processor = factory.createProcessor();
		GraphicCard graphicsCard = factory.createGraphicCard();
		Display display = factory.createDisplay();

		processor.describe();
		graphicsCard.describe();
		display.describe();
	}

	public static void main(String[] args) {
		System.out.println("Assembling Gaming Laptop:");
		AbstractFactoryMain gamingLaptop = new AbstractFactoryMain(new GamingLaptopFactory());
		gamingLaptop.assembleLaptop();

		System.out.println("\nAssembling Business Laptop:");
		AbstractFactoryMain businessLaptop = new AbstractFactoryMain(new BusinessLaptopFactory());
		businessLaptop.assembleLaptop();
	}
}
