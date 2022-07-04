package com.training.demos;

public class Employee {
	String name;
	int age;

	Employee() {
		System.out.println("Employee Instantiate");
		name = "Litu";
		age = 38;
	}

	Employee(String s) {
		this.name = s;
	}

	void getMsg() {
		System.out.println("In Super Class");
		System.out.println("Name : " + name + "\nAge : " + age);
	}
}
