package com.beans;

public class Book implements Comparable{
	private String bookName;
	private int ISBN;
	private double price;
	public Book(String bookName, int iSBN, double price) {
		super();
		this.bookName = bookName;
		ISBN = iSBN;
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return 10;
		return bookName.length();
	}

	public Book() {
		bookName="story book";
		ISBN=12;
		price=340.12d;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", ISBN=" + ISBN + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Book d=(Book)obj;
		return (this.ISBN==d.ISBN);
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		Book b=(Book)o;
		return (int)(this.price-b.price);
		//return this.bookName.compareTo(b.bookName);
	}

}
