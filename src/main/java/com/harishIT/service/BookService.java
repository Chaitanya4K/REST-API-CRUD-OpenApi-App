package com.harishIT.service;

import java.util.List;

import com.harishIT.entity.Book;



public interface BookService {
	
	public String upsertBook(Book book); // save()= insert+update
	
	public List<Book> getAllBooks();

	public String deleteBook(Integer bookId); // to delete book by ID
	
	//public String updateBook(Book book); //no need
	
	//public String deleteBook(Book book);

	
	
}
 