package Practice;
import java.util.*;
public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer, String> t
                = new TreeMap<Integer, String>();
        t.put(10, "geeks");
        t.put(20, "ide");
        t.put(30, "courses");
        System.out.println(t);
        System.out.println(t.containsKey(10));
        for(Map.Entry<Integer, String> e : t.entrySet()){
            System.out.println(e.getKey()+" :  "+e.getValue());
        }
        System.out.println(t.higherKey(10));
        System.out.println(t.ceilingKey(5));
        System.out.println(t.higherEntry(10));
        System.out.println(t.ceilingEntry(10));
    }
}
