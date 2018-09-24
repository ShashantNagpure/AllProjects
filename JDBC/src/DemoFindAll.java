import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.Connect.MyConnection;
import com.beans.Book.Book;

import java.sql.Connection;
public class DemoFindAll {

	public static void main(String[] args) {
		List<Book>books=new ArrayList<>();
		Connection con =MyConnection.openConnection();
		try {
			DatabaseMetaData databaseMetaData= con.getMetaData();
			String dbName=databaseMetaData.getDatabaseProductName();
			System.out.println("db name: "+dbName);
			System.out.println("driver name: "+databaseMetaData.getDriverName());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String SQL_FINDALL="select * from book";
		try {
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(SQL_FINDALL);
			ResultSetMetaData metaData=set.getMetaData();
			System.out.println("no. of columns: "+metaData.getColumnCount());
			for(int i=1;i<metaData.getColumnCount();i++)
			{
				System.out.println(metaData.getColumnTypeName(i)+"\t"+metaData.getColumnLabel(i));
			}
			
//			while(set.next())
//			{
//				int ISBN=set.getInt(1);
//				String bookname=set.getString(2);
//				String publication=set.getString(3);
//				String author=set.getString(4);
//				double price=set.getDouble(5);
//				Book book=new Book();
//				books.add(book);
//				//System.out.println(ISBN+"\t"+bookname+"\t"+publication+"\t"+author+"\t"+price);
//				
//			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
