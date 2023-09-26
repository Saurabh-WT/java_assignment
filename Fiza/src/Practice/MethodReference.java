package Practice;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,203,4,5,90);
        al.forEach(System.out::println);
    }
}
