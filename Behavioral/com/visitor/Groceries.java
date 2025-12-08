package com.visitor;

public class Groceries implements Product {
	private double price;

	public Groceries(double price) {
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
