public class ExerciseOne {
    //Exercise 1: Inheritance Hierarchy
    //Create a Java inheritance hierarchy representing different types of vehicles, including cars, motorcycles, and
    // bicycles. Include common attributes and methods in a superclass, and specific attributes and methods in
    // subclasses.
    public static void main(String[] args) {

        try {
            System.out.println("Example of Java inheritance Hierarchy(check code)");

            Car car1 = new Car("Ford", "Mustang", 2008);
            System.out.println(" " + car1.getMake() + "  " + car1.getModel() + " of Year " + car1.getYear() + " can " +
                    "go upto(top-speed): " + car1.maxSpeed() + "km/hr");

            System.out.println();
            MotorCycle bike1 = new MotorCycle("Hero", "Karizma ZMR", 2023);
            System.out.println(" " + bike1.getMake() + "  " + bike1.getModel() + " of Year " + bike1.getYear() + " " +
                    "can go upto(top-speed): " + bike1.maxSpeed() + "km/hr");

            System.out.println();
            Bicycle cycle1 = new Bicycle("Hero", "gearup", 2008);
            System.out.println(" " + cycle1.getMake() + "  " + cycle1.getModel() + " of Year " + cycle1.getYear() +
                    " can go upto(top-speed): " + cycle1.maxSpeed() + "km/hr");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    Vehicle(String company,String model,int year){
        this.make = company;
        this.model = model;
        this.year = year;

    }

    void setCompany(String company) {
        this.make = company;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getMake(){
        return this.make;
    }

    String getModel(){
        return this.model;
    }

    int getYear(){
        return this.year;
    }

//    public abstract double maxSpeed();

}

class Car extends Vehicle {
    Car(String company, String model, int year){
        super( company,model, year);
    }
    public double maxSpeed() {

        return 150.00;
    }
}

class MotorCycle extends Vehicle {
    MotorCycle(String company, String model, int year){
        super(company, model, year);
    }
    public double maxSpeed(){
      return  110.00;
    }
}

class Bicycle extends Vehicle {
    Bicycle(String company, String model, int year){
        super(company, model, year);
    }
    public double maxSpeed(){
        return 30.00;
    }
}