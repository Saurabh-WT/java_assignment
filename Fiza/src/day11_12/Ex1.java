package day11_12;

import java.util.ArrayList;
import java.util.List;

//1. Enhanced for Loop:
//Write a program that uses an enhanced for loop to iterate through an ArrayList of strings and prints each element.
public class Ex1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("red");
        al.add("green");
        al.add("blue");
        al.add("black");
        for(String e: al){
            System.out.print(e+" ");
        }

    }
}
