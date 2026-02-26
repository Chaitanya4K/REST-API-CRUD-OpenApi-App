package com.harishIT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.harishIT.entity.Book;

import com.harishIT.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepo;

	public BookServiceImpl(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public String upsertBook(Book book) {

		Integer bookId = book.getBookId();
		
		System.out.println(" Before calling Save() method " + book);

		bookRepo.save(book);
		
		System.out.println(" After calling save() method "+ book);
		
		if (book.getBookId() == null) {
			return "Record Inserted";
		} else {
			return "Record Updated";
		}

	}

	@Override
	public List<Book> getAllBooks() {

		return bookRepo.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		bookRepo.deleteById(bookId);
		return "Record Deleted";
	}

}
