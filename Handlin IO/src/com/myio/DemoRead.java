package com.myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//for standard io
public class DemoRead {
	
	public static void main(String[] args)
	{
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		System.out.println("Please enter your name: ");
		try {
			String name=br.readLine();
			System.out.println("you entered : "+name);
		}
		catch (IOException e) {
			     e.printStackTrace();   
				// TODO: handle exception
		}
	} 
}
