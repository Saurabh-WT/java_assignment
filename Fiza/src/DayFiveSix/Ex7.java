package DayFiveSix;
class Employee2{
    String name ;
    int id;
    int salary;
    Employee2(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    Employee2(String name,int id){
        this.name=name;
        this.id=id;
        this.salary=0;
    }

    public void annualSalary() {
        if (salary > 0) {

            System.out.println("Employee name = " + name + " of ID = " + id + " has annual salary = " + salary * 12);
        } else {
            System.out.println("The salary cannot be negative");
        }
    }
}
public class Ex7 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2("fiza", 101, 35000);
        e1.annualSalary();

}
}
