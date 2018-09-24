import java.util.HashSet;
import java.util.Set;

import com.beans.Book;

public class BookSet {

	public static void main(String[] args) {
		Set<Book> books=new HashSet<>();
		books.add(new Book());
		books.add(new Book("Core Java",121212 , 1213.21d));
		books.add(new Book("Complete Reference",123, 34.21d));
		books.add(new Book());
		System.out.println(books.size());
		System.out.println(books);
	}

}
