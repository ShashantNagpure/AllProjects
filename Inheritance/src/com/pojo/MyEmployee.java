package com.pojo;

 public class MyEmployee {
	private int empId;
	private String empname;
	private String com_name;
	

	public MyEmployee() 
	{
		empId=10;
		empname="citi";
		com_name="CITI";
	}
	public MyEmployee(int empId,String empname) 
	{
		this();
		this.empId=empId;
		this.empname=empname;

	}
	@Override
	public String toString() {
		return "MyEmployee [empId=" + empId + ", empname=" + empname + ", com_name=" + com_name + "]";
	}

}
