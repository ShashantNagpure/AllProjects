package com.lambda;

public class MyDemo2 {

	public static void main(String[] args) {
		MyInterface1 m1=(x,y)->{System.out.println(x+y);};
		m1.add(3, 5);
	}

}
