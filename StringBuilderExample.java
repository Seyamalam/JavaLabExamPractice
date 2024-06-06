public class StringBuilderExample {

    public static void main(String[] args) {
        // Example 1: Creating and Initializing StringBuilder
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println("Example 1: Creating and Initializing StringBuilder");
        System.out.println(sb1);

        // Example 2: Appending to StringBuilder
        sb1.append(" World");
        System.out.println("\nExample 2: Appending to StringBuilder");
        System.out.println(sb1);

        // Example 3: Inserting into StringBuilder
        sb1.insert(6, "Java ");
        System.out.println("\nExample 3: Inserting into StringBuilder");
        System.out.println(sb1);

        // Example 4: Deleting from StringBuilder
        sb1.delete(6, 11);
        System.out.println("\nExample 4: Deleting from StringBuilder");
        System.out.println(sb1);

        // Example 5: Replacing in StringBuilder
        sb1.replace(6, 11, "World");
        System.out.println("\nExample 5: Replacing in StringBuilder");
        System.out.println(sb1);

        // Example 6: Reversing StringBuilder
        sb1.reverse();
        System.out.println("\nExample 6: Reversing StringBuilder");
        System.out.println(sb1);
        // Reverting back to original for further examples
        sb1.reverse();

        // Example 7: Capacity of StringBuilder
        StringBuilder sb2 = new StringBuilder();
        System.out.println("\nExample 7: Capacity of StringBuilder");
        System.out.println("Initial Capacity: " + sb2.capacity());
        sb2.append("Hello, this is a test string to demonstrate the capacity.");
        System.out.println("Capacity after append: " + sb2.capacity());

        // Example 8: Ensuring Capacity
        sb2.ensureCapacity(100);
        System.out.println("\nExample 8: Ensuring Capacity");
        System.out.println("Capacity after ensuring: " + sb2.capacity());

        // Example 9: Setting Length
        sb2.setLength(5);
        System.out.println("\nExample 9: Setting Length");
        System.out.println(sb2);

        // Example 10: Converting to String
        String str = sb1.toString();
        System.out.println("\nExample 10: Converting to String");
        System.out.println(str);

        // Example 11: Chaining Methods
        StringBuilder sb3 = new StringBuilder("Start");
        sb3.append(" -> Middle").replace(0, 5, "Begin").delete(13, 19).insert(13, " End");
        System.out.println("\nExample 11: Chaining Methods");
        System.out.println(sb3);

        // Example 12: Getting Character at Specific Index
        char charAtIndex = sb1.charAt(6);
        System.out.println("\nExample 12: Getting Character at Specific Index");
        System.out.println("Character at index 6: " + charAtIndex);

        // Example 13: Substring from StringBuilder
        String substring = sb1.substring(6, 11);
        System.out.println("\nExample 13: Substring from StringBuilder");
        System.out.println("Substring: " + substring);

        // Example 14: Index of Substring
        int indexOfSubstring = sb1.indexOf("World");
        System.out.println("\nExample 14: Index of Substring");
        System.out.println("Index of 'World': " + indexOfSubstring);
    }
}
