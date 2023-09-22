public class ExerTen {
    //    Build a Java program that simulates an employee database using an "Employee" class.
//    Create an array of employees, populate it, and implement methods to search for employees
//    by name and calculate the total salary of all employees.
    public static void main(String[] args) {
        try {

            //Note:-         Employee class is in ExerFour.java

            Employee[] employees = new Employee[5]; // Create an array to store employees


            // Populate the employee array
            employees[0] = new Employee("Prakhar", "GF349347", 50000);
            employees[1] = new Employee("Yogesh", "HF8254", 60000);
            employees[2] = new Employee("Vishwajeet", "HSF472", 55000);
            employees[3] = new Employee("Arif", "HJGDF74329", 65000);
            employees[4] = new Employee("Ayush", "HERH84724", 70000);


            //Printing Employee list
            System.out.println('\n');
            System.out.println("------------------------------");
            System.out.println("Employee List");
            employeeList(employees);
            System.out.println("------------------------------");
            System.out.println();


            // Search for an employee by name
            String searchName = "Prakhar";
            System.out.println("Searching Employee with name in this list: "+searchName);
            System.out.println();
            Employee foundEmployee = findEmployeeByName(employees, searchName);


            if (foundEmployee != null) {
                System.out.println("Found employee: " + foundEmployee.getName() + " EmployeeID: " + foundEmployee.getEmployeeID() + ", Salary: " + foundEmployee.getSalary());
            } else {
                System.out.println("Employee with name '" + searchName + "' not found.");
            }
            System.out.println();
            // Calculate the total salary of all employees
            double totalSalary = calculateTotalSalary(employees);
            System.out.println("Total Salary of all employees: " + totalSalary);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Method to search for an employee by name
    public static Employee findEmployeeByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    // Method to calculate the total salary of all employees
    public static double calculateTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static void employeeList(Employee[] employees){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Employee: " + employee.getName() + " EmployeeID: " + employee.getEmployeeID() + ", Salary: " + employee.getSalary());
            }
        }

    }
}

