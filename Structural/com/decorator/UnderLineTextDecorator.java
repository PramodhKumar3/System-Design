package com.decorator;

public class UnderLineTextDecorator extends TextDecorator {

	public UnderLineTextDecorator(Text text) {
		super(text);
	}

	@Override
	public String format() {
		return "<u>" + super.format() + "</u>";
	}
}
