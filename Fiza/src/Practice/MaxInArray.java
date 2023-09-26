package Practice;

import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int arr[] = {2,4,7,9};
        System.out.println(Arrays.stream(arr)
                .max()
                .getAsInt());
    }
}
