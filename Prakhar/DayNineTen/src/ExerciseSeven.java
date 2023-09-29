import java.util.Scanner;
import java.util.TreeMap;

public class ExerciseSeven {
//    Exercise 7: TreeMap Practice
//    Develop a program that uses a TreeMap to maintain a list of books and their authors. Allow users to add books
//    and authors and display the list in alphabetical order of book titles.

    public static void main(String[] args) {
        TreeMap<String, String> bookAuthorMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBook List Manager Menu:");
            System.out.println("1. Add Book and Author");
            System.out.println("2. Remove a Book");
            System.out.println("3. Display List of Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    bookAuthorMap.put(bookTitle, author);
                    System.out.println("Book and author added: " + bookTitle + " - " + author);
                    break;
                case 2:
                    System.out.print("Enter the book title to remove: ");
                    String bookToRemove = scanner.nextLine();
                    if (bookAuthorMap.containsKey(bookToRemove)) {
                        String auth1 = bookAuthorMap.get(bookToRemove);
                        bookAuthorMap.remove(bookToRemove);
                        System.out.println("Book removed: " + bookToRemove + " - " + auth1);
                    } else {
                        System.out.println("Book not found: " + bookToRemove);
                    }
                    break;
                case 3:
                    if (!bookAuthorMap.isEmpty()) {
                        System.out.println("\nList of Books (Sorted by Title):");
                        for (String bookTitl : bookAuthorMap.keySet()) {
                            String auth = bookAuthorMap.get(bookTitl);
                            System.out.println("Title: " + bookTitl + " - Author: " + auth);
                        }
                    } else {
                        System.out.println("The book list is empty.");
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
    }
}

