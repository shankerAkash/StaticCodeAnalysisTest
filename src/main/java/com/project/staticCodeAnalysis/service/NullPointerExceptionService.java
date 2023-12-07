package com.project.staticCodeAnalysis.service;

public class NullPointerExceptionService {
    public static void main(String[] args) {
        String str = null;
        // Simulating a null pointer dereference issue
        int length = str.length(); // This line will cause a NullPointerException
        System.out.println("Length of the string: " + length);
    }
}