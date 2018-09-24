package com.pojo;

public class DemoString {
	
	public void add(int...x)
	{
		
	}
	
	public static void main(String []args)
	{
		String name="citi";
		System.out.println("original name: "+name);
		name=name.concat(",Pune");
		System.out.println("new name: "+name);
		
		StringBuffer buffer=new StringBuffer("citi");
		buffer.append("hello");
	}

}
