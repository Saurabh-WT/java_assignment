package Practice;

import java.util.Arrays;

public class ArraySumStream {
    public static void main(String[] args) {
        int arr[] = {2,5,8};
        System.out.println(Arrays.stream(arr)    //stream is array utility function which
                // gives stream over the array and it doesn't create a new space it works as an abstraction over the same array
                .sum());


    }
}
