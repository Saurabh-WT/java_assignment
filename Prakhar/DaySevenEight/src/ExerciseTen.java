public class ExerciseTen {
    //    Exercise 10: Abstract Class and Interface Combination
//    Create an abstract class "Vehicle" with attributes like make, model, and year. Implement this class in
//    subclasses for different vehicle types (e.g., car, motorcycle). Additionally, implement interfaces for
//    "Drivable" and "FuelEfficient" and showcase how the class combines both abstract class and interface features.
    public static void main(String[] args) {
        try {

            System.out.println("Example of Abstract Class and Interface Combination(check code)");

            System.out.println();
            Cars car1 = new Cars("Ford", "Mustang", 2008);
            System.out.println(car1.getMake() + "  " + car1.getModel() + " of Year " + car1.getYear() + " can go upto" +
                    "(top-speed): " + car1.maxSpeed() + "km/hr  ");
            car1.drive();
            car1.fuelEfficient(true);//you can set true, if it is fuel efficient

            System.out.println();
            MotorCycles bike1 = new MotorCycles("Hero", "Karizma ZMR", 2023);
            System.out.println(bike1.getMake() + "  " + bike1.getModel() + " of Year " + bike1.getYear() + " can go " +
                    "upto(top-speed): " + bike1.maxSpeed() + "km/hr");
            bike1.drive();
            bike1.fuelEfficient(false);//you can set true, if it is not fuel efficient}
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
interface Drivable{
    void drive();
}

interface FuelEfficient{
    void fuelEfficient(boolean isFuelEfficient);
}

abstract class Vehicles {
    private String make;
    private String model;
    private int year;

    Vehicles(String company, String model, int year) {
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

    String getMake() {
        return this.make;
    }

    String getModel() {
        return this.model;
    }

    int getYear() {
        return this.year;
    }

//    public abstract double maxSpeed();

}

class Cars extends Vehicles implements Drivable,FuelEfficient {
    Cars(String company, String model, int year) {
        super(company, model, year);
    }

    public double maxSpeed() {

        return 150.00;
    }
    @Override
    public void drive() {
        System.out.println("This car is drivable");
    }

    @Override
    public void fuelEfficient(boolean isFuelEfficient) {
        if(isFuelEfficient){
            System.out.println("This car is fuel Efficient");
        }else {
            System.out.println("This car is not fuel Efficient");
        }
    }
}

class MotorCycles extends Vehicles implements Drivable, FuelEfficient {
    MotorCycles(String company, String model, int year) {
        super(company, model, year);
    }

    public double maxSpeed() {
        return 110.00;
    }

    @Override
    public void drive() {
        System.out.println("this motorcycle is drivable");
    }

    @Override
    public void fuelEfficient(boolean isFuelEfficient) {
        if(isFuelEfficient){
            System.out.println("This motorcycle is fuel Efficient");
        }else {
            System.out.println("This motorcycle is not fuel Efficient");
        }
    }
}
