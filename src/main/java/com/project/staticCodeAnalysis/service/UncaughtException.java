package com.project.staticCodeAnalysis.service;

public class UncaughtException {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };

		// Trying to access an element outside the array bounds
		int element = array[5]; // This line throws an ArrayIndexOutOfBoundsException
	}
}