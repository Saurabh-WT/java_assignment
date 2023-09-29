package Practice;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.remove(10);
        lh.add(10);
        System.out.println(lh);
    }
}
