package com.coherentsolutions.java.webauto.section01.advanced;

import com.coherentsolutions.java.webauto.section01.BasicMethodsExample;

/**
 * Class to demonstrate additional advanced Java methods concepts.
 */
public class AdditionalAdvancedMethodsExample {

    /**
     * Main method to test additional advanced methods.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        int gcd = findGCD(56, 98);
        System.out.println("GCD: " + gcd);

        String reversedString = reverseString("Hello World");
        System.out.println("Reversed String: " + reversedString);
    }

    /**
     * Method to find the greatest common divisor (GCD) of two numbers.
     * Demonstrates the use of Euclidean algorithm.
     * @param a first number
     * @param b second number
     * @return the GCD of a and b
     */
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    /**
     * Method to reverse a string.
     * Demonstrates the use of StringBuilder and its reverse method.
     * @param str the string to reverse
     * @return the reversed string
     */
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Method to check if a number is prime.
     * @param n the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
