package com.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {

	public static void main(String[] args) {

		Student[] s=new Student[3];
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		for(int i=0;i<3;i++) {
		try {
			s[i]=new Student();
			System.out.println("Enter Student " +i+"'s name: ");
			String name=br.readLine();
			if(name.length()<4)
			{
				throw new MyException("Name length is less than 4");
				
			}
			else
			{
				s[i].setName(name);
				
			}
			System.out.println("Enter Student " +i+"'s rollno: ");
			int rollno=Integer.parseInt(br.readLine());
			if(rollno<=0)
			{
				throw new MyException("Roll no. less than or equal to 0");
				
			}
			else
			{
				s[i].setRollno(rollno);
				
			}
			System.out.println("Enter Student " +i+"'s Age: ");
			int age=Integer.parseInt(br.readLine());
			if(age>=18)
			{
				throw new MyException("Age is more than or equal to 18");
				
			}
			else
			{
				s[i].setAge(age);
				System.out.println("student successfully created");
				System.out.println(s[i]);
				
			}
			
		}
		catch (IOException | MyException e) {
			     e.printStackTrace();   
				// TODO: handle exception
		}
		}

	}

}
