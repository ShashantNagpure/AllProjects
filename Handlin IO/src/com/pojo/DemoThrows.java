package com.pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoThrows {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fi=new FileInputStream("person.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object o=oi.readObject();
		Person p=(Person)o;
		System.out.println(p.getPerId()+" "+p.getPersonName()+" "+p.getPersonAddress()+" "+p.getPersonAge());
		
		Object o2=oi.readObject();
		Person p2=(Person)o2;
		System.out.println(p2.getPerId()+" "+p2.getPersonName()+" "+p2.getPersonAddress()+" "+p2.getPersonAge());
		//oi.close();
		//fi.close();
		
		
	

		
		

	}

}
