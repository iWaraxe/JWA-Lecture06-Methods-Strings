package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * Class to demonstrate advanced String class methods in Java.
 */
public class AdvancedStringMethodsExample {

    /**
     * Main method to test advanced String methods.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Using contentEquals() method
        StringBuffer stringBuffer = new StringBuffer("Java Strings are powerful!");
        String str = "Java Strings are powerful!";
        boolean contentEqualsResult = str.contentEquals(stringBuffer);
        System.out.println("String equals StringBuffer: " + contentEqualsResult);

        // Using copyValueOf() method
        char[] charArray = { 'J', 'a', 'v', 'a', ' ', 'S', 't', 'r', 'i', 'n', 'g', 's' };
        String copiedString = String.copyValueOf(charArray);
        System.out.println("Copied String: " + copiedString);

        // Using intern() method
        String internedString = str.intern();
        System.out.println("Interned string: " + internedString);

        // Using regionMatches() method
        String str1 = "Java programming";
        String str2 = "JAVA programming";
        boolean regionMatchesResult = str1.regionMatches(true, 0, str2, 0, 4);
        System.out.println("Region matches (ignore case): " + regionMatchesResult);

        // Using replaceAll() method
        String replacedAllString = str.replaceAll("powerful", "awesome");
        System.out.println("Replaced all string: " + replacedAllString);

        // Using matches() method
        boolean matchesResult = str.matches(".*powerful.*");
        System.out.println("Matches regex '.*powerful.*': " + matchesResult);

        // Using valueOf() method
        int number = 12345;
        String numberString = String.valueOf(number);
        System.out.println("String value of number: " + numberString);

        // Using format() method
        String formattedString = String.format("Hello, %s! You have %d new messages.", "Alice", 5);
        System.out.println("Formatted string: " + formattedString);
    }
}
