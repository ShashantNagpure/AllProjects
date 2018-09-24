package com.pojo;

public class Developer extends Employee {
	private String[]project_names;
	public Developer(int no_of_projects,String[]project_names,int empId,String empname,String com_name)
	{
		super(empId,empname,com_name);
		this.project_names=new String[no_of_projects];
		this.project_names=project_names;

	}
	public String toString()
	{
		System.out.println(super.toString());
		String res="The projects are : ";
		for(String a:project_names)
		{
		  res+=a;
		}
		return res;
	}
}
