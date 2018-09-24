package com.myio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataFileReading {

	public static void main(String[] args) {
		
		try {
			FileReader reader =new FileReader("data.txt");
			byte b =0 ;
			do
			{
				int data=reader.read();
				System.out.print((char)data);
				b=(byte)data;
				
			}
			while(b!=-1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
