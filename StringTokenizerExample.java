import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        // Example 1: Basic tokenization with default delimiter (whitespace)
        String str1 = "Hello World This is StringTokenizer";
        StringTokenizer st1 = new StringTokenizer(str1);
        System.out.println("Example 1: Basic tokenization with default delimiter");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        // Example 2: Tokenization with a custom delimiter
        String str2 = "Apple,Orange,Banana,Grape";
        StringTokenizer st2 = new StringTokenizer(str2, ",");
        System.out.println("\nExample 2: Tokenization with a custom delimiter (,)");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        // Example 3: Tokenization with multiple delimiters
        String str3 = "name=John;age=25;location=USA";
        StringTokenizer st3 = new StringTokenizer(str3, "=;");
        System.out.println("\nExample 3: Tokenization with multiple delimiters (= and ;)");
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }

        // Example 4: Counting tokens
        String str4 = "One two three four five";
        StringTokenizer st4 = new StringTokenizer(str4);
        System.out.println("\nExample 4: Counting tokens");
        int count = st4.countTokens();
        System.out.println("Number of tokens: " + count);
        while (st4.hasMoreTokens()) {
            System.out.println(st4.nextToken());
        }

        // Example 5: Retrieving tokens without iteration
        String str5 = "Token1,Token2,Token3";
        StringTokenizer st5 = new StringTokenizer(str5, ",");
        System.out.println("\nExample 5: Retrieving tokens without iteration");
        String firstToken = st5.nextToken();
        String secondToken = st5.nextToken();
        String thirdToken = st5.nextToken();
        System.out.println("First token: " + firstToken);
        System.out.println("Second token: " + secondToken);
        System.out.println("Third token: " + thirdToken);
    }
}
