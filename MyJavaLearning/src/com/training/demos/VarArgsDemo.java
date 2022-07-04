package com.training.demos;

public class VarArgsDemo {

	public static void main(String[] args) {
		VarArgsDemo var = new VarArgsDemo();
		var.dynamicSum("Litu");
		var.dynamicSum("Sukanta", 10);
		var.dynamicSum("Rinu", 10, 20);
	}

	void dynamicSum(String name, int... x) {
		System.out.println("Welcome " + name);
		int sum = 0;
		for (int i : x) {
			sum = sum + i;
		}
		System.out.println("Sum is : " + sum);
	}

}
