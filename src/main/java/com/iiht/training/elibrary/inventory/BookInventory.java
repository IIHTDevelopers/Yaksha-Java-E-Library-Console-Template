package com.iiht.training.elibrary.inventory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.iiht.training.elibrary.exception.BookAlreadyIssuedException;
import com.iiht.training.elibrary.exception.ISBNAlreadyExistsException;
import com.iiht.training.elibrary.exception.ISBNDoesNotExistsException;
import com.iiht.training.elibrary.model.Book;
import com.iiht.training.elibrary.model.BookIssue;

public class BookInventory {

	public List<Book> books = new ArrayList<>();
	public List<BookIssue> issuedBooks = new ArrayList<>();

	public boolean addBook(Book book) {
		return false;
	}

	public boolean issueBook(String isbn, String studentName) {
		return false;

	}

	public List<Book> showInventory() {
		return null;
	}

	public List<BookIssue> showIssuedBooks() {
		return null;
	}

}
