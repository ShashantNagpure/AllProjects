package com.pojo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		try {
		FileOutputStream fo=new FileOutputStream("person.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(new Person(12, "shash", "pune", 29));
		oo.writeObject(new Person(11, "shaws", "mum", 22));
		oo.close();
		fo.close();
		System.out.println("data added to file successfully");
	        }
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

}
}