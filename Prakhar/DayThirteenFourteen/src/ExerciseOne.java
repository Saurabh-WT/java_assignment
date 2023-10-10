import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExerciseOne {
    //File Reading Basics:
    //Create a Java program that reads a text file using FileReader and BufferedReader. Print the contents to the
    // console.
    public static void main(String[] args) {

        String filePath ="Prakhar\\DayThirteenFourteen\\test.txt";
        FileReader fr = null;
        BufferedReader br =null;
        try {
            fr = new FileReader(filePath);


            int bytesRead;
            char[] buffer=new char[1024];
            System.out.println("Reading File by making char buffer with file Reader:");
            while ((bytesRead = fr.read(buffer)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                System.out.print(data);
            }

            br = new BufferedReader(new FileReader(filePath));
            String line;
            // Read lines from the file using BufferedReader
            System.out.println("\nReading file using Buffer Reader: ");
            while ((line = br.readLine()) != null) {
                // Process and print each line
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("There is problem with closing resource : "+e.getMessage());
            }
        }
    }
}
