import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class DemoTreeSet {

	public static void main(String[] args) {
		Set<Book> books=new TreeSet<>(new BookComparator());
		books.add(new Book());
		books.add(new Book("Core Java",121212 , 34.21d));
		books.add(new Book("Complete Reference",123, 3114.8821d));
		books.add(new Book());
		System.out.println(books.size());
		System.out.println(books);
	}
}
