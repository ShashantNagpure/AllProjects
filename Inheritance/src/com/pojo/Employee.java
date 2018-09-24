package com.pojo;

 abstract public class Employee {
	private int empId;
	private String empname;
	private String com_name;
	

	public Employee() 
	{
		System.out.println("Employee invoked");
		empId=10;
		empname="citi";
		com_name="CITI";
	}
	public Employee(int empId,String empname,String com_name) 
	{
		this.empId=empId;
		this.empname=empname;
		this.com_name=com_name;
	}
	public String toString()
	{
		return("Name: "+empname+" ID: "+empId+" Company: "+com_name);
	}
}
