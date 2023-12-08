package com.project.staticCodeAnalysis.service;

import java.io.*;

public class InsecureDeserialization {
	public static void main(String[] args) {
		// Simulating insecure deserialization from a file
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
			Object obj = ois.readObject();
			// Process the deserialized object (not the focus of this example)
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}