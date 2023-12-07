package com.project.staticCodeAnalysis.service;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak {
	private static List<Object> list = new ArrayList<>(); // Simulating a static list that retains objects

	public static void main(String[] args) {
		while (true) {
			list.add(new Object()); // Continuously adding objects to the list without removing them
		}
	}
}