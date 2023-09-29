package Day9_10;
//Exercise 1: Array Practice
//Write a Java program to store and manipulate a list of integers using arrays.
// Implement basic operations like adding, updating, and deleting elements.
import java.util.ArrayList;

public class Practice_1 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];

            //adding elements in array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }

            for (int k : arr) {
                System.out.print(k + " ");
            }

            //updating the array elements
            arr[1] = 5;
            arr[2] = 10;

            //deleting an array element
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    for (int j = i; j < (arr.length - 1); j++)
                        arr[j] = arr[j + 1];
                    System.out.println("\nRemoved the element successfully!");
                    break;
                }
            }

            System.out.println("\nThe new array is: ");
            for (int i = 0; i < (arr.length - 1); i++)
                System.out.print(arr[i] + " ");
        } catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
        }

        }
    }
