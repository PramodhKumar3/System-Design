package com.decorator;

public class TextDecorator implements Text {
	private Text text;

	public TextDecorator(Text text) {
		super();
		this.text = text;
	}

	@Override
	public String format() {
		return text.format();
	}

}
