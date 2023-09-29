package Day9_10;
//Exercise 1: Array Practice
//Write a Java program to store and manipulate a list of integers using arrays.
// Implement basic operations like adding, updating, and deleting elements.
import java.util.ArrayList;

public class Practice_1 {
    static int deleteEle(int arr[], int n, int x)
    {
        int i = 0;

        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
                break;
        }

        if(i == n)
            return n;

        for(int j = i; j < n - 1; j++)
        {
            arr[j] = arr[j + 1];
        }

        return n-1;
    }
    static int insert(int arr[], int n, int x, int cap, int pos)
    {
        if(n == cap)
            return n;

        int idx = pos - 1;

        for(int i = n - 1; i >= idx; i--)
        {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;

        return n + 1;
    }
    public static void main(String[] args) {
        try {
            int arr[] = new int[5], cap = 5, n = 3;

            arr[0] = 5; arr[1] = 10; arr[2] = 20;

            System.out.println("Before Insertion");

            for(int i=0; i < n; i++)
            {
                System.out.print(arr[i]+" ");
            }

            System.out.println();

            int x = 7, pos = 2;

            n = insert(arr, n, x, cap, pos);

            System.out.println("After Insertion");

            for(int i=0; i < n; i++)
            {
                System.out.print(arr[i]+" ");
            }

            System.out.println();

            //deletion operation
            x=20;

            System.out.println("Before Deletion");

            for(int i=0; i < n; i++)
            {
                System.out.print(arr[i]+" ");
            }

            System.out.println();


            n = deleteEle(arr, n, x);

            System.out.println("After Deletion");

            for(int i=0; i < n; i++)
            {
                System.out.print(arr[i]+" ");
            }


        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }

        }
    }
