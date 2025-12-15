package com.decorator;

public class ItalicTextDecorator extends TextDecorator {

	public ItalicTextDecorator(Text text) {
		super(text);
	}

	@Override
	public String format() {
		return "<i>" + super.format() + "</i>";
	}
}
