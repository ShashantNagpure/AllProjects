package com.pojo;

public class Manager extends Employee {
	private double incentive;
	private String department;
	
	public Manager()
	{
		System.out.println("Default Manager invoked");
		incentive=12d;
		department="admin";
	}
	public Manager(double incentive,String department,int empId,String empname,String com_name) 
	{
		super(empId,empname,com_name);
		System.out.println("Parametrised Manager invoked");
		this.incentive=incentive;
		this.department=department;
	}
	public String toString()
	{
		System.out.println(super.toString());
		return("Incentive: "+incentive+" Department: "+department);
	}
	
}
