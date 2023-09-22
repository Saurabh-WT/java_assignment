public class ExerOne {
    ////Q. Create a Java class named "Student" with attributes like name, roll number, and grade.
    //// Instantiate two "Student" objects and display their information.
    public static void main(String[] args) {
        try{
            Student studOne = new Student();
            Student studTwo = new Student();
            studOne.setName("Yogesh");
            studOne.setRollNo(21);
            studOne.setGrade('F');
            studTwo.setName("Vishwajeet");
            studTwo.setGrade('B');
            studTwo.setRollNo(10);
            studOne.showInfo();
            studTwo.showInfo();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

 class Student{
    String name;
    int rollNo;
    char grade;

    void setName(String name){
        this.name=name;

    }
    void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    void setGrade(char grade){
        this.grade=grade;
    }

    void showInfo(){
        System.out.print(" Name: "+this.name);
        System.out.print(" Roll No. : "+ this.rollNo);
        System.out.print(" Grade : "+this.grade);
        System.out.println();
    }

 }