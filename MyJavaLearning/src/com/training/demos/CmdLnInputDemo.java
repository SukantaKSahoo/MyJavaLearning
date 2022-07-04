package com.training.demos;

public class CmdLnInputDemo {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		String city = args[2];
		double salary = Double.parseDouble(args[3]);
		float bonus = Float.parseFloat(args[4]);
		System.out.println(name+"\t"+age+"\t"+city);
		System.out.println("Total inhand salary is : "+(salary+bonus));

	}

}
