package com.training.demos;

import java.util.Scanner;

public class EnumDemo {
	enum Fruits {
		APPLE, ORANGE, LICHI, PINEAPPLE, MANGO, TESTFOOD
	}

	public static void main(String[] args) {

		// Converting Enum into Array
		Fruits[] fruits = Fruits.values();
		for (Fruits fruit : fruits) {
			System.out.println(fruit.name());
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("=====================\nEnter your input :");
		String input = sc.next();

		Fruits fruit = null;

		for (Fruits nfruit : fruits) {
			if (nfruit.name().equals(input)) {
				fruit = Fruits.valueOf(input);
			}
		}
		if (fruit == null) {
			System.out.println("Wrong Input. So, exiting the Program");
			System.exit(0);
		}
		switch (fruit) {
		case APPLE:
			System.out.println("Keep Doctor Away");
			break;
		case MANGO:
			System.out.println("King of all Fruit");
			break;
		default:
			System.out.println("Not a Fruit");

		}
		sc.close();
	}
}
