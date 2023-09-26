package Practice;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,20,30,40);
        lst.stream().forEach(x-> System.out.println(x+" "));
        System.out.println();
        lst.stream()
                .filter(x->x>10)
                .filter(x->x%2==0)
                .forEach(x-> System.out.println(x+" "));

    }
}
