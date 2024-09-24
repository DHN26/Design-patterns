package io.iterator;

import java.util.ArrayList;

import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Book> listOfBooks=new ArrayList<>();
		
		BookCollection bc=new BookCollection(listOfBooks);
		bc.addBook(new Book("Wings of fire", "APJ Abdul Kalam and Arun Tiwari"));
		bc.addBook(new Book("Here There and Everywhere", "Sudha Murthy"));
		bc.addBook(new Book("Catch-22", "Joseph Heller"));
		
		
		BookIterator itr=bc.createIterator();
		
		while(itr.hasNext())
		{
			Book book=itr.next();
			System.out.println(book.getTitle()+" written by : "+book.getAuthor());
		}

	}

}
