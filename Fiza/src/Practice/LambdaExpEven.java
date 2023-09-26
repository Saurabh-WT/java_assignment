package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpEven {
    public static void printCond(Collection<Integer> C, Predicate<Integer> p){
        for(Integer x : C){
            if(p.test(x)){
                System.out.println(x+" ");
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(10,204,5,9,67,8));
        printCond(al, x->x%2==0);
    }
}
