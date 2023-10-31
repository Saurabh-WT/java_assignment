package day13_14;

import java.io.*;
import java.util.Scanner;

//Develop a program that takes user input and writes it to a file using BufferedWriter.
// Ensure the content is appended to the existing file.
public class BufferedWriting {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\WalkingTree\\Desktop\\java\\java_assignment\\Fiza\\src\\day13_14\\BuffWriter"));
//        String s,str="";
//        while ((s=br.readLine())!=null){
//            str+=s;
//        }
//        br.close();
        Scanner text = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the text to be apended or type stop to exit ");
            String input = text.nextLine();
            if("stop".equalsIgnoreCase(input)){
                break;
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("Fiza\\src\\day13_14\\BuffWriter",true));
            bw.write(input);
            bw.close();
        }
        text.close();
    }
}