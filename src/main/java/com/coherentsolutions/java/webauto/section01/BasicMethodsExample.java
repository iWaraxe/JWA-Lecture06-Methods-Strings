package com.coherentsolutions.java.webauto.section01;

import java.util.Arrays;

/**
 * Class to demonstrate basic Java methods.
 */
public class BasicMethodsExample {

    /**
     * Main method to test the basic methods.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int sum = getSum(5, 10);
        System.out.println("Sum: " + sum);

        int[] arr = {1, 2, 3, 4, 10, 20, 30};
        printArray(arr);

        int overloadedSum = getSum(1, 2, 3, 4);
        double overloadedSumDouble = getSum(1.5, 2.5);
        System.out.println("Overloaded Sum (int): " + overloadedSum);
        System.out.println("Overloaded Sum (double): " + overloadedSumDouble);
    }

    /**
     * Method to get the sum of two integers.
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public static int getSum(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    /**
     * Method to print elements of an array.
     * @param arr array of integers
     */
    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
            if (el % 10 == 0) {
                System.out.println();
            }
        }
    }

    /**
     * Overloaded method to get the sum of four integers.
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @param d fourth integer
     * @return sum of a, b, c, and d
     */
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    /**
     * Overloaded method to get the sum of two doubles.
     * @param a first double
     * @param b second double
     * @return sum of a and b
     */
    public static double getSum(double a, double b) {
        return a + b;
    }
}

