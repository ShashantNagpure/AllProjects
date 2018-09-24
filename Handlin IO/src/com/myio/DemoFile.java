package com.myio;

import java.io.File;
import java.io.IOException;



public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile=new File("data.txt");
		try {
			myFile.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("File Created Successfully");

	}

}
