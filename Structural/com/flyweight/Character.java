package com.flyweight;

public class Character {
	private final char symbol; // Intrinsic State
	private final String font; // Intrinsic State
	private final int size; // Intrinsic State

	public Character(char symbol, String font, int size) {
		super();
		this.symbol = symbol;
		this.font = font;
		this.size = size;
	}

	public void render(int positionX, int positionY) { // Extrinsic state
		System.out.println("Rendering '" + symbol + "' at (" + positionX + "," + positionY + ") " + "with font: " + font
				+ ", size: " + size);
	}

}
