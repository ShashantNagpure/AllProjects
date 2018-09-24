package com.exceptions;

public class Exception1 {

	public static void main(String[] args) {
		int[]arr=new int[10];
		try {
		for(int i=0;i<=arr.length;i++)
		{
			arr[i]=i*2;
			
		}}
		catch(ArrayIndexOutOfBoundsException e)
		{
		
			e.printStackTrace();
		}
		
	}

}