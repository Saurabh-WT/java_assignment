package day11_12;

import java.io.*;
import java.util.Scanner;
import java.util.*;
//6. Handling Checked Exceptions:
//Write a method that reads data from a file. Implement proper exception handling for potential file I/O exceptions.
public class Ex6 {
    public static void main(String[] args) {
        try {
            //scanning the file using the file path
            Scanner sc = new Scanner(new File("type.txt"));
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
        }

        try {
            //writing in a specified file
            FileWriter wr = new FileWriter("day11_12/text.txt");
            wr.write("This line is using file write method");
            wr.close();
            System.out.println("Successfully wrote");
        }
        catch (IOException e) {
            System.err.println("An error occured");

        }

        try{
            //creating a custom exception which throws error if file obj doesn't exists
            File obj = new File("fiza.txt");
            if(obj.exists()){
                System.out.println(obj.getName());
            }
            else{
                throw new FileNotFound();
            }
        }
        catch (FileNotFound e){
            e.getMsg();
        }

    }
}
//custom exception class
class FileNotFound extends Exception{

    public FileNotFound() {
    }
    void getMsg(){
        System.err.println("File is not present");
    }
}


