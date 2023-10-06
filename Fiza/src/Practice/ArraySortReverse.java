package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortReverse {
    public static void main(String[] args) {
        Integer arr[] = {1,4,2,8,3,9,0,3};
        Arrays.sort(arr, new com());
        Arrays.stream(arr)
                        .filter(x->x%2==0)
                                .forEach(System.out::println);
        //System.out.println(Arrays.toString(arr));
    }
}
class com implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b) {

        return a%2 - b%2;
    }
}
