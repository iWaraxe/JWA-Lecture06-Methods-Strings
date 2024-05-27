package com.coherentsolutions.java.webauto.section03;

/**
 * Class to demonstrate additional String class methods in Java.
 */
public class AdditionalStringMethodsExample {

    /**
     * Main method to test additional String methods.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Using charAt() method
        String sampleString = "Java Strings are powerful!";
        char charAtIndex = sampleString.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex);

        // Using compareTo() method
        int comparisonResult = sampleString.compareTo("Java Strings are awesome!");
        System.out.println("Comparison result: " + comparisonResult);

        // Using compareToIgnoreCase() method
        int comparisonIgnoreCaseResult = sampleString.compareToIgnoreCase("java strings are powerful!");
        System.out.println("Comparison ignoring case result: " + comparisonIgnoreCaseResult);

        // Using endsWith() method
        boolean endsWithResult = sampleString.endsWith("powerful!");
        System.out.println("Ends with 'powerful!': " + endsWithResult);

        // Using toUpperCase() method
        String upperCaseString = sampleString.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        // Using substring() method
        String substring = sampleString.substring(5, 12);
        System.out.println("Substring from index 5 to 12: " + substring);

        // Using replace() method
        String replacedString = sampleString.replace("powerful", "amazing");
        System.out.println("Replaced string: " + replacedString);

        // Using trim() method
        String stringWithSpaces = "   Lots of spaces   ";
        System.out.println("Untrimmed string: '" + stringWithSpaces + "'");
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");
    }
}
