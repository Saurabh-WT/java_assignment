package day13_14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Enhance the previous file reading program to handle exceptions gracefully.
// Implement appropriate exception handling for file-related operations.
public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        try {
            //read a file using file reader
            FileReader fr = new FileReader("Fiza\\src\\day13_14\\newfile");
            BufferedReader buffReader
                    = new BufferedReader(new FileReader("C:\\Users\\WalkingTree\\Desktop\\java\\java_assignment\\Fiza\\src\\day13_14\\newfile"));

            //reading the file using file reader object
            Scanner myReader = new Scanner(fr);
            while (myReader.hasNextLine()) {
                String str = myReader.nextLine();
                System.out.println(str);
            }
            myReader.close();

            System.out.println();

            //reading using buffer reader object
            Scanner myReader2 = new Scanner(buffReader);
            while (myReader2.hasNextLine()) {
                String s = myReader2.nextLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
