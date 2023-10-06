import java.io.IOException;
import java.util.*;

public class PracticeTwo {
    public static void main(String[] args) {
        // Scenario 1: Handling a checked exception (IOException)
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


        Scanner scanner = new Scanner(System.in);
        // Scenario 3: Using a finally block for cleanup
        try {
            System.out.println("Opening a resource...");
            System.out.print("Enter a number: ");
            System.out.println();
            int input = scanner.nextInt();
            // Simulate resource usage based on user input
            int result = 10 / input;
            System.out.println("Resource used. Result: " + result);
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Closing the resource...");
            scanner.close();
        }

        // Scenario 4: Handling multiple exceptions
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

        // Scenario 5: Handling specific checked exceptions (IOException)
        try {
            writeToFile("sample.txt", "Hello, World!");
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }

        // Scenario 6: Handling an unchecked exception (InputMismatchException)
        try {
            int number = readIntegerInput();
            System.out.println("Input number: " + number);
        } catch (InputMismatchException e) {
            System.err.println("Input Mismatch Exception: " + e.getMessage());
        }catch (NoSuchElementException e){
            System.err.println("No such element found: "+e.getMessage());
        }

        // Scenario 7: Custom Exception (NegativeNumberException)
        try {
            processPositiveNumber(5);
            processPositiveNumber(-2);
        } catch (NegativeNumberException e) {
            System.err.println("Negative Number Exception: " + e.getMessage());
        }
        System.out.println("Program completed.");
    }

    // Method that may throw a checked exception (IOException)
    public static void writeToFile(String filePath, String content) throws IOException {
        try {
            // Code for writing to a file (simulated)
            throw new IOException("Error writing to file");
        } catch (IOException e) {
            throw new IOException("Error writing to file: " + e.getMessage());
        }
    }

    // Method that may throw an arithmetic exception (unchecked exception)
    public static int divide(int dividend, int divisor) {
        int result = 0;
        try {
            result = dividend / divisor;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return result;
    }

    // Method to read an integer input
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

    // Scenario 7: Custom Exception (NegativeNumberException)
    public static void processPositiveNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers not allowed.");
        }
        System.out.println("Processed positive number: " + number);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

//Day 12: Exception Handling
//Objective: Understand the basics of exception handling in Java.
//Topics:
//Introduction to Exceptions
//Definition of exceptions
//Checked vs. unchecked exceptions
//Common exceptions in Java
//Handling Exceptions with try-catch blocks
//Syntax of try-catch blocks
//Handling specific exceptions
//Handling multiple exceptions
//The finally block
//Exercise:
//Write a program that demonstrates the use of try-catch blocks to handle exceptions. Include scenarios where both
// checked and unchecked exceptions are encountered. Experiment with the finally block.