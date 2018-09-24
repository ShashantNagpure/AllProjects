import java.util.Comparator;

import com.beans.Book;

public class BookComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return (int)(b1.getPrice()-b2.getPrice());
	}

}
