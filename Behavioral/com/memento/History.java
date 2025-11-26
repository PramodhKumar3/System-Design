package com.memento;

import java.util.Stack;

public class History {
	private Stack<Memento> history = new Stack<>();

	public void push(Memento memento) {
		history.push(memento);
	}

	public Memento pop() {
		if (!history.isEmpty())
			return history.pop();
		return null;
	}
}
