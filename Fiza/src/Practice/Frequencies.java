package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequencies {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5,5,5};
        print(arr);
    }
    static void print(int arr[]){
        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
        for(int i =0; i<arr.length; i++){
            m.put(arr[i], m.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> x: m.entrySet()){
            System.out.println(x.getKey()+" :  "+x.getValue());
        }
    }

}
