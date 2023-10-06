package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Stu
{
    int marks;
    int roll;
    String name;
    Stu(int roll, int marks, String name){
        this.marks=marks;
        this.roll=roll;
        this.name=name;
    }
    int getMarks(){
        return marks;
    }
    int getRoll(){
        return roll;
    }
    String getName(){
        return name;
    }

}
public class tests {
    public static void main(String[] args) {
        Stu arr[] = {new Stu(100, 87, "fiza"),
        new Stu(101, 57, "Saba"),
        new Stu(102, 78, "Ishaan")};
//        double res = Arrays.stream(arr).mapToInt(x->x.getMarks())
//                .average()
//                .getAsDouble();
//        System.out.println(res);

//        Map<Integer, String> m = Arrays.stream(arr).collect(Collectors.toMap(Stu::getMarks, Stu::getName));
//        System.out.println(m);


    }
}
