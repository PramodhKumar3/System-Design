package com.visitor;

public class Clothing implements Product {
	private double price;

	public Clothing(double price) {
		this.price = price;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public double getPrice() {
		return price;
	}
}
