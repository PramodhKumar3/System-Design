package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
	private List<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		books.add(book);
	}

	public BookIterator iterator() {
		return new BookCollectionIterator();
	}

	private class BookCollectionIterator implements BookIterator {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < books.size();
		}

		@Override
		public Book next() {
			return books.get(index++);
		}
	}
}