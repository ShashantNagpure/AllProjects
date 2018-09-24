package com.pojo;

public class Circle extends Shape {
	private int radius;

	@Override
	public double area() {
		
		
		return 3.14*radius*radius;
	}
	public Circle(int radius,String name)
	{
		super(name);
		
		this.radius=radius;
		
	}

}
