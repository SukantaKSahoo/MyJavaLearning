package com.javalearning.hashcode;

public class TestHuman {
	public static void main(String[] args) {
		Human litu = new Human(100, "Litu");
		Human ram = new Human(101, "Ram");
		System.out.println("Litu's Hash Code : " + litu.hashCode());
		System.out.println("Litu's Equal : " + litu.hashCode());
		System.out.println("Ram's Hash Code : " + ram.hashCode());
		System.out.println("Ram's Equal : " + ram.hashCode());
	}
}
