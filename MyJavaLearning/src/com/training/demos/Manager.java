package com.training.demos;

public class Manager extends Employee {
	double salary;

	Manager() {
		System.out.println("Manager Instantiate");
		name = "Sukanta";
		age = 39;
		salary = 500000;
	}

	void getDetails() {
		System.out.println("In Sub Class");
		System.out.println("Salary : " + salary);
	}
}
