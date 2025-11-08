package com.iterator;

public class IteratorMain {
	public static void main(String[] args) {
		BookCollection collection = new BookCollection();
		collection.addBook(new Book("Clean Code", "Robert C. Martin"));
		collection.addBook(new Book("Effective Java", "Joshua Bloch"));
		collection.addBook(new Book("Design Patterns", "GoF"));

		BookIterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			System.out.println(book.getTitle() + " by ==> " + book.getAuthor());
		}
	}
}