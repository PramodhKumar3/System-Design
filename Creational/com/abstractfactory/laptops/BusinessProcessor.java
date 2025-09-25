package com.abstractfactory.laptops;

import com.abstractfactory.components.Processor;

public class BusinessProcessor implements Processor {

	@Override
	public void describe() {
		System.out.println("Power-efficient Business Processor");
	}

}
