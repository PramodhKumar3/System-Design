package com.decorator;

public class PlainText implements Text {
	private String content;

	public PlainText(String content) {
		super();
		this.content = content;
	}

	@Override
	public String format() {
		return content;
	}

}
