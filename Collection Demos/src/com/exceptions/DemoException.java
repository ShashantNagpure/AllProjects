package com.exceptions;

public class DemoException {

	public static void main(String[] args) {
		
		int min_bal=112;
		try {
		if(min_bal<1000)
		{
			throw new MyException("your balance is more than 1000");
		}
		else
		{
			System.out.println("your balance is within limit");
		}
		}
		catch(MyException e)
		{
			//e.display();
			e.printStackTrace();
		}
		

	}

}
