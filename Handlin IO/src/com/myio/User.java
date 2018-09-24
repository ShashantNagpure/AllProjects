package com.myio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {

	public static void main(String[] args) {
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		FileWriter writer=null;	
	
		try {
			System.out.println("Enter your name: ");
			String name=br.readLine();
			System.out.println("you entered : "+name);
			System.out.println("Enter your address");
			String address=br.readLine();
			System.out.println("you entered : "+address);
			System.out.println("Enter your age");
			int age=Integer.parseInt(br.readLine());
			System.out.println("you entered : "+age); 
			String[]hobbies=new String[2];
			System.out.println("Enter hobbie 1: ");
			hobbies[0]=br.readLine();
			System.out.println("you entered : "+hobbies[0]);
			System.out.println("Enter hobbie 2: ");
			hobbies[1]=br.readLine();
			System.out.println("you entered : "+hobbies[1]);
			File myFile=new File("mydata.txt");
			myFile.createNewFile();
			System.out.println("File Created Successfully");
			writer=new FileWriter("mydata.txt",true);//appending using true
			writer.write(name+" "+address+" "+age+" "+hobbies[0]+" "+hobbies[1]);
			writer.write("append");
			System.out.println("file written successfully");
				
			}
		    catch (IOException e) {
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
