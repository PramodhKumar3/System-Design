package com.visitor;

public class VisitorMain {
	public static void main(String[] args) {
		Product electronics = new Electronics(1000);
		Product groceries = new Groceries(200);
		Product clothing = new Clothing(500);

		Visitor taxVisitor = new TaxVisitor();

		electronics.accept(taxVisitor);
		groceries.accept(taxVisitor);
		clothing.accept(taxVisitor);

	}
}
