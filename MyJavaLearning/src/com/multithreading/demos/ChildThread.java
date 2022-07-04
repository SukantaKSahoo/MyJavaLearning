package com.multithreading.demos;

public class ChildThread extends Thread {
	public static void main(String[] args) {
		ChildThread child1 = new ChildThread();
		child1.setName("Thread1");
		child1.start();
	}
}
