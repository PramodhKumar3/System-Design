package com.visitor;

public interface Visitor {
	public void visit(Electronics electronics);

	public void visit(Groceries groceries);

	public void visit(Clothing clothing);
}
