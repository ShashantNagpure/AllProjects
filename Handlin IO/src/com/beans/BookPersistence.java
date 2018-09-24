package com.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pojo.Person;

public interface BookPersistence {
 default boolean writeBooks(Book[] books)
 {
	 try {
			FileOutputStream fo=new FileOutputStream("books.txt");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(books);
			oo.close();
			fo.close();
			System.out.println("data added to file successfully");
			return true;
		        }
	 
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
				return false;
			}
			catch(IOException e)
			{
				e.printStackTrace();
				return false;
			}

	 
	 
 }
 
 default Book[] readBooks()
 {
	 
	 try {
			FileInputStream fi=new FileInputStream("books.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
			
			Object o=oi.readObject();
			Book[] p=(Book[])o;
			//System.out.println(p.toString());
		
			oi.close();
			fi.close();
			return p;
		
		        }
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
				return null;
                
			}
			catch(IOException e)
			{
				e.printStackTrace();
				return null;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
	

	
 }
}
