package com.visitor;

public class TaxVisitor implements Visitor {

	@Override
	public void visit(Electronics electronics) {
		double tax = electronics.getPrice() * 0.18; // 18% tax
		System.out.println("Electronics Tax: $" + tax);
	}

	@Override
	public void visit(Groceries groceries) {
		double tax = groceries.getPrice() * 0.05; // 5% tax
		System.out.println("Groceries Tax: $" + tax);
	}

	@Override
	public void visit(Clothing clothing) {
		double tax = clothing.getPrice() * 0.12; // 12% tax
		System.out.println("Clothing Tax: $" + tax);
	}

}
