package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFun {
    public static void main(String[] args) {
        int a[] = {1, 9, 3, 5};
        int b[] = {1, 2 , 3, 4};
        int c[] = new int[5];
        System.out.println(Arrays.equals(a,b));
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.mismatch(a,b));
        System.out.println(Arrays.compare(a,b));
        Arrays.fill(c, -1);
        System.out.println(Arrays.toString(c));

    }
}
