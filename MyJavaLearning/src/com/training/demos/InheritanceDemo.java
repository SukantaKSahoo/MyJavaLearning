package com.training.demos;

public class InheritanceDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(args[0]);

		Manager mgr = new Manager();

		emp.getMsg();
		mgr.getMsg();
		mgr.getDetails();

	}

}
