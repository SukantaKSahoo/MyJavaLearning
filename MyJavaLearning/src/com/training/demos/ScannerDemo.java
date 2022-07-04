package com.training.demos;

import java.util.Scanner;

public class ScannerDemo {
	int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Name : " + name);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("Age : " + age);
		sc.nextLine(); // Flushing the Line
		System.out.println("Enter City : ");
		String city = sc.nextLine();
		System.out.println("City : " + city);

		System.out.println("Enter Salary : ");
		double salary = sc.nextDouble();
		System.out.println("Salary : " + salary);

		sc.close();
	}

}
