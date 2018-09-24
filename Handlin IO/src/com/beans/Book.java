package com.beans;

import java.io.Serializable;

public class Book implements Serializable{
  public Book() {
		//super();
	}
public Book(int iSBN, String bookName, String bookPublication, String author, int price) {
		//super();
		ISBN = iSBN;
		this.bookName = bookName;
		this.bookPublication = bookPublication;
		this.author = author;
		this.price = price;
	}
private int ISBN;
  private String bookName;
  private String bookPublication;
  private String author;
  private int price;
  
public int getISBN() {
	return ISBN;
}
public void setISBN(int iSBN) {
	ISBN = iSBN;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getBookPublication() {
	return bookPublication;
}
public void setBookPublication(String bookPublication) {
	this.bookPublication = bookPublication;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [ISBN=" + ISBN + ", bookName=" + bookName + ", bookPublication=" + bookPublication + ", author="
			+ author + ", price=" + price + "]";
}
  
}
