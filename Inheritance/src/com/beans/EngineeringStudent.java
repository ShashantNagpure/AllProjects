package com.beans;

public class EngineeringStudent extends Student {
	
	public int[] marks;
	public String clg_code;
	public String branch_code;
    
	public EngineeringStudent(int[] marks,String clg_code,String branch_code,int rollno,String name,int std)
	{
		super(rollno,name,std);
		this.marks=new int[marks.length];
		this.marks=marks;
		this.clg_code=clg_code;
		this.branch_code=branch_code;
		
	}
	public void display()
	{
		System.out.println(super.name+" ");
		
	}
}