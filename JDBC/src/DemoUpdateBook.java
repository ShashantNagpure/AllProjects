import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.beans.Book.*;
import com.Connect.MyConnection;

public class DemoUpdateBook {

	public static void main(String[] args) {
		
		float updatedPrice=401f;
		int ISBN_TO_UPDATE=2111;
		List<Book>books=new ArrayList<>();
		Connection con =MyConnection.openConnection();
		String SQL_FINDALL="select * from book";
		try {
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet set=st.executeQuery(SQL_FINDALL);
			while(set.next())
			{
				int ISBN=set.getInt(1);
				String bookname=set.getString(2);
				String publication=set.getString(3);
				String author=set.getString(4);
				float price=set.getFloat(5);
				if(ISBN==ISBN_TO_UPDATE)
				{
					price=updatedPrice;
				}
				set.updateFloat(5, price);
				set.updateRow();
				Book book=new Book(ISBN, bookname, publication, author, price);
				books.add(book);
				//System.out.println(ISBN+"\t"+bookname+"\t"+publication+"\t"+author+"\t"+price);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
