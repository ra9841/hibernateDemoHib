package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	  int rollNo;
	  String name;
      int age;
      String address;
      String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int age, String address, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	public Student( String name, int age, String address, String email) {
		super();
	
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	@Id
	@GeneratedValue
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", address=" + address + ", email="
				+ email + "]";
	}
      
	
	

}
