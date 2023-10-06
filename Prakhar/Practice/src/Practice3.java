import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Practice3 {
    //Build a Java program that simulates an employee database using an "Employee" class. Create an array of
    // employees, populate it, and implement methods to search for employees by name and calculate the total salary
    // of all employees.
    public static void main(String[] args) {
        ArrayList<Employees> empl = new ArrayList<>();
        Employees emp1 = new Employees("Prakhar", 10000.0);
        Employees emp2 = new Employees("Yogesh", 10000.0);
        Employees emp3 = new Employees("Ayush", 30000.0);
        empl.add(emp1);
        empl.add(emp2);
        empl.add(emp3);
        System.out.println("++++++++++Employee List+++++++++++++");
        for (Employees emp : empl) {
            emp.getDetails();
        }
        int totalSalary=0;
        for (Employees emp : empl) {
            totalSalary+=emp.getSalary();
        }
        System.out.println("Total Salary: "+totalSalary);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee name to find: ");
        String name= sc.nextLine();
        boolean employeeFindFlag=false;
        for (Employees emp : empl) {
            if(name.equals(emp.getName())){
                employeeFindFlag=true;
                break;
            }
        }
        if(employeeFindFlag) System.out.println("Found the employee");
        else System.out.println("Didn't find the employee");



    }

}

class Employees {


    private String name;
    private double salary;
    public String getName() {
        return name;
    }
    Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void getDetails() {
        System.out.println("Name: " + name + " Salary: " + salary);
    }

}