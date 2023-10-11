import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExerciseFive {
    //Buffered Writing:
    //Develop a program that takes user input and writes it to a file using BufferedWriter. Ensure the content is
    // appended to the existing file.
    public static void main(String[] args) {
        String filePath = "Prakhar\\DayThirteenFourteen\\test4.txt";

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Open the file in append mode (true argument)
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            System.out.println("Enter text to append to the file (type 'exit' to quit):");

            // Read user input and write it to the file
            while (true) {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // Append the input to the file
                writer.write(input);
                writer.newLine(); // Add a newline after each input
            }

            // Close the writer to ensure changes are flushed to the file
            writer.close();

            System.out.println("Data appended to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
