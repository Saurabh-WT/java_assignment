package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFun {
    static void printColl(Collection<Integer> C, Predicate<Integer> p){
        for(Integer x : C) {
            if (p.test(x)) {
                System.out.println(x + " ");
            }
        }
    }
    public static void main(String[] args) {
        class MyPredicateEven implements Predicate<Integer>{
            @Override
            public boolean test(Integer x) {
                return (x%2==0);
            }
        }
        List<Integer> al = new ArrayList<>(Arrays.asList(10,20,307,9));
        Predicate p = new MyPredicateEven();
        printColl(al, p);
    }
}
