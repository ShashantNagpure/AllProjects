import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.Connect.MyConnection;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = MyConnection.openConnection();
		String SQL_INSERT="insert into book values(4580,'Cse Java','Citi Publication','Author',12)";
		try {
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		int rows=st.executeUpdate(SQL_INSERT);
		con.commit();
		if(rows>0)
		{
			con.rollback();
			System.out.println("row added succ");
		}
		else{System.out.println("sorry");}}
		
        catch(SQLException e)
		{
        	e.printStackTrace(); 
        	
		}
	}

}
