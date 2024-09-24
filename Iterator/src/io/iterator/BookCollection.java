package io.iterator;

import java.util.List;

public class BookCollection{

	private List<Book> list;

	public BookCollection(List<Book> list) {
		super();
		this.list = list;
	}
	
	public void addBook(Book book)
	{
		list.add(book);
	}

	
	public BookIterator createIterator() {
		return new BookIterator(list);
	}

}
