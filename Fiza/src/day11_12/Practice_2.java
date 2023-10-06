package day11_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
        }

        // Scenario 2: Handling an unchecked exception (ArrayIndexOutOfBoundsException)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Value at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }
        // Scenario 4: Handling multiple exceptions (unchanged)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Value at index 4: " + numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected exception occurred: " + e.getMessage());
        }
        // Scenario 6: Handling an unchecked exception (unchanged)
        try {
            int number = readIntegerInput();
            System.out.println("Input number: " + number);
        } catch (InputMismatchException e) {
            System.err.println("Input Mismatch Exception: " + e.getMessage());
        }

    }

    // Method that may throw a checked exception (IOException)
    public static int divide(int dividend, int divisor) {
        int result = 0;
        try {
            result = dividend / divisor;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return result;
    }

    public static int readIntegerInput() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            System.out.println();
            int number = sc.nextInt();
            return number;
        } catch (InputMismatchException e) {
            System.err.println("Input Mismatch Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
        return 0; // Default value if input is invalid
    }
}