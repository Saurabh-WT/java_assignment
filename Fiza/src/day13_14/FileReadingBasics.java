package day13_14;

import java.io.*;
import java.util.Scanner;

//File Reading Basics:
//Create a Java program that reads a text file using FileReader and BufferedReader. Print the contents to the console.
public class FileReadingBasics {
    public static void main(String[] args) throws IOException {
        //read a file using file reader
        FileReader fr = new FileReader("Fiza\\src\\day13_14\\newfile");

        int i;
        while((i= fr.read())!=-1){
            System.out.print((char)i);
        }

        System.out.println();

        //reading a file using buffer reader
        BufferedReader buffReader
                = new BufferedReader(new FileReader("Fiza\\src\\day13_14\\newfile"));
        String s="";
        while((s=buffReader.readLine())!=null){
            System.out.println(s);
        }


    }
}
