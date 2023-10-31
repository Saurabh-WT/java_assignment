package day13_14;

import java.io.*;
import java.util.Scanner;

//Write a program to create a new text file and write some content to it using FileWriter and BufferedWriter
public class FileWritingExercise {
    public static void main(String[] args) throws IOException {

        //writing content in file using file writer
        FileWriter fw = new FileWriter("Fiza\\src\\day13_14\\input");
        fw.write("This text is being written in input file using file reader");
        fw.close();
        System.out.println("Successfully wrote");

        File obj = new File("Fiza\\src\\day13_14\\input");
        Scanner read = new Scanner(obj);
        while (read.hasNextLine()){
            String str = read.nextLine();
            System.out.println(str);
        }
        read.close();

        //writing content using buffer writer
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\WalkingTree\\Desktop\\java\\java_assignment\\Fiza\\src\\day13_14\\input"));
        bw.write("This text is being written in input file using buffer reader");
        bw.close();
        System.out.println("Successfully wrote");

        File obj2 = new File("C:\\Users\\WalkingTree\\Desktop\\java\\java_assignment\\Fiza\\src\\day13_14\\input");
        Scanner read2 = new Scanner(obj2);
        while (read2.hasNextLine()){
            String str2 = read2.nextLine();
            System.out.println(str2);
        }
        read2.close();

    }
}
