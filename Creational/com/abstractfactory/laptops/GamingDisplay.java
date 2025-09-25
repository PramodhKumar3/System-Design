package com.abstractfactory.laptops;

import com.abstractfactory.components.Display;

public class GamingDisplay implements Display {

	@Override
	public void describe() {
		System.out.println("144Hz Full HD Gaming Display");
	}

}
