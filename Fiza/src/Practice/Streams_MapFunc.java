package Practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams_MapFunc {
    public static void main(String[] args) {
        Student arr[] = {new Student(100, 87, "fiza"),
        new Student(101, 55, "Isha"),
        new Student(102, 78, "Divyansh")};
        double res = Arrays.stream(arr)    //create a stream of students over the array
                .mapToInt(x-> x.getMarks())    //map stream to integer stream of marks
                .average()      //call average on stream
                       .getAsDouble();     //convert the optional value to double since average may or may not exist
                                            // because of null values or empty stream

        System.out.println(res);




        Map<Integer, String> m = Arrays.stream(arr)
                .collect(Collectors.toMap(Student::getRoll_no,//creates a map(collects the data into map)
                        Student::getName));                   // similarly toList top convert it to list
        //System.out.println(m);
        for(Map.Entry<Integer,String> ent: m.entrySet())
        {
            System.out.println(ent.getKey()+" "+ent.getValue());
        }

    }
}
class Student{
    int roll_no;
    int marks;
    String name;
    Student(int roll_no, int marks, String name){
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
