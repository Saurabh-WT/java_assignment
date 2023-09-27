package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsCollectGroupBy {
    public static void main(String[] args) {
        Students arr[] = {new Students(100, 87, "fiza"),
                new Students(101, 55, "Isha"),
                new Students(102, 87, "Divyansh")};
        Map<Integer, List<Students>> m = Arrays.stream(arr).collect(Collectors.groupingBy(Students::getMarks));
        //System.out.println(m);
        for(Map.Entry<Integer,List<Students>> ent: m.entrySet())
        {
            List<Students> ls= ent.getValue();
            System.out.print(ent.getKey()+": ");

            ls.stream()
                    .forEach(x -> System.out.print("{"+x.getRoll_no()+", "+x.getName()+", "+x.getMarks()+"} "));

            System.out.println();
        }

    }
}
class Students{
    int roll_no;
    int marks;
    String name;
    Students(int roll_no, int marks, String name){
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    int getRoll_no(){
        return roll_no;
    }
    int getMarks(){
        return marks;
    }
    String getName(){
        return name;
    }
}

