package com.pojo;

import java.util.Scanner;

public class DemoDelimiter {

	public static void main(String[] args) {
		String s="A:B:AXRFW:true";
		Scanner sc=new Scanner(s);
		sc.useDelimiter(":");
		while(sc.hasNext())
		{
			System.out.println(sc.nextInt());
		}
		sc.close();

	}

}
