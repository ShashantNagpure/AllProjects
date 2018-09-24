package com.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of books: ");
		int n=in.nextInt();
		List<Book>books=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name for book "+i);
			String name=in.next();
			System.out.println("Enter ISBN for book "+i);
			int isbn=in.nextInt();
			System.out.println("Enter price for book "+i);
			double price=Double.parseDouble(in.next());
			books.add(new Book(name,isbn,price));
		}
		Iterator<Book>it=books.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Enter isbn of book you want to search: ");
		int is=in.nextInt();
		Book d=new Book();
		d.setISBN(is);
		int indexq=books.indexOf(d);
		if(indexq!=-1)
		{
			System.out.println("book is available");
			System.out.println(books.get(indexq));
		}
		else {System.out.println("we dont have the copy");}
		System.out.println("Enter index no.");
		int ind=in.nextInt();
		if(ind<books.size())
		{
			System.out.println(books.get(ind));
			
		}
		else {System.out.println("Index larger than size");}
		
		System.out.println("Enter isbn of book you want to modify: ");
		int isb=in.nextInt();
		
		System.out.println("Enter updated price of book : ");
		double updatedprice=Double.parseDouble(in.next());
		
		Book q=new Book();
		q.setISBN(isb);
		
		boolean found=books.contains(q);
		
		if(found)
		{
			for(Book i:books)
			{
				if(i.getISBN()==isb)
				{
					i.setPrice(updatedprice);
					break;
				}
				
			}
		}
		else {System.out.println("we dont have the such book");}
		
		System.out.println("Enter isbn of book you want to delete: ");
		isb=in.nextInt();
		
		Book rt=new Book();
		rt.setISBN(isb);
		
		found=books.contains(rt);
		
		if(found)
		{
			for(int i=0;i<books.size();i++)
			{	
				if(books.get(i).getISBN()==isb)
				{
					books.remove(i);
					break;
				}
				
			}
		}
		else {System.out.println("we dont have the such book");}
		
		for(Book i:books)
		{
			System.out.println(i);
		}
		
		
		
		
		
	}

}
