package io.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator{
	
	private int currentIndex=0;
	private List<Book> books;

	public BookIterator(List<Book> books) {
		super();
		this.books = books;
	}

	
	public boolean hasNext() {
		return currentIndex<books.size();
	}

	
	public Book next() {
		if(!hasNext())
			throw new NoSuchElementException();
		return books.get(currentIndex++);
	}

}
