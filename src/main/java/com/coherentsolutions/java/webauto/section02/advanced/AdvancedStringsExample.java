package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Class to demonstrate advanced string operations in Java.
 */
public class AdvancedStringsExample {

    /**
     * Main method to test advanced string operations.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Demonstrating the use of various String methods
        String originalString = "Java Strings are powerful!";

        // charAt() method
        char charAtIndex = originalString.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex);

        // compareTo() method
        int comparisonResult = originalString.compareTo("Java Strings are awesome!");
        System.out.println("Comparison result: " + comparisonResult);

        // equals() method
        boolean isEqual = originalString.equals("Java Strings are powerful!");
        System.out.println("Strings are equal: " + isEqual);

        // toUpperCase() method
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        // substring() method
        String substring = originalString.substring(5, 12);
        System.out.println("Substring: " + substring);

        // replace() method
        String replacedString = originalString.replace("powerful", "amazing");
        System.out.println("Replaced string: " + replacedString);

        // split() method
        String[] splitArray = originalString.split(" ");
        System.out.println("Split string array:");
        for (String str : splitArray) {
            System.out.println(str);
        }

        // trim() method
        String stringWithSpaces = "   Lots of spaces   ";
        System.out.println("Original string: '" + stringWithSpaces + "'");
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");
    }
}
