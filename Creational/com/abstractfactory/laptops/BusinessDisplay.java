package com.abstractfactory.laptops;

import com.abstractfactory.components.Display;

public class BusinessDisplay implements Display {

	@Override
	public void describe() {
		System.out.println("Matte 60Hz Business Display");
	}

}
