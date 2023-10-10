import java.io.*;

public class ExerciseThree {
    //Exception Handling:
    //Enhance the previous file reading program to handle exceptions gracefully. Implement appropriate exception
    // handling for file-related operations.
    public static void main(String[] args) {

        String fileWriterFilePath = "Prakhar\\DayThirteenFourteen\\test1.txt";
        String bufferWriterFilePath = "Prakhar\\DayThirteenFourteen\\test2.txt";
        String bufferReaderfilePath ="Prakhar\\DayThirteenFourteen\\test.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            fw = new FileWriter(fileWriterFilePath);
            fw.write("This file was created using FileWriter.\n");
            fw.write("Second Line");

            System.out.println("File created using FileWriter.");


            bw = new BufferedWriter(new FileWriter(bufferWriterFilePath));
            bw.write("This file was created using BufferWriter.\n");

            bw.write("Second Line\n");
            bw.write("Third Line\n");
            bw.write("fourth Line\n");

            System.out.println("\nFile created using BufferWriter.");



            br = new BufferedReader(new FileReader(bufferReaderfilePath));
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
                if (fw != null) {
                    fw.close();
                }
                if (bw != null) {
                    bw.close();
                }
                if (br != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.err.println("There is problem with closing resource : " + e.getMessage());
            }
        }
    }
}
