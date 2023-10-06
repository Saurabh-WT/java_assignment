import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExerciseSix {

    //6. Handling Checked Exceptions:
    //Write a method that reads data from a file. Implement proper exception handling for potential file I/O exceptions.

    public static void main(String[] args) {
        try {
            String filePath = "example.txt"; // Replace with your file path
            BufferedReader fileData =new BufferedReader( new FileReader(filePath));
            System.out.println("File Data:\n" + fileData);


        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
