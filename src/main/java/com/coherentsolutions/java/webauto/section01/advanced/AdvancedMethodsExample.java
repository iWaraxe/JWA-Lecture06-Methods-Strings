package com.coherentsolutions.java.webauto.section01.advanced;

/**
 * Class to demonstrate advanced Java methods concepts.
 */
public class AdvancedMethodsExample {

    /**
     * Main method to test advanced methods.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int max = findMax(10, 20);
        System.out.println("Max: " + max);

        double area = calculateCircleArea(5);
        System.out.println("Circle Area: " + area);
    }

    /**
     * Method to find the maximum of two integers.
     * Demonstrates the use of ternary operator.
     * @param a first integer
     * @param b second integer
     * @return the maximum of a and b
     */
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Method to calculate the area of a circle.
     * Demonstrates the use of Math.PI and method with a single parameter.
     * @param radius radius of the circle
     * @return the area of the circle
     */
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Method to demonstrate recursion by calculating factorial.
     * @param n the number to calculate the factorial of
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Method to demonstrate method overloading with different parameter types.
     * @param base base number
     * @param exponent exponent number
     * @return base raised to the power of exponent
     */
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    /**
     * Overloaded method to demonstrate method overloading with different parameter types.
     * @param base base number
     * @param exponent exponent number
     * @return base raised to the power of exponent
     */
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
