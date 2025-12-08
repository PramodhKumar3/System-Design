package com.visitor;

public class Electronics implements Product {
	private double price;

	public Electronics(double price) {
		super();
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
