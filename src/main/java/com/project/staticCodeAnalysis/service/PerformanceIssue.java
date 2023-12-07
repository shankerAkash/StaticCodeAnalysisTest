package com.project.staticCodeAnalysis.service;

public class PerformanceIssue {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		// Simulating time-consuming operations
		for (int i = 0; i < 1000000; i++) {
			// Time-consuming operations here
		}

		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println("Time taken: " + elapsedTime + " ms");
	}
}