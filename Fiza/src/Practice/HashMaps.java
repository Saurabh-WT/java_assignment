package Practice;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        String s = "aa bb aa bb fg hj df fg kl aa fg kl ioj hggg ghhh tyy tyy re";
        Map<String, Integer> m = new HashMap<>();
        String words[] = s.split(" ");
        int c =1;
        for(String word: words){

            m.put(word, m.getOrDefault(word, 0)+1);
        }
        List<Map.Entry<String, Integer>> l = new ArrayList<>(m.entrySet());
        Collections.sort(l, (e1, e2)-> e2.getValue().compareTo(e1.getValue()));

        for(Map.Entry<String, Integer> e: l){
            System.out.println(e.getKey()+" :  "+e.getValue());
        }
    }
}
