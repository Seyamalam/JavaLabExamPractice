import java.util.Scanner;

// Define a custom exception for odd numbers
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class EvenOddChecker {

    // Method to check if a number is even
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number " + number + " is odd.");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            int number = scanner.nextInt();
            checkEven(number);
        } catch (OddNumberException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
