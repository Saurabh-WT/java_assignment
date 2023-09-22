package DayFiveSix;
class Student{
    String name;
    int roll_number;
    char grade;
    Student(String n, int roll_num, char g){
        this.name=n;
        this.roll_number=roll_num;
        this.grade=g;
    }
    void print(){
        System.out.println("Name="+name+", Roll number="+roll_number+", Grade="+grade);
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Student s1= new Student("Fiza", 101, 'A');
        Student s2= new Student("Isha", 102, 'B');
        s1.print();
        s2.print();
    }
}
