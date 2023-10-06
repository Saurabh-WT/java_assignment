package day11_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        // Scenario 1: Handling IllegalArgumentException
        try {
            int age = -10;
            if(age<0){
                throw new IllegalArgumentException("Age cannot be negative");
            }
            System.out.println("Age "+age);
        }
        catch (IllegalArgumentException e){
            System.err.println("IllegalArgumentException "+e.getLocalizedMessage());
        }
        try{
            // Scenario 2: Handling StringIndexOutOfBoundsException
            String str = "Hello";
            char ch = str.charAt(10); // This line will throw StringIndexOutOfBoundsException
            System.out.println("Character: " + ch);

        }
        catch (StringIndexOutOfBoundsException e){
            System.err.println(e.getLocalizedMessage());
        }
        try {
            // Scenario 3: Handling an unchecked exception (Divide by zero)
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
        }

        // Scenario 4: Handling an unchecked exception (ArrayIndexOutOfBoundsException)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Value at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }

        try{
            // Scenario 5: Handling an NullPointerException
            String str = null;
            int length = str.length(); // This line will throw NullPointerException
            System.out.println("Length: " + length);

        }
        catch (NullPointerException e){
            System.err.println(e.getLocalizedMessage());
        }
        try{
            // Scenario 6: Handling Number format exception
            String str = "abc";
            int num = Integer.parseInt(str); // This line will throw NumberFormatException
            System.err.println("Number: " + num);

        }
        catch (NumberFormatException e){
            System.err.println("Number Format exception "+e.getLocalizedMessage());
        }
        // Scenario 7: Handling an unchecked exception
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