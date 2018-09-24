package com.beans;

import java.util.Scanner;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		BookOperations op=new BookOperations() {
		};
		Book[]array=new Book[3];
		for(int i=0;i<3;i++)
		{
			array[i]=op.getBookDetails();
		}
		op.writeBooks(array);
		
		//Book[] read=op.readBooks();
		while(true) {
			System.out.println("Menu: ");
			System.out.println("1.Show all Books");
			System.out.println("2.Find book by ISBN");
			System.out.println("3.Find book by name");
			System.out.println("4.Find books by author name");
			Scanner in= new Scanner(System.in);
			int res=in.nextInt();
			
			if(res==1)
			{
				Book[]port=op.readBooks();
				for(Book i:port)
				{
					System.out.println(i.toString());
				}
			}
			else if(res==2)
			{
				System.out.println("enter isbn");
				int q=in.nextInt();
				op.printBookDetails(op.findBookByISBN(q));
			}
			else if(res==3)
			{
				System.out.println("enter name");
				String q=in.next();
				System.out.println("you entered "+ q);
				op.printBookDetails(op.findBookByName(q));
			}
			else if(res==4)
			{
				System.out.println("enter author name");
				String q=in.next();
				Vector<Book>v = new Vector<Book>();
				v=op.findBookByAuthor(q);
				   for(Book i:v)
				   {
					   op.printBookDetails(i);
				   }
			}
			
			}
		

		

	}

}
