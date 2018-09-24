import java.util.List;

import com.beans.Book.Book;
import com.dao.BookDAO;
import com.dao.impl.BookDAOimpl;

public class TestFindByPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO dao=new BookDAOimpl();
		int price=123;
		List<Book>books=dao.findAllBooksByprice(price);
		if(books.size()>0)
			{
			for(Book i:books)
			
		{
			System.out.println(i);
		}
			}
		else
		{
			System.out.println("no data found");
		}
	}

}
