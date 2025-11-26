package com.memento;

public class MementoMain {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		History history = new History();

		editor.type("Hello ");
		history.push(editor.save());

		editor.type("World!");
		history.push(editor.save());

		editor.type(" This is a test.");
		System.out.println("Current Content: " + editor.getContent());

		// Undo last change
		editor.restore(history.pop());
		System.out.println("After Undo 1: " + editor.getContent());

		// Undo again
		editor.restore(history.pop());
		System.out.println("After Undo 2: " + editor.getContent());
	}
}
