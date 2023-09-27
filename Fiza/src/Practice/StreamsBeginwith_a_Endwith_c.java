package Practice;

import java.util.Arrays;

public class StreamsBeginwith_a_Endwith_c {
    public static void main(String[] args) {
//        String s1[] = {"abc", "bcc", "acc"};
//
//        Arrays.stream(s1)
//                .filter(x->x.startsWith("a"))
//                .filter(x-> x.endsWith("c"))
//                .sorted()
//                .forEach(System.out::println);
        String s[] = {"acc", "aab", "ssc", "abc"};
        Arrays.stream(s)
                .filter(x-> x.startsWith("a"))
                .filter(x->x.endsWith("c"))
                .forEach(x-> System.out.println(x+" "));


    }
}
