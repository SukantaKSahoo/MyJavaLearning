package com.multithreading.demos;

public class MainThread {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		thread.setName("Litu");
		thread.setPriority(7);
		System.out.println(thread);
		for (int i = 1000; i <= 1010; i++) {
			System.out.println("Main " + i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Completed");

	}

}
