import java.util.*;

public class PracticeTwo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> studentList = new ArrayList<>();

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
                        studentList.add(studNameToAdd);
                        System.out.println(studNameToAdd + " added to the list.");
                        break;
                    case 2:
                        System.out.print("Enter student name to remove: ");
                        String studNameToRmv = scanner.nextLine();
                        if (studentList.contains(studNameToRmv)) {
                            studentList.remove(studNameToRmv);
                            System.out.println(studNameToRmv + " removed from the list.");
                        } else {
                            System.out.println(studNameToRmv + " not found in the list.");
                        }
                        break;
                    case 3:
                        if (!studentList.isEmpty()) {
                            System.out.println("List of Students:");
                            for (String student : studentList) {
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
