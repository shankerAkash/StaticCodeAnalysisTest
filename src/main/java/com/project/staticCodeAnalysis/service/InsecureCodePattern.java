package com.project.staticCodeAnalysis.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsecureCodePattern {
	public static void main(String[] args) {
		String userInput = "'; DROP TABLE users; --"; // Simulating a malicious input
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "username",
					"password");
			Statement statement = connection.createStatement();

			// Constructing a SQL query with concatenated user input (vulnerable to SQL
			// injection)
			String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
			ResultSet resultSet = statement.executeQuery(query);

			// Process the retrieved data (not the focus of this example)
			// ...

			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}