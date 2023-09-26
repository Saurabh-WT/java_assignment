package Practice;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,30,7);

        al.forEach(MethodReferences::printSquare);

    }
    public static void printSquare(Integer x){
        System.out.println(x*x);
    }
}
