package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Class to demonstrate additional advanced string operations in Java.
 */
public class AdditionalAdvancedStringsExample {

    /**
     * Main method to test additional advanced string operations.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Demonstrating more advanced String methods
        String sampleString = "Advanced String Operations";

        // contains() method
        boolean containsResult = sampleString.contains("String");
        System.out.println("Contains 'String': " + containsResult);

        // startsWith() method
        boolean startsWithResult = sampleString.startsWith("Advanced");
        System.out.println("Starts with 'Advanced': " + startsWithResult);

        // endsWith() method
        boolean endsWithResult = sampleString.endsWith("Operations");
        System.out.println("Ends with 'Operations': " + endsWithResult);

        // indexOf() method
        int indexOfResult = sampleString.indexOf('S');
        System.out.println("Index of 'S': " + indexOfResult);

        // lastIndexOf() method
        int lastIndexOfResult = sampleString.lastIndexOf('e');
        System.out.println("Last index of 'e': " + lastIndexOfResult);

        // toCharArray() method
        char[] charArray = sampleString.toCharArray();
        System.out.println("Character array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // valueOf() method
        int number = 12345;
        String numberString = String.valueOf(number);
        System.out.println("String value of number: " + numberString);

        // format() method
        String formattedString = String.format("Hello, %s! You have %d new messages.", "Alice", 5);
        System.out.println("Formatted string: " + formattedString);

        // matches() method
        boolean matchesResult = sampleString.matches(".*String.*");
        System.out.println("Matches regex '.*String.*': " + matchesResult);
    }
}
