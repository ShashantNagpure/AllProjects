package com.pojo;

import java.io.Serializable;

public class Person implements Serializable {
	 private int perId;
	 private String personName;
	 private String personAddress;
	 private int personAge;
 public Person(int perId, String personName, String personAddress, int personAge) {
		this.perId = perId;
		this.personName = personName;
		this.personAddress = personAddress;
		this.personAge = personAge;
	}

public int getPerId() {
	return perId;
}
public void setPerId(int perId) {
	this.perId = perId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getPersonAddress() {
	return personAddress;
}
public void setPersonAddress(String personAddress) {
	this.personAddress = personAddress;
}
public int getPersonAge() {
	return personAge;
}
public void setPersonAge(int personAge) {
	this.personAge = personAge;
}
}
