package DayFiveSix;

import java.util.Scanner;

class Employeee {
    String name;
    int salary;
    Employeee(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }

}
public class Ex10 {

 public static void main(String[] args) {

     Employeee emp[] = new Employeee[3];
     emp[0] = new Employeee("fiza", 5678);
     emp[1] = new Employeee("xyz", 8678);
     emp[2] = new Employeee("yhg", 90678);

     total_salary(emp);
     name(emp);

 }

 static void total_salary(Employeee emp[]){
     try {
         int t_s = 0;

         for (int i = 0; i < emp.length; i++) {
             t_s += emp[i].salary;
         }
         System.out.println("The total salary of employee's is = "+t_s);
     }catch (Exception e){
         e.printStackTrace();
     }
 }
 static void name(Employeee emp[]){
     try {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the name for the employee to be searched");
         String s = sc.nextLine();

         boolean t = false;
         for (Employeee e : emp) {
             t = false;

             if(e.name.equals(s)) {
                 t = true;
                 System.out.println("The employee is present");
                 break;
             }

         }
         if (!t) {
             System.out.println("Not Present");
         }


     }
     catch(Exception e){
         e.printStackTrace();
     }
 }

}