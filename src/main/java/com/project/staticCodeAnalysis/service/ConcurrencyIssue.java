package com.project.staticCodeAnalysis.service;

public class ConcurrencyIssue {
	private static int counter = 0;

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				incrementCounter();
			}
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();

		// Waiting for threads to complete
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final counter value: " + counter);
	}

	private static synchronized void incrementCounter() {
		counter++;
	}
}