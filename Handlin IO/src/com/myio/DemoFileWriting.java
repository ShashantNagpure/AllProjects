package com.myio;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		FileWriter writer=null;
		try {
			
			writer=new FileWriter("data.txt");
			
			writer.write("hello from jads");
			System.out.println("file written successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
