package Practice;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SortSubArray {
    public static void main(String[] args) {
        int a[] = {1,7,3,2,5, 6};
        Arrays.sort(a, 1, 4);
        System.out.println(Arrays.toString(a));
    }
}
