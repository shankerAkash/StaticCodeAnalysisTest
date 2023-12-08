package com.project.staticCodeAnalysis.service;

public class DeepNesting {
	public static void main(String[] args) {
		// Simulating deep nesting and code complexity
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				if (i % 3 == 0) {
					if (i % 4 == 0) {
						// Nested conditional blocks (high code complexity)
						System.out.println("Nested block executed: " + i);
					}
				}
			}
		}
	}
}