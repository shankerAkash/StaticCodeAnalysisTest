package com.project.staticCodeAnalysis.service;

import java.io.FileWriter;
import java.io.IOException;

public class ResourceLeak {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			// Creating a FileWriter but not closing it
			writer = new FileWriter("output.txt");
			writer.write("Testing resource leak");
			writer.flush();
			// File resource not closed intentionally
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Code to close the FileWriter
			if (writer != null) {
				try {
					writer.close(); // This line should be present to close the resource
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}