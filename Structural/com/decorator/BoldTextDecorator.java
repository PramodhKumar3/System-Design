package com.decorator;

public class BoldTextDecorator extends TextDecorator {

	public BoldTextDecorator(Text text) {
		super(text);
	}

	@Override
	public String format() {
		return "<b>" + super.format() + "</b>";
	}

}
