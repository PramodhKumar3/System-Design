package com.visitor;

public interface Product {
	public void accept(Visitor visitor);

	public double getPrice();
}
