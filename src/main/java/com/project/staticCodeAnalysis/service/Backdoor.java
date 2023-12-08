package com.project.staticCodeAnalysis.service;

public class Backdoor {
	private static final String SECRET_PASSWORD = "password123"; // Simulating a backdoor password

	public static void main(String[] args) {
		String userPassword = args[0]; // Simulating user input (password)

		// Checking for the existence of a backdoor password
		if (userPassword.equals(SECRET_PASSWORD)) {
			// Unauthorized access granted via the backdoor
			System.out.println("Backdoor access granted!");
		} else {
			// Normal authentication logic (not the focus of this example)
			System.out.println("Normal authentication in progress...");
		}
	}
}