import java.io.*;

public class ExerciseTwo {
    //File Writing Exercise:
    //Write a program to create a new text file and write some content to it using FileWriter and BufferedWriter.
    public static void main(String[] args) {

        String fileWriterFilePath = "Prakhar\\DayThirteenFourteen\\test1.txt";
        String bufferWriterFilePath = "Prakhar\\DayThirteenFourteen\\test2.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(fileWriterFilePath);
            fw.write("This file was created using FileWriter.\n");
            fw.write("Second Line");

            System.out.println("File created using FileWriter. (in)");


            bw = new BufferedWriter(new FileWriter(bufferWriterFilePath));
            bw.write("This file was created using BufferWriter.\n");

            bw.write("Second Line\n");
            bw.write("Third Line\n");
            bw.write("fourth Line\n");

            System.out.println("\nFile created using BufferWriter.");


        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        }
    }
}
