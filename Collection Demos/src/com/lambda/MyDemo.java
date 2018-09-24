package com.lambda;

public class MyDemo {
	public static void main(String[] args) {
		MyInterface m= new MyInterface() {
			
			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				System.out.println("Welcome to Inner classes");
			}
		};
		m.greeting();
	}

}
