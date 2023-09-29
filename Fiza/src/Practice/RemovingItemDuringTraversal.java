package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingItemDuringTraversal {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        Iterator it = al.iterator();
        while(it.hasNext()){
            int x = (Integer)it.next();
            if(x<10){
                it.remove();
            }
            else{
                System.out.println(x);
            }
        }
//        al.stream()
//                .filter(x->x>10)
//                        .forEach(x-> System.out.println(x));
        //al.forEach(x-> System.out.println(x>10));

    }
}
