package com.pojo;

abstract public class Shape {
	private String name;
	abstract public double area();
	public Shape() 
	{
		name="no name";
	}
	public Shape(String name)
	{
		this.name=name;
	}

}
