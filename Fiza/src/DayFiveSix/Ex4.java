package DayFiveSix;
class Employee{
    String name;
    String id;
    double salary;

    Employee(String name, String id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    Employee(){}
    void annualSalary(){
        if(salary>0) {
            System.out.println("Annual salary of " + name + " is = " + salary * 12);
        }
        else{
            System.out.println("Salary cannot be negative");
        }
    }
}
public class Ex4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Fiza", "101", 30000);
        e1.annualSalary();
    }
}
