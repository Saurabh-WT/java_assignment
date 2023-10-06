import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseTwo {
    //    Exercise 2: ArrayList Operations
//    Develop a Java program that simulates a to-do list using an ArrayList. Implement functions to add, remove, and
//    list tasks. Each task should have a name and a priority level.
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> toDoList = new ArrayList<>();

            while (true) {
                System.out.println();
                System.out.println(" List Menu:");
                System.out.println("1. Add To do Task");
                System.out.println("2. Remove to do task(you can display the list and copy paste the task to remove it)");
                System.out.println("3. Display To do List");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter To do task name to add in priority order: ");
                        String studNameToAdd = scanner.nextLine();
                        toDoList.add(studNameToAdd);
                        System.out.println(studNameToAdd + " added to the list.");
                        break;
                    case 2:
                        System.out.print("Enter To do task name to remove(copy the task name from to do list): ");
                        int indexToRmv = scanner.nextInt();
                        if (indexToRmv<toDoList.size()) {
                            toDoList.remove(indexToRmv);
                            System.out.println(indexToRmv + " index removed from the list.");
                        } else {
                            System.out.println(indexToRmv + " not found in the list.");
                        }
                        break;
                    case 3:
                        if (!toDoList.isEmpty()) {
                            System.out.println("To do List with :");
                            int i=0;
                            for (String listItem : toDoList) {
                                System.out.println((i++)+" " + listItem + " ");
                            }
                        } else {
                            System.out.println("The list is empty.");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, Type integer type");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
