package com.abstractfactory.laptops;

import com.abstractfactory.components.Processor;

public class GamingProcessor implements Processor {

	@Override
	public void describe() {
		System.out.println("High-performance Gaming Processor");
	}

}
