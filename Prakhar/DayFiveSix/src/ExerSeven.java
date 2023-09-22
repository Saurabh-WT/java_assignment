public class ExerSeven {
    //Q. Enhance the "Employee" class by adding overloaded constructors, one for initializing all
    // attributes and another for initializing only the name and employee ID.
    // Test both constructors by creating employee objects.
    public static void main(String[] args) {
        try {

            //Note:-         Employee class is in ExerFour.java

            //Created Employee object which is already in module using overloaded constructors
            Employee emp1 = new Employee("Yogesh", "HJGJ63827", 9000);
            Employee emp2 = new Employee();

            // Setted the remaining value
            emp2.name = "Prakhar";
            emp2.employeeID = "EHFK2133";
            emp2.salary = 10_000;

            // Showing the data of employees
            emp1.show();
            emp2.show();

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}

