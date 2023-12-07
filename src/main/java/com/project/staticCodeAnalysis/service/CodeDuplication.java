package com.project.staticCodeAnalysis.service;

public class CodeDuplication {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// Duplicated logic for adding two numbers
		int sum1 = a + b;
		int sum2 = a + b;

		// Rest of the code (duplicated logic not used)
		// ...
	}
}