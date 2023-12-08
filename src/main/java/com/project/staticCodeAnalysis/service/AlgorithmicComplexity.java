package com.project.staticCodeAnalysis.service;

import java.util.Arrays;

public class AlgorithmicComplexity {
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 5, 6 }; // Simulating an array for sorting

		// Simulating inefficient algorithmic complexity (Bubble Sort)
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swap elements if they are in the wrong order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// Printing the sorted array (not the focus of this example)
		System.out.println(Arrays.toString(array));
	}
}