package com.beans;

import java.util.Vector;

public interface BookOperations extends BookIO,BookPersistence{
	
	default Book[] findAllBooks()
	{
		Book[]a=readBooks();
		return a;
	}
   default Book findBookByName(String bookName)
   {
	   Book[]a=readBooks();
	   Book res=null;
	   for(int i=0;i<a.length;i++)
	   {
		   if((a[i].getBookName())==bookName)
		   {res=a[i];}
	   }
	   return res;
	   
	   
   }
   default Book findBookByISBN(int isbn)
   {
	   Book[]a=readBooks();
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i].getISBN()==isbn)
		   {return a[i];}
	   }
	   return null;
	   
   }
   default Vector<Book> findBookByAuthor(String author)
   {
	   Book[]a=readBooks();
	   Vector<Book>v=new Vector<Book>();
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i].getAuthor()==author)
		   {v.add(a[i]);}
	   }
	   return v;
	   
   }
//   default Book[] findBooksByAuthor(String authorName)
//   {
//	   Book[]a=readBooks();
//	   Book[]res;
//	   for(int i=0;i<a.length;i++)
//	   {
//		   if(a[i].getBookName()==bookName)
//		   {
//			   res}
//		   }
//	   }
//	   return null;
	  
}
