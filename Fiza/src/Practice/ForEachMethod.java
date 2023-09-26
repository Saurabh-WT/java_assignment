package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod
{
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,20,30,40);
        lst.forEach(x-> System.out.println(x*2));

    }
}
