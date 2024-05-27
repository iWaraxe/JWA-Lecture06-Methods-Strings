package com.coherentsolutions.java.webauto.section02;

/**
 * Class to demonstrate basic string operations in Java.
 */
public class BasicStringsExample {

    /**
     * Main method to test basic string operations.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Creating a string using a string literal
        String greeting = "Hello, World!";

        System.out.println(greeting);

        // Creating a string using a character array
        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);

        // Using the length() method
        int length = greeting.length();
        System.out.println("Length of greeting: " + length);

        // Concatenating strings
        String concatenatedString = greeting.concat("How are you?");
        System.out.println(concatenatedString);
    }
}
