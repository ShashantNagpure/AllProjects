package com.test;

import mypack1.business.Operation;

public class Tester {

	public static void main(String[] args) {
		Operation op=new Operation();
		System.out.println(op.add(50, 120));
		int[]arr= {5,12,9,34,101};
		System.out.println(op.max(arr));
		
	}

}
