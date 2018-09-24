package com.exceptions;


public class Student {
	
	private int rollno;
	private int age;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "rollno=" + rollno + "- age=" + age + "- name=" + name+" ";
	}
	public Student(int rollno, int age, String name) {
		
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	public Student() {

	}



}
