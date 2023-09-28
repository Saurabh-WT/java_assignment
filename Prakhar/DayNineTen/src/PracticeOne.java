import java.util.*;

public class PracticeOne {
     //    Practice 1: Array Practice
//    Write a Java program to store and manipulate a list of integers using arrays. Implement basic operations like
//    adding, updating, and deleting elements.
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Declare and initialize an array to store integers
            int[] numbers = new int[10];
            int size = 0; // Variable to keep track of the number of elements in the array

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Add an element");
                System.out.println("2. Update an element");
                System.out.println("3. Delete an element");
                System.out.println("4. Display all elements");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        if (size < numbers.length) {
                            System.out.print("Enter an integer to add: ");
                            int newNumber = scanner.nextInt();
                            numbers[size] = newNumber;
                            size++;
                            System.out.println("Element added successfully.");
                        } else {
                            System.out.println("Array is full. Cannot add more elements.");
                        }
                        break;

                    case 2:
                        if (size > 0) {
                            System.out.print("Enter the index to update (0 to " + (size - 1) + "): ");
                            int indexToUpdate = scanner.nextInt();
                            if (indexToUpdate >= 0 && indexToUpdate < size) {
                                System.out.print("Enter the new value: ");
                                int newValue = scanner.nextInt();
                                numbers[indexToUpdate] = newValue;
                                System.out.println("Element updated successfully.");
                            } else {
                                System.out.println("Invalid index.");
                            }
                        } else {
                            System.out.println("Array is empty. Nothing to update.");
                        }
                        break;

                    case 3:
                        if (size > 0) {
                            System.out.print("Enter the index to delete (0 to " + (size - 1) + "): ");
                            int indexToDelete = scanner.nextInt();
                            if (indexToDelete >= 0 && indexToDelete < size) {
                                for (int i = indexToDelete; i < size - 1; i++) {
                                    numbers[i] = numbers[i + 1];
                                }
                                size--;
                                System.out.println("Element deleted successfully.");
                            } else {
                                System.out.println("Invalid index.");
                            }
                        } else {
                            System.out.println("Array is empty. Nothing to delete.");
                        }
                        break;

                    case 4:
                        System.out.println("Elements in the array:");
                        for (int i = 0; i < size; i++) {
                            System.out.println("Element " + i + ": " + numbers[i]);
                        }
                        break;

                    case 5:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("Invalid Input, Type integer type");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
