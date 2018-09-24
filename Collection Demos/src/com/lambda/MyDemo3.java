package com.lambda;
import com.beans.Book;
public class MyDemo3 {
public static void main(String[] args) {
	MyInterface2 m2=( obj )->{ obj.setPrice(200); 
							System.out.println(obj.getBookName()+"\t"+obj.getPrice());};
							
   m2.showBook(new Book("alchemist",287,780d));							
					         
	}
}

