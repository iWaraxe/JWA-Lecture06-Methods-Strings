# Methods in Java. Strings

## Java - Methods

A method in Java is a collection of statements that together perform a specific operation. For example, when you call the method `System.out.println()`, the system executes a series of commands to print a message to the console.

### Syntax
```java
public static int methodName(int a, int b) {
   // method body
}
```
Where:
- `public static` - modifier;
- `int` - return type;
- `methodName` - method name;
- `a, b` - formal parameters;
- `int a, int b` - parameter list.

### Example:
```java
public static int getSum(int a, int b) {
    int c;
    c = a + b;
    return c;
}
```

### Moving Array Sorting Logic to a Method

### Method Invocation
The process of invoking a method is straightforward. When a program makes a method call in Java, the program control is transferred to the called method. The called method then returns control to the caller in two cases:
- If a return statement is executed;
- If the closing curly brace of the method is reached.

### The `void` Keyword
The `void` keyword in Java allows us to create methods that do not return a value.

### Example:
```java
public static void printArray(int[] arr) {
    for (int el : arr) {
        System.out.print(el + " ");
        if (el % 10 == 0) {
            System.out.println();
        }
    }
}
```

### Method Overloading
Method overloading in Java occurs when a class contains two or more methods with the same name but different parameters. This process is different from method overriding. In method overriding, a method has the same name, return type, and number of parameters.

### Example:
```java
public static int getSum(int a, int b, int c, int d) {
    return a + b + c + d;
}

public static double getSum(double a, double b) {
    return a + b;
}
```

## Java - Strings and the String Class Methods

Strings represent a sequence of characters. Strings in Java are widely used and are objects. The Java platform provides the `String` class for creating and manipulating strings.

### Creating Strings
The simplest way to create a string:
```java
String greeting = "Hello, World!";
```
Every time the compiler encounters a string literal in the code, it creates a `String` object with that value, in this case, "Hello, World!".

Like other objects, you can create string objects using the `new` keyword and a constructor. The `String` class has eleven constructors that allow you to provide the initial value of the string using different sources such as a character array.

### Example:
```java
public class Test {

   public static void main(String args[]){
      char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println(helloString);
   }
}
```

### String Length
One of the methods you can use with strings is the `length()` method, which returns the number of characters contained in the string object.

### Concatenating Strings in Java
The `String` class includes a method for concatenating two strings:
```java
string1.concat(string2);
```
This returns a new string `string1` with `string2` added to the end. You can also use the `concat()` method with string literals:
```java
"Hello, ".concat("World!");
```

### String Class Methods
Below is a list of methods supported by the `String` class.

| No. | Method | Description |
| --- | ------ | ----------- |
| 1 | `char charAt(int index)` | Returns the character at the specified index. |
| 2 | `int compareTo(Object o)` | Compares this string to another object. |
| 3 | `int compareTo(String anotherString)` | Compares two strings lexicographically. |
| 4 | `int compareToIgnoreCase(String str)` | Compares two strings lexicographically, ignoring case differences. |
| 5 | `String concat(String str)` | Concatenates the specified string to the end of this string. |
| 6 | `boolean contentEquals(StringBuffer sb)` | Returns true if this string represents the same sequence of characters as the specified StringBuffer. |
| 7 | `static String copyValueOf(char[] data)` | Returns a string representing the specified character array. |
| 8 | `static String copyValueOf(char[] data, int offset, int count)` | Returns a string representing the specified character array. |
| 9 | `boolean endsWith(String suffix)` | Tests if this string ends with the specified suffix. |
| 10 | `boolean equals(Object anObject)` | Compares this string to the specified object. |
| 11 | `boolean equalsIgnoreCase(String anotherString)` | Compares this string to another string, ignoring case considerations. |
| 12 | `byte getBytes()` | Encodes this string into a sequence of bytes using the platform's default charset. |
| 13 | `byte[] getBytes(String charsetName)` | Encodes this string into a sequence of bytes using the named charset. |
| 14 | `void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)` | Copies characters from this string into the destination character array. |
| 15 | `int hashCode()` | Returns a hash code for this string. |
| 16 | `int indexOf(int ch)` | Returns the index of the first occurrence of the specified character. |
| 17 | `int indexOf(int ch, int fromIndex)` | Returns the index of the first occurrence of the specified character, starting the search at the specified index. |
| 18 | `int indexOf(String str)` | Returns the index of the first occurrence of the specified substring. |
| 19 | `int indexOf(String str, int fromIndex)` | Returns the index of the first occurrence of the specified substring, starting at the specified index. |
| 20 | `String intern()` | Returns a canonical representation for the string object. |
| 21 | `int lastIndexOf(int ch)` | Returns the index of the last occurrence of the specified character. |
| 22 | `int lastIndexOf(int ch, int fromIndex)` | Returns the index of the last occurrence of the specified character, starting the search backward from the specified index. |
| 23 | `int lastIndexOf(String str)` | Returns the index of the last occurrence of the specified substring. |
| 24 | `int lastIndexOf(String str, int fromIndex)` | Returns the index of the last occurrence of the specified substring, starting backward from the specified index. |
| 25 | `int length()` | Returns the length of this string. |
| 26 | `boolean matches(String regex)` | Tells whether or not this string matches the given regular expression. |
| 27 | `boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)` | Tests if two string regions are equal. |
| 28 | `boolean regionMatches(int toffset, String other, int ooffset, int len)` | Tests if two string regions are equal. |
| 29 | `String replace(char oldChar, char newChar)` | Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar. |
| 30 | `String replaceAll(String regex, String replacement)` | Replaces each substring of this string that matches the given regular expression with the given replacement. |
| 31 | `String replaceFirst(String regex, String replacement)` | Replaces the first substring of this string that matches the given regular expression with the given replacement. |
| 32 | `String[] split(String regex)` | Splits this string around matches of the given regular expression. |
| 33 | `String[] split(String regex, int limit)` | Splits this string around matches of the given regular expression. |
| 34 | `boolean startsWith(String prefix)` | Tests if this string starts with the specified prefix. |
| 35 | `boolean startsWith(String prefix, int toffset)` | Tests if this string starts with the specified prefix beginning at the specified index. |
| 36 | `CharSequence subSequence(int beginIndex, int endIndex)` | Returns a new character sequence that is a subsequence of this sequence. |
| 37 | `String substring(int beginIndex)` | Returns a new string that is a substring of this string. |
| 38 | `String substring(int beginIndex, int endIndex)` | Returns a new string that is a substring of this string. |
| 39 | `char[] toCharArray()` | Converts this string to a new character array. |
| 40 | `String toLowerCase()` | Converts all of the characters in this string to lower case using the rules of the default locale. |
| 41 | `String toLowerCase(Locale locale)` | Converts all of the characters in this string to lower case using the rules of the given locale. |
| 42 | `String toString()` | This object (which is already a string!) returns itself. |
| 43 | `String toUpperCase()` | Converts all of the characters in this string to upper case using the rules of the default locale. |
| 44 | `String toUpperCase(Locale locale)` | Converts all of the characters in this string to upper case using the rules of the given locale. |
| 45 | `String trim()` | Returns a copy of

the string, with leading and trailing whitespace omitted. |
| 46 | `static String valueOf(primitive data type x)` | Returns the string representation of the argument. |

### Examples:
```java
// length()
System.out.println("Some string".length());
System.out.println("Some string!! \n\n".length());

// contains()
System.out.println("Some string!! \n\n".contains("o"));

// toCharArray()
char[] ch = "Some string!!".toCharArray();
for (char c : ch) {
    System.out.print(c + " ");
}

// split()
String[] strArr = "Some string for our classes".split(" ");
for (String s : strArr) {
    System.out.println(s);
}

// equals()
String mom1 = "Mama";
String mom2 = "Mama";
System.out.println(mom1 == mom2); // true
System.out.println(mom1.equals(mom2)); // true

String mom3 = new String("Mama");
String mom4 = new String("Mama");
System.out.println(mom3 == mom4); // false
System.out.println(mom3.equals(mom4)); // true

// indexOf(char ch)
int index = "Mama".indexOf('r');
System.out.println(index); // -1
```

### Solve One of the Homework Tasks
1) Implement a method that takes a string as a parameter and returns the number of vowels in the string. Use the method and print the number of vowels in the string provided in task 1.

```java
public static int getVowelsAmount(String str) {
    String vowels = "aeiou";
    char[] charArr = str.toLowerCase().toCharArray();
    int amount = 0;
    for (char c : charArr) {
        if (vowels.contains(String.valueOf(c))) {
            amount++;
        }
    }
    return amount;
}
```