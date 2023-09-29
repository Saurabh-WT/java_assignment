package Day9_10;

import java.util.Scanner;

//Exercise 1: Array Manipulation
//Write a Java program that finds the sum and average of elements in an integer array.
// Allow the user to input the array's size and elements
public class Exercise_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;

            //getting the user input
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the " + i + "element in the array");
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            System.out.println("Sum of array is = " + sum);
            System.out.println("Average of array is = " + sum / n);
        }
        catch (RuntimeException e){
            System.out.println("Runtime error");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
