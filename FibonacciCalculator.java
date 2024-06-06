import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the position of the Fibonacci sequence: ");
            int position = scanner.nextInt();

            if (position < 0) {
                throw new IllegalArgumentException("Position must be a non-negative integer.");
            }

            int fibonacciNumber = calculateFibonacci(position);
            System.out.println("The Fibonacci number at position " + position + " is: " + fibonacciNumber);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to calculate Fibonacci number
    public static int calculateFibonacci(int position) {
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else {
            int a = 0, b = 1, c;
            for (int i = 2; i <= position; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
}
