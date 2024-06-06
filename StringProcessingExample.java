public class StringProcessingExample {

    public static void main(String[] args) {
        // Example 1: String Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedString = str1 + " " + str2;
        System.out.println("Example 1: String Concatenation");
        System.out.println(concatenatedString);

        // Example 2: Substring Extraction
        String str3 = "Hello World";
        String substring = str3.substring(6, 11); // "World"
        System.out.println("\nExample 2: Substring Extraction");
        System.out.println(substring);

        // Example 3: Character Replacement
        String str4 = "Hello World";
        String replacedString = str4.replace('o', '0');
        System.out.println("\nExample 3: Character Replacement");
        System.out.println(replacedString);

        // Example 4: Trimming Whitespace
        String str5 = "   Hello World   ";
        String trimmedString = str5.trim();
        System.out.println("\nExample 4: Trimming Whitespace");
        System.out.println(trimmedString);

        // Example 5: Conversion to Uppercase and Lowercase
        String str6 = "Hello World";
        String upperCaseString = str6.toUpperCase();
        String lowerCaseString = str6.toLowerCase();
        System.out.println("\nExample 5: Conversion to Uppercase and Lowercase");
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString);

        // Example 6: String Splitting
        String str7 = "apple,banana,cherry";
        String[] fruits = str7.split(",");
        System.out.println("\nExample 6: String Splitting");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Example 7: Checking String Equality
        String str8 = "Hello";
        String str9 = "hello";
        boolean isEqual = str8.equals(str9);
        boolean isEqualIgnoreCase = str8.equalsIgnoreCase(str9);
        System.out.println("\nExample 7: Checking String Equality");
        System.out.println("Equal: " + isEqual);
        System.out.println("Equal ignoring case: " + isEqualIgnoreCase);

        // Example 8: String Length
        String str10 = "Hello World";
        int length = str10.length();
        System.out.println("\nExample 8: String Length");
        System.out.println("Length: " + length);

        // Example 9: Character at Specific Index
        char charAtIndex = str10.charAt(6); // 'W'
        System.out.println("\nExample 9: Character at Specific Index");
        System.out.println("Character at index 6: " + charAtIndex);

        // Example 10: String Contains Substring
        boolean containsSubstring = str10.contains("World");
        System.out.println("\nExample 10: String Contains Substring");
        System.out.println("Contains 'World': " + containsSubstring);

        // Example 11: String Starts With and Ends With
        boolean startsWith = str10.startsWith("Hello");
        boolean endsWith = str10.endsWith("World");
        System.out.println("\nExample 11: String Starts With and Ends With");
        System.out.println("Starts with 'Hello': " + startsWith);
        System.out.println("Ends with 'World': " + endsWith);

        // Example 12: Index of Substring or Character
        int indexOfSubstring = str10.indexOf("World");
        int indexOfChar = str10.indexOf('o');
        System.out.println("\nExample 12: Index of Substring or Character");
        System.out.println("Index of 'World': " + indexOfSubstring);
        System.out.println("Index of 'o': " + indexOfChar);

        // Example 13: String Join
        String joinedString = String.join(", ", "Red", "Green", "Blue");
        System.out.println("\nExample 13: String Join");
        System.out.println(joinedString);

        // Example 14: String Format
        String name = "John";
        int age = 25;
        String formattedString = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nExample 14: String Format");
        System.out.println(formattedString);
    }
}
