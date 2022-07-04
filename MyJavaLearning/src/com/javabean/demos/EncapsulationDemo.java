package com.javabean.demos;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName(args[0]);
		vehicle.setModel("Petrol iVTEC");
		vehicle.setPrice(1000000);
		vehicle.setAutomatic(false);

		System.out.println("The vehicle is " + vehicle.getName() + "\nModel is " + vehicle.getModel());
	}

}
