package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class getFreq {
    public static void main(String[] args) {
        int arr[] = {10,20,20,10,30,40};
        printFreq(arr);

    }
    static void printFreq(int arr[]){
        LinkedHashMap<Integer, Integer> l = new LinkedHashMap<>();
        for(int i =0; i< arr.length; i++){
            l.put(arr[i], l.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e : l.entrySet()){
            System.out.println(e.getKey()+" :  "+ e.getValue());
        }
    }
}

