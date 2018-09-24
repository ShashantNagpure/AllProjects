package com.pojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		
		Person[] arr=new Person[3];
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		FileWriter writer=null;	
		File myFile=new File("myperson.txt");
        
			try {
				myFile.createNewFile();
				writer=new FileWriter("myperson.txt",true);
				for(int a=0;a<3;a++)
				{
				System.out.println("Enter your Person name: ");
				String name=br.readLine();
				System.out.println("you entered : "+name);
				System.out.println("Enter your address");
				String address=br.readLine();
				System.out.println("you entered : "+address);
				System.out.println("Enter your age");
				int age=Integer.parseInt(br.readLine());
				System.out.println("you entered : "+age); 
				System.out.println("Enter your id");
				int id=Integer.parseInt(br.readLine());
				System.out.println("you entered : "+id);
				arr[a]=new Person(id, name, address, age);
				
				//appending using true
				writer.write("\n");
				writer.write(id+" "+name+" "+address+" "+age+" ");
				//System.out.println("file written successfully");
					
				}
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


