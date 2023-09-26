package Practice;

import java.util.Arrays;

public class AverageStreams {
    public static void main(String[] args) {

        int arr[] = {4, 6, 2};
        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}
