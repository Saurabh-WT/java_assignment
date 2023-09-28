import java.util.*;

public class PracticeThree {
    //    Exercise 3: List Comparison
//    Develop a Java program that demonstrates the differences between ArrayList and LinkedList in terms of
//    performance for various operations (e.g., adding, removing).
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<String> studentList = new LinkedList<>();
            while (true) {
                System.out.println();
                System.out.println("Student List Menu:");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Display Students");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name to add: ");
                        String studNameToAdd = scanner.nextLine();

                        // Adding a student to the end of the list (similar to ArrayList)
                        studentList.add(studNameToAdd);// O(1) average time complexity

                        System.out.println(studNameToAdd + " added to the list.");
                        break;
                    case 2:
                        System.out.print("Enter student name to remove: ");
                        String studNameToRmv = scanner.nextLine();
                        if (studentList.contains(studNameToRmv)) {
                            // Removing a student by value (similar to ArrayList.remove())
                            studentList.remove(studNameToRmv);// O(n) average time complexity, slower than ArrayList
                            System.out.println(studNameToRmv + " removed from the list.");
                        } else {
                            System.out.println(studNameToRmv + " not found in the list.");
                        }
                        break;
                    case 3:
                        if (!studentList.isEmpty()) {
                            System.out.println("List of Students:");
                            for (String student : studentList) {
                                //  similar to ArrayList O(n) time complexity
                                System.out.print(" " + student + " ");
                            }
                        } else {
                            System.out.println("The student list is empty.");
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
        }catch (InputMismatchException e) {
            System.out.println("Invalid Input, Type integer type");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}