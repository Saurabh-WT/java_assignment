
public class ExerFour {
    //Create a Java class called "Employee" with attributes like name, employee ID, and salary.
    // Implement a method to calculate an annual salary by multiplying the monthly salary by 12.
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee();
            emp1.name = "Prakhar";
            emp1.employeeID = "EHFK2133";
            emp1.salary = 10_000;
            emp1.show();
            System.out.println("Annual Salary: " + emp1.annualSalary());
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

}
class Employee {
    String name;
    String employeeID;
    Integer salary;

    Employee(String name, String employeeID, Integer salary){
        this.name= name;
        this.employeeID=employeeID;
        this.salary = salary;
    }
    Employee(){}

    int annualSalary(){
        if(!(this.salary == null)){
            return (this.salary*12);
        }
        return 0;
    }
    public String getName() {
        return this.name;
    }

    public String getEmployeeID(){
        return this.employeeID;
    }

    public double getSalary() {
        return this.salary;
    }
    void show(){
        System.out.println("Name: "+this.name+ " EmployeeID: "+this.employeeID+ " Monthly Salary: "+this.salary);
    }
}