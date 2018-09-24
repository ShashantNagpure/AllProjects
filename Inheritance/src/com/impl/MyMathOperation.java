package com.impl;

public interface MyMathOperation {
	
		int add(int x,int y);
		double div(int x,int y);
		default double area(int radius)
		{
			return 100;
		}
		default String greeting()
		{
			return "hello";
		}

}

class MyImpl implements MyMathOperation
{
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double div(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return MyMathOperation.super.greeting();
	}
}