package com.coherentsolutions.java.webauto.section03;

/**
 * Class to demonstrate basic String class methods in Java.
 */
public class BasicStringMethodsExample {

    /**
     * Main method to test basic String methods.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Using length() method
        String str1 = "Some string";
        System.out.println("Length of str1: " + str1.length());

        String str2 = "Some string!! \n\t";
        System.out.println("Length of str2: " + str2.length());

        // Using contains() method
        System.out.println("str2 contains 'o': " + str2.contains("o"));

        // Using toCharArray() method
        char[] charArray = "Some string!!".toCharArray();
        System.out.print("Characters in str2: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Using split() method
        String[] strArray = "Some string for our classes".split(" ");
        System.out.println("Splitting str into words:");
        for (String s : strArray) {
            System.out.println(s);
        }

        // Using equals() method
        String mom1 = "Mama";
        String mom2 = "Mama";
        System.out.println("mom1 == mom2: " + (mom1 == mom2));
        System.out.println("mom1.equals(mom2): " + mom1.equals(mom2));

        String mom3 = new String("Mama");
        String mom4 = new String("Mama");
        System.out.println("mom3 == mom4: " + (mom3 == mom4));
        System.out.println("mom3.equals(mom4): " + mom3.equals(mom4));

        // Using indexOf() method
        int index = "Mama".indexOf('r');
        System.out.println("Index of 'r' in 'Mama': " + index);
    }
}
