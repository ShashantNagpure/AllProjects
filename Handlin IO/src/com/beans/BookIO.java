package com.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface BookIO {
	
	default Book getBookDetails()
	{
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		Book a=new Book();
		
		try {
			System.out.println("enter ISBN: ");
			int isbn=Integer.parseInt(br.readLine());
			a.setISBN(isbn);
			System.out.println("enter Book Name: ");
			String name=br.readLine();
			a.setBookName(name);
			System.out.println("enter Book Publication: ");
			String publication=br.readLine();
			a.setBookPublication(publication);
			System.out.println("enter Author: ");
			String author=br.readLine();
			a.setAuthor(author);
			System.out.println("enter Book Price: ");
			int price=Integer.parseInt(br.readLine());
			a.setPrice(price);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return a;
	}
  default void printBookDetails(Book book)
  {
	  System.out.println(book.toString());
  }
}
