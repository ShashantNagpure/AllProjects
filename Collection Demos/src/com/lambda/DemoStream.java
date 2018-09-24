package com.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.beans.Book;
public class DemoStream {

	public static void main(String[] args) {
		List<Book> books=new ArrayList<>();
		books.add(new Book());
		books.add(new Book("Core Java",121212 , 1213.21d));
		books.add(new Book("Complete Reference",123, 34.21d));
		books.add(new Book("Black Book", 780, 580.34d));
		books.add(new Book("Spring 5.0", 45, 1000d));
		books.add(new Book("Spring 5.0", 12, 1000d));
		books.add(new Book("Hibernate in ACTION", 34, 900d));
		books.add(new Book("Complete Reference",129, 34.21d));
		
		//books.forEach(System.out::println);
//		books.forEach((b)->{System.out.println(b.getBookName());});
//		Stream<Book> stream=books.stream();
//		Stream s1=stream.filter((b)->{return (b.getPrice() > 34);});
//		s1.forEach(System.out::println);
       // stream.forEach(System.out::println);	
		
//		List<Book> bs=books.stream().filter((b)->{
//			return b.getBookName().startsWith("C");
//		}).collect(Collectors.toList());
		
		books.stream().filter((b)->{
			return b.getBookName().startsWith("C");
		}).forEach(System.out::println);
		
		books.stream().filter((b)->{
			return b.getBookName().startsWith("C");
		}).sorted((b1,b2)->{return (int)(b1.getPrice()-b2.getPrice());}).forEach(System.out::println); 
	}

}
