package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.beans.Book.Book;
import com.dao.impl.BookDAOimpl;

class TestBookDAOImpl {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddBook_positive() {
		BookDAOimpl dao=new BookDAOimpl();
		int expected=1;
		Book book=new Book(99, "tester book", "bloomsbury", "tolkien",100f);
		int actu_res=dao.addBook(book);
		assertEquals(expected, actu_res);
	}
	@Test
	void testAddBook_negative() {
		BookDAOimpl dao=new BookDAOimpl();
		int expected=0;
		Book book=new Book(90100, "tester book", "bloomsbury", "tolkien",100f);
		int actu_res=dao.addBook(book);
		assertEquals(expected, actu_res);
	}
	@Test
	public void testFindBookByISBN_Positive()
	{
		BookDAOimpl dao=new BookDAOimpl();
		Book book_expected=new Book(99, "tester book", "bloomsbury", "tolkien",100f);
		int isbn=99;
		Book book_actu=dao.findBookbyISBN(isbn);
		assertNotNull(book_actu);
		assertEquals(book_expected.getBookName(),book_actu.getBookName());
		assertEquals(book_expected.getBookPublication(),book_actu.getBookPublication());
		assertTrue(book_expected.getPrice()==book_actu.getPrice());
	
	}
	@Test
	public void testFindBookByISBN_Negative()
	{
		BookDAOimpl dao=new BookDAOimpl();
		Book book_expected=new Book(9000, "tester book", "bloomsbury", "tolkien",100f);
		String bookname="story book";
		int isbn=12;
		float price=123f;
		int isbn_search=10;
		Book book_actu=dao.findBookbyISBN(isbn_search);
		assertNotNull(book_actu);
		assertEquals(bookname,book_actu.getBookName());
		assertEquals(null,book_actu.getBookPublication());
		assertTrue(price==book_actu.getPrice());
	
	}

}
