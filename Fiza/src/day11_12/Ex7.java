package day11_12;

import java.util.InputMismatchException;
import java.util.Scanner;

//7. Multiple Exceptions:
//Create a program that performs a mathematical operation based on user input. Handle both arithmetic exceptions and input mismatch exceptions.
public class Ex7 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any integer");
            int n = sc.nextInt();
            System.out.println("You've entered " + n);
        }
        catch (InputMismatchException e){
            System.err.println(e+" Entered input is not integer type");
        }
        try{
            Scanner sc = new Scanner(System.in);
            //divison operation
            System.out.println("Division operation");
            System.out.println("Enter first digit");
            int a =sc.nextInt();
            System.out.println("Enter second digit");
            int b =sc.nextInt();
            System.out.println("a/b = "+a/b);

        }

        catch (ArithmeticException e){
            System.err.println(e+" you cannot divide by 0");
        }
        catch (InputMismatchException e){
            System.err.println(e+" Entered input is not integer type");
        }
    }
}
