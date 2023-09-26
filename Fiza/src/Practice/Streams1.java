package Practice;

import java.util.Arrays;
import java.util.List;

public class Streams1 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 5, 90, 7);    //al is source here
        al.stream()  //function of collection interface
                .filter(x->x%2==0)  //filter even numbers
                .filter(x->x>10)    //filter digits >10
                .forEach(System.out::println);    //terminal function return type is void
    }
}
