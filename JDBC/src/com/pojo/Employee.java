package com.pojo;

import java.sql.Date;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private int age;
	private Date joiningdate;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.joiningdate = joiningdate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", age=" + age
				+ ", joiningdate=" + joiningdate + "]";
	}
	public Employee(int empId, String empName, double salary, int age, Date joiningdate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.joiningdate = joiningdate;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

}
