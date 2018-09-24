import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.beans.Book.Book;
import com.dao.impl.BookDAOimpl;

public class TestBookAdded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAOimpl dao=new BookDAOimpl();
		Book book=new Book();
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		//System.out.println("Please enter your name: ");
		//try {
//			String name=br.readLine();
//			String author=br.readLine();
//			String publ=br.readLine();
//			int isbn=Integer.parseInt(br.readLine());
//			int price=Integer.parseInt(br.readLine());
			book.setAuthor("asas");
			book.setBookName("asas");
			book.setBookPublication("asas");
			book.setISBN(2111);
			book.setPrice(400f);

			int rows=dao.addBook(book);
			if(rows>0)
			{
				System.out.println("data inserted success");
			}
			else
			{
				System.out.println("no row added");
			}
			
			

		//}
		//catch (IOException e) {
			    // e.printStackTrace();   
				// TODO: handle exception
		//}


	}

}
