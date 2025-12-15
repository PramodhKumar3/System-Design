package com.decorator;

public class DecoratorMain {
	public static void main(String[] args) {
		Text text = new PlainText("Hello, World!");

		// Apply multiple decorators dynamically
		Text boldText = new BoldTextDecorator(text);
		Text italicBoldText = new ItalicTextDecorator(boldText);
		Text styledText = new UnderLineTextDecorator(italicBoldText);

		System.out.println("Formatted Text: " + styledText.format());
	}
}
