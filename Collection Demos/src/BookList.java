import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<>();
		books.add(new Book());
		books.add(new Book("Core Java",23,350d));
		books.add(new Book("Black Book", 1900, 800d));
		books.add(new Book("Complete Reference", 43, 750d));
		System.out.println("no. of books : "+books.size());
		books.add(3,new Book());
		//books.add(4,new Book());
//		System.out.println(books);
//		System.out.println("Book at 2nd pos: "+books.get(2));
//		boolean found=books.contains(new Book());
//		if(found)
//		{
//			System.out.println("book is available");
//		}
//		else {System.out.println("we dont have the copy");}
//		Book d=new Book();
//		d.setISBN(2121223);
//		System.out.println(books.indexOf(d));
		books.forEach(System.out::println);
	}

}
