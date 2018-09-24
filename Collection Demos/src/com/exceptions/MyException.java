package com.exceptions;

public class MyException extends Exception {
	private String message;
	public MyException() {
		message="You got an exception";
	}
	public MyException(String message)
	{
		super(message);
		this.message=message;
	}
	public void display()
	{
		System.out.println("cause of failure: "+getMessage());
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
